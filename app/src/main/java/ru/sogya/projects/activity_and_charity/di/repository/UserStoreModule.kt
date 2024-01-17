package ru.sogya.projects.activity_and_charity.di.repository

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import ru.sogya.projects.activityandcharity.domain.repository.firebase.UserStoreRepository
import ru.sogya.projects.activityandcharity.domain.usecase.firebase.user.CheckUserExistUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.firebase.user.CreateUserUseCase

@Module
@InstallIn(ViewModelComponent::class)
class UserStoreModule {

    @Provides
    fun provideCheckUserExistUseCase(userStoreRepository: UserStoreRepository): CheckUserExistUseCase =
        CheckUserExistUseCase(userStoreRepository)

    @Provides
    fun provideCreateUserUseCase(userStoreRepository: UserStoreRepository): CreateUserUseCase =
        CreateUserUseCase(userStoreRepository)
}