package ru.sogya.projects.activityandcharity.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import ru.sogya.projects.activityandcharity.model.AchievementsData

@Dao
interface AchievementsDao {
    @Query("SELECT * FROM achievements")
    fun getAchievments(): Flow<AchievementsData>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertActhievements(achievementsData: AchievementsData): Long

    @Update
    fun updateAchievements(achievementsData: AchievementsData): Int
}