package ru.sogya.projects.activityandcharity.domain.usecase.sharedpreferences

import ru.sogya.projects.activityandcharity.domain.repository.SharedPreferencesRepository

class GetStringPrefsUseCase(private val repository: SharedPreferencesRepository) {
    operator fun invoke(key: String) = repository.getStringPrefs(key)
}