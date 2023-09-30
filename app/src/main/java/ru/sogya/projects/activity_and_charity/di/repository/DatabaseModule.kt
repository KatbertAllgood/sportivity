package ru.sogya.projects.activity_and_charity.di.repository

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import ru.sogya.projects.activityandcharity.domain.repository.DatabaseRepository
import ru.sogya.projects.activityandcharity.domain.usecase.database.activity.GetAllActivitiesUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.database.activity.InsertActivitiesUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.database.activity.UpdateActivitiesUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.database.activity_stat.DeleteActivityStatisticUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.database.activity_stat.GetActivityStatisticUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.database.activity_stat.InsertActivityStatisticUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.database.activity_stat.UpdateActivityStatisticUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.database.department.GetAllDepartmentsUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.database.department.InsertDepartmentsUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.database.department.UpdateDepartmentsUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.database.fund.DeleteFundUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.database.fund.GetFundUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.database.fund.InsertFundUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.database.fund.UpdateFundUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.database.user.DeleteUserUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.database.user.GetUserUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.database.user.InsertUserUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.database.user.UpdateUserUseCase

@Module
@InstallIn(ViewModelComponent::class)
class DatabaseModule {

    @Provides
    fun provideGetAllActivitiesUseCase(databaseRepository: DatabaseRepository) =
        GetAllActivitiesUseCase(databaseRepository)

    @Provides
    fun provideInsertActivitiesUseCase(databaseRepository: DatabaseRepository) =
        InsertActivitiesUseCase(databaseRepository)

    @Provides
    fun provideUpdateActivitiesUseCase(databaseRepository: DatabaseRepository) =
        UpdateActivitiesUseCase(databaseRepository)

    @Provides
    fun provideGetActivityStatisticUseCase(databaseRepository: DatabaseRepository) =
        GetActivityStatisticUseCase(databaseRepository)

    @Provides
    fun provideInsertActivityStatisticUseCase(databaseRepository: DatabaseRepository) =
        InsertActivityStatisticUseCase(databaseRepository)

    @Provides
    fun provideUpdateActivityStatisticUseCase(databaseRepository: DatabaseRepository) =
        UpdateActivityStatisticUseCase(databaseRepository)

    @Provides
    fun provideDeleteActivityStatisticUseCase(databaseRepository: DatabaseRepository) =
        DeleteActivityStatisticUseCase(databaseRepository)

    @Provides
    fun provideGetAllDepartmentsUseCase(databaseRepository: DatabaseRepository) =
        GetAllDepartmentsUseCase(databaseRepository)

    @Provides
    fun provideInsertDepartmentsUseCase(databaseRepository: DatabaseRepository) =
        InsertDepartmentsUseCase(databaseRepository)

    @Provides
    fun provideUpdateDepartmentsUseCase(databaseRepository: DatabaseRepository) =
        UpdateDepartmentsUseCase(databaseRepository)

    @Provides
    fun provideGetFundUseCase(databaseRepository: DatabaseRepository) =
        GetFundUseCase(databaseRepository)

    @Provides
    fun provideInsertFundUseCase(databaseRepository: DatabaseRepository) =
        InsertFundUseCase(databaseRepository)

    @Provides
    fun provideUpdateFundUseCase(databaseRepository: DatabaseRepository) =
        UpdateFundUseCase(databaseRepository)

    @Provides
    fun provideUserFundUseCase(databaseRepository: DatabaseRepository) =
        DeleteFundUseCase(databaseRepository)

    @Provides
    fun provideGetUserUseCase(databaseRepository: DatabaseRepository) =
        GetUserUseCase(databaseRepository)

    @Provides
    fun provideInsertUserUseCase(databaseRepository: DatabaseRepository) =
        InsertUserUseCase(databaseRepository)

    @Provides
    fun provideUpdateUserUseCase(databaseRepository: DatabaseRepository) =
        UpdateUserUseCase(databaseRepository)

    @Provides
    fun provideDeleteUserUseCase(databaseRepository: DatabaseRepository) =
        DeleteUserUseCase(databaseRepository)
}