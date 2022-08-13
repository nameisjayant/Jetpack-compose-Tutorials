package com.codingwithjks.composeyt.todo

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.codingwithjks.composeyt.todo.data.TodoDao
import com.codingwithjks.composeyt.todo.data.TodoDatabase
import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.test.runTest
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TodoDatabaseTest {

    private lateinit var db:TodoDatabase
    private lateinit var dao:TodoDao

    @Before
    fun setUp(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(context,TodoDatabase::class.java)
            .allowMainThreadQueries()
            .build()
        dao = db.getDao()
    }

    @After
    fun tearDown(){
        db.close()
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun insertTodoTest() = runTest{
        val todo = FakeDataTest.todo
        dao.insert(todo)
        dao.getAllTodos().onEach {
            assertThat(it).isEqualTo(todo)
        }
    }

}