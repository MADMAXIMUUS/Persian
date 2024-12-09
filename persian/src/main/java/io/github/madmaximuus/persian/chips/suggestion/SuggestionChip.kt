package io.github.madmaximuus.persian.chips.suggestion

import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import io.github.madmaximuus.persian.chips.founfation.BaseChip
import io.github.madmaximuus.persian.chips.founfation.ChipColors
import io.github.madmaximuus.persian.chips.founfation.ChipElevation
import io.github.madmaximuus.persian.chips.founfation.ChipSizes
import io.github.madmaximuus.persian.foundation.PersianState38

/**
 * Chips help people enter information, make selections, filter content, or trigger actions. Chips
 * can show multiple interactive elements together in the same area, such as a list of selectable
 * movie times, or a series of email contacts.
 *
 * Suggestion chips help narrow a user's intent by presenting dynamically generated suggestions,
 * such as possible responses or search filters.
 *
 * @param label The text to be displayed on the chip.
 * @param onClick Called when this chip is clicked.
 * @param modifier The modifier to be applied to the chip.
 * @param enabled Whether the chip is enabled or disabled.
 * @param leading The optional leading content of the chip.
 * @param colors The colors to be used for the chip.
 * @param sizes The sizes to be used for the chip.
 * @param elevation The elevation to be used for the chip.
 * @param interactionSource An optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this chip. You can use this to change the chip's appearance or
 *   preview the chip in different states. Note that if `null` is provided, interactions will still
 *   happen internally.
 */
@Composable
fun SuggestionChip(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    leading: (@Composable SuggestionChipLeadingScope.() -> Unit)?,
    colors: ChipColors = SuggestionChipDefaults.chipColors(),
    sizes: ChipSizes = SuggestionChipDefaults.chipSizes(),
    elevation: ChipElevation = SuggestionChipDefaults.chipElevation(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) = BaseChip(
    modifier = modifier
        .graphicsLayer {
            alpha = if (enabled) 1f
            else PersianState38
        },
    onClick = onClick,
    enabled = enabled,
    label = label,
    colors = colors,
    sizes = sizes,
    elevation = elevation,
    interactionSource = interactionSource,
    leading = if (leading != null) {
        {
            val scope = remember(colors, sizes) {
                SuggestionChipLeadingScopeWrapper(
                    sizes = sizes,
                    colors = colors
                )
            }
            scope.leading()
        }
    } else null,
    trailing = null
)