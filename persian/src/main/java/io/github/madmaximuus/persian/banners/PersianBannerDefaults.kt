package io.github.madmaximuus.persian.banners

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.foundation.extendedColorScheme

object PersianBannerDefaults {
    @Composable
    fun colors(
        background: Color = MaterialTheme.extendedColorScheme.tertiaryContainer,
        leftIconColor: Color = MaterialTheme.extendedColorScheme.onTertiaryContainer,
        rightIconColor: Color = MaterialTheme.extendedColorScheme.onSurfaceVariant,
        titleColor: Color = MaterialTheme.extendedColorScheme.onTertiaryContainer,
        subtitleColor: Color = MaterialTheme.extendedColorScheme.onSurface
    ) = remember(
        background,
        leftIconColor,
        rightIconColor,
        titleColor,
        subtitleColor
    ) {
        NewBannerColors(
            background = background,
            leftIconColor = leftIconColor,
            rightIconColor = rightIconColor,
            titleColor = titleColor,
            subtitleColor = subtitleColor
        )
    }

    @Composable
    fun sizes(
        cornerRadius: Shape = MaterialTheme.shapes.medium,
        titleStyle: TextStyle = MaterialTheme.typography.titleMedium,
        subtitleStyle: TextStyle = MaterialTheme.typography.bodyMedium
    ) = remember(
        cornerRadius,
        titleStyle,
        subtitleStyle
    ) {
        NewBannerSizes(
            cornerRadius = cornerRadius,
            titleStyle = titleStyle,
            subtitleStyle = subtitleStyle
        )
    }
}

@Immutable
data class NewBannerSizes(
    val cornerRadius: Shape,
    val titleStyle: TextStyle,
    val subtitleStyle: TextStyle
)

@Immutable
data class NewBannerColors(
    val background: Color,
    val titleColor: Color,
    val subtitleColor: Color,
    val leftIconColor: Color,
    val rightIconColor: Color
)