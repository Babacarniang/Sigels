package com.example.edacycourskotlin.ui.webview

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.edacycourskotlin.R
import com.example.edacycourskotlin.data.model.Article
import kotlinx.android.synthetic.main.article_item.*
import kotlinx.android.synthetic.main.fragment_web_client.*
//import kotlinx.android.synthetic.main.fragment_web_view.*


class WebClientFragment : Fragment() {

    private lateinit var article: Article
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_web_client, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            val args = WebClientFragmentArgs.fromBundle(it)
            article = args.article
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUi()
    }

    fun initUi(){
        webview.loadUrl(article.url)
    }
}