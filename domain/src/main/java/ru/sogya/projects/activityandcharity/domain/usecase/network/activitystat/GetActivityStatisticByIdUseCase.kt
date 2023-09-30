package ru.sogya.projects.activityandcharity.domain.usecase.network.activitystat

import ru.sogya.projects.activityandcharity.domain.repository.NetworkRepository

class GetActivityStatisticByIdUseCase(private val networkRepository: NetworkRepository) {
    operator fun invoke(userId: Int) = networkRepository.getActivityStatisticById(userId)
}