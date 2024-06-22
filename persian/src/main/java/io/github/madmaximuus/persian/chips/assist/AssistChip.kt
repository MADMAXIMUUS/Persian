package io.github.madmaximuus.persian.chips.assist

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.chips.founfation.BaseChip
import io.github.madmaximuus.persian.chips.founfation.ChipColors
import io.github.madmaximuus.persian.chips.founfation.ChipElevation
import io.github.madmaximuus.persian.chips.founfation.ChipSizes

@Composable
fun AssistChip(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    leading: (@Composable AssistChipLeadingScope.() -> Unit)? = null,
    colors: ChipColors = AssistChipDefaults.chipColors(),
    sizes: ChipSizes = AssistChipDefaults.chipSizes(),
    elevation: ChipElevation = AssistChipDefaults.chipElevation(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) = BaseChip(
    modifier = modifier,
    onClick = onClick,
    enabled = enabled,
    label = label,
    leading = if (leading != null) {
        {
            with(
                AssistChipLeadingScope(
                    enabled = enabled,
                    iconSize = sizes.leadingIconSize,
                    iconColor = colors.leadingIconContentColor(enabled),
                    imageSizes = sizes.leadingImageSize,
                    imageColors = colors.imageColors
                )
            ) {
                leading()
            }
        }
    } else null,
    trailing = null,
    colors = colors,
    sizes = sizes,
    elevation = elevation,
    interactionSource = interactionSource
)
