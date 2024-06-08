package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import io.github.madmaximuus.persian.checkboxes.PersianCheckbox
import io.github.madmaximuus.persian.inputs.InputsTransformations
import io.github.madmaximuus.persian.inputs.PersianOutlineInput
import io.github.madmaximuus.persian.inputs.PersianPlainInput
import io.github.madmaximuus.persian.select.PersianSelect
import io.github.madmaximuus.persian.select.SelectActionItem
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.user.base.User
import ru.rabbit.persian.appShowcase.R
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Inputs : Screen {
    override val name: String = "Inputs"
    override val navigation: String = "input"

    @OptIn(ExperimentalMaterial3Api::class)
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
        var style by remember { mutableStateOf("Plain") }
        var styleIndex by remember { mutableIntStateOf(0) }
        val styles = listOf(
            SelectActionItem.WithoutIcon("Plain"),
            SelectActionItem.WithoutIcon("Outline")
        )
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
                when (styleIndex) {
                    0 -> {
                        PersianPlainInput(
                            modifier = Modifier.padding(horizontal = 20.dp),
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

                    1 -> {
                        PersianOutlineInput(
                            modifier = Modifier.padding(horizontal = 20.dp),
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
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    modifier = Modifier.padding(horizontal = 20.dp),
                    text = "Settings"
                )
                PersianSelect(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp),
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
                    PersianOutlineInput(
                        modifier = Modifier.padding(horizontal = 20.dp),
                        value = placeholderValue,
                        onValueChange = onPlaceholderValueChange
                    )
                }
                PersianCheckbox(
                    modifier = Modifier.padding(horizontal = 20.dp),
                    text = "Password",
                    checked = password,
                    onCheckedChange = onPasswordChange
                )
                PersianCheckbox(
                    modifier = Modifier.padding(horizontal = 20.dp),
                    text = "Leading Icon",
                    checked = leading,
                    onCheckedChange = onLeadingChange
                )
                PersianCheckbox(
                    modifier = Modifier.padding(horizontal = 20.dp),
                    text = "Trailing Icon",
                    checked = trailing,
                    onCheckedChange = onTrailingChange
                )
                PersianCheckbox(
                    modifier = Modifier.padding(horizontal = 20.dp),
                    text = "Suffix",
                    checked = suffix,
                    onCheckedChange = onSuffixChange
                )
            }
        }
    }
}