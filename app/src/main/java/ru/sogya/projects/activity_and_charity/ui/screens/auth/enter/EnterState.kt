package ru.sogya.projects.activity_and_charity.ui.screens.auth.enter

sealed class EnterState {
    data object ToSignIn : EnterState()
    data object ToRegistration : EnterState()
}
