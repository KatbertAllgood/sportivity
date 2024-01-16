package ru.sogya.projects.activity_and_charity.ui.screens.mainscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.sogya.projects.activity_and_charity.R
import ru.sogya.projects.activity_and_charity.ui.screens.mainscreen.item.ActivityItemComposable
import ru.sogya.projects.activity_and_charity.ui.screens.mainscreen.item.StatItemComposable
import ru.sogya.projects.activity_and_charity.ui.theme.ActivityAndCharityTheme
import ru.sogya.projects.activity_and_charity.ui.theme.AppTheme

@Composable
fun MainScreenComposable(

) {
    AppTheme {
        Column(
            modifier = Modifier
                .background(
                    color = ActivityAndCharityTheme.colors.primary
                )
                .fillMaxSize()
//                .padding(
//                    vertical = 24.dp
//                )
                .verticalScroll(rememberScrollState())
        ) {

            val paddingHorizontal = 16.dp

            //region Приветствие

            Text(
                text = stringResource(id = R.string.greeting_day, "Тимофейка"),
                color = ActivityAndCharityTheme.colors.white,
                fontFamily = ActivityAndCharityTheme.typography.heading.fontFamily,
                fontSize = ActivityAndCharityTheme.typography.heading.fontSize,
                modifier = Modifier
                    .padding(
                        start = paddingHorizontal,
                        end = paddingHorizontal,
                        top = 24.dp
                    )
            )

            //endregion

            //region Статы горизонтально

            val scrollStateStats = rememberScrollState()

            Row(
                modifier = Modifier
                    .horizontalScroll(scrollStateStats)
                    .padding(
                        vertical = 24.dp
                    )
                    .fillMaxWidth(),
            ) {
                Spacer(
                    modifier = Modifier
                        .width(paddingHorizontal)
                )
                StatItemComposable(
                    R.string.your_rating,
                    R.drawable.rating_card_background,
                    "207",
                    "из 2023"
                )
                Spacer(
                    modifier = Modifier
                        .width(12.dp)
                )
                StatItemComposable(
                    R.string.donated,
                    R.drawable.donated_card_background,
                    "2 475",
                    "₽"
                )
                Spacer(
                    modifier = Modifier
                        .width(12.dp)
                )
                StatItemComposable(
                    R.string.progress_of_achievement,
                    R.drawable.progress_card_background,
                    "15",
                    "из 36"
                )
                Spacer(
                    modifier = Modifier
                        .width(paddingHorizontal)
                )
            }

            //endregion

            //region надпись Активности

            Text(
                text = stringResource(id = R.string.activities),
                color = ActivityAndCharityTheme.colors.white,
                fontFamily = ActivityAndCharityTheme.typography.heading.fontFamily,
                fontSize = ActivityAndCharityTheme.typography.heading.fontSize,
                modifier = Modifier
                    .padding(
                        start = paddingHorizontal,
                        end = paddingHorizontal,
                        bottom = 12.dp
                    )
            )

            //endregion

            //region Активности

            Column(
                modifier = Modifier
                    .padding(
                        horizontal = paddingHorizontal
                    )
                    .fillMaxHeight(),
//                verticalArrangement = Arrangement.SpaceAround
            ) {
                ActivityItemComposable(
                    R.drawable.force_activity_card_background,
                    R.string.force_activity
                )
                Spacer(
                    modifier = Modifier
                        .height(16.dp)
                )
                ActivityItemComposable(
                    R.drawable.water_activity_card_background,
                    R.string.water_activity
                )
                Spacer(
                    modifier = Modifier
                        .height(16.dp)
                )
                ActivityItemComposable(
                    R.drawable.bike_activity_card_background,
                    R.string.bike_activity
                )
                Spacer(
                    modifier = Modifier
                        .height(16.dp)
                )
                ActivityItemComposable(
                    R.drawable.run_activity_card_background,
                    R.string.run_activity
                )
                Spacer(
                    modifier = Modifier
                        .height(24.dp)
                )
            }

            //endregion

            Spacer(
                modifier = Modifier
                    .height(74.dp)
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MainScreenPreview(){
    MainScreenComposable()
}