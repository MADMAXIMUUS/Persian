package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import io.github.madmaximuus.persian.checkboxes.Checkbox
import io.github.madmaximuus.persian.codeInput.FourDigitCodeInput
import io.github.madmaximuus.persian.codeInput.SixDigitCodeInput
import io.github.madmaximuus.persian.forms.Checkboxes
import io.github.madmaximuus.persian.forms.Form
import io.github.madmaximuus.persian.forms.RadioButton
import io.github.madmaximuus.persian.forms.RadioButtons
import io.github.madmaximuus.persian.forms.Subhead
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object CodeInput : Screen {
    override val name: String = "Code input"

    override val navigation: String = "codeInput"

    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

        SampleScaffold(
            title = Input.name,
            onBackClick = { navController?.navigateUp() },
            topAppBarScrollBehavior = topAppBarScrollBehavior
        ) {
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                var isSuccess by remember { mutableStateOf(false) }
                var isError by remember { mutableStateOf(false) }
                var enabled by remember { mutableStateOf(true) }
                var secret by remember { mutableStateOf(false) }
                var fourInputs by remember {
                    mutableStateOf(
                        listOf(
                            "",
                            "",
                            "",
                            ""
                        )
                    )
                }

                var sixInputs by remember {
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

                var selectedStyle by remember { mutableStateOf("Four") }
                val styleState = remember {
                    listOf(
                        mutableStateOf(true),
                        mutableStateOf(false),
                    )
                }

                SampleRow(text = "Sample") {
                    Box(Modifier.fillMaxWidth()) {
                        when (selectedStyle) {
                            "Four" -> {
                                FourDigitCodeInput(
                                    modifier = Modifier.fillMaxWidth(),
                                    values = fourInputs,
                                    enabled = enabled,
                                    isValid = isSuccess,
                                    isError = isError,
                                    isPassword = secret,
                                    onValueChange = { value, index ->
                                        if (fourInputs[index].length != 1 || value.isEmpty()) {
                                            val tempList = fourInputs.toMutableList()
                                            tempList[index] = value
                                            fourInputs = tempList.toList()
                                        }
                                    }
                                )
                            }

                            "Six" -> {
                                SixDigitCodeInput(
                                    modifier = Modifier.fillMaxWidth(),
                                    values = sixInputs,
                                    enabled = enabled,
                                    isValid = isSuccess,
                                    isError = isError,
                                    isPassword = secret,
                                    onValueChange = { value, index ->
                                        if (sixInputs[index].length != 1 || value.isEmpty()) {
                                            val tempList = sixInputs.toMutableList()
                                            tempList[index] = value
                                            sixInputs = tempList.toList()
                                        }
                                    }
                                )
                            }
                        }
                    }
                }
                Form(
                    modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                    subhead = {
                        Subhead(text = "Style")
                    },
                    content = {
                        RadioButtons {
                            RadioButton(
                                text = "Four digits",
                                selected = styleState[0].value,
                                onSelectedChange = {
                                    styleState.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                    selectedStyle = "Four"
                                }
                            )
                            RadioButton(
                                text = "Six digits",
                                selected = styleState[1].value,
                                onSelectedChange = {
                                    styleState.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 1
                                    }
                                    selectedStyle = "Six"
                                }
                            )
                        }
                    }
                )
                Form(
                    modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                    subhead = {
                        Subhead(text = "Settings")
                    },
                    content = {
                        Checkboxes {
                            Checkbox(
                                modifier = Modifier.fillMaxWidth(),
                                text = "Enabled",
                                checked = enabled,
                                onCheckedChange = { isChecked ->
                                    enabled = isChecked
                                }
                            )
                            Checkbox(
                                modifier = Modifier.fillMaxWidth(),
                                text = "Valid",
                                checked = isSuccess,
                                onCheckedChange = { isChecked ->
                                    isSuccess = isChecked
                                }
                            )
                            Checkbox(
                                modifier = Modifier.fillMaxWidth(),
                                text = "Error",
                                checked = isError,
                                onCheckedChange = { isChecked ->
                                    isError = isChecked
                                }
                            )
                            Checkbox(
                                modifier = Modifier.fillMaxWidth(),
                                text = "Secret",
                                checked = secret,
                                onCheckedChange = { isChecked ->
                                    secret = isChecked
                                }
                            )
                        }
                    }
                )
            }
        }
    }
}