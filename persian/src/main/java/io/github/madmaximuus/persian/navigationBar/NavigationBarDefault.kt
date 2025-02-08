package io.github.madmaximuus.persian.navigationBar

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.systemBars
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.counter.CounterDefaults
import io.github.madmaximuus.persian.counter.CounterSizes
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSizes

/**
 * Contains all default values used by [NavigationBar]
 */
object NavigationBarDefaults {

    /**
     * A composable function that creates a [NavigationBarColors] instance with the specified colors.
     *
     * This function allows customization of the colors for various components of a navigation bar,
     * including the background color and the colors for the navigation bar items. Default values are provided
     * for each property, which can be overridden as needed.
     *
     * @param backgroundColor The background color of the navigation bar.
     * @param itemColors The colors to be used for the navigation bar items.
     */
    @Composable
    fun colors(
        backgroundColor: Color = PersianTheme.colorScheme.surfaceContainer,
        itemColors: NavigationBarItemColors = itemColors()
    ): NavigationBarColors =
        NavigationBarColors(
            itemColors = itemColors,
            backgroundColor = backgroundColor
        )

    /**
     * A composable function that creates a [NavigationBarSizes] instance with the specified sizes and styles.
     *
     * This function allows customization of the sizes and styles for various components of a navigation bar,
     * including the text style, icon sizes, and padding values. Default values are provided for each property,
     * which can be overridden as needed.
     *
     * @param textStyle The text style to be used for the text in the navigation bar.
     * @param iconSize The size of the icons in the navigation bar.
     * @param selectedIconSize The size of the selected icon in the navigation bar.
     * @param paddingValues The padding values to be applied to the navigation bar.
     */
    @Composable
    fun sizes(
        textStyle: TextStyle = PersianTheme.typography.labelSmall,
        iconSize: IconSizes = IconDefaults.size24(),
        selectedIconSize: IconSizes = IconDefaults.size24(),
        paddingValues: PaddingValues = PaddingValues(
            horizontal = 0.dp,
            vertical = PersianTheme.spacing.size12,
        ),
        badgeSizes: CounterSizes = CounterDefaults.sizes()
    ): NavigationBarSizes =
        NavigationBarSizes(
            iconSize = iconSize,
            selectedIconSize = selectedIconSize,
            paddingValues = paddingValues,
            textStyle = textStyle,
            badgeSizes = badgeSizes
        )

    /**
     * Creates a [NavigationBarItemColors] with the provided colors according to the Material
     * specification.
     *
     * @param selectedIconColor the color to use for the icon when the item is selected.
     * @param selectedTextColor the color to use for the text label when the item is selected.
     * @param indicatorColor the color to use for the indicator when the item is selected.
     * @param unselectedIconColor the color to use for the icon when the item is unselected.
     * @param unselectedTextColor the color to use for the text label when the item is unselected.
     * @return the resulting [NavigationBarItemColors] used for [NavigationBarItem]
     */
    @Composable
    fun itemColors(
        selectedIconColor: Color = PersianTheme.colorScheme.onSecondaryContainer,
        selectedTextColor: Color = PersianTheme.colorScheme.onSurface,
        indicatorColor: Color = PersianTheme.colorScheme.secondaryContainer,
        unselectedIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        unselectedTextColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
    ): NavigationBarItemColors =
        NavigationBarItemColors(
            selectedIconColor = selectedIconColor,
            selectedTextColor = selectedTextColor,
            selectedIndicatorColor = indicatorColor,
            unselectedIconColor = unselectedIconColor,
            unselectedTextColor = unselectedTextColor,
        )

    val windowInsets: WindowInsets
        @Composable
        get() = WindowInsets.systemBars
            .only(WindowInsetsSides.Horizontal + WindowInsetsSides.Bottom)
}

/**
 * An immutable data class that defines the colors for a navigation bar.
 *
 * This class encapsulates the colors for the navigation bar items and the background of the navigation bar.
 *
 * @property itemColors The colors to be used for the navigation bar items.
 * @property backgroundColor The background color of the navigation bar.
 */
@Immutable
data class NavigationBarColors(
    val itemColors: NavigationBarItemColors,
    val backgroundColor: Color
)

/**
 * An immutable data class that defines the sizes and styles for a navigation bar.
 *
 * This class encapsulates the padding values, icon sizes, and text style to be used for the navigation bar.
 *
 * @property paddingValues The padding values to be applied to the navigation bar.
 * @property selectedIconSize The size of the selected icon in the navigation bar.
 * @property iconSize The size of the icons in the navigation bar.
 * @property textStyle The text style to be used for the text in the navigation bar.
 */
@Immutable
data class NavigationBarSizes(
    val paddingValues: PaddingValues,
    val selectedIconSize: IconSizes,
    val iconSize: IconSizes,
    val textStyle: TextStyle,
    val badgeSizes: CounterSizes
)

/**
 * Represents the colors of the various elements of a navigation item.
 *
 * @param selectedIconColor the color to use for the icon when the item is selected.
 * @param selectedTextColor the color to use for the text label when the item is selected.
 * @param selectedIndicatorColor the color to use for the indicator when the item is selected.
 * @param unselectedIconColor the color to use for the icon when the item is unselected.
 * @param unselectedTextColor the color to use for the text label when the item is unselected.
 */
@Immutable
class NavigationBarItemColors internal constructor(
    private val selectedIconColor: Color,
    private val selectedTextColor: Color,
    private val selectedIndicatorColor: Color,
    private val unselectedIconColor: Color,
    private val unselectedTextColor: Color,
) {
    /**
     * Returns a copy of this NavigationBarItemColors, optionally overriding some of the values.
     * This uses the Color.Unspecified to mean “use the value from the source”
     */
    fun copy(
        selectedIconColor: Color = this.selectedIconColor,
        selectedTextColor: Color = this.selectedTextColor,
        selectedIndicatorColor: Color = this.selectedIndicatorColor,
        unselectedIconColor: Color = this.unselectedIconColor,
        unselectedTextColor: Color = this.unselectedTextColor,
    ): NavigationBarItemColors =
        NavigationBarItemColors(
            selectedIconColor = selectedIconColor,
            selectedTextColor = selectedTextColor,
            selectedIndicatorColor = selectedIndicatorColor,
            unselectedIconColor = unselectedIconColor,
            unselectedTextColor = unselectedTextColor,
        )

    /**
     * Represents the icon color for this item, depending on whether it is [selected].
     *
     * @param selected whether the item is selected
     */
    @Stable
    internal fun iconColor(selected: Boolean): Color =
        when {
            selected -> selectedIconColor
            else -> unselectedIconColor
        }

    /**
     * Represents the text color for this item, depending on whether it is [selected].
     *
     * @param selected whether the item is selected
     */
    @Stable
    internal fun textColor(selected: Boolean): Color =
        when {
            selected -> selectedTextColor
            else -> unselectedTextColor
        }

    /** Represents the color of the indicator used for selected items. */
    internal val indicatorColor: Color
        get() = selectedIndicatorColor

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is NavigationBarItemColors) return false

        if (selectedIconColor != other.selectedIconColor) return false
        if (unselectedIconColor != other.unselectedIconColor) return false
        if (selectedTextColor != other.selectedTextColor) return false
        if (unselectedTextColor != other.unselectedTextColor) return false
        if (selectedIndicatorColor != other.selectedIndicatorColor) return false

        return true
    }

    override fun hashCode(): Int {
        var result = selectedIconColor.hashCode()
        result = 31 * result + unselectedIconColor.hashCode()
        result = 31 * result + selectedTextColor.hashCode()
        result = 31 * result + unselectedTextColor.hashCode()
        result = 31 * result + selectedIndicatorColor.hashCode()

        return result
    }
}