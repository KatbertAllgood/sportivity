package ru.sogya.projects.activityandcharity.repository

import android.content.Context
import androidx.room.Room
import kotlinx.coroutines.flow.Flow
import ru.sogya.projects.activityandcharity.database.LocalDataBase
import ru.sogya.projects.activityandcharity.domain.model.AchievementsDomain
import ru.sogya.projects.activityandcharity.domain.model.ActivityDomain
import ru.sogya.projects.activityandcharity.domain.model.ActivityStatisticDomain
import ru.sogya.projects.activityandcharity.domain.model.FundDomain
import ru.sogya.projects.activityandcharity.domain.model.UserDomain
import ru.sogya.projects.activityandcharity.domain.model.UserStatisticDomain
import ru.sogya.projects.activityandcharity.domain.repository.DatabaseRepository
import ru.sogya.projects.activityandcharity.mapper.toData
import ru.sogya.projects.activityandcharity.util.Constants

class DatabaseRepositoryImpl(context: Context) : DatabaseRepository {
    private val db = Room.databaseBuilder(
        context, LocalDataBase::class.java, Constants.DATABASE_NAME
    ).build()

    override fun getAllActivities(): Flow<List<ActivityDomain>> {
        return db.activityDao().getAllActivities()
    }

    override fun insertActivities(activities: List<ActivityDomain>) {
        db.activityDao().insertActivities(activities.map {
            it.toData()
        })
    }

    override fun updateActivities(activities: List<ActivityDomain>): Int {
        return db.activityDao().updateActivities(activities.map {
            it.toData()
        })
    }

    override fun getFund(): Flow<FundDomain> {
        return db.fundDao().getFund()
    }

    override fun insertFund(fundData: FundDomain): Long {
        return db.fundDao().insertFund(fundData.toData())
    }

    override fun updateFund(fundData: FundDomain): Int {
        return db.fundDao().updateFund(fundData.toData())
    }

    override fun deleteFund(fundData: FundDomain): Int {
        return db.fundDao().deleteFund(fundData.toData())
    }

    override fun getActivityStatisticDomain(): Flow<ActivityStatisticDomain> {
        return db.activityStatisticDao().getActivitytatistic()
    }

    override fun insertActivityStatistic(activityStatisticData: ActivityStatisticDomain): Long {
        return db.activityStatisticDao()
            .insertActivityStatistic(activityStatisticData.toData())
    }

    override fun updateActivityStatistic(activityStatisticData: ActivityStatisticDomain): Int {
        return db.activityStatisticDao()
            .updateActivityStatistic(activityStatisticData.toData())
    }

    override fun deleteActivityStatistic(activityStatisticData: ActivityStatisticDomain): Int {
        return db.activityStatisticDao()
            .deleteActivityStatistic(activityStatisticData.toData())
    }

    override fun getUser(): Flow<UserDomain> {
        return db.userDao().getUser()
    }

    override suspend fun insertUser(userDomain: UserDomain): Long {
        return db.userDao().insertUser(userDomain.toData())
    }

    override suspend fun updateUser(userDomain: UserDomain): Int {
        return db.userDao().updateUser(userDomain.toData())
    }

    override suspend fun deleteUser(userDomain: UserDomain): Int {
        return db.userDao().updateUser(userDomain.toData())
    }

    override fun getUserStatistic(): Flow<UserStatisticDomain> {
        return db.userStatisticDao().getUserStatistic()
    }

    override fun insertUserStatistic(userStatisticDomain: UserStatisticDomain): Long {
        return db.userStatisticDao()
            .insertUserStatistic(userStatisticDomain.toData())
    }

    override fun updateUserStatistic(userStatisticDomain: UserStatisticDomain): Int {
        return db.userStatisticDao()
            .updateUserStatistic(userStatisticDomain.toData())
    }

    override fun deleteUserStatistic(userStatisticDomain: UserStatisticDomain): Int {
        return db.userStatisticDao()
            .deleteUserStatistic(userStatisticDomain.toData())
    }

    override fun getAchievements(): Flow<AchievementsDomain> {
        return db.achievementsDao().getAchievments()
    }

    override fun insertAchievements(achievementsDomain: AchievementsDomain): Long {
        return db.achievementsDao()
            .insertActhievements(achievementsDomain.toData())
    }

    override fun updateAchievements(achievementsDomain: AchievementsDomain): Int {
        return db.achievementsDao()
            .updateAchievements(achievementsDomain.toData())
    }
}