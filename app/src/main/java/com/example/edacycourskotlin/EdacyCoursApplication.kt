package com.example.edacycourskotlin

import android.app.Application
import androidx.room.Room
import com.example.edacycourskotlin.data.model.AppDatabase

val database: AppDatabase by lazy {
    EdacyCoursApplication.database
}
class EdacyCoursApplication: Application(){

    companion object{
        lateinit var instance: EdacyCoursApplication
        private set
        lateinit var database: AppDatabase
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        initializer()
    }
    private fun initializer(){
        configDatabase()
    }

    private fun configDatabase(){
        database = Room
            .databaseBuilder(applicationContext, AppDatabase:: class.java, "edacy-db")
            .fallbackToDestructiveMigration()
            .build()
    }

}