package ru.sogya.projects.activityandcharity.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import ru.sogya.projects.activityandcharity.data.model.UserStatisticData

@Dao
interface UserStatisticDao {
    @Query("SELECT * FROM user_statistic")
    fun getUserStatistic(): Flow<UserStatisticData>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUserStatistic(userStatisticData: UserStatisticData): Long

    @Update
    fun updateUserStatistic(userStatisticData: UserStatisticData): Int

    @Delete
    fun deleteUserStatistic(userStatisticData: UserStatisticData): Int
}