package ru.sogya.projects.activityandcharity.domain.repository

import kotlinx.coroutines.flow.Flow
import ru.sogya.projects.activityandcharity.domain.model.ActivityDomain
import ru.sogya.projects.activityandcharity.domain.model.ActivityStatisticDomain
import ru.sogya.projects.activityandcharity.domain.model.UserDomain
import ru.sogya.projects.activityandcharity.domain.model.UserStatisticDomain

interface DatabaseRepository {

    fun getAllActivities(): Flow<List<ActivityDomain>>

    fun insertActivities(activities: List<ActivityDomain>)

    fun updateActivities(activities: List<ActivityDomain>): Int

    fun getActivityStatisticDomain(): Flow<ActivityStatisticDomain>

    fun insertActivityStatistic(activityStatisticData: ActivityStatisticDomain): Long

    fun updateActivityStatistic(activityStatisticData: ActivityStatisticDomain): Int

    fun deleteActivityStatistic(activityStatisticData: ActivityStatisticDomain): Int

    fun getUser(): Flow<UserDomain>

    fun insertUser(userData: UserDomain): Long

    fun updateUser(userData: UserDomain): Int

    fun deleteUser(userData: UserDomain): Int

    fun getUserStatistic(): Flow<UserStatisticDomain>

    fun insertUserStatistic(userStatisticData: UserStatisticDomain): Long

    fun updateUserStatistic(userStatisticData: UserStatisticDomain): Int

    fun deleteUserStatistic(userStatisticData: UserStatisticDomain): Int
}