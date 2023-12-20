package ru.sogya.projects.activity_and_charity.ui.screens.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
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
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.sogya.projects.activity_and_charity.R
import ru.sogya.projects.activity_and_charity.ui.theme.ActivityAndCharityTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AuthScreenComposable(
    onClick: () -> Unit
) {

    // begin / auth / reg

    var authMode by rememberSaveable {
        mutableStateOf("begin")
    }

    var isButtonEnabled by rememberSaveable{
        mutableStateOf(false)
    }

    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    var fio by remember {
        mutableStateOf("")
    }

    var nickname by remember {
        mutableStateOf("")
    }

    ActivityAndCharityTheme {


        val textFieldColors = TextFieldDefaults.colors(
            focusedTextColor = ActivityAndCharityTheme.colors.white,
            unfocusedTextColor = ActivityAndCharityTheme.colors.white,
            focusedContainerColor = ActivityAndCharityTheme.colors.secondary,
            unfocusedContainerColor = ActivityAndCharityTheme.colors.secondary,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            focusedLabelColor = ActivityAndCharityTheme.colors.accent,
            unfocusedLabelColor = ActivityAndCharityTheme.colors.accent,
            cursorColor = ActivityAndCharityTheme.colors.accent
        )

        val textFieldTextStyle = TextStyle(
            fontFamily = ActivityAndCharityTheme.typography.regular.fontFamily,
            fontSize = ActivityAndCharityTheme.typography.regular.fontSize
        )

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
                text = stringResource(
                    when(authMode) {
                        "begin" -> R.string.sing_up_or_in
                        "auth" -> R.string.entrance
                        "reg" -> R.string.registration
                        else -> 0
                    }
                ),
                fontFamily = ActivityAndCharityTheme.typography.regularMedium.fontFamily,
                fontSize = 20.sp,
                color = ActivityAndCharityTheme.colors.white,
                modifier = Modifier
                    .padding(
                        top = 12.dp
                    )
            )

            CardForTf {
                TextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(52.dp),
                    value = email,
                    onValueChange = { newText ->
                        email = newText

                        when (authMode) {
                            "begin" -> isButtonEnabled = (newText != "")
                            "auth" -> isButtonEnabled = (newText != "" && password != "")
                            "reg" -> isButtonEnabled = (newText != "" && password != ""
                                    && fio != "" && nickname != "")
                        }
                    },
                    singleLine = true,
                    colors = textFieldColors,
                    label = { TfLabel(textId = R.string.type_email) },
                    shape = ActivityAndCharityTheme.shape.cornersStyle,
                    textStyle = textFieldTextStyle,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                )
            }

            when (authMode) {
                "auth" -> {
                    CardForTf {
                        TextField(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(52.dp),
                            value = password,
                            onValueChange = { newText ->
                                password = newText
                                isButtonEnabled = (newText != "" && password != "")
                            },
                            singleLine = true,
                            colors = textFieldColors,
                            label = { TfLabel(textId = R.string.type_pass) },
                            shape = ActivityAndCharityTheme.shape.cornersStyle,
                            textStyle = textFieldTextStyle,
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                        )
                    }
                }
                "reg" -> {

                    CardForTf {
                        TextField(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(52.dp),
                            value = fio,
                            onValueChange = { newText ->
                                fio = newText
                                isButtonEnabled = (newText != "" && password != ""
                                        && fio != "" && nickname != "")
                            },
                            singleLine = true,
                            colors = textFieldColors,
                            label = { TfLabel(textId = R.string.fio) },
                            shape = ActivityAndCharityTheme.shape.cornersStyle,
                            textStyle = textFieldTextStyle,
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                        )
                    }

                    CardForTf {
                        TextField(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(52.dp),
                            value = nickname,
                            onValueChange = { newText ->
                                nickname = newText
                                isButtonEnabled = (newText != "" && password != ""
                                        && fio != "" && nickname != "")
                            },
                            singleLine = true,
                            colors = textFieldColors,
                            label = { TfLabel(textId = R.string.nickname) },
                            shape = ActivityAndCharityTheme.shape.cornersStyle,
                            textStyle = textFieldTextStyle,
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                        )
                    }

                    CardForTf {
                        TextField(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(52.dp),
                            value = password,
                            onValueChange = { newText ->
                                password = newText
                                isButtonEnabled = (newText != "" && password != ""
                                        && fio != "" && nickname != "")
                            },
                            singleLine = true,
                            colors = textFieldColors,
                            label = { TfLabel(textId = R.string.password) },
                            shape = ActivityAndCharityTheme.shape.cornersStyle,
                            textStyle = textFieldTextStyle,
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                        )
                    }
                }
            }

            Button(
                onClick = {
                    onClick()
                    when(authMode) {
                        "begin" -> authMode = "auth"
                        "auth" -> authMode = "reg"
                        "reg" -> authMode = "begin"
                    }
                    isButtonEnabled = false
                },
                shape = ActivityAndCharityTheme.shape.cornersStyle,
                colors = ButtonDefaults.buttonColors(
                    containerColor = ActivityAndCharityTheme.colors.accent,
                    disabledContentColor = ActivityAndCharityTheme.colors.primary,
                    disabledContainerColor = ActivityAndCharityTheme.colors.accentDisabled
                ),
                enabled = isButtonEnabled,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = 24.dp,
                        start = 16.dp,
                        end = 16.dp
                    )
                    .height(44.dp)
            ) {
                Text(
                    text = stringResource(
                        when(authMode) {
                            "begin" -> R.string.continue_
                            "auth" -> R.string.sing_in
                            "reg" -> R.string.sing_up
                            else -> 0
                        }
                    ),
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

@Composable
private fun TfLabel(
    textId: Int
) {
    ActivityAndCharityTheme {
        Text(
            text = stringResource(id = textId),
            fontFamily = ActivityAndCharityTheme.typography.regular.fontFamily,
            fontSize = 17.sp,
            color = ActivityAndCharityTheme.colors.secondaryText
        )
    }
}

@Composable
private fun CardForTf(
    content: @Composable () -> Unit
) {
    return ActivityAndCharityTheme {
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
        ) { content() }
    }
}