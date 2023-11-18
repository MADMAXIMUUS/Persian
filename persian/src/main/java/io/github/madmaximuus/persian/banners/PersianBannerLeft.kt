package io.github.madmaximuus.persian.banners

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.avatarsAndImages.PersianAvatar
import io.github.madmaximuus.persian.avatarsAndImages.PersianAvatarDefaults
import io.github.madmaximuus.persian.avatarsAndImages.PersianImage
import io.github.madmaximuus.persian.avatarsAndImages.PersianImagesDefaults
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
    Box(
        modifier = modifier
            .fillMaxHeight(),
        contentAlignment = Alignment.TopCenter
    ) {
        PersianIconBox(
            modifier = Modifier
                .padding(0.dp),
            icon = icon,
            colors = PersianIconBoxDefaults.colors(
                defaultColor = iconColor
            ),
            contentDescription = contentDescription
        )
    }
}

@Composable
internal fun PersianBannerLeftImage(
    modifier: Modifier = Modifier,
    image: String,
) {
    Box(
        modifier = modifier
            .fillMaxHeight(),
        contentAlignment = Alignment.TopCenter
    ) {
        PersianImage(
            imageUrl = image,
            size = PersianImagesDefaults.smallShapeSize48()
        )
    }
}

@Composable
internal fun PersianBannerLeftAvatar(
    modifier: Modifier = Modifier,
    image: String
) {
    Box(
        modifier = modifier
            .fillMaxHeight(),
        contentAlignment = Alignment.TopCenter
    ) {
        PersianAvatar(
            modifier = Modifier
                .padding(0.dp),
            imageUrl = image,
            size = PersianAvatarDefaults.size32(),
            onClick = null
        )
    }
}