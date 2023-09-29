package ru.sogya.projects.activityandcharity.repository

import android.content.Context
import android.content.SharedPreferences
import ru.sogya.projects.activityandcharity.domain.repository.SharedPreferencesRepository

class SharedPreferencesRepositoryImpl(private val context: Context) : SharedPreferencesRepository {
    private val appPrefs: SharedPreferences
        get() = context
            .getSharedPreferences(APP_PREFS_NAME, Context.MODE_PRIVATE)

    private val prefsEditor: SharedPreferences.Editor
        get() = context
            .getSharedPreferences(APP_PREFS_NAME, Context.MODE_PRIVATE).edit()

    private fun updatePrefs(key: String, valueStr: String) {
        prefsEditor.putString(key, valueStr).apply()
    }

    override fun updatePrefs(key: String, valueAny: Any) {
        when (valueAny) {
            is String -> {
                updatePrefs(key, valueAny)
            }
            is Long -> {
                updatePrefs(key, valueAny)
            }
            is Int -> {
                updatePrefs(key, valueAny)
            }
            is Double -> {
                updatePrefs(key, valueAny)
            }
            is Float -> {
                updatePrefs(key, valueAny)
            }
            is Boolean -> {
                updatePrefs(key, valueAny)
            }
        }
    }

    private fun updatePrefs(key: String, valueBol: Boolean) {
        prefsEditor.putBoolean(key, valueBol).apply()
    }

    private fun updatePrefs(key: String, valueFloat: Float) {
        prefsEditor.putFloat(key, valueFloat).apply()
    }

    private fun updatePrefs(key: String, valueInt: Int) {
        prefsEditor.putInt(key, valueInt).apply()
    }

    private fun updatePrefs(key: String, valueLong: Long) {
        prefsEditor.putLong(key, valueLong).apply()
    }

//    fun updatePrefs(key: String, stringList: List<String>) {
//        prefsEditor.putStringSet(key, HashSet(stringList)).apply()
//    }

    private fun updatePrefs(key: String, value: Double) {
        prefsEditor.putLong(key, java.lang.Double.doubleToRawLongBits(value)).apply()
    }

    override fun getStringPrefs(strName: String): String {
        return appPrefs.getString(strName, "").toString()
    }

    override fun getBoolPrefs(strName: String): Boolean {
        return appPrefs.getBoolean(strName, false)
    }


    override fun getIntPrefs(strName: String): Int {
        return appPrefs.getInt(strName, 0)
    }

    override fun getLongPrefs(strName: String): Long {
        return appPrefs.getLong(strName, 0)
    }

//    fun getStringListPrefs(key: String): List<String> {
//        val stringSet: MutableSet<String>? = appPrefs.getStringSet(key, HashSet())
//        return ArrayList(stringSet) ?: ArrayList()
//    }

    override fun getDoublePrefs(key: String): Double {
        return java.lang.Double.longBitsToDouble(
            appPrefs.getLong(
                key,
                java.lang.Double.doubleToLongBits(0.0)
            )
        )
    }

    companion object {
        private const val APP_PREFS_NAME = "appPrefsName"
    }
}