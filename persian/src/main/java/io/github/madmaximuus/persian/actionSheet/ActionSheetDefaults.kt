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

object ActionSheetDefaults {

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

    @Composable
    fun itemColors(
        defaultColor: Color = PersianTheme.colorScheme.onSurface,
        errorColor: Color = PersianTheme.colorScheme.error,
        disabledColor: Color = PersianTheme.colorScheme.onSurface.state38,

        defaultIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        errorIconColor: Color = PersianTheme.colorScheme.error,
        disabledIconColor: Color = PersianTheme.colorScheme.onSurface.state38,
    ): ActionSheetItemColors =
        ActionSheetItemColors(
            defaultTextColor = defaultColor,
            errorTextColor = errorColor,
            disabledTextColor = disabledColor,

            defaultIconColor = defaultIconColor,
            errorIconColor = errorIconColor,
            disabledIconColor = disabledIconColor,
        )

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

    @Composable
    fun itemSizes(
        textStyle: TextStyle = PersianTheme.typography.bodyLarge,
        iconSize: IconSizes = IconDefaults.size24()
    ): ActionSheetItemSizes = ActionSheetItemSizes(
        textStyle = textStyle,
        iconSize = iconSize
    )
}

@Immutable
class ActionSheetColors(
    internal val titleColor: Color,
    internal val subtitleColor: Color,
    internal val containerColor: Color,
    internal val itemColors: ActionSheetItemColors
)

@Immutable
class ActionSheetItemColors(
    internal val defaultTextColor: Color,
    private val disabledTextColor: Color,
    private val errorTextColor: Color,

    internal val defaultIconColor: Color,
    private val disabledIconColor: Color,
    private val errorIconColor: Color,
) {
    @Stable
    internal fun textColor(
        enabled: Boolean,
        isError: Boolean
    ): Color = when {
        !enabled -> disabledTextColor
        isError -> errorTextColor
        else -> defaultTextColor
    }

    @Stable
    internal fun iconColor(
        enabled: Boolean,
        isError: Boolean
    ): Color = when {
        !enabled -> disabledIconColor
        isError -> errorIconColor
        else -> defaultIconColor
    }

    fun copy(
        defaultTextColor: Color = this.defaultTextColor,
        disabledTextColor: Color = this.disabledTextColor,
        errorTextColor: Color = this.errorTextColor,

        defaultIconColor: Color = this.defaultIconColor,
        disabledIconColor: Color = this.disabledIconColor,
        errorIconColor: Color = this.errorIconColor,
    ) = ActionSheetItemColors(
        defaultTextColor.takeOrElse { this.defaultTextColor },
        disabledTextColor.takeOrElse { this.disabledTextColor },
        errorTextColor.takeOrElse { this.errorTextColor },

        defaultIconColor.takeOrElse { this.defaultIconColor },
        disabledIconColor.takeOrElse { this.disabledIconColor },
        errorIconColor.takeOrElse { this.errorIconColor },
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is ActionSheetItemColors) return false

        if (defaultTextColor != other.defaultTextColor) return false
        if (disabledTextColor != other.disabledTextColor) return false
        if (errorTextColor != other.errorTextColor) return false

        if (defaultIconColor != other.defaultIconColor) return false
        if (disabledIconColor != other.disabledIconColor) return false
        return errorIconColor == other.errorIconColor
    }

    override fun hashCode(): Int {
        var result = defaultTextColor.hashCode()
        result = 31 * result + errorTextColor.hashCode()
        result = 31 * result + disabledTextColor.hashCode()

        result = 31 * result + defaultIconColor.hashCode()
        result = 31 * result + disabledIconColor.hashCode()
        result = 31 * result + errorIconColor.hashCode()
        return result
    }
}

@Immutable
class ActionSheetSizes(
    internal val titleTextStyle: TextStyle,
    internal val subtitleTextStyle: TextStyle,
    internal val containerShape: Shape,
    internal val itemSizes: ActionSheetItemSizes
)

@Immutable
class ActionSheetItemSizes(
    internal val textStyle: TextStyle,
    internal val iconSize: IconSizes,
) {

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