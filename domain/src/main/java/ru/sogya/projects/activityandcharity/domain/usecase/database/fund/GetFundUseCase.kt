package ru.sogya.projects.activityandcharity.domain.usecase.database.fund

import ru.sogya.projects.activityandcharity.domain.repository.DatabaseRepository

class GetFundUseCase(private val databaseRepository: DatabaseRepository) {
    operator fun invoke() = databaseRepository.getFund()
}