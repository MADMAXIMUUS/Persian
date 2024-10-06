package io.github.madmaximuus.persian.actionSheet

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state38
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSizes

/**
 * Default values for [ActionSheet]
 */
object ActionSheetDefaults {

    /**
     * Creates an [ActionSheetColors] that represents the default colors used in an [ActionSheet].
     *
     * @param titleColor the title color of this [ActionSheet].
     * @param subtitleColor the subtitle color of this [ActionSheet].
     * @param containerColor the container color of this [ActionSheet].
     * @param itemColors the [Action] colors of this [ActionSheet].
     */
    @Composable
    fun colors(
        titleColor: Color = PersianTheme.colorScheme.onSurface,
        subtitleColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        containerColor: Color = PersianTheme.colorScheme.surfaceContainer,
        itemColors: ActionSheetItemColors = itemColors()
    ): ActionSheetColors =
        ActionSheetColors(
            titleColor = titleColor,
            subtitleColor = subtitleColor,
            containerColor = containerColor,
            itemColors = itemColors
        )

    /**
     * Creates an [ActionSheetItemColors] that represents the default colors used in an [Action].
     *
     * @param defaultTextColor the text color of this [Action] when enabled.
     * @param destructiveTextColor the text color of this [Action] when destructive.
     * @param disabledTextColor the text color of this [Action] when not enabled.
     *
     * @param defaultIconColor the leading icon color of this [Action] when enabled.
     * @param destructiveIconColor the leading icon color colors of this [Action] when destructive.
     * @param disabledIconColor the leading icon color colors of this [Action] when not enabled.
     */
    @Composable
    fun itemColors(
        defaultTextColor: Color = PersianTheme.colorScheme.onSurface,
        destructiveTextColor: Color = PersianTheme.colorScheme.error,
        disabledTextColor: Color = PersianTheme.colorScheme.onSurface.state38,

        defaultIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        destructiveIconColor: Color = PersianTheme.colorScheme.error,
        disabledIconColor: Color = PersianTheme.colorScheme.onSurface.state38,
    ): ActionSheetItemColors =
        ActionSheetItemColors(
            defaultTextColor = defaultTextColor,
            destructiveTextColor = destructiveTextColor,
            disabledTextColor = disabledTextColor,

            defaultIconColor = defaultIconColor,
            destructiveIconColor = destructiveIconColor,
            disabledIconColor = disabledIconColor,
        )

    /**
     * Creates an [ActionSheetSizes] that represents the default sizes used in an [ActionSheet].
     *
     * @param titleTextStyle the title text style of this [ActionSheet].
     * @param subtitleTextStyle the subtitle text style of this [ActionSheet].
     * @param containerShape the container shape of this [ActionSheet].
     * @param itemSizes the [Action] sizes of this [ActionSheet].
     */
    @Composable
    fun sizes(
        titleTextStyle: TextStyle = PersianTheme.typography.headlineSmall,
        subtitleTextStyle: TextStyle = PersianTheme.typography.bodyMedium,
        containerShape: Shape = PersianTheme.shapes.shape22,
        itemSizes: ActionSheetItemSizes = itemSizes()
    ): ActionSheetSizes = ActionSheetSizes(
        titleTextStyle = titleTextStyle,
        subtitleTextStyle = subtitleTextStyle,
        containerShape = containerShape,
        itemSizes = itemSizes
    )

    /**
     * Creates an [ActionSheetItemSizes] that represents the default colors used in an [Action].
     *
     * @param textStyle the text style of this [Action].
     * @param iconSize the leading icon size of this [Action].
     */
    @Composable
    fun itemSizes(
        textStyle: TextStyle = PersianTheme.typography.bodyLarge,
        iconSize: IconSizes = IconDefaults.size24()
    ): ActionSheetItemSizes = ActionSheetItemSizes(
        textStyle = textStyle,
        iconSize = iconSize
    )
}

/**
 * Represents the title, subtitle, container and item colors in an [ActionSheet] in different state.
 *
 * @param titleColor the title color of this [ActionSheet].
 * @param subtitleColor the subtitle color of this [ActionSheet].
 * @param containerColor the container color of this [ActionSheet].
 * @param itemColors the [Action] colors of this [ActionSheet].
 * @constructor create an instance with arbitrary colors.
 *
 * - See [ActionSheetDefaults.colors] for the default colors used in an [ActionSheet].
 * - See [ActionSheetDefaults.itemColors] for the default colors used in an [Action].
 */
@Immutable
class ActionSheetColors internal constructor(
    internal val titleColor: Color,
    internal val subtitleColor: Color,
    internal val containerColor: Color,
    internal val itemColors: ActionSheetItemColors
)

/**
 * Represents the text and icon colors in an [Action] in different state.
 *
 * @param defaultTextColor the text color of this [Action] when enabled.
 * @param disabledTextColor the text color of this [Action] when not enabled.
 * @param destructiveTextColor the text color of this [Action] when destructive.
 *
 * @param defaultIconColor the leading icon color of this [Action] when enabled.
 * @param disabledIconColor the leading icon color of this [Action] when not enabled.
 * @param destructiveIconColor the leading icon color of this [Action] when destructive.
 *
 * @constructor create an instance with arbitrary colors.
 *
 * - See [ActionSheetDefaults.itemColors] for the default colors used in an [Action].
 */
@Immutable
class ActionSheetItemColors internal constructor(
    internal val defaultTextColor: Color,
    private val disabledTextColor: Color,
    private val destructiveTextColor: Color,

    internal val defaultIconColor: Color,
    private val disabledIconColor: Color,
    private val destructiveIconColor: Color,
) {
    /**
     * Represents the text color for this action, depending on [enabled] and [destructive].
     *
     * @param enabled whether the action is enabled
     * @param destructive whether the action is destructive
     */
    @Stable
    internal fun textColor(
        enabled: Boolean,
        destructive: Boolean
    ): Color = when {
        !enabled -> disabledTextColor
        destructive -> destructiveTextColor
        else -> defaultTextColor
    }

    /**
     * Represents the leading icon color for this action, depending on [enabled] and [destructive].
     *
     * @param enabled whether the action is enabled
     * @param destructive whether the action is destructive
     */
    @Stable
    internal fun iconColor(
        enabled: Boolean,
        destructive: Boolean
    ): Color = when {
        !enabled -> disabledIconColor
        destructive -> destructiveIconColor
        else -> defaultIconColor
    }

    /**
     * Returns a copy of this [ActionSheetItemColors], optionally overriding some of the values. This uses the
     * Color.Unspecified to mean “use the value from the source”
     */
    fun copy(
        defaultTextColor: Color = this.defaultTextColor,
        disabledTextColor: Color = this.disabledTextColor,
        destructiveTextColor: Color = this.destructiveTextColor,

        defaultIconColor: Color = this.defaultIconColor,
        disabledIconColor: Color = this.disabledIconColor,
        destructiveIconColor: Color = this.destructiveIconColor,
    ) = ActionSheetItemColors(
        defaultTextColor.takeOrElse { this.defaultTextColor },
        disabledTextColor.takeOrElse { this.disabledTextColor },
        destructiveTextColor.takeOrElse { this.destructiveTextColor },

        defaultIconColor.takeOrElse { this.defaultIconColor },
        disabledIconColor.takeOrElse { this.disabledIconColor },
        destructiveIconColor.takeOrElse { this.destructiveIconColor },
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ActionSheetItemColors) return false

        if (defaultTextColor != other.defaultTextColor) return false
        if (disabledTextColor != other.disabledTextColor) return false
        if (destructiveTextColor != other.destructiveTextColor) return false

        if (defaultIconColor != other.defaultIconColor) return false
        if (disabledIconColor != other.disabledIconColor) return false
        return destructiveIconColor == other.destructiveIconColor
    }

    override fun hashCode(): Int {
        var result = defaultTextColor.hashCode()
        result = 31 * result + destructiveTextColor.hashCode()
        result = 31 * result + disabledTextColor.hashCode()

        result = 31 * result + defaultIconColor.hashCode()
        result = 31 * result + disabledIconColor.hashCode()
        result = 31 * result + destructiveIconColor.hashCode()
        return result
    }
}

/**
 * Represents the title, subtitle, container and item sizes in an [ActionSheet] in different state.
 *
 * @param titleTextStyle the title text style of this [ActionSheet].
 * @param subtitleTextStyle the subtitle text style of this [ActionSheet].
 * @param containerShape the container shape of this [ActionSheet].
 * @param itemSizes the [Action] sizes of this [ActionSheet].
 * @constructor create an instance with arbitrary sizes.
 *
 * - See [ActionSheetDefaults.sizes] for the default sizes used in an [ActionSheet].
 * - See [ActionSheetDefaults.itemSizes] for the default sizes used in an [Action].
 */
@Immutable
class ActionSheetSizes internal constructor(
    internal val titleTextStyle: TextStyle,
    internal val subtitleTextStyle: TextStyle,
    internal val containerShape: Shape,
    internal val itemSizes: ActionSheetItemSizes
)

/**
 * Represents the text and icon sizes in an [Action] in different state.
 *
 * @param textStyle the text style of this [Action].
 * @param iconSize the leading icon sizes of this [Action].
 *
 * @constructor create an instance with arbitrary sizes.
 *
 * - See [ActionSheetDefaults.itemSizes] for the default sizes used in an [Action].
 */
@Immutable
class ActionSheetItemSizes internal constructor(
    internal val textStyle: TextStyle,
    internal val iconSize: IconSizes,
) {
    /**
     * Returns a copy of this [ActionSheetItemSizes], optionally overriding some of the values
     */
    fun copy(
        textStyle: TextStyle = this.textStyle,
        iconSize: IconSizes = this.iconSize,
    ) = ActionSheetItemSizes(
        textStyle = textStyle,
        iconSize = iconSize
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ActionSheetItemSizes) return false

        if (textStyle != other.textStyle) return false
        return iconSize == other.iconSize
    }

    override fun hashCode(): Int {
        var result = textStyle.hashCode()
        result = 31 * result + iconSize.hashCode()
        return result
    }
}