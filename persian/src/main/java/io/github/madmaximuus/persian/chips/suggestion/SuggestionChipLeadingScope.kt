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

/**
 * An interface that defines the scope for the leading content of a SuggestionChip.
 *
 * This interface provides access to the colors, sizes, and enabled state of the SuggestionChip,
 * allowing customization of the leading content based on these properties.
 *
 * @property colors The colors to be used for the chip.
 * @property sizes The sizes to be used for the chip.
 * @property enabled Whether the chip is enabled or disabled.
 */
interface SuggestionChipLeadingScope {
    val colors: ChipColors
    val sizes: ChipSizes
    val enabled: Boolean
}

/**
 * An internal implementation of the [SuggestionChipLeadingScope] interface that wraps the colors, sizes,
 * and enabled state of a SuggestionChip.
 *
 * This class is used to provide a concrete implementation of the [SuggestionChipLeadingScope] interface,
 * allowing the leading content of a SuggestionChip to access the chip's properties.
 *
 * @param colors The colors to be used for the chip.
 * @param sizes The sizes to be used for the chip.
 * @param enabled Whether the chip is enabled or disabled.
 */
internal class SuggestionChipLeadingScopeWrapper(
    override val colors: ChipColors,
    override val sizes: ChipSizes,
    override val enabled: Boolean
) : SuggestionChipLeadingScope

/**
 * Provides an icon within the trailing scope of an [SuggestionChip].
 *
 * @param modifier The modifier to be applied to the icon.
 * @param painter The painter to be used for the icon.
 */
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