package ru.sogya.projects.activityandcharity.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import ru.sogya.projects.activityandcharity.model.DepartmentData
@Dao
interface DepartmentDao {
    @Query("SELECT * FROM departments")
    fun getAllDepartments(): Flow<List<DepartmentData>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertDepartments(departments: List<DepartmentData>)

    @Update
    fun updateDepartments(departments: List<DepartmentData>): Int
}