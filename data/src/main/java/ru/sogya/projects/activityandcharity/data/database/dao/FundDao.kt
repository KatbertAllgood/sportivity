package ru.sogya.projects.activityandcharity.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import ru.sogya.projects.activityandcharity.data.entity.FundData

@Dao
interface FundDao {
    @Query("SELECT * FROM current_fund")
    fun getFund(): Flow<FundData>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertFund(fundData: FundData): Long

    @Update
    fun updateFund(fundData: FundData): Int

    @Delete
    fun deleteFund(fundData: FundData): Int
}