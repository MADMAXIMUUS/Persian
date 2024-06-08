package io.github.madmaximuus.persian.chips.filter

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.chips.founfation.BaseSelectableChip
import io.github.madmaximuus.persian.chips.founfation.SelectableChipColors
import io.github.madmaximuus.persian.chips.founfation.SelectableChipElevation
import io.github.madmaximuus.persian.chips.founfation.SelectableChipSizes

@Composable
fun PersianFilterChip(
    label: String,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    leadingIcon: Painter? = null,
    trailingIcon: Painter? = null,
    onTrailingClick: (() -> Unit)? = null,
    colors: SelectableChipColors = PersianFilterChipDefaults.chipColors(),
    sizes: SelectableChipSizes = PersianFilterChipDefaults.chipSizes(),
    elevation: SelectableChipElevation = PersianFilterChipDefaults.chipElevation(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) = BaseSelectableChip(
    selected = selected,
    modifier = modifier,
    onClick = onClick,
    enabled = enabled,
    label = label,
    leadingIcon = leadingIcon,
    avatar = null,
    image = null,
    trailingIcon = trailingIcon,
    onTrailingClick = onTrailingClick,
    colors = colors,
    elevation = elevation,
    sizes = sizes,
    paddingValues = PaddingValues(4.dp, 0.dp),
    interactionSource = interactionSource
)