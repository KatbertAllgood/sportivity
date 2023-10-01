package ru.sogya.projects.activity_and_charity.ui.screens.profile.item

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.sogya.projects.activity_and_charity.R
import ru.sogya.projects.activity_and_charity.ui.theme.ActivityAndCharityTheme

@Composable
fun LvlProgressItemComposable(
    progress: Float
) {
    ActivityAndCharityTheme {
        Card(
            shape = ActivityAndCharityTheme.shape.cornersStyle,
            elevation = CardDefaults.cardElevation(0.dp),
            colors = CardDefaults.cardColors(
                containerColor = ActivityAndCharityTheme.colors.secondary
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 16.dp,
                    vertical = 24.dp
                )
        ) {
            Column(
                modifier = Modifier
                    .padding(
                        12.dp
                    )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            bottom = 12.dp
                        ),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                   Text(
                       text = stringResource(id = R.string.lvl, "1"),
                       fontSize = 12.sp,
                       fontFamily = ActivityAndCharityTheme.typography.regular.fontFamily,
                       color = ActivityAndCharityTheme.colors.accent
                   )
                    Text(
                        text = stringResource(id = R.string.lvl, "2"),
                        fontSize = 12.sp,
                        fontFamily = ActivityAndCharityTheme.typography.regular.fontFamily,
                        color = ActivityAndCharityTheme.colors.secondaryText
                    )
                }

                LinearProgressIndicator(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(12.dp)
                        .clip(RoundedCornerShape(16.dp)),
                    progress = progress,
                    color = ActivityAndCharityTheme.colors.accent,
                    trackColor = ActivityAndCharityTheme.colors.tertiary
                )
            }
        }
    }
}

@Preview
@Composable
private fun LvlProgressItemPreview() {
    LvlProgressItemComposable(0.8f)
}