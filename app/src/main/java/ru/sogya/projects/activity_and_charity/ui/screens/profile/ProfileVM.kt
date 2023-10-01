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
import ru.sogya.projects.activity_and_charity.mapper.AchievementsDataMapper
import ru.sogya.projects.activity_and_charity.mapper.DepartmentsDataMapper
import ru.sogya.projects.activity_and_charity.mapper.FundDataMapper
import ru.sogya.projects.activity_and_charity.mapper.UserDataMapper
import ru.sogya.projects.activity_and_charity.mapper.UserStatisticDataMapper
import ru.sogya.projects.activity_and_charity.model.AchievementsPresentation
import ru.sogya.projects.activity_and_charity.model.DepartmentPresentation
import ru.sogya.projects.activity_and_charity.model.FundPresentation
import ru.sogya.projects.activity_and_charity.model.UserPresentation
import ru.sogya.projects.activity_and_charity.model.UserStatisticPresentation
import ru.sogya.projects.activityandcharity.domain.usecase.database.achievements.GetAchievementsUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.database.fund.DeleteFundUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.database.fund.GetFundUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.database.user.DeleteUserUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.database.user.GetUserUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.database.user_stat.DeleteUserStatisticUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.database.user_stat.GetUserStatisticUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.network.departments.GetAllDepartmentsUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.network.fund.GetAllFundUseCase
import ru.sogya.projects.activityandcharity.domain.usecase.sharedpreferences.UpdatePrefsUseCase
import ru.sogya.projects.activityandcharity.util.Constants
import javax.inject.Inject

@HiltViewModel
class ProfileVM @Inject constructor(
    getUserUseCase: GetUserUseCase,
    getAchievementById: GetAchievementsUseCase,
    getFundById: GetFundUseCase,
    getUserStatisticUseCase: GetUserStatisticUseCase,
    private val deleteUserUseCase: DeleteUserUseCase,
    private val deleteFundUseCase: DeleteFundUseCase,
    private val deleteUserStatisticUseCase: DeleteUserStatisticUseCase,
    private val deleteAchievementsUseCase: GetAchievementsUseCase,
    private val getAllDepartmentsUseCase: GetAllDepartmentsUseCase,
    private val getAllFundUseCase: GetAllFundUseCase,
    private val updatePrefsUseCase: UpdatePrefsUseCase
) : ViewModel() {
    private val userLiveData = MutableLiveData<UserPresentation>()
    private val achivLiveData = MutableLiveData<AchievementsPresentation>()
    private val fundLiveData = MutableLiveData<FundPresentation>()
    private val statLiveData = MutableLiveData<UserStatisticPresentation>()
    private val fundsLiveData = MutableLiveData<List<FundPresentation>>()
    private val departmentsLiveData = MutableLiveData<List<DepartmentPresentation>>()
    private var user: UserPresentation? = null
    private var achiv: AchievementsPresentation? = null
    private var fund: FundPresentation? = null
    private var stat: UserStatisticPresentation? = null

    init {
        viewModelScope.launch(Dispatchers.IO) {
            getUserUseCase().catch {
                Log.e("Error", it.message.toString())
            }.collect {
                user = UserDataMapper(it).toData()
                userLiveData.postValue(UserDataMapper(it).toData())
            }
            getAchievementById().catch {
                Log.e("Error", it.message.toString())
            }.collect {
                achiv = AchievementsDataMapper(it).toData()
                achivLiveData.postValue(AchievementsDataMapper(it).toData())
            }
            getFundById().catch {
                Log.e("Error", it.message.toString())
            }.collect {
                fund = FundDataMapper(it).toData()
                fundLiveData.postValue(FundDataMapper(it).toData())
            }
            getUserStatisticUseCase().catch {
                Log.e("Error", it.message.toString())
            }.collect {
                stat = UserStatisticDataMapper(it).toData()
                statLiveData.postValue(UserStatisticDataMapper(it).toData())
            }
        }
    }

    fun getAllDepartments() {
        viewModelScope.launch {
            getAllDepartmentsUseCase().flowOn(Dispatchers.IO).catch {
                Log.e("Error", it.message.toString())
            }.collect { departmentDomains ->
                val departments = departmentDomains.map {
                    DepartmentsDataMapper(it).toData()
                }
                departmentsLiveData.postValue(departments)
            }
        }
    }

    fun getAllFund() {
        viewModelScope.launch {
            getAllFundUseCase().flowOn(Dispatchers.IO).catch {
                Log.e("Error", it.message.toString())
            }.collect { fundDomains ->
                val funds = fundDomains.map {
                    FundDataMapper(it).toData()
                }
                fundsLiveData.postValue(funds)
            }
        }
    }

    fun logOut() {
        if (achiv != null && user != null && stat != null && fund != null) {
            deleteAchievementsUseCase()
            deleteFundUseCase(fund!!)
            deleteUserUseCase(user!!)
            deleteUserStatisticUseCase(stat!!)
            updatePrefsUseCase(Constants.IS_AUTH, false)
        }
    }
}