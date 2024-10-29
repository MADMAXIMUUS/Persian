package io.github.madmaximuus.persian.snackbar

import android.net.Uri
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.avatarsAndImages.Avatar
import io.github.madmaximuus.persian.avatarsAndImages.Image
import io.github.madmaximuus.persian.avatarsAndImages.ImageShape
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.progressIndicator.CircularProgressIndicator

interface SnackbarLeftScope : RowScope {
    val snackbarData: SnackbarData
    val colors: SnackbarColors
    val sizes: SnackbarSizes
}

class SnackbarLeftScopeWrapper(
    scope: RowScope,
    override val snackbarData: SnackbarData,
    override val colors: SnackbarColors,
    override val sizes: SnackbarSizes,
) : SnackbarLeftScope, RowScope by scope

@Composable
fun SnackbarLeftScope.Icon(
    icon: Painter,
    modifier: Modifier = Modifier,
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
            sizes = this@Icon.sizes.leftIconSizes,
            tint = this@Icon.colors.leftIconColor,
            contentDescription = contentDescription
        )
    }
}

@Composable
fun SnackbarLeftScope.Image(
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
            sizes = this@Image.sizes.leftImageSizes,
            colors = this@Image.colors.leftImageColors,
            shape = ImageShape.LARGE
        )
    }
}

@Composable
fun SnackbarLeftScope.Avatar(
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
            colors = this@Avatar.colors.leftAvatarColors,
            sizes = this@Avatar.sizes.leftAvatarSizes
        )
    }
}

@Composable
fun SnackbarLeftScope.Timer(
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
            sizes = this@Timer.sizes.leftTimerSizes,
            colors = this@Timer.colors.leftTimerColors,
            content = true
        )
    }
}
