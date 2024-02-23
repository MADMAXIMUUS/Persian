package io.github.madmaximuus.persian.chips.assist

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
fun PersianAssistChip(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    leadingIcon: Painter? = null,
    colors: ChipColors = PersianAssistChipDefaults.chipColors(),
    sizes: ChipSizes = PersianAssistChipDefaults.chipSizes(),
    elevation: ChipElevation = PersianAssistChipDefaults.chipElevation(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) = BaseChip(
    modifier = modifier,
    onClick = onClick,
    enabled = enabled,
    label = label,
    leadingIcon = leadingIcon,
    trailingIcon = null,
    colors = colors,
    sizes = sizes,
    minHeight = 32.dp,
    paddingValues = PaddingValues(8.dp, 6.dp),
    elevation = elevation,
    interactionSource = interactionSource
)
