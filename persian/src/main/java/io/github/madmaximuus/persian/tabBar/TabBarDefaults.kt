package io.github.madmaximuus.persian.tabBar

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.counter.CounterColors
import io.github.madmaximuus.persian.counter.CounterDefaults
import io.github.madmaximuus.persian.counter.CounterSizes
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSizes
import io.github.madmaximuus.persian.tabBar.scrollable.ScrollableTabBar
import io.github.madmaximuus.persian.tabBar.tab.Orientation

/**
 * Contains all default values used by [TabBar] and [ScrollableTabBar]
 */
object TabBarDefaults {

    /**
     * Create a [TabColors] instance with default values from the theme.
     *
     * This function provides default values for the tab colors based on the current theme's color scheme.
     *
     * @param containerColor The color of the tab container when it is not selected.
     * @param activeContainerColor The color of the tab container when it is selected.
     * @param indicatorColor The color of the tab indicator.
     * @param contentColor The color of the tab content when it is not selected.
     * @param activeContentColor The color of the tab content when it is selected.
     * @param counterColors The colors for the counter when the icon is on the left side.
     * @param badgeColors The colors for the badge when the icon is on the top side.
     */
    @Composable
    fun tabColors(
        containerColor: Color = PersianTheme.colorScheme.surface,
        activeContainerColor: Color = PersianTheme.colorScheme.surface,

        indicatorColor: Color = PersianTheme.colorScheme.primary,

        contentColor: Color = PersianTheme.colorScheme.onSurface,
        activeContentColor: Color = PersianTheme.colorScheme.primary,

        counterColors: CounterColors = CounterDefaults.primaryColors(),
        badgeColors: CounterColors = CounterDefaults.errorColors()
    ) = TabColors(
        containerColor = containerColor,
        activeContainerColor = activeContainerColor,

        indicatorColor = indicatorColor,

        contentColor = contentColor,
        activeContentColor = activeContentColor,

        counterColors = counterColors,
        badgeColors = badgeColors
    )

    /**
     * Create a [TabSizes] instance with default values.
     *
     * This function provides default values for the tab sizes based on the current theme's shapes and typography.
     *
     * @param indicatorThickness The thickness of the tab indicator.
     * @param indicatorShape The shape of the tab indicator.
     * @param iconSizes The sizes of the icons in the tabs.
     * @param textStyle The text style for the tab text.
     * @param counterSizes The sizes for the counter when the icon is on the left side.
     * @param badgeSizes The sizes for the badge when the icon is on the top side.
     * @param edgePadding The padding at the edges of the tab row.
     */
    @Composable
    fun tabSizes(
        indicatorThickness: Dp = 3.dp,
        indicatorShape: Shape = PersianTheme.shapes.shape4.copy(
            bottomStart = CornerSize(0.dp),
            bottomEnd = CornerSize(0.dp),
        ),

        iconSizes: IconSizes = IconDefaults.size24(),
        textStyle: TextStyle = PersianTheme.typography.labelLarge,

        counterSizes: CounterSizes = CounterDefaults.sizes(),
        badgeSizes: CounterSizes = CounterDefaults.sizes(),

        edgePadding: Dp = 12.dp
    ) = TabSizes(
        indicatorThickness = indicatorThickness,
        indicatorShape = indicatorShape,
        iconSizes = iconSizes,
        textStyle = textStyle,
        counterSizes = counterSizes,
        badgeSizes = badgeSizes,
        edgePadding = edgePadding
    )

}

/**
 * Immutable class representing the colors for tabs.
 *
 * This class encapsulates various color properties for tabs, including container colors,
 * indicator color, content colors, and counter colors.
 *
 * @param containerColor The color of the tab container when it is not selected.
 * @param activeContainerColor The color of the tab container when it is selected.
 * @param indicatorColor The color of the tab indicator.
 * @param contentColor The color of the tab content when it is not selected.
 * @param activeContentColor The color of the tab content when it is selected.
 * @param counterColors The colors for the counter when the icon is on the left side.
 * @param badgeColors The colors for the badge when the icon is on the top side.
 */
@Immutable
class TabColors internal constructor(
    private val containerColor: Color,
    private val activeContainerColor: Color,

    internal val indicatorColor: Color,

    private val contentColor: Color,
    internal val activeContentColor: Color,

    private val counterColors: CounterColors,
    private val badgeColors: CounterColors
) {

    /**
     * Returns the container color based on the selected state.
     *
     * @param selected Whether the tab is selected.
     */
    @Stable
    fun containerColor(selected: Boolean): Color =
        if (selected) activeContainerColor else containerColor

    /**
     * Returns the content color based on the selected state.
     *
     * @param selected Whether the tab is selected.
     */
    @Stable
    fun contentColor(selected: Boolean): Color =
        if (selected) activeContentColor else contentColor

    /**
     * Returns the animated content color based on the selected state.
     *
     * @param selected Whether the tab is selected.
     */
    @Composable
    fun contentColorAnimated(selected: Boolean): Color {
        val transition = updateTransition(selected, label = "")
        val color by transition.animateColor(
            transitionSpec = {
                if (false isTransitioningTo true) {
                    tween(
                        durationMillis = TabFadeInAnimationDuration,
                        delayMillis = TabFadeInAnimationDelay,
                        easing = LinearEasing
                    )
                } else {
                    tween(durationMillis = TabFadeOutAnimationDuration, easing = LinearEasing)
                }
            },
            label = ""
        ) {
            if (it) activeContentColor else contentColor
        }
        return color
    }

    /**
     * Returns the counter colors based on the icon side.
     *
     * @param side The side on which the icon is placed.
     */
    @Composable
    fun counterColors(side: Orientation): CounterColors =
        when (side) {
            Orientation.HORIZONTAL -> counterColors
            Orientation.VERTICAL -> badgeColors
        }

    /**
     * Creates a copy of the [TabColors] instance with the specified properties.
     *
     * @param containerColor The color of the tab container when it is not selected.
     * @param activeContainerColor The color of the tab container when it is selected.
     * @param indicatorColor The color of the tab indicator.
     * @param contentColor The color of the tab content when it is not selected.
     * @param activeContentColor The color of the tab content when it is selected.
     * @param counterColors The colors for the counter when the icon is on the left side.
     * @param badgeColors The colors for the badge when the icon is on the top side.
     */
    fun copy(
        containerColor: Color = this.containerColor,
        activeContainerColor: Color = this.activeContainerColor,

        indicatorColor: Color = this.indicatorColor,

        contentColor: Color = this.contentColor,
        activeContentColor: Color = this.activeContentColor,

        counterColors: CounterColors = this.counterColors,
        badgeColors: CounterColors = this.badgeColors
    ) = TabColors(
        containerColor = containerColor,
        activeContainerColor = activeContainerColor,
        indicatorColor = indicatorColor,
        contentColor = contentColor,
        activeContentColor = activeContentColor,
        counterColors = counterColors,
        badgeColors = badgeColors
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is TabColors) return false

        if (containerColor != other.containerColor) return false
        if (activeContainerColor != other.activeContainerColor) return false

        if (indicatorColor != other.indicatorColor) return false

        if (contentColor != other.contentColor) return false
        if (activeContentColor != other.activeContentColor) return false

        if (badgeColors != other.badgeColors) return false
        return counterColors == other.counterColors
    }

    override fun hashCode(): Int {
        var result = containerColor.hashCode()
        result = 31 * result + activeContainerColor.hashCode()

        result = 31 * result + indicatorColor.hashCode()

        result = 31 * result + contentColor.hashCode()
        result = 31 * result + activeContentColor.hashCode()

        result = 31 * result + counterColors.hashCode()
        result = 31 * result + badgeColors.hashCode()
        return result
    }
}

/**
 * Immutable class representing the sizes and styles for tabs.
 *
 * This class encapsulates various size and style properties for tabs, including indicator thickness,
 * indicator shape, icon sizes, text style, counter sizes, badge sizes, and edge padding.
 *
 * @param indicatorThickness The thickness of the tab indicator.
 * @param indicatorShape The shape of the tab indicator.
 * @param iconSizes The sizes of the icons in the tabs.
 * @param textStyle The text style for the tab text.
 * @param counterSizes The sizes for the counter when the icon is on the left side.
 * @param badgeSizes The sizes for the badge when the icon is on the top side.
 * @param edgePadding The padding at the edges of the tab row.
 */
@Immutable
class TabSizes internal constructor(
    internal val indicatorThickness: Dp,
    internal val indicatorShape: Shape,

    internal val iconSizes: IconSizes,
    internal val textStyle: TextStyle,

    private val counterSizes: CounterSizes,
    private val badgeSizes: CounterSizes,

    internal val edgePadding: Dp
) {

    /**
     * Returns the counter sizes based on the icon side.
     *
     * @param side The side on which the icon is placed.
     * @return The counter sizes corresponding to the icon side.
     */
    @Composable
    fun counterSizes(side: Orientation): CounterSizes =
        when (side) {
            Orientation.HORIZONTAL -> counterSizes
            Orientation.VERTICAL -> badgeSizes
        }

    /**
     * Creates a copy of the [TabSizes] instance with the specified properties.
     *
     * @param indicatorThickness The thickness of the tab indicator.
     * @param indicatorShape The shape of the tab indicator.
     * @param iconSizes The sizes of the icons in the tabs.
     * @param textStyle The text style for the tab text.
     * @param counterSizes The sizes for the counter when the icon is on the left side.
     * @param badgeSizes The sizes for the badge when the icon is on the top side.
     * @param edgePadding The padding at the edges of the tab row.
     */
    fun copy(
        indicatorThickness: Dp = this.indicatorThickness,
        indicatorShape: Shape = this.indicatorShape,

        iconSizes: IconSizes = this.iconSizes,
        textStyle: TextStyle = this.textStyle,

        counterSizes: CounterSizes = this.counterSizes,
        badgeSizes: CounterSizes = this.badgeSizes,

        edgePadding: Dp = this.edgePadding
    ) = TabSizes(
        indicatorThickness = indicatorThickness,
        indicatorShape = indicatorShape,
        iconSizes = iconSizes,
        textStyle = textStyle,
        counterSizes = counterSizes,
        badgeSizes = badgeSizes,
        edgePadding = edgePadding
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is TabSizes) return false

        if (indicatorThickness != other.indicatorThickness) return false
        if (indicatorShape != other.indicatorShape) return false

        if (iconSizes != other.iconSizes) return false
        if (textStyle != other.textStyle) return false
        if (edgePadding != other.edgePadding) return false

        return counterSizes == other.counterSizes
    }

    override fun hashCode(): Int {
        var result = indicatorThickness.hashCode()
        result = 31 * result + iconSizes.hashCode()
        result = 31 * result + indicatorShape.hashCode()

        result = 31 * result + textStyle.hashCode()

        result = 31 * result + counterSizes.hashCode()
        result = 31 * result + edgePadding.hashCode()
        return result
    }
}

// Tab transition specifications
private const val TabFadeInAnimationDuration = 150
private const val TabFadeInAnimationDelay = 100
private const val TabFadeOutAnimationDuration = 100