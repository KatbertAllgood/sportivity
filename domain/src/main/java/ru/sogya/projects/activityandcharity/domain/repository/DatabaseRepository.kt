package ru.sogya.projects.activityandcharity.domain.repository

import kotlinx.coroutines.flow.Flow
import ru.sogya.projects.activityandcharity.domain.entity.AchievementsDomain
import ru.sogya.projects.activityandcharity.domain.entity.ActivityDomain
import ru.sogya.projects.activityandcharity.domain.entity.ActivityStatisticDomain
import ru.sogya.projects.activityandcharity.domain.entity.FundDomain
import ru.sogya.projects.activityandcharity.domain.entity.UserDomain
import ru.sogya.projects.activityandcharity.domain.entity.UserStatisticDomain

interface DatabaseRepository {

    fun getAllActivities(): Flow<List<ActivityDomain>>

    fun insertActivities(activities: List<ActivityDomain>)

    fun updateActivities(activities: List<ActivityDomain>): Int

    fun getFund(): Flow<FundDomain>

    fun insertFund(fundData: FundDomain): Long

    fun updateFund(fundData: FundDomain): Int

    fun deleteFund(fundData: FundDomain): Int

    fun getActivityStatisticDomain(): Flow<ActivityStatisticDomain>

    fun insertActivityStatistic(activityStatisticData: ActivityStatisticDomain): Long

    fun updateActivityStatistic(activityStatisticData: ActivityStatisticDomain): Int

    fun deleteActivityStatistic(activityStatisticData: ActivityStatisticDomain): Int

    fun getUser(): Flow<UserDomain>

    suspend fun insertUser(userDomain: UserDomain): Long

    suspend fun updateUser(userDomain: UserDomain): Int

    suspend fun deleteUser(userDomain: UserDomain): Int

    fun getUserStatistic(): Flow<UserStatisticDomain>

    fun insertUserStatistic(userStatisticDomain: UserStatisticDomain): Long

    fun updateUserStatistic(userStatisticDomain: UserStatisticDomain): Int

    fun deleteUserStatistic(userStatisticDomain: UserStatisticDomain): Int

    fun getAchievements():Flow<AchievementsDomain>

    fun insertAchievements(achievementsDomain: AchievementsDomain):Long

    fun updateAchievements(achievementsDomain: AchievementsDomain): Int
}