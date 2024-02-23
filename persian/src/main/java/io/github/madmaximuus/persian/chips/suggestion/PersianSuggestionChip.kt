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
    colors = colors,
    sizes = sizes,
    minHeight = 32.dp,
    paddingValues = PaddingValues(8.dp, 6.dp),
    elevation = elevation,
    interactionSource = interactionSource
)