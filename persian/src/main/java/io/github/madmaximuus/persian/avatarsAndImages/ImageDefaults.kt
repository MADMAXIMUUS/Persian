package io.github.madmaximuus.persian.avatarsAndImages

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state38
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSizes

/**
 * Contains all default values used by [Image].
 */
object ImageDefaults {

    /**
     * Creates an [ImageSizes] that represents the default sizes used in an image.
     *
     * @param boxSizes the container size of this image.
     * @param placeholderIconSizes the placeholder icon size of this image.
     * @param overlayIconSizes the overlay icon size of this image.
     * @param smallShape the shape that used when [ImageShape.SMALL] of this image.
     * @param mediumShape the shape that used when [ImageShape.MEDIUM] of this image.
     * @param largeShape the shape that used when [ImageShape.LARGE] of this image.
     * @param badgeSize the badge size of this image.
     * @param horizontalBadgeOffset the badge left offset of this image.
     * @param verticalBadgeOffset the badge bottom offset of this image.
     */
    @Composable
    fun size96(
        boxSizes: Dp = 96.dp,
        placeholderIconSizes: IconSizes = IconDefaults.size48(),
        overlayIconSizes: IconSizes = IconDefaults.size32(),
        smallShape: Shape = RoundedCornerShape(8.dp),
        mediumShape: Shape = RoundedCornerShape(12.dp),
        largeShape: Shape = RoundedCornerShape(16.dp),
        badgeSize: Dp = 28.dp,
        horizontalBadgeOffset: Dp = 5.dp,
        verticalBadgeOffset: Dp = 5.dp,
    ): ImageSizes =
        ImageSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderIconSizes,
            overlayIconSizes = overlayIconSizes,
            smallShape = smallShape,
            mediumShape = mediumShape,
            largeShape = largeShape,
            badgeSize = badgeSize,
            horizontalBadgeOffset = horizontalBadgeOffset,
            verticalBadgeOffset = verticalBadgeOffset
        )

    /**
     * Creates an [ImageSizes] that represents the default sizes used in an image.
     *
     * @param boxSizes the container size of this image.
     * @param placeholderIconSizes the placeholder icon size of this image.
     * @param overlayIconSizes the overlay icon size of this image.
     * @param smallShape the shape that used when [ImageShape.SMALL] of this image.
     * @param mediumShape the shape that used when [ImageShape.MEDIUM] of this image.
     * @param largeShape the shape that used when [ImageShape.LARGE] of this image.
     * @param badgeSize the badge size of this image.
     * @param horizontalBadgeOffset the badge left offset of this image.
     * @param verticalBadgeOffset the badge bottom offset of this image.
     */
    @Composable
    fun size88(
        boxSizes: Dp = 88.dp,
        placeholderIconSizes: IconSizes = IconDefaults.size48(),
        overlayIconSizes: IconSizes = IconDefaults.size32(),
        smallShape: Shape = RoundedCornerShape(8.dp),
        mediumShape: Shape = RoundedCornerShape(12.dp),
        largeShape: Shape = RoundedCornerShape(16.dp),
        badgeSize: Dp = 28.dp,
        horizontalBadgeOffset: Dp = 5.dp,
        verticalBadgeOffset: Dp = 5.dp,
    ): ImageSizes =
        ImageSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderIconSizes,
            overlayIconSizes = overlayIconSizes,
            smallShape = smallShape,
            mediumShape = mediumShape,
            largeShape = largeShape,
            badgeSize = badgeSize,
            horizontalBadgeOffset = horizontalBadgeOffset,
            verticalBadgeOffset = verticalBadgeOffset
        )

    /**
     * Creates an [ImageSizes] that represents the default sizes used in an image.
     *
     * @param boxSizes the container size of this image.
     * @param placeholderIconSizes the placeholder icon size of this image.
     * @param overlayIconSizes the overlay icon size of this image.
     * @param smallShape the shape that used when [ImageShape.SMALL] of this image.
     * @param mediumShape the shape that used when [ImageShape.MEDIUM] of this image.
     * @param largeShape the shape that used when [ImageShape.LARGE] of this image.
     * @param badgeSize the badge size of this image.
     * @param horizontalBadgeOffset the badge left offset of this image.
     * @param verticalBadgeOffset the badge bottom offset of this image.
     */
    @Composable
    fun size80(
        boxSizes: Dp = 80.dp,
        placeholderIconSizes: IconSizes = IconDefaults.size48(),
        overlayIconSizes: IconSizes = IconDefaults.size32(),
        smallShape: Shape = RoundedCornerShape(8.dp),
        mediumShape: Shape = RoundedCornerShape(12.dp),
        largeShape: Shape = RoundedCornerShape(16.dp),
        badgeSize: Dp = 28.dp,
        horizontalBadgeOffset: Dp = 5.dp,
        verticalBadgeOffset: Dp = 5.dp,
    ): ImageSizes =
        ImageSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderIconSizes,
            overlayIconSizes = overlayIconSizes,
            smallShape = smallShape,
            mediumShape = mediumShape,
            largeShape = largeShape,
            badgeSize = badgeSize,
            horizontalBadgeOffset = horizontalBadgeOffset,
            verticalBadgeOffset = verticalBadgeOffset
        )

    /**
     * Creates an [ImageSizes] that represents the default sizes used in an image.
     *
     * @param boxSizes the container size of this image.
     * @param placeholderIconSizes the placeholder icon size of this image.
     * @param overlayIconSizes the overlay icon size of this image.
     * @param smallShape the shape that used when [ImageShape.SMALL] of this image.
     * @param mediumShape the shape that used when [ImageShape.MEDIUM] of this image.
     * @param largeShape the shape that used when [ImageShape.LARGE] of this image.
     * @param badgeSize the badge size of this image.
     * @param horizontalBadgeOffset the badge left offset of this image.
     * @param verticalBadgeOffset the badge bottom offset of this image.
     */
    @Composable
    fun size72(
        boxSizes: Dp = 72.dp,
        placeholderIconSizes: IconSizes = IconDefaults.size40(),
        overlayIconSizes: IconSizes = IconDefaults.size28(),
        smallShape: Shape = RoundedCornerShape(6.dp),
        mediumShape: Shape = RoundedCornerShape(10.dp),
        largeShape: Shape = RoundedCornerShape(14.dp),
        badgeSize: Dp = 28.dp,
        horizontalBadgeOffset: Dp = 5.dp,
        verticalBadgeOffset: Dp = 5.dp,
    ): ImageSizes =
        ImageSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderIconSizes,
            overlayIconSizes = overlayIconSizes,
            smallShape = smallShape,
            mediumShape = mediumShape,
            largeShape = largeShape,
            badgeSize = badgeSize,
            horizontalBadgeOffset = horizontalBadgeOffset,
            verticalBadgeOffset = verticalBadgeOffset
        )

    /**
     * Creates an [ImageSizes] that represents the default sizes used in an image.
     *
     * @param boxSizes the container size of this image.
     * @param placeholderIconSizes the placeholder icon size of this image.
     * @param overlayIconSizes the overlay icon size of this image.
     * @param smallShape the shape that used when [ImageShape.SMALL] of this image.
     * @param mediumShape the shape that used when [ImageShape.MEDIUM] of this image.
     * @param largeShape the shape that used when [ImageShape.LARGE] of this image.
     * @param badgeSize the badge size of this image.
     * @param horizontalBadgeOffset the badge left offset of this image.
     * @param verticalBadgeOffset the badge bottom offset of this image.
     */
    @Composable
    fun size64(
        boxSizes: Dp = 64.dp,
        placeholderIconSizes: IconSizes = IconDefaults.size40(),
        overlayIconSizes: IconSizes = IconDefaults.size28(),
        smallShape: Shape = RoundedCornerShape(6.dp),
        mediumShape: Shape = RoundedCornerShape(10.dp),
        largeShape: Shape = RoundedCornerShape(14.dp),
        badgeSize: Dp = 24.dp,
        horizontalBadgeOffset: Dp = 4.dp,
        verticalBadgeOffset: Dp = 4.dp,
    ): ImageSizes =
        ImageSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderIconSizes,
            overlayIconSizes = overlayIconSizes,
            smallShape = smallShape,
            mediumShape = mediumShape,
            largeShape = largeShape,
            badgeSize = badgeSize,
            horizontalBadgeOffset = horizontalBadgeOffset,
            verticalBadgeOffset = verticalBadgeOffset
        )

    /**
     * Creates an [ImageSizes] that represents the default sizes used in an image.
     *
     * @param boxSizes the container size of this image.
     * @param placeholderIconSizes the placeholder icon size of this image.
     * @param overlayIconSizes the overlay icon size of this image.
     * @param smallShape the shape that used when [ImageShape.SMALL] of this image.
     * @param mediumShape the shape that used when [ImageShape.MEDIUM] of this image.
     * @param largeShape the shape that used when [ImageShape.LARGE] of this image.
     * @param badgeSize the badge size of this image.
     * @param horizontalBadgeOffset the badge left offset of this image.
     * @param verticalBadgeOffset the badge bottom offset of this image.
     */
    @Composable
    fun size56(
        boxSizes: Dp = 56.dp,
        placeholderIconSizes: IconSizes = IconDefaults.size32(),
        overlayIconSizes: IconSizes = IconDefaults.size28(),
        smallShape: Shape = RoundedCornerShape(6.dp),
        mediumShape: Shape = RoundedCornerShape(10.dp),
        largeShape: Shape = RoundedCornerShape(14.dp),
        badgeSize: Dp = 24.dp,
        horizontalBadgeOffset: Dp = 4.dp,
        verticalBadgeOffset: Dp = 4.dp,
    ): ImageSizes =
        ImageSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderIconSizes,
            overlayIconSizes = overlayIconSizes,
            smallShape = smallShape,
            mediumShape = mediumShape,
            largeShape = largeShape,
            badgeSize = badgeSize,
            horizontalBadgeOffset = horizontalBadgeOffset,
            verticalBadgeOffset = verticalBadgeOffset
        )

    /**
     * Creates an [ImageSizes] that represents the default sizes used in an image.
     *
     * @param boxSizes the container size of this image.
     * @param placeholderIconSizes the placeholder icon size of this image.
     * @param overlayIconSizes the overlay icon size of this image.
     * @param smallShape the shape that used when [ImageShape.SMALL] of this image.
     * @param mediumShape the shape that used when [ImageShape.MEDIUM] of this image.
     * @param largeShape the shape that used when [ImageShape.LARGE] of this image.
     * @param badgeSize the badge size of this image.
     * @param horizontalBadgeOffset the badge left offset of this image.
     * @param verticalBadgeOffset the badge bottom offset of this image.
     */
    @Composable
    fun size48(
        boxSizes: Dp = 48.dp,
        placeholderIconSizes: IconSizes = IconDefaults.size32(),
        overlayIconSizes: IconSizes = IconDefaults.size24(),
        smallShape: Shape = RoundedCornerShape(4.dp),
        mediumShape: Shape = RoundedCornerShape(8.dp),
        largeShape: Shape = RoundedCornerShape(12.dp),
        badgeSize: Dp = 20.dp,
        horizontalBadgeOffset: Dp = 3.dp,
        verticalBadgeOffset: Dp = 3.dp,
    ): ImageSizes =
        ImageSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderIconSizes,
            overlayIconSizes = overlayIconSizes,
            smallShape = smallShape,
            mediumShape = mediumShape,
            largeShape = largeShape,
            badgeSize = badgeSize,
            horizontalBadgeOffset = horizontalBadgeOffset,
            verticalBadgeOffset = verticalBadgeOffset
        )

    /**
     * Creates an [ImageSizes] that represents the default sizes used in an image.
     *
     * @param boxSizes the container size of this image.
     * @param placeholderIconSizes the placeholder icon size of this image.
     * @param overlayIconSizes the overlay icon size of this image.
     * @param smallShape the shape that used when [ImageShape.SMALL] of this image.
     * @param mediumShape the shape that used when [ImageShape.MEDIUM] of this image.
     * @param largeShape the shape that used when [ImageShape.LARGE] of this image.
     * @param badgeSize the badge size of this image.
     * @param horizontalBadgeOffset the badge left offset of this image.
     * @param verticalBadgeOffset the badge bottom offset of this image.
     */
    @Composable
    fun size44(
        boxSizes: Dp = 44.dp,
        placeholderIconSizes: IconSizes = IconDefaults.size28(),
        overlayIconSizes: IconSizes = IconDefaults.size24(),
        smallShape: Shape = RoundedCornerShape(4.dp),
        mediumShape: Shape = RoundedCornerShape(8.dp),
        largeShape: Shape = RoundedCornerShape(12.dp),
        badgeSize: Dp = 20.dp,
        horizontalBadgeOffset: Dp = 3.dp,
        verticalBadgeOffset: Dp = 3.dp,
    ): ImageSizes =
        ImageSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderIconSizes,
            overlayIconSizes = overlayIconSizes,
            smallShape = smallShape,
            mediumShape = mediumShape,
            largeShape = largeShape,
            badgeSize = badgeSize,
            horizontalBadgeOffset = horizontalBadgeOffset,
            verticalBadgeOffset = verticalBadgeOffset
        )

    /**
     * Creates an [ImageSizes] that represents the default sizes used in an image.
     *
     * @param boxSizes the container size of this image.
     * @param placeholderIconSizes the placeholder icon size of this image.
     * @param overlayIconSizes the overlay icon size of this image.
     * @param smallShape the shape that used when [ImageShape.SMALL] of this image.
     * @param mediumShape the shape that used when [ImageShape.MEDIUM] of this image.
     * @param largeShape the shape that used when [ImageShape.LARGE] of this image.
     * @param badgeSize the badge size of this image.
     * @param horizontalBadgeOffset the badge left offset of this image.
     * @param verticalBadgeOffset the badge bottom offset of this image.
     */
    @Composable
    fun size40(
        boxSizes: Dp = 40.dp,
        placeholderIconSizes: IconSizes = IconDefaults.size24(),
        overlayIconSizes: IconSizes = IconDefaults.size20(),
        smallShape: Shape = RoundedCornerShape(4.dp),
        mediumShape: Shape = RoundedCornerShape(8.dp),
        largeShape: Shape = RoundedCornerShape(12.dp),
        badgeSize: Dp = 20.dp,
        horizontalBadgeOffset: Dp = 3.dp,
        verticalBadgeOffset: Dp = 3.dp,
    ): ImageSizes =
        ImageSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderIconSizes,
            overlayIconSizes = overlayIconSizes,
            smallShape = smallShape,
            mediumShape = mediumShape,
            largeShape = largeShape,
            badgeSize = badgeSize,
            horizontalBadgeOffset = horizontalBadgeOffset,
            verticalBadgeOffset = verticalBadgeOffset
        )

    /**
     * Creates an [ImageSizes] that represents the default sizes used in an image.
     *
     * @param boxSizes the container size of this image.
     * @param placeholderIconSizes the placeholder icon size of this image.
     * @param overlayIconSizes the overlay icon size of this image.
     * @param smallShape the shape that used when [ImageShape.SMALL] of this image.
     * @param mediumShape the shape that used when [ImageShape.MEDIUM] of this image.
     * @param largeShape the shape that used when [ImageShape.LARGE] of this image.
     * @param badgeSize the badge size of this image.
     * @param horizontalBadgeOffset the badge left offset of this image.
     * @param verticalBadgeOffset the badge bottom offset of this image.
     */
    @Composable
    fun size36(
        boxSizes: Dp = 40.dp,
        placeholderIconSizes: IconSizes = IconDefaults.size24(),
        overlayIconSizes: IconSizes = IconDefaults.size20(),
        smallShape: Shape = RoundedCornerShape(4.dp),
        mediumShape: Shape = RoundedCornerShape(8.dp),
        largeShape: Shape = RoundedCornerShape(12.dp),
        badgeSize: Dp = 16.dp,
        horizontalBadgeOffset: Dp = 3.dp,
        verticalBadgeOffset: Dp = 3.dp,
    ): ImageSizes =
        ImageSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderIconSizes,
            overlayIconSizes = overlayIconSizes,
            smallShape = smallShape,
            mediumShape = mediumShape,
            largeShape = largeShape,
            badgeSize = badgeSize,
            horizontalBadgeOffset = horizontalBadgeOffset,
            verticalBadgeOffset = verticalBadgeOffset
        )

    /**
     * Creates an [ImageSizes] that represents the default sizes used in an image.
     *
     * @param boxSizes the container size of this image.
     * @param placeholderIconSizes the placeholder icon size of this image.
     * @param overlayIconSizes the overlay icon size of this image.
     * @param smallShape the shape that used when [ImageShape.SMALL] of this image.
     * @param mediumShape the shape that used when [ImageShape.MEDIUM] of this image.
     * @param largeShape the shape that used when [ImageShape.LARGE] of this image.
     * @param badgeSize the badge size of this image.
     * @param horizontalBadgeOffset the badge left offset of this image.
     * @param verticalBadgeOffset the badge bottom offset of this image.
     */
    @Composable
    fun size32(
        boxSizes: Dp = 32.dp,
        placeholderIconSizes: IconSizes = IconDefaults.size20(),
        overlayIconSizes: IconSizes = IconDefaults.size20(),
        smallShape: Shape = RoundedCornerShape(3.dp),
        mediumShape: Shape = RoundedCornerShape(7.dp),
        largeShape: Shape = RoundedCornerShape(11.dp),
        badgeSize: Dp = 16.dp,
        horizontalBadgeOffset: Dp = 3.dp,
        verticalBadgeOffset: Dp = 3.dp,
    ): ImageSizes =
        ImageSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderIconSizes,
            overlayIconSizes = overlayIconSizes,
            smallShape = smallShape,
            mediumShape = mediumShape,
            largeShape = largeShape,
            badgeSize = badgeSize,
            horizontalBadgeOffset = horizontalBadgeOffset,
            verticalBadgeOffset = verticalBadgeOffset
        )

    /**
     * Creates an [ImageSizes] that represents the default sizes used in an image.
     *
     * @param boxSizes the container size of this image.
     * @param placeholderIconSizes the placeholder icon size of this image.
     * @param overlayIconSizes the overlay icon size of this image.
     * @param smallShape the shape that used when [ImageShape.SMALL] of this image.
     * @param mediumShape the shape that used when [ImageShape.MEDIUM] of this image.
     * @param largeShape the shape that used when [ImageShape.LARGE] of this image.
     * @param badgeSize the badge size of this image.
     * @param horizontalBadgeOffset the badge left offset of this image.
     * @param verticalBadgeOffset the badge bottom offset of this image.
     */
    @Composable
    fun size28(
        boxSizes: Dp = 28.dp,
        placeholderIconSizes: IconSizes = IconDefaults.size18(),
        overlayIconSizes: IconSizes = IconDefaults.size20(),
        smallShape: Shape = RoundedCornerShape(3.dp),
        mediumShape: Shape = RoundedCornerShape(7.dp),
        largeShape: Shape = RoundedCornerShape(11.dp),
        badgeSize: Dp = 16.dp,
        horizontalBadgeOffset: Dp = 3.dp,
        verticalBadgeOffset: Dp = 3.dp,
    ): ImageSizes =
        ImageSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderIconSizes,
            overlayIconSizes = overlayIconSizes,
            smallShape = smallShape,
            mediumShape = mediumShape,
            largeShape = largeShape,
            badgeSize = badgeSize,
            horizontalBadgeOffset = horizontalBadgeOffset,
            verticalBadgeOffset = verticalBadgeOffset
        )

    /**
     * Creates an [ImageSizes] that represents the default sizes used in an image.
     *
     * @param boxSizes the container size of this image.
     * @param placeholderIconSizes the placeholder icon size of this image.
     * @param overlayIconSizes the overlay icon size of this image.
     * @param smallShape the shape that used when [ImageShape.SMALL] of this image.
     * @param mediumShape the shape that used when [ImageShape.MEDIUM] of this image.
     * @param largeShape the shape that used when [ImageShape.LARGE] of this image.
     * @param badgeSize the badge size of this image.
     * @param horizontalBadgeOffset the badge left offset of this image.
     * @param verticalBadgeOffset the badge bottom offset of this image.
     */
    @Composable
    fun size24(
        boxSizes: Dp = 24.dp,
        placeholderIconSizes: IconSizes = IconDefaults.size16(),
        overlayIconSizes: IconSizes = IconDefaults.size18(),
        smallShape: Shape = RoundedCornerShape(3.dp),
        mediumShape: Shape = RoundedCornerShape(7.dp),
        largeShape: Shape = RoundedCornerShape(9.dp),
        badgeSize: Dp = 16.dp,
        horizontalBadgeOffset: Dp = 3.dp,
        verticalBadgeOffset: Dp = 3.dp,
    ): ImageSizes =
        ImageSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderIconSizes,
            overlayIconSizes = overlayIconSizes,
            smallShape = smallShape,
            mediumShape = mediumShape,
            largeShape = largeShape,
            badgeSize = badgeSize,
            horizontalBadgeOffset = horizontalBadgeOffset,
            verticalBadgeOffset = verticalBadgeOffset
        )

    /**
     * Creates an [ImageSizes] that represents the default sizes used in an image.
     *
     * @param boxSizes the container size of this image.
     * @param placeholderIconSizes the placeholder icon size of this image.
     * @param smallShape the shape that used when [ImageShape.SMALL] of this image.
     * @param mediumShape the shape that used when [ImageShape.MEDIUM] of this image.
     * @param largeShape the shape that used when [ImageShape.LARGE] of this image.
     */
    @Composable
    fun size20(
        boxSizes: Dp = 20.dp,
        placeholderIconSizes: IconSizes = IconDefaults.size16(),
        smallShape: Shape = RoundedCornerShape(2.dp),
        mediumShape: Shape = RoundedCornerShape(6.dp),
        largeShape: Shape = RoundedCornerShape(8.dp)
    ): ImageSizes =
        ImageSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderIconSizes,
            overlayIconSizes = null,
            smallShape = smallShape,
            mediumShape = mediumShape,
            largeShape = largeShape,
            badgeSize = null,
            horizontalBadgeOffset = 0.dp,
            verticalBadgeOffset = 0.dp
        )

    /**
     * Creates an [ImageSizes] that represents the default sizes used in an image.
     *
     * @param boxSizes the container size of this image.
     * @param placeholderIconSizes the placeholder icon size of this image.
     * @param smallShape the shape that used when [ImageShape.SMALL] of this image.
     * @param mediumShape the shape that used when [ImageShape.MEDIUM] of this image.
     * @param largeShape the shape that used when [ImageShape.LARGE] of this image.
     */
    @Composable
    fun size16(
        boxSizes: Dp = 16.dp,
        placeholderIconSizes: IconSizes = IconDefaults.size12(),
        smallShape: Shape = RoundedCornerShape(2.dp),
        mediumShape: Shape = RoundedCornerShape(4.dp),
        largeShape: Shape = RoundedCornerShape(6.dp)
    ): ImageSizes =
        ImageSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderIconSizes,
            overlayIconSizes = null,
            smallShape = smallShape,
            mediumShape = mediumShape,
            largeShape = largeShape,
            badgeSize = null,
            horizontalBadgeOffset = 0.dp,
            verticalBadgeOffset = 0.dp
        )

    /**
     * Creates an [ImageColors] that represents the default sizes used in an avatar.
     *
     * @param placeholderContainerColor the container color of this avatar when placeholder is displayed
     * @param borderColor the border color of this avatar
     * @param placeholderIconColor the placeholder icon color of this avatar
     * @param overlayIconColor the overlay icon color of this avatar
     */
    @Composable
    fun colors(
        placeholderContainerColor: Color = PersianTheme.colorScheme.surfaceContainer,
        borderColor: Color = PersianTheme.colorScheme.outlineVariant,
        placeholderIconColor: Color = PersianTheme.colorScheme.onSurface.state38,
        overlayIconColor: Color = PersianTheme.colorScheme.primary,
    ): ImageColors =
        ImageColors(
            placeholderContainerColor = placeholderContainerColor,
            borderColor = borderColor,
            placeholderIconColor = placeholderIconColor,
            overlayIconColor = overlayIconColor,
        )
}

enum class ImageShape {
    SMALL, MEDIUM, LARGE
}

/**
 * Represents the container and contents sizes in different state.
 *
 * @param boxSizes the container size of this image.
 * @param placeholderIconSizes the placeholder icon size of this image.
 * @param overlayIconSizes the overlay icon size of this image.
 * @param smallShape the shape that used when [ImageShape.SMALL] of this image.
 * @param mediumShape the shape that used when [ImageShape.MEDIUM] of this image.
 * @param largeShape the shape that used when [ImageShape.LARGE] of this image.
 * @param badgeSize the badge size of this image.
 * @param horizontalBadgeOffset the badge left offset of this image.
 * @param verticalBadgeOffset the badge bottom offset of this image.
 *
 * @constructor create an instance with arbitrary colors.
 *
 * - See [ImageDefaults.size96] and other for the default sizes used in an [Image].
 */
@Immutable
class ImageSizes internal constructor(
    internal val boxSizes: Dp,
    internal val placeholderIconSizes: IconSizes,
    internal val overlayIconSizes: IconSizes?,
    private val smallShape: Shape,
    private val mediumShape: Shape,
    private val largeShape: Shape,
    internal val badgeSize: Dp?,
    internal val horizontalBadgeOffset: Dp,
    internal val verticalBadgeOffset: Dp,
) {

    /**
     * Represents the container shape for this image, depending on [ImageShape].
     *
     * @param shape the [ImageShape] size of this image.
     */
    @Stable
    internal fun shape(shape: ImageShape): Shape =
        when (shape) {
            ImageShape.SMALL -> smallShape
            ImageShape.MEDIUM -> mediumShape
            ImageShape.LARGE -> largeShape
        }

    /**
     * Returns a copy of this [ImageSizes], optionally overriding some of the values
     */
    fun copy(
        boxSizes: Dp = this.boxSizes,
        placeholderSize: IconSizes = this.placeholderIconSizes,
        overlayIconSizes: IconSizes? = this.overlayIconSizes,
        smallShape: Shape = this.smallShape,
        mediumShape: Shape = this.mediumShape,
        largeShape: Shape = this.largeShape,
        badgeSize: Dp? = this.badgeSize,
        horizontalBadgeOffset: Dp = this.horizontalBadgeOffset,
        verticalBadgeOffset: Dp = this.verticalBadgeOffset
    ): ImageSizes =
        ImageSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderSize,
            overlayIconSizes = overlayIconSizes,
            smallShape = smallShape,
            mediumShape = mediumShape,
            largeShape = largeShape,
            badgeSize = badgeSize,
            horizontalBadgeOffset = horizontalBadgeOffset,
            verticalBadgeOffset = verticalBadgeOffset
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ImageSizes) return false

        if (boxSizes != other.boxSizes) return false
        if (placeholderIconSizes != other.placeholderIconSizes) return false
        if (overlayIconSizes != other.overlayIconSizes) return false
        if (smallShape != other.smallShape) return false
        if (mediumShape != other.mediumShape) return false
        if (badgeSize != other.badgeSize) return false
        if (horizontalBadgeOffset != other.horizontalBadgeOffset) return false
        if (verticalBadgeOffset != other.verticalBadgeOffset) return false
        return largeShape == other.largeShape
    }

    override fun hashCode(): Int {
        var result = boxSizes.hashCode()
        result = 31 * result + placeholderIconSizes.hashCode()
        result = 31 * result + overlayIconSizes.hashCode()
        result = 31 * result + smallShape.hashCode()
        result = 31 * result + mediumShape.hashCode()
        result = 31 * result + largeShape.hashCode()
        result = 31 * result + badgeSize.hashCode()
        result = 31 * result + horizontalBadgeOffset.hashCode()
        result = 31 * result + verticalBadgeOffset.hashCode()
        return result
    }
}

/**
 * Represents the container and contents colors in different state.
 *
 * @param placeholderContainerColor the container color of this avatar when enabled when placeholder is displayed.
 * @param borderColor the border color of this avatar when enabled.
 * @param placeholderIconColor the placeholder icon color of this avatar when enabled.
 * @param overlayIconColor the overlay icon color of this avatar when enabled.
 *
 * @constructor create an instance with arbitrary colors.
 *
 * - See [ImageDefaults.colors] for the default colors used in an [Avatar].
 */
@Immutable
class ImageColors internal constructor(
    internal val placeholderContainerColor: Color,
    internal val borderColor: Color,
    internal val placeholderIconColor: Color,
    internal val overlayIconColor: Color,
) {
    /**
     * Returns a copy of this [ImageColors], optionally overriding some of the values
     */
    fun copy(
        placeholderContainerColor: Color = this.placeholderContainerColor,
        borderColor: Color = this.borderColor,
        placeholderIconColor: Color = this.placeholderIconColor,
        overlayIconColor: Color = this.overlayIconColor,
    ): ImageColors = ImageColors(
        placeholderContainerColor = placeholderContainerColor,
        borderColor = borderColor,
        placeholderIconColor = placeholderIconColor,
        overlayIconColor = overlayIconColor
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ImageColors) return false

        if (placeholderContainerColor != other.placeholderContainerColor) return false
        if (borderColor != other.borderColor) return false
        if (placeholderIconColor != other.placeholderIconColor) return false
        return overlayIconColor == other.overlayIconColor
    }

    override fun hashCode(): Int {
        var result = placeholderContainerColor.hashCode()
        result = 31 * result + placeholderIconColor.hashCode()
        result = 31 * result + borderColor.hashCode()
        result = 31 * result + overlayIconColor.hashCode()
        return result
    }
}