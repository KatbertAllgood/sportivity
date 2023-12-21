package ru.sogya.projects.activity_and_charity.mapper

import ru.sogya.projects.activity_and_charity.entity.AchievementsPresentation
import ru.sogya.projects.activityandcharity.domain.entity.AchievementsDomain

fun AchievementsDomain.toPresentation(): AchievementsPresentation =
    AchievementsPresentation(id, title, description, photoUrl)