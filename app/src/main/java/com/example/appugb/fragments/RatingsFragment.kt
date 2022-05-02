package com.example.appugb.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.appugb.R

class RatingsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        val myView = inflater.inflate(R.layout.fragment_ratings, container, false)

        val wv_WebViewRatings = myView.findViewById<WebView>(R.id.wv_WebViewRatings)
        wv_WebViewRatings.webViewClient = WebViewClient()
        wv_WebViewRatings.loadUrl("https://estudiantes.ugb.edu.sv/Login?ReturnUrl=%2F")
        wv_WebViewRatings.settings.javaScriptEnabled = true
        // Inflate the layout for this fragment
        return myView
    }
}