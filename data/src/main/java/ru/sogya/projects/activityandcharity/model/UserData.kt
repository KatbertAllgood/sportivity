package ru.sogya.projects.activityandcharity.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import ru.sogya.projects.activityandcharity.domain.model.UserDomain

@Entity(tableName = "users")
data class UserData(
    @PrimaryKey
    @SerializedName("id")
    override val id: Int,
    @SerializedName("name")
    override val name: String,
    @SerializedName("email")
    override val email: String,
    @SerializedName("achievementsId")
    override val achievementsId: Int,
    @SerializedName("departmentsId")
    override val departmentId: Int,
    @SerializedName("type")
    override val type: Int,
    @SerializedName("photoUrl")
    override val photoUrl: String? = "",
    @SerializedName("fundid")
    override val fundId: Int
) : UserDomain