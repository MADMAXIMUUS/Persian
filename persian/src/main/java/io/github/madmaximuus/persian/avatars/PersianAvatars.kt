package io.github.madmaximuus.persian.avatars

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.bumptech.glide.integration.compose.placeholder
import io.github.madmaximuus.persian.foundation.elevation
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.icons
import io.github.madmaximuus.persian.foundation.surfaceColorAtElevation
import io.github.madmaximuus.persian.iconBox.PersianIconBox
import io.github.madmaximuus.persian.iconBox.PersianIconBoxColors

object PersianAvatars {

    @OptIn(ExperimentalGlideComposeApi::class)
    @Composable
    fun Round(
        modifier: Modifier = Modifier,
        imageUrl: String,
        isEdit: Boolean = false,
        size: AvatarSize = PersianAvatarsSizes.medium(),
        onClick: (() -> Unit)? = null
    ) {
        Box(
            modifier = modifier
                .size(size.boxSizes)
                .clip(CircleShape)
                .background(
                    MaterialTheme.extendedColorScheme
                        .surfaceColorAtElevation(MaterialTheme.elevation.extraLarge),
                    CircleShape
                )
                .border(1.dp, MaterialTheme.extendedColorScheme.outline, CircleShape)
                .clickable(
                    enabled = onClick != null,
                    onClick = { onClick?.invoke() },
                    role = Role.Image
                ),
            contentAlignment = Alignment.Center
        ) {
            GlideImage(
                modifier = Modifier
                    .fillMaxSize(),
                contentScale = ContentScale.Crop,
                loading = placeholder {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        PersianIconBox.Primary(
                            icon = MaterialTheme.icons.personOutlined,
                            size = size.placeholderSize,
                            colors = PersianIconBoxColors.primary(
                                defaultColor = MaterialTheme.extendedColorScheme.onPrimaryContainer
                            )
                        )
                    }
                },
                failure = placeholder {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        PersianIconBox.Primary(
                            icon = MaterialTheme.icons.personOutlined,
                            size = size.placeholderSize,
                            colors = PersianIconBoxColors.primary(
                                defaultColor = MaterialTheme.extendedColorScheme.onPrimaryContainer
                            )
                        )
                    }
                },
                model = imageUrl,
                contentDescription = ""
            )
            if (isEdit) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.extendedColorScheme.surface.copy(alpha = 0.8f)),
                    contentAlignment = Alignment.Center
                ) {
                    PersianIconBox.Primary(
                        icon = MaterialTheme.icons.add,
                        size = size.editIconBoxSize,
                        colors = PersianIconBoxColors.primary(
                            defaultColor = MaterialTheme.extendedColorScheme.primary
                        )
                    )
                }
            }
        }
    }

    @Composable
    fun Round(
        modifier: Modifier = Modifier,
        image: ImageBitmap?,
        isEdit: Boolean = false,
        size: AvatarSize = PersianAvatarsSizes.medium(),
        onClick: (() -> Unit)? = null
    ) {
        Box(
            modifier = modifier
                .size(size.boxSizes)
                .clip(CircleShape)
                .background(
                    MaterialTheme.extendedColorScheme
                        .surfaceColorAtElevation(MaterialTheme.elevation.extraLarge),
                    CircleShape
                )
                .border(1.dp, MaterialTheme.extendedColorScheme.outline, CircleShape)
                .clickable(
                    enabled = onClick != null,
                    onClick = { onClick?.invoke() },
                    role = Role.Image
                ),
            contentAlignment = Alignment.Center
        ) {
            if (image != null) {
                Image(
                    bitmap = image,
                    modifier = Modifier
                        .fillMaxSize(),
                    contentScale = ContentScale.Crop,
                    contentDescription = ""
                )
            } else {
                PersianIconBox.Primary(
                    icon = MaterialTheme.icons.personOutlined,
                    size = size.placeholderSize,
                    colors = PersianIconBoxColors.primary(
                        defaultColor = MaterialTheme.extendedColorScheme.onPrimaryContainer
                    )
                )
            }
            if (isEdit) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.extendedColorScheme.surface.copy(alpha = 0.8f)),
                    contentAlignment = Alignment.Center
                ) {
                    PersianIconBox.Primary(
                        icon = MaterialTheme.icons.add,
                        size = size.editIconBoxSize,
                        colors = PersianIconBoxColors.primary(
                            defaultColor = MaterialTheme.extendedColorScheme.primary
                        )
                    )
                }
            }
        }
    }

}