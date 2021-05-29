package com.d4rkc00d3r.logutilexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.d4rkc00d3r.logutil.LogDebug

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // -- Example -- How to call LogDebug and pass it in "tag" and a string "
        LogDebug().debugLog(LogDebug().tag, "This is my debug message.")

    }
}