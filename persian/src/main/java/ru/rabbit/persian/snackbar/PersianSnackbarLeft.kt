package ru.rabbit.persian.snackbar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import ru.rabbit.persian.avatars.PersianAvatars
import ru.rabbit.persian.avatars.PersianAvatarsSizes
import ru.rabbit.persian.foundation.extendedColorScheme
import ru.rabbit.persian.foundation.spacing
import ru.rabbit.persian.progressBars.PersianCircularProgressBarSize
import ru.rabbit.persian.progressBars.PersianProgressBar

object PersianSnackbarLeft {

    @Composable
    fun Icon24(
        modifier: Modifier = Modifier,
        icon: Painter,
        contentDescription: String,
        color: Color = MaterialTheme.extendedColorScheme.primary,
    ) {
        Box(
            modifier = modifier,
        ) {
            Icon(
                modifier = Modifier
                    .padding(
                        start = MaterialTheme.spacing.large,
                        end = 0.dp,
                        top = MaterialTheme.spacing.medium,
                        bottom = MaterialTheme.spacing.medium
                    )
                    .size(24.dp),
                painter = icon,
                contentDescription = contentDescription,
                tint = color
            )
        }
    }

    @OptIn(ExperimentalGlideComposeApi::class)
    @Composable
    fun Image(
        modifier: Modifier = Modifier,
        image: String,
        contentDescription: String
    ) {
        Box(
            modifier = modifier,
        ) {
            GlideImage(
                modifier = Modifier
                    .padding(
                        start = MaterialTheme.spacing.extraSmall,
                        end = 0.dp,
                        top = MaterialTheme.spacing.extraSmall,
                        bottom = MaterialTheme.spacing.extraSmall
                    )
                    .size(36.dp, 36.dp)
                    .clip(MaterialTheme.shapes.medium),
                model = image,
                contentScale = ContentScale.Crop,
                contentDescription = contentDescription,
            )
        }
    }

    @Composable
    fun Avatar(
        modifier: Modifier = Modifier,
        image: String
    ) {
        Box(
            modifier = modifier,
        ) {
            PersianAvatars.Round(
                modifier = Modifier
                    .padding(
                        start = MaterialTheme.spacing.small,
                        end = 0.dp,
                        top = MaterialTheme.spacing.small,
                        bottom = MaterialTheme.spacing.small
                    ),
                imageUrl = image,
                size = PersianAvatarsSizes.medium(),
                onClick = null
            )
        }
    }

    @Composable
    fun Progress(
        modifier: Modifier = Modifier,
        progress: Float,
    ) {
        Box(
            modifier = modifier,
        ) {
            PersianProgressBar.Circular(
                progress = progress,
                modifier = Modifier
                    .padding(
                        start = MaterialTheme.spacing.extraSmall,
                        end = 0.dp,
                        top = MaterialTheme.spacing.small,
                        bottom = MaterialTheme.spacing.small
                    ),
                sizes = PersianCircularProgressBarSize.medium(),
                content = {
                    Text()
                }
            )
        }
    }

}