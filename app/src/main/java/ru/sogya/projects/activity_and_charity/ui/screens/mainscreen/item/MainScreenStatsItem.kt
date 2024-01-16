package ru.sogya.projects.activity_and_charity.ui.screens.mainscreen.item

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
import ru.sogya.projects.activity_and_charity.ui.theme.ActivityAndCharitySize
import ru.sogya.projects.activity_and_charity.ui.theme.ActivityAndCharityTheme
import ru.sogya.projects.activity_and_charity.ui.theme.AppTheme

@Preview(showBackground = false)
@Composable
private fun StatItemMainScreenPreview() {

    Column {
        StatItemComposable(
            R.string.your_rating,
            R.drawable.rating_card_background,
            "207",
            "из 2023"
        )

        Spacer(modifier = Modifier.height(20.dp))

        StatItemComposable(
            R.string.donated,
            R.drawable.donated_card_background,
            "2 475",
            "₽"
        )

        Spacer(modifier = Modifier.height(20.dp))

        StatItemComposable(
            R.string.progress_of_achievement,
            R.drawable.progress_card_background,
            "15",
            "из 36"
        )
    }
}

@Composable
fun StatItemComposable(
    header: Int,
    img: Int,
    infoMain: String,
    infoSecond: String
) {

    AppTheme(
        textSize = ActivityAndCharitySize.Small
    ) {
        Card(
            shape = ActivityAndCharityTheme.shape.cornersStyle,
            elevation = CardDefaults.cardElevation(0.dp),
            colors = CardDefaults.cardColors(
                containerColor = ActivityAndCharityTheme.colors.primary
            )
//            modifier = Modifier
//                .padding(
//                    horizontal = 16.dp
//                )
        ){
            Box(
                modifier = Modifier
                    .size(140.dp)
            ) {
                Image(
                    painter = painterResource(id = img),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
                Column(
                    modifier = Modifier
                        .padding(12.dp)
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.Start
                ){
                    Text(
                        text = stringResource(header),
                        color = ActivityAndCharityTheme.colors.white,
                        fontSize = ActivityAndCharityTheme.typography.regular.fontSize,
                        fontFamily = ActivityAndCharityTheme.typography.regular.fontFamily
                    )
                    Row(
                        verticalAlignment = Alignment.Bottom,
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(
                            text = infoMain,
                            color = ActivityAndCharityTheme.colors.white,
                            fontSize = 32.sp,
                            fontFamily = ActivityAndCharityTheme.typography.regularBold.fontFamily,
                            modifier = Modifier
                                .height(38.dp)
                        )
                        Spacer(
                            modifier = Modifier
                                .width(4.dp)
                        )
                        Text(
                            text = infoSecond,
                            color = ActivityAndCharityTheme.colors.secondaryText,
                            fontSize = 14.sp,
                            fontFamily = ActivityAndCharityTheme.typography.regular.fontFamily
                        )
                    }
                }
            }
        }
    }
}