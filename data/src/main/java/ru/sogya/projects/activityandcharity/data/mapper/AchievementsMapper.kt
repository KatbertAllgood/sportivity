package ru.sogya.projects.activityandcharity.data.mapper

import ru.sogya.projects.activityandcharity.data.entity.AchievementsData
import ru.sogya.projects.activityandcharity.domain.entity.AchievementsDomain

fun AchievementsDomain.toData(): AchievementsData =
    AchievementsData(id, title, description, photoUrl)