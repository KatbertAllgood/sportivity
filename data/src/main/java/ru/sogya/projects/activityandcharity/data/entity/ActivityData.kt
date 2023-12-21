package ru.sogya.projects.activityandcharity.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.sogya.projects.activityandcharity.domain.entity.ActivityDomain

@Entity(tableName = "activities")
data class ActivityData(
    override val title: String,
    @PrimaryKey override val id: Int,
    override val valueType: Int
) : ActivityDomain
