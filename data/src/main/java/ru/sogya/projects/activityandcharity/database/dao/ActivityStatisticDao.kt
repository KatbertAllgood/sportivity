package ru.sogya.projects.activityandcharity.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import ru.sogya.projects.activityandcharity.model.ActivityStatisticData

@Dao
interface ActivityStatisticDao {
    @Query("SELECT * FROM activity_statistic")
    fun getActivitytatistic(): Flow<ActivityStatisticData>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertActivityStatistic(activityStatisticData: ActivityStatisticData): Long

    @Update
    fun updateActivityStatistic(activityStatisticData: ActivityStatisticData): Int

    @Delete
    fun deleteActivityStatistic(activityStatisticData: ActivityStatisticData): Int
}