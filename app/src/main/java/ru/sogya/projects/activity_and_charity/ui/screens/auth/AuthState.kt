package ru.sogya.projects.activity_and_charity.ui.screens.auth

sealed class AuthState<out R> {
    data object Success : AuthState<Nothing>()
    data class Failure(val message: String) : AuthState<Nothing>()

    companion object {
        fun success() = Success
        fun failed(message: String) = Failure(message)
    }
}