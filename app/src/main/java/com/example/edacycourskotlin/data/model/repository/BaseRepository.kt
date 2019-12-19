package com.example.edacycourskotlin.data.model.repository

import androidx.room.Dao

interface BaseRepository<Dao> {
    fun dao(): Dao

}