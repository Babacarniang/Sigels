package com.example.edacycourskotlin.ui


import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.edacycourskotlin.data.model.Article
import com.example.edacycourskotlin.data.model.repository.ArticleRepository

class MainViewModel : ViewModel() {
    var articles: LiveData<List<Article>>? = null
        private set
        get() {
            return ArticleRepository.getArticles()
        }
}