package com.example.edacycourskotlin.data.model.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update

interface BaseDao <T> {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(model:T)

    @Update
    fun update (model: T)

    @Delete
    fun delete (model: T)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun inserAll(models: List<T>)
}