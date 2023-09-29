package ru.sogya.projects.activityandcharity.domain.repository

interface SharedPreferencesRepository {
    fun updatePrefs(key: String, valueAny: Any)

    fun getStringPrefs(strName: String): String

    fun getBoolPrefs(strName: String): Boolean

    fun getIntPrefs(strName: String): Int

    fun getLongPrefs(strName: String): Long

    fun getDoublePrefs(key: String): Double
}