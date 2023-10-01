package ru.sogya.projects.activity_and_charity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import ru.sogya.projects.activity_and_charity.ui.screens.mainscreen.MainVM
import ru.sogya.projects.activity_and_charity.ui.navigation.BottomNav
import ru.sogya.projects.activity_and_charity.ui.theme.ActivityAndCharityTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val vm: MainVM by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ActivityAndCharityTheme {
                BottomNav()
            }
        }
    }
}