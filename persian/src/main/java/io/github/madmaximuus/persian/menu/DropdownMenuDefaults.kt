package io.github.madmaximuus.persian.menu

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.dividers.DividerDefaults
import io.github.madmaximuus.persian.dividers.DividerSizes
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state38
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSizes

object MenuDefaults {

    @Composable
    fun colors(
        backgroundColor: Color = PersianTheme.colorScheme.surfaceContainer,
        itemColors: MenuItemColors = itemColors()
    ) = remember(backgroundColor, itemColors) {
        MenuColors(
            containerColor = backgroundColor,
            itemColors = itemColors
        )
    }

    @Composable
    fun itemColors(
        titleColor: Color = PersianTheme.colorScheme.onSurface,
        negativeTitleColor: Color = PersianTheme.colorScheme.error,
        disabledTitleColor: Color = PersianTheme.colorScheme.onSurface.state38,

        leadingIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        selectedLeadingIconColor: Color = PersianTheme.colorScheme.primary,
        negativeLeadingIconColor: Color = PersianTheme.colorScheme.error,
        disabledLeadingIconColor: Color = PersianTheme.colorScheme.onSurface.state38,

        expendIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        disabledExpandIconColor: Color = PersianTheme.colorScheme.onSurface.state38,

        newLabelColor: Color = PersianTheme.colorScheme.onValid,
        disabledNewLabelColor: Color = PersianTheme.colorScheme.onValid.state38,

        newLabelContainerColor: Color = PersianTheme.colorScheme.valid,
        disabledNewLabelContainerColor: Color = PersianTheme.colorScheme.valid.state38,

        dividerColor: Color = PersianTheme.colorScheme.outlineVariant
    ): MenuItemColors =
        MenuItemColors(
            titleColor = titleColor,
            negativeTitleColor = negativeTitleColor,
            disabledTitleColor = disabledTitleColor,

            leadingIconColor = leadingIconColor,
            selectedLeadingIconColor = selectedLeadingIconColor,
            negativeLeadingIconColor = negativeLeadingIconColor,
            disabledLeadingIconColor = disabledLeadingIconColor,

            expendIconColor = expendIconColor,
            disabledExpandIconColor = disabledExpandIconColor,

            newLabelColor = newLabelColor,
            disabledNewLabelColor = disabledNewLabelColor,

            newLabelContainerColor = newLabelContainerColor,
            disabledNewLabelContainerColor = disabledNewLabelContainerColor,

            dividerColor = dividerColor
        )

    @Composable
    fun sizes(
        containerShape: Shape = PersianTheme.shapes.shape16,
        itemSizes: MenuItemSizes = itemSizes()
    ): MenuSizes = MenuSizes(
        containerShape = containerShape,
        itemSizes = itemSizes
    )

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

@Immutable
class MenuColors(
    val containerColor: Color,
    val itemColors: MenuItemColors
)

@Immutable
class MenuSizes(
    val containerShape: Shape,
    val itemSizes: MenuItemSizes
)

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
    ) = MenuItemSizes(
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

@Immutable
class MenuItemColors internal constructor(
    //Title Color
    private val titleColor: Color,
    private val negativeTitleColor: Color,
    private val disabledTitleColor: Color,

    //Leading Icon Color
    private val leadingIconColor: Color,
    private val selectedLeadingIconColor: Color,
    private val negativeLeadingIconColor: Color,
    private val disabledLeadingIconColor: Color,

    //Expend Icon Color
    private val expendIconColor: Color,
    private val disabledExpandIconColor: Color,

    //New Label Color
    private val newLabelColor: Color,
    private val disabledNewLabelColor: Color,

    //New Label Container Color
    private val newLabelContainerColor: Color,
    private val disabledNewLabelContainerColor: Color,

    internal val dividerColor: Color
) {
    @Composable
    internal fun titleColor(
        enabled: Boolean,
        negative: Boolean
    ): Color = when {
        !enabled -> disabledTitleColor
        negative -> negativeTitleColor
        else -> titleColor
    }

    @Composable
    internal fun leadingIconColor(
        enabled: Boolean,
        negative: Boolean,
        selected: Boolean,
    ): Color = when {
        !enabled -> disabledLeadingIconColor
        negative -> negativeLeadingIconColor
        selected -> selectedLeadingIconColor
        else -> leadingIconColor
    }

    @Composable
    internal fun expandIconColor(
        enabled: Boolean
    ): Color = when {
        !enabled -> disabledExpandIconColor
        else -> expendIconColor
    }

    @Composable
    internal fun newLabelColor(
        enabled: Boolean
    ): Color = if (enabled) newLabelColor else disabledNewLabelColor

    @Composable
    internal fun newLabelContainerColor(
        enabled: Boolean
    ): Color = if (enabled) newLabelContainerColor else disabledNewLabelContainerColor

    fun copy(
        titleColor: Color = this.titleColor,
        negativeTitleColor: Color = this.negativeTitleColor,
        disabledTitleColor: Color = this.disabledTitleColor,

        leadingIconColor: Color = this.leadingIconColor,
        selectedLeadingIconColor: Color = this.selectedLeadingIconColor,
        negativeLeadingIconColor: Color = this.negativeLeadingIconColor,
        disabledLeadingIconColor: Color = this.disabledLeadingIconColor,

        expendIconColor: Color = this.expendIconColor,
        disabledExpandIconColor: Color = this.disabledExpandIconColor,

        newLabelColor: Color = this.newLabelColor,
        disabledNewLabelColor: Color = this.disabledNewLabelColor,

        newLabelContainerColor: Color = this.newLabelContainerColor,
        disabledNewLabelContainerColor: Color = this.disabledNewLabelContainerColor,

        dividerColor: Color = this.dividerColor
    ) = MenuItemColors(
        titleColor = titleColor.takeOrElse { this.titleColor },
        negativeTitleColor = negativeTitleColor.takeOrElse { this.negativeTitleColor },
        selectedLeadingIconColor = selectedLeadingIconColor.takeOrElse { this.selectedLeadingIconColor },
        disabledTitleColor = disabledTitleColor.takeOrElse { this.disabledTitleColor },

        leadingIconColor = leadingIconColor.takeOrElse { this.leadingIconColor },
        negativeLeadingIconColor = negativeLeadingIconColor.takeOrElse { this.negativeLeadingIconColor },
        disabledLeadingIconColor = disabledLeadingIconColor.takeOrElse { this.disabledLeadingIconColor },

        expendIconColor = expendIconColor.takeOrElse { this.expendIconColor },
        disabledExpandIconColor = disabledExpandIconColor.takeOrElse { this.disabledExpandIconColor },

        newLabelColor = newLabelColor.takeOrElse { this.newLabelColor },
        disabledNewLabelColor = disabledNewLabelColor.takeOrElse { this.disabledNewLabelColor },

        newLabelContainerColor = newLabelContainerColor.takeOrElse { this.newLabelContainerColor },
        disabledNewLabelContainerColor = disabledNewLabelContainerColor.takeOrElse { this.disabledNewLabelContainerColor },

        dividerColor = dividerColor.takeOrElse { this.dividerColor }
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is MenuItemColors) return false

        if (titleColor != other.titleColor) return false
        if (negativeTitleColor != other.negativeTitleColor) return false
        if (disabledTitleColor != other.disabledTitleColor) return false

        if (leadingIconColor != other.leadingIconColor) return false
        if (selectedLeadingIconColor != other.selectedLeadingIconColor) return false
        if (negativeLeadingIconColor != other.negativeLeadingIconColor) return false
        if (disabledLeadingIconColor != other.disabledLeadingIconColor) return false

        if (expendIconColor != other.expendIconColor) return false
        if (disabledExpandIconColor != other.disabledExpandIconColor) return false

        if (newLabelColor != other.newLabelColor) return false
        if (disabledNewLabelColor != other.disabledNewLabelColor) return false

        if (newLabelContainerColor != other.newLabelContainerColor) return false
        if (dividerColor != other.dividerColor) return false
        return disabledNewLabelContainerColor == other.disabledNewLabelContainerColor
    }

    override fun hashCode(): Int {
        var result = titleColor.hashCode()
        result = 31 * result + negativeTitleColor.hashCode()
        result = 31 * result + disabledTitleColor.hashCode()

        result = 31 * result + leadingIconColor.hashCode()
        result = 31 * result + selectedLeadingIconColor.hashCode()
        result = 31 * result + negativeLeadingIconColor.hashCode()
        result = 31 * result + disabledLeadingIconColor.hashCode()

        result = 31 * result + expendIconColor.hashCode()
        result = 31 * result + disabledExpandIconColor.hashCode()

        result = 31 * result + newLabelColor.hashCode()
        result = 31 * result + disabledNewLabelColor.hashCode()

        result = 31 * result + newLabelContainerColor.hashCode()
        result = 31 * result + disabledNewLabelContainerColor.hashCode()
        result = 31 * result + dividerColor.hashCode()
        return result
    }
}