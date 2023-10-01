package ru.sogya.projects.activity_and_charity.ui.screens.registration

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import ru.sogya.projects.activityandcharity.domain.usecase.database.user.InsertUserUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.network.auth.CreateUserUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.sharedpreferences.UpdatePrefsUseCase
import ru.sogya.projects.activityandcharity.util.Constants
import javax.inject.Inject

@HiltViewModel
class RegistrationVM @Inject constructor(
    private val createUserUseCase: CreateUserUseCase,
    private val insertUserUseCase: InsertUserUseCase,
    private val updatePrefsUseCase: UpdatePrefsUseCase
) : ViewModel() {
    private val resultLiveData = MutableLiveData<Long>()
    fun createUser(name: String, email: String, department: Int, type: Int, password: String) {
        viewModelScope.launch {
            createUserUseCase(email, department, name, type, password).flowOn(Dispatchers.IO)
                .catch {
                    Log.e("Error", it.message.toString())
                }.collect {
                    val result = insertUserUseCase(it)
                    resultLiveData.postValue(result)
                    updatePrefsUseCase(Constants.IS_AUTH, true)
                }
        }
    }
}