package io.github.madmaximuus.persian.slider.impl

import androidx.compose.animation.core.animateInt
import androidx.compose.animation.core.animateIntSize
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.focusable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.gestures.draggable
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
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.semantics.disabled
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.setProgress
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.offset
import androidx.compose.ui.util.fastFirst
import androidx.compose.ui.util.lerp
import io.github.madmaximuus.persian.foundation.minimumInteractiveComponentSize
import io.github.madmaximuus.persian.slider.SliderColors
import io.github.madmaximuus.persian.slider.state.CenteredSliderState
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.roundToInt

/**
 * Composable function to create a centered slider with customizable states and interactions.
 *
 * @param modifier The modifier to be applied to the layout.
 * @param state The state of the centered slider.
 * @param enabled Whether the slider is enabled or not.
 * @param colors The colors to be used for the slider components.
 * @param showLabel Whether to show the label or not.
 * @param interactionSource The interaction source for handling user interactions.
 */
@Composable
internal fun CenteredSliderImpl(
    modifier: Modifier,
    state: CenteredSliderState,
    enabled: Boolean,
    colors: SliderColors,
    showLabel: Boolean,
    interactionSource: MutableInteractionSource,
) {
    state.isRtl = LocalLayoutDirection.current == LayoutDirection.Rtl
    val press = Modifier.centeredSliderTapModifier(state, interactionSource, enabled)
    val drag =
        Modifier.draggable(
            orientation = Orientation.Horizontal,
            reverseDirection = state.isRtl,
            enabled = enabled,
            interactionSource = interactionSource,
            onDragStopped = { state.gestureEndAction() },
            startDragImmediately = state.isDragging,
            state = state
        )

    var currentState by remember { mutableStateOf(LabelState.HIDE) }
    val interactions = remember { mutableStateListOf<Interaction>() }
    LaunchedEffect(interactionSource) {
        interactionSource.interactions.collect { interaction ->
            when (interaction) {
                is PressInteraction.Press -> interactions.add(interaction)
                is PressInteraction.Release -> interactions.remove(interaction.press)
                is PressInteraction.Cancel -> interactions.remove(interaction.press)
                is DragInteraction.Start -> interactions.add(interaction)
                is DragInteraction.Stop -> interactions.remove(interaction.start)
                is DragInteraction.Cancel -> interactions.remove(interaction.start)
            }
        }
    }
    LaunchedEffect(interactions.size) {
        currentState = if (interactions.isNotEmpty() && showLabel) LabelState.SHOW
        else LabelState.HIDE
    }

    val transition = updateTransition(currentState, label = "transition")
    val size by transition.animateIntSize(label = "width") { labelState ->
        when (labelState) {
            LabelState.HIDE -> IntSize(0, 0)
            LabelState.SHOW -> IntSize(52, 44)
        }
    }
    val padding by transition.animateInt(label = "padding") { labelState ->
        when (labelState) {
            LabelState.HIDE -> 0
            LabelState.SHOW -> 10
        }
    }

    Layout(
        content = {
            Box(
                modifier = Modifier
                    .layoutId(SliderComponents.LABEL)
                    .size(size.width.dp, size.height.dp),
            ) {
                Label(
                    modifier = Modifier
                        .size(size.width.dp, size.height.dp),
                    value = state.value
                )
            }
            Box(
                modifier = Modifier
                    .layoutId(SliderComponents.THUMB)
                    .wrapContentWidth()
                    .onSizeChanged {
                        state.thumbWidth = it.width.toFloat()
                    }
            ) {
                Thumb(
                    interactionSource = interactionSource,
                    enabled = enabled
                )
            }
            Box(
                modifier = Modifier.layoutId(SliderComponents.TRACK)
            ) {
                CenteredSliderTrack(
                    sliderState = state,
                    colors = colors,
                    enabled = enabled
                )
            }
        },
        modifier = modifier
            .minimumInteractiveComponentSize()
            .requiredSizeIn(minWidth = ThumbWidth, minHeight = TrackHeight)
            .centeredSliderSemantics(state, enabled)
            .focusable(enabled, interactionSource)
            .then(press)
            .then(drag)
    ) { measurables, constraints ->
        val thumbPlaceable =
            measurables.fastFirst { it.layoutId == SliderComponents.THUMB }.measure(constraints)

        val trackPlaceable =
            measurables
                .fastFirst { it.layoutId == SliderComponents.TRACK }
                .measure(constraints.offset(horizontal = -thumbPlaceable.width).copy(minHeight = 0))

        val labelPlaceable =
            measurables
                .fastFirst { it.layoutId == SliderComponents.LABEL }
                .measure(constraints.copy(minHeight = 0))

        val sliderWidth = thumbPlaceable.width + trackPlaceable.width
        val sliderHeight = max(trackPlaceable.height, thumbPlaceable.height)

        state.updateDimensions(trackPlaceable.height.toFloat(), sliderWidth)

        val trackOffsetX = thumbPlaceable.width / 2
        val thumbOffsetX = ((trackPlaceable.width) * state.coercedValueAsFraction).roundToInt()
        val labelOffsetX = thumbOffsetX + thumbPlaceable.width / 2 - labelPlaceable.width / 2
        val trackOffsetY = (sliderHeight - trackPlaceable.height) / 2
        val thumbOffsetY = (sliderHeight - thumbPlaceable.height) / 2
        val labelOffsetY = thumbOffsetY - labelPlaceable.height - padding

        layout(sliderWidth, sliderHeight) {
            trackPlaceable.placeRelative(trackOffsetX, trackOffsetY)
            thumbPlaceable.placeRelative(thumbOffsetX, thumbOffsetY)
            labelPlaceable.placeRelative(labelOffsetX, labelOffsetY, 10f)
        }
    }
}

/**
 * Extension function to create a modifier for handling tap gestures on a centered slider.
 *
 * This modifier detects tap gestures and updates the state of the slider accordingly.
 * If the slider is enabled, it will handle tap gestures; otherwise, it will return the original modifier.
 *
 * @param state The state of the centered slider.
 * @param interactionSource The interaction source for handling user interactions.
 * @param enabled Whether the slider is enabled or not.
 */
@Stable
private fun Modifier.centeredSliderTapModifier(
    state: CenteredSliderState,
    interactionSource: MutableInteractionSource,
    enabled: Boolean
) =
    if (enabled) {
        pointerInput(state, interactionSource) {
            detectTapGestures(
                onPress = { state.onPress(it) },
                onTap = {
                    state.dispatchRawDelta(0f)
                    state.gestureEndAction()
                }
            )
        }
    } else {
        this
    }

/**
 * Extension function to add semantics for a centered slider.
 *
 * This modifier adds accessibility semantics to the slider, including progress and disabled state.
 * It handles the progress action, ensuring the value is within the specified range and steps,
 * and updates the slider state accordingly.
 *
 * @param state The state of the centered slider.
 * @param enabled Whether the slider is enabled or not.
 */
private fun Modifier.centeredSliderSemantics(
    state: CenteredSliderState,
    enabled: Boolean
): Modifier {
    return semantics {
        if (!enabled) disabled()
        setProgress(
            action = { targetValue ->
                var newValue =
                    targetValue.coerceIn(state.valueRange.start, state.valueRange.endInclusive)
                val originalVal = newValue
                val resolvedValue =
                    if (state.steps > 0) {
                        var distance: Float = newValue
                        for (i in 0..state.steps + 1) {
                            val stepValue =
                                lerp(
                                    state.valueRange.start,
                                    state.valueRange.endInclusive,
                                    i.toFloat() / (state.steps + 1)
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
                if (resolvedValue == state.value) {
                    false
                } else {
                    if (resolvedValue != state.value) {
                        if (state.onValueChange != null) {
                            state.onValueChange?.let { it(resolvedValue) }
                        } else {
                            state.value = resolvedValue
                        }
                    }
                    state.onValueChangeFinished?.invoke()
                    true
                }
            }
        )
    }
        .progressSemantics(
            state.value,
            state.valueRange.start..state.valueRange.endInclusive,
            state.steps
        )
}