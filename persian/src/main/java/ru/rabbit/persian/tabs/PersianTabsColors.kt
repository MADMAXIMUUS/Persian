package ru.rabbit.persian.tabs

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import ru.rabbit.persian.foundation.extendedColorScheme

@Immutable
data class TabColors(
    val backgroundColor: Color,
    val indicatorColor: Color,
    val activeColor: Color,
    val disabledColor: Color
)

object PersianTabsColors {

    @Composable
    fun primary(
        backgroundColor: Color = MaterialTheme.extendedColorScheme.surface,
        indicatorColor: Color = MaterialTheme.extendedColorScheme.primary,
        activeColor: Color = MaterialTheme.extendedColorScheme.primary,
        disabledColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant
    ): TabColors = remember(
        backgroundColor, indicatorColor, activeColor, disabledColor
    ) {
        TabColors(
            backgroundColor = backgroundColor,
            indicatorColor = indicatorColor,
            activeColor = activeColor,
            disabledColor = disabledColor
        )
    }
}