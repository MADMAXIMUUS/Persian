package io.github.madmaximuus.persian.segmentedControls.button

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import io.github.madmaximuus.persian.foundation.PersianState38


/**
 * A scope interface for a row of single-choice segmented buttons.
 *
 * This interface extends [RowScope] and provides additional properties for configuring the appearance and behavior
 * of segmented buttons within a row.
 *
 * @property sizes The sizes configuration for the segmented buttons.
 * @property colors The colors configuration for the segmented buttons.
 * @property enabled A boolean indicating whether the segmented buttons are enabled.
 */
interface SingleChoiceSegmentedButtonRowScope : RowScope {
    val sizes: SegmentedButtonRowSizes
    val colors: SegmentedButtonRowColors
    val enabled: Boolean
}

/**
 * A wrapper class that implements [SingleChoiceSegmentedButtonRowScope] by delegating to a [RowScope].
 *
 * This class is used to wrap a [RowScope] instance and provide additional properties required by
 * [SingleChoiceSegmentedButtonRowScope], such as sizes, colors, and enabled state.
 *
 * @param scope The [RowScope] instance to delegate to.
 * @param sizes The sizes configuration for the segmented buttons.
 * @param colors The colors configuration for the segmented buttons.
 * @param enabled A boolean indicating whether the segmented buttons are enabled.
 */
private class SingleChoiceSegmentedButtonScopeWrapper(
    scope: RowScope,
    override val sizes: SegmentedButtonRowSizes,
    override val colors: SegmentedButtonRowColors,
    override val enabled: Boolean,
) : SingleChoiceSegmentedButtonRowScope, RowScope by scope

/**
 * A segmented button is useful for allowing users to select one option from a set of related choices,
 * providing a clear and intuitive interface for making single-selection decisions. It offers
 * a straightforward and effective method for capturing user preferences, making it an essential tool
 * for enhancing user experience and data collection.
 *
 * @param modifier the [Modifier] to be applied to this row
 * @param content the content of this Segmented Button Row, typically a sequence of [SingleChoiceSegmentedButtonRowScope.Segment]
 * @param colors [SegmentedButtonRowColors] that will be used to resolve the colors used for this
 * @param sizes [SegmentedButtonRowSizes] that will be used to resolve the sizes used for this
 * @param enabled controls the enabled state of this button. When `false`, this component will not
 *   respond to user input, and it will appear visually disabled and disabled to accessibility
 *   services.
 */
@Composable
fun SingleChoiceSegmentedButtonRow(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    sizes: SegmentedButtonRowSizes = SegmentedButtonDefaults.smallSizes(),
    colors: SegmentedButtonRowColors = SegmentedButtonDefaults.colors(),
    content: @Composable SingleChoiceSegmentedButtonRowScope.() -> Unit
) {
    Row(
        modifier = modifier
            .clip(sizes.shape)
            .background(colors.containerColor, sizes.shape)
            .selectableGroup()
            .height(sizes.height)
            .width(IntrinsicSize.Min)
            .graphicsLayer {
                alpha = if (enabled) 1f
                else PersianState38
            },
        verticalAlignment = Alignment.CenterVertically
    ) {
        val scope =
            remember(sizes, colors, enabled) {
                SingleChoiceSegmentedButtonScopeWrapper(
                    scope = this,
                    sizes = sizes,
                    colors = colors,
                    enabled = enabled
                )
            }
        scope.content()
    }
}