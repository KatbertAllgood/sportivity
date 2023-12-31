package ru.sogya.projects.activityandcharity.domain.usecase.network.user

import ru.sogya.projects.activityandcharity.domain.repository.NetworkRepository

class GetAllUsersUseCase(private val networkRepository: NetworkRepository) {
    operator fun invoke() = networkRepository.getAllUsers()
}