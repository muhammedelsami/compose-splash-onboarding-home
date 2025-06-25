package com.muhammed.composesplashonboarhomeproject.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.muhammed.composesplashonboarhomeproject.presentation.home.HomeScreen
import com.muhammed.composesplashonboarhomeproject.presentation.onboarding.OnboardingScreen
import com.muhammed.composesplashonboarhomeproject.presentation.splash.SplashScreen

@Composable
fun AppNavHost(startDestination: String = Routes.SPLASH) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = startDestination) {
        composable(Routes.SPLASH) {
            SplashScreen(onNavigate = {
                navController.navigate(it) {
                    popUpTo(Routes.SPLASH) {
                        inclusive = true
                    }
                }
            })
        }
        composable(Routes.ONBOARDING) {
            OnboardingScreen(onFinish = {
                navController.navigate(Routes.HOME) {
                    popUpTo(Routes.ONBOARDING) { inclusive = true }
                }
            })
        }
        composable(Routes.HOME) {
            HomeScreen()
        }
    }
}