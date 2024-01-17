package ru.sogya.projects.activity_and_charity.ui.screens.statistic.item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
import ru.sogya.projects.activity_and_charity.ui.theme.ActivityAndCharityTheme
import ru.sogya.projects.activity_and_charity.ui.theme.AppTheme

@Composable
fun LeaderBoardItemComposable() {
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
                    16.dp
                )
        ) {
            Column(
                modifier = Modifier
                    .padding(12.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(
                        text = stringResource(id = R.string.leader_board),
                        color = ActivityAndCharityTheme.colors.white,
                        fontFamily = ActivityAndCharityTheme.typography.heading.fontFamily,
                        fontSize = ActivityAndCharityTheme.typography.heading.fontSize,
                    )
                    Image(
                        painter = painterResource(R.drawable.ic_arrow_forward),
                        contentDescription = null
                    )
                }
                PersonItemInLeaderBoard()
                PersonItemInLeaderBoard()
                PersonItemInLeaderBoard()
            }
        }
    }
}

@Composable
private fun PersonItemInLeaderBoard() {
    AppTheme {

        Card(
            shape = ActivityAndCharityTheme.shape.cornersStyle,
            elevation = CardDefaults.cardElevation(0.dp),
            colors = CardDefaults.cardColors(
                containerColor = ActivityAndCharityTheme.colors.tertiary
            ),
            modifier = Modifier
                .padding(
                    top = 12.dp
                )
                .fillMaxWidth()
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        horizontal = 12.dp
                    )
                    .height(60.dp)
            ){
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .fillMaxWidth(0.8f)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_position_in_leaderboard_first),
                        contentDescription = null,
                        modifier = Modifier
                            .size(24.dp)
                    )
                    Spacer(
                        modifier = Modifier
                            .width(8.dp)
                    )
                    Text(
                        text = "1",
                        color = ActivityAndCharityTheme.colors.white,
                        fontFamily = ActivityAndCharityTheme.typography.regular.fontFamily,
                        fontSize = ActivityAndCharityTheme.typography.regular.fontSize,
                    )
                    Spacer(
                        modifier = Modifier
                            .width(8.dp)
                    )
                    Image(
                        modifier = Modifier
                            .size(34.dp)
                            .clip(
                                RoundedCornerShape(100.dp)
                            ),
                        painter = painterResource(R.drawable.test_avaa),
                        contentDescription = null
                    )
                    Spacer(
                        modifier = Modifier
                            .width(8.dp)
                    )
                    Column {
                        Text(
                            text = stringResource(id = R.string.name_example),
                            fontSize = 16.sp,
                            color = ActivityAndCharityTheme.colors.white,
                            fontFamily = ActivityAndCharityTheme.typography.regular.fontFamily
                        )
                        Text(
                            text = "Служба безопасности",
                            fontSize = 12.sp,
                            color = ActivityAndCharityTheme.colors.secondaryText,
                            fontFamily = ActivityAndCharityTheme.typography.regular.fontFamily
                        )
                    }
                }
                Text(
                    text = "2 000 " + stringResource(id = R.string.rub_symbol),
                    fontSize = 16.sp,
                    color = ActivityAndCharityTheme.colors.white,
                    fontFamily = ActivityAndCharityTheme.typography.regular.fontFamily
                )
            }
        }
    }
}

@Preview
@Composable
private fun LeaderBoardItemPreview() {

    Column {
        LeaderBoardItemComposable()
//        PersonItemInLeaderBoard()
    }

}