package com.example.edacycourskotlin.data.model.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.edacycourskotlin.data.model.Article

@Dao
interface ArticleDao: BaseDao<Article> {

    @Query("SELECT * FROM article")
    fun getAll(): List<Article>

}