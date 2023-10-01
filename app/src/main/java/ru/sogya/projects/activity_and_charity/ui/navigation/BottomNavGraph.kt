package ru.sogya.projects.activity_and_charity.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ru.sogya.projects.activity_and_charity.ui.screens.mainscreen.MainScreenComposable
import ru.sogya.projects.activity_and_charity.ui.screens.profile.ProfileScreenComposable
import ru.sogya.projects.activity_and_charity.ui.screens.statistic.StatisticScreenComposable

@Composable
fun BottomNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Main.route
    ) {
        composable(route = BottomBarScreen.Main.route) {
            MainScreenComposable()
        }
        composable(route = BottomBarScreen.Stats.route) {
            StatisticScreenComposable()
        }
        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreenComposable()
        }
    }
}