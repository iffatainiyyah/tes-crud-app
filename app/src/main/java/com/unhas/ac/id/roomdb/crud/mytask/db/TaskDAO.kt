package com.unhas.ac.id.roomdb.crud.mytask.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface TaskDAO {

    @Insert
    suspend fun insertTask(task: Task): Long

    @Update
    suspend fun updateTask(task: Task): Int

    @Delete
    suspend fun deleteTask(task: Task): Int

    @Query(value = "delete from task_table")
    suspend fun deleteAll(): Int

    @Query(value = "select * from task_table")
    fun getAllTask(): LiveData<List<Task>>
}