package ru.rabbit.persian.banners

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import ru.rabbit.persian.foundation.extendedColorScheme

@Immutable
data class BannerColors(
    val background: Color,
    val iconColor: Color,
    val textColor: Color
)

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