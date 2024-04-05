package io.github.madmaximuus.persian.topAppBar

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.extendedColorScheme
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
        background: Color = MaterialTheme.extendedColorScheme.surface,
        scrolledBackgroundColor: Color = MaterialTheme.extendedColorScheme.surface2,
        contentColor: Color = MaterialTheme.extendedColorScheme.onSurface,
        iconColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        disabledIconColor: Color = MaterialTheme.extendedColorScheme.onSurface.state38,
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