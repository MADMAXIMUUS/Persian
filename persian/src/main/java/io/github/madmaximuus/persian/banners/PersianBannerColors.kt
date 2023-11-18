package io.github.madmaximuus.persian.banners

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import io.github.madmaximuus.persian.foundation.extendedColorScheme

@Deprecated("Replace with new BannerColors")
@Immutable
data class BannerColors(
    val background: Color,
    val iconColor: Color,
    val textColor: Color,
)

@Deprecated("Replace with PersianBannerDefaults")
object PersianBannerColors {

    @Composable
    fun tertiary(
        background: Color = MaterialTheme.extendedColorScheme.tertiaryContainer,
        iconColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        textColor: Color = MaterialTheme.extendedColorScheme.onSurface
    ) = remember(
        background,
        iconColor,
        textColor
    ) {
        BannerColors(
            background = background,
            iconColor = iconColor,
            textColor = textColor
        )
    }
}