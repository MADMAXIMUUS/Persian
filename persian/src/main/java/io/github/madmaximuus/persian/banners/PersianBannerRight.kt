package io.github.madmaximuus.persian.banners

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.LocalContentColor
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.iconBox.Icon
import io.github.madmaximuus.persian.iconBox.IconDefaults
import io.github.madmaximuus.persianSymbols.chevronRight.base.ChevronRight
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.xmark.base.XMark

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
        Icon(
            modifier = modifier
                .padding(0.dp)
                .clip(PersianTheme.shapes.shape4)
                .clickable { onClick() },
            painter = icon ?: rememberVectorPainter(image = PersianSymbols.Default.XMark),
            contentDescription = contentDescription,
            size = IconDefaults.size24()
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
        Icon(
            modifier = modifier
                .padding(0.dp)
                .clip(PersianTheme.shapes.shape4)
                .clickable { onClick() },
            painter = icon ?: rememberVectorPainter(image = PersianSymbols.Default.ChevronRight),
            contentDescription = contentDescription
        )
    }
}