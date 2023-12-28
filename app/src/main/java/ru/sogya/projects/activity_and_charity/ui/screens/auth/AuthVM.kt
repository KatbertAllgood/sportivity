package ru.sogya.projects.activity_and_charity.ui.screens.auth

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import ru.sogya.projects.activityandcharity.domain.usecase.database.user.InsertUserUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.firebase.auth.SignInUseCase
import javax.inject.Inject

@HiltViewModel
class AuthVM @Inject constructor(
    private val signInUseCase: SignInUseCase,
    private val insertUserUseCase: InsertUserUseCase,
) : ViewModel() {
    fun checkIsUserExist(email: String) {

    }
}