package io.github.madmaximuus.persian.chips.input

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
import io.github.madmaximuus.persian.foundation.elevation
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.state12
import io.github.madmaximuus.persian.foundation.state38
import io.github.madmaximuus.persian.iconBox.IconBoxSize
import io.github.madmaximuus.persian.iconBox.PersianIconBoxDefaults

object PersianInputChipDefaults {

    @Composable
    fun chipColors(
        containerColor: Color = Color.Transparent,
        labelColor: Color = MaterialTheme.extendedColorScheme.onSurface,
        leadingIconColor: Color = MaterialTheme.extendedColorScheme.primary,
        trailingIconColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        disabledContainerColor: Color = Color.Transparent,
        disabledLabelColor: Color = MaterialTheme.extendedColorScheme.onSurface.state38,
        disabledLeadingIconColor: Color = MaterialTheme.extendedColorScheme.onSurface.state38,
        disabledTrailingIconColor: Color = disabledLeadingIconColor,
        selectedContainerColor: Color = MaterialTheme.extendedColorScheme.secondaryContainer,
        disabledSelectedContainerColor: Color = MaterialTheme.extendedColorScheme.onSurface.state12,
        selectedLabelColor: Color = MaterialTheme.extendedColorScheme.onSecondaryContainer,
        selectedLeadingIconColor: Color = MaterialTheme.extendedColorScheme.onSecondaryContainer,
        selectedTrailingIconColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        borderColor: Color = MaterialTheme.extendedColorScheme.primary,
        selectedBorderColor: Color = Color.Transparent,
        disabledBorderColor: Color = MaterialTheme.extendedColorScheme.onSurface.state12,
        disabledSelectedBorderColor: Color = Color.Transparent
    ): SelectableChipColors = SelectableChipColors(
        containerColor = containerColor,
        labelColor = labelColor,
        leadingIconColor = leadingIconColor,
        trailingIconColor = trailingIconColor,
        disabledContainerColor = disabledContainerColor,
        disabledLabelColor = disabledLabelColor,
        disabledLeadingIconColor = disabledLeadingIconColor,
        disabledTrailingIconColor = disabledTrailingIconColor,
        selectedContainerColor = selectedContainerColor,
        disabledSelectedContainerColor = disabledSelectedContainerColor,
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
        pressedElevation: Dp = elevation,
        focusedElevation: Dp = elevation,
        hoveredElevation: Dp = elevation,
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