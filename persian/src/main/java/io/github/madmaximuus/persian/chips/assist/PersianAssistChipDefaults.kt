package io.github.madmaximuus.persian.chips.assist

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.chips.founfation.ChipColors
import io.github.madmaximuus.persian.chips.founfation.ChipElevation
import io.github.madmaximuus.persian.chips.founfation.ChipSizes
import io.github.madmaximuus.persian.foundation.elevation
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.shape
import io.github.madmaximuus.persian.foundation.state12
import io.github.madmaximuus.persian.foundation.state38
import io.github.madmaximuus.persian.iconBox.IconBoxSize
import io.github.madmaximuus.persian.iconBox.PersianIconBoxDefaults

object PersianAssistChipDefaults {

    @Composable
    fun chipColors(
        containerColor: Color = Color.Transparent,
        labelColor: Color = MaterialTheme.extendedColorScheme.onSurface,
        leadingIconContentColor: Color = MaterialTheme.extendedColorScheme.primary,
        trailingIconContentColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        disabledContainerColor: Color = Color.Transparent,
        disabledLabelColor: Color = MaterialTheme.extendedColorScheme.onSurface.state38,
        disabledLeadingIconColor: Color = MaterialTheme.extendedColorScheme.onSurface.state38,
        disabledTrailingIconColor: Color = disabledLeadingIconColor,
        borderColor: Color = MaterialTheme.extendedColorScheme.primary,
        disabledBorderColor: Color = MaterialTheme.extendedColorScheme.onSurface.state12
    ): ChipColors = ChipColors(
        containerColor = containerColor,
        labelColor = labelColor,
        leadingIconContentColor = leadingIconContentColor,
        trailingIconContentColor = trailingIconContentColor,
        borderColor = borderColor,
        disabledContainerColor = disabledContainerColor,
        disabledLabelColor = disabledLabelColor,
        disabledLeadingIconContentColor = disabledLeadingIconColor,
        disabledTrailingIconContentColor = disabledTrailingIconColor,
        disabledBorderColor = disabledBorderColor
    )

    @Composable
    fun chipSizes(
        trailingIconSize: IconBoxSize = PersianIconBoxDefaults.size18(),
        leadingIconSize: IconBoxSize = PersianIconBoxDefaults.size18(),
        labelStyle: TextStyle = MaterialTheme.typography.labelLarge,
        borderWidth: Dp = 1.dp,
        shape: Shape = MaterialTheme.shape.shape8,
        disabledBorderWith: Dp = 1.dp
    ): ChipSizes = ChipSizes(
        trailingIconSize = trailingIconSize,
        leadingIconSize = leadingIconSize,
        labelStyle = labelStyle,
        borderWidth = borderWidth,
        shape = shape,
        disabledBorderWith = disabledBorderWith
    )

    @Composable
    fun chipElevation(
        elevation: Dp = MaterialTheme.elevation.none,
        pressedElevation: Dp = elevation,
        focusedElevation: Dp = elevation,
        hoveredElevation: Dp = elevation,
        draggedElevation: Dp = MaterialTheme.elevation.large,
        disabledElevation: Dp = elevation
    ): ChipElevation = ChipElevation(
        elevation = elevation,
        pressedElevation = pressedElevation,
        focusedElevation = focusedElevation,
        hoveredElevation = hoveredElevation,
        draggedElevation = draggedElevation,
        disabledElevation = disabledElevation
    )

}