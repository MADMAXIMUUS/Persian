package io.github.madmaximuus.persian.radioButton

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.selectable
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text

/**
 * A composable function that creates a radio button with a text label.
 *
 * @param modifier The modifier to be applied to the radio button.
 * @param text The text to be displayed next to the radio button.
 * @param checked The current checked state of the radio button.
 * @param enabled Whether the radio button is enabled or not. Default is true.
 * @param onCheckedChange A callback that is invoked when the checked state changes.
 * @param radioButtonColors The colors to be used for the radio button.
 * @param radioButtonSizes The sizes to be used for the radio button.
 */
@Composable
fun RadioButton(
    modifier: Modifier = Modifier,
    text: String,
    checked: Boolean,
    enabled: Boolean = true,
    onCheckedChange: (Boolean) -> Unit,
    radioButtonColors: RadioButtonColors = RadioButtonDefaults.colors(),
    radioButtonSizes: RadioButtonSizes = RadioButtonDefaults.sizes()
) {
    Row(
        modifier = modifier
            .clip(PersianTheme.shapes.shape16)
            .selectable(
                enabled = enabled,
                selected = checked,
                onClick = { onCheckedChange(!checked) },
                role = Role.RadioButton
            )
            .padding(radioButtonSizes.contentPadding)
            .height(48.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
    ) {
        RadioButtonToggle(
            modifier = Modifier
                .size(radioButtonSizes.toggleSize),
            selected = checked,
            enabled = enabled,
            onClick = null,
            colors = radioButtonColors.toggleColor
        )
        Text(
            modifier = Modifier,
            text = text,
            color = radioButtonColors.textColor(enabled),
            style = radioButtonSizes.textStyle
        )
    }
}