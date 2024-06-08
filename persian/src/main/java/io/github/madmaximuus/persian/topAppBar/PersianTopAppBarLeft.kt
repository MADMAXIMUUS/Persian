package io.github.madmaximuus.persian.topAppBar

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import io.github.madmaximuus.persian.avatarsAndImages.PersianAvatar
import io.github.madmaximuus.persian.avatarsAndImages.PersianAvatarsDefaults
import io.github.madmaximuus.persian.foundation.spacing
import io.github.madmaximuus.persian.iconButtons.PersianIconButtonDefaults
import io.github.madmaximuus.persian.iconButtons.PersianTertiaryIconButton
import io.github.madmaximuus.persianSymbols.arrow.left.base.ArrowLeft
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.xmark.base.XMark

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
    icon: Painter = rememberVectorPainter(image = PersianSymbols.Default.ArrowLeft),
    onClick: () -> Unit
) {
    val colors = LocalPersianTopAppBarColors.current
    PersianTertiaryIconButton(
        modifier = modifier,
        icon = icon,
        sizes = PersianIconButtonDefaults.mediumSizes(),
        colors = PersianIconButtonDefaults.tertiaryIconButtonColors(
            contentColor = colors.iconColor
        ),
        onClick = onClick
    )
}

@Composable
internal fun PersianTopAppBarLeftClose(
    icon: Painter = rememberVectorPainter(image = PersianSymbols.Default.XMark),
    onClick: () -> Unit
) {
    val colors = LocalPersianTopAppBarColors.current
    PersianTertiaryIconButton(
        icon = icon,
        sizes = PersianIconButtonDefaults.mediumSizes(),
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
        size = PersianAvatarsDefaults.size32(),
        onClick = onClick
    )
}