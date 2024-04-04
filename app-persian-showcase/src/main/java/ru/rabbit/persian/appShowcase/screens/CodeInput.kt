package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import io.github.madmaximuus.persian.checkboxes.PersianCheckbox
import io.github.madmaximuus.persian.codeInput.PersianFourDigitCodeInput
import io.github.madmaximuus.persian.codeInput.PersianSixDigitCodeInput
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object CodeInput : Screen {
    override val name: String = "Code Input"

    override val navigation: String = "codeInput"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

        SampleScaffold(
            title = Inputs.name,
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

                    var isSuccess by remember { mutableStateOf(false) }
                    var isError by remember { mutableStateOf(false) }
                    var enabled by remember { mutableStateOf(true) }

                    var list by remember {
                        mutableStateOf(
                            listOf(
                                "",
                                "",
                                "",
                                ""
                            )
                        )
                    }

                    SampleRow(text = "Code Four Input", firstItem = true) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth(),
                            verticalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            PersianFourDigitCodeInput(
                                values = list,
                                enabled = enabled,
                                isValid = isSuccess,
                                isError = isError,
                                onValueChange = { value, index ->
                                    if (list[index].length != 1 || value.isEmpty()) {
                                        val tempList = list.toMutableList()
                                        tempList[index] = value
                                        list = tempList.toList()
                                    }
                                }
                            )
                            PersianCheckbox(
                                text = "Enabled",
                                checked = enabled,
                                onCheckedChange = { isChecked ->
                                    enabled = isChecked
                                }
                            )
                            PersianCheckbox(
                                text = "Success",
                                checked = isSuccess,
                                onCheckedChange = { isChecked ->
                                    isSuccess = isChecked
                                }
                            )
                            PersianCheckbox(
                                text = "Error",
                                checked = isError,
                                onCheckedChange = { isChecked ->
                                    isError = isChecked
                                }
                            )
                        }
                    }
                }
                item {

                    var isSuccess by remember { mutableStateOf(false) }
                    var isError by remember { mutableStateOf(false) }
                    var enabled by remember { mutableStateOf(true) }

                    var list by remember {
                        mutableStateOf(
                            listOf(
                                "",
                                "",
                                "",
                                "",
                                "",
                                ""
                            )
                        )
                    }

                    SampleRow(text = "Code Six Input") {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth(),
                            verticalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            PersianSixDigitCodeInput(
                                values = list,
                                enabled = enabled,
                                isValid = isSuccess,
                                isError = isError,
                                onValueChange = { value, index ->
                                    if (list[index].length != 1 || value.isEmpty()) {
                                        val tempList = list.toMutableList()
                                        tempList[index] = value
                                        list = tempList.toList()
                                    }
                                }
                            )
                            PersianCheckbox(
                                text = "Enabled",
                                checked = enabled,
                                onCheckedChange = { isChecked ->
                                    enabled = isChecked
                                }
                            )
                            PersianCheckbox(
                                text = "Success",
                                checked = isSuccess,
                                onCheckedChange = { isChecked ->
                                    isSuccess = isChecked
                                }
                            )
                            PersianCheckbox(
                                text = "Error",
                                checked = isError,
                                onCheckedChange = { isChecked ->
                                    isError = isChecked
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}