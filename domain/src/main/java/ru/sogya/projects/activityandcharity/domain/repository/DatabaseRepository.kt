package ru.sogya.projects.activityandcharity.domain.repository

import kotlinx.coroutines.flow.Flow
import ru.sogya.projects.activityandcharity.domain.model.AchievementsDomain
import ru.sogya.projects.activityandcharity.domain.model.ActivityDomain
import ru.sogya.projects.activityandcharity.domain.model.ActivityStatisticDomain
import ru.sogya.projects.activityandcharity.domain.model.DepartmentDomain
import ru.sogya.projects.activityandcharity.domain.model.FundDomain
import ru.sogya.projects.activityandcharity.domain.model.UserDomain
import ru.sogya.projects.activityandcharity.domain.model.UserStatisticDomain

interface DatabaseRepository {

    fun getAllActivities(): Flow<List<ActivityDomain>>

    fun insertActivities(activities: List<ActivityDomain>)

    fun updateActivities(activities: List<ActivityDomain>): Int

    fun getAllDepartments(): Flow<List<DepartmentDomain>>

    fun getFund(): Flow<FundDomain>

    fun insertFund(fundData: FundDomain): Long

    fun updateFund(fundData: FundDomain): Int

    fun deleteFund(fundData: FundDomain): Int

    fun insertDepartments(departments: List<DepartmentDomain>)

    fun updateDepartments(departments: List<DepartmentDomain>): Int

    fun getActivityStatisticDomain(): Flow<ActivityStatisticDomain>

    fun insertActivityStatistic(activityStatisticData: ActivityStatisticDomain): Long

    fun updateActivityStatistic(activityStatisticData: ActivityStatisticDomain): Int

    fun deleteActivityStatistic(activityStatisticData: ActivityStatisticDomain): Int

    fun getUser(): Flow<UserDomain>

    suspend fun insertUser(userData: UserDomain): Long

    suspend fun updateUser(userData: UserDomain): Int

    suspend fun deleteUser(userData: UserDomain): Int

    fun getUserStatistic(): Flow<UserStatisticDomain>

    fun insertUserStatistic(userStatisticData: UserStatisticDomain): Long

    fun updateUserStatistic(userStatisticData: UserStatisticDomain): Int

    fun deleteUserStatistic(userStatisticData: UserStatisticDomain): Int

    fun getAchievements():Flow<AchievementsDomain>

    fun insertAchievements(achievementsDomain: AchievementsDomain):Long

    fun updateAchievements(achievementsDomain: AchievementsDomain): Int
}