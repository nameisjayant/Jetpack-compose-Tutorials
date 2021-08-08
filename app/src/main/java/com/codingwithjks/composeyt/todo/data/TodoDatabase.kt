package com.codingwithjks.composeyt.todo.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Todo::class],version = 1,exportSchema = false)
abstract class TodoDatabase : RoomDatabase(){

    abstract fun getDao():TodoDao
}