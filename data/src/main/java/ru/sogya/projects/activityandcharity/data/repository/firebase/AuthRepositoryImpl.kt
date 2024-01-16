package ru.sogya.projects.activityandcharity.data.repository.firebase

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.tasks.await
import ru.sogya.projects.activityandcharity.data.model.UserData
import ru.sogya.projects.activityandcharity.data.util.FirebaseAuthenticator
import ru.sogya.projects.activityandcharity.domain.repository.firebase.AuthRepository
import ru.sogya.projects.activityandcharity.domain.repository.firebase.UserStoreRepository
import ru.sogya.projects.activityandcharity.domain.utils.State

class AuthRepositoryImpl (
    private val firebaseAuthenticator: FirebaseAuthenticator,
    private val userStoreRepository: UserStoreRepository
) : AuthRepository {

    override suspend fun login(login: String, password: String): Flow<State<Unit>> =
        flow<State<Unit>> {
            emit(State.loading())
            try {
                firebaseAuthenticator.signInWithEmailPassword(login, password).await()
                emit(State.success())
            } catch (e: Exception) {
                e.printStackTrace()
                emit(State.failed(e.toString()))
            }
        }.flowOn(Dispatchers.IO)

    override suspend fun registration(name: String, email: String, password: String) =
        flow<State<Unit>> {
            emit(State.loading())
            try {
                firebaseAuthenticator.signUpWithEmailPassword(email, password).await()
                val uid: String = firebaseAuthenticator.currentUser?.uid.toString()
                val user = UserData(uid, tag = "", name = name, email = email.lowercase())
                userStoreRepository.createUser(user).collect {
                    when (it) {
                        is State.Loading -> emit(State.loading())
                        is State.Failed -> emit(State.failed())
                        is State.Success -> emit(State.success())
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
                emit(State.failed(e.toString()))
            }
        }.flowOn(Dispatchers.IO)

    override suspend fun resetPassword(email: String) = flow<State<Unit>> {
        emit(State.loading())
        val authResult = firebaseAuthenticator.sendPasswordReset(email)
        if (authResult.isSuccessful)
            emit(State.success())
        else
            emit(State.failed(authResult.exception?.message.toString()))
    }.flowOn(Dispatchers.IO)
}
