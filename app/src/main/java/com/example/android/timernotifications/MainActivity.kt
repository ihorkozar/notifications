package com.example.android.timernotifications

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android.timernotifications.ui.TimerFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, TimerFragment.newInstance())
                .commitNow()
        }
    }
}