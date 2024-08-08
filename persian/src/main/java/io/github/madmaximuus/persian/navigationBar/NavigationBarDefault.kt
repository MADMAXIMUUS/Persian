package io.github.madmaximuus.persian.navigationBar

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.systemBars
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state38
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSizes

object NavigationBarDefaults {

    @Composable
    fun colors(
        backgroundColor: Color = PersianTheme.colorScheme.surfaceContainer,
        itemColors: NavigationBarItemColors = itemColors()
    ): NavigationBarColors =
        NavigationBarColors(
            itemColors = itemColors,
            backgroundColor = backgroundColor
        )

    @Composable
    fun sizes(
        textStyle: TextStyle = PersianTheme.typography.labelMedium,
        iconSize: IconSizes = IconDefaults.size24(),
        selectedIconSize: IconSizes = IconDefaults.size24(),
        paddingValues: PaddingValues = PaddingValues(
            horizontal = 0.dp,
            vertical = PersianTheme.spacing.size12,
        )
    ): NavigationBarSizes =
        NavigationBarSizes(
            iconSize = iconSize,
            selectedIconSize = selectedIconSize,
            paddingValues = paddingValues,
            textStyle = textStyle
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
     * @param disabledIconColor the color to use for the icon when the item is disabled.
     * @param disabledTextColor the color to use for the text label when the item is disabled.
     * @return the resulting [NavigationBarItemColors] used for [NavigationBarItem]
     */
    @Composable
    fun itemColors(
        selectedIconColor: Color = PersianTheme.colorScheme.onSecondaryContainer,
        selectedTextColor: Color = PersianTheme.colorScheme.onSurface,
        indicatorColor: Color = PersianTheme.colorScheme.secondaryContainer,
        unselectedIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        unselectedTextColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        disabledIconColor: Color = PersianTheme.colorScheme.onSurface.state38,
        disabledTextColor: Color = PersianTheme.colorScheme.onSurface.state38,
    ): NavigationBarItemColors =
        NavigationBarItemColors(
            selectedIconColor = selectedIconColor,
            selectedTextColor = selectedTextColor,
            selectedIndicatorColor = indicatorColor,
            unselectedIconColor = unselectedIconColor,
            unselectedTextColor = unselectedTextColor,
            disabledIconColor = disabledIconColor,
            disabledTextColor = disabledTextColor,
        )

    val windowInsets: WindowInsets
        @Composable
        get() = WindowInsets.systemBars
            .only(WindowInsetsSides.Horizontal + WindowInsetsSides.Bottom)
}

@Immutable
data class NavigationBarColors(
    val itemColors: NavigationBarItemColors,
    val backgroundColor: Color
)

@Immutable
data class NavigationBarSizes(
    val paddingValues: PaddingValues,
    val selectedIconSize: IconSizes,
    val iconSize: IconSizes,
    val textStyle: TextStyle
)

/**
 * Represents the colors of the various elements of a navigation item.
 *
 * @param selectedIconColor the color to use for the icon when the item is selected.
 * @param selectedTextColor the color to use for the text label when the item is selected.
 * @param selectedIndicatorColor the color to use for the indicator when the item is selected.
 * @param unselectedIconColor the color to use for the icon when the item is unselected.
 * @param unselectedTextColor the color to use for the text label when the item is unselected.
 * @param disabledIconColor the color to use for the icon when the item is disabled.
 * @param disabledTextColor the color to use for the text label when the item is disabled.
 * @constructor create an instance with arbitrary colors.
 */
@Immutable
class NavigationBarItemColors internal constructor(
    private val selectedIconColor: Color,
    private val selectedTextColor: Color,
    private val selectedIndicatorColor: Color,
    private val unselectedIconColor: Color,
    private val unselectedTextColor: Color,
    private val disabledIconColor: Color,
    private val disabledTextColor: Color,
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
        disabledIconColor: Color = this.disabledIconColor,
        disabledTextColor: Color = this.disabledTextColor,
    ): NavigationBarItemColors =
        NavigationBarItemColors(
            selectedIconColor.takeOrElse { this.selectedIconColor },
            selectedTextColor.takeOrElse { this.selectedTextColor },
            selectedIndicatorColor.takeOrElse { this.selectedIndicatorColor },
            unselectedIconColor.takeOrElse { this.unselectedIconColor },
            unselectedTextColor.takeOrElse { this.unselectedTextColor },
            disabledIconColor.takeOrElse { this.disabledIconColor },
            disabledTextColor.takeOrElse { this.disabledTextColor },
        )

    /**
     * Represents the icon color for this item, depending on whether it is [selected].
     *
     * @param selected whether the item is selected
     * @param enabled whether the item is enabled
     */
    @Stable
    internal fun iconColor(selected: Boolean, enabled: Boolean): Color =
        when {
            !enabled -> disabledIconColor
            selected -> selectedIconColor
            else -> unselectedIconColor
        }

    /**
     * Represents the text color for this item, depending on whether it is [selected].
     *
     * @param selected whether the item is selected
     * @param enabled whether the item is enabled
     */
    @Stable
    internal fun textColor(selected: Boolean, enabled: Boolean): Color =
        when {
            !enabled -> disabledTextColor
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
        if (disabledIconColor != other.disabledIconColor) return false
        if (disabledTextColor != other.disabledTextColor) return false

        return true
    }

    override fun hashCode(): Int {
        var result = selectedIconColor.hashCode()
        result = 31 * result + unselectedIconColor.hashCode()
        result = 31 * result + selectedTextColor.hashCode()
        result = 31 * result + unselectedTextColor.hashCode()
        result = 31 * result + selectedIndicatorColor.hashCode()
        result = 31 * result + disabledIconColor.hashCode()
        result = 31 * result + disabledTextColor.hashCode()

        return result
    }
}