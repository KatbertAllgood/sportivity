package ru.sogya.projects.activityandcharity.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import ru.sogya.projects.activityandcharity.api.NetworkService
import ru.sogya.projects.activityandcharity.domain.model.AchievementsDomain
import ru.sogya.projects.activityandcharity.domain.model.ActivityDomain
import ru.sogya.projects.activityandcharity.domain.model.DepartmentDomain
import ru.sogya.projects.activityandcharity.domain.model.FundDomain
import ru.sogya.projects.activityandcharity.domain.model.UserDomain
import ru.sogya.projects.activityandcharity.domain.model.UserStatisticDomain
import ru.sogya.projects.activityandcharity.domain.repository.NetworkRepository
import ru.sogya.projects.activityandcharity.model.request.CreateUserRequest

class NetworkRepositoryImpl : NetworkRepository {
    override fun getUserById(): Flow<UserDomain> {
        TODO("Not yet implemented")
    }

    override fun getAllUsers(): Flow<List<UserDomain>> = flow {
        emit(
            NetworkService.getRetrofitService().getAllUsers()
        )
    }

    override fun getUserRating(): Flow<List<UserStatisticDomain>> {
        TODO("Not yet implemented")
    }

    override fun createUser(
        email: String,
        name: String,
        type: Int,
        password: String
    ): Flow<UserDomain> = flow {
        val createUserRequest = CreateUserRequest(name, email, type, password)
        emit(
            NetworkService.getRetrofitService()
                .createUser(createUserRequest = createUserRequest)
        )
    }

    override fun loginUser(email: String, password: String): Flow<UserDomain> = flow {
        emit(
            NetworkService.getRetrofitService().login(email, password)
        )
    }

    override fun getAllActivities(): Flow<List<ActivityDomain>> {
        TODO("Not yet implemented")
    }

    override fun getAllFunds(): Flow<List<FundDomain>> {
        TODO("Not yet implemented")
    }

    override fun getAllDepartments(): Flow<List<DepartmentDomain>> {
        TODO("Not yet implemented")
    }

    override fun getAchievementById(achievementsId: Int): Flow<AchievementsDomain> {
        TODO("Not yet implemented")
    }
}