package com.muhammed.composesplashonboarhomeproject.utils

import android.content.Context
import java.io.File
import java.text.SimpleDateFormat
import java.util.*

object LogUtils {

    private const val LOG_FILE_NAME = "log.txt"

    fun writeLog(context: Context, message: String) {
        val logFile = File(context.filesDir, LOG_FILE_NAME)
        val timeStamp = getCurrentTimeStamp()
        val logEntry = "[$timeStamp] $message\n"
        logFile.appendText(logEntry)
    }

    fun readLog(context: Context): String {
        val logFile = File(context.filesDir, LOG_FILE_NAME)
        return if (logFile.exists()) {
            logFile.readText()
        } else {
            "Log dosyası bulunamadı."
        }
    }

    fun clearLog(context: Context) {
        val logFile = File(context.filesDir, LOG_FILE_NAME)
        if (logFile.exists()) {
            logFile.writeText("")
        }
    }

    private fun getCurrentTimeStamp(): String {
        val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())
        return sdf.format(Date())
    }
}
