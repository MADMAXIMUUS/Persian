package io.github.madmaximuus.persian.chip

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.PlatformTextStyle
import io.github.madmaximuus.persian.foundation.PersianState38
import io.github.madmaximuus.persian.surface.Surface
import io.github.madmaximuus.persian.text.Text

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
 * @param leading The optional leading content of the chip in [ChipLeadingScope].
 * @param colors The colors to be used for the chip.
 * @param sizes The sizes to be used for the chip.
 * @param elevation The elevation to be used for the chip.
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this chip. You can use this to change the chip's appearance or
 *   preview the chip in different states. Note that if `null` is provided, interactions will still
 *   happen internally.
 */
@Composable
fun Chip(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    leading: (@Composable ChipLeadingScope.() -> Unit)? = null,
    colors: ChipColors = ChipDefaults.colors(),
    sizes: ChipSizes = ChipDefaults.mediumSizes(),
    elevation: ChipElevation = ChipDefaults.chipElevation(),
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
    leading = leading,
    colors = colors,
    sizes = sizes,
    elevation = elevation,
    interactionSource = interactionSource
)

/**
 * Base composable function to implement chip
 *
 * @param modifier The modifier to be applied to the chip.
 * @param onClick The callback to be invoked when the chip is clicked.
 * @param enabled Whether the chip is enabled or disabled.
 * @param label The text to be displayed on the chip.
 * @param leading The optional leading content of the chip.
 * @param colors The colors to be used for the chip.
 * @param sizes The sizes to be used for the chip.
 * @param elevation The elevation to be used for the chip.
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this chip. You can use this to change the chip's appearance or
 *   preview the chip in different states. Note that if `null` is provided, interactions will still
 *   happen internally.
 */
@Composable
private fun BaseChip(
    modifier: Modifier,
    onClick: () -> Unit,
    enabled: Boolean,
    label: String,
    leading: (@Composable ChipLeadingScope.() -> Unit)?,
    colors: ChipColors,
    sizes: ChipSizes,
    elevation: ChipElevation,
    interactionSource: MutableInteractionSource,
) {
    Surface(
        onClick = onClick,
        modifier = modifier
            .semantics { role = Role.Button }
            .height(sizes.height)
            .graphicsLayer {
                alpha = if (enabled) 1f else PersianState38
            },
        enabled = enabled,
        shape = sizes.shape,
        color = colors.containerColor,
        border = BorderStroke(
            sizes.borderWidth,
            colors.borderColor
        ),
        tonalElevation = elevation.elevation,
        shadowElevation = elevation.shadowElevation(
            enabled = enabled,
            interactionSource = interactionSource
        ).value,
        interactionSource = interactionSource,
    ) {
        val padding = if (leading != null) PaddingValues(
            end = sizes.contentPadding.calculateEndPadding(LocalLayoutDirection.current)
        )
        else sizes.contentPadding
        Row(
            modifier = Modifier
                .height(sizes.height)
                .padding(padding),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(sizes.contentSpacing)
        ) {
            leading?.let {
                val scope = remember(enabled, colors, sizes) {
                    ChipLeadingScopeWrapper(
                        sizes = sizes,
                        colors = colors,
                        enabled = enabled
                    )
                }
                scope.it()
            }
            Text(
                text = label,
                color = colors.labelColor,
                style = sizes.labelStyle.copy(
                    platformStyle = PlatformTextStyle(
                        includeFontPadding = false
                    )
                ),
            )
        }
    }
}