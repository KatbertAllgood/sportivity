package ru.sogya.projects.activityandcharity.model

import androidx.room.Entity
import ru.sogya.projects.activityandcharity.domain.model.AchievementsDomain

@Entity(tableName = "achievements")
data class AchievementsData(
    override val id: Int,
    override val title: String,
    override val description: String,
    override val photoUrl: String
):AchievementsDomain