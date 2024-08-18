package io.github.madmaximuus.persian.chips.assist

import android.net.Uri
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import io.github.madmaximuus.persian.avatarsAndImages.Image
import io.github.madmaximuus.persian.avatarsAndImages.ImageShape
import io.github.madmaximuus.persian.chips.founfation.ChipColors
import io.github.madmaximuus.persian.chips.founfation.ChipSizes
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon

interface AssistChipLeadingScope {
    val colors: ChipColors
    val sizes: ChipSizes
    val enabled: Boolean
}

internal class AssistChipLeadingScopeWrapper(
    override val colors: ChipColors,
    override val sizes: ChipSizes,
    override val enabled: Boolean
) : AssistChipLeadingScope

@Composable
fun AssistChipLeadingScope.Icon(
    modifier: Modifier = Modifier,
    painter: Painter,
) {
    Box(
        modifier = modifier
            .padding(horizontal = PersianTheme.spacing.size8)
    ) {
        Icon(
            painter = painter,
            sizes = sizes.leadingIconSizes,
            tint = colors.leadingIconContentColor(enabled)
        )
    }
}

@Composable
fun AssistChipLeadingScope.Image(
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
            sizes = sizes.leadingImageSizes,
            colors = colors.imageColors,
            enabled = enabled,
            shape = ImageShape.MEDIUM
        )
    }
}