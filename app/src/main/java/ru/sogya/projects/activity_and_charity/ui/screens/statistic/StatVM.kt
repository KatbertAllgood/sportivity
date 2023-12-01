package ru.sogya.projects.activity_and_charity.ui.screens.statistic

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import ru.sogya.projects.activity_and_charity.mapper.toPresentation
import ru.sogya.projects.activity_and_charity.model.ActivityStatisticPresentation
import ru.sogya.projects.activity_and_charity.model.UserStatisticPresentation
import ru.sogya.projects.activityandcharity.domain.usecase.database.user_stat.GetUserStatisticUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.network.activitystat.GetActivityStatisticByIdUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.network.rating.GetUserRatingUseCase
import javax.inject.Inject

@HiltViewModel
class StatVM @Inject constructor(
    getUserStatisticUseCase: GetUserStatisticUseCase,
    getUserRatingUseCase: GetUserRatingUseCase,
    getActivityStatisticUseCase: GetActivityStatisticByIdUseCase
) : ViewModel() {
    private val statLiveData = MutableLiveData<UserStatisticPresentation>()
    private val ratingLivaData = MutableLiveData<List<UserStatisticPresentation>>()
    private val activityStatistic = MutableLiveData<List<ActivityStatisticPresentation>>()
    private var userId: Int? = null

    init {
        viewModelScope.launch(Dispatchers.IO) {
            getUserRatingUseCase().catch {
                Log.e("Error", it.message.toString())
            }.collect { userStatisticDomains ->
                ratingLivaData.postValue(userStatisticDomains.toPresentation())
            }
            getUserStatisticUseCase().catch {
                Log.e("Error", it.message.toString())
            }.collect {
                val stat = it.toPresentation()
                userId = stat.userId
                statLiveData.postValue(stat)
            }
            getActivityStatisticUseCase(userId!!).catch {
                Log.e("Error", it.message.toString())
            }.collect {
                val activityStat = it.toPresentation()
                activityStatistic.postValue(activityStat)
            }
        }
    }
}