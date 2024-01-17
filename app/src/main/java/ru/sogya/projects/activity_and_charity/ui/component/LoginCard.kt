package ru.sogya.projects.activity_and_charity.ui.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.sogya.projects.activity_and_charity.ui.theme.ActivityAndCharityTheme
import ru.sogya.projects.activity_and_charity.ui.theme.AppTheme


@Composable
 fun AuthLabel(
    textId: Int
) {
    AppTheme {
        Text(
            text = stringResource(id = textId),
            fontFamily = ActivityAndCharityTheme.typography.regular.fontFamily,
            fontSize = 17.sp,
            color = ActivityAndCharityTheme.colors.secondaryText
        )
    }
}

@Composable
 fun AuthCard(
    content: @Composable () -> Unit
) {
    return AppTheme {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    top = 24.dp,
                    start = 16.dp,
                    end = 16.dp
                ),
            colors = CardDefaults.cardColors(
                containerColor = ActivityAndCharityTheme.colors.secondary
            ),
            shape = ActivityAndCharityTheme.shape.cornersStyle,
            elevation = CardDefaults.cardElevation(
                defaultElevation = 0.dp
            )
        ) { content() }
    }
}