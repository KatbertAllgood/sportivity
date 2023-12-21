package ru.sogya.projects.activityandcharity.data.repository.firebase

import android.util.Log
import androidx.datastore.preferences.core.booleanPreferencesKey
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import ru.sogya.projects.activityandcharity.data.datastore.AppDataStore
import ru.sogya.projects.activityandcharity.data.datastore.commit
import ru.sogya.projects.activityandcharity.data.entity.FirebaseAuthenticator
import ru.sogya.projects.activityandcharity.domain.repository.firebase.AuthRepository
import ru.sogya.projects.activityandcharity.domain.utils.State

class AuthRepositoryImpl(
    private val firebaseAuthenticator: FirebaseAuthenticator,
    private val dataStore: AppDataStore
) : AuthRepository {
    init {
        firebaseAuthenticator.addUserStatusListener()
    }

    override val isUserLogedIn: Flow<State<Boolean>> = flow {
        var result = false
        firebaseAuthenticator.addUserStatusListener { authState ->
            val currentUser = authState.currentUser
            result = currentUser != null
        }
        Log.d("RESULT", result.toString())
        emit(State.Success(result))
    }

    override suspend fun login(login: String, password: String) = flow {
        emit(State.loading())
        val authResult = firebaseAuthenticator.signInWithEmailPassword(login, password)
        if (authResult.isSuccessful) {
            emit(State.success(true))
            dataStore.commit {
                set(IS_USER_LOGIN, true)
            }
        } else
            emit(State.failed(authResult.exception?.message.toString()))
    }.flowOn(Dispatchers.IO)

    override suspend fun registration(name: String, email: String, password: String) = flow {
        emit(State.loading())
        val authResult = firebaseAuthenticator.signUpWithEmailPassword(email, password)
        if (authResult.isSuccessful) {
            //TODO: При регистрации необходимо создавать пользователя в базе данных Firestore
            emit(State.success(true))
            dataStore.commit {
                set(IS_USER_LOGIN, true)
            }
        } else
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

    override suspend fun logOut() = firebaseAuthenticator.signOut()

    private val IS_USER_LOGIN = booleanPreferencesKey(name = "userAuth")
}
