package com.muhammed.composesplashonboarhomeproject

import android.app.Application
import com.muhammed.composesplashonboarhomeproject.data.datastore.DataStoreManager
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        DataStoreManager.init(this)
    }
}