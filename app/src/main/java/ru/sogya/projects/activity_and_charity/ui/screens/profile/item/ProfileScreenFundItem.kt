package ru.sogya.projects.activity_and_charity.ui.screens.profile.item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.sogya.projects.activity_and_charity.R
import ru.sogya.projects.activity_and_charity.ui.theme.ActivityAndCharityTheme

@Composable
fun FundItemComposable() {

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
                    start = 16.dp,
                    end = 16.dp,
                    top = 12.dp,

                )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp)
            ){
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.Bottom,
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    Text(
                        text = stringResource(id = R.string.fund_example),
                        fontFamily = ActivityAndCharityTheme.typography.regularMedium.fontFamily,
                        fontSize = 17.sp,
                        color = ActivityAndCharityTheme.colors.white
                    )
                    Text(
                        text = stringResource(id = R.string.change),
                        fontFamily = ActivityAndCharityTheme.typography.regular.fontFamily,
                        fontSize = 12.sp,
                        color = ActivityAndCharityTheme.colors.accent
                    )
                }
                Spacer(
                    modifier = Modifier
                        .height(8.dp)
                )
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    Text(
                        text = stringResource(id = R.string.fund_description_example),
                        fontFamily = ActivityAndCharityTheme.typography.regular.fontFamily,
                        fontSize = 12.sp,
                        color = ActivityAndCharityTheme.colors.secondaryText,
                        modifier = Modifier
                            .fillMaxWidth(0.7f)
                    )
                    Image(
                        painter = painterResource(R.drawable.fund_logo_example),
                        contentDescription = null
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun FundItemComposablePreview(){
    FundItemComposable()
}