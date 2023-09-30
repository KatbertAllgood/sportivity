package ru.sogya.projects.activityandcharity.domain.repository

import kotlinx.coroutines.flow.Flow
import ru.sogya.projects.activityandcharity.domain.model.AchievementsDomain
import ru.sogya.projects.activityandcharity.domain.model.ActivityDomain
import ru.sogya.projects.activityandcharity.domain.model.DepartmentDomain
import ru.sogya.projects.activityandcharity.domain.model.FundDomain
import ru.sogya.projects.activityandcharity.domain.model.UserDomain
import ru.sogya.projects.activityandcharity.domain.model.UserStatisticDomain


interface NetworkRepository {

    fun getUserById(): Flow<UserDomain>

    fun getAllUsers(): Flow<List<UserDomain>>

    fun getUserRating(): Flow<List<UserStatisticDomain>>

    fun createUser(login: String, password: String)

    fun login(login: String, password: String)

    fun getAllActivities(): Flow<List<ActivityDomain>>

    fun getAllFunds(): Flow<List<FundDomain>>

    fun getAllDepartments(): Flow<List<DepartmentDomain>>

    fun getAchievmentById(achievementsId:Int): Flow<AchievementsDomain>
}