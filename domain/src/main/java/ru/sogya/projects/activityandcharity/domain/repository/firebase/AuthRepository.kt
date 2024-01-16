package ru.sogya.projects.activityandcharity.domain.repository.firebase

import kotlinx.coroutines.flow.Flow
import ru.sogya.projects.activityandcharity.domain.utils.State

interface AuthRepository {

    suspend fun login(login: String, password: String): Flow<State<Unit>>

    suspend fun registration(name: String, email: String, password: String): Flow<State<Unit>>

    suspend fun resetPassword(email: String): Flow<State<Unit>>
}