package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import io.github.madmaximuus.persian.checkboxes.PersianCheckbox
import io.github.madmaximuus.persian.foundation.icons
import io.github.madmaximuus.persian.inputs.PersianOutlineInput
import io.github.madmaximuus.persian.select.PersianSelect
import io.github.madmaximuus.persian.select.SelectActionItem
import io.github.madmaximuus.persian.textAreas.PersianOutlineTextArea
import io.github.madmaximuus.persian.textAreas.PersianPlainTextArea
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

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
            val (value, onValueChange) = remember { mutableStateOf("") }
            val (placeholderValue, onPlaceholderValueChange) = remember { mutableStateOf("Placeholder") }
            val (enabled, onEnabledChange) = remember { mutableStateOf(true) }
            val (isError, onIsErrorChange) = remember { mutableStateOf(false) }
            val (isValid, onIsSuccessChange) = remember { mutableStateOf(false) }
            val (placeholder, onPlaceholderChange) = remember { mutableStateOf(false) }
            val (leading, onLeadingChange) = remember { mutableStateOf(false) }
            var style by remember { mutableStateOf("Plain") }
            var styleIndex by remember { mutableIntStateOf(0) }
            val styles = listOf(
                SelectActionItem.WithoutIcon("Plain"),
                SelectActionItem.WithoutIcon("Outline")
            )
            SampleScaffold(
                title = Inputs.name,
                onBackClick = { navController?.navigateUp() },
                topAppBarScrollBehavior = topAppBarScrollBehavior
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .nestedScroll(topAppBarScrollBehavior.nestedScrollConnection)
                        .padding(it),
                ) {
                    when (styleIndex) {
                        0 -> {
                            PersianPlainTextArea(
                                modifier = Modifier.padding(horizontal = 20.dp),
                                value = value,
                                onValueChange = onValueChange,
                                enabled = enabled,
                                isError = isError,
                                isValid = isValid,
                                placeholder = if (placeholder) placeholderValue else null,
                                leadingIcon = if (leading) MaterialTheme.icons.person else null,
                            )
                        }

                        1 -> {
                            PersianOutlineTextArea(
                                modifier = Modifier.padding(horizontal = 20.dp),
                                value = value,
                                onValueChange = onValueChange,
                                enabled = enabled,
                                isError = isError,
                                isValid = isValid,
                                placeholder = if (placeholder) placeholderValue else null,
                                leadingIcon = if (leading) MaterialTheme.icons.person else null,
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        modifier = Modifier.padding(horizontal = 20.dp),
                        text = "Settings"
                    )
                    PersianSelect(
                        modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
                        selected = style,
                        values = styles,
                        onSelectedChange = { option, index ->
                            style = option
                            styleIndex = index
                        }
                    )
                    PersianCheckbox(
                        modifier = Modifier.padding(horizontal = 20.dp),
                        text = "Enabled",
                        checked = enabled,
                        onCheckedChange = onEnabledChange
                    )
                    PersianCheckbox(
                        modifier = Modifier.padding(horizontal = 20.dp),
                        text = "Is Error State",
                        checked = isError,
                        onCheckedChange = onIsErrorChange
                    )
                    PersianCheckbox(
                        modifier = Modifier.padding(horizontal = 20.dp),
                        text = "Is Valid State",
                        checked = isValid,
                        onCheckedChange = onIsSuccessChange
                    )
                    PersianCheckbox(
                        modifier = Modifier.padding(horizontal = 20.dp),
                        text = "Placeholder",
                        checked = placeholder,
                        onCheckedChange = onPlaceholderChange
                    )
                    if (placeholder) {
                        PersianOutlineInput(
                            modifier = Modifier.padding(horizontal = 20.dp),
                            value = placeholderValue,
                            onValueChange = onPlaceholderValueChange
                        )
                    }
                    PersianCheckbox(
                        modifier = Modifier.padding(horizontal = 20.dp),
                        text = "Leading Icon",
                        checked = leading,
                        onCheckedChange = onLeadingChange
                    )
                }
            }
        }
    }
}