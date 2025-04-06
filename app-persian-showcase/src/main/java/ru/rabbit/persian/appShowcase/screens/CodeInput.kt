package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import io.github.madmaximuus.persian.codeInput.FourDigitCodeInput
import io.github.madmaximuus.persian.codeInput.SixDigitCodeInput
import io.github.madmaximuus.persian.formItem.Checkbox
import io.github.madmaximuus.persian.formItem.Checkboxes
import io.github.madmaximuus.persian.formItem.FormItem
import io.github.madmaximuus.persian.formItem.RadioButton
import io.github.madmaximuus.persian.formItem.RadioButtons
import io.github.madmaximuus.persian.formItem.Subhead
import io.github.madmaximuus.persian.internal.SecureInputSettings
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import ru.rabbit.persian.appShowcase.R
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object CodeInput : Screen {
    override val name: String = "Code input"

    override val image: Int = R.drawable.code_input

    override val navigation: String = "codeInput"

    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

        SampleScaffold(
            title = name,
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
                val fourInput = rememberTextFieldState("")
                val sixInput = rememberTextFieldState("")

                var selectedStyle by remember { mutableStateOf("Four") }
                val styleState = remember {
                    listOf(
                        mutableStateOf(true),
                        mutableStateOf(false),
                    )
                }

                SampleRow(text = "Sample") {
                    when (selectedStyle) {
                        "Four" -> {
                            FourDigitCodeInput(
                                modifier = Modifier.fillMaxWidth(),
                                state = fourInput,
                                enabled = enabled,
                                isValid = isSuccess,
                                isError = isError,
                                secure = if (secret) SecureInputSettings.Secure() else SecureInputSettings.NotSecure,
                            )
                        }

                        "Six" -> {
                            SixDigitCodeInput(
                                modifier = Modifier.fillMaxWidth(),
                                state = sixInput,
                                enabled = enabled,
                                isValid = isSuccess,
                                isError = isError,
                                secure = if (secret) SecureInputSettings.Secure() else SecureInputSettings.NotSecure,
                            )
                        }
                    }
                }
                FormItem(
                    subhead = { Subhead(text = "Style") },
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
                FormItem(
                    subhead = { Subhead(text = "Settings") },
                    content = {
                        Checkboxes {
                            Checkbox(
                                text = "Enabled",
                                checked = enabled,
                                onCheckedChange = { isChecked ->
                                    enabled = isChecked
                                }
                            )
                            Checkbox(
                                text = "Valid",
                                checked = isSuccess,
                                onCheckedChange = { isChecked ->
                                    isSuccess = isChecked
                                }
                            )
                            Checkbox(
                                text = "Error",
                                checked = isError,
                                onCheckedChange = { isChecked ->
                                    isError = isChecked
                                }
                            )
                            Checkbox(
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