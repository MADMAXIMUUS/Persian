package io.github.madmaximuus.persian.topAppBar

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import io.github.madmaximuus.persian.avatarsAndImages.PersianAvatar
import io.github.madmaximuus.persian.avatarsAndImages.PersianAvatarDefaults
import io.github.madmaximuus.persian.foundation.icons
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.iconButtons.PersianIconButtonDefaults
import io.github.madmaximuus.persian.iconButtons.PersianTertiaryIconButton

sealed class PersianTopAppBarLeft {

    data class Navigation(
        val customIcon: Painter? = null,
        val onClick: () -> Unit
    ) : PersianTopAppBarLeft()

    data class Close(
        val customIcon: Painter? = null,
        val onClick: () -> Unit
    ) : PersianTopAppBarLeft()

    data class Avatar(
        val avatarUrl: String,
        val onClick: () -> Unit
    ) : PersianTopAppBarLeft()
}

@Composable
internal fun PersianTopAppBarLeftNavigation(
    modifier: Modifier = Modifier,
    icon: Painter = MaterialTheme.icons.arrowBack,
    onClick: () -> Unit
) {
    val colors = LocalPersianTopAppBarColors.current
    PersianTertiaryIconButton(
        modifier = modifier,
        icon = icon,
        colors = PersianIconButtonDefaults.tertiaryIconButtonColors(
            contentColor = colors.iconColor
        ),
        onClick = onClick
    )
}

@Composable
internal fun PersianTopAppBarLeftClose(
    icon: Painter = MaterialTheme.icons.close,
    onClick: () -> Unit
) {
    val colors = LocalPersianTopAppBarColors.current
    PersianTertiaryIconButton(
        icon = icon,
        colors = PersianIconButtonDefaults.tertiaryIconButtonColors(
            contentColor = colors.iconColor
        ),
        onClick = onClick
    )
}

@Composable
internal fun PersianTopAppBarLeftAvatar(
    image: String,
    onClick: () -> Unit
) {
    PersianAvatar(
        modifier = Modifier
            .padding(start = MaterialTheme.spacing.medium),
        imageUrl = image,
        size = PersianAvatarDefaults.size32(),
        onClick = onClick
    )
}