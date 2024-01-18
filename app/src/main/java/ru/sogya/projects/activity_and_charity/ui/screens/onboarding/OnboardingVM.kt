package ru.sogya.projects.activity_and_charity.ui.screens.onboarding

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import ru.sogya.projects.activityandcharity.domain.usecase.firebase.auth.CheckUserAuthStatusUseCase
import ru.sogya.projects.activityandcharity.domain.utils.State
import javax.inject.Inject

@HiltViewModel
class OnboardingVM @Inject constructor(checkUserAuthStatusUseCase: CheckUserAuthStatusUseCase) :
    ViewModel() {
    private val isUserLoginState = MutableStateFlow<State<Unit>>(State.loading())

    init {
        viewModelScope.launch {
            checkUserAuthStatusUseCase().collect {
                isUserLoginState.emit(it)
            }
        }
    }

    val isUserLoginStateFlow: StateFlow<State<Unit>> = isUserLoginState
}