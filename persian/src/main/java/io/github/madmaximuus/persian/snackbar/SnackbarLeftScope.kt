package io.github.madmaximuus.persian.snackbar

import android.net.Uri
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.avatarsAndImages.Avatar
import io.github.madmaximuus.persian.avatarsAndImages.AvatarDefaults
import io.github.madmaximuus.persian.avatarsAndImages.Image
import io.github.madmaximuus.persian.avatarsAndImages.ImageDefaults
import io.github.madmaximuus.persian.avatarsAndImages.ImageShape
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.progressIndicator.CircularProgressIndicator
import io.github.madmaximuus.persian.progressIndicator.ProgressIndicatorDefaults

@Stable
class SnackbarLeftScope(
    private val snackbarData: SnackbarData
) {

    @Composable
    fun Icon(
        icon: Painter,
        modifier: Modifier = Modifier,
        color: Color = PersianTheme.colorScheme.primary,
        contentDescription: String = ""
    ) {
        Box(
            modifier = modifier
                .padding(
                    start = PersianTheme.spacing.size12,
                    end = 0.dp,
                    top = PersianTheme.spacing.size10,
                    bottom = PersianTheme.spacing.size10
                )
        ) {
            Icon(
                painter = icon,
                sizes = IconDefaults.size28(),
                tint = color,
                contentDescription = contentDescription
            )
        }
    }

    @Composable
    fun Image(
        imageUrl: Uri,
        modifier: Modifier = Modifier,
    ) {
        Box(
            modifier = modifier
                .padding(
                    start = PersianTheme.spacing.size8,
                    end = 0.dp,
                    top = PersianTheme.spacing.size8,
                    bottom = PersianTheme.spacing.size8
                )
        ) {
            Image(
                imageUrl = imageUrl,
                sizes = ImageDefaults.size32(),
                shape = ImageShape.LARGE
            )
        }
    }


    @Composable
    fun Avatar(
        modifier: Modifier = Modifier,
        avatarUrl: Uri
    ) {
        Box(
            modifier = modifier
                .padding(
                    start = PersianTheme.spacing.size8,
                    end = 0.dp,
                    top = PersianTheme.spacing.size8,
                    bottom = PersianTheme.spacing.size8
                )
        ) {
            Avatar(
                imageUrl = avatarUrl,
                sizes = AvatarDefaults.size32(),
            )
        }
    }


    @Composable
    fun Timer(
        modifier: Modifier = Modifier,
        progress: Float,
        onTimerFinish: (SnackbarData) -> Unit = { it.dismiss() }
    ) {
        val animationTrigger = remember { mutableStateOf(false) }
        val animateSweep by animateFloatAsState(
            targetValue = if (animationTrigger.value) 0f else progress,
            animationSpec = tween(
                durationMillis = progress.toInt() * 1000,
                easing = LinearEasing
            ),
            label = "Progress Animation",
            finishedListener = { onTimerFinish(snackbarData) }
        )
        LaunchedEffect(Unit) {
            animationTrigger.value = true
        }
        Box(
            modifier = modifier
                .padding(
                    start = PersianTheme.spacing.size8,
                    end = 0.dp,
                    top = PersianTheme.spacing.size8,
                    bottom = PersianTheme.spacing.size8
                )
        ) {
            CircularProgressIndicator(
                progress = { animateSweep },
                maxValue = { progress },
                sizes = ProgressIndicatorDefaults.circularMedium(),
                content = true
            )
        }
    }
}