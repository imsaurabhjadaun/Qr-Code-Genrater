package com.imsaurabhjadaun.qrcode_genrater

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screens.Home.route) {
        composable(Screens.Home.route) {
            GalleryQrCodeApp(navController)
        }

        composable(Screens.Scan.route) {
            ScanScreen(navController)
        }

        composable(Screens.Create_Qr.route) {
            CreateQr(navController)
        }
        composable(Screens.Privacy_Policy.route) {
            PrivacyPolicy(navController)
        }

    }
}

sealed class Screens(
    val route: String
) {
    object Home : Screens("Home")
    object Scan : Screens("Scan")
    object Create_Qr : Screens("Create_Qr")
    object Setting : Screens("Setting")
    object Share : Screens("Share")
    object Privacy_Policy : Screens("Privacy_Policy")
}