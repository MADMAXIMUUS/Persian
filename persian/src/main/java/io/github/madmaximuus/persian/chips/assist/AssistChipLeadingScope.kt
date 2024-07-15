package io.github.madmaximuus.persian.chips.assist

import android.net.Uri
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import io.github.madmaximuus.persian.avatarsAndImages.Image
import io.github.madmaximuus.persian.avatarsAndImages.ImageColors
import io.github.madmaximuus.persian.avatarsAndImages.ImageShape
import io.github.madmaximuus.persian.avatarsAndImages.ImageSizes
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.icon.IconSizes

class AssistChipLeadingScope(
    private val enabled: Boolean,
    private val iconSizes: IconSizes,
    private val iconColor: Color,
    private val imageSizes: ImageSizes,
    private val imageColors: ImageColors,
) {

    @Composable
    fun Icon(
        modifier: Modifier = Modifier,
        painter: Painter,
    ) {
        Box(
            modifier = modifier
                .padding(horizontal = PersianTheme.spacing.size8)
        ) {
            Icon(
                painter = painter,
                sizes = iconSizes,
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
                colors = imageColors,
                enabled = enabled,
                shape = ImageShape.MEDIUM
            )
        }
    }
}