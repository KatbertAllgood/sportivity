package ru.sogya.projects.activity_and_charity.di.repository

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import ru.sogya.projects.activityandcharity.domain.repository.NetworkRepository
import ru.sogya.projects.activityandcharity.domain.usecase.CreateUserUseCase

@Module
@InstallIn(ViewModelComponent::class)
class NetworkRepository {

    @Provides
    fun provideCreateUserUseCase(networkRepository: NetworkRepository) =
        CreateUserUseCase(networkRepository)
}