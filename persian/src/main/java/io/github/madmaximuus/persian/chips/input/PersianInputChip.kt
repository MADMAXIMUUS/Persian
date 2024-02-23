package io.github.madmaximuus.persian.chips.input

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
fun PersianInputShip(
    label: String,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    leadingIcon: Painter? = null,
    onTrailingClick: (() -> Unit)? = null,
    trailingIcon: Painter? = null,
    avatar: String? = null,
    colors: SelectableChipColors = PersianInputChipDefaults.chipColors(),
    elevation: SelectableChipElevation = PersianInputChipDefaults.chipElevation(),
    sizes: SelectableChipSizes = PersianInputChipDefaults.chipSizes(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) = BaseSelectableChip(
    selected = selected,
    modifier = modifier,
    onClick = onClick,
    enabled = enabled,
    label = label,
    leadingIcon = leadingIcon,
    avatar = avatar,
    trailingIcon = trailingIcon,
    onTrailingClick = onTrailingClick,
    colors = colors,
    elevation = elevation,
    sizes = sizes,
    minHeight = 32.dp,
    paddingValues = PaddingValues(8.dp, 6.dp),
    interactionSource = interactionSource
)