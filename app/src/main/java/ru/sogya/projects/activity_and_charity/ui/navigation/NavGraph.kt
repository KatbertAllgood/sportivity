package ru.sogya.projects.activity_and_charity.ui.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ru.sogya.projects.activity_and_charity.ui.screens.auth.AuthScreenComposable
import ru.sogya.projects.activity_and_charity.ui.screens.mainscreen.MainScreenComposable
import ru.sogya.projects.activity_and_charity.ui.screens.profile.ProfileScreenComposable
import ru.sogya.projects.activity_and_charity.ui.screens.registration.RegistrationScreenComposable
import ru.sogya.projects.activity_and_charity.ui.screens.registration.RegistrationVM
import ru.sogya.projects.activity_and_charity.ui.screens.statistic.StatisticScreenComposable

@Composable
fun NavGraph(
    navController: NavHostController
) {



    NavHost(
        navController = navController,
        startDestination = "reg"
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
        composable(route = "auth") {
            AuthScreenComposable(
                onClick = {
                    navController.navigate("reg")
                }
            )
        }
        composable(route = "reg") {

            val viewModel = hiltViewModel<RegistrationVM>()

            RegistrationScreenComposable(
                viewModel = viewModel,
                navigateToMainScreen = {
                    navController.navigate(BottomBarScreen.Main.route)
                }
            )
        }
    }
}