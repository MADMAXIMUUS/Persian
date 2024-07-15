package io.github.madmaximuus.persian.chips.filter

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.chips.founfation.BaseSelectableChip
import io.github.madmaximuus.persian.chips.founfation.SelectableChipColors
import io.github.madmaximuus.persian.chips.founfation.SelectableChipElevation
import io.github.madmaximuus.persian.chips.founfation.SelectableChipSizes

@Composable
fun FilterChip(
    label: String,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    leading: (@Composable FilterChipLeadingScope.() -> Unit)? = null,
    trailing: (@Composable FilterChipTrailingScope.() -> Unit)? = null,
    colors: SelectableChipColors = FilterChipDefaults.chipColors(),
    sizes: SelectableChipSizes = FilterChipDefaults.chipSizes(),
    elevation: SelectableChipElevation = FilterChipDefaults.chipElevation(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) = BaseSelectableChip(
    selected = selected,
    modifier = modifier,
    onClick = onClick,
    enabled = enabled,
    label = label,
    colors = colors,
    elevation = elevation,
    sizes = sizes,
    leading = if (leading != null) {
        {
            with(
                FilterChipLeadingScope(
                    enabled = enabled,
                    selected = selected,
                    iconSizes = sizes.leadingIconSizes,
                    iconColor = colors.leadingIconContentColor(enabled, selected)
                )
            ) {
                leading()
            }
        }
    } else null,
    trailing = if (trailing != null) {
        {
            with(
                FilterChipTrailingScope(
                    enabled = enabled,
                    iconSizes = sizes.trailingIconSizes,
                    iconColor = colors.trailingIconContentColor(enabled, selected)
                )
            ) {
                trailing()
            }
        }
    } else null,
    interactionSource = interactionSource
)