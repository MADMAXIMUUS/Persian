package io.github.madmaximuus.persian.banner

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.iconButton.IconButtonDefaults
import io.github.madmaximuus.persian.iconButton.TertiaryIconButton
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
        onClick: () -> Unit
    ) {
        TertiaryIconButton(
            modifier = modifier,
            icon = icon,
            sizes = IconButtonDefaults.smallSizes(),
            colors = IconButtonDefaults.tertiaryIconButtonColors(
                contentColor = iconColor
            ),
            onClick = onClick
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
            sizes = IconDefaults.size24(),
            contentDescription = contentDescription,
            tint = iconColor
        )
    }
}