package io.github.madmaximuus.persian.chips.input


import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.avatarAndImage.AvatarColors
import io.github.madmaximuus.persian.avatarAndImage.AvatarDefaults
import io.github.madmaximuus.persian.avatarAndImage.AvatarSizes
import io.github.madmaximuus.persian.avatarAndImage.ImageColors
import io.github.madmaximuus.persian.avatarAndImage.ImageDefaults
import io.github.madmaximuus.persian.avatarAndImage.ImageSizes
import io.github.madmaximuus.persian.chips.founfation.SelectableChipColors
import io.github.madmaximuus.persian.chips.founfation.SelectableChipElevation
import io.github.madmaximuus.persian.chips.founfation.SelectableChipSizes
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSizes

/**
 * Contains the default values used by [InputShip].
 */
object InputChipDefaults {

    /**
     * Creates a [SelectableChipColors] that represents the default container and content colors used in an
     * [InputShip].
     *
     * @param containerColor The color of the chip's container.
     * @param labelColor The color of the chip's label text.
     * @param leadingIconColor The color of the leading icon.
     * @param trailingIconColor The color of the trailing icon.
     * @param selectedContainerColor The color of the chip's container when it is selected.
     * @param selectedLabelColor The color of the chip's label text when it is selected.
     * @param selectedLeadingIconColor The color of the leading icon when the chip is selected.
     * @param selectedTrailingIconColor The color of the trailing icon when the chip is selected.
     * @param borderColor The color of the chip's border.
     * @param selectedBorderColor The color of the chip's border when it is selected.
     */
    @Composable
    fun chipColors(
        containerColor: Color = Color.Transparent,
        labelColor: Color = PersianTheme.colorScheme.onSurface,
        leadingIconColor: Color = PersianTheme.colorScheme.primary,
        trailingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        selectedContainerColor: Color = PersianTheme.colorScheme.secondaryContainer,
        selectedLabelColor: Color = PersianTheme.colorScheme.onSecondaryContainer,
        selectedLeadingIconColor: Color = PersianTheme.colorScheme.onSecondaryContainer,
        selectedTrailingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        borderColor: Color = PersianTheme.colorScheme.primary,
        selectedBorderColor: Color = Color.Transparent,
        avatarColors: AvatarColors = AvatarDefaults.colors(),
        imageColors: ImageColors = ImageDefaults.colors()
    ): SelectableChipColors =
        SelectableChipColors(
            containerColor = containerColor,
            labelColor = labelColor,
            leadingIconColor = leadingIconColor,
            trailingIconColor = trailingIconColor,
            selectedContainerColor = selectedContainerColor,
            selectedLabelColor = selectedLabelColor,
            selectedLeadingIconColor = selectedLeadingIconColor,
            selectedTrailingIconColor = selectedTrailingIconColor,
            borderColor = borderColor,
            selectedBorderColor = selectedBorderColor,
            avatarColors = avatarColors,
            imageColors = imageColors
        )

    /**
     * Creates a [SelectableChipSizes] that represents the default container and content sizes used in an
     * [InputShip].
     *
     * @param trailingIconSizes The sizes to be used for the trailing icon.
     * @param leadingIconSizes The sizes to be used for the leading icon.
     * @param labelStyle The text style to be used for the chip's label.
     * @param borderWidth The width of the chip's border.
     * @param selectedBorderWith The width of the chip's border when it is selected.
     * @param shape The shape to be used for the chip.
     */
    @Composable
    fun chipSizes(
        trailingIconSizes: IconSizes = IconDefaults.size18(),
        leadingIconSizes: IconSizes = IconDefaults.size18(),
        labelStyle: TextStyle = PersianTheme.typography.labelMedium,
        borderWidth: Dp = 1.dp,
        selectedBorderWith: Dp = 0.dp,
        shape: Shape = PersianTheme.shapes.shape10,
        avatarSizes: AvatarSizes = AvatarDefaults.size24(),
        imageSizes: ImageSizes = ImageDefaults.size24()
    ): SelectableChipSizes =
        SelectableChipSizes(
            trailingIconSizes = trailingIconSizes,
            leadingIconSizes = leadingIconSizes,
            labelStyle = labelStyle,
            borderWidth = borderWidth,
            selectedBorderWith = selectedBorderWith,
            shape = shape,
            avatarSizes = avatarSizes,
            imageSizes = imageSizes
        )

    /**
     * Creates a [SelectableChipElevation] that represents the default chip elevation used in an
     * [InputShip].
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
        draggedElevation: Dp = PersianTheme.elevation.elevation4,
    ): SelectableChipElevation =
        SelectableChipElevation(
            elevation = elevation,
            pressedElevation = pressedElevation,
            focusedElevation = focusedElevation,
            hoveredElevation = hoveredElevation,
            draggedElevation = draggedElevation,
        )
}