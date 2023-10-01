package ru.sogya.projects.activity_and_charity.ui.screens.mainscreen

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import ru.sogya.projects.activityandcharity.domain.usecase.network.auth.CreateUserUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.network.user.GetUserByIdUseCase
import javax.inject.Inject

@HiltViewModel
class MainVM @Inject constructor(
    private val getUserByIdUseCase: GetUserByIdUseCase,
    private val createUserUseCase: CreateUserUseCase
) : ViewModel() {

    fun test() {
        viewModelScope.launch {
            getUserByIdUseCase(1).flowOn(Dispatchers.IO).catch {
                Log.e("Error", it.message.toString())
            }.collect {
                Log.d("Result", it.toString())
            }
        }
    }
}