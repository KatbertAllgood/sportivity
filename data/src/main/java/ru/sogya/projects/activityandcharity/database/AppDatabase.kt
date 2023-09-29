package ru.sogya.projects.activityandcharity.database

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.sogya.projects.activityandcharity.model.TestModel

@Database(
    entities = [
        TestModel::class
               ],
    version = 1
)
abstract class LocalDataBase : RoomDatabase() {
}