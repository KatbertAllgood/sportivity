package ru.sogya.projects.activityandcharity.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.sogya.projects.activityandcharity.domain.entity.AchievementsDomain

@Entity(tableName = "achievements")
data class AchievementsData(
    @PrimaryKey
    override val id: Int,
    override val title: String,
    override val description: String,
    override val photoUrl: String
) : AchievementsDomain