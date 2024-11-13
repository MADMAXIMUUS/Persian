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
import io.github.madmaximuus.persianSymbols.check.Check
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

/**
 * An interface that defines the scope for the leading content of a FilterChip.
 *
 * This interface provides access to the colors, sizes, enabled state, and selected state of the FilterChip,
 * allowing customization of the leading content based on these properties.
 *
 * @property colors The colors to be used for the chip.
 * @property sizes The sizes to be used for the chip.
 * @property enabled Whether the chip is enabled or disabled.
 * @property selected Whether the chip is selected or not.
 */
interface FilterChipLeadingScope {
    val colors: SelectableChipColors
    val sizes: SelectableChipSizes
    val enabled: Boolean
    val selected: Boolean
}

/**
 * An internal implementation of the [FilterChipLeadingScope] interface that wraps the colors, sizes,
 * enabled state, and selected state of a FilterChip.
 *
 * This class is used to provide a concrete implementation of the [FilterChipLeadingScope] interface,
 * allowing the leading content of a FilterChip to access the chip's properties.
 *
 * @param colors The colors to be used for the chip.
 * @param sizes The sizes to be used for the chip.
 * @param enabled Whether the chip is enabled or disabled.
 * @param selected Whether the chip is selected or not.
 */
internal class FilterChipLeadingScopeWrapper(
    override val colors: SelectableChipColors,
    override val sizes: SelectableChipSizes,
    override val enabled: Boolean,
    override val selected: Boolean
) : FilterChipLeadingScope

/**
 * Provides an icon within the leading scope of an [FilterChip].
 *
 * @param modifier The [Modifier] to be applied to the icon.
 * @param icon The [Painter] used to draw the icon when not selected.
 * @param selectedIcon The [Painter] used to draw the icon when selected.
 */
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