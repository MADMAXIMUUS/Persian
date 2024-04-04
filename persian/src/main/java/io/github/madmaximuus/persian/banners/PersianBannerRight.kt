package io.github.madmaximuus.persian.banners

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.icons
import io.github.madmaximuus.persian.iconBox.PersianIconBox
import io.github.madmaximuus.persian.iconBox.PersianIconBoxDefaults

sealed class PersianBannerRight {
    data class Close(
        val customIcon: Painter? = null,
        val onClick: () -> Unit
    ) : PersianBannerRight()

    data class Open(
        val customIcon: Painter? = null,
        val onClick: () -> Unit
    ) : PersianBannerRight()
}

@Composable
internal fun PersianBannerRightClose(
    modifier: Modifier = Modifier,
    icon: Painter?,
    contentDescription: String,
    iconColor: Color,
    onClick: () -> Unit
) {
    CompositionLocalProvider(LocalContentColor provides iconColor) {
        PersianIconBox(
            modifier = modifier
                .padding(0.dp)
                .clip(MaterialTheme.shapes.small)
                .clickable { onClick() },
            icon = icon ?: MaterialTheme.icons.close,
            contentDescription = contentDescription,
            size = PersianIconBoxDefaults.size24()
        )
    }
}

@Composable
internal fun PersianBannerRightOpen(
    modifier: Modifier = Modifier,
    icon: Painter?,
    contentDescription: String,
    iconColor: Color,
    onClick: () -> Unit
) {
    CompositionLocalProvider(LocalContentColor provides iconColor) {
        PersianIconBox(
            modifier = modifier
                .padding(0.dp)
                .clip(MaterialTheme.shapes.small)
                .clickable { onClick() },
            icon = icon ?: MaterialTheme.icons.chevronRight,
            contentDescription = contentDescription,
            size = PersianIconBoxDefaults.size24()
        )
    }
}