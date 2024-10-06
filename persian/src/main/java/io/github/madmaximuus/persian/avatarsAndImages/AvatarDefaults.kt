package io.github.madmaximuus.persian.avatarsAndImages

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.takeOrElse
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state08
import io.github.madmaximuus.persian.foundation.state12
import io.github.madmaximuus.persian.foundation.state38
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSizes

/**
 * Contains all default values used by all alert types
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
        initialsTextStyle: TextStyle = PersianTheme.typography.bodyLarge.copy(
            fontSize = 30.sp
        )
    ) = AvatarSizes(
        boxSizes,
        placeholderIconSizes,
        overlayIconSizes,
        badgeSize,
        horizontalBadgeOffset,
        verticalBadgeOffset,
        initialsTextStyle
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
        initialsTextStyle: TextStyle = PersianTheme.typography.bodyLarge.copy(
            fontSize = 30.sp
        )
    ) = AvatarSizes(
        boxSizes,
        placeholderIconSizes,
        overlayIconSizes,
        badgeSize,
        horizontalBadgeOffset,
        verticalBadgeOffset,
        initialsTextStyle
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
        initialsTextStyle: TextStyle = PersianTheme.typography.bodyLarge.copy(
            fontSize = 26.sp
        )
    ) = AvatarSizes(
        boxSizes,
        placeholderIconSizes,
        overlayIconSizes,
        badgeSize,
        horizontalBadgeOffset,
        verticalBadgeOffset,
        initialsTextStyle
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
        initialsTextStyle: TextStyle = PersianTheme.typography.bodyLarge.copy(
            fontSize = 26.sp
        )
    ) = AvatarSizes(
        boxSizes,
        placeholderIconSizes,
        overlayIconSizes,
        badgeSize,
        horizontalBadgeOffset,
        verticalBadgeOffset,
        initialsTextStyle
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
        initialsTextStyle: TextStyle = PersianTheme.typography.bodyLarge.copy(
            fontSize = 21.sp
        )
    ) = AvatarSizes(
        boxSizes,
        placeholderIconSizes,
        overlayIconSizes,
        badgeSize,
        horizontalBadgeOffset,
        verticalBadgeOffset,
        initialsTextStyle
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
        initialsTextStyle: TextStyle = PersianTheme.typography.bodyLarge.copy(
            fontSize = 18.sp
        )
    ) = AvatarSizes(
        boxSizes,
        placeholderIconSizes,
        overlayIconSizes,
        badgeSize,
        horizontalBadgeOffset,
        verticalBadgeOffset,
        initialsTextStyle
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
        initialsTextStyle: TextStyle = PersianTheme.typography.bodyLarge.copy(
            fontSize = 17.sp
        )
    ) = AvatarSizes(
        boxSizes,
        placeholderIconSizes,
        overlayIconSizes,
        badgeSize,
        horizontalBadgeOffset,
        verticalBadgeOffset,
        initialsTextStyle
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
        initialsTextStyle: TextStyle = PersianTheme.typography.bodyLarge.copy(
            fontSize = 14.sp
        )
    ) = AvatarSizes(
        boxSizes,
        placeholderIconSizes,
        overlayIconSizes,
        badgeSize,
        horizontalBadgeOffset,
        verticalBadgeOffset,
        initialsTextStyle
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
        initialsTextStyle: TextStyle = PersianTheme.typography.bodyLarge.copy(
            fontSize = 14.sp
        )
    ) = AvatarSizes(
        boxSizes,
        placeholderIconSizes,
        overlayIconSizes,
        badgeSize,
        horizontalBadgeOffset,
        verticalBadgeOffset,
        initialsTextStyle
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
        initialsTextStyle: TextStyle = PersianTheme.typography.bodyLarge.copy(
            fontSize = 13.sp
        )
    ) = AvatarSizes(
        boxSizes,
        placeholderIconSizes,
        overlayIconSizes,
        badgeSize,
        horizontalBadgeOffset,
        verticalBadgeOffset,
        initialsTextStyle
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
        initialsTextStyle: TextStyle = PersianTheme.typography.bodyLarge.copy(
            fontSize = 10.sp
        )
    ) = AvatarSizes(
        boxSizes,
        placeholderIconSizes,
        overlayIconSizes,
        badgeSize,
        horizontalBadgeOffset,
        verticalBadgeOffset,
        initialsTextStyle
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
        initialsTextStyle: TextStyle = PersianTheme.typography.bodyLarge.copy(
            fontSize = 10.sp
        )
    ) = AvatarSizes(
        boxSizes,
        placeholderIconSizes,
        overlayIconSizes,
        badgeSize,
        horizontalBadgeOffset,
        verticalBadgeOffset,
        initialsTextStyle
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
        initialsTextStyle: TextStyle = PersianTheme.typography.bodyLarge.copy(
            fontSize = 8.sp
        )
    ) = AvatarSizes(
        boxSizes,
        placeholderIconSizes,
        overlayIconSizes,
        badgeSize,
        horizontalBadgeOffset,
        verticalBadgeOffset,
        initialsTextStyle
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
        initialsTextStyle: TextStyle = PersianTheme.typography.bodyLarge.copy(
            fontSize = 8.sp
        )
    ) = AvatarSizes(
        boxSizes,
        placeholderIconSizes,
        null,
        null,
        0.dp,
        0.dp,
        initialsTextStyle
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
        initialsTextStyle: TextStyle = PersianTheme.typography.bodyLarge.copy(
            fontSize = 5.sp
        )
    ) = AvatarSizes(
        boxSizes,
        placeholderIconSizes,
        null,
        null,
        0.dp,
        0.dp,
        initialsTextStyle
    )


    /**
     * Creates an [AvatarColors] that represents the default sizes used in an avatar.
     *
     * @param placeholderContainerColor the container color of this avatar when enabled when placeholder is displayed.
     * @param disabledPlaceholderContainerColor the container color of this avatar when not enabled when placeholder is displayed.
     * @param borderColor the border color of this avatar when enabled.
     * @param disabledBorderColor the border color of this avatar when not enabled.
     * @param placeholderIconColor the placeholder icon color of this avatar when enabled.
     * @param disabledPlaceholderIconColor the placeholder icon color of this avatar when not enabled.
     * @param overlayIconColor the overlay icon color of this avatar when enabled.
     * @param disabledOverlayIconColor the overlay icon color of this avatar when not enabled.
     * @param initialsTextColor the initials color of this avatar when enabled.
     * @param disabledInitialsTextColor the initials text color of this avatar when not enabled.
     * @param initialsContainerColor the initials container color of this avatar when enabled.
     * @param disabledInitialsContainerColor the initials container color of this avatar when not enabled.
     */
    @Composable
    fun colors(
        placeholderContainerColor: Color = PersianTheme.colorScheme.surfaceContainer,
        disabledPlaceholderContainerColor: Color = PersianTheme.colorScheme.onSurface.state08,

        borderColor: Color = PersianTheme.colorScheme.outlineVariant,
        disabledBorderColor: Color = PersianTheme.colorScheme.onSurface.state12,

        placeholderIconColor: Color = PersianTheme.colorScheme.onSurface.state38,
        disabledPlaceholderIconColor: Color = PersianTheme.colorScheme.onSurface.state38,

        overlayIconColor: Color = PersianTheme.colorScheme.primary,
        disabledOverlayIconColor: Color = PersianTheme.colorScheme.onSurface.state38,

        initialsTextColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        disabledInitialsTextColor: Color = PersianTheme.colorScheme.onSurface.state38,

        initialsContainerColor: Color = PersianTheme.colorScheme.surfaceContainerHighest,
        disabledInitialsContainerColor: Color = disabledPlaceholderContainerColor
    ): AvatarColors = AvatarColors(
        placeholderContainerColor = placeholderContainerColor,
        disabledPlaceholderContainerColor = disabledPlaceholderContainerColor,

        borderColor = borderColor,
        disabledBorderColor = disabledBorderColor,

        placeholderIconColor = placeholderIconColor,
        disabledPlaceholderIconColor = disabledPlaceholderIconColor,

        overlayIconColor = overlayIconColor,
        disabledOverlayIconColor = disabledOverlayIconColor,

        initialsTextColor = initialsTextColor,
        disabledInitialsTextColor = disabledInitialsTextColor,

        initialsContainerColor = initialsContainerColor,
        disabledInitialsContainerColor = disabledInitialsContainerColor
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
    ) = AvatarSizes(
        boxSizes.takeOrElse { this.boxSizes },
        placeholderSize,
        overlayIconSizes,
        badgeSize,
        horizontalBadgeOffset.takeOrElse { this.horizontalBadgeOffset },
        verticalBadgeOffset.takeOrElse { this.verticalBadgeOffset },
        initialsTextStyle
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
 * @param disabledPlaceholderContainerColor the container color of this avatar when not enabled when placeholder is displayed.
 * @param borderColor the border color of this avatar when enabled.
 * @param disabledBorderColor the border color of this avatar when not enabled.
 * @param placeholderIconColor the placeholder icon color of this avatar when enabled.
 * @param disabledPlaceholderIconColor the placeholder icon color of this avatar when not enabled.
 * @param overlayIconColor the overlay icon color of this avatar when enabled.
 * @param disabledOverlayIconColor the overlay icon color of this avatar when not enabled.
 * @param initialsTextColor the initials color of this avatar when enabled.
 * @param disabledInitialsTextColor the initials text color of this avatar when not enabled.
 * @param initialsContainerColor the initials container color of this avatar when enabled.
 * @param disabledInitialsContainerColor the initials container color of this avatar when not enabled.
 *
 * @constructor create an instance with arbitrary colors.
 *
 * - See [AvatarDefaults.colors] for the default colors used in an [Avatar].
 */
@Immutable
class AvatarColors internal constructor(
    private val placeholderContainerColor: Color,
    private val disabledPlaceholderContainerColor: Color,

    private val borderColor: Color,
    private val disabledBorderColor: Color,

    private val placeholderIconColor: Color,
    private val disabledPlaceholderIconColor: Color,

    private val overlayIconColor: Color,
    private val disabledOverlayIconColor: Color,

    private val initialsTextColor: Color,
    private val disabledInitialsTextColor: Color,

    private val initialsContainerColor: Color,
    private val disabledInitialsContainerColor: Color,
) {

    /**
     * Represents the container color for this avatar, depending on [enabled] and [initials].
     *
     * @param enabled whether the avatar is enabled
     * @param initials whether the initials is displayed in avatar.
     */
    @Stable
    internal fun container(enabled: Boolean, initials: Boolean): Color =
        if (enabled)
            if (initials) initialsContainerColor else placeholderContainerColor
        else
            if (initials) disabledInitialsContainerColor else disabledPlaceholderContainerColor

    /**
     * Represents the border color for this avatar, depending on [enabled].
     *
     * @param enabled whether the avatar is enabled.
     */
    @Stable
    internal fun border(enabled: Boolean): Color =
        if (enabled) borderColor else disabledBorderColor

    /**
     * Represents the placeholder icon color for this avatar, depending on [enabled].
     *
     * @param enabled whether the avatar is enabled.
     */
    @Stable
    internal fun placeholderIcon(enabled: Boolean): Color =
        if (enabled) placeholderIconColor else disabledPlaceholderIconColor

    /**
     * Represents the overlay icon color for this avatar, depending on [enabled].
     *
     * @param enabled whether the avatar is enabled.
     */
    @Stable
    internal fun overlayIcon(enabled: Boolean): Color =
        if (enabled) overlayIconColor else disabledOverlayIconColor

    /**
     * Represents the initials color for this avatar, depending on [enabled].
     *
     * @param enabled whether the avatar is enabled.
     */
    @Stable
    internal fun initials(enabled: Boolean): Color =
        if (enabled) initialsTextColor else disabledInitialsTextColor

    /**
     * Returns a copy of this [AvatarColors], optionally overriding some of the values
     */
    fun copy(
        placeholderContainerColor: Color = this.placeholderContainerColor,
        disabledPlaceholderContainerColor: Color = this.disabledPlaceholderContainerColor,

        borderColor: Color = this.borderColor,
        disabledBorderColor: Color = this.disabledBorderColor,

        placeholderIconColor: Color = this.placeholderIconColor,
        disabledPlaceholderIconColor: Color = this.disabledPlaceholderIconColor,

        overlayIconColor: Color = this.overlayIconColor,
        disabledOverlayIconColor: Color = this.disabledOverlayIconColor,

        initialsTextColor: Color = this.initialsTextColor,
        disabledInitialsColor: Color = this.initialsTextColor,

        initialsContainerColor: Color = this.initialsContainerColor,
        disabledInitialsContainerColor: Color = this.disabledInitialsContainerColor
    ): AvatarColors = AvatarColors(
        placeholderContainerColor = placeholderContainerColor.takeOrElse { this.placeholderContainerColor },
        disabledPlaceholderContainerColor = disabledPlaceholderContainerColor.takeOrElse { this.disabledPlaceholderContainerColor },

        borderColor = borderColor.takeOrElse { this.borderColor },
        disabledBorderColor = disabledBorderColor.takeOrElse { this.disabledBorderColor },

        placeholderIconColor = placeholderIconColor.takeOrElse { this.placeholderIconColor },
        disabledPlaceholderIconColor = disabledPlaceholderIconColor.takeOrElse { this.disabledPlaceholderIconColor },

        overlayIconColor = overlayIconColor.takeOrElse { this.overlayIconColor },
        disabledOverlayIconColor = disabledOverlayIconColor.takeOrElse { this.disabledOverlayIconColor },

        initialsTextColor = initialsTextColor.takeOrElse { this.initialsTextColor },
        disabledInitialsTextColor = disabledInitialsColor.takeOrElse { this.disabledInitialsTextColor },

        initialsContainerColor = initialsContainerColor.takeOrElse { this.initialsContainerColor },
        disabledInitialsContainerColor = disabledInitialsContainerColor.takeOrElse { this.disabledInitialsContainerColor }
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is AvatarColors) return false

        if (placeholderContainerColor != other.placeholderContainerColor) return false
        if (disabledPlaceholderContainerColor != other.disabledPlaceholderContainerColor) return false
        if (borderColor != other.borderColor) return false
        if (disabledBorderColor != other.disabledBorderColor) return false
        if (placeholderIconColor != other.placeholderIconColor) return false
        if (disabledPlaceholderIconColor != other.disabledPlaceholderIconColor) return false
        if (overlayIconColor != other.overlayIconColor) return false
        if (initialsTextColor != other.initialsTextColor) return false
        if (disabledInitialsTextColor != other.disabledInitialsTextColor) return false
        if (initialsContainerColor != other.initialsContainerColor) return false
        if (disabledInitialsContainerColor != other.disabledInitialsContainerColor) return false
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
        result = 31 * result + initialsTextColor.hashCode()
        result = 31 * result + disabledInitialsTextColor.hashCode()
        result = 31 * result + initialsContainerColor.hashCode()
        result = 31 * result + disabledInitialsContainerColor.hashCode()
        return result
    }
}