package ru.sogya.projects.activityandcharity.data.datastore

import android.content.Context
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler
import androidx.datastore.preferences.core.PreferenceDataStoreFactory
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.preferencesOf
import androidx.datastore.preferences.preferencesDataStoreFile
import kotlinx.coroutines.flow.Flow

class AppDataStoreImpl(private val context: Context) : AppDataStore {

    private val dataStore by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        PreferenceDataStoreFactory.create(
            corruptionHandler = ReplaceFileCorruptionHandler {
                preferencesOf()
            }
        ) {
            context.preferencesDataStoreFile(APP_PREFS_NAME)
        }
    }
    override val data: Flow<Preferences> = dataStore.data

    override suspend fun edit(transform: suspend (Preferences) -> Preferences) {
        dataStore.updateData(transform)
    }

    companion object {
        private const val APP_PREFS_NAME = "appPrefsName"
    }
}