package io.github.madmaximuus.persian.banner

import android.net.Uri
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.avatarsAndImages.Avatar
import io.github.madmaximuus.persian.avatarsAndImages.AvatarDefaults
import io.github.madmaximuus.persian.avatarsAndImages.AvatarSize
import io.github.madmaximuus.persian.avatarsAndImages.Image
import io.github.madmaximuus.persian.avatarsAndImages.ImageDefaults
import io.github.madmaximuus.persian.avatarsAndImages.ImageShape
import io.github.madmaximuus.persian.avatarsAndImages.ImageSize
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.icon.IconDefaults

@Stable
class BannerLeftScope(
    private val iconColor: Color
) {

    @Composable
    fun Icon(
        modifier: Modifier = Modifier,
        icon: Painter,
        contentDescription: String? = null,
    ) {
        Icon(
            modifier = modifier
                .padding(0.dp),
            painter = icon,
            contentDescription = contentDescription,
            size = IconDefaults.size28(),
            tint = iconColor
        )
    }

    @Composable
    fun Image(
        modifier: Modifier = Modifier,
        image: String,
        sizes: ImageSize = ImageDefaults.size72(),
        shape: ImageShape = ImageShape.SMALL
    ) {
        Image(
            modifier = modifier,
            imageUrl = Uri.parse(image),
            sizes = sizes,
            shape = shape
        )
    }

    @Composable
    fun Avatar(
        modifier: Modifier = Modifier,
        image: String,
        sizes: AvatarSize = AvatarDefaults.size48()
    ) {
        Avatar(
            modifier = modifier,
            imageUrl = Uri.parse(image),
            sizes = sizes,
        )
    }
}