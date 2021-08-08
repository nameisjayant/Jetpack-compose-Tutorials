package com.codingwithjks.composeyt.todo.data.di

import android.app.Application
import androidx.room.Room
import com.codingwithjks.composeyt.todo.data.TodoDao
import com.codingwithjks.composeyt.todo.data.TodoDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun providesDatabase(application:Application):TodoDatabase =
        Room.databaseBuilder(application,TodoDatabase::class.java,"TodoDatabase")
            .fallbackToDestructiveMigration()
            .build()

    @Provides
    @Singleton
    fun providesDao(db:TodoDatabase):TodoDao = db.getDao()
}