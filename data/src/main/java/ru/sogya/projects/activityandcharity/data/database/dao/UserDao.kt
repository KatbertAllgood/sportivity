package ru.sogya.projects.activityandcharity.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import ru.sogya.projects.activityandcharity.data.model.UserData

@Dao
interface UserDao {

    @Query("SELECT * FROM users")
    fun getUser(): Flow<UserData>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUser(userData: UserData): Long

    @Update
    suspend fun updateUser(userData: UserData): Int

    @Delete
    suspend fun deleteUser(userData: UserData): Int
}