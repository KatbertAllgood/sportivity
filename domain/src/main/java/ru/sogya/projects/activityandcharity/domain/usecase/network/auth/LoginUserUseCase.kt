package ru.sogya.projects.activityandcharity.domain.usecase.network.auth

import ru.sogya.projects.activityandcharity.domain.repository.NetworkRepository

class LoginUserUseCase(private val networkRepository: NetworkRepository) {
    operator fun invoke(email: String, password: String) =
        networkRepository.loginUser(email, password)
}