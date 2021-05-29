package com.d4rkc00d3r.logutil

import android.util.Log

class LogDebug {
    val tag: String
    get() {
        var tag = ""
        val ste = Thread.currentThread().stackTrace
        for (i in ste.indices) {
            if (ste[i].methodName == "getTag") {
                tag = "(" + ste[i + 1].fileName + ":" + ste[i + 1].lineNumber + ")"
            }
        }
        return tag
    }

    fun debugLog(tag: String, message: String) {
        Log.d("DEBUG", tag + message)
    }
}