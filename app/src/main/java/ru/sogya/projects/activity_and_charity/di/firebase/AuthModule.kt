package ru.sogya.projects.activity_and_charity.di.firebase

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import ru.sogya.projects.activityandcharity.domain.repository.firebase.AuthRepository
import ru.sogya.projects.activityandcharity.domain.usecase.firebase.auth.CheckUserAuthStatusUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.firebase.auth.ResetPasswordUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.firebase.auth.SignInUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.firebase.auth.SignOutUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.firebase.auth.SignUpUseCase

@Module
@InstallIn(ViewModelComponent::class)
class AuthModule {

    @Provides
    fun provideSigInUseCase(authRepository: AuthRepository) = SignInUseCase(authRepository)

    @Provides
    fun provideSigUpUseCase(authRepository: AuthRepository) = SignUpUseCase(authRepository)

    @Provides
    fun provideResetPasswordUseCase(authRepository: AuthRepository) =
        ResetPasswordUseCase(authRepository)

    @Provides
    fun provideSigOutUseCase(authRepository: AuthRepository) = SignOutUseCase(authRepository)

    @Provides
    fun provideCheckUserAuthStatusUseCase(authRepository: AuthRepository) =
        CheckUserAuthStatusUseCase(authRepository)
}