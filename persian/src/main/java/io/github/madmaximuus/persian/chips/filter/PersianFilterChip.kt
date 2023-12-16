package io.github.madmaximuus.persian.chips.filter

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SelectableChipBorder
import androidx.compose.material3.SelectableChipColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import io.github.madmaximuus.persian.foundation.icons
import io.github.madmaximuus.persian.iconBox.PersianIconBox
import io.github.madmaximuus.persian.iconBox.PersianIconBoxDefaults

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PersianFilterChip(
    title: String,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    leadingIcon: Painter? = null,
    trailingIcon: Painter? = null,
    colors: SelectableChipColors = PersianFilterChipDefaults.chipColors(),
    border: SelectableChipBorder = PersianFilterChipDefaults.chipBorder(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    FilterChip(
        modifier = modifier,
        selected = selected,
        onClick = onClick,
        colors = colors,
        enabled = enabled,
        border = border,
        interactionSource = interactionSource,
        label = {
            Text(
                text = title,
                style = MaterialTheme.typography.labelLarge
            )
        },
        leadingIcon = if (selected) {
            {
                PersianIconBox(
                    icon = MaterialTheme.icons.done,
                    size = PersianIconBoxDefaults.medium()
                )
            }
        } else if (leadingIcon != null) {
            {
                PersianIconBox(
                    icon = leadingIcon,
                    size = PersianIconBoxDefaults.medium()
                )
            }
        } else null,
        trailingIcon = if (trailingIcon != null) {
            {
                PersianIconBox(
                    icon = trailingIcon,
                    size = PersianIconBoxDefaults.medium()
                )
            }
        } else null
    )
}