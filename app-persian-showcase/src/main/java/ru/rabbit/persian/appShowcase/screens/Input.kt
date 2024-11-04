package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import io.github.madmaximuus.persian.forms.Checkbox
import io.github.madmaximuus.persian.forms.Checkboxes
import io.github.madmaximuus.persian.forms.Form
import io.github.madmaximuus.persian.forms.Input
import io.github.madmaximuus.persian.forms.RadioButton
import io.github.madmaximuus.persian.forms.RadioButtons
import io.github.madmaximuus.persian.forms.Subhead
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.input.InputsTransformations
import io.github.madmaximuus.persian.input.OutlineInput
import io.github.madmaximuus.persian.input.PlainInput
import io.github.madmaximuus.persian.topAppBar.TopAppBarDefaults
import io.github.madmaximuus.persian.topAppBar.rememberTopAppBarState
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.user.base.User
import ru.rabbit.persian.appShowcase.R
import ru.rabbit.persian.appShowcase.componets.SampleRow
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Input : Screen {
    override val name: String = "Input"

    override val navigation: String = "input"

    @Composable
    override fun Content(navController: NavController?) {
        val topAppBarScrollBehavior =
            TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
        val (value, onValueChange) = remember { mutableStateOf("") }
        val (placeholderValue, onPlaceholderValueChange) = remember { mutableStateOf("Placeholder") }
        val (enabled, onEnabledChange) = remember { mutableStateOf(true) }
        val (isError, onIsErrorChange) = remember { mutableStateOf(false) }
        val (isSuccess, onIsSuccessChange) = remember { mutableStateOf(false) }
        val (placeholder, onPlaceholderChange) = remember { mutableStateOf(false) }
        val (password, onPasswordChange) = remember { mutableStateOf(false) }
        val (leading, onLeadingChange) = remember { mutableStateOf(false) }
        val (trailing, onTrailingChange) = remember { mutableStateOf(false) }
        val (suffix, onSuffixChange) = remember { mutableStateOf(false) }

        val styleStates = remember {
            listOf(
                mutableStateOf(true),
                mutableStateOf(false)
            )
        }

        SampleScaffold(
            title = name,
            onBackClick = { navController?.navigateUp() },
            topAppBarScrollBehavior = topAppBarScrollBehavior
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection)
                    .padding(it),
            ) {
                SampleRow(text = "Sample", firstItem = true) {
                    when {
                        styleStates[0].value -> {
                            OutlineInput(
                                value = value,
                                onValueChange = onValueChange,
                                enabled = enabled,
                                isError = isError,
                                isValid = isSuccess,
                                placeholder = if (placeholder) placeholderValue else null,
                                transformation = if (password) InputsTransformations.password else InputsTransformations.none,
                                leadingIcon = if (leading) rememberVectorPainter(image = PersianSymbols.Default.User) else null,
                                trailingIcon = if (trailing) painterResource(id = R.drawable.ic_visibility) else null,
                                suffix = if (suffix) "12" else null,
                                onTrailingIconClick = {}
                            )
                        }

                        styleStates[1].value -> {
                            PlainInput(
                                value = value,
                                onValueChange = onValueChange,
                                enabled = enabled,
                                isError = isError,
                                isValid = isSuccess,
                                placeholder = if (placeholder) placeholderValue else null,
                                transformation = if (password) InputsTransformations.password else InputsTransformations.none,
                                leadingIcon = if (leading) rememberVectorPainter(image = PersianSymbols.Default.User) else null,
                                trailingIcon = if (trailing) painterResource(id = R.drawable.ic_visibility) else null,
                                suffix = if (suffix) "12" else null,
                                onTrailingIconClick = {}
                            )
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
                                text = "Outlined",
                                selected = styleStates[0].value,
                                onSelectedChange = {
                                    styleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 0
                                    }
                                }
                            )
                            RadioButton(
                                text = "Plain",
                                selected = styleStates[1].value,
                                onSelectedChange = {
                                    styleStates.forEachIndexed { index, mutableState ->
                                        mutableState.value = index == 1
                                    }
                                }
                            )
                        }
                    }
                )
                if (placeholder) {
                    Form(
                        modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                        subhead = {
                            Subhead(text = "Placeholder")
                        },
                        content = {
                            Input(
                                value = placeholderValue,
                                onValueChange = onPlaceholderValueChange
                            )
                        }
                    )
                }
                Form(
                    modifier = Modifier.padding(top = PersianTheme.spacing.size12),
                    subhead = {
                        Subhead(text = "Style")
                    },
                    content = {
                        Checkboxes {
                            Checkbox(
                                text = "Enabled",
                                checked = enabled,
                                onCheckedChange = onEnabledChange
                            )
                            Checkbox(
                                text = "Error",
                                checked = isError,
                                onCheckedChange = onIsErrorChange
                            )
                            Checkbox(
                                text = "Valid",
                                checked = isSuccess,
                                onCheckedChange = onIsSuccessChange
                            )
                            Checkbox(
                                text = "Placeholder",
                                checked = placeholder,
                                onCheckedChange = onPlaceholderChange
                            )
                            Checkbox(
                                text = "Password",
                                checked = password,
                                onCheckedChange = onPasswordChange
                            )
                            Checkbox(
                                text = "Leading Icon",
                                checked = leading,
                                onCheckedChange = onLeadingChange
                            )
                            Checkbox(
                                text = "Trailing Icon",
                                checked = trailing,
                                onCheckedChange = onTrailingChange
                            )
                            Checkbox(
                                text = "Suffix",
                                checked = suffix,
                                onCheckedChange = onSuffixChange
                            )
                        }
                    }
                )

            }
        }
    }
}