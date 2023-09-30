package ru.sogya.projects.activityandcharity.domain.usecase

import ru.sogya.projects.activityandcharity.domain.repository.NetworkRepository

class CreateUserUseCase(private val networkRepository: NetworkRepository) {
    operator fun invoke(email: String, name: String, type: Int, password: String) =
        networkRepository.createUser(email, name, type, password)
}