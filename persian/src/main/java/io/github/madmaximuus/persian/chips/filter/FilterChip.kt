package io.github.madmaximuus.persian.chips.filter

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
 * Filter chips use tags or descriptive words to filter content. They can be a good alternative to
 * toggle buttons or checkboxes.
 *
 * Tapping on a filter chip toggles its selection state. A selection state [leading] can be
 * provided (e.g. a checkmark) to be appended at the starting edge of the chip's label.
 *
 * @param label The text to be displayed on the chip.
 * @param selected Whether the chip is selected or not.
 * @param onClick The callback to be invoked when the chip is clicked.
 * @param enabled Whether the chip is enabled or disabled.
 * @param leading An optional leading content of the chip.
 * @param trailing An optional trailing content of the chip.
 * @param colors The colors to be used for the chip.
 * @param sizes The sizes to be used for the chip.
 * @param elevation The elevation to be used for the chip.
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this chip. You can use this to change the chip's appearance or
 *   preview the chip in different states. Note that if `null` is provided, interactions will still
 *   happen internally.
 */
@Composable
fun FilterChip(
    label: String,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    leading: (@Composable FilterChipLeadingScope.() -> Unit)? = null,
    trailing: (@Composable FilterChipTrailingScope.() -> Unit)? = null,
    colors: SelectableChipColors = FilterChipDefaults.chipColors(),
    sizes: SelectableChipSizes = FilterChipDefaults.chipSizes(),
    elevation: SelectableChipElevation = FilterChipDefaults.chipElevation(),
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
                FilterChipLeadingScopeWrapper(
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
                FilterChipTrailingScopeWrapper(
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