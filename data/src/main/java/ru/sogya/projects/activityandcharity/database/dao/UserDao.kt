package ru.sogya.projects.activityandcharity.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import ru.sogya.projects.activityandcharity.model.UserData

@Dao
interface UserDao {

    @Query("SELECT * FROM users")
    fun getUser(): Flow<UserData>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(userData: UserData): Long

    @Update
    fun updateUser(userData: UserData): Int

    @Delete
    fun deleteUser(userData: UserData): Int
}