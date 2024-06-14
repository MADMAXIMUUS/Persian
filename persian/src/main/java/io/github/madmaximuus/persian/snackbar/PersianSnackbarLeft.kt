package io.github.madmaximuus.persian.snackbar

import android.net.Uri
import androidx.compose.foundation.layout.Box
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
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.progressBars.PersianCircularProgressBar
import io.github.madmaximuus.persian.progressBars.PersianProgressBarDefaults

sealed class PersianSnackbarLeft {

    data class Icon(
        val icon: Painter,
        val color: Color
    ) : PersianSnackbarLeft()

    data class Image(
        val imageUrl: String
    ) : PersianSnackbarLeft()

    data class Avatar(
        val avatarUrl: String
    ) : PersianSnackbarLeft()

    data class Progress(
        val progress: Float
    ) : PersianSnackbarLeft()
}

@Composable
internal fun PersianSnackbarLeftIcon(
    modifier: Modifier = Modifier,
    icon: Painter,
    color: Color,
    contentDescription: String,

    ) {
    Box(
        modifier = modifier,
    ) {
        CompositionLocalProvider(
            LocalContentColor provides color
        ) {
            Icon(
                modifier = Modifier
                    .padding(
                        start = PersianTheme.spacing.size16,
                        end = 0.dp,
                        top = PersianTheme.spacing.size12,
                        bottom = PersianTheme.spacing.size12
                    ),
                painter = icon,
                size = IconDefaults.size28(),
                contentDescription = contentDescription
            )
        }
    }
}

@Composable
internal fun PersianSnackbarLeftImage(
    modifier: Modifier = Modifier,
    imageUrl: String,
) {
    Box(
        modifier = modifier,
    ) {
        PersianImage(
            modifier = Modifier
                .padding(
                    start = PersianTheme.spacing.size8,
                    end = 0.dp,
                    top = PersianTheme.spacing.size8,
                    bottom = PersianTheme.spacing.size8
                ),
            imageUrl = Uri.parse(imageUrl),
            sizes = PersianImagesDefaults.size36(),
            shape = ImageShape.LARGE
        )
    }
}

@Composable
internal fun PersianSnackbarLeftAvatar(
    modifier: Modifier = Modifier,
    avatarUrl: String
) {
    Box(
        modifier = modifier,
    ) {
        PersianAvatar(
            modifier = Modifier
                .padding(
                    start = PersianTheme.spacing.size8,
                    end = 0.dp,
                    top = PersianTheme.spacing.size8,
                    bottom = PersianTheme.spacing.size8
                ),
            imageUrl = Uri.parse(avatarUrl),
            sizes = PersianAvatarsDefaults.size36(),
            onClick = null
        )
    }
}

@Composable
internal fun PersianSnackbarLeftProgress(
    modifier: Modifier = Modifier,
    progress: Float,
) {
    Box(
        modifier = modifier,
    ) {
        PersianCircularProgressBar(
            progress = progress,
            modifier = Modifier
                .padding(
                    start = PersianTheme.spacing.size4,
                    end = 0.dp,
                    top = PersianTheme.spacing.size8,
                    bottom = PersianTheme.spacing.size8
                ),
            sizes = PersianProgressBarDefaults.circularMedium(),
            counter = true
        )
    }
}