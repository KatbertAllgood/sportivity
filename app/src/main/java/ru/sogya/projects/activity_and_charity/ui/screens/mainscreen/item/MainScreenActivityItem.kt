package ru.sogya.projects.activity_and_charity.ui.screens.mainscreen.item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.sogya.projects.activity_and_charity.R
import ru.sogya.projects.activity_and_charity.ui.theme.ActivityAndCharityTheme
import ru.sogya.projects.activity_and_charity.ui.theme.AppTheme

@Composable
fun ActivityItemComposable(
    img: Int,
    activityText: Int
) {
    AppTheme {
        Card(
            shape = ActivityAndCharityTheme.shape.cornersStyle,
            elevation = CardDefaults.cardElevation(0.dp),
            colors = CardDefaults.cardColors(
                containerColor = ActivityAndCharityTheme.colors.primary
            )
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(160.dp)
            ) {
                Image(
                    painter = painterResource(id = img),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
                Column(
                    verticalArrangement = Arrangement.Bottom,
                    modifier = Modifier
                        .fillMaxSize()
                ){
                    Text(
                        text = stringResource(activityText),
                        color = ActivityAndCharityTheme.colors.white,
                        fontFamily = ActivityAndCharityTheme.typography.heading.fontFamily,
                        fontSize = ActivityAndCharityTheme.typography.heading.fontSize,
                        modifier = Modifier
                            .padding(16.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = false)
@Composable
private fun ActivityItemPreview() {

    Column() {
        ActivityItemComposable(
            R.drawable.force_activity_card_background,
            R.string.force_activity
        )
        ActivityItemComposable(
            R.drawable.water_activity_card_background,
            R.string.water_activity
        )
        ActivityItemComposable(
            R.drawable.bike_activity_card_background,
            R.string.bike_activity
        )
        ActivityItemComposable(
            R.drawable.run_activity_card_background,
            R.string.run_activity
        )
    }

}