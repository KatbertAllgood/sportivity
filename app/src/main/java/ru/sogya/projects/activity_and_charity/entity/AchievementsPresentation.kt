package ru.sogya.projects.activity_and_charity.entity

import ru.sogya.projects.activityandcharity.domain.entity.AchievementsDomain

data class AchievementsPresentation(
    override val id: Int,
    override val title: String,
    override val description: String,
    override val photoUrl: String
) : AchievementsDomain