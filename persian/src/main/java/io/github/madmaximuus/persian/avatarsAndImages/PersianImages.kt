package io.github.madmaximuus.persian.avatarsAndImages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
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
import io.github.madmaximuus.persian.foundation.PersianContentStateDisabled
import io.github.madmaximuus.persian.foundation.elevation
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.icons
import io.github.madmaximuus.persian.foundation.shimmer
import io.github.madmaximuus.persian.foundation.surfaceColorAtElevation
import io.github.madmaximuus.persian.iconBox.PersianIconBox
import io.github.madmaximuus.persian.iconBox.PersianIconBoxDefaults

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun PersianImage(
    modifier: Modifier = Modifier,
    imageUrl: String,
    overlay: Boolean = false,
    enabled: Boolean = true,
    overlayIcon: Painter = MaterialTheme.icons.add,
    size: ImageSize = PersianImagesDefaults.size64(),
    shape: ImageShape = ImageShape.MEDIUM,
    onClick: (() -> Unit)? = null
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .size(size.boxSizes)
            .clip(size.shape(shape))
            .background(
                MaterialTheme.extendedColorScheme
                    .surfaceColorAtElevation(MaterialTheme.elevation.extraLarge),
                size.shape(shape)
            )
            .border(1.dp, MaterialTheme.extendedColorScheme.outline, size.shape(shape))
            .clickable(
                enabled = onClick != null && enabled,
                onClick = { onClick?.invoke() },
                role = Role.Image
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
                            CompositionLocalProvider(
                                LocalContentColor provides MaterialTheme.extendedColorScheme.onPrimaryContainer
                            ) {
                                PersianIconBox(
                                    icon = MaterialTheme.icons.image,
                                    size = size.placeholderSize,
                                    enabled = enabled,
                                    colors = PersianIconBoxDefaults.colors()
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
                            alpha = if (!enabled) PersianContentStateDisabled else 1f,
                            contentDescription = ""
                        )
                    }
                }
            },
        )
        if (overlay) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.extendedColorScheme.surface.copy(alpha = 0.8f)),
                contentAlignment = Alignment.Center
            ) {
                CompositionLocalProvider(
                    LocalContentColor provides MaterialTheme.extendedColorScheme.onPrimaryContainer
                ) {
                    PersianIconBox(
                        icon = overlayIcon,
                        enabled = enabled,
                        size = size.overlayIconBoxSize,
                        colors = PersianIconBoxDefaults.colors()
                    )
                }
            }
        }
    }
}