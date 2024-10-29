package io.github.madmaximuus.persian.slider.range

import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.slider.SliderColors
import io.github.madmaximuus.persian.slider.SliderDefaults
import io.github.madmaximuus.persian.slider.continuous.Slider
import io.github.madmaximuus.persian.slider.impl.RangeSliderImpl
import io.github.madmaximuus.persian.slider.state.RangeSliderState

/**
 * Range Sliders expand upon [Slider] using the same concepts but allow the user to select 2 values.
 *
 * The two values are still bounded by the value range but they also cannot cross each other.
 *
 * @param value current values of the RangeSlider. If either value is outside of [valueRange]
 *   provided, it will be coerced to this range.
 * @param onValueChange lambda in which values should be updated
 * @param modifier modifiers for the Range Slider layout
 * @param enabled whether or not component is enabled and can we interacted with or not
 * @param onValueChangeFinished lambda to be invoked when value change has ended. This callback
 *   shouldn't be used to update the range slider values (use [onValueChange] for that), but rather
 *   to know when the user has completed selecting a new value by ending a drag or a click.
 * @param colors [SliderColors] that will be used to determine the color of the Range Slider parts
 *   in different state. See [SliderDefaults.colors] to customize.
 * @param startInteractionSource the [MutableInteractionSource] representing the stream of
 *   [Interaction]s for the start thumb. You can create and pass in your own `remember`ed instance
 *   to observe.
 * @param endInteractionSource the [MutableInteractionSource] representing the stream of
 *   [Interaction]s for the end thumb. You can create and pass in your own `remember`ed instance to
 *   observe.
 * @param valueRange range of values that Range Slider values can take. Passed [value] will be
 *   coerced to this range.
 * @param showLabel when `true` value label showed on top of slider thumb.
 */
@Composable
fun RangeSlider(
    value: ClosedFloatingPointRange<Float>,
    onValueChange: (ClosedFloatingPointRange<Float>) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    valueRange: ClosedFloatingPointRange<Float> = 0f..1f,
    onValueChangeFinished: (() -> Unit)? = null,
    colors: SliderColors = SliderDefaults.colors(),
    startInteractionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    endInteractionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    showLabel: Boolean = false
) {
    val state =
        remember(0, valueRange) {
            RangeSliderState(
                value.start,
                value.endInclusive,
                0,
                onValueChangeFinished,
                valueRange
            )
        }

    state.onValueChangeFinished = onValueChangeFinished
    state.onValueChange = { onValueChange(it.start..it.endInclusive) }
    state.activeRangeStart = value.start
    state.activeRangeEnd = value.endInclusive

    RangeSliderImpl(
        modifier = modifier,
        state = state,
        enabled = enabled,
        startInteractionSource = startInteractionSource,
        endInteractionSource = endInteractionSource,
        colors = colors,
        isValueEnabled = showLabel
    )
}