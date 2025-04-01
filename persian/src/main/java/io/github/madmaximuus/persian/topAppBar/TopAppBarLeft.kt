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
import io.github.madmaximuus.persian.avatarAndImage.Avatar
import io.github.madmaximuus.persian.iconButton.IconButton
import io.github.madmaximuus.persian.topAppBar.util.LayoutId

/**
 * An interface that defines the scope for the left content of a top app bar.
 *
 * This scope provides access to the colors and sizes used by the top app bar,
 * allowing customization of the left content based on these properties.
 *
 * @property colors The colors to be used for the top app bar.
 * @property sizes The sizes to be used for the top app bar.
 */
interface TopAppBarLeadingScope {
    val colors: TopAppBarColors
    val sizes: TopAppBarSizes
}

/**
 * An internal class that implements the [TopAppBarLeadingScope] interface.
 *
 * This class wraps the colors and sizes properties, providing a concrete implementation
 * for the scope used by the left content of a top app bar.
 *
 * @property colors The colors to be used for the top app bar.
 * @property sizes The sizes to be used for the top app bar.
 */

internal class TopAppBarLeadingScopeWrapper(
    override val colors: TopAppBarColors,
    override val sizes: TopAppBarSizes
) : TopAppBarLeadingScope

/**
 * Display an icon button within the [TopAppBarLeadingScope].
 *
 * @param modifier The modifier to be applied to the icon button.
 * @param icon The painter to be used as the icon for the button.
 * @param onClick The lambda to be executed when the button is clicked.
 */
@Composable
fun TopAppBarLeadingScope.IconButton(
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
        IconButton(
            modifier = modifier,
            icon = icon,
            sizes = this@IconButton.sizes.leftIconButtonSizes,
            colors = this@IconButton.colors.leadingIconButtonColors,
            onClick = onClick
        )
    }
}

/**
 * Display an avatar within the [TopAppBarLeadingScope].
 *
 * @param modifier The modifier to be applied to the avatar.
 * @param avatarUrl The URI of the avatar image to be displayed.
 * @param onClick The lambda to be executed when the avatar is clicked.
 */
@Composable
fun TopAppBarLeadingScope.Avatar(
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
            colors = this@Avatar.colors.leadingAvatarColors,
            onClick = onClick
        )
    }
}