package io.github.madmaximuus.persian.alert

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
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
        actionColor: ButtonColors = PersianButtonDefaults.tertiaryColors()
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

@Immutable
data class AlertsColors(
    val backgroundColor: Color,
    val titleColor: Color,
    val descriptionColor: Color,
    val iconColor: Color,
    val actionColor: ButtonColors
)