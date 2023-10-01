package ru.sogya.projects.activity_and_charity.ui.screens.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import ru.sogya.projects.activity_and_charity.R
import ru.sogya.projects.activity_and_charity.ui.navigation.BottomBarScreen
import ru.sogya.projects.activity_and_charity.ui.theme.ActivityAndCharityTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AuthScreenComposable(
    onClick: () -> Unit
) {

    ActivityAndCharityTheme {
        Column(
            modifier = Modifier
                .background(
                    color = ActivityAndCharityTheme.colors.primary
                )
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painter = painterResource(R.drawable.ic_bottom_navigation_profile_focused),
                contentDescription = null,
                modifier = Modifier
                    .padding(
                        top = 32.dp
                    )
                    .size(60.dp)
            )
            Text(
                text = stringResource(id = R.string.sing_up_or_in),
                fontFamily = ActivityAndCharityTheme.typography.regularMedium.fontFamily,
                fontSize = 20.sp,
                color = ActivityAndCharityTheme.colors.white,
                modifier = Modifier
                    .padding(
                        top = 12.dp
                    )
            )

            var email by remember {
                mutableStateOf(
                    TextFieldValue("")
                )
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = 24.dp,
                        start = 16.dp,
                        end = 16.dp
                    ),
                colors = CardDefaults.cardColors(
                    containerColor = ActivityAndCharityTheme.colors.secondary
                ),
                shape = ActivityAndCharityTheme.shape.cornersStyle,
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 0.dp
                )
            ) {
                TextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp),
                    value = email,
                    onValueChange = { newText ->
                        email = newText
                    },
                    singleLine = true,
                    colors = TextFieldDefaults.textFieldColors(
                        textColor = ActivityAndCharityTheme.colors.white,
                        containerColor = ActivityAndCharityTheme.colors.secondary,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        focusedLabelColor = ActivityAndCharityTheme.colors.accent,
                        unfocusedLabelColor = ActivityAndCharityTheme.colors.accent,
                        cursorColor = ActivityAndCharityTheme.colors.accent
                    ),
                    label = {
                        Text(
                            text = stringResource(id = R.string.type_email),
                            fontFamily = ActivityAndCharityTheme.typography.regular.fontFamily,
                            fontSize = 17.sp
                        )
                    },
                    shape = ActivityAndCharityTheme.shape.cornersStyle,
                    textStyle = TextStyle(
                        fontFamily = ActivityAndCharityTheme.typography.regular.fontFamily
                    )
                )
            }

            Button(
                onClick = {
                          onClick()
                },
                shape = ActivityAndCharityTheme.shape.cornersStyle,
                colors = ButtonDefaults.buttonColors(
                    containerColor = ActivityAndCharityTheme.colors.accent
                ),
                modifier = Modifier
                    .fillMaxWidth()
//                    .height(40.dp)
                    .padding(
                        top = 24.dp,
                        start = 16.dp,
                        end = 16.dp
                    )
            ) {

                Text(
                    text = stringResource(id = R.string.continue_),
                    color = ActivityAndCharityTheme.colors.primary,
                    fontFamily = ActivityAndCharityTheme.typography.regular.fontFamily,
                    fontSize = 17.sp
                )

            }
        }
    }
}

@Preview
@Composable
private fun AuthScreenPreview() {
    AuthScreenComposable(
        onClick = { }
    )
}