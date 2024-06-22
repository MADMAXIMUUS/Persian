package io.github.madmaximuus.persian.chips.suggestion

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.avatarsAndImages.AvatarDefaults
import io.github.madmaximuus.persian.avatarsAndImages.ImageDefaults
import io.github.madmaximuus.persian.chips.founfation.ChipColors
import io.github.madmaximuus.persian.chips.founfation.ChipElevation
import io.github.madmaximuus.persian.chips.founfation.ChipSizes
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state38
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSize

object SuggestionChipDefaults {

    @Composable
    fun chipColors(
        containerColor: Color = Color.Transparent,
        labelColor: Color = PersianTheme.colorScheme.onSurface,
        leadingIconColor: Color = PersianTheme.colorScheme.primary,
        disabledContainerColor: Color = Color.Transparent,
        disabledLabelColor: Color = PersianTheme.colorScheme.onSurface.state38,
        disabledLeadingIconContentColor: Color = PersianTheme.colorScheme.onSurface.state38,
        borderColor: Color = PersianTheme.colorScheme.primary,
        disabledBorderColor: Color = PersianTheme.colorScheme.onSurface.state38,
    ): ChipColors = ChipColors(
        containerColor = containerColor,
        labelColor = labelColor,
        leadingIconContentColor = leadingIconColor,
        trailingIconContentColor = leadingIconColor,
        disabledContainerColor = disabledContainerColor,
        disabledLabelColor = disabledLabelColor,
        disabledLeadingIconContentColor = disabledLeadingIconContentColor,
        disabledTrailingIconContentColor = disabledLeadingIconContentColor,
        borderColor = borderColor,
        disabledBorderColor = disabledBorderColor,
        imageColors = ImageDefaults.colors(),
        avatarColors = AvatarDefaults.colors()
    )

    @Composable
    fun chipSizes(
        trailingIconSize: IconSize = IconDefaults.size18(),
        leadingIconSize: IconSize = IconDefaults.size18(),
        labelStyle: TextStyle = PersianTheme.typography.labelLarge,
        borderWidth: Dp = 1.dp,
        shape: Shape = PersianTheme.shapes.shape10,
        disabledBorderWith: Dp = 0.dp,
    ): ChipSizes = ChipSizes(
        trailingIconSize = trailingIconSize,
        leadingIconSize = leadingIconSize,
        labelStyle = labelStyle,
        borderWidth = borderWidth,
        shape = shape,
        disabledBorderWith = disabledBorderWith,
        leadingImageSize = ImageDefaults.size24(),
    )

    @Composable
    fun chipElevation(
        elevation: Dp = PersianTheme.elevation.none,
        pressedElevation: Dp = elevation,
        focusedElevation: Dp = elevation,
        hoveredElevation: Dp = elevation,
        draggedElevation: Dp = PersianTheme.elevation.large,
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