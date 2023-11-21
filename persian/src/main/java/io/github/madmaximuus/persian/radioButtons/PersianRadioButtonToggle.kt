package io.github.madmaximuus.persian.radioButtons

import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun PersianRadioButtonToggle(
    modifier: Modifier = Modifier,
    checked: Boolean,
    enabled: Boolean = true,
    onClick: (() -> Unit)?,
    colors: RadioButtonColors = PersianRadioButtonDefaults.toggleColors(),
) = RadioButton(
    modifier = modifier,
    enabled = enabled,
    selected = checked,
    onClick = onClick,
    colors = colors
)
