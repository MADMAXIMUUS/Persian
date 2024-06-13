package io.github.madmaximuus.persian.listItem

import android.net.Uri
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.avatarsAndImages.AvatarSize
import io.github.madmaximuus.persian.avatarsAndImages.ImageShape
import io.github.madmaximuus.persian.avatarsAndImages.ImageSize
import io.github.madmaximuus.persian.avatarsAndImages.PersianAvatar
import io.github.madmaximuus.persian.avatarsAndImages.PersianImage
import io.github.madmaximuus.persian.foundation.LocalContentColor
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.iconBox.IconSize
import io.github.madmaximuus.persian.iconBox.Icon

sealed class PersianListCellLeft {

    data class Icon(
        val icon: Painter,
        val color: Color,
    ) : PersianListCellLeft()

    data class Image(
        val imageUrl: String
    ) : PersianListCellLeft()

    data class Avatar(
        val avatarUrl: String
    ) : PersianListCellLeft()
}

@Composable
internal fun PersianListCellLeftIcon(
    modifier: Modifier = Modifier,
    icon: Painter,
    color: Color,
    size: IconSize,
    paddingValues: PaddingValues,
    contentDescription: String,
) {
    Box(
        modifier = modifier.padding(
            top = PersianTheme.spacing.size4,
            bottom = PersianTheme.spacing.size4,
            start = 0.dp,
            end = PersianTheme.spacing.size12
        )
    ) {
        CompositionLocalProvider(
            LocalContentColor provides color
        ) {
            Box(
                modifier = Modifier
                    .padding(paddingValues)
            ) {
                Icon(
                    painter = icon,
                    size = size,
                    contentDescription = contentDescription
                )
            }
        }
    }
}

@Composable
internal fun PersianListCellLeftImage(
    modifier: Modifier = Modifier,
    imageUrl: String,
    size: ImageSize,
    paddingValues: PaddingValues
) {
    Box(
        modifier = modifier.padding(paddingValues),
    ) {
        PersianImage(
            imageUrl = Uri.parse(imageUrl),
            sizes = size,
            shape = ImageShape.LARGE
        )
    }
}

@Composable
internal fun PersianListCellLeftAvatar(
    modifier: Modifier = Modifier,
    avatarUrl: String,
    size: AvatarSize,
    paddingValues: PaddingValues
) {
    Box(
        modifier = modifier.padding(paddingValues),
    ) {
        PersianAvatar(
            imageUrl = Uri.parse(avatarUrl),
            sizes = size,
            onClick = null
        )
    }
}