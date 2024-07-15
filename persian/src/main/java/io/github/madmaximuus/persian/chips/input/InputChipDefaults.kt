package io.github.madmaximuus.persian.chips.input


import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.avatarsAndImages.AvatarColors
import io.github.madmaximuus.persian.avatarsAndImages.AvatarDefaults
import io.github.madmaximuus.persian.avatarsAndImages.AvatarSizes
import io.github.madmaximuus.persian.avatarsAndImages.ImageColors
import io.github.madmaximuus.persian.avatarsAndImages.ImageDefaults
import io.github.madmaximuus.persian.avatarsAndImages.ImageSizes
import io.github.madmaximuus.persian.chips.founfation.SelectableChipColors
import io.github.madmaximuus.persian.chips.founfation.SelectableChipElevation
import io.github.madmaximuus.persian.chips.founfation.SelectableChipSizes
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state12
import io.github.madmaximuus.persian.foundation.state38
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSizes

object InputChipDefaults {

    @Composable
    fun chipColors(
        containerColor: Color = Color.Transparent,
        labelColor: Color = PersianTheme.colorScheme.onSurface,
        leadingIconColor: Color = PersianTheme.colorScheme.primary,
        trailingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        disabledContainerColor: Color = Color.Transparent,
        disabledLabelColor: Color = PersianTheme.colorScheme.onSurface.state38,
        disabledLeadingIconColor: Color = PersianTheme.colorScheme.onSurface.state38,
        disabledTrailingIconColor: Color = disabledLeadingIconColor,
        selectedContainerColor: Color = PersianTheme.colorScheme.secondaryContainer,
        disabledSelectedContainerColor: Color = PersianTheme.colorScheme.onSurface.state12,
        selectedLabelColor: Color = PersianTheme.colorScheme.onSecondaryContainer,
        selectedLeadingIconColor: Color = PersianTheme.colorScheme.onSecondaryContainer,
        selectedTrailingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        borderColor: Color = PersianTheme.colorScheme.primary,
        selectedBorderColor: Color = Color.Transparent,
        disabledBorderColor: Color = PersianTheme.colorScheme.onSurface.state12,
        disabledSelectedBorderColor: Color = Color.Transparent,
        avatarColors: AvatarColors = AvatarDefaults.colors(),
        imageColors: ImageColors = ImageDefaults.colors()
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
        disabledSelectedBorderColor = disabledSelectedBorderColor,
        avatarColors = avatarColors,
        imageColors = imageColors
    )

    @Composable
    fun chipSizes(
        trailingIconSizes: IconSizes = IconDefaults.size18(),
        leadingIconSizes: IconSizes = IconDefaults.size18(),
        labelStyle: TextStyle = PersianTheme.typography.labelLarge,
        borderWidth: Dp = 1.dp,
        selectedBorderWith: Dp = 0.dp,
        shape: Shape = PersianTheme.shapes.shape10,
        disabledBorderWith: Dp = 1.dp,
        selectedDisabledBorderWith: Dp = 0.dp,
        avatarSizes: AvatarSizes = AvatarDefaults.size24(),
        imageSizes: ImageSizes = ImageDefaults.size24()
    ): SelectableChipSizes = SelectableChipSizes(
        trailingIconSizes = trailingIconSizes,
        leadingIconSizes = leadingIconSizes,
        labelStyle = labelStyle,
        borderWidth = borderWidth,
        selectedBorderWith = selectedBorderWith,
        shape = shape,
        disabledBorderWith = disabledBorderWith,
        selectedDisabledBorderWith = selectedDisabledBorderWith,
        avatarSizes = avatarSizes,
        imageSizes = imageSizes
    )

    @Composable
    fun chipElevation(
        elevation: Dp = PersianTheme.elevation.none,
        pressedElevation: Dp = elevation,
        focusedElevation: Dp = elevation,
        hoveredElevation: Dp = elevation,
        draggedElevation: Dp = PersianTheme.elevation.large,
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