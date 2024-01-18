package ru.sogya.projects.activity_and_charity.ui.screens.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import ru.sogya.projects.activity_and_charity.R
import ru.sogya.projects.activity_and_charity.ui.theme.ActivityAndCharityTheme
import ru.sogya.projects.activity_and_charity.ui.theme.AppTheme
import ru.sogya.projects.activityandcharity.domain.utils.State

@Composable
fun OnboardingScreenContent(
    onNavigateToAuth: () -> Unit,
    onNavigateToMainScreen: () -> Unit,
    viewModel: OnboardingVM = hiltViewModel()
) {
    val authState by viewModel.isUserLoginStateFlow.collectAsState()


    AppTheme {
        Column(
            modifier = Modifier
                .background(
                    color = ActivityAndCharityTheme.colors.primary
                )
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = null,
                modifier = Modifier
                    .padding(
                        top = 32.dp
                    )
                    .size(60.dp)
            )

            when (authState) {
                is State.Success -> {
                    onNavigateToMainScreen()
                }

                is State.Failed -> {
                    onNavigateToAuth()
                }

                is State.Loading -> {

                }
            }
        }
    }
}