package ru.sogya.projects.activityandcharity.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.sogya.projects.activityandcharity.data.database.dao.AchievementsDao
import ru.sogya.projects.activityandcharity.data.database.dao.ActivityDao
import ru.sogya.projects.activityandcharity.data.database.dao.ActivityStatisticDao
import ru.sogya.projects.activityandcharity.data.database.dao.FundDao
import ru.sogya.projects.activityandcharity.data.database.dao.UserDao
import ru.sogya.projects.activityandcharity.data.database.dao.UserStatisticDao
import ru.sogya.projects.activityandcharity.data.entity.AchievementsData
import ru.sogya.projects.activityandcharity.data.entity.ActivityData
import ru.sogya.projects.activityandcharity.data.entity.ActivityStatisticData
import ru.sogya.projects.activityandcharity.data.entity.FundData
import ru.sogya.projects.activityandcharity.data.entity.UserData
import ru.sogya.projects.activityandcharity.data.entity.UserStatisticData

@Database(
    entities = [
        UserData::class,
        ActivityData::class,
        ActivityStatisticData::class,
        FundData::class,
        UserStatisticData::class,
        AchievementsData::class], version = 1
)
abstract class LocalDataBase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun activityDao(): ActivityDao
    abstract fun userStatisticDao(): UserStatisticDao
    abstract fun activityStatisticDao(): ActivityStatisticDao
    abstract fun fundDao(): FundDao
    abstract fun achievementsDao(): AchievementsDao
}