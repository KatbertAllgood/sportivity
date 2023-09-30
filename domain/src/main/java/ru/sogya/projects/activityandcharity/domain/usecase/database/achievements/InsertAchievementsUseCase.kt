package ru.sogya.projects.activityandcharity.domain.usecase.database.achievements

import ru.sogya.projects.activityandcharity.domain.model.AchievementsDomain
import ru.sogya.projects.activityandcharity.domain.repository.DatabaseRepository

class InsertAchievementsUseCase(private val databaseRepository: DatabaseRepository) {
    operator fun invoke(achievementsDomain: AchievementsDomain) =
        databaseRepository.insertAchievements(achievementsDomain)
}