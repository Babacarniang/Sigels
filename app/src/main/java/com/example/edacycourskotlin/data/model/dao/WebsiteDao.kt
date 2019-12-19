package com.example.edacycourskotlin.data.model.dao

import android.provider.ContactsContract
import androidx.room.Dao
import androidx.room.Query
import com.example.edacycourskotlin.data.model.Website

@Dao
interface WebsiteDao: BaseDao<Website> {
//interface WebsiteDao: BaseDao<ContactsContract.CommonDataKinds.Website> {

    @Query("SELECT * FROM websites")
    // fun getAll(): List<ContactsContract.CommonDataKinds.Website>
    fun getAll(): List<Website>
}