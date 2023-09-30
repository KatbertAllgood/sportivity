package ru.sogya.projects.activityandcharity.repository

import android.content.Context
import androidx.room.Room
import kotlinx.coroutines.flow.Flow
import ru.sogya.projects.activityandcharity.database.LocalDataBase
import ru.sogya.projects.activityandcharity.domain.model.AchievementsDomain
import ru.sogya.projects.activityandcharity.domain.model.ActivityDomain
import ru.sogya.projects.activityandcharity.domain.model.ActivityStatisticDomain
import ru.sogya.projects.activityandcharity.domain.model.DepartmentDomain
import ru.sogya.projects.activityandcharity.domain.model.FundDomain
import ru.sogya.projects.activityandcharity.domain.model.UserDomain
import ru.sogya.projects.activityandcharity.domain.model.UserStatisticDomain
import ru.sogya.projects.activityandcharity.domain.repository.DatabaseRepository
import ru.sogya.projects.activityandcharity.mapper.AchievementsDomainMapper
import ru.sogya.projects.activityandcharity.mapper.ActivityDomainMapper
import ru.sogya.projects.activityandcharity.mapper.ActivityStatisticDomainMapper
import ru.sogya.projects.activityandcharity.mapper.DepartmentsDomainMapper
import ru.sogya.projects.activityandcharity.mapper.FundDomainMapper
import ru.sogya.projects.activityandcharity.mapper.UserDomainMapper
import ru.sogya.projects.activityandcharity.mapper.UserStatisticDomainMapper

class DatabaseRepositoryImpl(context: Context) : DatabaseRepository {
    private val db = Room.databaseBuilder(
        context, LocalDataBase::class.java, "local-data-base"
    ).build()

    override fun getAllActivities(): Flow<List<ActivityDomain>> {
        return db.activityDao().getAllActivities()
    }

    override fun insertActivities(activities: List<ActivityDomain>) {
        db.activityDao().insertActivities(activities.map {
            ActivityDomainMapper(it).invoke()
        })
    }

    override fun updateActivities(activities: List<ActivityDomain>): Int {
        return db.activityDao().updateActivities(activities.map {
            ActivityDomainMapper(it).invoke()
        })
    }

    override fun getAllDepartments(): Flow<List<DepartmentDomain>> {
        return db.departmentDao().getAllDepartments()
    }

    override fun getFund(): Flow<FundDomain> {
        return db.fundDao().getFund()
    }

    override fun insertFund(fundData: FundDomain): Long {
        return db.fundDao().insertFund(FundDomainMapper(fundData).toData())
    }

    override fun updateFund(fundData: FundDomain): Int {
        return db.fundDao().updateFund(FundDomainMapper(fundData).toData())
    }

    override fun deleteFund(fundData: FundDomain): Int {
        return db.fundDao().deleteFund(FundDomainMapper(fundData).toData())
    }

    override fun insertDepartments(departments: List<DepartmentDomain>) {
        db.departmentDao().insertDepartments(departments.map {
            DepartmentsDomainMapper(it).toData()
        })
    }

    override fun updateDepartments(departments: List<DepartmentDomain>): Int {
        return db.departmentDao().updateDepartments(departments.map {
            DepartmentsDomainMapper(it).toData()
        })
    }

    override fun getActivityStatisticDomain(): Flow<ActivityStatisticDomain> {
        return db.activityStatisticDao().getActivitytatistic()
    }

    override fun insertActivityStatistic(activityStatisticData: ActivityStatisticDomain): Long {
        return db.activityStatisticDao()
            .insertActivityStatistic(ActivityStatisticDomainMapper(activityStatisticData).toData())
    }

    override fun updateActivityStatistic(activityStatisticData: ActivityStatisticDomain): Int {
        return db.activityStatisticDao()
            .updateActivityStatistic(ActivityStatisticDomainMapper(activityStatisticData).toData())
    }

    override fun deleteActivityStatistic(activityStatisticData: ActivityStatisticDomain): Int {
        return db.activityStatisticDao()
            .deleteActivityStatistic(ActivityStatisticDomainMapper(activityStatisticData).toData())
    }

    override fun getUser(): Flow<UserDomain> {
        return db.userDao().getUser()
    }

    override fun insertUser(userData: UserDomain): Long {
        return db.userDao().insertUser(UserDomainMapper(userData).toData())
    }

    override fun updateUser(userData: UserDomain): Int {
        return db.userDao().updateUser(UserDomainMapper(userData).toData())
    }

    override fun deleteUser(userData: UserDomain): Int {
        return db.userDao().updateUser(UserDomainMapper(userData).toData())
    }

    override fun getUserStatistic(): Flow<UserStatisticDomain> {
        return db.userStatisticDao().getUserStatistic()
    }

    override fun insertUserStatistic(userStatisticData: UserStatisticDomain): Long {
        return db.userStatisticDao()
            .insertUserStatistic(UserStatisticDomainMapper(userStatisticData).toData())
    }

    override fun updateUserStatistic(userStatisticData: UserStatisticDomain): Int {
        return db.userStatisticDao()
            .updateUserStatistic(UserStatisticDomainMapper(userStatisticData).toData())
    }

    override fun deleteUserStatistic(userStatisticData: UserStatisticDomain): Int {
        return db.userStatisticDao()
            .deleteUserStatistic(UserStatisticDomainMapper(userStatisticData).toData())
    }

    override fun getAchievements(): Flow<AchievementsDomain> {
        return db.achievementsDao().getAchievments()
    }

    override fun insertAchievements(achievementsDomain: AchievementsDomain): Long {
        return db.achievementsDao()
            .insertActhievements(AchievementsDomainMapper(achievementsDomain).toData())
    }

    override fun updateAchievements(achievementsDomain: AchievementsDomain): Int {
        return db.achievementsDao()
            .updateAchievements(AchievementsDomainMapper(achievementsDomain).toData())
    }
}