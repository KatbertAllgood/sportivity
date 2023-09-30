package ru.sogya.projects.activityandcharity.database.dao

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import ru.sogya.projects.activityandcharity.model.DepartmentData

interface DepartmentDao {
    @Query("SELECT * FROM departments")
    fun getAllDepartments(): Flow<List<DepartmentData>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertDepartments(activities: List<DepartmentData>)

    @Update
    fun updateDepartments(activities: List<DepartmentData>): Int
}