package ru.sogya.projects.activityandcharity.domain.repository

import kotlinx.coroutines.flow.Flow
import ru.sogya.projects.activityandcharity.domain.model.AchievementsDomain
import ru.sogya.projects.activityandcharity.domain.model.ActivityDomain
import ru.sogya.projects.activityandcharity.domain.model.ActivityStatisticDomain
import ru.sogya.projects.activityandcharity.domain.model.DepartmentDomain
import ru.sogya.projects.activityandcharity.domain.model.FundDomain
import ru.sogya.projects.activityandcharity.domain.model.UserDomain
import ru.sogya.projects.activityandcharity.domain.model.UserStatisticDomain


interface NetworkRepository {

    fun getUserById(userId:Int): Flow<UserDomain>

    fun getAllUsers(): Flow<List<UserDomain>>

    fun getUserRating(): Flow<List<UserStatisticDomain>>

    fun createUser(email: String,department:Int, name: String, type: Int, password: String): Flow<UserDomain>

    fun loginUser(email: String, password: String): Flow<UserDomain>

    fun getAllActivities(): Flow<List<ActivityDomain>>

    fun getAllFunds(): Flow<List<FundDomain>>

    fun getAllDepartments(): Flow<List<DepartmentDomain>>

    fun getDepartmentById(departmentId: Int): Flow<DepartmentDomain>

    fun getFundById(fundId: Int): Flow<FundDomain>

    fun getUserStatisticById(userId: Int): Flow<UserStatisticDomain>

    fun getActivityStatisticById(userId: Int): Flow<List<ActivityStatisticDomain>>

    fun getAchievementById(achievementsId: Int): Flow<AchievementsDomain>
}