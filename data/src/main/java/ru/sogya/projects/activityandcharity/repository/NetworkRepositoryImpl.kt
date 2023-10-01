package ru.sogya.projects.activityandcharity.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import ru.sogya.projects.activityandcharity.api.NetworkService
import ru.sogya.projects.activityandcharity.domain.model.AchievementsDomain
import ru.sogya.projects.activityandcharity.domain.model.ActivityDomain
import ru.sogya.projects.activityandcharity.domain.model.ActivityStatisticDomain
import ru.sogya.projects.activityandcharity.domain.model.DepartmentDomain
import ru.sogya.projects.activityandcharity.domain.model.FundDomain
import ru.sogya.projects.activityandcharity.domain.model.UserDomain
import ru.sogya.projects.activityandcharity.domain.model.UserStatisticDomain
import ru.sogya.projects.activityandcharity.domain.repository.NetworkRepository
import ru.sogya.projects.activityandcharity.model.request.CreateUserRequest

class NetworkRepositoryImpl : NetworkRepository {
    override fun getUserById(userId: Int): Flow<UserDomain> = flow {
        emit(
            NetworkService.getRetrofitService().getUserById(userId)
        )
    }

    override fun getAllUsers(): Flow<List<UserDomain>> = flow {
        emit(
            NetworkService.getRetrofitService().getAllUsers()
        )
    }

    override fun getUserRating(): Flow<List<UserStatisticDomain>> = flow {
        emit(
            NetworkService.getRetrofitService().getUserRating()
        )
    }

    override fun createUser(
        email: String,
        department: Int,
        name: String,
        type: Int,
        password: String
    ): Flow<UserDomain> = flow {
        val createUserRequest = CreateUserRequest(name, email, department, type, password)
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

    override fun getAllActivities(): Flow<List<ActivityDomain>> = flow {
        emit(
            NetworkService.getRetrofitService().getAllActivities()
        )
    }

    override fun getAllFunds(): Flow<List<FundDomain>> = flow {
        emit(
            NetworkService.getRetrofitService().getAllFund()
        )
    }

    override fun getAllDepartments(): Flow<List<DepartmentDomain>> = flow {
        emit(
            NetworkService.getRetrofitService().getAllDepartment()
        )
    }

    override fun getDepartmentById(departmentId: Int): Flow<DepartmentDomain> = flow {
        emit(
            NetworkService.getRetrofitService().getDepartmentById(departmentId)
        )
    }

    override fun getFundById(fundId: Int): Flow<FundDomain> = flow {
        emit(
            NetworkService.getRetrofitService().getFundById(fundId)
        )
    }

    override fun getUserStatisticById(userId: Int): Flow<UserStatisticDomain> = flow {
        emit(
            NetworkService.getRetrofitService().getUserStat(userId)
        )
    }

    override fun getActivityStatisticById(userId: Int): Flow<List<ActivityStatisticDomain>> = flow {
        emit(
            NetworkService.getRetrofitService().getActivityStatisticByIdUseCase(userId)
        )
    }

    override fun getAchievementById(achievementsId: Int): Flow<AchievementsDomain> = flow {
        emit(
            NetworkService.getRetrofitService().getAchievementById(achievementsId)
        )
    }
}