package com.example.drealtor.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.drealtor.screens.DetailsScreen
import com.example.drealtor.screens.Home
import com.example.drealtor.utils.Screens

/// navgraph
@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screens.Home.route) {

        composable(Screens.Home.route) {
            Home(navController);
        }
        composable(Screens.DetailsScreen.route) {
            DetailsScreen(navController);
        }

    }
}