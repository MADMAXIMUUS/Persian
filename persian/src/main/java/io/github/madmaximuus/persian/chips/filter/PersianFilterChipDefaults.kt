package io.github.madmaximuus.persian.chips.filter

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.chips.founfation.SelectableChipColors
import io.github.madmaximuus.persian.chips.founfation.SelectableChipElevation
import io.github.madmaximuus.persian.chips.founfation.SelectableChipSizes
import io.github.madmaximuus.persian.foundation.PersianContentStateDisabled
import io.github.madmaximuus.persian.foundation.PersianStatesDisabled
import io.github.madmaximuus.persian.foundation.elevation
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.iconBox.IconBoxSize
import io.github.madmaximuus.persian.iconBox.PersianIconBoxDefaults

object PersianFilterChipDefaults {

    @Composable
    fun chipColors(
        containerColor: Color = Color.Transparent,
        labelColor: Color = MaterialTheme.extendedColorScheme.onSurface,
        leadingIconColor: Color = MaterialTheme.extendedColorScheme.primary,
        trailingLeadingIconColor: Color = MaterialTheme.extendedColorScheme.primary,
        disabledContainerColor: Color = Color.Transparent,
        disabledLabelColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianContentStateDisabled),
        disabledLeadingIconColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianContentStateDisabled),
        disabledTrailingIconColor: Color = disabledLeadingIconColor,
        selectedContainerColor: Color = MaterialTheme.extendedColorScheme.secondaryContainer,
        disabledSelectedContainerColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianStatesDisabled),
        selectedLabelColor: Color = MaterialTheme.extendedColorScheme.onSecondaryContainer,
        selectedLeadingIconColor: Color = MaterialTheme.extendedColorScheme.onSecondaryContainer,
        selectedTrailingIconColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        borderColor: Color = MaterialTheme.extendedColorScheme.primary,
        selectedBorderColor: Color = Color.Transparent,
        disabledBorderColor: Color = MaterialTheme.extendedColorScheme.onSurface
            .copy(alpha = PersianStatesDisabled),
        disabledSelectedBorderColor: Color = Color.Transparent
    ) = SelectableChipColors(
        containerColor = containerColor,
        labelColor = labelColor,
        leadingIconColor = leadingIconColor,
        trailingIconColor = trailingLeadingIconColor,
        disabledContainerColor = disabledContainerColor,
        disabledLabelColor = disabledLabelColor,
        disabledLeadingIconColor = disabledLeadingIconColor,
        disabledSelectedContainerColor = disabledTrailingIconColor,
        selectedContainerColor = selectedContainerColor,
        disabledTrailingIconColor = disabledSelectedContainerColor,
        selectedLabelColor = selectedLabelColor,
        selectedLeadingIconColor = selectedLeadingIconColor,
        selectedTrailingIconColor = selectedTrailingIconColor,
        borderColor = borderColor,
        selectedBorderColor = selectedBorderColor,
        disabledBorderColor = disabledBorderColor,
        disabledSelectedBorderColor = disabledSelectedBorderColor
    )

    @Composable
    fun chipSizes(
        trailingIconSize: IconBoxSize = PersianIconBoxDefaults.size18(),
        leadingIconSize: IconBoxSize = PersianIconBoxDefaults.size18(),
        labelStyle: TextStyle = MaterialTheme.typography.labelLarge,
        borderWidth: Dp = 1.dp,
        selectedBorderWith: Dp = 0.dp,
        shape: Shape = MaterialTheme.shapes.small,
        disabledBorderWith: Dp = 1.dp,
        selectedDisabledBorderWith: Dp = 0.dp
    ): SelectableChipSizes = SelectableChipSizes(
        trailingIconSize = trailingIconSize,
        leadingIconSize = leadingIconSize,
        labelStyle = labelStyle,
        borderWidth = borderWidth,
        selectedBorderWith = selectedBorderWith,
        shape = shape,
        disabledBorderWith = disabledBorderWith,
        selectedDisabledBorderWith = selectedDisabledBorderWith
    )

    @Composable
    fun chipElevation(
        elevation: Dp = MaterialTheme.elevation.none,
        pressedElevation: Dp = MaterialTheme.elevation.none,
        focusedElevation: Dp = MaterialTheme.elevation.none,
        hoveredElevation: Dp = MaterialTheme.elevation.extraSmall,
        draggedElevation: Dp = MaterialTheme.elevation.large,
        disabledElevation: Dp = elevation
    ): SelectableChipElevation = SelectableChipElevation(
        elevation = elevation,
        pressedElevation = pressedElevation,
        focusedElevation = focusedElevation,
        hoveredElevation = hoveredElevation,
        draggedElevation = draggedElevation,
        disabledElevation = disabledElevation
    )

}