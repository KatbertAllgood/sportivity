package ru.sogya.projects.activityandcharity.domain.repository.firebase

import kotlinx.coroutines.flow.Flow
import ru.sogya.projects.activityandcharity.domain.model.UserDomain
import ru.sogya.projects.activityandcharity.domain.utils.State

interface UserStoreRepository {
    suspend fun checkUserExist(email: String): Flow<State<Unit>>

    suspend fun createUser(user: UserDomain): Flow<State<Unit>>
}