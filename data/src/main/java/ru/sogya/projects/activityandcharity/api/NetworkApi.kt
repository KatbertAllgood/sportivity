package ru.sogya.projects.activityandcharity.api

import kotlinx.coroutines.flow.Flow
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import ru.sogya.projects.activityandcharity.model.UserData
import ru.sogya.projects.activityandcharity.model.request.CreateUserRequest

interface NetworkApi {

    @GET("users")
    suspend fun getAllUsers(): List<UserData>

    @POST("user/create")
    suspend fun createUser(@Body createUserRequest: CreateUserRequest): UserData

    @GET("users/login")
    suspend fun login(@Path("login") login: String, @Path("password") password: String): UserData
}