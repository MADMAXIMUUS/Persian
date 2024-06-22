package io.github.madmaximuus.persian.chips.input

import android.net.Uri
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import io.github.madmaximuus.persian.avatarsAndImages.Avatar
import io.github.madmaximuus.persian.avatarsAndImages.AvatarColors
import io.github.madmaximuus.persian.avatarsAndImages.AvatarSize
import io.github.madmaximuus.persian.avatarsAndImages.Image
import io.github.madmaximuus.persian.avatarsAndImages.ImageColors
import io.github.madmaximuus.persian.avatarsAndImages.ImageShape
import io.github.madmaximuus.persian.avatarsAndImages.ImageSize
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.icon.IconSize
import io.github.madmaximuus.persianSymbols.check.base.Check
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

class InputChipLeadingScope(
    val enabled: Boolean,
    val selected: Boolean,
    val iconColor: Color,
    val iconSize: IconSize,
    val avatarColors: AvatarColors,
    val avatarSizes: AvatarSize,
    val imageColors: ImageColors,
    val imageSizes: ImageSize
) {

    @Composable
    fun Icon(
        modifier: Modifier = Modifier,
        icon: Painter,
        selectedIcon: Painter = rememberVectorPainter(image = PersianSymbols.Default.Check)
    ) {
        Box(
            modifier = modifier
                .padding(horizontal = PersianTheme.spacing.size8)
        ) {
            Icon(
                painter = if (selected) selectedIcon else icon,
                size = iconSize,
                tint = iconColor
            )
        }
    }

    @Composable
    fun Image(
        modifier: Modifier = Modifier,
        imageUrl: Uri
    ) {
        Box(
            modifier = modifier
                .padding(
                    start = PersianTheme.spacing.size4,
                    end = PersianTheme.spacing.size8
                )
        ) {
            Image(
                imageUrl = imageUrl,
                sizes = imageSizes,
                overlay = selected,
                colors = imageColors,
                enabled = enabled,
                shape = ImageShape.MEDIUM
            )
        }
    }

    @Composable
    fun Avatar(
        modifier: Modifier = Modifier,
        avatarUrl: Uri
    ) {
        Box(
            modifier = modifier
                .padding(
                    start = PersianTheme.spacing.size4,
                    end = PersianTheme.spacing.size8
                )
        ) {
            Avatar(
                imageUrl = avatarUrl,
                sizes = avatarSizes,
                overlay = selected,
                colors = avatarColors,
                enabled = enabled,
            )
        }
    }
}