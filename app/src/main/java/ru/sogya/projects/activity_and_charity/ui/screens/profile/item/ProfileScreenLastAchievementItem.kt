package ru.sogya.projects.activity_and_charity.ui.screens.profile.item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.sogya.projects.activity_and_charity.R
import ru.sogya.projects.activity_and_charity.ui.theme.ActivityAndCharityTheme
import ru.sogya.projects.activity_and_charity.ui.theme.AppTheme

@Composable
fun LastAchievementItemComposable(){

    AppTheme {
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
                )
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Column(
                    modifier = Modifier
                        .fillMaxWidth(0.7f)
                ) {
                    Text(
                        text = stringResource(id = R.string.achievement_example),
                        fontFamily = ActivityAndCharityTheme.typography.regularMedium.fontFamily,
                        fontSize = 17.sp,
                        color = ActivityAndCharityTheme.colors.white
                    )
                    Spacer(
                        modifier = Modifier
                            .height(8.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.achievement_description,
                            "30.09.2023", "12 часов отличного плаванья."),
                        fontFamily = ActivityAndCharityTheme.typography.regular.fontFamily,
                        fontSize = 12.sp,
                        color = ActivityAndCharityTheme.colors.secondaryText
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.achive_example),
                    contentDescription = null,
                    modifier = Modifier
                        .size(82.dp)
                )
            }
        }
    }
}

@Preview
@Composable
private fun LastAchievementItemPreview(){
    LastAchievementItemComposable()
}