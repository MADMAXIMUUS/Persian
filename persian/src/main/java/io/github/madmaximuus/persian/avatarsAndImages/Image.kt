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
import androidx.compose.material3.ripple
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
import io.github.madmaximuus.persian.foundation.shimmer
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.image.base.Image
import io.github.madmaximuus.persianSymbols.plus.base.Plus

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun Image(
    modifier: Modifier = Modifier,
    imageUrl: Uri,
    overlay: Boolean = false,
    enabled: Boolean = true,
    placeholderIcon: Painter = rememberVectorPainter(image = PersianSymbols.Default.Image),
    overlayIcon: Painter = rememberVectorPainter(image = PersianSymbols.Default.Plus),
    sizes: ImageSize = ImageDefaults.size64(),
    colors: ImageColors = ImageDefaults.colors(),
    shape: ImageShape = ImageShape.MEDIUM,
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
                        contentAlignment = Alignment.Center,
                        modifier = modifier
                            .size(sizes.boxSizes)
                            .clip(sizes.shape(shape))
                            .background(
                                colors.background(enabled),
                                sizes.shape(shape)
                            )
                            .border(1.dp, colors.border(enabled), sizes.shape(shape))
                            .clickable(
                                enabled = onClick != null && enabled,
                                onClick = { onClick?.invoke() },
                                role = Role.Image,
                                interactionSource = remember { MutableInteractionSource() },
                                indication = ripple(
                                    color = colors.overlayIcon(enabled)
                                )
                            )
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
                                                size = sizes.placeholderSize,
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
                        if (overlay && sizes.overlayIconSize != null) {
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
                                        size = sizes.overlayIconSize,
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