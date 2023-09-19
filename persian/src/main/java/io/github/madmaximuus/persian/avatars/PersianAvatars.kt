package io.github.madmaximuus.persian.avatars

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
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
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.foundation.icons

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
                .background(MaterialTheme.extendedColorScheme.primaryContainer, CircleShape)
                .border(1.dp, MaterialTheme.extendedColorScheme.outline, CircleShape)
                .clickable(
                    enabled = onClick != null,
                    onClick = { onClick?.invoke() },
                    role = Role.Image
                ),
            contentAlignment = Alignment.Center
        ) {
            val padding = (size.boxSizes.value - 24.dp.value) / 2
            GlideImage(
                modifier = Modifier
                    .fillMaxSize(),
                contentScale = ContentScale.Crop,
                loading = placeholder {
                    Icon(
                        modifier = Modifier
                            .size(size.boxSizes)
                            .padding(padding.dp),
                        painter = MaterialTheme.icons.personOutlined,
                        tint = MaterialTheme.extendedColorScheme.onPrimaryContainer,
                        contentDescription = ""
                    )
                },
                failure = placeholder {
                    Icon(
                        modifier = Modifier
                            .size(size.boxSizes)
                            .padding(padding.dp),
                        painter = MaterialTheme.icons.personOutlined,
                        tint = MaterialTheme.extendedColorScheme.onPrimaryContainer,
                        contentDescription = ""
                    )
                },
                model = imageUrl,
                contentDescription = ""
            )
            if (isEdit) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.extendedColorScheme.surface.copy(alpha = 0.6f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        modifier = Modifier.size(24.dp),
                        painter = MaterialTheme.icons.add, contentDescription = ""
                    )
                }
            }
        }
    }

    @Composable
    fun Round(
        modifier: Modifier = Modifier,
        image: ImageBitmap,
        isEdit: Boolean = false,
        size: AvatarSize = PersianAvatarsSizes.medium(),
        onClick: (() -> Unit)? = null
    ) {
        Box(
            modifier = modifier
                .size(size.boxSizes)
                .clip(CircleShape)
                .background(MaterialTheme.extendedColorScheme.primaryContainer, CircleShape)
                .border(1.dp, MaterialTheme.extendedColorScheme.outline, CircleShape)
                .clickable(
                    enabled = onClick != null,
                    onClick = { onClick?.invoke() },
                    role = Role.Image
                ),
            contentAlignment = Alignment.Center
        ) {
            Image(
                bitmap = image,
                modifier = Modifier
                    .fillMaxSize(),
                contentScale = ContentScale.Crop,
                contentDescription = ""
            )
            if (isEdit) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.extendedColorScheme.surface.copy(alpha = 0.6f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        modifier = Modifier.size(24.dp),
                        painter = MaterialTheme.icons.add,
                        contentDescription = ""
                    )
                }
            }
        }
    }

}