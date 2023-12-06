package ru.sogya.projects.activity_and_charity.ui.screens.auth

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import ru.sogya.projects.activityandcharity.domain.usecase.database.user.InsertUserUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.firebase.auth.SignInUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.network.auth.LoginUserUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.sharedpreferences.UpdatePrefsUseCase
import ru.sogya.projects.activityandcharity.domain.utils.Constants
import javax.inject.Inject

@HiltViewModel
class AuthVM @Inject constructor(
    private val signInUseCase: SignInUseCase,
    private val insertUserUseCase: InsertUserUseCase,
    private val updatePrefsUseCase: UpdatePrefsUseCase
) : ViewModel() {
    private val resultLiveData = MutableLiveData<Long>()

    fun login(email: String, password: String) {
        viewModelScope.launch {
            signInUseCase("email","password").collect{

            }
        }
    }
}