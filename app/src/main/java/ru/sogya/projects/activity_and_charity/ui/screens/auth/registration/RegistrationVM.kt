package ru.sogya.projects.activity_and_charity.ui.screens.auth.registration

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import ru.sogya.projects.activity_and_charity.ui.screens.auth.AuthState
import ru.sogya.projects.activityandcharity.domain.usecase.firebase.auth.SignUpUseCase
import ru.sogya.projects.activityandcharity.domain.utils.State
import javax.inject.Inject

@HiltViewModel
class RegistrationVM @Inject constructor(private val signUpUseCase: SignUpUseCase) : ViewModel() {
    private val authState = MutableStateFlow<AuthState<Unit>?>(null)
    private val loadingState = MutableStateFlow(false)

    fun signUp(name: String, email: String, password: String) {
        viewModelScope.launch {
            signUpUseCase(name, email, password).collect {
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