package ru.sogya.projects.activityandcharity.domain.usecase.database.achievements

import ru.sogya.projects.activityandcharity.domain.repository.DatabaseRepository

class GetAchievementsUseCase(private val databaseRepository: DatabaseRepository) {
    operator fun invoke() = databaseRepository.getAchievements()
}