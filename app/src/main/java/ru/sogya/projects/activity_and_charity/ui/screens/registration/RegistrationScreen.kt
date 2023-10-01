package ru.sogya.projects.activity_and_charity.ui.screens.registration

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.BottomSheetDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.rememberModalBottomSheetState
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
import ru.sogya.projects.activity_and_charity.R
import ru.sogya.projects.activity_and_charity.ui.theme.ActivityAndCharityTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegistrationScreenComposable(){

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
                text = stringResource(id = R.string.registration),
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

            var password by remember {
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
                    colors = TextFieldDefaults.colors(
                        focusedTextColor = ActivityAndCharityTheme.colors.white,
                        unfocusedTextColor = ActivityAndCharityTheme.colors.white,
                        focusedContainerColor = ActivityAndCharityTheme.colors.secondary,
                        unfocusedContainerColor = ActivityAndCharityTheme.colors.secondary,
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
                    value = password,
                    onValueChange = { newText ->
                        password = newText
                    },
                    singleLine = true,
                    colors = TextFieldDefaults.colors(
                        focusedTextColor = ActivityAndCharityTheme.colors.white,
                        unfocusedTextColor = ActivityAndCharityTheme.colors.white,
                        focusedContainerColor = ActivityAndCharityTheme.colors.secondary,
                        unfocusedContainerColor = ActivityAndCharityTheme.colors.secondary,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        focusedLabelColor = ActivityAndCharityTheme.colors.accent,
                        unfocusedLabelColor = ActivityAndCharityTheme.colors.accent,
                        cursorColor = ActivityAndCharityTheme.colors.accent
                    ),
                    label = {
                        Text(
                            text = stringResource(id = R.string.type_pass),
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
                    .clickable {

                    }
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        text = stringResource(id = R.string.department),
                        color = ActivityAndCharityTheme.colors.white,
                        fontFamily = ActivityAndCharityTheme.typography.regular.fontFamily,
                        fontSize = 16.sp,
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Text(
                            text = stringResource(id = R.string.not_selected),
                            color = ActivityAndCharityTheme.colors.secondaryText,
                            fontFamily = ActivityAndCharityTheme.typography.regular.fontFamily,
                            fontSize = 16.sp,
                        )
                        Image(
                            painter = painterResource(id = R.drawable.ic_arrow_forward),
                            contentDescription = null
                        )
                    }
                }
            }

            Button(
                onClick = {

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
                    text = stringResource(id = R.string.sing_up),
                    color = ActivityAndCharityTheme.colors.primary,
                    fontFamily = ActivityAndCharityTheme.typography.regular.fontFamily,
                    fontSize = 17.sp
                )

            }

            BottomSheetComposable()
        }
    }
}

@Composable
private fun BottomSheetComposable() {

    var showSheet by remember { mutableStateOf(false) }

    if (showSheet) {
        BottomSheet {
            showSheet = false
        }
    }

    ActivityAndCharityTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(onClick = {
                    showSheet = true
                }) {
                    Text(text = "Show BottomSheet")
                }
            }
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomSheet(onDismiss: () -> Unit) {
    val modalBottomSheetState = rememberModalBottomSheetState()

    ModalBottomSheet(
        onDismissRequest = { onDismiss() },
        sheetState = modalBottomSheetState,
        dragHandle = { BottomSheetDefaults.DragHandle() },
    ) {
        CountryList()
    }
}

@Composable
fun CountryList() {
    val departments = arrayOf("Информационные технологии", "Бухгалтерия")

    LazyColumn {

        items(departments) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp, horizontal = 20.dp)
            ) {
                Text(text = it)
            }
        }
    }
}

@Preview
@Composable
private fun RegistrationScreenPreview(){
    RegistrationScreenComposable()
}