package io.github.madmaximuus.persian.avatarsAndImages

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.takeOrElse
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state08
import io.github.madmaximuus.persian.foundation.state12
import io.github.madmaximuus.persian.foundation.state38
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSize

object PersianImagesDefaults {

    @Composable
    fun size96(
        boxSizes: Dp = 96.dp,
        placeholderIconSize: IconSize = IconDefaults.size48(),
        overlayIconSize: IconSize = IconDefaults.size32(),
        smallShape: Shape = RoundedCornerShape(8.dp),
        mediumShape: Shape = RoundedCornerShape(12.dp),
        largeShape: Shape = RoundedCornerShape(16.dp),
        badgeSize: Dp = 28.dp,
        horizontalBadgeOffset: Dp = 5.dp,
        verticalBadgeOffset: Dp = 5.dp,
    ): ImageSize = ImageSize(
        boxSizes,
        placeholderIconSize,
        overlayIconSize,
        smallShape,
        mediumShape,
        largeShape,
        badgeSize,
        horizontalBadgeOffset,
        verticalBadgeOffset
    )

    @Composable
    fun size88(
        boxSizes: Dp = 88.dp,
        placeholderIconSize: IconSize = IconDefaults.size48(),
        overlayIconSize: IconSize = IconDefaults.size32(),
        smallShape: Shape = RoundedCornerShape(8.dp),
        mediumShape: Shape = RoundedCornerShape(12.dp),
        largeShape: Shape = RoundedCornerShape(16.dp),
        badgeSize: Dp = 28.dp,
        horizontalBadgeOffset: Dp = 5.dp,
        verticalBadgeOffset: Dp = 5.dp,
    ): ImageSize = ImageSize(
        boxSizes,
        placeholderIconSize,
        overlayIconSize,
        smallShape,
        mediumShape,
        largeShape,
        badgeSize,
        horizontalBadgeOffset,
        verticalBadgeOffset
    )

    @Composable
    fun size80(
        boxSizes: Dp = 80.dp,
        placeholderIconSize: IconSize = IconDefaults.size48(),
        overlayIconSize: IconSize = IconDefaults.size32(),
        smallShape: Shape = RoundedCornerShape(8.dp),
        mediumShape: Shape = RoundedCornerShape(12.dp),
        largeShape: Shape = RoundedCornerShape(16.dp),
        badgeSize: Dp = 28.dp,
        horizontalBadgeOffset: Dp = 5.dp,
        verticalBadgeOffset: Dp = 5.dp,
    ): ImageSize = ImageSize(
        boxSizes,
        placeholderIconSize,
        overlayIconSize,
        smallShape,
        mediumShape,
        largeShape,
        badgeSize,
        horizontalBadgeOffset,
        verticalBadgeOffset
    )

    @Composable
    fun size72(
        boxSizes: Dp = 72.dp,
        placeholderIconSize: IconSize = IconDefaults.size40(),
        overlayIconSize: IconSize = IconDefaults.size28(),
        smallShape: Shape = RoundedCornerShape(6.dp),
        mediumShape: Shape = RoundedCornerShape(10.dp),
        largeShape: Shape = RoundedCornerShape(14.dp),
        badgeSize: Dp = 28.dp,
        horizontalBadgeOffset: Dp = 5.dp,
        verticalBadgeOffset: Dp = 5.dp,
    ): ImageSize = ImageSize(
        boxSizes,
        placeholderIconSize,
        overlayIconSize,
        smallShape,
        mediumShape,
        largeShape,
        badgeSize,
        horizontalBadgeOffset,
        verticalBadgeOffset
    )

    @Composable
    fun size64(
        boxSizes: Dp = 64.dp,
        placeholderIconSize: IconSize = IconDefaults.size40(),
        overlayIconSize: IconSize = IconDefaults.size28(),
        smallShape: Shape = RoundedCornerShape(6.dp),
        mediumShape: Shape = RoundedCornerShape(10.dp),
        largeShape: Shape = RoundedCornerShape(14.dp),
        badgeSize: Dp = 24.dp,
        horizontalBadgeOffset: Dp = 4.dp,
        verticalBadgeOffset: Dp = 4.dp,
    ): ImageSize = ImageSize(
        boxSizes,
        placeholderIconSize,
        overlayIconSize,
        smallShape,
        mediumShape,
        largeShape,
        badgeSize,
        horizontalBadgeOffset,
        verticalBadgeOffset
    )

    @Composable
    fun size56(
        boxSizes: Dp = 56.dp,
        placeholderIconSize: IconSize = IconDefaults.size32(),
        overlayIconSize: IconSize = IconDefaults.size28(),
        smallShape: Shape = RoundedCornerShape(6.dp),
        mediumShape: Shape = RoundedCornerShape(10.dp),
        largeShape: Shape = RoundedCornerShape(14.dp),
        badgeSize: Dp = 24.dp,
        horizontalBadgeOffset: Dp = 4.dp,
        verticalBadgeOffset: Dp = 4.dp,
    ): ImageSize = ImageSize(
        boxSizes,
        placeholderIconSize,
        overlayIconSize,
        smallShape,
        mediumShape,
        largeShape,
        badgeSize,
        horizontalBadgeOffset,
        verticalBadgeOffset
    )

    @Composable
    fun size48(
        boxSizes: Dp = 48.dp,
        placeholderIconSize: IconSize = IconDefaults.size32(),
        overlayIconSize: IconSize = IconDefaults.size24(),
        smallShape: Shape = RoundedCornerShape(4.dp),
        mediumShape: Shape = RoundedCornerShape(8.dp),
        largeShape: Shape = RoundedCornerShape(12.dp),
        badgeSize: Dp = 20.dp,
        horizontalBadgeOffset: Dp = 3.dp,
        verticalBadgeOffset: Dp = 3.dp,
    ): ImageSize = ImageSize(
        boxSizes,
        placeholderIconSize,
        overlayIconSize,
        smallShape,
        mediumShape,
        largeShape,
        badgeSize,
        horizontalBadgeOffset,
        verticalBadgeOffset
    )

    @Composable
    fun size44(
        boxSizes: Dp = 44.dp,
        placeholderIconSize: IconSize = IconDefaults.size28(),
        overlayIconSize: IconSize = IconDefaults.size24(),
        smallShape: Shape = RoundedCornerShape(4.dp),
        mediumShape: Shape = RoundedCornerShape(8.dp),
        largeShape: Shape = RoundedCornerShape(12.dp),
        badgeSize: Dp = 20.dp,
        horizontalBadgeOffset: Dp = 3.dp,
        verticalBadgeOffset: Dp = 3.dp,
    ): ImageSize = ImageSize(
        boxSizes,
        placeholderIconSize,
        overlayIconSize,
        smallShape,
        mediumShape,
        largeShape,
        badgeSize,
        horizontalBadgeOffset,
        verticalBadgeOffset
    )

    @Composable
    fun size40(
        boxSizes: Dp = 40.dp,
        placeholderIconSize: IconSize = IconDefaults.size24(),
        overlayIconSize: IconSize = IconDefaults.size20(),
        smallShape: Shape = RoundedCornerShape(4.dp),
        mediumShape: Shape = RoundedCornerShape(8.dp),
        largeShape: Shape = RoundedCornerShape(12.dp),
        badgeSize: Dp = 20.dp,
        horizontalBadgeOffset: Dp = 3.dp,
        verticalBadgeOffset: Dp = 3.dp,
    ): ImageSize = ImageSize(
        boxSizes,
        placeholderIconSize,
        overlayIconSize,
        smallShape,
        mediumShape,
        largeShape,
        badgeSize,
        horizontalBadgeOffset,
        verticalBadgeOffset
    )

    @Composable
    fun size36(
        boxSizes: Dp = 40.dp,
        placeholderIconSize: IconSize = IconDefaults.size24(),
        overlayIconSize: IconSize = IconDefaults.size20(),
        smallShape: Shape = RoundedCornerShape(4.dp),
        mediumShape: Shape = RoundedCornerShape(8.dp),
        largeShape: Shape = RoundedCornerShape(12.dp),
        badgeSize: Dp = 16.dp,
        horizontalBadgeOffset: Dp = 3.dp,
        verticalBadgeOffset: Dp = 3.dp,
    ): ImageSize = ImageSize(
        boxSizes,
        placeholderIconSize,
        overlayIconSize,
        smallShape,
        mediumShape,
        largeShape,
        badgeSize,
        horizontalBadgeOffset,
        verticalBadgeOffset
    )

    @Composable
    fun size32(
        boxSizes: Dp = 32.dp,
        placeholderIconSize: IconSize = IconDefaults.size20(),
        overlayIconSize: IconSize = IconDefaults.size20(),
        smallShape: Shape = RoundedCornerShape(3.dp),
        mediumShape: Shape = RoundedCornerShape(7.dp),
        largeShape: Shape = RoundedCornerShape(11.dp),
        badgeSize: Dp = 16.dp,
        horizontalBadgeOffset: Dp = 3.dp,
        verticalBadgeOffset: Dp = 3.dp,
    ): ImageSize = ImageSize(
        boxSizes,
        placeholderIconSize,
        overlayIconSize,
        smallShape,
        mediumShape,
        largeShape,
        badgeSize,
        horizontalBadgeOffset,
        verticalBadgeOffset
    )

    @Composable
    fun size28(
        boxSizes: Dp = 28.dp,
        placeholderIconSize: IconSize = IconDefaults.size18(),
        overlayIconSize: IconSize = IconDefaults.size20(),
        smallShape: Shape = RoundedCornerShape(3.dp),
        mediumShape: Shape = RoundedCornerShape(7.dp),
        largeShape: Shape = RoundedCornerShape(11.dp),
        badgeSize: Dp = 16.dp,
        horizontalBadgeOffset: Dp = 3.dp,
        verticalBadgeOffset: Dp = 3.dp,
    ): ImageSize = ImageSize(
        boxSizes,
        placeholderIconSize,
        overlayIconSize,
        smallShape,
        mediumShape,
        largeShape,
        badgeSize,
        horizontalBadgeOffset,
        verticalBadgeOffset
    )

    @Composable
    fun size24(
        boxSizes: Dp = 24.dp,
        placeholderIconSize: IconSize = IconDefaults.size16(),
        overlayIconSize: IconSize = IconDefaults.size18(),
        smallShape: Shape = RoundedCornerShape(3.dp),
        mediumShape: Shape = RoundedCornerShape(7.dp),
        largeShape: Shape = RoundedCornerShape(9.dp),
        badgeSize: Dp = 16.dp,
        horizontalBadgeOffset: Dp = 3.dp,
        verticalBadgeOffset: Dp = 3.dp,
    ): ImageSize = ImageSize(
        boxSizes,
        placeholderIconSize,
        overlayIconSize,
        smallShape,
        mediumShape,
        largeShape,
        badgeSize,
        horizontalBadgeOffset,
        verticalBadgeOffset
    )

    @Composable
    fun size20(
        boxSizes: Dp = 20.dp,
        placeholderIconSize: IconSize = IconDefaults.size16(),
        smallShape: Shape = RoundedCornerShape(2.dp),
        mediumShape: Shape = RoundedCornerShape(6.dp),
        largeShape: Shape = RoundedCornerShape(8.dp)
    ): ImageSize = ImageSize(
        boxSizes,
        placeholderIconSize,
        null,
        smallShape,
        mediumShape,
        largeShape,
        null,
        0.dp,
        0.dp
    )

    @Composable
    fun size16(
        boxSizes: Dp = 16.dp,
        placeholderIconSize: IconSize = IconDefaults.size12(),
        smallShape: Shape = RoundedCornerShape(2.dp),
        mediumShape: Shape = RoundedCornerShape(4.dp),
        largeShape: Shape = RoundedCornerShape(6.dp)
    ): ImageSize = ImageSize(
        boxSizes,
        placeholderIconSize,
        null,
        smallShape,
        mediumShape,
        largeShape,
        null,
        0.dp,
        0.dp
    )

    @Composable
    fun colors(
        placeholderContainerColor: Color = PersianTheme.colorScheme.surface1,
        disabledPlaceholderContainerColor: Color = PersianTheme.colorScheme.onSurface.state08,
        borderColor: Color = PersianTheme.colorScheme.outlineVariant,
        disabledBorderColor: Color = PersianTheme.colorScheme.onSurface.state12,
        placeholderIconColor: Color = PersianTheme.colorScheme.onSurface.state38,
        disabledPlaceholderIconColor: Color = PersianTheme.colorScheme.onSurface.state38,
        overlayIconColor: Color = PersianTheme.colorScheme.primary,
        disabledOverlayIconColor: Color = PersianTheme.colorScheme.onSurface.state38
    ): ImagesColors = ImagesColors(
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

enum class ImageShape {
    SMALL, MEDIUM, LARGE
}

@Immutable
class ImageSize internal constructor(
    internal val boxSizes: Dp,
    internal val placeholderSize: IconSize,
    internal val overlayIconSize: IconSize?,
    private val smallShape: Shape,
    private val mediumShape: Shape,
    private val largeShape: Shape,
    internal val badgeSize: Dp?,
    internal val horizontalBadgeOffset: Dp,
    internal val verticalBadgeOffset: Dp,
) {

    @Stable
    internal fun shape(shape: ImageShape): Shape =
        when (shape) {
            ImageShape.SMALL -> smallShape
            ImageShape.MEDIUM -> mediumShape
            ImageShape.LARGE -> largeShape
        }

    fun copy(
        boxSizes: Dp = this.boxSizes,
        placeholderSize: IconSize = this.placeholderSize,
        overlayIconSize: IconSize? = this.overlayIconSize,
        smallShape: Shape = this.smallShape,
        mediumShape: Shape = this.mediumShape,
        largeShape: Shape = this.largeShape,
        badgeSize: Dp? = this.badgeSize,
        horizontalBadgeOffset: Dp = this.horizontalBadgeOffset,
        verticalBadgeOffset: Dp = this.verticalBadgeOffset
    ) = ImageSize(
        boxSizes.takeOrElse { this.boxSizes },
        placeholderSize,
        overlayIconSize,
        smallShape,
        mediumShape,
        largeShape,
        badgeSize,
        horizontalBadgeOffset.takeOrElse { this.horizontalBadgeOffset },
        verticalBadgeOffset.takeOrElse { this.verticalBadgeOffset }
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ImageSize) return false

        if (boxSizes != other.boxSizes) return false
        if (placeholderSize != other.placeholderSize) return false
        if (overlayIconSize != other.overlayIconSize) return false
        if (smallShape != other.smallShape) return false
        if (mediumShape != other.mediumShape) return false
        if (badgeSize != other.badgeSize) return false
        if (horizontalBadgeOffset != other.horizontalBadgeOffset) return false
        if (verticalBadgeOffset != other.verticalBadgeOffset) return false
        return largeShape == other.largeShape
    }

    override fun hashCode(): Int {
        var result = boxSizes.hashCode()
        result = 31 * result + placeholderSize.hashCode()
        result = 31 * result + overlayIconSize.hashCode()
        result = 31 * result + smallShape.hashCode()
        result = 31 * result + mediumShape.hashCode()
        result = 31 * result + largeShape.hashCode()
        result = 31 * result + badgeSize.hashCode()
        result = 31 * result + horizontalBadgeOffset.hashCode()
        result = 31 * result + verticalBadgeOffset.hashCode()
        return result
    }
}

@Immutable
class ImagesColors internal constructor(
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
    ): ImagesColors = ImagesColors(
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
        if (other == null || other !is ImagesColors) return false

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