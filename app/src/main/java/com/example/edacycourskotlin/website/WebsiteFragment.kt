package com.example.edacycourskotlin.website

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.edacycourskotlin.R

//import com.example.edacycourskotlin.R

class WebsiteFragment : Fragment() {

    companion object {
        fun newInstance() = WebsiteFragment()
    }

    private lateinit var viewModel: WebsiteViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.website_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }
}


