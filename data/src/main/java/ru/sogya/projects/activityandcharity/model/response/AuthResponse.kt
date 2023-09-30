package ru.sogya.projects.activityandcharity.model.response

import com.google.gson.annotations.SerializedName

data class AuthResponse(
    @SerializedName("auth_success")
    val authSuccess: Boolean
)