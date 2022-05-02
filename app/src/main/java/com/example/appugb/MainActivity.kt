package com.example.appugb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appugb.fragments.AnthemFragment
import com.example.appugb.fragments.RatingsFragment
import com.example.appugb.fragments.SchedulingFragment
import com.example.appugb.fragments.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(SchedulingFragment(), "Scheduling")
        adapter.addFragment(AnthemFragment(), "Anthem")
        adapter.addFragment(RatingsFragment(), "Ratings")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)

        tabs.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_event_note_24)
        tabs.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_library_music_24)
        tabs.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_portrait_24)
    }
}