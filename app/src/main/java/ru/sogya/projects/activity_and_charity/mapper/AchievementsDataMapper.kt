package ru.sogya.projects.activity_and_charity.mapper

import ru.sogya.projects.activity_and_charity.model.AchievementsPresentation
import ru.sogya.projects.activityandcharity.domain.model.AchievementsDomain

class AchievementsDataMapper(private val achievementsDomain: AchievementsDomain) {
    fun toData(): AchievementsPresentation = AchievementsPresentation(
        achievementsDomain.id,
        achievementsDomain.title,
        achievementsDomain.description,
        achievementsDomain.photoUrl
    )
}