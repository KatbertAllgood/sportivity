package ru.sogya.projects.activityandcharity.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import ru.sogya.projects.activityandcharity.data.model.ActivityData

@Dao
interface ActivityDao {

    @Query("SELECT * FROM activities")
    fun getAllActivities(): Flow<List<ActivityData>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertActivities(activities: List<ActivityData>)

    @Update
    fun updateActivities(activities: List<ActivityData>): Int
}