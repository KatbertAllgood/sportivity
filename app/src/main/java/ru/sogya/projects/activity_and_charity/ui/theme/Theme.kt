package ru.sogya.projects.activity_and_charity.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.sogya.projects.activity_and_charity.R

@Composable
internal fun AppTheme(
    textSize: ActivityAndCharitySize = ActivityAndCharitySize.Medium,
    paddingSize: ActivityAndCharitySize = ActivityAndCharitySize.Medium,
    corners: ActivityAndCharityCorners = ActivityAndCharityCorners.Rounded,
    content: @Composable () -> Unit
) {

    val colors = basePalette

    val typography = ActivityAndCharityTypography(
        heading = TextStyle(
            fontSize = when (textSize) {
                ActivityAndCharitySize.Small -> 18.sp
                ActivityAndCharitySize.Medium -> 20.sp
                ActivityAndCharitySize.Big -> 22.sp
            },
            fontWeight = FontWeight.Normal,
            fontFamily = FontFamily(Font(R.font.roboto_regular))
        ),
        regular = TextStyle(
            fontSize = when (textSize) {
                ActivityAndCharitySize.Small -> 12.sp
                ActivityAndCharitySize.Medium -> 14.sp
                ActivityAndCharitySize.Big -> 16.sp
            },
            fontWeight = FontWeight.Normal,
            fontFamily = FontFamily(Font(R.font.roboto_regular))
        ),
        regularBold = TextStyle(
            fontSize = when (textSize) {
                ActivityAndCharitySize.Small -> 12.sp
                ActivityAndCharitySize.Medium -> 14.sp
                ActivityAndCharitySize.Big -> 16.sp
            },
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily(Font(R.font.roboto_bold))
        ),
        regularMedium = TextStyle(
            fontSize = when (textSize) {
                ActivityAndCharitySize.Small -> 12.sp
                ActivityAndCharitySize.Medium -> 14.sp
                ActivityAndCharitySize.Big -> 16.sp
            },
            fontWeight = FontWeight.Medium,
            fontFamily = FontFamily(Font(R.font.roboto_medium))
        )
    )

    val shapes = ActivityAndCharityShape(
        padding = when (paddingSize) {
            ActivityAndCharitySize.Small -> 12.dp
            ActivityAndCharitySize.Medium -> 16.dp
            ActivityAndCharitySize.Big -> 20.dp
        },
        cornersStyle = when (corners) {
            ActivityAndCharityCorners.Flat -> RoundedCornerShape(0.dp)
            ActivityAndCharityCorners.Rounded -> RoundedCornerShape(16.dp)
        }
    )

    CompositionLocalProvider(
        LocalActivityAndCharityColors provides colors,
        LocalActivityAndCharityTypography provides typography,
        LocalActivityAndCharityShape provides shapes,
        content = content
    )
}

object AppTheme {
    val colors: ActivityAndCharityColors
        @Composable
        @ReadOnlyComposable
        get() = LocalActivityAndCharityColors.current

    val typography: AppTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalAppTypography.current
}

//
//@Composable
//fun AppTheme(
//    useDarkTheme: Boolean = true,
//    typography: AppTypography = AppTheme.typography,
//    content: @Composable () -> Unit,
//) {
//    val colors = basePalette
//    MaterialTheme(
//        colorScheme = debugColors(),
//        typography = MaterialTypography,
//    ) {
//        CompositionLocalProvider(
//            LocalAppTypography provides typography,
//            LocalContentColor provides colors.darkBlue,
//            content = content,
//        )
//    }
//}
//
//object AppTheme {
//    val colors: AppColors
//        @Composable
//        @ReadOnlyComposable
//        get() = LocalAppColors.current
//
//    val typography: AppTypography
//        @Composable
//        @ReadOnlyComposable
//        get() = LocalAppTypography.current
//}
//
//fun debugColors() = Colors(
//    primary = DebugColor,
//    primaryVariant = DebugColor,
//    secondary = DebugColor,
//    secondaryVariant = DebugColor,
//    background = DebugColor,
//    surface = DebugColor,
//    error = DebugColor,
//    onPrimary = DebugColor,
//    onSecondary = DebugColor,
//    onBackground = DebugColor,
//    onSurface = DebugColor,
//    onError = DebugColor,
//)
//
//private val DebugColor = Color.Magenta