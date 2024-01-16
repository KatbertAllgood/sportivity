package ru.sogya.projects.activity_and_charity.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import ru.sogya.projects.activity_and_charity.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)

private val PT = FontFamily.Default

@Immutable
data class AppTypography internal constructor(
    val h1: TextStyle = TextStyle(
        fontFamily = PT,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp,
    ),
    val h2: TextStyle = TextStyle(
        fontFamily = PT,
        fontWeight = FontWeight.Medium,
        fontSize = 28.sp,
    ),
    val h3: TextStyle = TextStyle(
        fontFamily = PT,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
    ),
    val h4: TextStyle = TextStyle(
        fontFamily = PT,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
    ),
    val p1Bold: TextStyle = TextStyle(
        fontFamily = PT,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
    ),
    val p1: TextStyle = TextStyle(
        fontFamily = PT,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
    ),
    val p2Bold: TextStyle = TextStyle(
        fontFamily = PT,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
    ),
    val p2: TextStyle = TextStyle(
        fontFamily = PT,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
    ),
    val p3: TextStyle = TextStyle(
        fontFamily = PT,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
    ),
    val p3Bold: TextStyle = TextStyle(
        fontFamily = PT,
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp,
    ),
    val p3Normal: TextStyle = TextStyle(
        fontFamily = PT,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
    ),
    val p4: TextStyle = TextStyle(
        fontFamily = PT,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
    ),
    val p4Bold: TextStyle = TextStyle(
        fontFamily = PT,
        fontWeight = FontWeight.Bold,
        fontSize = 11.sp,
    ),
)

/**
 * Used for fallback only and shouldn't be used generally, use [AppTypography] instead.
 */
val MaterialTypography = Typography()

internal val LocalAppTypography = staticCompositionLocalOf { AppTypography() }