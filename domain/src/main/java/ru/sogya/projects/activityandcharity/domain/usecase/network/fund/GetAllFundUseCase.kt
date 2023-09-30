package ru.sogya.projects.activityandcharity.domain.usecase.network.fund

import ru.sogya.projects.activityandcharity.domain.repository.NetworkRepository

class GetAllFundUseCase(private val networkRepository: NetworkRepository) {
    operator fun invoke() = networkRepository.getAllFunds()
}