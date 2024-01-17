package ru.sogya.projects.activityandcharity.domain.usecase.firebase.auth

import ru.sogya.projects.activityandcharity.domain.repository.firebase.AuthRepository

class SignUpUseCase(private val authRepository: AuthRepository) {
    suspend operator fun invoke(name: String, email: String, password: String) =
        authRepository.registration(name, email, password)
}