package ru.sogya.projects.activityandcharity.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import ru.sogya.projects.activityandcharity.domain.model.UserDomain

@Entity(tableName = "users")
data class UserData(
    @PrimaryKey
    @SerializedName("id")
    override val id: String,
    @SerializedName("name")
    override val name: String,
    @SerializedName("email")
    override val email: String,
    @SerializedName("photoUrl")
    override val photoUrl: String? = "",
    override val tag: String,
) : UserDomain