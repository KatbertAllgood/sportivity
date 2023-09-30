package ru.sogya.projects.activityandcharity.database

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.sogya.projects.activityandcharity.database.dao.ActivityDao
import ru.sogya.projects.activityandcharity.database.dao.ActivityStatisticDao
import ru.sogya.projects.activityandcharity.database.dao.UserDao
import ru.sogya.projects.activityandcharity.database.dao.UserStatisticDao
import ru.sogya.projects.activityandcharity.model.UserData

@Database(
    entities = [UserData::class], version = 1
)
abstract class LocalDataBase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun activityDao(): ActivityDao
    abstract fun userStatisticDao(): UserStatisticDao
    abstract fun activityStatisticDao(): ActivityStatisticDao
}