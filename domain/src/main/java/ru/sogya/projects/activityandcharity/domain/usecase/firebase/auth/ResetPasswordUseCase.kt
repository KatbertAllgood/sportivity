package ru.sogya.projects.activityandcharity.domain.usecase.firebase.auth

import ru.sogya.projects.activityandcharity.domain.repository.firebase.AuthRepository

class ResetPasswordUseCase(private val authRepository: AuthRepository) {
    suspend operator fun invoke(email: String) = authRepository.resetPassword(email)
}