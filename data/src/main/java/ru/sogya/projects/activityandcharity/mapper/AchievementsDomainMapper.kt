package ru.sogya.projects.activityandcharity.mapper

import ru.sogya.projects.activityandcharity.domain.model.AchievementsDomain
import ru.sogya.projects.activityandcharity.model.AchievementsData

class AchievementsDomainMapper(private val achievementsDomain: AchievementsDomain) {
    fun toData(): AchievementsData = AchievementsData(
        achievementsDomain.id,
        achievementsDomain.title,
        achievementsDomain.description,
        achievementsDomain.photoUrl
    )
}