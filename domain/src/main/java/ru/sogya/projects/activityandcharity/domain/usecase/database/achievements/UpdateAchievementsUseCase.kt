package ru.sogya.projects.activityandcharity.domain.usecase.database.achievements

import ru.sogya.projects.activityandcharity.domain.entity.AchievementsDomain
import ru.sogya.projects.activityandcharity.domain.repository.DatabaseRepository

class UpdateAchievementsUseCase(private val databaseRepository: DatabaseRepository) {
    operator fun invoke(achievementsDomain: AchievementsDomain) =
        databaseRepository.updateAchievements(achievementsDomain)
}