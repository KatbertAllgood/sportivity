package ru.sogya.projects.activityandcharity.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.sogya.projects.activityandcharity.domain.model.ActivityStatisticDomain

@Entity(tableName = "activity_statistic")
data class ActivityStatisticData(
    @PrimaryKey
    override val userId: Int,
    override val activityId: Int,
    override val money: Int,
    override val progress: Int
) : ActivityStatisticDomain