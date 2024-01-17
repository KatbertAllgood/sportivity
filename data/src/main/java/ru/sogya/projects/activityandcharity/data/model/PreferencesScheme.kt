package ru.sogya.projects.activityandcharity.data.model

import androidx.datastore.preferences.core.booleanPreferencesKey

object PreferencesScheme {
    val IS_USER_LOGIN = booleanPreferencesKey("is_login")
}