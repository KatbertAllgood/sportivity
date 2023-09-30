package ru.sogya.projects.activityandcharity.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.sogya.projects.activityandcharity.domain.model.UserDomain

@Entity(tableName = "users")
data class UserData(
    @PrimaryKey
    override val id: Int,
    override val name: String,
    override val email: String,
    override val departmentId: Int,
    override val type: Int,
    override val photoUrl: String,
    override val fundId: Int,
) : UserDomain