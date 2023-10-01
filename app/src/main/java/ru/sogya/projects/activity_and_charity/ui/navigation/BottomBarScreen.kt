package ru.sogya.projects.activity_and_charity.ui.navigation

import androidx.compose.ui.res.stringResource
import ru.sogya.projects.activity_and_charity.R

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: Int,
    val iconFocused: Int
) {

    object Main: BottomBarScreen(
        route = "main",
        title = "Главная",
        icon = R.drawable.ic_bottom_navigation_main,
        iconFocused = R.drawable.ic_bottom_navigation_main_focused
    )

    object Stats: BottomBarScreen(
        route = "stats",
        title = "Статистика",
        icon = R.drawable.ic_bottom_navigation_stat,
        iconFocused = R.drawable.ic_bottom_navigation_stat_focused
    )

    object Profile: BottomBarScreen(
        route = "profile",
        title = "Профиль",
        icon = R.drawable.ic_bottom_navigation_profile,
        iconFocused = R.drawable.ic_bottom_navigation_profile_focused
    )
}
