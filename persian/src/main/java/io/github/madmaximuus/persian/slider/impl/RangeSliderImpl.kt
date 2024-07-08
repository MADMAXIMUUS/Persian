package io.github.madmaximuus.persian.slider.impl

import androidx.compose.animation.core.animateInt
import androidx.compose.animation.core.animateIntSize
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.focusable
import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.awaitTouchSlopOrCancellation
import androidx.compose.foundation.gestures.horizontalDrag
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.requiredSizeIn
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.progressSemantics
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.pointer.AwaitPointerEventScope
import androidx.compose.ui.input.pointer.PointerEvent
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.PointerId
import androidx.compose.ui.input.pointer.PointerInputChange
import androidx.compose.ui.input.pointer.PointerType
import androidx.compose.ui.input.pointer.changedToUpIgnoreConsumed
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.input.pointer.positionChange
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.platform.ViewConfiguration
import androidx.compose.ui.semantics.disabled
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.setProgress
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.offset
import androidx.compose.ui.util.fastFirst
import androidx.compose.ui.util.fastFirstOrNull
import androidx.compose.ui.util.lerp
import io.github.madmaximuus.persian.foundation.minimumInteractiveComponentSize
import io.github.madmaximuus.persian.slider.SliderColors
import io.github.madmaximuus.persian.slider.state.RangeSliderState
import io.github.madmaximuus.persian.slider.state.SliderRange
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlin.coroutines.cancellation.CancellationException
import kotlin.math.abs
import kotlin.math.roundToInt
import kotlin.math.sign

@Composable
internal fun RangeSliderImpl(
    modifier: Modifier,
    state: RangeSliderState,
    enabled: Boolean,
    startInteractionSource: MutableInteractionSource,
    endInteractionSource: MutableInteractionSource,
    colors: SliderColors,
    isValueEnabled: Boolean
) {
    state.isRtl = LocalLayoutDirection.current == LayoutDirection.Rtl

    val pressDrag =
        Modifier.rangeSliderPressDragModifier(
            state,
            startInteractionSource,
            endInteractionSource,
            enabled
        )

    val startThumbSemantics = Modifier.rangeSliderStartThumbSemantics(state, enabled)
    val endThumbSemantics = Modifier.rangeSliderEndThumbSemantics(state, enabled)
    var currentStartState by remember { mutableStateOf(LabelState.HIDE) }
    val startInteractions = remember { mutableStateListOf<Interaction>() }
    var currentEndState by remember { mutableStateOf(LabelState.HIDE) }
    val endInteractions = remember { mutableStateListOf<Interaction>() }
    LaunchedEffect(startInteractionSource) {
        startInteractionSource.interactions.collect { interaction ->
            when (interaction) {
                is PressInteraction.Press -> startInteractions.add(interaction)
                is PressInteraction.Release -> startInteractions.remove(interaction.press)
                is PressInteraction.Cancel -> startInteractions.remove(interaction.press)
                is DragInteraction.Start -> startInteractions.add(interaction)
                is DragInteraction.Stop -> startInteractions.remove(interaction.start)
                is DragInteraction.Cancel -> startInteractions.remove(interaction.start)
            }
        }
    }
    LaunchedEffect(startInteractions.size) {
        currentStartState = if (startInteractions.isNotEmpty() && isValueEnabled) LabelState.SHOW
        else LabelState.HIDE
    }

    LaunchedEffect(endInteractionSource) {
        endInteractionSource.interactions.collect { interaction ->
            when (interaction) {
                is PressInteraction.Press -> endInteractions.add(interaction)
                is PressInteraction.Release -> endInteractions.remove(interaction.press)
                is PressInteraction.Cancel -> endInteractions.remove(interaction.press)
                is DragInteraction.Start -> endInteractions.add(interaction)
                is DragInteraction.Stop -> endInteractions.remove(interaction.start)
                is DragInteraction.Cancel -> endInteractions.remove(interaction.start)
            }
        }
    }
    LaunchedEffect(endInteractions.size) {
        currentEndState = if (endInteractions.isNotEmpty() && isValueEnabled) LabelState.SHOW
        else LabelState.HIDE
    }

    val startTransition = updateTransition(currentStartState, label = "start transition")
    val endTransition = updateTransition(currentEndState, label = "end transition")
    val sizeStart by startTransition.animateIntSize(label = "width start") { labelState ->
        when (labelState) {
            LabelState.HIDE -> IntSize(0, 0)
            LabelState.SHOW -> IntSize(52, 44)
        }
    }
    val paddingStart by startTransition.animateInt(label = "padding start") { labelState ->
        when (labelState) {
            LabelState.HIDE -> 0
            LabelState.SHOW -> 10
        }
    }
    val sizeEnd by endTransition.animateIntSize(label = "width end") { labelState ->
        when (labelState) {
            LabelState.HIDE -> IntSize(0, 0)
            LabelState.SHOW -> IntSize(52, 44)
        }
    }
    val paddingEnd by endTransition.animateInt(label = "padding end") { labelState ->
        when (labelState) {
            LabelState.HIDE -> 0
            LabelState.SHOW -> 10
        }
    }


    Layout(
        content = {
            Box(
                modifier = Modifier
                    .layoutId(RangeSliderComponents.STARTLABEL)
                    .size(sizeStart.width.dp, sizeStart.height.dp),
            ) {
                Label(
                    modifier = Modifier
                        .size(sizeStart.width.dp, sizeStart.height.dp),
                    value = state.activeRangeStart
                )
            }
            Box(
                modifier = Modifier
                    .layoutId(RangeSliderComponents.ENDLABEL)
                    .size(sizeEnd.width.dp, sizeEnd.height.dp),
            ) {
                Label(
                    modifier = Modifier
                        .size(sizeEnd.width.dp, sizeEnd.height.dp),
                    value = state.activeRangeEnd
                )
            }
            Box(
                modifier = Modifier
                    .layoutId(RangeSliderComponents.STARTTHUMB)
                    .wrapContentWidth()
                    .onSizeChanged { state.startThumbWidth = it.width.toFloat() }
                    .focusable(enabled, startInteractionSource)
                    .then(startThumbSemantics)
            ) {
                Thumb(
                    interactionSource = startInteractionSource,
                    colors = colors,
                    enabled = enabled,
                )
            }
            Box(
                modifier =
                Modifier
                    .layoutId(RangeSliderComponents.ENDTHUMB)
                    .wrapContentWidth()
                    .onSizeChanged { state.endThumbWidth = it.width.toFloat() }
                    .focusable(enabled, endInteractionSource)
                    .then(endThumbSemantics)
            ) {
                Thumb(
                    interactionSource = endInteractionSource,
                    colors = colors,
                    enabled = enabled,
                )
            }
            Box(
                modifier = Modifier.layoutId(RangeSliderComponents.TRACK)
            ) {
                RangeSliderTrack(
                    rangeSliderState = state,
                    colors = colors,
                    enabled = enabled
                )
            }
        },
        modifier = modifier
            .minimumInteractiveComponentSize()
            .requiredSizeIn(
                minWidth = ThumbWidth,
                minHeight = TrackHeight
            )
            .then(pressDrag)
    ) { measurables, constraints ->
        val startThumbPlaceable =
            measurables
                .fastFirst { it.layoutId == RangeSliderComponents.STARTTHUMB }
                .measure(constraints)

        val endThumbPlaceable =
            measurables
                .fastFirst { it.layoutId == RangeSliderComponents.ENDTHUMB }
                .measure(constraints)

        val startLabelPlaceable =
            measurables
                .fastFirst { it.layoutId == RangeSliderComponents.STARTLABEL }
                .measure(constraints)

        val endLabelPlaceable =
            measurables
                .fastFirst { it.layoutId == RangeSliderComponents.ENDLABEL }
                .measure(constraints)


        val trackPlaceable =
            measurables
                .fastFirst { it.layoutId == RangeSliderComponents.TRACK }
                .measure(
                    constraints
                        .offset(
                            horizontal = -(startThumbPlaceable.width + endThumbPlaceable.width) / 2
                        )
                        .copy(minHeight = 0)
                )

        val sliderWidth =
            trackPlaceable.width + (startThumbPlaceable.width + endThumbPlaceable.width) / 2
        val sliderHeight =
            maxOf(trackPlaceable.height, startThumbPlaceable.height, endThumbPlaceable.height)

        state.trackHeight = trackPlaceable.height.toFloat()
        state.totalWidth = sliderWidth

        state.updateMinMaxPx()

        val trackOffsetX = startThumbPlaceable.width / 2
        val startThumbOffsetX =
            (trackPlaceable.width * state.coercedActiveRangeStartAsFraction).roundToInt()
        val startLabelOffsetX = startThumbOffsetX - startLabelPlaceable.width / 2
        // When start thumb and end thumb have different widths,
        // we need to add a correction for the centering of the slider.
        val endCorrection = (startThumbPlaceable.width - endThumbPlaceable.width) / 2
        val endThumbOffsetX =
            (trackPlaceable.width * state.coercedActiveRangeEndAsFraction + endCorrection)
                .roundToInt()
        val endLabelOffsetX = endThumbOffsetX - endLabelPlaceable.width / 2
        val trackOffsetY = (sliderHeight - trackPlaceable.height) / 2
        val startThumbOffsetY = (sliderHeight - startThumbPlaceable.height) / 2
        val startLabelOffsetY = startThumbOffsetY - startLabelPlaceable.height - paddingStart
        val endThumbOffsetY = (sliderHeight - endThumbPlaceable.height) / 2
        val endLabelOffsetY = endThumbOffsetY - endLabelPlaceable.height - paddingEnd

        layout(sliderWidth, sliderHeight) {
            trackPlaceable.placeRelative(trackOffsetX, trackOffsetY)
            startThumbPlaceable.placeRelative(startThumbOffsetX, startThumbOffsetY)
            startLabelPlaceable.placeRelative(startLabelOffsetX, startLabelOffsetY, 10f)
            endThumbPlaceable.placeRelative(endThumbOffsetX, endThumbOffsetY)
            endLabelPlaceable.placeRelative(endLabelOffsetX, endLabelOffsetY, 10f)
        }
    }
}

private enum class RangeSliderComponents {
    ENDTHUMB,
    STARTTHUMB,
    STARTLABEL,
    ENDLABEL,
    TRACK
}


@Stable
private fun Modifier.rangeSliderPressDragModifier(
    state: RangeSliderState,
    startInteractionSource: MutableInteractionSource,
    endInteractionSource: MutableInteractionSource,
    enabled: Boolean
): Modifier =
    if (enabled) {
        pointerInput(startInteractionSource, endInteractionSource, state) {
            val rangeSliderLogic =
                RangeSliderLogic(state, startInteractionSource, endInteractionSource)
            coroutineScope {
                awaitEachGesture {
                    val event = awaitFirstDown(requireUnconsumed = false)
                    val interaction = DragInteraction.Start()
                    var posX =
                        if (state.isRtl) state.totalWidth - event.position.x else event.position.x
                    val compare = rangeSliderLogic.compareOffsets(posX)
                    var draggingStart =
                        if (compare != 0) {
                            compare < 0
                        } else {
                            state.rawOffsetStart > posX
                        }

                    awaitSlop(event.id, event.type)?.let {
                        val slop = viewConfiguration.pointerSlop(event.type)
                        val shouldUpdateCapturedThumb =
                            abs(state.rawOffsetEnd - posX) < slop &&
                                    abs(state.rawOffsetStart - posX) < slop
                        if (shouldUpdateCapturedThumb) {
                            val dir = it.second
                            draggingStart = if (state.isRtl) dir >= 0f else dir < 0f
                            posX += it.first.positionChange().x
                        }
                    }

                    rangeSliderLogic.captureThumb(
                        draggingStart,
                        posX,
                        interaction,
                        this@coroutineScope
                    )

                    val finishInteraction =
                        try {
                            val success =
                                horizontalDrag(pointerId = event.id) {
                                    val deltaX = it.positionChange().x
                                    state.onDrag(
                                        draggingStart,
                                        if (state.isRtl) -deltaX else deltaX
                                    )
                                }
                            if (success) {
                                DragInteraction.Stop(interaction)
                            } else {
                                DragInteraction.Cancel(interaction)
                            }
                        } catch (e: CancellationException) {
                            DragInteraction.Cancel(interaction)
                        }

                    state.gestureEndAction(draggingStart)
                    launch {
                        rangeSliderLogic.activeInteraction(draggingStart).emit(finishInteraction)
                    }
                }
            }
        }
    } else {
        this
    }

private class RangeSliderLogic(
    val state: RangeSliderState,
    val startInteractionSource: MutableInteractionSource,
    val endInteractionSource: MutableInteractionSource
) {
    fun activeInteraction(draggingStart: Boolean): MutableInteractionSource =
        if (draggingStart) startInteractionSource else endInteractionSource

    fun compareOffsets(eventX: Float): Int {
        val diffStart = abs(state.rawOffsetStart - eventX)
        val diffEnd = abs(state.rawOffsetEnd - eventX)
        return diffStart.compareTo(diffEnd)
    }

    fun captureThumb(
        draggingStart: Boolean,
        posX: Float,
        interaction: Interaction,
        scope: CoroutineScope
    ) {
        state.onDrag(
            draggingStart,
            posX - if (draggingStart) state.rawOffsetStart else state.rawOffsetEnd
        )
        scope.launch { activeInteraction(draggingStart).emit(interaction) }
    }
}


private fun Modifier.rangeSliderStartThumbSemantics(
    state: RangeSliderState,
    enabled: Boolean
): Modifier {
    val valueRange = state.valueRange.start..state.activeRangeEnd

    return semantics {
        if (!enabled) disabled()
        setProgress(
            action = { targetValue ->
                var newValue = targetValue.coerceIn(valueRange.start, valueRange.endInclusive)
                val originalVal = newValue
                val resolvedValue =
                    if (state.startSteps > 0) {
                        var distance: Float = newValue
                        for (i in 0..state.startSteps + 1) {
                            val stepValue =
                                lerp(
                                    valueRange.start,
                                    valueRange.endInclusive,
                                    i.toFloat() / (state.startSteps + 1)
                                )
                            if (abs(stepValue - originalVal) <= distance) {
                                distance = abs(stepValue - originalVal)
                                newValue = stepValue
                            }
                        }
                        newValue
                    } else {
                        newValue
                    }

                // This is to keep it consistent with AbsSeekbar.java: return false if no
                // change from current.
                if (resolvedValue == state.activeRangeStart) {
                    false
                } else {
                    val resolvedRange = SliderRange(resolvedValue, state.activeRangeEnd)
                    val activeRange = SliderRange(state.activeRangeStart, state.activeRangeEnd)
                    if (resolvedRange != activeRange) {
                        if (state.onValueChange != null) {
                            state.onValueChange?.let { it(resolvedRange) }
                        } else {
                            state.activeRangeStart = resolvedRange.start
                            state.activeRangeEnd = resolvedRange.endInclusive
                        }
                    }
                    state.onValueChangeFinished?.invoke()
                    true
                }
            }
        )
    }
        .progressSemantics(state.activeRangeStart, valueRange, state.startSteps)
}

private fun Modifier.rangeSliderEndThumbSemantics(
    state: RangeSliderState,
    enabled: Boolean
): Modifier {
    val valueRange = state.activeRangeStart..state.valueRange.endInclusive

    return semantics {
        if (!enabled) disabled()

        setProgress(
            action = { targetValue ->
                var newValue = targetValue.coerceIn(valueRange.start, valueRange.endInclusive)
                val originalVal = newValue
                val resolvedValue =
                    if (state.endSteps > 0) {
                        var distance: Float = newValue
                        for (i in 0..state.endSteps + 1) {
                            val stepValue =
                                lerp(
                                    valueRange.start,
                                    valueRange.endInclusive,
                                    i.toFloat() / (state.endSteps + 1)
                                )
                            if (abs(stepValue - originalVal) <= distance) {
                                distance = abs(stepValue - originalVal)
                                newValue = stepValue
                            }
                        }
                        newValue
                    } else {
                        newValue
                    }

                // This is to keep it consistent with AbsSeekbar.java: return false if no
                // change from current.
                if (resolvedValue == state.activeRangeEnd) {
                    false
                } else {
                    val resolvedRange = SliderRange(state.activeRangeStart, resolvedValue)
                    val activeRange = SliderRange(state.activeRangeStart, state.activeRangeEnd)
                    if (resolvedRange != activeRange) {
                        if (state.onValueChange != null) {
                            state.onValueChange?.let { it(resolvedRange) }
                        } else {
                            state.activeRangeStart = resolvedRange.start
                            state.activeRangeEnd = resolvedRange.endInclusive
                        }
                    }
                    state.onValueChangeFinished?.invoke()
                    true
                }
            }
        )
    }
        .progressSemantics(state.activeRangeEnd, valueRange, state.endSteps)
}


private suspend fun AwaitPointerEventScope.awaitSlop(
    id: PointerId,
    type: PointerType
): Pair<PointerInputChange, Float>? {
    var initialDelta = 0f
    val postPointerSlop = { pointerInput: PointerInputChange, offset: Float ->
        pointerInput.consume()
        initialDelta = offset
    }
    val afterSlopResult = awaitHorizontalPointerSlopOrCancellation(id, type, postPointerSlop)
    return if (afterSlopResult != null) afterSlopResult to initialDelta else null
}


internal suspend fun AwaitPointerEventScope.awaitHorizontalPointerSlopOrCancellation(
    pointerId: PointerId,
    pointerType: PointerType,
    onPointerSlopReached: (change: PointerInputChange, overSlop: Float) -> Unit
) =
    awaitPointerSlopOrCancellation(
        pointerId = pointerId,
        pointerType = pointerType,
        onPointerSlopReached = onPointerSlopReached,
        getDragDirectionValue = { it.x }
    )

/**
 * Waits for drag motion along one axis based on [getDragDirectionValue] to pass pointer slop, using
 * [pointerId] as the pointer to examine. If [pointerId] is raised, another pointer from those that
 * are down will be chosen to lead the gesture, and if none are down, `null` is returned. If
 * [pointerId] is not down when [awaitPointerSlopOrCancellation] is called, then `null` is returned.
 *
 * When pointer slop is detected, [onPointerSlopReached] is called with the change and the distance
 * beyond the pointer slop. [getDragDirectionValue] should return the position change in the
 * direction of the drag axis. If [onPointerSlopReached] does not consume the position change,
 * pointer slop will not have been considered detected and the detection will continue or, if it is
 * consumed, the [PointerInputChange] that was consumed will be returned.
 *
 * This works with [awaitTouchSlopOrCancellation] for the other axis to ensure that only horizontal
 * or vertical dragging is done, but not both.
 *
 * @return The [PointerInputChange] of the event that was consumed in [onPointerSlopReached] or
 *   `null` if all pointers are raised or the position change was consumed by another gesture
 *   detector.
 */
private suspend inline fun AwaitPointerEventScope.awaitPointerSlopOrCancellation(
    pointerId: PointerId,
    pointerType: PointerType,
    onPointerSlopReached: (PointerInputChange, Float) -> Unit,
    getDragDirectionValue: (Offset) -> Float
): PointerInputChange? {
    if (currentEvent.isPointerUp(pointerId)) {
        return null // The pointer has already been lifted, so the gesture is canceled
    }
    val touchSlop = viewConfiguration.pointerSlop(pointerType)
    var pointer: PointerId = pointerId
    var totalPositionChange = 0f

    while (true) {
        val event = awaitPointerEvent()
        val dragEvent = event.changes.fastFirstOrNull { it.id == pointer }!!
        if (dragEvent.isConsumed) {
            return null
        } else if (dragEvent.changedToUpIgnoreConsumed()) {
            val otherDown = event.changes.fastFirstOrNull { it.pressed }
            if (otherDown == null) {
                // This is the last "up"
                return null
            } else {
                pointer = otherDown.id
            }
        } else {
            val currentPosition = dragEvent.position
            val previousPosition = dragEvent.previousPosition
            val positionChange =
                getDragDirectionValue(currentPosition) - getDragDirectionValue(previousPosition)
            totalPositionChange += positionChange

            val inDirection = abs(totalPositionChange)
            if (inDirection < touchSlop) {
                // verify that nothing else consumed the drag event
                awaitPointerEvent(PointerEventPass.Final)
                if (dragEvent.isConsumed) {
                    return null
                }
            } else {
                onPointerSlopReached(
                    dragEvent,
                    totalPositionChange - (sign(totalPositionChange) * touchSlop)
                )
                if (dragEvent.isConsumed) {
                    return dragEvent
                } else {
                    totalPositionChange = 0f
                }
            }
        }
    }
}

private fun PointerEvent.isPointerUp(pointerId: PointerId): Boolean =
    changes.fastFirstOrNull { it.id == pointerId }?.pressed != true

private val mouseSlop = 0.125.dp
private val defaultTouchSlop = 18.dp // The default touch slop on Android devices
private val mouseToTouchSlopRatio = mouseSlop / defaultTouchSlop

internal fun ViewConfiguration.pointerSlop(pointerType: PointerType): Float {
    return when (pointerType) {
        PointerType.Mouse -> touchSlop * mouseToTouchSlopRatio
        else -> touchSlop
    }
}
