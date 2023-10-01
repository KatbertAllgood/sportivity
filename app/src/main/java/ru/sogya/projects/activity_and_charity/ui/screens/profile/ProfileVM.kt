package ru.sogya.projects.activity_and_charity.ui.screens.profile

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import ru.sogya.projects.activity_and_charity.mapper.UserDataMapper
import ru.sogya.projects.activity_and_charity.model.UserPresentation
import ru.sogya.projects.activityandcharity.domain.usecase.database.user.GetUserUseCase
import javax.inject.Inject

@HiltViewModel
class ProfileVM @Inject constructor(
    getUserUseCase: GetUserUseCase
) : ViewModel() {
    private val userLiveData = MutableLiveData<UserPresentation>()

    init {
        viewModelScope.launch {
            getUserUseCase().flowOn(Dispatchers.IO).catch {
                Log.e("Error", it.message.toString())
            }.collect {
                userLiveData.postValue(UserDataMapper(it).toData())
            }

        }
    }
}