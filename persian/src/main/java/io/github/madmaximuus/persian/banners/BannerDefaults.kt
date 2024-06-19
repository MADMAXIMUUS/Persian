package io.github.madmaximuus.persian.banners

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.foundation.PersianTheme

object PersianBannerDefaults {
    @Composable
    fun colors(
        background: Color = PersianTheme.colorScheme.tertiaryContainer,
        leftIconColor: Color = PersianTheme.colorScheme.onTertiaryContainer,
        rightIconColor: Color = PersianTheme.colorScheme.onSurfaceVariant,
        titleColor: Color = PersianTheme.colorScheme.onTertiaryContainer,
        body: Color = PersianTheme.colorScheme.tertiary
    ) = BannerColors(
        background = background,
        leftIconColor = leftIconColor,
        rightIconColor = rightIconColor,
        titleColor = titleColor,
        body = body
    )

    @Composable
    fun sizes(
        cornerRadius: Shape = PersianTheme.shapes.shape14,
        titleStyle: TextStyle = PersianTheme.typography.titleMedium,
        descriptionStyle: TextStyle = PersianTheme.typography.bodyMedium
    ) = BannerSizes(
        cornerRadius = cornerRadius,
        titleStyle = titleStyle,
        descriptionStyle = descriptionStyle
    )
}

@Immutable
class BannerSizes internal constructor(
    internal val cornerRadius: Shape,
    internal val titleStyle: TextStyle,
    internal val descriptionStyle: TextStyle
) {
    fun copy(
        cornerRadius: Shape = this.cornerRadius,
        titleStyle: TextStyle = this.titleStyle,
        descriptionStyle: TextStyle = this.descriptionStyle,
    ) = BannerSizes(
        cornerRadius,
        titleStyle,
        descriptionStyle
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other !is BannerSizes) return false

        if (cornerRadius != other.cornerRadius) return false
        if (titleStyle != other.titleStyle) return false
        return descriptionStyle == other.descriptionStyle
    }

    override fun hashCode(): Int {
        var result = cornerRadius.hashCode()
        result = 31 * result + titleStyle.hashCode()
        result = 31 * result + descriptionStyle.hashCode()
        return result
    }
}

@Immutable
class BannerColors internal constructor(
    internal val background: Color,
    internal val titleColor: Color,
    internal val body: Color,
    internal val leftIconColor: Color,
    internal val rightIconColor: Color
)