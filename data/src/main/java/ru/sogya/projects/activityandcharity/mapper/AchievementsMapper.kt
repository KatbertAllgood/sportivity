package ru.sogya.projects.activityandcharity.mapper

import ru.sogya.projects.activityandcharity.domain.model.AchievementsDomain
import ru.sogya.projects.activityandcharity.model.AchievementsData

fun AchievementsDomain.toData(): AchievementsData =
    AchievementsData(id, title, description, photoUrl)