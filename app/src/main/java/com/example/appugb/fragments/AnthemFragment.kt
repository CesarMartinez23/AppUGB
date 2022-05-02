package com.example.appugb.fragments

import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.graphics.toColorInt
import com.example.appugb.R

class AnthemFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        val myView = inflater.inflate(R.layout.fragment_anthem, container, false)

        val btnPlayStop = myView.findViewById<Button>(R.id.btnPlayStop)

        val mp = MediaPlayer.create(context, R.raw.audio_himno_ugb)

        btnPlayStop.setOnClickListener {
            if (!mp.isPlaying){
                mp.start()
                btnPlayStop.text = "Stop"
            }else{
                mp.pause()
                btnPlayStop.text = "Play"
            }
        }
        // Inflate the layout for this fragment
        return myView
    }
}