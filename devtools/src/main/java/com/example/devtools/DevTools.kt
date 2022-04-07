package com.example.devtools

import android.app.Application

object DevTools {
    fun initialize(app: Application) {
        DokitHelper.setup(app)
    }
}
