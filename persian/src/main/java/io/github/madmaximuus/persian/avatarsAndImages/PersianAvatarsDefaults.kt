package io.github.madmaximuus.persian.avatarsAndImages

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.takeOrElse
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.state08
import io.github.madmaximuus.persian.foundation.state12
import io.github.madmaximuus.persian.foundation.state38
import io.github.madmaximuus.persian.iconBox.IconBoxSize
import io.github.madmaximuus.persian.iconBox.PersianIconBoxDefaults

object PersianAvatarsDefaults {

    @Composable
    fun size96(
        boxSizes: Dp = 96.dp,
        placeholderIconSize: IconBoxSize = PersianIconBoxDefaults.size48(),
        overlayIconSize: IconBoxSize = PersianIconBoxDefaults.size32()
    ) = AvatarSize(boxSizes, placeholderIconSize, overlayIconSize)

    @Composable
    fun size88(
        boxSizes: Dp = 88.dp,
        placeholderIconSize: IconBoxSize = PersianIconBoxDefaults.size48(),
        overlayIconSize: IconBoxSize = PersianIconBoxDefaults.size32()
    ) = AvatarSize(boxSizes, placeholderIconSize, overlayIconSize)

    @Composable
    fun size80(
        boxSizes: Dp = 80.dp,
        placeholderIconSize: IconBoxSize = PersianIconBoxDefaults.size48(),
        overlayIconSize: IconBoxSize = PersianIconBoxDefaults.size32()
    ) = AvatarSize(boxSizes, placeholderIconSize, overlayIconSize)

    @Composable
    fun size72(
        boxSizes: Dp = 72.dp,
        placeholderIconSize: IconBoxSize = PersianIconBoxDefaults.size40(),
        overlayIconSize: IconBoxSize = PersianIconBoxDefaults.size28()
    ) = AvatarSize(boxSizes, placeholderIconSize, overlayIconSize)

    @Composable
    fun size64(
        boxSizes: Dp = 64.dp,
        placeholderIconSize: IconBoxSize = PersianIconBoxDefaults.size40(),
        overlayIconSize: IconBoxSize = PersianIconBoxDefaults.size28()
    ) = AvatarSize(boxSizes, placeholderIconSize, overlayIconSize)

    @Composable
    fun size56(
        boxSizes: Dp = 56.dp,
        placeholderIconSize: IconBoxSize = PersianIconBoxDefaults.size32(),
        overlayIconSize: IconBoxSize = PersianIconBoxDefaults.size28()
    ) = AvatarSize(boxSizes, placeholderIconSize, overlayIconSize)

    @Composable
    fun size48(
        boxSizes: Dp = 48.dp,
        placeholderIconSize: IconBoxSize = PersianIconBoxDefaults.size32(),
        overlayIconSize: IconBoxSize = PersianIconBoxDefaults.size24()
    ) = AvatarSize(boxSizes, placeholderIconSize, overlayIconSize)

    @Composable
    fun size44(
        boxSizes: Dp = 44.dp,
        placeholderIconSize: IconBoxSize = PersianIconBoxDefaults.size28(),
        overlayIconSize: IconBoxSize = PersianIconBoxDefaults.size24()
    ) = AvatarSize(boxSizes, placeholderIconSize, overlayIconSize)

    @Composable
    fun size40(
        boxSizes: Dp = 40.dp,
        placeholderIconSize: IconBoxSize = PersianIconBoxDefaults.size24(),
        overlayIconSize: IconBoxSize = PersianIconBoxDefaults.size20()
    ) = AvatarSize(boxSizes, placeholderIconSize, overlayIconSize)

    @Composable
    fun size36(
        boxSizes: Dp = 36.dp,
        placeholderIconSize: IconBoxSize = PersianIconBoxDefaults.size24(),
        overlayIconSize: IconBoxSize = PersianIconBoxDefaults.size20()
    ) = AvatarSize(boxSizes, placeholderIconSize, overlayIconSize)

    @Composable
    fun size32(
        boxSizes: Dp = 32.dp,
        placeholderIconSize: IconBoxSize = PersianIconBoxDefaults.size20(),
        overlayIconSize: IconBoxSize = PersianIconBoxDefaults.size20()
    ) = AvatarSize(boxSizes, placeholderIconSize, overlayIconSize)

    @Composable
    fun size28(
        boxSizes: Dp = 28.dp,
        placeholderIconSize: IconBoxSize = PersianIconBoxDefaults.size20(),
        overlayIconSize: IconBoxSize = PersianIconBoxDefaults.size18()
    ) = AvatarSize(boxSizes, placeholderIconSize, overlayIconSize)

    @Composable
    fun size24(
        boxSizes: Dp = 24.dp,
        placeholderIconSize: IconBoxSize = PersianIconBoxDefaults.size16(),
        overlayIconSize: IconBoxSize = PersianIconBoxDefaults.size18()
    ) = AvatarSize(boxSizes, placeholderIconSize, overlayIconSize)

    @Composable
    fun size20(
        boxSizes: Dp = 20.dp,
        placeholderIconSize: IconBoxSize = PersianIconBoxDefaults.size16(),
    ) = AvatarSize(boxSizes, placeholderIconSize, null)

    @Composable
    fun size16(
        boxSizes: Dp = 16.dp,
        placeholderIconSize: IconBoxSize = PersianIconBoxDefaults.size12(),
    ) = AvatarSize(boxSizes, placeholderIconSize, null)


    @Composable
    fun colors(
        placeholderContainerColor: Color = MaterialTheme.extendedColorScheme.surface1,
        disabledPlaceholderContainerColor: Color = MaterialTheme.extendedColorScheme.onSurface.state08,
        borderColor: Color = MaterialTheme.extendedColorScheme.outlineVariant,
        disabledBorderColor: Color = MaterialTheme.extendedColorScheme.onSurface.state12,
        placeholderIconColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        disabledPlaceholderIconColor: Color = MaterialTheme.extendedColorScheme.onSurface.state38,
        overlayIconColor: Color = MaterialTheme.extendedColorScheme.primary,
        disabledOverlayIconColor: Color = MaterialTheme.extendedColorScheme.onSurface.state38
    ): AvatarsColors = AvatarsColors(
        placeholderContainerColor = placeholderContainerColor,
        disabledPlaceholderContainerColor = disabledPlaceholderContainerColor,
        borderColor = borderColor,
        disabledBorderColor = disabledBorderColor,
        placeholderIconColor = placeholderIconColor,
        disabledPlaceholderIconColor = disabledPlaceholderIconColor,
        overlayIconColor = overlayIconColor,
        disabledOverlayIconColor = disabledOverlayIconColor
    )
}

@Immutable
class AvatarSize internal constructor(
    internal val boxSizes: Dp,
    internal val placeholderIconSize: IconBoxSize,
    internal val overlayIconSize: IconBoxSize?
) {
    fun copy(
        boxSizes: Dp = this.boxSizes,
        placeholderSize: IconBoxSize = this.placeholderIconSize,
        overlayIconBoxSize: IconBoxSize? = this.overlayIconSize,
    ) = AvatarSize(
        boxSizes.takeOrElse { this.boxSizes },
        placeholderSize,
        overlayIconBoxSize
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is AvatarSize) return false

        if (boxSizes != other.boxSizes) return false
        if (placeholderIconSize != other.placeholderIconSize) return false
        return overlayIconSize == other.overlayIconSize
    }

    override fun hashCode(): Int {
        var result = boxSizes.hashCode()
        result = 31 * result + placeholderIconSize.hashCode()
        result = 31 * result + overlayIconSize.hashCode()
        return result
    }
}

@Immutable
class AvatarsColors internal constructor(
    private val placeholderContainerColor: Color,
    private val disabledPlaceholderContainerColor: Color,
    private val borderColor: Color,
    private val disabledBorderColor: Color,
    private val placeholderIconColor: Color,
    private val disabledPlaceholderIconColor: Color,
    private val overlayIconColor: Color,
    private val disabledOverlayIconColor: Color
) {

    @Stable
    internal fun background(enabled: Boolean): Color =
        if (enabled) placeholderContainerColor else disabledPlaceholderContainerColor

    @Stable
    internal fun border(enabled: Boolean): Color =
        if (enabled) borderColor else disabledBorderColor

    @Stable
    internal fun placeholderIcon(enabled: Boolean): Color =
        if (enabled) placeholderIconColor else disabledPlaceholderIconColor

    @Stable
    internal fun overlayIcon(enabled: Boolean): Color =
        if (enabled) overlayIconColor else disabledOverlayIconColor

    fun copy(
        placeholderContainerColor: Color = this.placeholderContainerColor,
        disabledPlaceholderContainerColor: Color = this.disabledPlaceholderContainerColor,
        borderColor: Color = this.borderColor,
        disabledBorderColor: Color = this.disabledBorderColor,
        placeholderIconColor: Color = this.placeholderIconColor,
        disabledPlaceholderIconColor: Color = this.disabledPlaceholderIconColor,
        overlayIconColor: Color = this.overlayIconColor,
        disabledOverlayIconColor: Color = this.disabledOverlayIconColor
    ): AvatarsColors = AvatarsColors(
        placeholderContainerColor = placeholderContainerColor.takeOrElse { this.placeholderContainerColor },
        disabledPlaceholderContainerColor = disabledPlaceholderContainerColor.takeOrElse { this.disabledPlaceholderContainerColor },
        borderColor = borderColor.takeOrElse { this.borderColor },
        disabledBorderColor = disabledBorderColor.takeOrElse { this.disabledBorderColor },
        placeholderIconColor = placeholderIconColor.takeOrElse { this.placeholderIconColor },
        disabledPlaceholderIconColor = disabledPlaceholderIconColor.takeOrElse { this.disabledPlaceholderIconColor },
        overlayIconColor = overlayIconColor.takeOrElse { this.overlayIconColor },
        disabledOverlayIconColor = disabledOverlayIconColor.takeOrElse { this.disabledOverlayIconColor }
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is AvatarsColors) return false

        if (placeholderContainerColor != other.placeholderContainerColor) return false
        if (disabledPlaceholderContainerColor != other.disabledPlaceholderContainerColor) return false
        if (borderColor != other.borderColor) return false
        if (disabledBorderColor != other.disabledBorderColor) return false
        if (placeholderIconColor != other.placeholderIconColor) return false
        if (disabledPlaceholderIconColor != other.disabledPlaceholderIconColor) return false
        if (overlayIconColor != other.overlayIconColor) return false
        return disabledOverlayIconColor == other.disabledOverlayIconColor
    }

    override fun hashCode(): Int {
        var result = placeholderContainerColor.hashCode()
        result = 31 * result + disabledPlaceholderContainerColor.hashCode()
        result = 31 * result + placeholderIconColor.hashCode()
        result = 31 * result + borderColor.hashCode()
        result = 31 * result + disabledBorderColor.hashCode()
        result = 31 * result + disabledPlaceholderIconColor.hashCode()
        result = 31 * result + overlayIconColor.hashCode()
        result = 31 * result + disabledOverlayIconColor.hashCode()
        return result
    }
}