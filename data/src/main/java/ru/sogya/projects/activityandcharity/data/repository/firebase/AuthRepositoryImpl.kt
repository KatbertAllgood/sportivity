package ru.sogya.projects.activityandcharity.data.repository.firebase

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import ru.sogya.projects.activityandcharity.data.model.FirebaseAuthenticator
import ru.sogya.projects.activityandcharity.domain.repository.firebase.AuthRepository
import ru.sogya.projects.activityandcharity.domain.utils.State

class AuthRepositoryImpl(private val firebaseAuthenticator: FirebaseAuthenticator) :
    AuthRepository {

    override suspend fun login(login: String, password: String) = flow {
        emit(State.loading())
        val authResult = firebaseAuthenticator.signInWithEmailPassword(login, password)
        if (authResult.isSuccessful)
            emit(State.success(true))
        else
            emit(State.failed(authResult.exception?.message.toString()))
    }.flowOn(Dispatchers.IO)

    override suspend fun registration(name: String, email: String, password: String) = flow {
        emit(State.loading())
        val authResult = firebaseAuthenticator.signUpWithEmailPassword(email, password)
        if (authResult.isSuccessful)
        //TODO: При регистрации необходимо создавать пользователя в базе данных Firestore
            emit(State.success(true))
        else
            emit(State.failed(authResult.exception?.message.toString()))
    }.flowOn(Dispatchers.IO)

    override suspend fun resetPassword(email: String) = flow {
        emit(State.loading())
        val authResult = firebaseAuthenticator.sendPasswordReset(email)
        if (authResult.isSuccessful)
            emit(State.success(true))
        else
            emit(State.failed(authResult.exception?.message.toString()))
    }.flowOn(Dispatchers.IO)
}
