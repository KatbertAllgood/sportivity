package ru.sogya.projects.activity_and_charity.ui.screens.statistic.item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.sogya.projects.activity_and_charity.R
import ru.sogya.projects.activity_and_charity.ui.theme.ActivityAndCharityTheme
import ru.sogya.projects.activityandcharity.util.Constants

@Composable
fun ActivityItemStatScreenComposable(
    title: String,
    value: String,
    valueType: String,
    earned: String,
    img: Int
) {
    ActivityAndCharityTheme {
        Card(
            shape = ActivityAndCharityTheme.shape.cornersStyle,
            elevation = CardDefaults.cardElevation(0.dp),
            colors = CardDefaults.cardColors(
                containerColor = ActivityAndCharityTheme.colors.primary
            )
        ) {
            Box(
                modifier = Modifier
                    .size(150.dp)
            ) {
                Image(
                    painter = painterResource(id = img),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
                Column(
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(8.dp)
                ) {
                    Text(
                        text = title,
                        color = ActivityAndCharityTheme.colors.white,
                        fontFamily = ActivityAndCharityTheme.typography.regular.fontFamily,
                        fontSize = 14.sp
                    )
                    Column {
                        Row(
                            verticalAlignment = Alignment.Bottom
                        ){
                            Text(
                                text = value,
                                fontFamily = ActivityAndCharityTheme.typography.regularBold.fontFamily,
                                fontSize = 32.sp,
                                color = ActivityAndCharityTheme.colors.white,
                                modifier = Modifier
                                    .height(37.dp)
                            )
                            Spacer(
                                modifier = Modifier
                                    .width(3.dp)
                            )
                            Text(
                                text = when(valueType) {
                                    Constants.KM -> stringResource(R.string.km)
                                    Constants.MIN -> stringResource(R.string.minutes)
                                    else -> ""
                                },
                                color = ActivityAndCharityTheme.colors.accent,
                                fontFamily = ActivityAndCharityTheme.typography.regularMedium.fontFamily,
                                fontSize = 14.sp
                            )
                        }
                        Row(
                            verticalAlignment = Alignment.Bottom
                        ){
                            Text(
                                text = earned,
                                fontFamily = ActivityAndCharityTheme.typography.regularBold.fontFamily,
                                fontSize = 24.sp,
                                color = ActivityAndCharityTheme.colors.white,
                                modifier = Modifier
                                    .height(30.dp)
                            )
                            Spacer(
                                modifier = Modifier
                                    .width(3.dp)
                            )
                            Text(
                                text = stringResource(R.string.rub_symbol),
                                color = ActivityAndCharityTheme.colors.accent,
                                fontFamily = ActivityAndCharityTheme.typography.regularMedium.fontFamily,
                                fontSize = 14.sp
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun ActivityItemStatPreview() {
    ActivityItemStatScreenComposable(
        title = stringResource(R.string.force_activity),
        value = "20",
        valueType = Constants.MIN,
        earned = "372",
        img = R.drawable.force_activity_rectangle_card_background
    )
}