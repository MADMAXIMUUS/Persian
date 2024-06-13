package io.github.madmaximuus.persian.banners

import android.net.Uri
import androidx.compose.foundation.layout.padding
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
import io.github.madmaximuus.persian.foundation.LocalContentColor
import io.github.madmaximuus.persian.iconBox.PersianIconBox
import io.github.madmaximuus.persian.iconBox.PersianIconBoxDefaults

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
            contentDescription = contentDescription,
            size = PersianIconBoxDefaults.size28()
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
        imageUrl = Uri.parse(image),
        sizes = PersianImagesDefaults.size72(),
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
        imageUrl = Uri.parse(image),
        sizes = PersianAvatarsDefaults.size48(),
    )
}