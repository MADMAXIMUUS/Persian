package io.github.madmaximuus.persian.alert

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.buttons.ButtonColors
import io.github.madmaximuus.persian.buttons.PersianButtonColors
import io.github.madmaximuus.persian.foundation.elevation
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.surfaceColorAtElevation

@Immutable
data class AlertsColors(
    val backgroundColor: Color,
    val titleColor: Color,
    val descriptionColor: Color,
    val iconColor: Color,
    val actionColor: ButtonColors
)

object PersianAlertsColors {

    @Composable
    fun primary(
        backgroundColor: Color = MaterialTheme.extendedColorScheme
            .surfaceColorAtElevation(MaterialTheme.elevation.small),
        titleColor: Color = MaterialTheme.extendedColorScheme.onSurface,
        descriptionColor: Color = MaterialTheme.extendedColorScheme.onSurface,
        iconColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        actionColor: ButtonColors = PersianButtonColors.primary()
    ) = remember(
        backgroundColor,
        titleColor,
        descriptionColor,
        iconColor,
        actionColor
    ) {
        AlertsColors(
            backgroundColor = backgroundColor,
            titleColor = titleColor,
            descriptionColor = descriptionColor,
            iconColor = iconColor,
            actionColor = actionColor
        )
    }
}