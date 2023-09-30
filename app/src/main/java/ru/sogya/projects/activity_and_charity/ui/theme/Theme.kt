package ru.sogya.projects.activity_and_charity.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import ru.sogya.projects.activity_and_charity.R

@Composable
internal fun ActivityAndCharityTheme(
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
                ActivityAndCharitySize.Small -> 14.sp
                ActivityAndCharitySize.Medium -> 16.sp
                ActivityAndCharitySize.Big -> 18.sp
            },
            fontWeight = FontWeight.Normal,
            fontFamily = FontFamily(Font(R.font.roboto_regular))
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
            ActivityAndCharityCorners.Rounded -> RoundedCornerShape(8.dp)
        }
    )

    CompositionLocalProvider(
        LocalActivityAndCharityColors provides colors,
        LocalActivityAndCharityTypography provides typography,
        LocalActivityAndCharityShape provides shapes,
        content = content
    )

}