package ru.rabbit.persian.appShowcase.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
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
import io.github.madmaximuus.persian.checkboxes.Checkbox
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.input.InputsTransformations
import io.github.madmaximuus.persian.input.OutlineInput
import io.github.madmaximuus.persian.input.PlainInput
import io.github.madmaximuus.persian.select.PersianSelect
import io.github.madmaximuus.persian.select.SelectActionItem
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.user.base.User
import ru.rabbit.persian.appShowcase.R
import ru.rabbit.persian.appShowcase.componets.SampleScaffold

object Input : Screen {
    override val name: String = "Input"
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
        var style by remember { mutableStateOf("Outline") }
        var styleIndex by remember { mutableIntStateOf(1) }
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
                        PlainInput(
                            modifier = Modifier
                                .padding(horizontal = PersianTheme.spacing.size12),
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
                        OutlineInput(
                            modifier = Modifier
                                .padding(horizontal = PersianTheme.spacing.size12),
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
                        .padding(horizontal = PersianTheme.spacing.size12)
                        .padding(top = PersianTheme.spacing.size8)
                        .fillMaxWidth(),
                    selected = style,
                    values = styles,
                    onSelectedChange = { option, index ->
                        style = option
                        styleIndex = index
                    }
                )
                Checkbox(
                    modifier = Modifier
                        .padding(horizontal = PersianTheme.spacing.size12)
                        .padding(top = PersianTheme.spacing.size8)
                        .fillMaxWidth(),
                    text = "Enabled",
                    checked = enabled,
                    onCheckedChange = onEnabledChange
                )
                Checkbox(
                    modifier = Modifier
                        .padding(horizontal = PersianTheme.spacing.size12)
                        .fillMaxWidth(),
                    text = "Error",
                    checked = isError,
                    onCheckedChange = onIsErrorChange
                )
                Checkbox(
                    modifier = Modifier
                        .padding(horizontal = PersianTheme.spacing.size12)
                        .fillMaxWidth(),
                    text = "Valid",
                    checked = isSuccess,
                    onCheckedChange = onIsSuccessChange
                )
                Checkbox(
                    modifier = Modifier
                        .padding(horizontal = PersianTheme.spacing.size12)
                        .fillMaxWidth(),
                    text = "Placeholder",
                    checked = placeholder,
                    onCheckedChange = onPlaceholderChange
                )
                if (placeholder) {
                    OutlineInput(
                        modifier = Modifier
                            .padding(horizontal = PersianTheme.spacing.size12)
                            .fillMaxWidth(),
                        value = placeholderValue,
                        onValueChange = onPlaceholderValueChange
                    )
                }
                Checkbox(
                    modifier = Modifier
                        .padding(horizontal = PersianTheme.spacing.size12)
                        .fillMaxWidth(),
                    text = "Password",
                    checked = password,
                    onCheckedChange = onPasswordChange
                )
                Checkbox(
                    modifier = Modifier
                        .padding(horizontal = PersianTheme.spacing.size12)
                        .fillMaxWidth(),
                    text = "Leading Icon",
                    checked = leading,
                    onCheckedChange = onLeadingChange
                )
                Checkbox(
                    modifier = Modifier
                        .padding(horizontal = PersianTheme.spacing.size12)
                        .fillMaxWidth(),
                    text = "Trailing Icon",
                    checked = trailing,
                    onCheckedChange = onTrailingChange
                )
                Checkbox(
                    modifier = Modifier
                        .padding(horizontal = PersianTheme.spacing.size12)
                        .fillMaxWidth(),
                    text = "Suffix",
                    checked = suffix,
                    onCheckedChange = onSuffixChange
                )
            }
        }
    }
}