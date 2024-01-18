package ru.sogya.projects.activity_and_charity.ui.navigation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import ru.sogya.projects.activity_and_charity.ui.theme.ActivityAndCharityTheme
import ru.sogya.projects.activity_and_charity.ui.theme.AppTheme

@Composable
fun BottomNav() {

    val navController = rememberNavController()

    val bottomBarState = rememberSaveable { (mutableStateOf(false)) }

    when (currentRoute(navController)) {
        ONBOARDING, AUTH_ENTER, AUTH_REGISTRATION, AUTH_SIGNIN -> {
            bottomBarState.value = false
        }

        BottomBarScreen.Stats.route,
        BottomBarScreen.Main.route,
        BottomBarScreen.Profile.route -> {
            bottomBarState.value = true
        }
    }

    Scaffold(
        bottomBar = {
            BottomBar(
                navController = navController,
                bottomBarState = bottomBarState
            )
        }
    ) {
        Modifier.padding(it)
        NavGraph(
            navController = navController
        )
    }
}

const val ONBOARDING = "onboarding"
const val AUTH_ENTER = "enter"
const val AUTH_SIGNIN = "signIn/{email}"
const val AUTH_REGISTRATION = "registration/{email}"

@Composable
fun currentRoute(navController: NavHostController): String? {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    return navBackStackEntry?.destination?.route
}

@Composable
fun BottomBar(navController: NavHostController, bottomBarState: State<Boolean>) {
    val screens = listOf(
        BottomBarScreen.Stats,
        BottomBarScreen.Main,
        BottomBarScreen.Profile
    )
    AnimatedVisibility(
        visible = bottomBarState.value,
        enter = slideInVertically(initialOffsetY = { it }),
        exit = slideOutVertically(targetOffsetY = { it }),
        content = {

            val navStackBackEntry by navController.currentBackStackEntryAsState()
            val currentDestination = navStackBackEntry?.destination

            AppTheme {
                Card(
                    shape = ActivityAndCharityTheme.shape.cornersStyle,
                    elevation = CardDefaults.cardElevation(0.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = ActivityAndCharityTheme.colors.secondary
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            start = 20.dp,
                            end = 20.dp,
                            top = 32.dp,
                            bottom = 32.dp
                        )
                ) {

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(56.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        screens.forEach { screen ->
                            AddItem(
                                screen = screen,
                                currentDestination = currentDestination,
                                navController = navController
                            )
                        }
                    }
                }
            }
        })
}

@Composable
fun AddItem(
    screen: BottomBarScreen,
    currentDestination: NavDestination?,
    navController: NavHostController
) {
    AppTheme {

        val selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true

        val background =
            if (selected) ActivityAndCharityTheme.colors.accent.copy(alpha = 0.6f) else Color.Transparent

        val contentColor =
            if (selected) ActivityAndCharityTheme.colors.white else ActivityAndCharityTheme.colors.disable

        Box(
            modifier = Modifier
                .height(40.dp)
                .clip(CircleShape)
                .background(background)
                .clickable(onClick = {
                    navController.navigate(screen.route) {
                        popUpTo(navController.graph.findStartDestination().id)
                        launchSingleTop = true
                    }
                })
        ) {
            Row(
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp, top = 8.dp, bottom = 8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Icon(
                    painter = painterResource(id = if (selected) screen.iconFocused else screen.icon),
                    contentDescription = "icon",
                    tint = contentColor
                )
                AnimatedVisibility(visible = selected) {
                    Text(
                        text = screen.title,
                        color = contentColor
                    )
                }
            }
        }
    }
}

@Composable
@Preview
fun BottomNavPreview() {
    BottomNav()
}