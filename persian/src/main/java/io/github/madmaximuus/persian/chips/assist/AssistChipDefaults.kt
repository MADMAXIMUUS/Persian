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
import io.github.madmaximuus.persian.avatarsAndImages.ImageSizes
import io.github.madmaximuus.persian.chips.founfation.ChipColors
import io.github.madmaximuus.persian.chips.founfation.ChipElevation
import io.github.madmaximuus.persian.chips.founfation.ChipSizes
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state12
import io.github.madmaximuus.persian.foundation.state38
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSizes

/**
 * Contains the default values used by [AssistChip].
 */
object AssistChipDefaults {

    /**
     * Creates a [ChipColors] that represents the default container and content colors used in an
     * [AssistChip].
     *
     * @param containerColor The color of the chip's container.
     * @param labelColor The color of the chip's label text.
     * @param leadingIconContentColor The color of the leading icon content.
     * @param disabledContainerColor The color of the chip's container when it is disabled.
     * @param disabledLabelColor The color of the chip's label text when it is disabled.
     * @param disabledLeadingIconColor The color of the leading icon content when the chip is disabled.
     * @param borderColor The color of the chip's border.
     * @param disabledBorderColor The color of the chip's border when it is disabled.
     * @param imageColors The colors to be used for images within the chip.
     */
    @Composable
    fun chipColors(
        containerColor: Color = Color.Transparent,
        labelColor: Color = PersianTheme.colorScheme.onSurface,
        leadingIconContentColor: Color = PersianTheme.colorScheme.primary,
        disabledContainerColor: Color = Color.Transparent,
        disabledLabelColor: Color = PersianTheme.colorScheme.onSurface.state38,
        disabledLeadingIconColor: Color = PersianTheme.colorScheme.onSurface.state38,
        borderColor: Color = PersianTheme.colorScheme.primary,
        disabledBorderColor: Color = PersianTheme.colorScheme.onSurface.state12,
        imageColors: ImageColors = ImageDefaults.colors()
    ): ChipColors =
        ChipColors(
            containerColor = containerColor,
            labelColor = labelColor,
            leadingIconContentColor = leadingIconContentColor,
            borderColor = borderColor,
            disabledContainerColor = disabledContainerColor,
            disabledLabelColor = disabledLabelColor,
            disabledLeadingIconContentColor = disabledLeadingIconColor,
            disabledBorderColor = disabledBorderColor,

            avatarColors = AvatarDefaults.colors(),
            imageColors = imageColors
        )

    /**
     * Creates a [ChipSizes] that represents the default container and content sizes used in an
     * [AssistChip].
     *
     * @param labelStyle The text style to be used for the chip's label.
     * @param borderWidth The width of the chip's border.
     * @param shape The shape to be used for the chip.
     * @param disabledBorderWith The width of the chip's border when it is disabled.
     * @param leadingImageSizes The sizes to be used for the leading image.
     */
    @Composable
    fun chipSizes(
        leadingIconSizes: IconSizes = IconDefaults.size18(),
        labelStyle: TextStyle = PersianTheme.typography.labelLarge,
        borderWidth: Dp = 1.dp,
        shape: Shape = PersianTheme.shapes.shape10,
        disabledBorderWith: Dp = 1.dp,
        leadingImageSizes: ImageSizes = ImageDefaults.size24(),
    ): ChipSizes =
        ChipSizes(
            trailingIconSizes = IconDefaults.size18(),
            leadingIconSizes = leadingIconSizes,
            labelStyle = labelStyle,
            borderWidth = borderWidth,
            shape = shape,
            disabledBorderWith = disabledBorderWith,
            leadingImageSizes = leadingImageSizes
        )

    /**
     * Creates a [ChipElevation] that represents the default elevation used in an [AssistChip].
     *
     * @param elevation The default elevation of the chip.
     * @param pressedElevation The elevation of the chip when it is pressed.
     * @param focusedElevation The elevation of the chip when it is focused.
     * @param hoveredElevation The elevation of the chip when it is hovered.
     * @param draggedElevation The elevation of the chip when it is dragged.
     * @param disabledElevation The elevation of the chip when it is disabled.
     */
    @Composable
    fun chipElevation(
        elevation: Dp = PersianTheme.elevation.none,
        pressedElevation: Dp = elevation,
        focusedElevation: Dp = elevation,
        hoveredElevation: Dp = elevation,
        draggedElevation: Dp = PersianTheme.elevation.elevation4,
        disabledElevation: Dp = elevation
    ): ChipElevation =
        ChipElevation(
            elevation = elevation,
            pressedElevation = pressedElevation,
            focusedElevation = focusedElevation,
            hoveredElevation = hoveredElevation,
            draggedElevation = draggedElevation,
            disabledElevation = disabledElevation
        )

}