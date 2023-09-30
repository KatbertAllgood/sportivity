package ru.sogya.projects.activityandcharity.domain.usecase.network.fund

import ru.sogya.projects.activityandcharity.domain.repository.NetworkRepository

class GetFundByIdUseCase(private val networkRepository: NetworkRepository) {

    operator fun invoke(fundId:Int) = networkRepository.getFundById(fundId)
}