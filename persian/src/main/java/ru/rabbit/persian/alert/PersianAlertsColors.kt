package ru.rabbit.persian.alert

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import ru.rabbit.persian.buttons.ButtonColors
import ru.rabbit.persian.buttons.PersianButtonColors
import ru.rabbit.persian.foundation.PersianComponentStyle
import ru.rabbit.persian.foundation.elevation
import ru.rabbit.persian.foundation.extendedColorScheme
import ru.rabbit.persian.foundation.surfaceColorAtElevation

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
        descriptionColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        iconColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        actionColor: ButtonColors = PersianButtonColors
            .primary(style = PersianComponentStyle.STANDARD)
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