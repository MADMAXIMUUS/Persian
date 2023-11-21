package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import io.github.madmaximuus.persian.checkboxes.PersianCheckbox
import io.github.madmaximuus.persian.foundation.icons
import io.github.madmaximuus.persian.inputs.PersianInput
import io.github.madmaximuus.persian.textAreas.PersianTextAreas
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
            val (placeholderValue, onPlaceholderValueChange) = remember { mutableStateOf("") }
            val (enabled, onEnabledChange) = remember { mutableStateOf(true) }
            val (isError, onIsErrorChange) = remember { mutableStateOf(false) }
            val (isSuccess, onIsSuccessChange) = remember { mutableStateOf(false) }
            val (placeholder, onPlaceholderChange) = remember { mutableStateOf(false) }
            val (leading, onLeadingChange) = remember { mutableStateOf(false) }
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
                    PersianTextAreas(
                        modifier = Modifier.padding(horizontal = 20.dp),
                        value = value,
                        onValueChange = onValueChange,
                        enabled = enabled,
                        isError = isError,
                        isSuccess = isSuccess,
                        placeholder = if (placeholder) placeholderValue else null,
                        leadingIcon = if (leading) MaterialTheme.icons.appLogo else null,
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        modifier = Modifier.padding(horizontal = 20.dp),
                        text = "Settings"
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
                        text = "Is Success State",
                        checked = isSuccess,
                        onCheckedChange = onIsSuccessChange
                    )
                    PersianCheckbox(
                        modifier = Modifier.padding(horizontal = 20.dp),
                        text = "Placeholder",
                        checked = placeholder,
                        onCheckedChange = onPlaceholderChange
                    )
                    if (placeholder) {
                        PersianInput(
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