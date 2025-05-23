package io.github.madmaximuus.persian.foundation

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.LayoutModifier
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode
import androidx.compose.ui.node.LayoutModifierNode
import androidx.compose.ui.node.ModifierNodeElement
import androidx.compose.ui.node.currentValueOf
import androidx.compose.ui.platform.InspectorInfo
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import kotlin.math.roundToInt


/**
 * Reserves at least 48.dp in size to disambiguate touch interactions if the element would measure
 * smaller.
 *
 * https://m3.material.io/foundations/accessible-design/accessibility-basics#28032e45-c598-450c-b355-f9fe737b1cd8
 *
 * This uses the Material recommended minimum size of 48.dp x 48.dp, which may not the same as the
 * system enforced minimum size. The minimum clickable / touch target size (48.dp by default) is
 * controlled by the system via ViewConfiguration` and automatically expanded at the touch input layer.
 *
 * This modifier is not needed for touch target expansion to happen. It only affects layout, to make
 * sure there is adequate space for touch target expansion.
 */
@Stable
fun Modifier.minimumInteractiveComponentSize(): Modifier = this then MinimumInteractiveModifier

internal object MinimumInteractiveModifier :
    ModifierNodeElement<MinimumInteractiveModifierNode>() {

    override fun create(): MinimumInteractiveModifierNode = MinimumInteractiveModifierNode()

    override fun update(node: MinimumInteractiveModifierNode) {}

    override fun InspectorInfo.inspectableProperties() {
        name = "minimumInteractiveComponentSize"
        properties["README"] = "Reserves at least 48.dp in size to disambiguate touch " +
                "interactions if the element would measure smaller"
    }

    override fun hashCode(): Int = System.identityHashCode(this)
    override fun equals(other: Any?) = (other === this)
}

/**
 * An internal class that represents a modifier node for enforcing minimum interactive component sizes.
 *
 * This class extends [Modifier.Node], [CompositionLocalConsumerModifierNode], and [LayoutModifierNode]
 * to provide a custom layout behavior that ensures the component meets the minimum interactive size requirements.
 *
 * @property minimumInteractiveComponentSize The minimum size required for the interactive component.
 * @property isAttached Indicates whether the modifier node is currently attached.
 * @property currentValueOf A function to retrieve the current value of a composition local.
 * @property LocalMinimumInteractiveComponentEnforcement A composition local that determines whether the minimum
 * interactive component enforcement is active.
 */
internal class MinimumInteractiveModifierNode :
    Modifier.Node(),
    CompositionLocalConsumerModifierNode,
    LayoutModifierNode {

    /**
     * Measures the given [measurable] within the provided [constraints] and enforces the minimum interactive
     * component size if the enforcement is active.
     *
     * @param measurable The measurable object to be measured.
     * @param constraints The constraints to be applied during measurement.
     * @return A [MeasureResult] representing the measured layout.
     */
    override fun MeasureScope.measure(
        measurable: Measurable,
        constraints: Constraints
    ): MeasureResult {
        val size = minimumInteractiveComponentSize
        val placeable = measurable.measure(constraints)
        val enforcement =
            isAttached && currentValueOf(LocalMinimumInteractiveComponentEnforcement)

        // Be at least as big as the minimum dimension in both dimensions
        val width = if (enforcement) {
            maxOf(placeable.width, size.width.roundToPx())
        } else {
            placeable.width
        }
        val height = if (enforcement) {
            maxOf(placeable.height, size.height.roundToPx())
        } else {
            placeable.height
        }

        return layout(width, height) {
            val centerX = ((width - placeable.width) / 2f).roundToInt()
            val centerY = ((height - placeable.height) / 2f).roundToInt()
            placeable.place(centerX, centerY)
        }
    }
}

/**
 * CompositionLocal that configures whether Material components that have a visual size that is
 * lower than the minimum touch target size for accessibility (such as Button) will include
 * extra space outside the component to ensure that they are accessible. If set to false there
 * will be no extra space, and so it is possible that if the component is placed near the edge of
 * a layout / near to another component without any padding, there will not be enough space for
 * an accessible touch target.
 */
val LocalMinimumInteractiveComponentEnforcement: ProvidableCompositionLocal<Boolean> =
    staticCompositionLocalOf { true }

private class MinimumInteractiveComponentSizeModifier(val size: DpSize) : LayoutModifier {
    override fun MeasureScope.measure(
        measurable: Measurable,
        constraints: Constraints
    ): MeasureResult {

        val placeable = measurable.measure(constraints)

        // Be at least as big as the minimum dimension in both dimensions
        val width = maxOf(placeable.width, size.width.roundToPx())
        val height = maxOf(placeable.height, size.height.roundToPx())

        return layout(width, height) {
            val centerX = ((width - placeable.width) / 2f).roundToInt()
            val centerY = ((height - placeable.height) / 2f).roundToInt()
            placeable.place(centerX, centerY)
        }
    }

    override fun equals(other: Any?): Boolean {
        val otherModifier = other as? MinimumInteractiveComponentSizeModifier ?: return false
        return size == otherModifier.size
    }

    override fun hashCode(): Int {
        return size.hashCode()
    }
}

private val minimumInteractiveComponentSize: DpSize = DpSize(48.dp, 48.dp)