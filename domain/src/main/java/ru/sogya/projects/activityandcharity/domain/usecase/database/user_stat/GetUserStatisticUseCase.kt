package ru.sogya.projects.activityandcharity.domain.usecase.database.user_stat

import ru.sogya.projects.activityandcharity.domain.repository.DatabaseRepository

class GetUserStatisticUseCase(private val databaseRepository: DatabaseRepository) {
    operator fun invoke() = databaseRepository.getUserStatistic()
}