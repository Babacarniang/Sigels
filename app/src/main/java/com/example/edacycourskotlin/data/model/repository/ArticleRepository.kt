package com.example.edacycourskotlin.data.model.repository

import androidx.lifecycle.LiveData
import com.example.edacycourskotlin.data.model.Article
import com.example.edacycourskotlin.data.model.dao.ArticleDao
import com.example.edacycourskotlin.database
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main

object ArticleRepository: BaseRepository<ArticleDao> {

    var job: CompletableJob? = null

    override fun dao(): ArticleDao {
        return database.articleDao()
    }

    fun getArticles(): LiveData<List<Article>> {
        job = Job()
        return object : LiveData<List<Article>>(){
            override fun onActive() {
                super.onActive()
                job?.let {theJob ->
                    CoroutineScope(IO + theJob).launch{
                        val articles = dao().getAll()
                        withContext(Main){
                            value = articles
                            theJob.complete()
                        }
                    }
                }
            }
        }
    }

    fun cancelJobs(){
        job?.cancel()
    }
}