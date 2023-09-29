package ru.sogya.projects.activityandcharity.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [],
    version = 1
)
abstract class LocalDataBase : RoomDatabase() {
}