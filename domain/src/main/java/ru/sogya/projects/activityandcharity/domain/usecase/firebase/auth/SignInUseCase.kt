package ru.sogya.projects.activityandcharity.domain.usecase.firebase.auth

import ru.sogya.projects.activityandcharity.domain.repository.firebase.AuthRepository

class SignInUseCase(private val authRepository: AuthRepository) {
    suspend operator fun invoke(email:String, password:String) = authRepository.login(email,password)
}