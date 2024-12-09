package io.github.madmaximuus.persian.chips.input

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.semantics.Role
import io.github.madmaximuus.persian.chips.founfation.SelectableChipColors
import io.github.madmaximuus.persian.chips.founfation.SelectableChipSizes
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols
import io.github.madmaximuus.persianSymbols.xmark.XMark

/**
 * An interface that defines the scope for the trailing content of an InputChip.
 *
 * This interface provides access to the colors, sizes, enabled state, and selected state of the InputChip,
 * allowing customization of the trailing content based on these properties.
 *
 * @property colors The colors to be used for the chip.
 * @property sizes The sizes to be used for the chip.
 * @property enabled Whether the chip is enabled or disabled.
 * @property selected Whether the chip is selected or not.
 */
interface InputChipTrailingScope {
    val colors: SelectableChipColors
    val sizes: SelectableChipSizes
    val enabled: Boolean
    val selected: Boolean
}

/**
 * An internal implementation of the [InputChipTrailingScope] interface that wraps the colors, sizes,
 * enabled state, and selected state of an InputChip.
 *
 * This class is used to provide a concrete implementation of the [InputChipTrailingScope] interface,
 * allowing the trailing content of an InputChip to access the chip's properties.
 *
 * @param colors The colors to be used for the chip.
 * @param sizes The sizes to be used for the chip.
 * @param enabled Whether the chip is enabled or disabled.
 * @param selected Whether the chip is selected or not.
 */
internal class InputChipTrailingScopeWrapper(
    override val colors: SelectableChipColors,
    override val sizes: SelectableChipSizes,
    override val enabled: Boolean,
    override val selected: Boolean
) : InputChipTrailingScope

/**
 * Provides an icon within the trailing scope of an [InputShip].
 *
 * @param modifier The modifier to be applied to the icon.
 * @param icon The painter to be used for the icon.
 * @param onClick Called when this chip is clicked.
 */
@Composable
fun InputChipTrailingScope.Icon(
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
                    enabled = enabled,
                    onClick = onClick,
                    role = Role.Button
                ),
            painter = icon,
            sizes = sizes.trailingIconSizes,
            tint = colors.trailingIconContentColor(selected),
        )
    }
}