package ru.sogya.projects.activityandcharity.data.datastore

import androidx.datastore.preferences.core.MutablePreferences
import androidx.datastore.preferences.core.Preferences
import kotlinx.coroutines.flow.Flow

interface AppDataStore {
    val data: Flow<Preferences>
    suspend fun edit(transform: suspend (Preferences) -> Preferences)
}

suspend fun AppDataStore.commit(transform: MutablePreferences.() -> Unit) {
    edit { prefs ->
        prefs.toMutablePreferences().apply(transform)
    }
}