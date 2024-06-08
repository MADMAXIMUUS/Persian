package io.github.madmaximuus.persian.chips.suggestion

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
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
    icon: Painter? = null,
    colors: ChipColors = PersianSuggestionChipDefaults.chipColors(),
    sizes: ChipSizes = PersianSuggestionChipDefaults.chipSizes(),
    elevation: ChipElevation = PersianSuggestionChipDefaults.chipElevation(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) = BaseChip(
    modifier = modifier,
    onClick = onClick,
    enabled = enabled,
    label = label,
    leadingIcon = icon,
    trailingIcon = null,
    image = null,
    colors = colors,
    sizes = sizes,
    paddingValues = PaddingValues(4.dp, 0.dp),
    elevation = elevation,
    interactionSource = interactionSource
)