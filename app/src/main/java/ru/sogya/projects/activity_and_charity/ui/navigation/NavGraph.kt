package ru.sogya.projects.activity_and_charity.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import ru.sogya.projects.activity_and_charity.ui.screens.auth.enter.EnterScreenContent
import ru.sogya.projects.activity_and_charity.ui.screens.auth.login.LoginScreenContent
import ru.sogya.projects.activity_and_charity.ui.screens.auth.registration.RegistrationScreenContent
import ru.sogya.projects.activity_and_charity.ui.screens.mainscreen.MainScreenComposable
import ru.sogya.projects.activity_and_charity.ui.screens.profile.ProfileScreenComposable
import ru.sogya.projects.activity_and_charity.ui.screens.statistic.StatisticScreenComposable

@Composable
fun NavGraph(
    navController: NavHostController = rememberNavController(),
    startDestination: String = "enter"
) {

    NavHost(
        navController = navController,
        startDestination = startDestination
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
        composable(route = "enter") {
            EnterScreenContent(
                onNavigateToSignIn = { email ->
                    navController.navigate(route = "signIn/$email")
                },
                onNavigateToRegistration = { email ->
                    navController.navigate(route = "registration/$email")
                }
            )
        }
        composable(
            route = "signIn/{email}",
            arguments = listOf(navArgument("email") { type = NavType.StringType })
        ) { backStackEntry ->
            LoginScreenContent(backStackEntry.arguments?.getString("email"), onNavigateToMainScreen = {
                navController.navigate(route = BottomBarScreen.Main.route)
            })
        }

        composable(
            route = "registration/{email}",
            arguments = listOf(navArgument("email") { type = NavType.StringType })
        ) { backStackEntry ->
            RegistrationScreenContent(backStackEntry.arguments?.getString("email"), onNavigateToMainScreen = {
                navController.navigate(route = BottomBarScreen.Main.route)
            })
        }
    }
}