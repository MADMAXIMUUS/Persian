package io.github.madmaximuus.persian.segmentedButton.util

import androidx.compose.foundation.interaction.FocusInteraction
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.layout
import androidx.compose.ui.unit.dp

/**
 * Modifies the [Modifier] to adjust the z-index of the layout based on the interaction count and a checked state.
 *
 * This function takes a [checked] boolean and an [interactionCount] state, and adjusts the z-index of the layout
 * accordingly. If [checked] is true, the z-index is increased by 5. Otherwise, it remains the same as the interaction
 * count.
 *
 * @param checked A boolean indicating whether the item is checked.
 * @param interactionCount A [State] holding the current interaction count.
 */
internal fun Modifier.interactionZIndex(checked: Boolean, interactionCount: State<Int>) =
    this.layout { measurable, constraints ->
        val placeable = measurable.measure(constraints)
        layout(placeable.width, placeable.height) {
            val zIndex = interactionCount.value + if (checked) 5f else 0f
            placeable.place(0, 0, zIndex)
        }
    }

/**
 * Creates a [State] that tracks the number of active interactions for the given [InteractionSource].
 *
 * This function listens to the interactions emitted by the [InteractionSource] and updates the interaction count
 * accordingly. The count is incremented for [PressInteraction.Press] and [FocusInteraction.Focus] interactions,
 * and decremented for [PressInteraction.Release], [FocusInteraction.Unfocus], and [PressInteraction.Cancel] interactions.
 */
@Composable
internal fun InteractionSource.interactionCountAsState(): State<Int> {
    val interactionCount = remember { mutableIntStateOf(0) }
    LaunchedEffect(this) {
        this@interactionCountAsState.interactions.collect { interaction ->
            when (interaction) {
                is PressInteraction.Press,
                is FocusInteraction.Focus -> {
                    interactionCount.intValue++
                }

                is PressInteraction.Release,
                is FocusInteraction.Unfocus,
                is PressInteraction.Cancel -> {
                    interactionCount.intValue--
                }
            }
        }
    }

    return interactionCount
}


/**
 * Helper function for component shape tokens. Used to grab the start values of a shape parameter.
 */
internal fun CornerBasedShape.start(): CornerBasedShape {
    return copy(topEnd = CornerSize(0.dp), bottomEnd = CornerSize(0.dp))
}

/** Helper function for component shape tokens. Used to grab the end values of a shape parameter. */
internal fun CornerBasedShape.end(): CornerBasedShape {
    return copy(topStart = CornerSize(0.dp), bottomStart = CornerSize(0.dp))
}

/**
 * @param isFirst indicate for first element
 * @param isLast indicate for last element
 * @param shape the [CornerBasedShape] the base shape that should be used in buttons that
 *   are not in the start or the end.
 */
@Composable
internal fun itemShape(
    isFirst: Boolean,
    isLast: Boolean,
    shape: CornerBasedShape
): Shape {
    return if (isFirst) shape.start()
    else if (isLast) shape.end()
    else RectangleShape
}