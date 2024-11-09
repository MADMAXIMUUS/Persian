package io.github.madmaximuus.persian.slider.range

import androidx.annotation.IntRange
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.slider.SliderColors
import io.github.madmaximuus.persian.slider.SliderDefaults
import io.github.madmaximuus.persian.slider.content.SliderContentScope
import io.github.madmaximuus.persian.slider.content.SliderContentScopeWrapper
import io.github.madmaximuus.persian.slider.continuous.DiscreteSlider
import io.github.madmaximuus.persian.slider.impl.RangeSliderImpl
import io.github.madmaximuus.persian.slider.state.RangeSliderState

/**
 * Range Sliders expand upon [DiscreteSlider] using the same concepts but allow the user to select 2 values.
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
 * @param steps if positive, specifies the amount of discrete allowable values (in addition to the
 *   endpoints of the value range). Step values are evenly distributed across the range. If 0, the
 *   range slider will behave continuously and allow any value from the range. Must not be negative.
 * @param valueRange range of values that Range Slider values can take. Passed [value] will be
 *   coerced to this range.
 * @param showLabel when `true` value label showed on top of slider thumb.
 */
@Composable
fun DiscreteRangeSlider(
    value: ClosedFloatingPointRange<Float>,
    onValueChange: (ClosedFloatingPointRange<Float>) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    valueRange: ClosedFloatingPointRange<Float> = 0f..1f,
    onValueChangeFinished: (() -> Unit)? = null,
    colors: SliderColors = SliderDefaults.colors(),
    startInteractionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    endInteractionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    @IntRange(from = 0) steps: Int = 0,
    showLabel: Boolean = false,
    leading: (@Composable SliderContentScope.() -> Unit)? = null,
    trailing: (@Composable SliderContentScope.() -> Unit)? = null
) {
    val state =
        remember(steps, valueRange) {
            RangeSliderState(
                value.start,
                value.endInclusive,
                steps,
                onValueChangeFinished,
                valueRange
            )
        }

    state.onValueChangeFinished = onValueChangeFinished
    state.onValueChange = { onValueChange(it.start..it.endInclusive) }
    state.activeRangeStart = value.start
    state.activeRangeEnd = value.endInclusive

    Row(
        modifier = modifier.padding(horizontal = PersianTheme.spacing.size2),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
    ) {
        val contentScope = remember(enabled, colors) {
            SliderContentScopeWrapper(enabled, colors)
        }
        leading?.let { leading ->
            contentScope.leading()
        }
        RangeSliderImpl(
            state = state,
            modifier = Modifier.weight(1f),
            enabled = enabled,
            startInteractionSource = startInteractionSource,
            endInteractionSource = endInteractionSource,
            colors = colors,
            isValueEnabled = showLabel
        )
        trailing?.let { trailing ->
            contentScope.trailing()
        }
    }
}