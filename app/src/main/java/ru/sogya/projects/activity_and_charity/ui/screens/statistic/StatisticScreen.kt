package ru.sogya.projects.activity_and_charity.ui.screens.statistic

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.sogya.projects.activity_and_charity.R
import ru.sogya.projects.activity_and_charity.ui.screens.statistic.item.ActivityItemStatScreenComposable
import ru.sogya.projects.activity_and_charity.ui.screens.statistic.item.DonationItem
import ru.sogya.projects.activity_and_charity.ui.screens.statistic.item.LeaderBoardItemComposable
import ru.sogya.projects.activity_and_charity.ui.theme.ActivityAndCharityTheme
import ru.sogya.projects.activity_and_charity.ui.theme.AppTheme
import ru.sogya.projects.activityandcharity.domain.utils.Constants

@Composable
fun StatisticScreenComposable() {
    AppTheme {
        Column(
            modifier = Modifier
                .background(
                    color = ActivityAndCharityTheme.colors.primary
                )
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ){

            DonationItem("2 232")

            LeaderBoardItemComposable()

            Column(
                modifier = Modifier
                    .padding(
                        horizontal = 16.dp
                    )
                    .fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    ActivityItemStatScreenComposable(
                        title = stringResource(R.string.force_activity),
                        value = "20",
                        valueType = Constants.MIN,
                        earned = "372",
                        img = R.drawable.force_activity_rectangle_card_background
                    )
                    ActivityItemStatScreenComposable(
                        title = stringResource(R.string.water_activity),
                        value = "20",
                        valueType = Constants.MIN,
                        earned = "372",
                        img = R.drawable.water_activity_rectangle_card_background
                    )
                }
                Spacer(
                    modifier = Modifier
                        .height(12.dp)
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    ActivityItemStatScreenComposable(
                        title = stringResource(R.string.run_activity),
                        value = "20",
                        valueType = Constants.KM,
                        earned = "372",
                        img = R.drawable.run_activity_rectangle_card_background
                    )
                    ActivityItemStatScreenComposable(
                        title = stringResource(R.string.bike_activity),
                        value = "20",
                        valueType = Constants.KM,
                        earned = "372",
                        img = R.drawable.bike_activity_rectangle_card_background
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
private fun StatisticScreenPreview() {
    StatisticScreenComposable()
}