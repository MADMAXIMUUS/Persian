package io.github.madmaximuus.persian.topAppBar

import android.net.Uri
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.avatarsAndImages.Avatar
import io.github.madmaximuus.persian.iconButton.TertiaryIconButton
import io.github.madmaximuus.persian.topAppBar.util.LayoutId

interface TopAppBarLeftScope {
    val colors: TopAppBarColors
    val sizes: TopAppBarSizes
}

internal class TopAppBarLeftScopeWrapper(
    override val colors: TopAppBarColors,
    override val sizes: TopAppBarSizes
) : TopAppBarLeftScope

@Composable
fun TopAppBarLeftScope.IconButton(
    modifier: Modifier = Modifier,
    icon: Painter,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .size(48.dp)
            .layoutId(LayoutId.LEFT),
        contentAlignment = Alignment.Center
    ) {
        TertiaryIconButton(
            modifier = modifier,
            icon = icon,
            sizes = this@IconButton.sizes.leftIconButtonSizes,
            colors = this@IconButton.colors.leftIconButtonColors,
            onClick = onClick
        )
    }
}

@Composable
fun TopAppBarLeftScope.Avatar(
    modifier: Modifier = Modifier,
    avatarUrl: Uri,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .size(48.dp)
            .layoutId(LayoutId.LEFT),
        contentAlignment = Alignment.Center
    ) {
        Avatar(
            imageUrl = avatarUrl,
            sizes = this@Avatar.sizes.leftAvatarSizes,
            colors = this@Avatar.colors.leftAvatarColors,
            onClick = onClick
        )
    }
}