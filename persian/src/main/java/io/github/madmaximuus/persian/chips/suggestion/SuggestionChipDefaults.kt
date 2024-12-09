package io.github.madmaximuus.persian.chips.suggestion

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.avatarAndImage.AvatarDefaults
import io.github.madmaximuus.persian.avatarAndImage.ImageDefaults
import io.github.madmaximuus.persian.chips.founfation.ChipColors
import io.github.madmaximuus.persian.chips.founfation.ChipElevation
import io.github.madmaximuus.persian.chips.founfation.ChipSizes
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSizes

/**
 * Contains the default values used by [SuggestionChip].
 */
object SuggestionChipDefaults {

    /**
     * Creates a [ChipColors] that represents the default container and content colors used in an
     * [SuggestionChip].
     *
     * @param containerColor The color of the chip's container.
     * @param labelColor The color of the chip's label text.
     * @param leadingIconColor The color of the leading icon content.
     * @param borderColor The color of the chip's border.
     */
    @Composable
    fun chipColors(
        containerColor: Color = Color.Transparent,
        labelColor: Color = PersianTheme.colorScheme.onSurface,
        leadingIconColor: Color = PersianTheme.colorScheme.primary,
        borderColor: Color = PersianTheme.colorScheme.primary
    ): ChipColors =
        ChipColors(
            containerColor = containerColor,
            labelColor = labelColor,
            leadingIconContentColor = leadingIconColor,
            borderColor = borderColor,
            imageColors = ImageDefaults.colors(),
            avatarColors = AvatarDefaults.colors()
        )

    /**
     * Creates a [ChipSizes] that represents the default container and content sizes used in an
     * [SuggestionChip].
     *
     * @param labelStyle The text style to be used for the chip's label.
     * @param borderWidth The width of the chip's border.
     * @param shape The shape to be used for the chip.
     */
    @Composable
    fun chipSizes(
        trailingIconSizes: IconSizes = IconDefaults.size18(),
        leadingIconSizes: IconSizes = IconDefaults.size18(),
        labelStyle: TextStyle = PersianTheme.typography.labelMedium,
        borderWidth: Dp = 1.dp,
        shape: Shape = PersianTheme.shapes.shape10
    ): ChipSizes =
        ChipSizes(
            trailingIconSizes = trailingIconSizes,
            leadingIconSizes = leadingIconSizes,
            labelStyle = labelStyle,
            borderWidth = borderWidth,
            shape = shape,
            leadingImageSizes = ImageDefaults.size24(),
        )

    /**
     * Creates a [ChipElevation] that represents the default elevation used in an [SuggestionChip].
     *
     * @param elevation The default elevation of the chip.
     * @param pressedElevation The elevation of the chip when it is pressed.
     * @param focusedElevation The elevation of the chip when it is focused.
     * @param hoveredElevation The elevation of the chip when it is hovered.
     * @param draggedElevation The elevation of the chip when it is dragged.
     */
    @Composable
    fun chipElevation(
        elevation: Dp = PersianTheme.elevation.none,
        pressedElevation: Dp = elevation,
        focusedElevation: Dp = elevation,
        hoveredElevation: Dp = elevation,
        draggedElevation: Dp = PersianTheme.elevation.elevation4
    ): ChipElevation =
        ChipElevation(
            elevation = elevation,
            pressedElevation = pressedElevation,
            focusedElevation = focusedElevation,
            hoveredElevation = hoveredElevation,
            draggedElevation = draggedElevation
        )

}