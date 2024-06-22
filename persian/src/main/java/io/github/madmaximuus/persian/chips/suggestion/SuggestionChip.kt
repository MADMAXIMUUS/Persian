package io.github.madmaximuus.persian.chips.suggestion

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.chips.founfation.BaseChip
import io.github.madmaximuus.persian.chips.founfation.ChipColors
import io.github.madmaximuus.persian.chips.founfation.ChipElevation
import io.github.madmaximuus.persian.chips.founfation.ChipSizes

@Composable
fun PersianSuggestionChip(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    leading: (@Composable SuggestionChipLeadingScope.() -> Unit)?,
    colors: ChipColors = SuggestionChipDefaults.chipColors(),
    sizes: ChipSizes = SuggestionChipDefaults.chipSizes(),
    elevation: ChipElevation = SuggestionChipDefaults.chipElevation(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) = BaseChip(
    modifier = modifier,
    onClick = onClick,
    enabled = enabled,
    label = label,
    colors = colors,
    sizes = sizes,
    elevation = elevation,
    interactionSource = interactionSource,
    leading = if (leading != null) {
        {
            with(
                SuggestionChipLeadingScope(
                    iconSize = sizes.leadingIconSize,
                    iconColor = colors.leadingIconContentColor(enabled),
                )
            ) {
                leading()
            }
        }
    } else null,
    trailing = null
)