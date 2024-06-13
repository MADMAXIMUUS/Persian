package io.github.madmaximuus.persian.tabs

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.PersianTheme

@Immutable
class TabColors internal constructor(
    val backgroundColor: Color,
    val indicatorColor: Color,
    val activeColor: Color,
    val disabledColor: Color
)

object PersianTabsDefaults {

    @Composable
    fun colors(
        backgroundColor: Color = PersianTheme.colorScheme.surface,
        indicatorColor: Color = PersianTheme.colorScheme.primary,
        activeColor: Color = PersianTheme.colorScheme.primary,
        disabledColor: Color = PersianTheme.colorScheme.onSurfaceVariant
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