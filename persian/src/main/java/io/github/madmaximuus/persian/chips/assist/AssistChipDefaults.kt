package io.github.madmaximuus.persian.chips.assist

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.avatarsAndImages.AvatarDefaults
import io.github.madmaximuus.persian.avatarsAndImages.ImageColors
import io.github.madmaximuus.persian.avatarsAndImages.ImageDefaults
import io.github.madmaximuus.persian.avatarsAndImages.ImageSize
import io.github.madmaximuus.persian.chips.founfation.ChipColors
import io.github.madmaximuus.persian.chips.founfation.ChipElevation
import io.github.madmaximuus.persian.chips.founfation.ChipSizes
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state12
import io.github.madmaximuus.persian.foundation.state38
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSize

object AssistChipDefaults {

    @Composable
    fun chipColors(
        containerColor: Color = Color.Transparent,
        labelColor: Color = PersianTheme.colorScheme.onSurface,
        leadingIconContentColor: Color = PersianTheme.colorScheme.primary,
        disabledContainerColor: Color = Color.Transparent,
        disabledLabelColor: Color = PersianTheme.colorScheme.onSurface.state38,
        disabledLeadingIconColor: Color = PersianTheme.colorScheme.onSurface.state38,
        disabledTrailingIconColor: Color = disabledLeadingIconColor,
        borderColor: Color = PersianTheme.colorScheme.primary,
        disabledBorderColor: Color = PersianTheme.colorScheme.onSurface.state12,
        imageColors: ImageColors = ImageDefaults.colors()
    ): ChipColors = ChipColors(
        containerColor = containerColor,
        labelColor = labelColor,
        leadingIconContentColor = leadingIconContentColor,
        trailingIconContentColor = PersianTheme.colorScheme.onSurfaceVariant,
        borderColor = borderColor,
        disabledContainerColor = disabledContainerColor,
        disabledLabelColor = disabledLabelColor,
        disabledLeadingIconContentColor = disabledLeadingIconColor,
        disabledTrailingIconContentColor = disabledTrailingIconColor,
        disabledBorderColor = disabledBorderColor,

        avatarColors = AvatarDefaults.colors(),
        imageColors = imageColors
    )

    @Composable
    fun chipSizes(
        leadingIconSize: IconSize = IconDefaults.size18(),
        labelStyle: TextStyle = PersianTheme.typography.labelLarge,
        borderWidth: Dp = 1.dp,
        shape: Shape = PersianTheme.shapes.shape10,
        disabledBorderWith: Dp = 1.dp,
        leadingImageSize: ImageSize = ImageDefaults.size24(),
    ): ChipSizes = ChipSizes(
        trailingIconSize = IconDefaults.size18(),
        leadingIconSize = leadingIconSize,
        labelStyle = labelStyle,
        borderWidth = borderWidth,
        shape = shape,
        disabledBorderWith = disabledBorderWith,
        leadingImageSize = leadingImageSize
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