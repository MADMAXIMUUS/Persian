package io.github.madmaximuus.persian.chips.input

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.semantics.Role
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.icon.IconSizes
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.xmark.base.XMark

class InputChipTrailingScope(
    val enabled: Boolean,
    val iconColor: Color,
    val iconSizes: IconSizes
) {

    @Composable
    fun Icon(
        modifier: Modifier = Modifier,
        icon: Painter = rememberVectorPainter(image = PersianSymbols.Default.XMark),
        onClick: () -> Unit
    ) {
        Box(
            modifier = modifier
                .padding(horizontal = PersianTheme.spacing.size8)
        ) {
            Icon(
                Modifier
                    .clip(PersianTheme.shapes.shape4)
                    .clickable(
                        enabled,
                        onClick = onClick,
                        role = Role.Image
                    ),
                painter = icon,
                sizes = iconSizes,
                tint = iconColor,
            )
        }
    }
}