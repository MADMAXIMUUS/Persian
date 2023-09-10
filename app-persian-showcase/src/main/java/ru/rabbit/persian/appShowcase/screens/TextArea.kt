package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.navigation.NavController
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold
import ru.rabbit.persian.foundation.icons
import ru.rabbit.persian.textAreas.PersianTextAreas

object TextArea : Screen {

    override val name: String = "Text Areas"

    override val navigation: String = "textArea"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() },
            topAppBarScrollBehavior = topAppBarScrollBehavior
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection),
                contentPadding = it
            ) {
                item {
                    SampleRow(text = "Text Area", firstItem = true) {
                        PersianTextAreas.Primary(value = "", onValueChange = {})
                    }
                }
                item {
                    SampleRow(text = "Text Area Error") {
                        PersianTextAreas.Primary(value = "", onValueChange = {}, isError = true)
                    }
                }
                item {
                    SampleRow(text = "Text Area Success") {
                        PersianTextAreas.Primary(value = "", onValueChange = {}, isSuccess = true)
                    }
                }
                item {
                    SampleRow(text = "Text Area Disabled") {
                        PersianTextAreas.Primary(value = "", onValueChange = {}, enabled = false)
                    }
                }
                item {
                    SampleRow(text = "Text Area Placeholder") {
                        PersianTextAreas.Primary(
                            value = "",
                            onValueChange = {},
                            placeholder = "Placeholder"
                        )
                    }
                }
                item {
                    SampleRow(text = "Text Area Placeholder Error") {
                        PersianTextAreas.Primary(
                            value = "",
                            onValueChange = {},
                            placeholder = "Placeholder",
                            isError = true
                        )
                    }
                }
                item {
                    SampleRow(text = "Text Area Placeholder Success") {
                        PersianTextAreas.Primary(
                            value = "",
                            onValueChange = {},
                            placeholder = "Placeholder",
                            isSuccess = true
                        )
                    }
                }
                item {
                    SampleRow(text = "Text Area Placeholder Disabled") {
                        PersianTextAreas.Primary(
                            value = "",
                            onValueChange = {},
                            placeholder = "Placeholder",
                            enabled = false
                        )
                    }
                }
                item {
                    SampleRow(text = "Text Area Input Text") {
                        PersianTextAreas.Primary(
                            value = "Some input",
                            onValueChange = {},
                        )
                    }
                }
                item {
                    SampleRow(text = "Text Area Placeholder Error") {
                        PersianTextAreas.Primary(
                            value = "Some input",
                            onValueChange = {},
                            isError = true
                        )
                    }
                }
                item {
                    SampleRow(text = "Text Area Placeholder Success") {
                        PersianTextAreas.Primary(
                            value = "Some input",
                            onValueChange = {},
                            isSuccess = true
                        )
                    }
                }
                item {
                    SampleRow(text = "Text Area Placeholder Disabled") {
                        PersianTextAreas.Primary(
                            value = "Some input",
                            onValueChange = {},
                            enabled = false
                        )
                    }
                }
                item {
                    SampleRow(text = "Text Area Input Text + Leading Icon") {
                        PersianTextAreas.Primary(
                            value = "Some input",
                            onValueChange = {},
                            leadingIcon = MaterialTheme.icons.mailOutlined
                        )
                    }
                }
                item {
                    SampleRow(text = "Text Area Placeholder Error + Leading Icon") {
                        PersianTextAreas.Primary(
                            value = "Some input",
                            onValueChange = {},
                            isError = true,
                            leadingIcon = MaterialTheme.icons.mailOutlined
                        )
                    }
                }
                item {
                    SampleRow(text = "Text Area Placeholder Success + Leading Icon") {
                        PersianTextAreas.Primary(
                            value = "Some input",
                            onValueChange = {},
                            isSuccess = true,
                            leadingIcon = MaterialTheme.icons.mailOutlined
                        )
                    }
                }
                item {
                    SampleRow(
                        text = "Text Area Placeholder Disabled + Leading Icon",
                        lastItem = true
                    ) {
                        PersianTextAreas.Primary(
                            value = "Some input",
                            onValueChange = {},
                            enabled = false,
                            leadingIcon = MaterialTheme.icons.mailOutlined
                        )
                    }
                }
            }
        }
    }
}