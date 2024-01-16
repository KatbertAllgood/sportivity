package ru.sogya.projects.activity_and_charity.ui.screens.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.sogya.projects.activity_and_charity.R
import ru.sogya.projects.activity_and_charity.ui.screens.profile.item.FundItemComposable
import ru.sogya.projects.activity_and_charity.ui.screens.profile.item.LastAchievementItemComposable
import ru.sogya.projects.activity_and_charity.ui.screens.profile.item.LvlProgressItemComposable
import ru.sogya.projects.activity_and_charity.ui.theme.ActivityAndCharityTheme
import ru.sogya.projects.activity_and_charity.ui.theme.AppTheme

@Composable
fun ProfileScreenComposable(){
    AppTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    color = ActivityAndCharityTheme.colors.primary
                )
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ){

            Image(
                modifier = Modifier
                    .padding(
                        top = 24.dp
                    )
                    .size(120.dp)
                    .clip(
                        RoundedCornerShape(100.dp)
                    ),
                painter = painterResource(R.drawable.test_avaa),
                contentDescription = null
            )

            Text(
                text = stringResource(id = R.string.name_example),
                color = ActivityAndCharityTheme.colors.white,
                fontFamily = ActivityAndCharityTheme.typography.heading.fontFamily,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(
                        top = 12.dp
                    )
            )

            LvlProgressItemComposable(progress = 0.8f)

            LastAchievementItemComposable()

            FundItemComposable()

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
                        top = 24.dp,

                        )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        text = stringResource(id = R.string.personal_info),
                        color = ActivityAndCharityTheme.colors.white,
                        fontFamily = ActivityAndCharityTheme.typography.regular.fontFamily,
                        fontSize = 16.sp,
                    )

                    Image(
                        painter = painterResource(id = R.drawable.ic_arrow_forward),
                        contentDescription = null
                    )
                }
            }

            Spacer(
                modifier = Modifier
                    .height(98.dp)
            )

        }
    }
}

@Preview
@Composable
private fun ProfileScreenPreview(){
    ProfileScreenComposable()
}