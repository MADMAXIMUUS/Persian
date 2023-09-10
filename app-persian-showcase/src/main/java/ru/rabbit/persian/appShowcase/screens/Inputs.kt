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
import ru.rabbit.persian.inputs.PersianInputs

object Inputs : Screen {
    override val name: String = "Inputs"
    override val navigation: String = "input"

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
                    SampleRow(text = "Input", firstItem = true) {
                        PersianInputs.Primary(value = "", onValueChange = {})
                    }
                }
                item {
                    SampleRow(text = "Input Error") {
                        PersianInputs.Primary(value = "", onValueChange = {}, isError = true)
                    }
                }
                item {
                    SampleRow(text = "Input Success") {
                        PersianInputs.Primary(value = "", onValueChange = {}, isSuccess = true)
                    }
                }
                item {
                    SampleRow(text = "Input Disabled") {
                        PersianInputs.Primary(value = "", onValueChange = {}, enabled = false)
                    }
                }
                item {
                    SampleRow(text = "Input Placeholder") {
                        PersianInputs.Primary(
                            value = "",
                            onValueChange = {},
                            placeholder = "Placeholder"
                        )
                    }
                }
                item {
                    SampleRow(text = "Input Placeholder Error") {
                        PersianInputs.Primary(
                            value = "",
                            onValueChange = {},
                            placeholder = "Placeholder",
                            isError = true
                        )
                    }
                }
                item {
                    SampleRow(text = "Input Placeholder Success") {
                        PersianInputs.Primary(
                            value = "",
                            onValueChange = {},
                            placeholder = "Placeholder",
                            isSuccess = true
                        )
                    }
                }
                item {
                    SampleRow(text = "Input Placeholder Disabled") {
                        PersianInputs.Primary(
                            value = "",
                            onValueChange = {},
                            placeholder = "Placeholder",
                            enabled = false
                        )
                    }
                }
                item {
                    SampleRow(text = "Input Input Text") {
                        PersianInputs.Primary(
                            value = "Some input",
                            onValueChange = {},
                        )
                    }
                }
                item {
                    SampleRow(text = "Input Placeholder Error") {
                        PersianInputs.Primary(
                            value = "Some input",
                            onValueChange = {},
                            isError = true
                        )
                    }
                }
                item {
                    SampleRow(text = "Input Placeholder Success") {
                        PersianInputs.Primary(
                            value = "Some input",
                            onValueChange = {},
                            isSuccess = true
                        )
                    }
                }
                item {
                    SampleRow(text = "Input Placeholder Disabled") {
                        PersianInputs.Primary(
                            value = "Some input",
                            onValueChange = {},
                            enabled = false
                        )
                    }
                }
                item {
                    SampleRow(text = "Input Input Text + Leading Icon") {
                        PersianInputs.Primary(
                            value = "Some input",
                            onValueChange = {},
                            leadingIcon = MaterialTheme.icons.mailOutlined
                        )
                    }
                }
                item {
                    SampleRow(text = "Input Placeholder Error + Leading Icon") {
                        PersianInputs.Primary(
                            value = "Some input",
                            onValueChange = {},
                            isError = true,
                            leadingIcon = MaterialTheme.icons.mailOutlined
                        )
                    }
                }
                item {
                    SampleRow(text = "Input Placeholder Success + Leading Icon") {
                        PersianInputs.Primary(
                            value = "Some input",
                            onValueChange = {},
                            isSuccess = true,
                            leadingIcon = MaterialTheme.icons.mailOutlined
                        )
                    }
                }
                item {
                    SampleRow(text = "Input Placeholder Disabled + Leading Icon") {
                        PersianInputs.Primary(
                            value = "Some input",
                            onValueChange = {},
                            enabled = false,
                            leadingIcon = MaterialTheme.icons.mailOutlined
                        )
                    }
                }
                item {
                    SampleRow(text = "Input Input Text + Trailing Icon") {
                        PersianInputs.Primary(
                            value = "Some input",
                            onValueChange = {},
                            trailingIcon = MaterialTheme.icons.visibility
                        )
                    }
                }
                item {
                    SampleRow(text = "Input Placeholder Error + Trailing Icon") {
                        PersianInputs.Primary(
                            value = "Some input",
                            onValueChange = {},
                            isError = true,
                            trailingIcon = MaterialTheme.icons.visibility
                        )
                    }
                }
                item {
                    SampleRow(text = "Input Placeholder Success + Trailing Icon") {
                        PersianInputs.Primary(
                            value = "Some input",
                            onValueChange = {},
                            isSuccess = true,
                            trailingIcon = MaterialTheme.icons.visibility
                        )
                    }
                }
                item {
                    SampleRow(text = "Input Placeholder Disabled + Trailing Icon") {
                        PersianInputs.Primary(
                            value = "Some input",
                            onValueChange = {},
                            enabled = false,
                            trailingIcon = MaterialTheme.icons.visibility
                        )
                    }
                }
                item {
                    SampleRow(text = "Input Input Text + Suffix") {
                        PersianInputs.Primary(
                            value = "Some input",
                            onValueChange = {},
                            suffix = "25"
                        )
                    }
                }
                item {
                    SampleRow(text = "Input Placeholder Error + Suffix") {
                        PersianInputs.Primary(
                            value = "Some input",
                            onValueChange = {},
                            isError = true,
                            suffix = "25"
                        )
                    }
                }
                item {
                    SampleRow(text = "Input Placeholder Success + Suffix") {
                        PersianInputs.Primary(
                            value = "Some input",
                            onValueChange = {},
                            isSuccess = true,
                            suffix = "25"
                        )
                    }
                }
                item {
                    SampleRow(text = "Input Placeholder Disabled + Suffix", lastItem = true) {
                        PersianInputs.Primary(
                            value = "Some input",
                            onValueChange = {},
                            enabled = false,
                            suffix = "25"
                        )
                    }
                }
            }
        }
    }
}