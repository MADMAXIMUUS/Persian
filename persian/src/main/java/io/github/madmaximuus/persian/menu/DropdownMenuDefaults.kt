package io.github.madmaximuus.persian.menu

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.divider.DividerDefaults
import io.github.madmaximuus.persian.divider.DividerSizes
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSizes

/**
 * Contains all default values used by [DropdownMenu].
 */
object MenuDefaults {

    /**
     * Create and remember a [MenuColors] instance.
     *
     * @param backgroundColor The background color of the menu container.
     * @param itemColors The colors used for the menu items.
     */
    @Composable
    fun colors(
        backgroundColor: Color = PersianTheme.colorScheme.surfaceContainer,
        itemColors: MenuItemColors = itemColors()
    ): MenuColors =
        MenuColors(
            containerColor = backgroundColor,
            itemColors = itemColors
        )

    /**
     * Create a [MenuItemColors] instance.
     *
     * @param titleColor The default color of the menu item title.
     * @param negativeTitleColor The color of the menu item title when it is in a negative state.
     * @param leadingIconColor The default color of the leading icon in the menu item.
     * @param selectedLeadingIconColor The color of the leading icon when the menu item is selected.
     * @param negativeLeadingIconColor The color of the leading icon when the menu item is in a negative state.
     * @param expendIconColor The default color of the expand icon in the menu item.
     * @param newLabelColor The default color of the "new" label in the menu item.
     * @param newLabelContainerColor The default color of the container for the "new" label.
     * @param dividerColor The color of the divider in the menu item.
     */
    @Composable
    fun itemColors(
        titleColor: Color = PersianTheme.colorScheme.onSurface,
        negativeTitleColor: Color = PersianTheme.colorScheme.error,
        leadingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        selectedLeadingIconColor: Color = PersianTheme.colorScheme.primary,
        negativeLeadingIconColor: Color = PersianTheme.colorScheme.error,
        expendIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        newLabelColor: Color = PersianTheme.colorScheme.onValid,
        newLabelContainerColor: Color = PersianTheme.colorScheme.valid,
        dividerColor: Color = PersianTheme.colorScheme.outlineVariant
    ): MenuItemColors =
        MenuItemColors(
            titleColor = titleColor,
            negativeTitleColor = negativeTitleColor,
            leadingIconColor = leadingIconColor,
            selectedLeadingIconColor = selectedLeadingIconColor,
            negativeLeadingIconColor = negativeLeadingIconColor,
            expendIconColor = expendIconColor,
            newLabelColor = newLabelColor,
            newLabelContainerColor = newLabelContainerColor,
            dividerColor = dividerColor
        )

    /**
     * Create a [MenuSizes] instance.
     *
     * @param containerShape The shape of the menu container.
     * @param itemSizes The sizes used for the menu items.
     */
    @Composable
    fun sizes(
        containerShape: Shape = PersianTheme.shapes.shape16,
        itemSizes: MenuItemSizes = itemSizes()
    ): MenuSizes =
        MenuSizes(
            containerShape = containerShape,
            itemSizes = itemSizes
        )

    /**
     * Create a [MenuItemSizes] instance.
     *
     * @param titleTextStyle The text style used for the title of the menu item.
     * @param leadingIconSizes The sizes used for the leading icon in the menu item.
     * @param expendIconSizes The sizes used for the expand icon in the menu item.
     * @param newLabelTextStyle The text style used for the "new" label in the menu item.
     * @param newLabelContainerShape The shape of the container for the "new" label.
     * @param dividerSizes The sizes used for the divider in the menu item.
     * @param groupDividerSizes The sizes used for the group divider in the menu item.
     */
    @Composable
    fun itemSizes(
        titleTextStyle: TextStyle = PersianTheme.typography.bodyLarge,
        leadingIconSizes: IconSizes = IconDefaults.size24(),
        expendIconSizes: IconSizes = IconDefaults.size24(),
        newLabelTextStyle: TextStyle = PersianTheme.typography.labelSmall,
        newLabelContainerShape: Shape = PersianTheme.shapes.shape4,
        dividerSizes: DividerSizes = DividerDefaults.sizes(),
        groupDividerSizes: DividerSizes = DividerDefaults.sizes(
            inset = 0.dp,
            strokeThickness = 4.dp
        )
    ): MenuItemSizes =
        MenuItemSizes(
            titleTextStyle = titleTextStyle,
            leadingIconSizes = leadingIconSizes,
            expendIconSizes = expendIconSizes,
            newLabelTextStyle = newLabelTextStyle,
            newLabelContainerShape = newLabelContainerShape,
            dividerSizes = dividerSizes,
            groupDividerSizes = groupDividerSizes
        )
}

/**
 * Immutable class representing the colors used in a menu.
 *
 * This class encapsulates the container color and the item colors for a menu.
 *
 * @property containerColor The background color of the menu container.
 * @property itemColors The colors used for the menu items.
 */
@Immutable
class MenuColors(
    val containerColor: Color,
    val itemColors: MenuItemColors
)

/**
 * Immutable class representing the sizes and shapes used in a menu.
 *
 * This class encapsulates the shape of the menu container and the sizes used for the menu items.
 *
 * @property containerShape The shape of the menu container.
 * @property itemSizes The sizes used for the menu items.
 */
@Immutable
class MenuSizes(
    val containerShape: Shape,
    val itemSizes: MenuItemSizes
)

/**
 * Immutable class representing the sizes used for menu items.
 *
 * This class encapsulates various size-related properties for menu items, including text styles, icon sizes,
 * and divider sizes.
 *
 * @property titleTextStyle The text style used for the title of the menu item.
 * @property leadingIconSizes The sizes used for the leading icon of the menu item.
 * @property expendIconSizes The sizes used for the expand icon of the menu item.
 * @property newLabelTextStyle The text style used for the "new" label of the menu item.
 * @property newLabelContainerShape The shape of the container for the "new" label.
 * @property dividerSizes The sizes used for the divider of the menu item.
 * @property groupDividerSizes The sizes used for the group divider of the menu item.
 */
@Immutable
class MenuItemSizes internal constructor(
    internal val titleTextStyle: TextStyle,
    internal val leadingIconSizes: IconSizes,
    internal val expendIconSizes: IconSizes,
    internal val newLabelTextStyle: TextStyle,
    internal val newLabelContainerShape: Shape,
    internal val dividerSizes: DividerSizes,
    internal val groupDividerSizes: DividerSizes,
) {
    fun copy(
        titleTextStyle: TextStyle = this.titleTextStyle,
        leadingIconSizes: IconSizes = this.leadingIconSizes,
        expendIconSizes: IconSizes = this.expendIconSizes,
        newLabelTextStyle: TextStyle = this.newLabelTextStyle,
        newLabelContainerShape: Shape = this.newLabelContainerShape,
        dividerSizes: DividerSizes = this.dividerSizes,
        groupDividerSizes: DividerSizes = this.groupDividerSizes
    ): MenuItemSizes =
        MenuItemSizes(
            titleTextStyle = titleTextStyle,
            leadingIconSizes = leadingIconSizes,
            expendIconSizes = expendIconSizes,
            newLabelTextStyle = newLabelTextStyle,
            newLabelContainerShape = newLabelContainerShape,
            dividerSizes = dividerSizes,
            groupDividerSizes = groupDividerSizes
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is MenuItemSizes) return false

        if (titleTextStyle != other.titleTextStyle) return false
        if (leadingIconSizes != other.leadingIconSizes) return false
        if (expendIconSizes != other.expendIconSizes) return false
        if (newLabelTextStyle != other.newLabelTextStyle) return false
        if (dividerSizes != other.dividerSizes) return false
        if (groupDividerSizes != other.groupDividerSizes) return false
        return newLabelContainerShape == other.newLabelContainerShape
    }

    override fun hashCode(): Int {
        var result = titleTextStyle.hashCode()
        result = 31 * result + leadingIconSizes.hashCode()
        result = 31 * result + expendIconSizes.hashCode()

        result = 31 * result + newLabelTextStyle.hashCode()
        result = 31 * result + newLabelContainerShape.hashCode()
        result = 31 * result + dividerSizes.hashCode()
        result = 31 * result + groupDividerSizes.hashCode()
        return result
    }
}

/**
 * Immutable class representing the colors used for menu items.
 *
 * This class encapsulates various color-related properties for menu items, including title colors,
 * leading icon colors, expand icon colors, new label colors, and divider colors.
 *
 * @property titleColor The default color of the menu item title.
 * @property negativeTitleColor The color of the menu item title when it is in a negative state.
 * @property leadingIconColor The default color of the leading icon in the menu item.
 * @property selectedLeadingIconColor The color of the leading icon when the menu item is selected.
 * @property negativeLeadingIconColor The color of the leading icon when the menu item is in a negative state.
 * @property expendIconColor The default color of the expand icon in the menu item.
 * @property newLabelColor The default color of the "new" label in the menu item.
 * @property newLabelContainerColor The default color of the container for the "new" label.
 * @property dividerColor The color of the divider in the menu item.
 */
@Immutable
class MenuItemColors internal constructor(
    //Title Color
    private val titleColor: Color,
    private val negativeTitleColor: Color,

    //Leading Icon Color
    private val leadingIconColor: Color,
    private val selectedLeadingIconColor: Color,
    private val negativeLeadingIconColor: Color,

    //Expend Icon Color
    internal val expendIconColor: Color,

    //New Label Color
    internal val newLabelColor: Color,

    //New Label Container Color
    internal val newLabelContainerColor: Color,

    internal val dividerColor: Color
) {
    /**
     * Returns the appropriate title color based on the enabled and negative states.
     *
     * @param negative Whether the menu item is in a negative state.
     */
    @Stable
    internal fun titleColor(
        negative: Boolean
    ): Color = when {
        negative -> negativeTitleColor
        else -> titleColor
    }

    /**
     * Returns the appropriate leading icon color based on the enabled, negative, and selected states.
     *
     * @param negative Whether the menu item is in a negative state.
     * @param selected Whether the menu item is selected.
     */
    @Stable
    internal fun leadingIconColor(
        negative: Boolean,
        selected: Boolean,
    ): Color = when {
        negative -> negativeLeadingIconColor
        selected -> selectedLeadingIconColor
        else -> leadingIconColor
    }

    /**
     * Creates a copy of this [MenuItemColors] instance with the specified properties.
     */
    fun copy(
        titleColor: Color = this.titleColor,
        negativeTitleColor: Color = this.negativeTitleColor,
        leadingIconColor: Color = this.leadingIconColor,
        selectedLeadingIconColor: Color = this.selectedLeadingIconColor,
        negativeLeadingIconColor: Color = this.negativeLeadingIconColor,
        expendIconColor: Color = this.expendIconColor,
        newLabelColor: Color = this.newLabelColor,
        newLabelContainerColor: Color = this.newLabelContainerColor,
        dividerColor: Color = this.dividerColor
    ): MenuItemColors =
        MenuItemColors(
            titleColor = titleColor,
            negativeTitleColor = negativeTitleColor,
            selectedLeadingIconColor = selectedLeadingIconColor,
            leadingIconColor = leadingIconColor,
            negativeLeadingIconColor = negativeLeadingIconColor,
            expendIconColor = expendIconColor,
            newLabelColor = newLabelColor,
            newLabelContainerColor = newLabelContainerColor,
            dividerColor = dividerColor
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is MenuItemColors) return false

        if (titleColor != other.titleColor) return false
        if (negativeTitleColor != other.negativeTitleColor) return false
        if (leadingIconColor != other.leadingIconColor) return false
        if (selectedLeadingIconColor != other.selectedLeadingIconColor) return false
        if (negativeLeadingIconColor != other.negativeLeadingIconColor) return false
        if (expendIconColor != other.expendIconColor) return false
        if (newLabelColor != other.newLabelColor) return false
        if (newLabelContainerColor != other.newLabelContainerColor) return false
        return dividerColor == other.dividerColor
    }

    override fun hashCode(): Int {
        var result = titleColor.hashCode()
        result = 31 * result + negativeTitleColor.hashCode()
        result = 31 * result + leadingIconColor.hashCode()
        result = 31 * result + selectedLeadingIconColor.hashCode()
        result = 31 * result + negativeLeadingIconColor.hashCode()
        result = 31 * result + expendIconColor.hashCode()
        result = 31 * result + newLabelColor.hashCode()
        result = 31 * result + newLabelContainerColor.hashCode()
        result = 31 * result + dividerColor.hashCode()
        return result
    }
}