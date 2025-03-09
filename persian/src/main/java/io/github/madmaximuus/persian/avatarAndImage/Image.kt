package io.github.madmaximuus.persian.avatarAndImage

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
import io.github.madmaximuus.persian.avatarAndImage.utils.LayoutId
import io.github.madmaximuus.persian.avatarAndImage.utils.badgeMeasurePolicy
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.ripple.ripple
import io.github.madmaximuus.persian.foundation.shimmer
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.image.Image
import io.github.madmaximuus.persianSymbols.plus.Plus

/**
 * The image displays an image via imageUri. If there is no image, a placeholder is displayed
 *
 * @param modifier the [Modifier] to be applied to this image.
 * @param imageUrl the Uri that used for image download.
 * @param overlay if `true` [overlayIcon] will be displayed on top of the image.
 * @param placeholderIcon the icon that will be displayed if the image is not loaded.
 * @param overlayIcon the icon that will be displayed on top of the image, if [overlay] is `true`.
 * @param sizes The [AvatarSizes] sizes of the container, icons and text of this image.
 * @param colors The [AvatarColors] colors of the container, icons and text of this image.
 * @param onClick called when this image is clicked.
 * @param badge element to be displayed in the corner of this image.
 */
@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun Image(
    modifier: Modifier = Modifier,
    imageUrl: Uri,
    overlay: Boolean = false,
    placeholderIcon: Painter = rememberVectorPainter(image = PersianSymbols.Default.Image),
    overlayIcon: Painter = rememberVectorPainter(image = PersianSymbols.Default.Plus),
    sizes: ImageSizes = ImageDefaults.size64(),
    colors: ImageColors = ImageDefaults.colors(),
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
                            .clip(sizes.shape)
                            .background(
                                colors.placeholderContainerColor,
                                sizes.shape
                            )
                            .border(1.dp, colors.borderColor, sizes.shape)
                            .clickable(
                                enabled = onClick != null,
                                onClick = { onClick?.invoke() },
                                role = Role.Image,
                                interactionSource = remember { MutableInteractionSource() },
                                indication = ripple(
                                    color = colors.overlayIconColor
                                )
                            ),
                        contentAlignment = Alignment.Center,
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
                                                tint = colors.placeholderIconColor
                                            )
                                        }
                                    }

                                    RequestState.Loading -> {
                                        Box(
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .shimmer()
                                        )
                                    }

                                    is RequestState.Success -> {
                                        Image(
                                            modifier = Modifier
                                                .fillMaxSize(),
                                            contentScale = ContentScale.Crop,
                                            painter = painter,
                                            contentDescription = ""
                                        )
                                    }
                                }
                            },
                        )
                        if (overlay && sizes.overlayIconSizes != null) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(PersianTheme.colorScheme.surface.copy(alpha = 0.8f)),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    painter = overlayIcon,
                                    tint = colors.overlayIconColor,
                                    sizes = sizes.overlayIconSizes,
                                )
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