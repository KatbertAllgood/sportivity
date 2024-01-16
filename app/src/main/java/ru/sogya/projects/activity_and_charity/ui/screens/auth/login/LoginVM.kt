package ru.sogya.projects.activity_and_charity.ui.screens.auth.login

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import ru.sogya.projects.activity_and_charity.ui.screens.auth.AuthState
import ru.sogya.projects.activityandcharity.domain.usecase.firebase.auth.SignInUseCase
import ru.sogya.projects.activityandcharity.domain.utils.State
import javax.inject.Inject

@HiltViewModel
class LoginVM @Inject constructor(private val signInUseCase: SignInUseCase) : ViewModel() {
    private val authState = MutableStateFlow<AuthState<Unit>?>(null)
    private val loadingState = MutableStateFlow(value = false)
    fun signIn(email: String, password: String) {
        viewModelScope.launch {
            signInUseCase(email, password).collect {
                when (it) {
                    is State.Loading -> loadingState.emit(true)
                    is State.Failed -> {
                        loadingState.emit(false)
                        authState.emit(AuthState.failed(it.message.toString()))
                    }

                    is State.Success -> {
                        loadingState.emit(false)
                        authState.emit(AuthState.success())
                    }
                }
            }
        }
    }

    val getAuthStateFlow: StateFlow<AuthState<Unit>?> = authState
    val getLoadingStateFlow: StateFlow<Boolean> = loadingState
}