package io.github.madmaximuus.persian.chips.suggestion

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.icon.IconSizes

class SuggestionChipLeadingScope(
    private val iconSizes: IconSizes,
    private val iconColor: Color,
) {

    @Composable
    fun Icon(
        modifier: Modifier = Modifier,
        painter: Painter,
    ) {
        Box(
            modifier = modifier
                .padding(horizontal = PersianTheme.spacing.size8)
        ) {
            Icon(
                painter = painter,
                sizes = iconSizes,
                tint = iconColor
            )
        }
    }
}