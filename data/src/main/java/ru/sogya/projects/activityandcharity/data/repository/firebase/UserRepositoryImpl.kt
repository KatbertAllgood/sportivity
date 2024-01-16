package ru.sogya.projects.activityandcharity.data.repository.firebase

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.tasks.await
import ru.sogya.projects.activityandcharity.data.util.FireStoreUtil
import ru.sogya.projects.activityandcharity.domain.model.UserDomain
import ru.sogya.projects.activityandcharity.domain.repository.firebase.UserStoreRepository
import ru.sogya.projects.activityandcharity.domain.utils.State
import javax.inject.Inject

class UserStoreRepositoryImpl @Inject constructor(private val fireStoreUtil: FireStoreUtil) :
    UserStoreRepository {

    override suspend fun checkUserExist(email: String): Flow<State<Unit>> =
        flow<State<Unit>> {
            emit(State.loading())
            fireStoreUtil.getByParam(USER_COLLECTION).collect { snapshot ->
                val filteredList = snapshot.documents.filter {
                    it.data?.containsValue(email) == true
                }
                if (filteredList.isNotEmpty()) emit(State.success())
                else emit(State.failed())
            }
        }.flowOn(Dispatchers.IO)

    override suspend fun createUser(user: UserDomain): Flow<State<Unit>> = flow {
        emit(State.loading())
        try {
            fireStoreUtil.storeObjectWithDocument(USER_COLLECTION, document = user.id, data = user)
                .await()
            emit(State.success())
        } catch (e: Exception) {
            e.printStackTrace()
            emit(State.failed(e.toString()))
        }
    }

    companion object {
        private const val USER_COLLECTION = "Users"
        private const val USER_EMAIL = "Email"
    }
}