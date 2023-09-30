package ru.sogya.projects.activityandcharity.domain.usecase.database.fund

import ru.sogya.projects.activityandcharity.domain.model.FundDomain
import ru.sogya.projects.activityandcharity.domain.model.UserDomain
import ru.sogya.projects.activityandcharity.domain.repository.DatabaseRepository

class InsertFundUseCase(private val databaseRepository: DatabaseRepository) {
    operator fun invoke(fundDomain: FundDomain) = databaseRepository.insertFund(fundDomain)
}