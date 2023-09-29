package ru.sogya.projects.activity_and_charity.di.repository

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import ru.sogya.projects.activityandcharity.domain.repository.SharedPreferencesRepository
import ru.sogya.projects.activityandcharity.domain.usecase.sharedpreferences.*

@Module
@InstallIn(ViewModelComponent::class)
class SharedPreferencesModule {
    @Provides
    fun providesGetBooleanPrefsUseCase(sharedPreferencesRepository: SharedPreferencesRepository) =
        GetBooleanPrefsUseCase(sharedPreferencesRepository)

    @Provides
    fun providesGetDoublePrefsUseCase(sharedPreferencesRepository: SharedPreferencesRepository) =
        GetDoublePrefsUseCase(sharedPreferencesRepository)

    @Provides
    fun providesGetIntPrefsUseCase(sharedPreferencesRepository: SharedPreferencesRepository) =
        GetIntPrefsUseCase(sharedPreferencesRepository)

    @Provides
    fun providesGetLongPrefsUseCase(sharedPreferencesRepository: SharedPreferencesRepository) =
        GetLongPrefsUseCase(sharedPreferencesRepository)

    @Provides
    fun providesGetStringPrefsUseCase(sharedPreferencesRepository: SharedPreferencesRepository) =
        GetStringPrefsUseCase(sharedPreferencesRepository)

    @Provides
    fun providesUpdatePrefsUseCase(sharedPreferencesRepository: SharedPreferencesRepository) =
        UpdatePrefsUseCase(sharedPreferencesRepository)
}