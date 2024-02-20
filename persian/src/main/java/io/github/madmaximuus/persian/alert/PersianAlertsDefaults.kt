package io.github.madmaximuus.persian.alert

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse
import io.github.madmaximuus.persian.buttons.ButtonColors
import io.github.madmaximuus.persian.buttons.PersianButtonDefaults
import io.github.madmaximuus.persian.foundation.extendedColorScheme

object PersianAlertsDefaults {

    @Composable
    fun colors(
        backgroundColor: Color = MaterialTheme.extendedColorScheme.surface,
        titleColor: Color = MaterialTheme.extendedColorScheme.onSurface,
        descriptionColor: Color = MaterialTheme.extendedColorScheme.onSurface,
        iconColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        dividerColor: Color = MaterialTheme.extendedColorScheme.outlineVariant,
        actionColor: ButtonColors = PersianButtonDefaults.tertiaryColors()
    ) = AlertsColors(
        backgroundColor = backgroundColor,
        titleColor = titleColor,
        descriptionColor = descriptionColor,
        iconColor = iconColor,
        dividerColor = dividerColor,
        actionColor = actionColor
    )
}

@Immutable
class AlertsColors(
    internal val backgroundColor: Color,
    internal val titleColor: Color,
    internal val descriptionColor: Color,
    internal val iconColor: Color,
    internal val dividerColor: Color,
    internal val actionColor: ButtonColors
){
    fun copy(
        backgroundColor: Color = this.backgroundColor,
        titleColor: Color = this.titleColor,
        descriptionColor: Color = this.descriptionColor,
        iconColor: Color = this.iconColor,
        dividerColor: Color = this.dividerColor,
        actionColor: ButtonColors = this.actionColor
    ) = AlertsColors(
        backgroundColor.takeOrElse { this.backgroundColor },
        titleColor.takeOrElse { this.titleColor },
        descriptionColor.takeOrElse { this.descriptionColor },
        iconColor.takeOrElse { this.iconColor },
        dividerColor.takeOrElse { this.dividerColor },
        actionColor
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is AlertsColors) return false

        if (backgroundColor != other.backgroundColor) return false
        if (titleColor != other.titleColor) return false
        if (descriptionColor != other.descriptionColor) return false
        if (iconColor != other.iconColor) return false
        if (dividerColor != other.dividerColor) return false
        return actionColor == other.actionColor
    }

    override fun hashCode(): Int {
        var result = backgroundColor.hashCode()
        result = 31 * result + titleColor.hashCode()
        result = 31 * result + descriptionColor.hashCode()
        result = 31 * result + iconColor.hashCode()
        result = 31 * result + dividerColor.hashCode()
        result = 31 * result + actionColor.hashCode()
        return result
    }
}