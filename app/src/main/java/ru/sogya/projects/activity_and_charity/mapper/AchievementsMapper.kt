package ru.sogya.projects.activity_and_charity.mapper

import ru.sogya.projects.activity_and_charity.model.AchievementsPresentation
import ru.sogya.projects.activityandcharity.domain.model.AchievementsDomain
import ru.sogya.projects.activityandcharity.model.AchievementsData

fun AchievementsDomain.toPresentation(): AchievementsPresentation =
    AchievementsPresentation(id, title, description, photoUrl)