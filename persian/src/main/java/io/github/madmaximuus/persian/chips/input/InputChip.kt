package io.github.madmaximuus.persian.chips.input

import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.chips.founfation.BaseSelectableChip
import io.github.madmaximuus.persian.chips.founfation.SelectableChipColors
import io.github.madmaximuus.persian.chips.founfation.SelectableChipElevation
import io.github.madmaximuus.persian.chips.founfation.SelectableChipSizes

/**
 * Chips help people enter information, make selections, filter content, or trigger actions. Chips
 * can show multiple interactive elements together in the same area, such as a list of selectable
 * movie times, or a series of email contacts.
 *
 * Input chips represent discrete pieces of information entered by a user.
 *
 * @param label The text to be displayed on the chip.
 * @param selected Whether the chip is selected or not.
 * @param onClick The callback to be invoked when the chip is clicked.
 * @param modifier The modifier to be applied to the chip.
 * @param enabled Whether the chip is enabled or disabled.
 * @param leading The optional leading content of the chip.
 * @param trailing The optional trailing content of the chip.
 * @param colors The colors to be used for the chip.
 * @param elevation The elevation to be used for the chip.
 * @param sizes The sizes to be used for the chip.
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this chip. You can use this to change the chip's appearance or
 *   preview the chip in different states. Note that if `null` is provided, interactions will still
 *   happen internally.
 */
@Composable
fun InputShip(
    label: String,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    leading: (@Composable InputChipLeadingScope.() -> Unit)? = null,
    trailing: (@Composable InputChipTrailingScope.() -> Unit)? = null,
    colors: SelectableChipColors = InputChipDefaults.chipColors(),
    elevation: SelectableChipElevation = InputChipDefaults.chipElevation(),
    sizes: SelectableChipSizes = InputChipDefaults.chipSizes(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) = BaseSelectableChip(
    selected = selected,
    modifier = modifier,
    onClick = onClick,
    enabled = enabled,
    label = label,
    colors = colors,
    elevation = elevation,
    sizes = sizes,
    leading = if (leading != null) {
        {
            val scope = remember(enabled, selected, colors, sizes) {
                InputChipLeadingScopeWrapper(
                    enabled = enabled,
                    selected = selected,
                    sizes = sizes,
                    colors = colors
                )
            }
            scope.leading()
        }
    } else null,
    trailing = if (trailing != null) {
        {
            val scope = remember(enabled, selected, colors, sizes) {
                InputChipTrailingScopeWrapper(
                    enabled = enabled,
                    selected = selected,
                    sizes = sizes,
                    colors = colors
                )
            }
            scope.trailing()
        }
    } else null,
    interactionSource = interactionSource
)