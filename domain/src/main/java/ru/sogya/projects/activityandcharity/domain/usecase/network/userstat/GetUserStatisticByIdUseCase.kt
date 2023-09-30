package ru.sogya.projects.activityandcharity.domain.usecase.network.userstat

import ru.sogya.projects.activityandcharity.domain.repository.NetworkRepository

class GetUserStatisticByIdUseCase(private val networkRepository: NetworkRepository) {
    operator fun invoke(userId:Int) = networkRepository.getUserStatisticById(userId)
}