package ru.sogya.projects.activity_and_charity.ui.screens.registration

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import ru.sogya.projects.activityandcharity.domain.usecase.database.user.InsertUserUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.firebase.auth.SignUpUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.network.auth.CreateUserUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.sharedpreferences.UpdatePrefsUseCase
import ru.sogya.projects.activityandcharity.domain.utils.Constants
import javax.inject.Inject

@HiltViewModel
class RegistrationVM @Inject constructor(
    private val signUpUseCase: SignUpUseCase,
    private val createUserUseCase: CreateUserUseCase,
    private val insertUserUseCase: InsertUserUseCase,
    private val updatePrefsUseCase: UpdatePrefsUseCase
) : ViewModel() {
    val resultLiveData = MutableLiveData<Long>()
    fun createUser(name: String, email: String, department: Int, type: Int, password: String) {
        viewModelScope.launch {
            signUpUseCase(name, email, password).collect {

            }
        }
    }

    fun updateUserId(id: Long) {
        updatePrefsUseCase(Constants.USER_ID, id)
    }
}