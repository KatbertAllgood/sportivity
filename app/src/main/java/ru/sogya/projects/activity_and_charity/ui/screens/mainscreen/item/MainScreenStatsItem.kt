package ru.sogya.projects.activity_and_charity.ui.screens.mainscreen.item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import ru.sogya.projects.activity_and_charity.R
import ru.sogya.projects.activity_and_charity.ui.theme.ActivityAndCharityTheme

@Composable
fun StatItemMainScreenComposable() {
    ActivityAndCharityTheme {
        Card(
        ){
            Image(
                painter = painterResource(id = R.drawable.rating_card_background),
                contentDescription = null
            )
            Column(
//                modifier = Modifier
//                    .
            ){

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun StatItemMainScreenPreview() {
    StatItemMainScreenComposable()
}