package ru.sogya.projects.activityandcharity.data.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import ru.sogya.projects.activityandcharity.data.datastore.AppDataStore
import ru.sogya.projects.activityandcharity.data.datastore.AppDataStoreImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataStoreModule {

    @Singleton
    @Provides
    fun provideAppDataStore(@ApplicationContext context: Context): AppDataStore =
        AppDataStoreImpl(context)
}