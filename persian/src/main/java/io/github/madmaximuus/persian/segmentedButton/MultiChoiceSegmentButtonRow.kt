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

/** Scope for the children of a [MultiChoiceSegmentedButtonRow] */
interface MultiChoiceSegmentedButtonRowScope : RowScope {
    val sizes: SegmentedButtonSizes
    val colors: SegmentedButtonColors
    val enabled: Boolean
}

private class MultiChoiceSegmentedButtonScopeWrapper(
    scope: RowScope,
    override val sizes: SegmentedButtonSizes,
    override val colors: SegmentedButtonColors,
    override val enabled: Boolean
) : MultiChoiceSegmentedButtonRowScope, RowScope by scope

@Composable
fun MultiChoiceSegmentedButtonRow(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    sizes: SegmentedButtonSizes = SegmentedButtonDefaults.smallSizes(),
    colors: SegmentedButtonColors = SegmentedButtonDefaults.colors(),
    content: @Composable MultiChoiceSegmentedButtonRowScope.() -> Unit
) {
    Row(
        modifier =
        modifier
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