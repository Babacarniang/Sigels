package com.example.edacycourskotlin.data.model.repository

import com.example.edacycourskotlin.data.model.dao.WebsiteDao
import com.example.edacycourskotlin.database

object WebsiteRepository:  BaseRepository<WebsiteDao> {

    override fun dao(): WebsiteDao {
        return database!!.websiteDao()
    }
}