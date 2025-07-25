package com.muhammed.composesplashonboarhomeproject.presentation.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.muhammed.composesplashonboarhomeproject.data.datastore.DataStoreManager
import com.muhammed.composesplashonboarhomeproject.presentation.navigation.Routes
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(onNavigate: (String) -> Unit) {
    LaunchedEffect(Unit) {
        delay(2000)
        val isFirstLaunch = !DataStoreManager.getOnboardingSeen()
        onNavigate(if (isFirstLaunch) Routes.ONBOARDING else Routes.HOME)
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF0E1536)),
        contentAlignment = Alignment.Center
    ) {
        Text("MyApp", color = Color.White, fontSize = 36.sp, fontWeight = FontWeight.Bold)
    }
}