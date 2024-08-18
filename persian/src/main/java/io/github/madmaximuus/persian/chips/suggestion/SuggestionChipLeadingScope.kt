package io.github.madmaximuus.persian.chips.suggestion

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import io.github.madmaximuus.persian.chips.founfation.ChipColors
import io.github.madmaximuus.persian.chips.founfation.ChipSizes
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon

interface SuggestionChipLeadingScope {
    val colors: ChipColors
    val sizes: ChipSizes
    val enabled: Boolean
}

internal class SuggestionChipLeadingScopeWrapper(
    override val colors: ChipColors,
    override val sizes: ChipSizes,
    override val enabled: Boolean
) : SuggestionChipLeadingScope

@Composable
fun SuggestionChipLeadingScope.Icon(
    modifier: Modifier = Modifier,
    painter: Painter,
) {
    Box(
        modifier = modifier
            .padding(horizontal = PersianTheme.spacing.size8)
    ) {
        Icon(
            painter = painter,
            sizes = sizes.leadingIconSizes,
            tint = colors.leadingIconContentColor(enabled)
        )
    }
}