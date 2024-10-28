package io.github.madmaximuus.persian.segmentedButton

import androidx.compose.foundation.layout.Arrangement
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
    val sizes: SegmentedButtonSizes
    val colors: SegmentedButtonColors
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
    override val sizes: SegmentedButtonSizes,
    override val colors: SegmentedButtonColors,
    override val enabled: Boolean,
) : SingleChoiceSegmentedButtonRowScope, RowScope by scope

/**
 * A Layout to correctly position and size [SingleChoiceSegmentedButtonRowScope.StartSegment], [SingleChoiceSegmentedButtonRowScope.MiddleSegment], [SingleChoiceSegmentedButtonRowScope.EndSegment] in a Row. It handles overlapping items
 * so that strokes of the item are correctly on top of each other. [SingleChoiceSegmentedButtonRow]
 * is used when the selection only allows one value, for correct semantics.
 *
 * @param modifier the [Modifier] to be applied to this row
 * @param content the content of this Segmented Button Row, typically a sequence of
 * [SingleChoiceSegmentedButtonRowScope.StartSegment], [SingleChoiceSegmentedButtonRowScope.MiddleSegment], [SingleChoiceSegmentedButtonRowScope.EndSegment]
 * @param colors [SegmentedButtonColors] that will be used to resolve the colors used for this
 * @param sizes [SegmentedButtonSizes] that will be used to resolve the sizes used for this
 * @param enabled controls the enabled state of this button. When `false`, this component will not
 *   respond to user input, and it will appear visually disabled and disabled to accessibility
 *   services.
 */
@Composable
fun SingleChoiceSegmentedButtonRow(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    sizes: SegmentedButtonSizes = SegmentedButtonDefaults.smallSizes(),
    colors: SegmentedButtonColors = SegmentedButtonDefaults.colors(),
    content: @Composable SingleChoiceSegmentedButtonRowScope.() -> Unit
) {
    Row(
        modifier = modifier
            .selectableGroup()
            .height(sizes.height)
            .width(IntrinsicSize.Min),
        horizontalArrangement = Arrangement.spacedBy(-sizes.border),
        verticalAlignment = Alignment.CenterVertically
    ) {
        val scope =
            remember(sizes, colors, enabled) {
                SingleChoiceSegmentedButtonScopeWrapper(
                    this,
                    sizes,
                    colors,
                    enabled
                )
            }
        scope.content()
    }
}