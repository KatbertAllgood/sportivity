package ru.sogya.projects.activityandcharity.api

import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import ru.sogya.projects.activityandcharity.domain.model.UserDomain
import ru.sogya.projects.activityandcharity.model.ActivityData
import ru.sogya.projects.activityandcharity.model.UserData

interface NetworkApi {

    @GET("/users")
    fun getAllUsers(): Flow<List<UserData>>
}