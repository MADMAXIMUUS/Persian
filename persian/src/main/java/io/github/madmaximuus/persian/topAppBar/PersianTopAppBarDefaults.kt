package io.github.madmaximuus.persian.topAppBar

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.state38

@Immutable
data class TopAppBarColors(
    val background: Color,
    val scrolledBackgroundColor: Color,
    val contentColor: Color,
    val iconColor: Color,
    val disabledIconColor: Color,
)

object PersianTopAppBarDefaults {

    @Composable
    fun colors(
        background: Color = PersianTheme.colorScheme.surface,
        scrolledBackgroundColor: Color = PersianTheme.colorScheme.surface2,
        contentColor: Color = PersianTheme.colorScheme.onSurface,
        iconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        disabledIconColor: Color = PersianTheme.colorScheme.onSurface.state38,
    ) = remember(
        background,
        contentColor,
        scrolledBackgroundColor,
        iconColor,
        disabledIconColor
    ) {
        TopAppBarColors(
            background = background,
            scrolledBackgroundColor = scrolledBackgroundColor,
            contentColor = contentColor,
            iconColor = iconColor,
            disabledIconColor = disabledIconColor
        )
    }

}

internal val LocalPersianTopAppBarColors = compositionLocalOf<TopAppBarColors> {
    error("No TopAppBarsColors provided")
}