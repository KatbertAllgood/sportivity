package ru.sogya.projects.activityandcharity.domain.usecase.sharedpreferences

import ru.sogya.projects.activityandcharity.domain.repository.SharedPreferencesRepository

class GetDoublePrefsUseCase(private val repository: SharedPreferencesRepository) {
    fun invoke(key: String) = repository.getDoublePrefs(key)
}