package ru.sogya.projects.activityandcharity.api

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import ru.sogya.projects.activityandcharity.model.AchievementsData
import ru.sogya.projects.activityandcharity.model.ActivityData
import ru.sogya.projects.activityandcharity.model.ActivityStatisticData
import ru.sogya.projects.activityandcharity.model.DepartmentData
import ru.sogya.projects.activityandcharity.model.FundData
import ru.sogya.projects.activityandcharity.model.UserData
import ru.sogya.projects.activityandcharity.model.UserStatisticData
import ru.sogya.projects.activityandcharity.model.request.CreateUserRequest

interface NetworkApi {

    @GET("users")
    suspend fun getAllUsers(): List<UserData>

    @POST("user/create")
    suspend fun createUser(@Body createUserRequest: CreateUserRequest): UserData

    @GET("users/login")
    suspend fun login(@Path("login") login: String, @Path("password") password: String): UserData

    suspend fun getAchievmentById(@Path("userId") userId: Int): AchievementsData

    suspend fun getAllActivities(): List<ActivityData>

    suspend fun getActivityStatisticByIdUseCase(@Path("userId") userId: Int): List<ActivityStatisticData>

    suspend fun getAllDepartment(): List<DepartmentData>

    suspend fun getDepartmentById(departmentId: Int): DepartmentData

    suspend fun getAllFund(): List<FundData>

    suspend fun getFundById(fundId: Int): FundData

    suspend fun getUserRating(): List<UserStatisticData>

    suspend fun getUserById(userId: Int): UserData

    suspend fun getUserStat(userId: Int): UserStatisticData
}