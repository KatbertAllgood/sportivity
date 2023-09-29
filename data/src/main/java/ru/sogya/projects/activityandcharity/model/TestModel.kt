package ru.sogya.projects.activityandcharity.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TestModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null
)
