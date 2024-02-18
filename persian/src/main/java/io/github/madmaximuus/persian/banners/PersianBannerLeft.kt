package io.github.madmaximuus.persian.banners

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.avatarsAndImages.ImageShape
import io.github.madmaximuus.persian.avatarsAndImages.PersianAvatar
import io.github.madmaximuus.persian.avatarsAndImages.PersianAvatarsDefaults
import io.github.madmaximuus.persian.avatarsAndImages.PersianImage
import io.github.madmaximuus.persian.avatarsAndImages.PersianImagesDefaults
import io.github.madmaximuus.persian.iconBox.PersianIconBox

sealed class PersianBannerLeft {
    data class Icon(val icon: Painter) : PersianBannerLeft()
    data class Image(val imageUrl: String) : PersianBannerLeft()
    data class Avatar(val avatarUrl: String) : PersianBannerLeft()
}

@Composable
internal fun PersianBannerLeftIcon(
    modifier: Modifier = Modifier,
    icon: Painter,
    contentDescription: String,
    iconColor: Color
) {
    CompositionLocalProvider(LocalContentColor provides iconColor) {
        PersianIconBox(
            modifier = modifier
                .padding(0.dp),
            icon = icon,
            contentDescription = contentDescription
        )
    }
}

@Composable
internal fun PersianBannerLeftImage(
    modifier: Modifier = Modifier,
    image: String,
) {
    PersianImage(
        modifier = modifier,
        imageUrl = image,
        size = PersianImagesDefaults.size48(),
        shape = ImageShape.SMALL
    )
}

@Composable
internal fun PersianBannerLeftAvatar(
    modifier: Modifier = Modifier,
    image: String
) {
    PersianAvatar(
        modifier = modifier,
        imageUrl = image,
        size = PersianAvatarsDefaults.size32(),
    )
}