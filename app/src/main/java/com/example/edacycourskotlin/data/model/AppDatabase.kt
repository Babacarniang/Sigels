package com.example.edacycourskotlin.data.model

import android.provider.ContactsContract
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.edacycourskotlin.data.model.dao.ArticleDao
import com.example.edacycourskotlin.data.model.dao.WebsiteDao

/*@Database(entities = [ContactsContract.CommonDataKinds.Website::class, Article::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun websiteDao(): WebsiteDao
    abstract fun articleDao(): ArticleDao
    */

@Database(entities = [Website::class, Article::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun websiteDao(): WebsiteDao
    abstract fun articleDao(): ArticleDao
}


