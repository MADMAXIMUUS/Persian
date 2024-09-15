package io.github.madmaximuus.persian.tabBar

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.takeOrElse
import io.github.madmaximuus.persian.counter.CounterColors
import io.github.madmaximuus.persian.counter.CounterDefaults
import io.github.madmaximuus.persian.counter.CounterSizes
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSizes
import io.github.madmaximuus.persian.tabBar.tab.IconSide

object TabBarDefaults {

    @Composable
    fun tabColors(
        containerColor: Color = PersianTheme.colorScheme.surface,
        activeContainerColor: Color = PersianTheme.colorScheme.surface,

        indicatorColor: Color = PersianTheme.colorScheme.primary,

        contentColor: Color = PersianTheme.colorScheme.onSurface,
        activeContentColor: Color = PersianTheme.colorScheme.primary,

        counterColors: CounterColors = CounterDefaults.primaryColors(),
        badgeColors: CounterColors = CounterDefaults.badgeColors()
    ): TabColors = TabColors(
        containerColor = containerColor,
        activeContainerColor = activeContainerColor,

        indicatorColor = indicatorColor,

        contentColor = contentColor,
        activeContentColor = activeContentColor,

        counterColors = counterColors,
        badgeColors = badgeColors
    )

    @Composable
    fun tabSizes(
        indicatorThickness: Dp = 3.dp,
        indicatorShape: Shape = PersianTheme.shapes.shape4.copy(
            bottomStart = CornerSize(0.dp),
            bottomEnd = CornerSize(0.dp),
        ),

        iconSizes: IconSizes = IconDefaults.size24(),
        textStyle: TextStyle = PersianTheme.typography.labelLarge,

        counterSizes: CounterSizes = CounterDefaults.digitSizes(),
        badgeSizes: CounterSizes = CounterDefaults.badgeSizes(),

        edgePadding: Dp = 52.dp
    ): TabSizes = TabSizes(
        indicatorThickness = indicatorThickness,
        indicatorShape = indicatorShape,
        iconSizes = iconSizes,
        textStyle = textStyle,
        counterSizes = counterSizes,
        badgeSizes = badgeSizes,
        edgePadding = edgePadding
    )

}

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

    @Composable
    fun containerColor(selected: Boolean): Color =
        if (selected) activeContainerColor else containerColor

    @Composable
    fun contentColor(selected: Boolean): Color =
        if (selected) activeContentColor else contentColor

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

    @Composable
    fun counterColors(side: IconSide): CounterColors =
        when (side) {
            IconSide.LEFT -> counterColors
            IconSide.TOP -> badgeColors
        }

    fun copy(
        containerColor: Color = this.containerColor,
        activeContainerColor: Color = this.activeContainerColor,

        indicatorColor: Color = this.indicatorColor,

        contentColor: Color = this.contentColor,
        activeContentColor: Color = this.activeContentColor,

        counterColors: CounterColors = this.counterColors,
        badgeColors: CounterColors = this.badgeColors
    ): TabColors = TabColors(
        containerColor = containerColor.takeOrElse { this.containerColor },
        activeContainerColor = activeContainerColor.takeOrElse { this.activeContainerColor },
        indicatorColor = indicatorColor.takeOrElse { this.indicatorColor },
        contentColor = contentColor.takeOrElse { this.contentColor },
        activeContentColor = activeContentColor.takeOrElse { this.activeContentColor },
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

    @Composable
    fun counterSizes(side: IconSide): CounterSizes =
        when (side) {
            IconSide.LEFT -> counterSizes
            IconSide.TOP -> badgeSizes
        }

    fun copy(
        indicatorThickness: Dp = this.indicatorThickness,
        indicatorShape: Shape = this.indicatorShape,

        iconSizes: IconSizes = this.iconSizes,
        textStyle: TextStyle = this.textStyle,

        counterSizes: CounterSizes = this.counterSizes,
        badgeSizes: CounterSizes = this.badgeSizes,

        edgePadding: Dp = this.edgePadding
    ): TabSizes = TabSizes(
        indicatorThickness = indicatorThickness.takeOrElse { this.indicatorThickness },
        indicatorShape = indicatorShape,
        iconSizes = iconSizes,
        textStyle = textStyle,
        counterSizes = counterSizes,
        badgeSizes = badgeSizes,
        edgePadding = edgePadding.takeOrElse { this.edgePadding }
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