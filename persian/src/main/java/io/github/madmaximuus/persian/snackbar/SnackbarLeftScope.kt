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

/**
 * An interface that represents the scope for a Snackbar that is aligned to the left.
 *
 * This interface extends the [RowScope] interface, which means that it can be used to compose
 * a row of composables. It provides access to the [snackbarData], [colors], and [sizes] of the
 * Snackbar.
 *
 * @property snackbarData The data for the Snackbar, such as the message and action label.
 * @property colors The colors used in the Snackbar, such as the background color and text color.
 * @property sizes The sizes used in the Snackbar, such as the padding and corner radius.
 */
interface SnackbarLeftScope : RowScope {
    val snackbarData: SnackbarData
    val colors: SnackbarColors
    val sizes: SnackbarSizes
}

/**
 * A wrapper class that implements the [SnackbarLeftScope] interface and delegates the [RowScope]
 * implementation to the provided [scope] parameter.
 *
 * This class is used to provide access to the [snackbarData], [colors], and [sizes] of a Snackbar
 * that is aligned to the left, while also allowing the composition of a row of composables using
 * the [RowScope] interface.
 *
 * @property scope The [RowScope] implementation to delegate to.
 * @property snackbarData The data for the Snackbar, such as the message and action label.
 * @property colors The colors used in the Snackbar, such as the background color and text color.
 * @property sizes The sizes used in the Snackbar, such as the padding and corner radius.
 */
class SnackbarLeftScopeWrapper(
    scope: RowScope,
    override val snackbarData: SnackbarData,
    override val colors: SnackbarColors,
    override val sizes: SnackbarSizes,
) : SnackbarLeftScope, RowScope by scope

/**
 * Displays an icon in a Snackbar that is aligned to the left.
 *
 * This function is an extension function of the [SnackbarLeftScope] interface, which means that it
 * can be called on any instance of that interface. It takes an [icon] parameter, which is a [Painter]
 * that represents the icon to be displayed, as well as an optional [modifier] parameter and a
 * [contentDescription] parameter.
 *
 * @param icon The [Painter] that represents the icon to be displayed.
 * @param modifier The optional [Modifier] to be applied to the icon.
 * @param contentDescription The optional [String] that describes the icon for accessibility purposes.
 */
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

/**
 * Displays an image in a Snackbar that is aligned to the left.
 *
 * This function is an extension function of the [SnackbarLeftScope] interface, which means that it
 * can be called on any instance of that interface. It takes an [imageUrl] parameter, which is a [Uri]
 * that represents the URL of the image to be displayed, as well as an optional [modifier] parameter.
 *
 * @param imageUrl The [Uri] that represents the URL of the image to be displayed.
 * @param modifier The optional [Modifier] to be applied to the image.
 */
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

/**
 * Displays an avatar image in a Snackbar that is aligned to the left.
 *
 * This function is an extension function of the [SnackbarLeftScope] interface, which means that it
 * can be called on any instance of that interface. It takes an optional [modifier] parameter and an
 * [avatarUrl] parameter, which is a [Uri] that represents the URL of the avatar image to be displayed.
 *
 * @param modifier The optional [Modifier] to be applied to the avatar image.
 * @param avatarUrl The [Uri] that represents the URL of the avatar image to be displayed.
 */
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

/**
 * Displays a timer in a Snackbar that is aligned to the left.
 *
 * This function is an extension function of the [SnackbarLeftScope] interface, which means that it
 * can be called on any instance of that interface. It takes an optional [modifier] parameter, a
 * [progress] parameter, which is a [Float] that represents the progress of the timer, and an
 * optional [onTimerFinish] parameter, which is a lambda function that is called when the timer
 * finishes.
 *
 * @param modifier The optional [Modifier] to be applied to the timer.
 * @param progress The [Float] that represents the progress of the timer.
 * @param onTimerFinish The optional lambda function that is called when the timer finishes.
 */
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