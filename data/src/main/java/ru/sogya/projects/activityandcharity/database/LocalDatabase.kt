package ru.sogya.projects.activityandcharity.database

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.sogya.projects.activityandcharity.database.dao.ActivityDao
import ru.sogya.projects.activityandcharity.database.dao.ActivityStatisticDao
import ru.sogya.projects.activityandcharity.database.dao.DepartmentDao
import ru.sogya.projects.activityandcharity.database.dao.FundDao
import ru.sogya.projects.activityandcharity.database.dao.UserDao
import ru.sogya.projects.activityandcharity.database.dao.UserStatisticDao
import ru.sogya.projects.activityandcharity.model.ActivityData
import ru.sogya.projects.activityandcharity.model.ActivityStatisticData
import ru.sogya.projects.activityandcharity.model.DepartmentData
import ru.sogya.projects.activityandcharity.model.FundData
import ru.sogya.projects.activityandcharity.model.UserData
import ru.sogya.projects.activityandcharity.model.UserStatisticData

@Database(
    entities = [
        UserData::class,
        ActivityData::class,
        ActivityStatisticData::class,
        DepartmentData::class,
        FundData::class,
        UserStatisticData::class], version = 1
)
abstract class LocalDataBase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun activityDao(): ActivityDao
    abstract fun userStatisticDao(): UserStatisticDao
    abstract fun activityStatisticDao(): ActivityStatisticDao
    abstract fun departmentDao(): DepartmentDao
    abstract fun fundDao(): FundDao
}