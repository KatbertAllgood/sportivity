package ru.sogya.projects.activity_and_charity.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import ru.sogya.projects.activityandcharity.data.model.FirebaseAuthenticator
import ru.sogya.projects.activityandcharity.data.repository.DatabaseRepositoryImpl
import ru.sogya.projects.activityandcharity.data.repository.NetworkRepositoryImpl
import ru.sogya.projects.activityandcharity.data.repository.firebase.AuthRepositoryImpl
import ru.sogya.projects.activityandcharity.domain.repository.DatabaseRepository
import ru.sogya.projects.activityandcharity.domain.repository.NetworkRepository
import ru.sogya.projects.activityandcharity.domain.repository.firebase.AuthRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    @Singleton
    fun providesDatabaseRepository(@ApplicationContext context: Context): DatabaseRepository =
        DatabaseRepositoryImpl(context)

    @Provides
    @Singleton
    fun provideNetworkRepository(): NetworkRepository = NetworkRepositoryImpl()

    @Provides
    @Singleton
    fun provideFirebaseAuthRepository(firebaseAuthenticator: FirebaseAuthenticator): AuthRepository =
        AuthRepositoryImpl(firebaseAuthenticator)
}