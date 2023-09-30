package ru.sogya.projects.activityandcharity.repository

import android.content.Context
import kotlinx.coroutines.flow.Flow
import ru.sogya.projects.activityandcharity.domain.model.ActivityDomain
import ru.sogya.projects.activityandcharity.domain.model.ActivityStatisticDomain
import ru.sogya.projects.activityandcharity.domain.model.DepartmentDomain
import ru.sogya.projects.activityandcharity.domain.model.FundDomain
import ru.sogya.projects.activityandcharity.domain.model.UserDomain
import ru.sogya.projects.activityandcharity.domain.model.UserStatisticDomain
import ru.sogya.projects.activityandcharity.domain.repository.DatabaseRepository

class DatabaseRepositoryImpl(context: Context) : DatabaseRepository {
    override fun getAllActivities(): Flow<List<ActivityDomain>> {
        TODO("Not yet implemented")
    }

    override fun insertActivities(activities: List<ActivityDomain>) {
        TODO("Not yet implemented")
    }

    override fun updateActivities(activities: List<ActivityDomain>): Int {
        TODO("Not yet implemented")
    }

    override fun getAllDepartments(): Flow<List<DepartmentDomain>> {
        TODO("Not yet implemented")
    }

    override fun getFund(): Flow<FundDomain> {
        TODO("Not yet implemented")
    }

    override fun insertFund(fundData: FundDomain): Long {
        TODO("Not yet implemented")
    }

    override fun updateFund(fundData: FundDomain): Int {
        TODO("Not yet implemented")
    }

    override fun deleteFund(fundData: FundDomain): Int {
        TODO("Not yet implemented")
    }

    override fun insertDepartments(activities: List<DepartmentDomain>) {
        TODO("Not yet implemented")
    }

    override fun updateDepartments(activities: List<DepartmentDomain>): Int {
        TODO("Not yet implemented")
    }

    override fun getActivityStatisticDomain(): Flow<ActivityStatisticDomain> {
        TODO("Not yet implemented")
    }

    override fun insertActivityStatistic(activityStatisticData: ActivityStatisticDomain): Long {
        TODO("Not yet implemented")
    }

    override fun updateActivityStatistic(activityStatisticData: ActivityStatisticDomain): Int {
        TODO("Not yet implemented")
    }

    override fun deleteActivityStatistic(activityStatisticData: ActivityStatisticDomain): Int {
        TODO("Not yet implemented")
    }

    override fun getUser(): Flow<UserDomain> {
        TODO("Not yet implemented")
    }

    override fun insertUser(userData: UserDomain): Long {
        TODO("Not yet implemented")
    }

    override fun updateUser(userData: UserDomain): Int {
        TODO("Not yet implemented")
    }

    override fun deleteUser(userData: UserDomain): Int {
        TODO("Not yet implemented")
    }

    override fun getUserStatistic(): Flow<UserStatisticDomain> {
        TODO("Not yet implemented")
    }

    override fun insertUserStatistic(userStatisticData: UserStatisticDomain): Long {
        TODO("Not yet implemented")
    }

    override fun updateUserStatistic(userStatisticData: UserStatisticDomain): Int {
        TODO("Not yet implemented")
    }

    override fun deleteUserStatistic(userStatisticData: UserStatisticDomain): Int {
        TODO("Not yet implemented")
    }
}