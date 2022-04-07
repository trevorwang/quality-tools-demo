package com.example.connect

import android.app.Application
import com.example.devtools.DevTools

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        DevTools.initialize(this)
    }
}
