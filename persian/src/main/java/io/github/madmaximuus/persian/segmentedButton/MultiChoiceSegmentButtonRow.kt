package io.github.madmaximuus.persian.segmentedButton

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * A scope interface for a row of multi-choice segmented buttons.
 *
 * This interface extends [RowScope] and provides additional properties for configuring the appearance and behavior
 * of segmented buttons within a row.
 *
 * @property sizes The sizes configuration for the segmented buttons.
 * @property colors The colors configuration for the segmented buttons.
 * @property enabled A boolean indicating whether the segmented buttons are enabled.
 */
interface MultiChoiceSegmentedButtonRowScope : RowScope {
    val sizes: SegmentedButtonSizes
    val colors: SegmentedButtonColors
    val enabled: Boolean
}

/**
 * A wrapper class that implements [MultiChoiceSegmentedButtonRowScope] by delegating to a [RowScope].
 *
 * This class is used to wrap a [RowScope] instance and provide additional properties required by
 * [MultiChoiceSegmentedButtonRowScope], such as sizes, colors, and enabled state.
 *
 * @param scope The [RowScope] instance to delegate to.
 * @param sizes The sizes configuration for the segmented buttons.
 * @param colors The colors configuration for the segmented buttons.
 * @param enabled A boolean indicating whether the segmented buttons are enabled.
 */
private class MultiChoiceSegmentedButtonScopeWrapper(
    scope: RowScope,
    override val sizes: SegmentedButtonSizes,
    override val colors: SegmentedButtonColors,
    override val enabled: Boolean
) : MultiChoiceSegmentedButtonRowScope, RowScope by scope

/**
 * A segmented button is useful for allowing users to select one option from a set of related choices,
 * providing a clear and intuitive interface for making multiple-selection decisions. It offers
 * a straightforward and effective method for capturing user preferences, making it an essential tool
 * for enhancing user experience and data collection.
 *
 * @param modifier The [Modifier] to be applied to the row.
 * @param enabled A boolean indicating whether the segmented buttons are enabled.
 * @param sizes The sizes configuration for the segmented buttons.
 * @param colors The colors configuration for the segmented buttons.
 * @param content A composable lambda that defines the content of the row within the [MultiChoiceSegmentedButtonRowScope].
 */
@Composable
fun MultiChoiceSegmentedButtonRow(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    sizes: SegmentedButtonSizes = SegmentedButtonDefaults.smallSizes(),
    colors: SegmentedButtonColors = SegmentedButtonDefaults.colors(),
    content: @Composable MultiChoiceSegmentedButtonRowScope.() -> Unit
) {
    Row(
        modifier = modifier
            .height(sizes.height)
            .widthIn(min = 90.dp),
        horizontalArrangement = Arrangement.spacedBy(-sizes.border),
        verticalAlignment = Alignment.CenterVertically
    ) {
        val scope = remember(sizes, colors, enabled) {
            MultiChoiceSegmentedButtonScopeWrapper(
                this,
                sizes,
                colors,
                enabled
            )
        }
        scope.content()
    }
}