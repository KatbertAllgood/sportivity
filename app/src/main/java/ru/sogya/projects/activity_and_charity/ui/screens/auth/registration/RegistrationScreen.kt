package ru.sogya.projects.activity_and_charity.ui.screens.auth.registration

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import ru.sogya.projects.activity_and_charity.R
import ru.sogya.projects.activity_and_charity.ui.component.AuthCard
import ru.sogya.projects.activity_and_charity.ui.component.AuthLabel
import ru.sogya.projects.activity_and_charity.ui.component.PrimaryButton
import ru.sogya.projects.activity_and_charity.ui.screens.auth.AuthState
import ru.sogya.projects.activity_and_charity.ui.theme.ActivityAndCharityTheme
import ru.sogya.projects.activity_and_charity.ui.theme.AppTheme

@Composable
fun RegistrationScreenContent(
    email: String?,
    viewModel: RegistrationVM = hiltViewModel(),
    onNavigateToMainScreen: () -> Unit,
) {
    val authState by viewModel.getAuthStateFlow.collectAsState()
    val loadingState by viewModel.getLoadingStateFlow.collectAsState()

    var isButtonEnabled by rememberSaveable {
        mutableStateOf(false)
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


    when (authState) {
        is AuthState.Failure -> {
            Toast.makeText(
                LocalContext.current,
                (authState as AuthState.Failure).message,
                Toast.LENGTH_SHORT
            ).show()
        }

        is AuthState.Success ->
            onNavigateToMainScreen()

        else -> {}
    }

    AppTheme {
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
        ) {
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
                text = stringResource(R.string.sing_up),
                fontFamily = ActivityAndCharityTheme.typography.regularMedium.fontFamily,
                fontSize = 20.sp,
                color = ActivityAndCharityTheme.colors.white,
                modifier = Modifier
                    .padding(
                        top = 12.dp
                    )
            )

            AuthCard {
                TextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(52.dp),
                    value = fio,
                    onValueChange = { newText ->
                        fio = newText
                        isButtonEnabled = (newText != "" && password != "" && nickname != "")
                    },
                    singleLine = true,
                    colors = textFieldColors,
                    label = { AuthLabel(textId = R.string.fio) },
                    shape = ActivityAndCharityTheme.shape.cornersStyle,
                    textStyle = textFieldTextStyle,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                )
            }

            AuthCard {
                TextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(52.dp),
                    value = nickname,
                    onValueChange = { newText ->
                        nickname = newText
                        isButtonEnabled = (newText != "" && password != ""
                                && fio != "")
                    },
                    singleLine = true,
                    colors = textFieldColors,
                    label = { AuthLabel(textId = R.string.nickname) },
                    shape = ActivityAndCharityTheme.shape.cornersStyle,
                    textStyle = textFieldTextStyle,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                )
            }

            AuthCard {
                TextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(52.dp),
                    value = password,
                    onValueChange = { newText ->
                        password = newText
                        isButtonEnabled = (newText != ""
                                && fio != "" && nickname != "")
                    },
                    singleLine = true,
                    colors = textFieldColors,
                    label = { AuthLabel(textId = R.string.password) },
                    shape = ActivityAndCharityTheme.shape.cornersStyle,
                    textStyle = textFieldTextStyle,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                )
            }
            PrimaryButton(
                onClick = {
                    if (email != null) {
                        viewModel.signUp(name = fio, email = email, password = password)
                    }
                },
                isProgressBarVisible = loadingState,
                text = stringResource(R.string.sing_up),
                enabled = isButtonEnabled,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .padding(top = 24.dp)
                    .height(44.dp)
            )
        }
    }
}


//@Preview
//@Composable
//private fun RegistrationScreenPreview() {
//    RegistrationScreenContent()
//}