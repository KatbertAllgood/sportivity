package ru.sogya.projects.activityandcharity.domain.usecase.sharedpreferences

import ru.sogya.projects.activityandcharity.domain.repository.SharedPreferencesRepository

class UpdatePrefsUseCase(private val repository: SharedPreferencesRepository) {

    operator fun invoke(key: String, value: Any) = repository.updatePrefs(key, value)
}