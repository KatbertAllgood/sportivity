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
import ru.sogya.projects.activity_and_charity.mapper.toPresentation
import ru.sogya.projects.activity_and_charity.entity.AchievementsPresentation
import ru.sogya.projects.activity_and_charity.entity.FundPresentation
import ru.sogya.projects.activity_and_charity.entity.UserPresentation
import ru.sogya.projects.activity_and_charity.entity.UserStatisticPresentation
import ru.sogya.projects.activityandcharity.domain.usecase.database.achievements.GetAchievementsUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.database.fund.GetFundUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.database.user.GetUserUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.database.user_stat.GetUserStatisticUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.network.fund.GetAllFundUseCase
import javax.inject.Inject

@HiltViewModel
class ProfileVM @Inject constructor(
    getUserUseCase: GetUserUseCase,
    getAchievementById: GetAchievementsUseCase,
    getFundById: GetFundUseCase,
    getUserStatisticUseCase: GetUserStatisticUseCase,
    private val getAllFundUseCase: GetAllFundUseCase,
) : ViewModel() {
    private val userLiveData = MutableLiveData<UserPresentation>()
    private val achivLiveData = MutableLiveData<AchievementsPresentation>()
    private val fundLiveData = MutableLiveData<FundPresentation>()
    private val statLiveData = MutableLiveData<UserStatisticPresentation>()
    private val fundsLiveData = MutableLiveData<List<FundPresentation>>()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            getUserUseCase().catch {
                Log.e("Error", it.message.toString())
            }.collect {
                userLiveData.postValue(it.toPresentation())
            }
            getAchievementById().catch {
                Log.e("Error", it.message.toString())
            }.collect {
                achivLiveData.postValue(it.toPresentation())
            }
            getFundById().catch {
                Log.e("Error", it.message.toString())
            }.collect {
                fundLiveData.postValue(it.toPresentation())
            }
            getUserStatisticUseCase().catch {
                Log.e("Error", it.message.toString())
            }.collect {
                statLiveData.postValue(it.toPresentation())
            }
        }
    }

    fun getAllFund() {
        viewModelScope.launch {
            getAllFundUseCase().flowOn(Dispatchers.IO).catch {
                Log.e("Error", it.message.toString())
            }.collect { fundDomains ->
                val funds = fundDomains.map {
                   it.toPresentation()
                }
                fundsLiveData.postValue(funds)
            }
        }
    }
}