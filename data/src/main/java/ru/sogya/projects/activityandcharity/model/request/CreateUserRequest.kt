package ru.sogya.projects.activityandcharity.model.request

import com.google.gson.annotations.SerializedName

data class CreateUserRequest(
    @SerializedName("name")
    val name: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("type")
    val type: Int,
    @SerializedName("password")
    val password: String
)