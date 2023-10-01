package ru.sogya.projects.activity_and_charity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ru.sogya.projects.activity_and_charity.ui.screens.mainscreen.MainScreenComposable
import ru.sogya.projects.activity_and_charity.ui.screens.profile.ProfileScreenComposable
import ru.sogya.projects.activity_and_charity.ui.screens.statistic.StatisticScreenComposable
import ru.sogya.projects.activity_and_charity.ui.theme.ActivityAndCharitySize
import ru.sogya.projects.activity_and_charity.ui.theme.ActivityAndCharityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ActivityAndCharityTheme {
                ProfileScreenComposable()
            }
        }
    }
}