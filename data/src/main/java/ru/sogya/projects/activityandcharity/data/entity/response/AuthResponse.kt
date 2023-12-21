package ru.sogya.projects.activityandcharity.data.entity.response

import com.google.gson.annotations.SerializedName

data class AuthResponse(
    @SerializedName("auth_success")
    val authSuccess: Boolean
)