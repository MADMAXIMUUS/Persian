package io.github.madmaximuus.persian.listItem

import android.net.Uri
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import io.github.madmaximuus.persian.avatarsAndImages.Avatar
import io.github.madmaximuus.persian.avatarsAndImages.Image
import io.github.madmaximuus.persian.avatarsAndImages.ImageShape
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon

interface ListItemLeft : RowScope {
    val sizes: ListItemSizes
    val colors: ListItemColors
    val enabled: Boolean
}

internal class ListItemLeftWrapper(
    val scope: RowScope,
    override val sizes: ListItemSizes,
    override val colors: ListItemColors,
    override val enabled: Boolean,
) : ListItemLeft, RowScope by scope

@Composable
fun ListItemLeft.Icon(
    modifier: Modifier = Modifier,
    icon: Painter,
) {
    Box(
        modifier = modifier
            .padding(
                end = PersianTheme.spacing.size12
            )
    ) {
        Icon(
            painter = icon,
            sizes = this@Icon.sizes.leftIconSizes,
            tint = this@Icon.colors.leftIconColor(this@Icon.enabled),
            contentDescription = "List Leading Icon"
        )
    }
}

@Composable
fun ListItemLeft.Image(
    modifier: Modifier = Modifier,
    imageUrl: Uri,
) {
    Box(
        modifier = modifier
            .padding(
                end = PersianTheme.spacing.size8
            )
    ) {
        Image(
            imageUrl = imageUrl,
            sizes = this@Image.sizes.leftImageSizes,
            colors = this@Image.colors.leftImageColors,
            enabled = this@Image.enabled,
            shape = ImageShape.LARGE
        )
    }
}

@Composable
fun ListItemLeft.Avatar(
    modifier: Modifier = Modifier,
    avatarUrl: Uri,
) {
    Box(
        modifier = modifier.padding(
            end = PersianTheme.spacing.size8
        )
    ) {
        Avatar(
            imageUrl = avatarUrl,
            colors = this@Avatar.colors.leftAvatarColors,
            enabled = this@Avatar.enabled,
            sizes = this@Avatar.sizes.leftAvatarSizes,
        )
    }
}