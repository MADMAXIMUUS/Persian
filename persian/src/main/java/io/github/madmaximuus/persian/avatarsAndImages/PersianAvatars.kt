package io.github.madmaximuus.persian.avatarsAndImages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideSubcomposition
import com.bumptech.glide.integration.compose.RequestState
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.icons
import io.github.madmaximuus.persian.foundation.shape
import io.github.madmaximuus.persian.foundation.shimmer
import io.github.madmaximuus.persian.iconBox.PersianIconBox

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun PersianAvatar(
    modifier: Modifier = Modifier,
    imageUrl: String,
    overlay: Boolean = false,
    enabled: Boolean = true,
    overlayIcon: Painter = MaterialTheme.icons.add,
    colors: AvatarsColors = PersianAvatarsDefaults.colors(),
    size: AvatarSize = PersianAvatarsDefaults.size48(),
    onClick: (() -> Unit)? = null
) {
    Box(
        modifier = modifier
            .size(size.boxSizes)
            .clip(MaterialTheme.shape.full)
            .background(
                colors.background(enabled),
                MaterialTheme.shape.full
            )
            .border(1.dp, colors.border(enabled), MaterialTheme.shape.full)
            .clickable(
                enabled = onClick != null && enabled,
                onClick = { onClick?.invoke() },
                role = Role.Image,
                interactionSource = remember { MutableInteractionSource() },
                indication = rememberRipple(
                    color = colors.overlayIcon(enabled)
                )
            ),
        contentAlignment = Alignment.Center
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
                            CompositionLocalProvider(
                                LocalContentColor provides colors.placeholderIcon(enabled)
                            ) {
                                PersianIconBox(
                                    icon = MaterialTheme.icons.person,
                                    size = size.placeholderIconSize
                                )
                            }
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
        if (overlay && size.overlayIconSize != null) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.extendedColorScheme.surface.copy(alpha = 0.8f)),
                contentAlignment = Alignment.Center
            ) {
                CompositionLocalProvider(
                    LocalContentColor provides colors.overlayIcon(enabled)
                ) {
                    PersianIconBox(
                        icon = overlayIcon,
                        size = size.overlayIconSize
                    )
                }
            }
        }
    }
}