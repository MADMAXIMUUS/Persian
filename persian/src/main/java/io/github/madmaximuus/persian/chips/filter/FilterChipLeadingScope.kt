package io.github.madmaximuus.persian.chips.filter

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.icon.IconSize
import io.github.madmaximuus.persianSymbols.check.base.Check
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

class FilterChipLeadingScope(
    val enabled: Boolean,
    val selected: Boolean,
    val iconColor: Color,
    val iconSize: IconSize
) {

    @Composable
    fun Icon(
        modifier: Modifier = Modifier,
        icon: Painter,
        selectedIcon: Painter = rememberVectorPainter(image = PersianSymbols.Default.Check)
    ) {
        Box(
            modifier = modifier
                .padding(horizontal = PersianTheme.spacing.size8)
        ) {
            Icon(
                painter = if (selected) selectedIcon else icon,
                size = iconSize,
                tint = iconColor
            )
        }
    }
}