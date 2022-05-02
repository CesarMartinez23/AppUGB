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

class SchedulingFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        val myView = inflater.inflate(R.layout.fragment_scheduling, container, false)

        val wv_WebViewScheduling = myView.findViewById<WebView>(R.id.wv_WebViewScheduling)
        wv_WebViewScheduling.webViewClient = WebViewClient()
        wv_WebViewScheduling.loadUrl("https://www.ugb.edu.sv/institucional/calendarizacion.html")
        wv_WebViewScheduling.settings.javaScriptEnabled = true

        // Inflate the layout for this fragment
        return myView
    }
}