package io.github.madmaximuus.persian.chips.assist

import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.chips.founfation.BaseChip
import io.github.madmaximuus.persian.chips.founfation.ChipColors
import io.github.madmaximuus.persian.chips.founfation.ChipElevation
import io.github.madmaximuus.persian.chips.founfation.ChipSizes

/**
 * Chips help people enter information, make selections, filter content, or trigger actions. Chips
 * can show multiple interactive elements together in the same area, such as a list of selectable
 * movie times, or a series of email contacts.
 *
 * Assist chips represent smart or automated actions that can span multiple apps, such as opening a
 * calendar event from the home screen. Assist chips function as though the user asked an assistant
 * to complete the action. They should appear dynamically and contextually in a UI.
 *
 * @param label The text to be displayed on the chip.
 * @param onClick The callback to be invoked when the chip is clicked.
 * @param modifier The modifier to be applied to the chip.
 * @param enabled Whether the chip is enabled or disabled.
 * @param leading The optional leading content of the chip in [AssistChipLeadingScope].
 * @param colors The colors to be used for the chip.
 * @param sizes The sizes to be used for the chip.
 * @param elevation The elevation to be used for the chip.
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this chip. You can use this to change the chip's appearance or
 *   preview the chip in different states. Note that if `null` is provided, interactions will still
 *   happen internally.
 */
@Composable
fun AssistChip(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    leading: (@Composable AssistChipLeadingScope.() -> Unit)? = null,
    colors: ChipColors = AssistChipDefaults.chipColors(),
    sizes: ChipSizes = AssistChipDefaults.chipSizes(),
    elevation: ChipElevation = AssistChipDefaults.chipElevation(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) = BaseChip(
    modifier = modifier,
    onClick = onClick,
    enabled = enabled,
    label = label,
    leading = if (leading != null) {
        {
            val scope = remember(enabled, colors, sizes) {
                AssistChipLeadingScopeWrapper(
                    sizes = sizes,
                    colors = colors,
                    enabled = enabled
                )
            }
            scope.leading()
        }
    } else null,
    trailing = null,
    colors = colors,
    sizes = sizes,
    elevation = elevation,
    interactionSource = interactionSource
)
