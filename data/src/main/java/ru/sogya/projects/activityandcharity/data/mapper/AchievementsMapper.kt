package ru.sogya.projects.activityandcharity.data.mapper

import ru.sogya.projects.activityandcharity.data.model.AchievementsData
import ru.sogya.projects.activityandcharity.domain.model.AchievementsDomain

fun AchievementsDomain.toData(): AchievementsData =
    AchievementsData(id, title, description, photoUrl)