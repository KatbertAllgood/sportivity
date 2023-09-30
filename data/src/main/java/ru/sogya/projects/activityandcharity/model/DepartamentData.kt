package ru.sogya.projects.activityandcharity.model

import androidx.room.Entity
import ru.sogya.projects.activityandcharity.domain.model.DepartmentDomain

@Entity(tableName = "departments")
data class DepartamentData(override val id: Int, override val title: String) : DepartmentDomain
