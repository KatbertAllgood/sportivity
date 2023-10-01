package ru.sogya.projects.activityandcharity.domain.usecase.network.auth

import ru.sogya.projects.activityandcharity.domain.repository.NetworkRepository

class CreateUserUseCase(private val networkRepository: NetworkRepository) {
    operator fun invoke(email: String, department: Int, name: String, type: Int, password: String) =
        networkRepository.createUser(email, department, name, type, password)
}