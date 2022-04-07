package com.example.devtools

import android.app.Application
import com.didichuxing.doraemonkit.DoKit

object DokitHelper {
    fun setup(app: Application) {
        DoKit.Builder(app).build()
    }
}
