package io.github.madmaximuus.persian.chip.toggleable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
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
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianState38
import io.github.madmaximuus.persian.surface.Surface
import io.github.madmaximuus.persian.text.Text

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
fun ToggleableChip(
    label: String,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    leading: (@Composable ToggleableChipLeadingScope.() -> Unit)? = null,
    trailing: (@Composable ToggleableChipTrailingScope.() -> Unit)? = null,
    colors: ToggleableChipColors = ToggleableChipDefaults.chipColors(),
    elevation: ToggleableChipElevation = ToggleableChipDefaults.chipElevation(),
    sizes: ToggleableChipSizes = ToggleableChipDefaults.mediumSizes(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) = BaseToggleableChip(
    selected = selected,
    modifier = modifier
        .graphicsLayer {
            alpha = if (enabled) 1f
            else PersianState38
        },
    onClick = onClick,
    enabled = enabled,
    label = label,
    colors = colors,
    elevation = elevation,
    sizes = sizes,
    leading = leading,
    trailing = trailing,
    interactionSource = interactionSource
)

/**
 * Base composable function to implement chip
 *
 * @param selected Whether the chip is selected or not.
 * @param modifier The modifier to be applied to the chip.
 * @param onClick The callback to be invoked when the chip is clicked.
 * @param enabled Whether the chip is enabled or disabled.
 * @param label The text to be displayed on the chip.
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
internal fun BaseToggleableChip(
    selected: Boolean,
    modifier: Modifier,
    onClick: () -> Unit,
    enabled: Boolean,
    label: String,
    leading: (@Composable ToggleableChipLeadingScope.() -> Unit)?,
    trailing: (@Composable ToggleableChipTrailingScope.() -> Unit)?,
    colors: ToggleableChipColors,
    elevation: ToggleableChipElevation,
    sizes: ToggleableChipSizes,
    interactionSource: MutableInteractionSource
) {
    Surface(
        selected = selected,
        onClick = onClick,
        modifier = modifier
            .semantics { role = Role.Checkbox }
            .height(sizes.height)
            .graphicsLayer {
                alpha = if (enabled) 1f else PersianState38
            },
        enabled = enabled,
        shape = sizes.shape,
        color = colors.containerColor(selected),
        border = BorderStroke(
            sizes.borderWidth(selected),
            colors.borderColor(selected)
        ),
        tonalElevation = elevation.elevation,
        shadowElevation = elevation.shadowElevation(
            enabled = enabled,
            interactionSource = interactionSource
        ).value,
        interactionSource = interactionSource,
    ) {
        val padding = when {
            leading != null && trailing != null -> PaddingValues(horizontal = 0.dp)
            leading == null && trailing != null -> PaddingValues(
                start = sizes.contentPadding.calculateStartPadding(LocalLayoutDirection.current),
            )

            leading != null -> PaddingValues(
                end = sizes.contentPadding.calculateEndPadding(LocalLayoutDirection.current)
            )

            else -> sizes.contentPadding
        }
        Row(
            modifier = Modifier
                .height(sizes.height)
                .padding(padding),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(sizes.contentSpacing)
        ) {
            leading?.let {
                val scope = remember(enabled, colors, sizes) {
                    ToggleableChipLeadingScopeWrapper(
                        sizes = sizes,
                        colors = colors,
                        selected = selected,
                    )
                }
                scope.it()
            }
            Text(
                text = label,
                color = colors.labelColor(selected),
                style = sizes.labelStyle.copy(platformStyle = PlatformTextStyle(includeFontPadding = false)),
            )
            trailing?.let {
                val scope = remember(enabled, colors, sizes) {
                    ToggleableChipTrailingScopeWrapper(
                        sizes = sizes,
                        colors = colors,
                        enabled = enabled,
                        selected = selected,
                    )
                }
                scope.it()
            }
        }
    }
}