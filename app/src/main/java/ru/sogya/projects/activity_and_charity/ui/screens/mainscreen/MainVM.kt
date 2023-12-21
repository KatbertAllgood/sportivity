package ru.sogya.projects.activity_and_charity.ui.screens.mainscreen

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import ru.sogya.projects.activity_and_charity.mapper.toPresentation
import ru.sogya.projects.activity_and_charity.entity.ActivityPresentation
import ru.sogya.projects.activity_and_charity.entity.UserPresentation
import ru.sogya.projects.activity_and_charity.entity.UserStatisticPresentation
import ru.sogya.projects.activityandcharity.domain.usecase.database.user.GetUserUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.database.user_stat.GetUserStatisticUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.network.activity.GetAllActivitiesUseCase
import javax.inject.Inject

@HiltViewModel
class MainVM @Inject constructor(
    private val getUserByIdUseCase: GetUserUseCase,
    private val getAllActivitiesUseCase: GetAllActivitiesUseCase,
    private val getUserStatisticUseCase: GetUserStatisticUseCase
) : ViewModel() {
    private val activitiesLiveData = MutableLiveData<List<ActivityPresentation>>()
    private val userLiveDataMapper = MutableLiveData<UserPresentation>()
    private val userStatisticLiveData = MutableLiveData<UserStatisticPresentation>()

    fun test() {
        viewModelScope.launch {
            getUserByIdUseCase().flowOn(Dispatchers.IO).catch {
                Log.e("Error", it.message.toString())
            }.collect { userDomain ->
                userLiveDataMapper.postValue(userDomain.toPresentation())
                getUserStatisticUseCase().flowOn(Dispatchers.IO).catch {
                    Log.e("Error", it.message.toString())
                }.collect {
                    userStatisticLiveData.postValue(it.toPresentation())
                }
            }
            getAllActivitiesUseCase().flowOn(Dispatchers.IO).catch {
                Log.e("Error", it.message.toString())
            }.collect { activityDomains ->
                val list = activityDomains.map {
                   it.toPresentation()
                }
                activitiesLiveData.postValue(list)
            }
        }
    }
}