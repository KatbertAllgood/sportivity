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

    @GET("achievement/{userId}")
    suspend fun getAchievementById(@Path("userId") userId: Int): AchievementsData

    @GET("activities")
    suspend fun getAllActivities(): List<ActivityData>

    @GET("activity-statistic/{userId}")
    suspend fun getActivityStatisticByIdUseCase(@Path("userId") userId: Int): List<ActivityStatisticData>

    @GET("departments")
    suspend fun getAllDepartment(): List<DepartmentData>

    @GET("department/{id}")
    suspend fun getDepartmentById(@Path("id") departmentId: Int): DepartmentData

    @GET("funds")
    suspend fun getAllFund(): List<FundData>

    @GET("fund/{id}")
    suspend fun getFundById(@Path("id") fundId: Int): FundData

    @GET("user-statistic")
    suspend fun getUserRating(): List<UserStatisticData>

    @GET("user/{id}")
    suspend fun getUserById(@Path("id") userId: Int): UserData

    @GET("user/{userId}")
    suspend fun getUserStat(@Path("userId") userId: Int): UserStatisticData
}