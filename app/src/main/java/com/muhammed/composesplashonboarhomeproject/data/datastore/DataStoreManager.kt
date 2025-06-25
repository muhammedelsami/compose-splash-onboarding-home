package com.muhammed.composesplashonboarhomeproject.data.datastore

import android.annotation.SuppressLint
import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.first

@SuppressLint("StaticFieldLeak")
object DataStoreManager {
    private lateinit var context: Context
    private val Context.dataStore by preferencesDataStore(name = "app_prefs")

    private val ONBOARDING_SEEN = booleanPreferencesKey("onboarding_seen")

    fun init(context: Context) {
        this.context = context.applicationContext
    }

    suspend fun getOnboardingSeen(): Boolean {
        val prefs = context.dataStore.data.first()
        return prefs[ONBOARDING_SEEN] ?: false
    }

    suspend fun setOnboardingSeen(seen: Boolean) {
        context.dataStore.edit { it[ONBOARDING_SEEN] = seen }
    }
}