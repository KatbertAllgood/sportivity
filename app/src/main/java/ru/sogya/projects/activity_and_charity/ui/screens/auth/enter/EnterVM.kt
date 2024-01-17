package ru.sogya.projects.activity_and_charity.ui.screens.auth.enter

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import ru.sogya.projects.activityandcharity.domain.usecase.database.user.InsertUserUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.firebase.auth.SignInUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.firebase.user.CheckUserExistUseCase
import ru.sogya.projects.activityandcharity.domain.utils.State
import javax.inject.Inject

@HiltViewModel
class EnterVM @Inject constructor(
    private val signInUseCase: SignInUseCase,
    private val insertUserUseCase: InsertUserUseCase,
    private val checkUserExistUseCase: CheckUserExistUseCase
) : ViewModel() {

    private val loadingState = MutableStateFlow(value = false)
    private val enterState = MutableStateFlow<EnterState?>(null)

    fun checkIsUserExist(email: String) {
        viewModelScope.launch {
            checkUserExistUseCase(email).collect {
                when (it) {
                    is State.Loading -> loadingState.emit(true)
                    is State.Failed -> {
                        loadingState.emit(false)
                        enterState.emit(value = EnterState.ToRegistration)
                    }

                    is State.Success -> {
                        loadingState.emit(false)
                        enterState.emit(value = EnterState.ToSignIn)
                    }
                }
            }
        }
    }

    val getLoadingStateFlow: StateFlow<Boolean> = loadingState
    val getEnterStateFlow: StateFlow<EnterState?> = enterState
}