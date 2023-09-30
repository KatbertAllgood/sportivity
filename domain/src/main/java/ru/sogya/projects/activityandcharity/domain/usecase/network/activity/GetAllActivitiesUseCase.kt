package ru.sogya.projects.activityandcharity.domain.usecase.network.activity

import ru.sogya.projects.activityandcharity.domain.repository.NetworkRepository

class GetAllActivitiesUseCase(private val networkRepository: NetworkRepository) {
    operator fun invoke() = networkRepository.getAllActivities()
}