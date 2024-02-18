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
class NewBannerSizes internal constructor(
    internal val cornerRadius: Shape,
    internal val titleStyle: TextStyle,
    internal val subtitleStyle: TextStyle
)

@Immutable
class NewBannerColors internal constructor(
    internal val background: Color,
    internal val titleColor: Color,
    internal val subtitleColor: Color,
    internal val leftIconColor: Color,
    internal val rightIconColor: Color
)