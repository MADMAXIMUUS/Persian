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
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianState38
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.text.Text

/**
 * A radio button is useful for allowing users to select one option from a set of mutually exclusive
 * choices, providing a clear and intuitive interface for making single-selection decisions. It offers
 * a straightforward and effective method for capturing user preferences, making it an essential tool
 * for enhancing user experience and data collection.
 *
 * @param modifier The modifier to be applied to the radio button.
 * @param text The text to be displayed next to the radio button.
 * @param selected The current checked state of the radio button.
 * @param enabled Whether the radio button is enabled or not. Default is true.
 * @param onSelectedChange A callback that is invoked when the checked state changes.
 * @param colors The colors to be used for the radio button.
 * @param sizes The sizes to be used for the radio button.
 */
@Composable
fun RadioButton(
    modifier: Modifier = Modifier,
    text: String,
    selected: Boolean,
    enabled: Boolean = true,
    onSelectedChange: (Boolean) -> Unit,
    colors: RadioButtonColors = RadioButtonDefaults.colors(),
    sizes: RadioButtonSizes = RadioButtonDefaults.sizes()
) {
    Row(
        modifier = modifier
            .clip(sizes.shape)
            .selectable(
                enabled = enabled,
                selected = selected,
                onClick = { onSelectedChange(!selected) },
                role = Role.RadioButton
            )
            .padding(sizes.contentPadding)
            .height(48.dp)
            .graphicsLayer {
                alpha = if (enabled) 1f
                else PersianState38
            },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size12)
    ) {
        RadioButtonToggle(
            modifier = Modifier
                .size(sizes.toggleSize),
            selected = selected,
            onClick = null,
            colors = colors.toggleColor
        )
        Text(
            modifier = Modifier,
            text = text,
            color = colors.textColor,
            style = sizes.textStyle
        )
    }
}