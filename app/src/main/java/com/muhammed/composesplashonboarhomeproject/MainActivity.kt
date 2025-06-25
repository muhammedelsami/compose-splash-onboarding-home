package com.muhammed.composesplashonboarhomeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.muhammed.composesplashonboarhomeproject.presentation.navigation.AppNavHost
import com.muhammed.composesplashonboarhomeproject.ui.theme.ComposeSplashOnboarHomeProjectTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeSplashOnboarHomeProjectTheme {
                AppNavHost()
            }
        }
    }
}