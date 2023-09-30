package ru.sogya.projects.activity_and_charity.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp


data class ActivityAndCharityColors(
    val primary: Color,
    val secondary: Color,
    val tertiary: Color,
    val accent: Color,
    val white: Color,
    val disable: Color,
    val secondaryText: Color,
)

data class ActivityAndCharityTypography(
    val heading: TextStyle,
    val regular: TextStyle
)

data class ActivityAndCharityShape(
    val padding: Dp,
    val cornersStyle: Shape
)

object ActivityAndCharityTheme {
    internal val colors: ActivityAndCharityColors
        @Composable
        internal get() = LocalActivityAndCharityColors.current

    internal val typography: ActivityAndCharityTypography
        @Composable
        internal get() = LocalActivityAndCharityTypography.current

    internal val shape: ActivityAndCharityShape
        @Composable
        internal get() = LocalActivityAndCharityShape.current
}

enum class ActivityAndCharitySize {
    Small, Medium, Big
}

enum class ActivityAndCharityCorners {
    Flat, Rounded
}


internal val LocalActivityAndCharityColors = staticCompositionLocalOf<ActivityAndCharityColors>{
    error("No colors provided")
}

internal val LocalActivityAndCharityTypography = staticCompositionLocalOf<ActivityAndCharityTypography> {
    error("No fonts provided")
}

internal val LocalActivityAndCharityShape = staticCompositionLocalOf<ActivityAndCharityShape> {
    error("No shapes provided")
}