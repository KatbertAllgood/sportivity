package ru.sogya.projects.activity_and_charity.di.repository

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import ru.sogya.projects.activityandcharity.domain.repository.NetworkRepository
import ru.sogya.projects.activityandcharity.domain.usecase.network.achievement.GetAchievementById
import ru.sogya.projects.activityandcharity.domain.usecase.network.activity.GetAllActivitiesUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.network.activitystat.GetActivityStatisticByIdUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.network.auth.CreateUserUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.network.auth.LoginUserUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.network.fund.GetAllFundUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.network.fund.GetFundByIdUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.network.rating.GetUserRatingUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.network.user.GetAllUsersUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.network.user.GetUserByIdUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.network.userstat.GetUserStatisticByIdUseCase

@Module
@InstallIn(ViewModelComponent::class)
class NetworkModule {

    @Provides
    fun provideCreateUserUseCase(networkRepository: NetworkRepository) =
        CreateUserUseCase(networkRepository)

    @Provides
    fun provideGetAchievementByIdUseCase(networkRepository: NetworkRepository) =
        GetAchievementById(networkRepository)

    @Provides
    fun provideGetAllActivitiesUseCase(networkRepository: NetworkRepository) =
        GetAllActivitiesUseCase(networkRepository)

    @Provides
    fun provideGetActivityStatisticByIdUseCase(networkRepository: NetworkRepository) =
        GetActivityStatisticByIdUseCase(networkRepository)

    @Provides
    fun provideLoginUserUseCase(networkRepository: NetworkRepository) =
        LoginUserUseCase(networkRepository)

    @Provides
    fun provideGetAllFundUseCase(networkRepository: NetworkRepository) =
        GetAllFundUseCase(networkRepository)

    @Provides
    fun provideGetFundByIdUseCase(networkRepository: NetworkRepository) =
        GetFundByIdUseCase(networkRepository)

    @Provides
    fun provideGetUserRatingUseCase(networkRepository: NetworkRepository) =
        GetUserRatingUseCase(networkRepository)

    @Provides
    fun provideGetAllUsersUseCase(networkRepository: NetworkRepository) =
        GetAllUsersUseCase(networkRepository)

    @Provides
    fun provideGetUserByIdUseCase(networkRepository: NetworkRepository) =
        GetUserByIdUseCase(networkRepository)

    @Provides
    fun provideGetUserStatisticByIdUseCase(networkRepository: NetworkRepository) =
        GetUserStatisticByIdUseCase(networkRepository)
}