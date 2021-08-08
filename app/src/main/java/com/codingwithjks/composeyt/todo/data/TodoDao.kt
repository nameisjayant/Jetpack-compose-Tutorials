package com.codingwithjks.composeyt.todo.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface TodoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(todo:Todo)

    @Query("SELECT * FROM todoTable")
    fun getAllTodos():Flow<List<Todo>>
}