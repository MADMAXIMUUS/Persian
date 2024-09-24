package io.github.madmaximuus.persian.timePicker.view.dial

import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.ui.input.pointer.PointerEvent
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode
import androidx.compose.ui.node.DelegatingNode
import androidx.compose.ui.node.LayoutAwareModifierNode
import androidx.compose.ui.node.ModifierNodeElement
import androidx.compose.ui.node.PointerInputModifierNode
import androidx.compose.ui.node.requireDensity
import androidx.compose.ui.platform.InspectorInfo
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.center
import io.github.madmaximuus.persian.timePicker.state.AnalogTimePickerState
import io.github.madmaximuus.persian.timePicker.util.MaxDistance
import io.github.madmaximuus.persian.timePicker.util.TimePickerSelectionMode
import io.github.madmaximuus.persian.timePicker.util.atan
import io.github.madmaximuus.persian.timePicker.util.moveSelector
import io.github.madmaximuus.persian.timePicker.util.onTap
import kotlinx.coroutines.launch

internal data class ClockDialModifier(
    private val state: AnalogTimePickerState,
    private val selection: TimePickerSelectionMode,
) : ModifierNodeElement<ClockDialNode>() {

    override fun create(): ClockDialNode =
        ClockDialNode(
            state = state,
            selection = selection,
        )

    override fun update(node: ClockDialNode) {
        node.updateNode(
            state = state,
            selection = selection,
        )
    }

    override fun InspectorInfo.inspectableProperties() {
        // Show nothing in the inspector.
    }
}

internal class ClockDialNode(
    private var state: AnalogTimePickerState,
    private var selection: TimePickerSelectionMode,
) :
    DelegatingNode(),
    PointerInputModifierNode,
    CompositionLocalConsumerModifierNode,
    LayoutAwareModifierNode {

    private var offsetX = 0f
    private var offsetY = 0f
    private var center: IntOffset = IntOffset.Zero
    private val maxDist
        get() = with(requireDensity()) { MaxDistance.toPx() }

    private val pointerInputTapNode =
        delegate(
            SuspendingPointerInputModifierNode {
                detectTapGestures(
                    onPress = {
                        offsetX = it.x
                        offsetY = it.y
                    },
                    onTap = {
                        coroutineScope.launch {
                            state.onTap(it.x, it.y, maxDist, center)
                        }
                    },
                )
            }
        )

    private val pointerInputDragNode =
        delegate(
            SuspendingPointerInputModifierNode {
                detectDragGestures(
                    onDragEnd = {
                        coroutineScope.launch {
                            state.selection = TimePickerSelectionMode.Minute
                            state.onGestureEnd()
                        }
                    }
                ) { _, dragAmount ->
                    coroutineScope.launch {
                        offsetX += dragAmount.x
                        offsetY += dragAmount.y
                        state.rotateTo(atan(offsetY - center.y, offsetX - center.x))
                    }
                    state.moveSelector(offsetX, offsetY, maxDist, center)
                }
            }
        )

    override fun onRemeasured(size: IntSize) {
        center = size.center
    }

    override fun onPointerEvent(
        pointerEvent: PointerEvent,
        pass: PointerEventPass,
        bounds: IntSize
    ) {
        pointerInputTapNode.onPointerEvent(pointerEvent, pass, bounds)
        pointerInputDragNode.onPointerEvent(pointerEvent, pass, bounds)
    }

    override fun onCancelPointerInput() {
        pointerInputTapNode.onCancelPointerInput()
        pointerInputDragNode.onCancelPointerInput()
    }

    fun updateNode(
        state: AnalogTimePickerState,
        selection: TimePickerSelectionMode
    ) {
        this.state = state
        if (this.selection != selection) {
            this.selection = selection
            coroutineScope.launch { state.animateToCurrent() }
        }
    }
}