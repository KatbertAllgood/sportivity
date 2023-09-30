package ru.sogya.projects.activityandcharity.repository

import kotlinx.coroutines.flow.Flow
import ru.sogya.projects.activityandcharity.api.NetworkService
import ru.sogya.projects.activityandcharity.domain.model.AchievementsDomain
import ru.sogya.projects.activityandcharity.domain.model.ActivityDomain
import ru.sogya.projects.activityandcharity.domain.model.DepartmentDomain
import ru.sogya.projects.activityandcharity.domain.model.FundDomain
import ru.sogya.projects.activityandcharity.domain.model.UserDomain
import ru.sogya.projects.activityandcharity.domain.model.UserStatisticDomain
import ru.sogya.projects.activityandcharity.domain.repository.NetworkRepository

class NetworkRepositoryImpl : NetworkRepository {
    override fun getUserById(): Flow<UserDomain> {
        TODO("Not yet implemented")
    }

    override fun getAllUsers(): Flow<List<UserDomain>> {
        return NetworkService.getRetrofitService().getAllUsers()
    }

    override fun getUserRating(): Flow<List<UserStatisticDomain>> {
            TODO("Not yet implemented")
    }

    override fun createUser(login: String, password: String) {
        TODO("Not yet implemented")
    }

    override fun login(login: String, password: String) {
        TODO("Not yet implemented")
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

    override fun getAchievmentById(achievementsId: Int): Flow<AchievementsDomain> {
        TODO("Not yet implemented")
    }
}