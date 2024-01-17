package ru.sogya.projects.activity_and_charity.ui.screens.statistic.item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import ru.sogya.projects.activity_and_charity.ui.theme.AppTheme

@Composable
fun DonationItem(
    donationValue: String
) {
    AppTheme {
        Card(
            shape = ActivityAndCharityTheme.shape.cornersStyle,
            elevation = CardDefaults.cardElevation(0.dp),
            colors = CardDefaults.cardColors(
                containerColor = ActivityAndCharityTheme.colors.primary
            ),
            modifier = Modifier
                .padding(
                    top = 24.dp,
                    start = 16.dp,
                    end = 16.dp
                )
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(160.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.donation_statistic_item_background),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(12.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(){
                        Text(
                            text = stringResource(R.string.donated),
                            color = ActivityAndCharityTheme.colors.white,
                            fontFamily = ActivityAndCharityTheme.typography.heading.fontFamily,
                            fontSize = ActivityAndCharityTheme.typography.heading.fontSize,
                        )
                    }
                    Row(
                        verticalAlignment = Alignment.Bottom,
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ){
                        Text(
                            text = donationValue,
                            color = ActivityAndCharityTheme.colors.white,
                            fontSize = 36.sp,
                            fontFamily = ActivityAndCharityTheme.typography.regularBold.fontFamily,
                            modifier = Modifier
                                .height(42.dp)
                        )
                        Spacer(
                            modifier = Modifier
                                .width(4.dp)
                        )
                        Text(
                            text = stringResource(id = R.string.rub_symbol),
                            color = ActivityAndCharityTheme.colors.secondaryText,
                            fontSize = 20.sp,
                            fontFamily = ActivityAndCharityTheme.typography.regularMedium.fontFamily
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun DonationItemPreview() {
    DonationItem("2 675")
}