package io.github.madmaximuus.persian.alert

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.button.ButtonColors
import io.github.madmaximuus.persian.button.ButtonDefaults
import io.github.madmaximuus.persian.button.ButtonSizes
import io.github.madmaximuus.persian.dividers.DividerDefaults
import io.github.madmaximuus.persian.dividers.DividerSizes
import io.github.madmaximuus.persian.foundation.PersianTheme

object AlertsDefaults {

    @Composable
    fun colors(
        containerColor: Color = PersianTheme.colorScheme.surfaceContainer,
        titleColor: Color = PersianTheme.colorScheme.onSurface,
        descriptionColor: Color = PersianTheme.colorScheme.onSurface,
        dividerColor: Color = PersianTheme.colorScheme.outlineVariant,
        actionColor: ButtonColors = ButtonDefaults.tertiaryColors()
    ) = AlertColors(
        containerColor = containerColor,
        titleColor = titleColor,
        descriptionColor = descriptionColor,
        dividerColor = dividerColor,
        actionColor = actionColor
    )

    @Composable
    fun onlyActionSizes(
        containerShape: Shape = PersianTheme.shapes.shape20,
        titleTextStyle: TextStyle = PersianTheme.typography.headlineSmall,
        descriptionTextStyle: TextStyle = PersianTheme.typography.bodyMedium,
        dividerSizes: DividerSizes = DividerDefaults.sizes(),
        actionSize: ButtonSizes = ButtonDefaults.largeSizes()
    ): AlertSizes = AlertSizes(
        containerShape = containerShape,
        titleTextStyle = titleTextStyle,
        descriptionTextStyle = descriptionTextStyle,
        dividerSizes = dividerSizes,
        actionSize = actionSize
    )

    @Composable
    fun alertSizes(
        containerShape: Shape = PersianTheme.shapes.shape20,
        titleTextStyle: TextStyle = PersianTheme.typography.headlineSmall,
        descriptionTextStyle: TextStyle = PersianTheme.typography.bodyMedium,
        dividerSizes: DividerSizes = DividerDefaults.sizes(),
        actionSize: ButtonSizes = ButtonDefaults.smallSizes()
    ): AlertSizes = AlertSizes(
        containerShape = containerShape,
        titleTextStyle = titleTextStyle,
        descriptionTextStyle = descriptionTextStyle,
        dividerSizes = dividerSizes,
        actionSize = actionSize
    )
}

@Immutable
class AlertColors internal constructor(
    internal val containerColor: Color,
    internal val titleColor: Color,
    internal val descriptionColor: Color,
    internal val dividerColor: Color,
    internal val actionColor: ButtonColors
) {
    fun copy(
        backgroundColor: Color = this.containerColor,
        titleColor: Color = this.titleColor,
        descriptionColor: Color = this.descriptionColor,
        dividerColor: Color = this.dividerColor,
        actionColor: ButtonColors = this.actionColor
    ) = AlertColors(
        backgroundColor.takeOrElse { this.containerColor },
        titleColor.takeOrElse { this.titleColor },
        descriptionColor.takeOrElse { this.descriptionColor },
        dividerColor.takeOrElse { this.dividerColor },
        actionColor
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is AlertColors) return false

        if (containerColor != other.containerColor) return false
        if (titleColor != other.titleColor) return false
        if (descriptionColor != other.descriptionColor) return false
        if (dividerColor != other.dividerColor) return false
        return actionColor == other.actionColor
    }

    override fun hashCode(): Int {
        var result = containerColor.hashCode()
        result = 31 * result + titleColor.hashCode()
        result = 31 * result + descriptionColor.hashCode()
        result = 31 * result + dividerColor.hashCode()
        result = 31 * result + actionColor.hashCode()
        return result
    }
}

@Immutable
class AlertSizes internal constructor(
    internal val containerShape: Shape,
    internal val titleTextStyle: TextStyle,
    internal val descriptionTextStyle: TextStyle,
    internal val dividerSizes: DividerSizes,
    internal val actionSize: ButtonSizes,
) {
    fun copy(
        containerShape: Shape = this.containerShape,
        titleTextStyle: TextStyle = this.titleTextStyle,
        descriptionTextStyle: TextStyle = this.descriptionTextStyle,
        dividerSizes: DividerSizes = this.dividerSizes,
        actionSize: ButtonSizes = this.actionSize,
    ): AlertSizes = AlertSizes(
        containerShape = containerShape,
        titleTextStyle = titleTextStyle,
        descriptionTextStyle = descriptionTextStyle,
        dividerSizes = dividerSizes,
        actionSize = actionSize,
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is AlertSizes) return false

        if (containerShape != other.containerShape) return false
        if (titleTextStyle != other.titleTextStyle) return false
        if (descriptionTextStyle != other.descriptionTextStyle) return false
        if (dividerSizes != other.dividerSizes) return false
        return actionSize == other.actionSize
    }

    override fun hashCode(): Int {
        var result = containerShape.hashCode()
        result = 31 * result + titleTextStyle.hashCode()
        result = 31 * result + descriptionTextStyle.hashCode()
        result = 31 * result + dividerSizes.hashCode()
        result = 31 * result + actionSize.hashCode()
        return result
    }
}