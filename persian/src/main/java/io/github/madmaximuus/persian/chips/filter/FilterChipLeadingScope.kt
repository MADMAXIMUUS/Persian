package io.github.madmaximuus.persian.chips.filter

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import io.github.madmaximuus.persian.chips.founfation.SelectableChipColors
import io.github.madmaximuus.persian.chips.founfation.SelectableChipSizes
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persianSymbols.check.base.Check
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

interface FilterChipLeadingScope {
    val colors: SelectableChipColors
    val sizes: SelectableChipSizes
    val enabled: Boolean
    val selected: Boolean
}

internal class FilterChipLeadingScopeWrapper(
    override val colors: SelectableChipColors,
    override val sizes: SelectableChipSizes,
    override val enabled: Boolean,
    override val selected: Boolean
) : FilterChipLeadingScope

@Composable
fun FilterChipLeadingScope.Icon(
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
            sizes = sizes.leadingIconSizes,
            tint = colors.leadingIconContentColor(enabled, selected)
        )
    }
}