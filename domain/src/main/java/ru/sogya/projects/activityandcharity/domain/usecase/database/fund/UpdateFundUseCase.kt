package ru.sogya.projects.activityandcharity.domain.usecase.database.fund

import ru.sogya.projects.activityandcharity.domain.model.FundDomain
import ru.sogya.projects.activityandcharity.domain.repository.DatabaseRepository

class UpdateFundUseCase(private val databaseRepository: DatabaseRepository) {
    operator fun invoke(fundDomain: FundDomain) = databaseRepository.updateFund(fundDomain)
}