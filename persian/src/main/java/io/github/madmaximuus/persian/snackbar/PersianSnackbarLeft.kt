package io.github.madmaximuus.persian.snackbar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
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
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.iconBox.PersianIconBox
import io.github.madmaximuus.persian.iconBox.PersianIconBoxDefaults
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
            PersianIconBox(
                modifier = Modifier
                    .padding(
                        start = MaterialTheme.spacing.large,
                        end = 0.dp,
                        top = MaterialTheme.spacing.medium,
                        bottom = MaterialTheme.spacing.medium
                    ),
                icon = icon,
                size = PersianIconBoxDefaults.size28(),
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
                    start = MaterialTheme.spacing.small,
                    end = 0.dp,
                    top = MaterialTheme.spacing.small,
                    bottom = MaterialTheme.spacing.small
                ),
            imageUrl = imageUrl,
            size = PersianImagesDefaults.size36(),
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
                    start = MaterialTheme.spacing.small,
                    end = 0.dp,
                    top = MaterialTheme.spacing.small,
                    bottom = MaterialTheme.spacing.small
                ),
            imageUrl = avatarUrl,
            size = PersianAvatarsDefaults.size36(),
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
                    start = MaterialTheme.spacing.extraSmall,
                    end = 0.dp,
                    top = MaterialTheme.spacing.small,
                    bottom = MaterialTheme.spacing.small
                ),
            sizes = PersianProgressBarDefaults.circularMedium(),
            counter = true
        )
    }
}