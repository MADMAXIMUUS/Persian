package io.github.madmaximuus.persian.chips.input

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.chips.founfation.BaseSelectableChip
import io.github.madmaximuus.persian.chips.founfation.SelectableChipColors
import io.github.madmaximuus.persian.chips.founfation.SelectableChipElevation
import io.github.madmaximuus.persian.chips.founfation.SelectableChipSizes

@Composable
fun PersianInputShip(
    label: String,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    leading: (@Composable InputChipLeadingScope.() -> Unit)? = null,
    trailing: (@Composable InputChipTrailingScope.() -> Unit)? = null,
    colors: SelectableChipColors = InputChipDefaults.chipColors(),
    elevation: SelectableChipElevation = InputChipDefaults.chipElevation(),
    sizes: SelectableChipSizes = InputChipDefaults.chipSizes(),
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
                InputChipLeadingScope(
                    enabled = enabled,
                    selected = selected,
                    iconSizes = sizes.leadingIconSizes,
                    iconColor = colors.leadingIconContentColor(enabled, selected),
                    avatarColors = colors.avatarColors,
                    avatarSizes = sizes.avatarSizes,
                    imageColors = colors.imageColors,
                    imageSizes = sizes.imageSizes
                )
            ) {
                leading()
            }
        }
    } else null,
    trailing = if (trailing != null) {
        {
            with(
                InputChipTrailingScope(
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