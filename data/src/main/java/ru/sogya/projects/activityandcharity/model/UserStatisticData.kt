package ru.sogya.projects.activityandcharity.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.sogya.projects.activityandcharity.domain.model.UserStatisticDomain

@Entity(tableName = "user_statistic")
data class UserStatisticData(
    @PrimaryKey
    override val userId: Int,
    override val money: Int,
    override val achievementsProgress: Int,
    override val ratingPosition: Int
) : UserStatisticDomain
