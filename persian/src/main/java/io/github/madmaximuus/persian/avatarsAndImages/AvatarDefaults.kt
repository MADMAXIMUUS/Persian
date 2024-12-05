package io.github.madmaximuus.persian.avatarsAndImages

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state38
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSizes

/**
 * Contains all default values used by [Avatar].
 */
object AvatarDefaults {

    /**
     * Creates an [AvatarSizes] that represents the default sizes used in an avatar.
     *
     * @param boxSizes the container size of this avatar.
     * @param placeholderIconSizes the placeholder icon size of this avatar.
     * @param overlayIconSizes the overlay icon size of this avatar.
     * @param badgeSize the badge size of this avatar.
     * @param horizontalBadgeOffset the badge left offset of this avatar.
     * @param verticalBadgeOffset the badge bottom offset of this avatar.
     * @param initialsTextStyle the initials text style of this avatar.
     */
    @Composable
    fun size96(
        boxSizes: Dp = 96.dp,
        placeholderIconSizes: IconSizes = IconDefaults.size48(),
        overlayIconSizes: IconSizes = IconDefaults.size32(),
        badgeSize: Dp = 28.dp,
        horizontalBadgeOffset: Dp = 0.dp,
        verticalBadgeOffset: Dp = 0.dp,
        initialsTextStyle: TextStyle = PersianTheme.typography.titleLarge.copy(
            fontSize = 30.sp,
            lineHeight = 36.sp
        )
    ): AvatarSizes =
        AvatarSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderIconSizes,
            overlayIconSizes = overlayIconSizes,
            badgeSize = badgeSize,
            horizontalBadgeOffset = horizontalBadgeOffset,
            verticalBadgeOffset = verticalBadgeOffset,
            initialsTextStyle = initialsTextStyle
        )

    /**
     * Creates an [AvatarSizes] that represents the default sizes used in an avatar.
     *
     * @param boxSizes the container size of this avatar.
     * @param placeholderIconSizes the placeholder icon size of this avatar.
     * @param overlayIconSizes the overlay icon size of this avatar.
     * @param badgeSize the badge size of this avatar.
     * @param horizontalBadgeOffset the badge left offset of this avatar.
     * @param verticalBadgeOffset the badge bottom offset of this avatar.
     * @param initialsTextStyle the initials text style of this avatar.
     */
    @Composable
    fun size88(
        boxSizes: Dp = 88.dp,
        placeholderIconSizes: IconSizes = IconDefaults.size48(),
        overlayIconSizes: IconSizes = IconDefaults.size32(),
        badgeSize: Dp = 28.dp,
        horizontalBadgeOffset: Dp = 1.dp,
        verticalBadgeOffset: Dp = 1.dp,
        initialsTextStyle: TextStyle = PersianTheme.typography.titleLarge.copy(
            fontSize = 30.sp,
            lineHeight = 36.sp
        )
    ): AvatarSizes =
        AvatarSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderIconSizes,
            overlayIconSizes = overlayIconSizes,
            badgeSize = badgeSize,
            horizontalBadgeOffset = horizontalBadgeOffset,
            verticalBadgeOffset = verticalBadgeOffset,
            initialsTextStyle = initialsTextStyle
        )

    /**
     * Creates an [AvatarSizes] that represents the default sizes used in an avatar.
     *
     * @param boxSizes the container size of this avatar.
     * @param placeholderIconSizes the placeholder icon size of this avatar.
     * @param overlayIconSizes the overlay icon size of this avatar.
     * @param badgeSize the badge size of this avatar.
     * @param horizontalBadgeOffset the badge left offset of this avatar.
     * @param verticalBadgeOffset the badge bottom offset of this avatar.
     * @param initialsTextStyle the initials text style of this avatar.
     */
    @Composable
    fun size80(
        boxSizes: Dp = 80.dp,
        placeholderIconSizes: IconSizes = IconDefaults.size48(),
        overlayIconSizes: IconSizes = IconDefaults.size32(),
        badgeSize: Dp = 28.dp,
        horizontalBadgeOffset: Dp = 0.dp,
        verticalBadgeOffset: Dp = 4.dp,
        initialsTextStyle: TextStyle = PersianTheme.typography.titleLarge.copy(
            fontSize = 26.sp,
            lineHeight = 32.sp
        )
    ): AvatarSizes =
        AvatarSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderIconSizes,
            overlayIconSizes = overlayIconSizes,
            badgeSize = badgeSize,
            horizontalBadgeOffset = horizontalBadgeOffset,
            verticalBadgeOffset = verticalBadgeOffset,
            initialsTextStyle = initialsTextStyle
        )

    /**
     * Creates an [AvatarSizes] that represents the default sizes used in an avatar.
     *
     * @param boxSizes the container size of this avatar.
     * @param placeholderIconSizes the placeholder icon size of this avatar.
     * @param overlayIconSizes the overlay icon size of this avatar.
     * @param badgeSize the badge size of this avatar.
     * @param horizontalBadgeOffset the badge left offset of this avatar.
     * @param verticalBadgeOffset the badge bottom offset of this avatar.
     * @param initialsTextStyle the initials text style of this avatar.
     */
    @Composable
    fun size72(
        boxSizes: Dp = 72.dp,
        placeholderIconSizes: IconSizes = IconDefaults.size40(),
        overlayIconSizes: IconSizes = IconDefaults.size28(),
        badgeSize: Dp = 28.dp,
        horizontalBadgeOffset: Dp = 3.dp,
        verticalBadgeOffset: Dp = 3.dp,
        initialsTextStyle: TextStyle = PersianTheme.typography.titleLarge.copy(
            fontSize = 26.sp,
            lineHeight = 32.sp
        )
    ): AvatarSizes =
        AvatarSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderIconSizes,
            overlayIconSizes = overlayIconSizes,
            badgeSize = badgeSize,
            horizontalBadgeOffset = horizontalBadgeOffset,
            verticalBadgeOffset = verticalBadgeOffset,
            initialsTextStyle = initialsTextStyle
        )

    /**
     * Creates an [AvatarSizes] that represents the default sizes used in an avatar.
     *
     * @param boxSizes the container size of this avatar.
     * @param placeholderIconSizes the placeholder icon size of this avatar.
     * @param overlayIconSizes the overlay icon size of this avatar.
     * @param badgeSize the badge size of this avatar.
     * @param horizontalBadgeOffset the badge left offset of this avatar.
     * @param verticalBadgeOffset the badge bottom offset of this avatar.
     * @param initialsTextStyle the initials text style of this avatar.
     */
    @Composable
    fun size64(
        boxSizes: Dp = 64.dp,
        placeholderIconSizes: IconSizes = IconDefaults.size40(),
        overlayIconSizes: IconSizes = IconDefaults.size28(),
        badgeSize: Dp = 24.dp,
        horizontalBadgeOffset: Dp = 2.dp,
        verticalBadgeOffset: Dp = 2.dp,
        initialsTextStyle: TextStyle = PersianTheme.typography.titleLarge.copy(
            fontSize = 21.sp,
            lineHeight = 27.sp
        )
    ): AvatarSizes =
        AvatarSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderIconSizes,
            overlayIconSizes = overlayIconSizes,
            badgeSize = badgeSize,
            horizontalBadgeOffset = horizontalBadgeOffset,
            verticalBadgeOffset = verticalBadgeOffset,
            initialsTextStyle = initialsTextStyle
        )

    /**
     * Creates an [AvatarSizes] that represents the default sizes used in an avatar.
     *
     * @param boxSizes the container size of this avatar.
     * @param placeholderIconSizes the placeholder icon size of this avatar.
     * @param overlayIconSizes the overlay icon size of this avatar.
     * @param badgeSize the badge size of this avatar.
     * @param horizontalBadgeOffset the badge left offset of this avatar.
     * @param verticalBadgeOffset the badge bottom offset of this avatar.
     * @param initialsTextStyle the initials text style of this avatar.
     */
    @Composable
    fun size56(
        boxSizes: Dp = 56.dp,
        placeholderIconSizes: IconSizes = IconDefaults.size32(),
        overlayIconSizes: IconSizes = IconDefaults.size28(),
        badgeSize: Dp = 24.dp,
        horizontalBadgeOffset: Dp = 3.dp,
        verticalBadgeOffset: Dp = 3.dp,
        initialsTextStyle: TextStyle = PersianTheme.typography.titleLarge.copy(
            fontSize = 18.sp,
            lineHeight = 24.sp
        )
    ): AvatarSizes =
        AvatarSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderIconSizes,
            overlayIconSizes = overlayIconSizes,
            badgeSize = badgeSize,
            horizontalBadgeOffset = horizontalBadgeOffset,
            verticalBadgeOffset = verticalBadgeOffset,
            initialsTextStyle = initialsTextStyle
        )

    /**
     * Creates an [AvatarSizes] that represents the default sizes used in an avatar.
     *
     * @param boxSizes the container size of this avatar.
     * @param placeholderIconSizes the placeholder icon size of this avatar.
     * @param overlayIconSizes the overlay icon size of this avatar.
     * @param badgeSize the badge size of this avatar.
     * @param horizontalBadgeOffset the badge left offset of this avatar.
     * @param verticalBadgeOffset the badge bottom offset of this avatar.
     * @param initialsTextStyle the initials text style of this avatar.
     */
    @Composable
    fun size48(
        boxSizes: Dp = 48.dp,
        placeholderIconSizes: IconSizes = IconDefaults.size32(),
        overlayIconSizes: IconSizes = IconDefaults.size24(),
        badgeSize: Dp = 20.dp,
        horizontalBadgeOffset: Dp = 2.dp,
        verticalBadgeOffset: Dp = 2.dp,
        initialsTextStyle: TextStyle = PersianTheme.typography.titleLarge.copy(
            fontSize = 17.sp,
            lineHeight = 23.sp
        )
    ): AvatarSizes =
        AvatarSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderIconSizes,
            overlayIconSizes = overlayIconSizes,
            badgeSize = badgeSize,
            horizontalBadgeOffset = horizontalBadgeOffset,
            verticalBadgeOffset = verticalBadgeOffset,
            initialsTextStyle = initialsTextStyle
        )

    /**
     * Creates an [AvatarSizes] that represents the default sizes used in an avatar.
     *
     * @param boxSizes the container size of this avatar.
     * @param placeholderIconSizes the placeholder icon size of this avatar.
     * @param overlayIconSizes the overlay icon size of this avatar.
     * @param badgeSize the badge size of this avatar.
     * @param horizontalBadgeOffset the badge left offset of this avatar.
     * @param verticalBadgeOffset the badge bottom offset of this avatar.
     * @param initialsTextStyle the initials text style of this avatar.
     */
    @Composable
    fun size44(
        boxSizes: Dp = 44.dp,
        placeholderIconSizes: IconSizes = IconDefaults.size28(),
        overlayIconSizes: IconSizes = IconDefaults.size24(),
        badgeSize: Dp = 20.dp,
        horizontalBadgeOffset: Dp = 3.dp,
        verticalBadgeOffset: Dp = 3.dp,
        initialsTextStyle: TextStyle = PersianTheme.typography.titleLarge.copy(
            fontSize = 14.sp,
            lineHeight = 20.sp
        )
    ): AvatarSizes =
        AvatarSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderIconSizes,
            overlayIconSizes = overlayIconSizes,
            badgeSize = badgeSize,
            horizontalBadgeOffset = horizontalBadgeOffset,
            verticalBadgeOffset = verticalBadgeOffset,
            initialsTextStyle = initialsTextStyle
        )

    /**
     * Creates an [AvatarSizes] that represents the default sizes used in an avatar.
     *
     * @param boxSizes the container size of this avatar.
     * @param placeholderIconSizes the placeholder icon size of this avatar.
     * @param overlayIconSizes the overlay icon size of this avatar.
     * @param badgeSize the badge size of this avatar.
     * @param horizontalBadgeOffset the badge left offset of this avatar.
     * @param verticalBadgeOffset the badge bottom offset of this avatar.
     * @param initialsTextStyle the initials text style of this avatar.
     */
    @Composable
    fun size40(
        boxSizes: Dp = 40.dp,
        placeholderIconSizes: IconSizes = IconDefaults.size24(),
        overlayIconSizes: IconSizes = IconDefaults.size20(),
        badgeSize: Dp = 20.dp,
        horizontalBadgeOffset: Dp = 3.dp,
        verticalBadgeOffset: Dp = 3.dp,
        initialsTextStyle: TextStyle = PersianTheme.typography.titleLarge.copy(
            fontSize = 14.sp,
            lineHeight = 20.sp
        )
    ): AvatarSizes =
        AvatarSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderIconSizes,
            overlayIconSizes = overlayIconSizes,
            badgeSize = badgeSize,
            horizontalBadgeOffset = horizontalBadgeOffset,
            verticalBadgeOffset = verticalBadgeOffset,
            initialsTextStyle = initialsTextStyle
        )

    /**
     * Creates an [AvatarSizes] that represents the default sizes used in an avatar.
     *
     * @param boxSizes the container size of this avatar.
     * @param placeholderIconSizes the placeholder icon size of this avatar.
     * @param overlayIconSizes the overlay icon size of this avatar.
     * @param badgeSize the badge size of this avatar.
     * @param horizontalBadgeOffset the badge left offset of this avatar.
     * @param verticalBadgeOffset the badge bottom offset of this avatar.
     * @param initialsTextStyle the initials text style of this avatar.
     */
    @Composable
    fun size36(
        boxSizes: Dp = 36.dp,
        placeholderIconSizes: IconSizes = IconDefaults.size24(),
        overlayIconSizes: IconSizes = IconDefaults.size20(),
        badgeSize: Dp = 16.dp,
        horizontalBadgeOffset: Dp = 2.dp,
        verticalBadgeOffset: Dp = 2.dp,
        initialsTextStyle: TextStyle = PersianTheme.typography.titleLarge.copy(
            fontSize = 13.sp,
            lineHeight = 19.sp
        )
    ): AvatarSizes =
        AvatarSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderIconSizes,
            overlayIconSizes = overlayIconSizes,
            badgeSize = badgeSize,
            horizontalBadgeOffset = horizontalBadgeOffset,
            verticalBadgeOffset = verticalBadgeOffset,
            initialsTextStyle = initialsTextStyle
        )

    /**
     * Creates an [AvatarSizes] that represents the default sizes used in an avatar.
     *
     * @param boxSizes the container size of this avatar.
     * @param placeholderIconSizes the placeholder icon size of this avatar.
     * @param overlayIconSizes the overlay icon size of this avatar.
     * @param badgeSize the badge size of this avatar.
     * @param horizontalBadgeOffset the badge left offset of this avatar.
     * @param verticalBadgeOffset the badge bottom offset of this avatar.
     * @param initialsTextStyle the initials text style of this avatar.
     */
    @Composable
    fun size32(
        boxSizes: Dp = 32.dp,
        placeholderIconSizes: IconSizes = IconDefaults.size20(),
        overlayIconSizes: IconSizes = IconDefaults.size20(),
        badgeSize: Dp = 16.dp,
        horizontalBadgeOffset: Dp = 3.dp,
        verticalBadgeOffset: Dp = 3.dp,
        initialsTextStyle: TextStyle = PersianTheme.typography.titleLarge.copy(
            fontSize = 10.sp,
            lineHeight = 16.sp
        )
    ): AvatarSizes =
        AvatarSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderIconSizes,
            overlayIconSizes = overlayIconSizes,
            badgeSize = badgeSize,
            horizontalBadgeOffset = horizontalBadgeOffset,
            verticalBadgeOffset = verticalBadgeOffset,
            initialsTextStyle = initialsTextStyle
        )

    /**
     * Creates an [AvatarSizes] that represents the default sizes used in an avatar.
     *
     * @param boxSizes the container size of this avatar.
     * @param placeholderIconSizes the placeholder icon size of this avatar.
     * @param overlayIconSizes the overlay icon size of this avatar.
     * @param badgeSize the badge size of this avatar.
     * @param horizontalBadgeOffset the badge left offset of this avatar.
     * @param verticalBadgeOffset the badge bottom offset of this avatar.
     * @param initialsTextStyle the initials text style of this avatar.
     */
    @Composable
    fun size28(
        boxSizes: Dp = 28.dp,
        placeholderIconSizes: IconSizes = IconDefaults.size20(),
        overlayIconSizes: IconSizes = IconDefaults.size18(),
        badgeSize: Dp = 16.dp,
        horizontalBadgeOffset: Dp = 3.dp,
        verticalBadgeOffset: Dp = 3.dp,
        initialsTextStyle: TextStyle = PersianTheme.typography.titleLarge.copy(
            fontSize = 10.sp,
            lineHeight = 16.sp
        )
    ): AvatarSizes =
        AvatarSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderIconSizes,
            overlayIconSizes = overlayIconSizes,
            badgeSize = badgeSize,
            horizontalBadgeOffset = horizontalBadgeOffset,
            verticalBadgeOffset = verticalBadgeOffset,
            initialsTextStyle = initialsTextStyle
        )

    /**
     * Creates an [AvatarSizes] that represents the default sizes used in an avatar.
     *
     * @param boxSizes the container size of this avatar.
     * @param placeholderIconSizes the placeholder icon size of this avatar.
     * @param overlayIconSizes the overlay icon size of this avatar.
     * @param badgeSize the badge size of this avatar.
     * @param horizontalBadgeOffset the badge left offset of this avatar.
     * @param verticalBadgeOffset the badge bottom offset of this avatar.
     * @param initialsTextStyle the initials text style of this avatar.
     */
    @Composable
    fun size24(
        boxSizes: Dp = 24.dp,
        placeholderIconSizes: IconSizes = IconDefaults.size16(),
        overlayIconSizes: IconSizes = IconDefaults.size18(),
        badgeSize: Dp = 16.dp,
        horizontalBadgeOffset: Dp = 3.dp,
        verticalBadgeOffset: Dp = 3.dp,
        initialsTextStyle: TextStyle = PersianTheme.typography.titleLarge.copy(
            fontSize = 8.sp,
            lineHeight = 14.sp
        )
    ): AvatarSizes =
        AvatarSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderIconSizes,
            overlayIconSizes = overlayIconSizes,
            badgeSize = badgeSize,
            horizontalBadgeOffset = horizontalBadgeOffset,
            verticalBadgeOffset = verticalBadgeOffset,
            initialsTextStyle = initialsTextStyle
        )

    /**
     * Creates an [AvatarSizes] that represents the default sizes used in an avatar.
     *
     * @param boxSizes the container size of this avatar.
     * @param placeholderIconSizes the placeholder icon size of this avatar.
     * @param initialsTextStyle the initials text style of this avatar.
     */
    @Composable
    fun size20(
        boxSizes: Dp = 20.dp,
        placeholderIconSizes: IconSizes = IconDefaults.size16(),
        initialsTextStyle: TextStyle = PersianTheme.typography.labelLarge.copy(
            fontSize = 8.sp,
            lineHeight = 14.sp
        )
    ): AvatarSizes =
        AvatarSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderIconSizes,
            overlayIconSizes = null,
            badgeSize = null,
            horizontalBadgeOffset = 0.dp,
            verticalBadgeOffset = 0.dp,
            initialsTextStyle = initialsTextStyle
        )

    /**
     * Creates an [AvatarSizes] that represents the default sizes used in an avatar.
     *
     * @param boxSizes the container size of this avatar.
     * @param placeholderIconSizes the placeholder icon size of this avatar.
     * @param initialsTextStyle the initials text style of this avatar.
     */
    @Composable
    fun size16(
        boxSizes: Dp = 16.dp,
        placeholderIconSizes: IconSizes = IconDefaults.size12(),
        initialsTextStyle: TextStyle = PersianTheme.typography.titleLarge.copy(
            fontSize = 5.sp,
            lineHeight = 11.sp
        )
    ): AvatarSizes =
        AvatarSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderIconSizes,
            overlayIconSizes = null,
            badgeSize = null,
            horizontalBadgeOffset = 0.dp,
            verticalBadgeOffset = 0.dp,
            initialsTextStyle = initialsTextStyle
        )


    /**
     * Creates an [AvatarColors] that represents the default sizes used in an avatar.
     *
     * @param placeholderContainerColor the container color of this avatar when placeholder is displayed.
     * @param borderColor the border color of this avatar
     * @param placeholderIconColor the placeholder icon color of this avatar
     * @param overlayIconColor the overlay icon color of this avatar
     * @param initialsTextColor the initials color of this avatar
     * @param initialsContainerColor the initials container color of this avatar
     */
    @Composable
    fun colors(
        placeholderContainerColor: Color = PersianTheme.colorScheme.surfaceContainer,
        borderColor: Color = PersianTheme.colorScheme.outlineVariant,
        placeholderIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant.state38,
        overlayIconColor: Color = PersianTheme.colorScheme.primary,
        initialsTextColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        initialsContainerColor: Color = PersianTheme.colorScheme.surfaceContainerHighest,
    ): AvatarColors =
        AvatarColors(
            placeholderContainerColor = placeholderContainerColor,
            borderColor = borderColor,
            placeholderIconColor = placeholderIconColor,
            overlayIconColor = overlayIconColor,
            initialsTextColor = initialsTextColor,
            initialsContainerColor = initialsContainerColor,
        )
}

/**
 * Represents the container and contents sizes in different state.
 *
 * @param boxSizes the container size of this avatar.
 * @param placeholderIconSizes the placeholder icon size of this avatar.
 * @param overlayIconSizes the overlay icon size of this avatar.
 * @param badgeSize the badge size of this avatar.
 * @param horizontalBadgeOffset the badge left offset of this avatar.
 * @param verticalBadgeOffset the badge bottom offset of this avatar.
 * @param initialsTextStyle the initials text style of this avatar.
 *
 * @constructor create an instance with arbitrary colors.
 *
 * - See [AvatarDefaults.size96] and other sizes for the default sizes used in an [Avatar].
 */
@Immutable
class AvatarSizes internal constructor(
    internal val boxSizes: Dp,
    internal val placeholderIconSizes: IconSizes,
    internal val overlayIconSizes: IconSizes?,
    internal val badgeSize: Dp?,
    internal val horizontalBadgeOffset: Dp,
    internal val verticalBadgeOffset: Dp,
    internal val initialsTextStyle: TextStyle
) {
    /**
     * Returns a copy of this [AvatarSizes], optionally overriding some of the values
     */
    fun copy(
        boxSizes: Dp = this.boxSizes,
        placeholderSize: IconSizes = this.placeholderIconSizes,
        overlayIconSizes: IconSizes? = this.overlayIconSizes,
        badgeSize: Dp? = this.badgeSize,
        horizontalBadgeOffset: Dp = this.horizontalBadgeOffset,
        verticalBadgeOffset: Dp = this.verticalBadgeOffset,
        initialsTextStyle: TextStyle = this.initialsTextStyle
    ): AvatarSizes =
        AvatarSizes(
            boxSizes = boxSizes,
            placeholderIconSizes = placeholderSize,
            overlayIconSizes = overlayIconSizes,
            badgeSize = badgeSize,
            horizontalBadgeOffset = horizontalBadgeOffset,
            verticalBadgeOffset = verticalBadgeOffset,
            initialsTextStyle = initialsTextStyle
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is AvatarSizes) return false

        if (boxSizes != other.boxSizes) return false
        if (placeholderIconSizes != other.placeholderIconSizes) return false
        if (overlayIconSizes != other.overlayIconSizes) return false
        if (badgeSize != other.badgeSize) return false
        if (horizontalBadgeOffset != other.horizontalBadgeOffset) return false
        if (initialsTextStyle != other.initialsTextStyle) return false
        return verticalBadgeOffset == other.verticalBadgeOffset
    }

    override fun hashCode(): Int {
        var result = boxSizes.hashCode()
        result = 31 * result + placeholderIconSizes.hashCode()
        result = 31 * result + overlayIconSizes.hashCode()
        result = 31 * result + badgeSize.hashCode()
        result = 31 * result + horizontalBadgeOffset.hashCode()
        result = 31 * result + verticalBadgeOffset.hashCode()
        result = 31 * result + initialsTextStyle.hashCode()
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
 * @param initialsTextColor the initials color of this avatar when enabled.
 * @param initialsContainerColor the initials container color of this avatar when enabled.
 *
 * @constructor create an instance with arbitrary colors.
 *
 * - See [AvatarDefaults.colors] for the default colors used in an [Avatar].
 */
@Immutable
class AvatarColors internal constructor(
    internal val borderColor: Color,
    internal val placeholderIconColor: Color,
    private val placeholderContainerColor: Color,
    internal val overlayIconColor: Color,
    internal val initialsTextColor: Color,
    private val initialsContainerColor: Color,
) {

    /**
     * Represents the container color for this avatar, depending on [initials].
     *
     * @param initials whether the initials is displayed in avatar.
     */
    @Stable
    internal fun container(initials: Boolean): Color =
        if (initials) initialsContainerColor else placeholderContainerColor

    /**
     * Returns a copy of this [AvatarColors], optionally overriding some of the values
     */
    fun copy(
        placeholderContainerColor: Color = this.placeholderContainerColor,
        borderColor: Color = this.borderColor,
        placeholderIconColor: Color = this.placeholderIconColor,
        overlayIconColor: Color = this.overlayIconColor,
        initialsTextColor: Color = this.initialsTextColor,
        initialsContainerColor: Color = this.initialsContainerColor,
    ): AvatarColors =
        AvatarColors(
            placeholderContainerColor = placeholderContainerColor,
            borderColor = borderColor,
            placeholderIconColor = placeholderIconColor,
            overlayIconColor = overlayIconColor,
            initialsTextColor = initialsTextColor,
            initialsContainerColor = initialsContainerColor
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is AvatarColors) return false

        if (placeholderContainerColor != other.placeholderContainerColor) return false
        if (borderColor != other.borderColor) return false
        if (placeholderIconColor != other.placeholderIconColor) return false
        if (overlayIconColor != other.overlayIconColor) return false
        if (initialsTextColor != other.initialsTextColor) return false
        return initialsContainerColor == other.initialsContainerColor
    }

    override fun hashCode(): Int {
        var result = placeholderContainerColor.hashCode()
        result = 31 * result + placeholderIconColor.hashCode()
        result = 31 * result + borderColor.hashCode()
        result = 31 * result + overlayIconColor.hashCode()
        result = 31 * result + initialsTextColor.hashCode()
        result = 31 * result + initialsContainerColor.hashCode()
        return result
    }
}