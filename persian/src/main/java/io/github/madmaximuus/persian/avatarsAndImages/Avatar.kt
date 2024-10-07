package io.github.madmaximuus.persian.avatarsAndImages

import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideSubcomposition
import com.bumptech.glide.integration.compose.RequestState
import io.github.madmaximuus.persian.avatarsAndImages.utils.LayoutId
import io.github.madmaximuus.persian.avatarsAndImages.utils.badgeMeasurePolicy
import io.github.madmaximuus.persian.foundation.LocalContentColor
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.ripple.ripple
import io.github.madmaximuus.persian.foundation.shimmer
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.plus.base.Plus
import io.github.madmaximuus.persianSymbols.user.base.User

/**
 * The avatar displays an image of the user. If there is no image, a placeholder is displayed
 *
 * @param modifier the [Modifier] to be applied to this avatar.
 * @param imageUrl the Uri that used for image download.
 * @param overlay if `true` [overlayIcon] will be displayed on top of the image.
 * @param enabled controls the enabled state of this avatar. When `false`, this component will not
 * respond to user input, and it will appear visually disabled.
 * @param placeholderIcon the icon that will be displayed if the image is not loaded
 * @param overlayIcon the icon that will be displayed on top of the image, if [overlay] is `true`
 * @param initials the text that will be displayed in this avatar.
 * @param colors The [AvatarColors] colors of the container, icons and text of this avatar.
 * @param sizes The [AvatarSizes] sizes of the container, icons and text of this avatar.
 * @param onClick called when this avatar is clicked.
 * @param badge element to be displayed in the corner of this avatar.
 */
@Composable
fun Avatar(
    modifier: Modifier = Modifier,
    imageUrl: Uri,
    overlay: Boolean = false,
    enabled: Boolean = true,
    placeholderIcon: Painter = rememberVectorPainter(image = PersianSymbols.Default.User),
    overlayIcon: Painter = rememberVectorPainter(image = PersianSymbols.Default.Plus),
    initials: String? = null,
    colors: AvatarColors = AvatarDefaults.colors(),
    sizes: AvatarSizes = AvatarDefaults.size48(),
    onClick: (() -> Unit)? = null,
    badge: (@Composable () -> Unit)? = null
) {
    Layout(
        content = {
            Box(
                modifier = Modifier
                    .size(sizes.boxSizes)
                    .layoutId(LayoutId.ANCHOR),
                contentAlignment = Alignment.Center,
                content = {
                    Box(
                        modifier = modifier
                            .size(sizes.boxSizes)
                            .clip(PersianTheme.shapes.full)
                            .background(
                                colors.container(enabled, initials != null),
                                PersianTheme.shapes.full
                            )
                            .border(1.dp, colors.border(enabled), PersianTheme.shapes.full)
                            .clickable(
                                enabled = onClick != null && enabled,
                                onClick = { onClick?.invoke() },
                                role = Role.Image,
                                interactionSource = remember { MutableInteractionSource() },
                                indication = ripple(
                                    color = colors.overlayIcon(enabled)
                                )
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        if (initials != null) {
                            Initials(
                                initials = initials,
                                sizes = sizes,
                                colors = colors,
                                enabled = enabled
                            )
                        } else {
                            Image(
                                imageUrl = imageUrl,
                                placeholderIcon = placeholderIcon,
                                sizes = sizes,
                                colors = colors,
                                enabled = enabled
                            )
                        }
                        if (overlay && sizes.overlayIconSizes != null) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(PersianTheme.colorScheme.surface.copy(alpha = 0.8f)),
                                contentAlignment = Alignment.Center
                            ) {
                                CompositionLocalProvider(
                                    LocalContentColor provides colors.overlayIcon(enabled)
                                ) {
                                    Icon(
                                        painter = overlayIcon,
                                        sizes = sizes.overlayIconSizes
                                    )
                                }
                            }
                        }
                    }
                }
            )
            Box(
                modifier = Modifier
                    .layoutId(LayoutId.BADGE)
                    .size(sizes.badgeSize ?: 0.dp)
            ) {
                if (badge != null && sizes.badgeSize != null)
                    badge()
            }
        },
        modifier = Modifier
            .wrapContentSize(),
        measurePolicy = { measurables, constraints ->
            badgeMeasurePolicy(
                scope = this,
                measurables = measurables,
                constraints = constraints,
                badgeHorizontalOffset = sizes.horizontalBadgeOffset.roundToPx(),
                badgeWithContentVerticalOffset = sizes.verticalBadgeOffset.roundToPx()
            )
        }
    )
}

/**
 * The initials displays a text in this avatar.
 *
 * @param enabled controls the enabled state of this avatar. When `false`, this component will not
 * respond to user input, and it will appear visually disabled.
 * @param initials the text that will be displayed if the image is not loaded.
 * @param colors The [AvatarColors] colors of the container, icons and text of this avatar.
 * @param sizes The [AvatarSizes] sizes of the container, icons and text of this avatar.
 */
@Composable
private fun Initials(
    initials: String,
    sizes: AvatarSizes,
    colors: AvatarColors,
    enabled: Boolean,
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = initials,
            style = sizes.initialsTextStyle,
            color = colors.initials(enabled)
        )
    }
}

/**
 * The image displays an image of the user. If there is no image, a placeholder is displayed
 *
 * @param imageUrl the Uri that used for image download.
 * @param enabled controls the enabled state of this avatar. When `false`, this component will not
 * respond to user input, and it will appear visually disabled.
 * @param placeholderIcon the icon that will be displayed if the image is not loaded
 * @param colors The [AvatarColors] colors of the container, icons and text of this avatar.
 * @param sizes The [AvatarSizes] sizes of the container, icons and text of this avatar.
 */
@Composable
@OptIn(ExperimentalGlideComposeApi::class)
private fun Image(
    imageUrl: Uri,
    placeholderIcon: Painter,
    sizes: AvatarSizes,
    colors: AvatarColors,
    enabled: Boolean
) {
    GlideSubcomposition(
        model = imageUrl,
        modifier = Modifier
            .fillMaxSize(),
        content = {
            when (state) {
                RequestState.Failure -> {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            painter = placeholderIcon,
                            sizes = sizes.placeholderIconSizes,
                            tint = colors.placeholderIcon(enabled)
                        )
                    }
                }

                RequestState.Loading -> {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .shimmer(true)
                    )
                }

                is RequestState.Success -> {
                    Image(
                        modifier = Modifier
                            .fillMaxSize(),
                        contentScale = ContentScale.Crop,
                        painter = painter,
                        alpha = if (!enabled) .38f else 1f,
                        contentDescription = ""
                    )
                }
            }
        },
    )
}