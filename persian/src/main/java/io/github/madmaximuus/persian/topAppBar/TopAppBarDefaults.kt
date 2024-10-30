package io.github.madmaximuus.persian.topAppBar

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.DecayAnimationSpec
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.rememberSplineBasedDecay
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.systemBars
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.avatarsAndImages.AvatarColors
import io.github.madmaximuus.persian.avatarsAndImages.AvatarDefaults
import io.github.madmaximuus.persian.avatarsAndImages.AvatarSizes
import io.github.madmaximuus.persian.button.ButtonColors
import io.github.madmaximuus.persian.button.ButtonDefaults
import io.github.madmaximuus.persian.button.ButtonSizes
import io.github.madmaximuus.persian.counter.CounterColors
import io.github.madmaximuus.persian.counter.CounterDefaults
import io.github.madmaximuus.persian.counter.CounterSizes
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.iconButton.IconButtonColors
import io.github.madmaximuus.persian.iconButton.IconButtonDefaults
import io.github.madmaximuus.persian.iconButton.IconButtonSizes
import io.github.madmaximuus.persian.menu.MenuColors
import io.github.madmaximuus.persian.menu.MenuDefaults
import io.github.madmaximuus.persian.menu.MenuSizes

object TopAppBarDefaults {

    /**
     * A composable function that creates a [TopAppBarColors] instance with customizable color properties.
     *
     * This function allows you to specify various color properties for the top app bar,
     * including container colors, icon button colors, avatar colors, title text color,
     * action button colors, menu colors, and badge colors.
     *
     * @param containerColor The background color of the top app bar container.
     * @param scrolledContainerColor The background color of the top app bar container when scrolled.
     * @param leftIconButtonColors The colors for the icon buttons on the left side of the top app bar.
     * @param leftAvatarColors The colors for the avatar on the left side of the top app bar.
     * @param titleTextColor The color of the title text in the top app bar. Default is the on-surface color from the theme.
     * @param rightActionButtonColors The colors for the action buttons on the right side of the top app bar.
     * @param rightIconButtonColors The colors for the icon buttons on the right side of the top app bar.
     * @param menuColors The colors for the dropdown menu in the top app bar.
     * @param badgeColors The colors for the badges in the top app bar.
     */
    @Composable
    fun colors(
        containerColor: Color = PersianTheme.colorScheme.surface,
        scrolledContainerColor: Color = PersianTheme.colorScheme.surfaceContainer,
        leftIconButtonColors: IconButtonColors = IconButtonDefaults.tertiaryIconButtonColors(
            contentColor = PersianTheme.colorScheme.onSurfaceVariant
        ),
        leftAvatarColors: AvatarColors = AvatarDefaults.colors(),
        titleTextColor: Color = PersianTheme.colorScheme.onSurface,
        rightActionButtonColors: ButtonColors = ButtonDefaults.tertiaryColors(),
        rightIconButtonColors: IconButtonColors = IconButtonDefaults.tertiaryIconButtonColors(
            contentColor = PersianTheme.colorScheme.onSurfaceVariant
        ),
        menuColors: MenuColors = MenuDefaults.colors(),
        badgeColors: CounterColors = CounterDefaults.badgeColors(),
    ): TopAppBarColors =
        TopAppBarColors(
            containerColor = containerColor,
            scrolledContainerColor = scrolledContainerColor,
            leftIconButtonColors = leftIconButtonColors,
            leftAvatarColors = leftAvatarColors,
            titleTextColor = titleTextColor,
            rightActionButtonColors = rightActionButtonColors,
            rightIconButtonColors = rightIconButtonColors,
            menuColors = menuColors,
            badgeColors = badgeColors,
        )

    /**
     * A composable function that creates a [TopAppBarSizes] instance with customizable size properties.
     *
     * This function allows you to specify various size properties for the top app bar,
     * including icon button sizes, avatar sizes, title text style, action button sizes,
     * menu sizes, and badge sizes.
     *
     * @param leftIconButtonSizes The sizes for the icon buttons on the left side of the top app bar. Default is the medium icon button sizes.
     * @param leftAvatarSizes The sizes for the avatar on the left side of the top app bar.
     * @param titleTextStyle The text style for the title text in the top app bar.
     * @param rightActionButtonSizes The sizes for the action buttons on the right side of the top app bar.
     * @param rightIconButtonSizes The sizes for the icon buttons on the right side of the top app bar.
     * @param menuSizes The sizes for the dropdown menu in the top app bar.
     * @param badgeSizes The sizes for the badges in the top app bar.
     */
    @Composable
    fun sizes(
        leftIconButtonSizes: IconButtonSizes = IconButtonDefaults.mediumSizes(),
        leftAvatarSizes: AvatarSizes = AvatarDefaults.size36(),
        titleTextStyle: TextStyle = PersianTheme.typography.titleLarge,
        rightActionButtonSizes: ButtonSizes = ButtonDefaults.mediumSizes(),
        rightIconButtonSizes: IconButtonSizes = IconButtonDefaults.mediumSizes(),
        menuSizes: MenuSizes = MenuDefaults.sizes(),
        badgeSizes: CounterSizes = CounterDefaults.badgeSizes(),
    ): TopAppBarSizes =
        TopAppBarSizes(
            leftIconButtonSizes = leftIconButtonSizes,
            leftAvatarSizes = leftAvatarSizes,
            titleTextStyle = titleTextStyle,
            rightActionButtonSizes = rightActionButtonSizes,
            rightIconButtonSizes = rightIconButtonSizes,
            menuSizes = menuSizes,
            badgeSizes = badgeSizes,
        )

    /** Default insets to be used and consumed by the top app bars */
    val windowInsets: WindowInsets
        @Composable
        get() = WindowInsets.systemBars.only(WindowInsetsSides.Top)


    /**
     * Returns a pinned [TopAppBarScrollBehavior] that tracks nested-scroll callbacks and updates
     * its [TopAppBarState.contentOffset] accordingly.
     *
     * @param state the state object to be used to control or observe the top app bar's scroll
     *   state. See [rememberTopAppBarState] for a state that is remembered across compositions.
     * @param canScroll a callback used to determine whether scroll events are to be handled by this
     *   pinned [TopAppBarScrollBehavior]
     */
    @Composable
    fun pinnedScrollBehavior(
        state: TopAppBarState = rememberTopAppBarState(),
        canScroll: () -> Boolean = { true }
    ): TopAppBarScrollBehavior = PinnedScrollBehavior(state = state, canScroll = canScroll)

    /**
     * Returns a [TopAppBarScrollBehavior]. A top app bar that is set up with this
     * [TopAppBarScrollBehavior] will immediately collapse when the content is pulled up, and will
     * immediately appear when the content is pulled down.
     *
     * @param state the state object to be used to control or observe the top app bar's scroll
     *   state. See [rememberTopAppBarState] for a state that is remembered across compositions.
     * @param canScroll a callback used to determine whether scroll events are to be handled by this
     *   [EnterAlwaysScrollBehavior]
     * @param snapAnimationSpec an optional [AnimationSpec] that defines how the top app bar snaps
     *   to either fully collapsed or fully extended state when a fling or a drag scrolled it into
     *   an intermediate position
     * @param flingAnimationSpec an optional [DecayAnimationSpec] that defined how to fling the top
     *   app bar when the user flings the app bar itself, or the content below it
     */
    @Composable
    fun enterAlwaysScrollBehavior(
        state: TopAppBarState = rememberTopAppBarState(),
        canScroll: () -> Boolean = { true },
        snapAnimationSpec: AnimationSpec<Float>? = spring(stiffness = Spring.StiffnessMediumLow),
        flingAnimationSpec: DecayAnimationSpec<Float>? = rememberSplineBasedDecay()
    ): TopAppBarScrollBehavior =
        EnterAlwaysScrollBehavior(
            state = state,
            snapAnimationSpec = snapAnimationSpec,
            flingAnimationSpec = flingAnimationSpec,
            canScroll = canScroll
        )

    /**
     * Returns a [TopAppBarScrollBehavior] that adjusts its properties to affect the colors and
     * height of the top app bar.
     *
     * A top app bar that is set up with this [TopAppBarScrollBehavior] will immediately collapse
     * when the nested content is pulled up, and will expand back the collapsed area when the
     * content is pulled all the way down.
     *
     * @param state the state object to be used to control or observe the top app bar's scroll
     *   state. See [rememberTopAppBarState] for a state that is remembered across compositions.
     * @param canScroll a callback used to determine whether scroll events are to be handled by this
     *   [ExitUntilCollapsedScrollBehavior]
     * @param snapAnimationSpec an optional [AnimationSpec] that defines how the top app bar snaps
     *   to either fully collapsed or fully extended state when a fling or a drag scrolled it into
     *   an intermediate position
     * @param flingAnimationSpec an optional [DecayAnimationSpec] that defined how to fling the top
     *   app bar when the user flings the app bar itself, or the content below it
     */
    @Composable
    fun exitUntilCollapsedScrollBehavior(
        state: TopAppBarState = rememberTopAppBarState(),
        canScroll: () -> Boolean = { true },
        snapAnimationSpec: AnimationSpec<Float>? = spring(stiffness = Spring.StiffnessMediumLow),
        flingAnimationSpec: DecayAnimationSpec<Float>? = rememberSplineBasedDecay()
    ): TopAppBarScrollBehavior =
        ExitUntilCollapsedScrollBehavior(
            state = state,
            snapAnimationSpec = snapAnimationSpec,
            flingAnimationSpec = flingAnimationSpec,
            canScroll = canScroll
        )
}

/**
 * Represents the colors used by a top app bar in different states. This implementation animates the
 * container color according to the top app bar scroll state. It does not animate the leading,
 * headline, or trailing colors.
 *
 * @property containerColor The background color of the top app bar container.
 * @property scrolledContainerColor The background color of the top app bar container when scrolled.
 * @property leftIconButtonColors The colors for the icon buttons on the left side of the top app bar.
 * @property leftAvatarColors The colors for the avatar on the left side of the top app bar.
 * @property titleTextColor The color of the title text in the top app bar.
 * @property rightActionButtonColors The colors for the action buttons on the right side of the top app bar.
 * @property rightIconButtonColors The colors for the icon buttons on the right side of the top app bar.
 * @property menuColors The colors for the dropdown menu in the top app bar.
 * @property badgeColors The colors for the badges in the top app bar.
 * @constructor create an instance with arbitrary colors, see [TopAppBarColors] for a factory method
 *   using the default Persian spec
 */
@Stable
class TopAppBarColors internal constructor(
    internal val containerColor: Color,
    internal val scrolledContainerColor: Color,
    internal val leftIconButtonColors: IconButtonColors,
    internal val leftAvatarColors: AvatarColors,
    internal val titleTextColor: Color,
    internal val rightActionButtonColors: ButtonColors,
    internal val rightIconButtonColors: IconButtonColors,
    internal val menuColors: MenuColors,
    internal val badgeColors: CounterColors
) {
    /**
     * Returns a copy of this TopAppBarColors, optionally overriding some of the values. This uses
     * the Color.Unspecified to mean “use the value from the source”
     */
    fun copy(
        containerColor: Color = this.containerColor,
        scrolledContainerColor: Color = this.scrolledContainerColor,
        leftIconButtonColors: IconButtonColors = this.leftIconButtonColors,
        leftAvatarColors: AvatarColors = this.leftAvatarColors,
        titleTextColor: Color = this.titleTextColor,
        rightActionButton: ButtonColors = this.rightActionButtonColors,
        rightIconButtonColors: IconButtonColors = this.rightIconButtonColors,
        menuColors: MenuColors = this.menuColors,
        badgeColors: CounterColors = this.badgeColors,
    ): TopAppBarColors =
        TopAppBarColors(
            containerColor = containerColor.takeOrElse { this.containerColor },
            scrolledContainerColor = scrolledContainerColor.takeOrElse { this.scrolledContainerColor },
            leftIconButtonColors = leftIconButtonColors,
            leftAvatarColors = leftAvatarColors,
            titleTextColor = titleTextColor.takeOrElse { this.titleTextColor },
            rightActionButtonColors = rightActionButton,
            rightIconButtonColors = rightIconButtonColors,
            menuColors = menuColors,
            badgeColors = badgeColors
        )

    /**
     * Represents the container color used for the top app bar.
     *
     * A [colorTransitionFraction] provides a percentage value that can be used to generate a color.
     * Usually, an app bar implementation will pass in a [colorTransitionFraction] read from the
     * [TopAppBarState.collapsedFraction] or the [TopAppBarState.overlappedFraction].
     *
     * @param colorTransitionFraction a `0.0` to `1.0` value that represents a color transition
     *   percentage
     */
    @Stable
    internal fun containerColor(colorTransitionFraction: Float): Color {
        return lerp(
            containerColor,
            scrolledContainerColor,
            FastOutLinearInEasing.transform(colorTransitionFraction)
        )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is TopAppBarColors) return false

        if (containerColor != other.containerColor) return false
        if (scrolledContainerColor != other.scrolledContainerColor) return false
        if (leftIconButtonColors != other.leftIconButtonColors) return false
        if (leftAvatarColors != other.leftAvatarColors) return false
        if (titleTextColor != other.titleTextColor) return false
        if (rightActionButtonColors != other.rightActionButtonColors) return false
        if (rightIconButtonColors != other.rightIconButtonColors) return false
        if (menuColors != other.menuColors) return false
        if (badgeColors != other.badgeColors) return false

        return true
    }

    override fun hashCode(): Int {
        var result = containerColor.hashCode()
        result = 31 * result + scrolledContainerColor.hashCode()
        result = 31 * result + leftIconButtonColors.hashCode()
        result = 31 * result + leftAvatarColors.hashCode()
        result = 31 * result + titleTextColor.hashCode()
        result = 31 * result + rightActionButtonColors.hashCode()
        result = 31 * result + rightIconButtonColors.hashCode()
        result = 31 * result + menuColors.hashCode()
        result = 31 * result + badgeColors.hashCode()

        return result
    }
}

/**
 * Represents the colors used by a top app bar in different states. This implementation animates the
 * container sizes according to the top app bar scroll state. It does not animate the leading,
 * headline, or trailing sizes.
 *
 * @property leftIconButtonSizes The sizes for the icon buttons on the left side of the top app bar.
 * @property leftAvatarSizes The sizes for the avatar on the left side of the top app bar.
 * @property titleTextStyle The text style for the title text in the top app bar.
 * @property rightActionButtonSizes The sizes for the action buttons on the right side of the top app bar.
 * @property rightIconButtonSizes The sizes for the icon buttons on the right side of the top app bar.
 * @property menuSizes The sizes for the dropdown menu in the top app bar.
 * @property badgeSizes The sizes for the badges in the top app bar.
 * @constructor create an instance with arbitrary sizes, see [TopAppBarSizes] for a factory method
 *   using the default Persian spec
 */
@Stable
class TopAppBarSizes internal constructor(
    internal val leftIconButtonSizes: IconButtonSizes,
    internal val leftAvatarSizes: AvatarSizes,
    internal val titleTextStyle: TextStyle,
    internal val rightActionButtonSizes: ButtonSizes,
    internal val rightIconButtonSizes: IconButtonSizes,
    internal val menuSizes: MenuSizes,
    internal val badgeSizes: CounterSizes
) {
    /**
     * Returns a copy of this TopAppBarSizes, optionally overriding some of the values.
     */
    fun copy(
        leftIconButtonSizes: IconButtonSizes = this.leftIconButtonSizes,
        leftAvatarSizes: AvatarSizes = this.leftAvatarSizes,
        titleTextStyle: TextStyle = this.titleTextStyle,
        rightActionButtonSizes: ButtonSizes = this.rightActionButtonSizes,
        rightIconButtonSizes: IconButtonSizes = this.rightIconButtonSizes,
        menuSizes: MenuSizes = this.menuSizes,
        badgeSizes: CounterSizes = this.badgeSizes,
    ): TopAppBarSizes =
        TopAppBarSizes(
            leftIconButtonSizes = leftIconButtonSizes,
            leftAvatarSizes = leftAvatarSizes,
            titleTextStyle = titleTextStyle,
            rightActionButtonSizes = rightActionButtonSizes,
            rightIconButtonSizes = rightIconButtonSizes,
            menuSizes = menuSizes,
            badgeSizes = badgeSizes
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is TopAppBarSizes) return false

        if (leftIconButtonSizes != other.leftIconButtonSizes) return false
        if (leftAvatarSizes != other.leftAvatarSizes) return false
        if (titleTextStyle != other.titleTextStyle) return false
        if (rightActionButtonSizes != other.rightActionButtonSizes) return false
        if (rightIconButtonSizes != other.rightIconButtonSizes) return false
        if (menuSizes != other.menuSizes) return false
        if (badgeSizes != other.badgeSizes) return false

        return true
    }

    override fun hashCode(): Int {
        var result = leftIconButtonSizes.hashCode()
        result = 31 * result + leftAvatarSizes.hashCode()
        result = 31 * result + titleTextStyle.hashCode()
        result = 31 * result + rightActionButtonSizes.hashCode()
        result = 31 * result + rightIconButtonSizes.hashCode()
        result = 31 * result + menuSizes.hashCode()
        result = 31 * result + badgeSizes.hashCode()

        return result
    }
}