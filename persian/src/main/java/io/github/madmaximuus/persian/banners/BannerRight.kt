package io.github.madmaximuus.persian.banners

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persianSymbols.chevronRight.base.ChevronRight
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.xmark.base.XMark

@Stable
class BannerRightScope(
    private val iconColor: Color
) {

    @Composable
    fun Close(
        modifier: Modifier = Modifier,
        icon: Painter = rememberVectorPainter(image = PersianSymbols.Default.XMark),
        contentDescription: String? = null,
        onClick: () -> Unit
    ) {
        Icon(
            modifier = modifier
                .padding(0.dp)
                .clip(PersianTheme.shapes.shape4)
                .clickable { onClick() },
            painter = icon,
            contentDescription = contentDescription,
            size = IconDefaults.size24(),
            tint = iconColor
        )
    }

    @Composable
    fun Open(
        modifier: Modifier = Modifier,
        icon: Painter = rememberVectorPainter(image = PersianSymbols.Default.ChevronRight),
        contentDescription: String? = null,
    ) {
        Icon(
            modifier = modifier
                .clip(PersianTheme.shapes.shape4),
            painter = icon,
            size = IconDefaults.size24(),
            contentDescription = contentDescription,
            tint = iconColor
        )
    }
}