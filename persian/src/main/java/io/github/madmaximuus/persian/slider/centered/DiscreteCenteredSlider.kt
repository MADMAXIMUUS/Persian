package io.github.madmaximuus.persian.slider.centered

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import io.github.madmaximuus.persian.foundation.PersianState38
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.slider.SliderColors
import io.github.madmaximuus.persian.slider.SliderDefaults
import io.github.madmaximuus.persian.slider.content.SliderContentScope
import io.github.madmaximuus.persian.slider.content.SliderContentScopeWrapper
import io.github.madmaximuus.persian.slider.impl.CenteredSliderImpl
import io.github.madmaximuus.persian.slider.state.CenteredSliderState


/**
 * Sliders allow users to make selections from a range of values.
 *
 * Sliders reflect a range of values along a bar, from which users may select a single value. They
 * are ideal for adjusting settings such as volume, brightness, or applying image filters.
 *
 * @param value current value of the slider. If outside of [valueRange] provided, value will be
 *   coerced to this range.
 * @param onValueChange callback in which value should be updated
 * @param modifier the [Modifier] to be applied to this slider
 * @param enabled controls the enabled state of this slider. When `false`, this component will not
 *   respond to user input, and it will appear visually disabled and disabled to accessibility
 *   services.
 * @param onValueChangeFinished called when value change has ended. This should not be used to
 *   update the slider value (use [onValueChange] instead), but rather to know when the user has
 *   completed selecting a new value by ending a drag or a click.
 * @param colors [SliderColors] that will be used to resolve the colors used for this slider in
 *   different states. See [SliderDefaults.colors].
 * @param interactionSource the [MutableInteractionSource] representing the stream of [Interaction]s
 *   for this slider. You can create and pass in your own `remember`ed instance to observe
 *   [Interaction]s and customize the appearance / behavior of this slider in different states.
 * @param valueRange range of values that this slider can take. The passed [value] will be coerced
 *   to this range.
 * @param showLabel when `true` value label showed on top of slider thumb.
 */
@Composable
fun DiscreteCenteredSlider(
    value: Float,
    onValueChange: (Float) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    @IntRange(from = 0) steps: Int = 0,
    onValueChangeFinished: (() -> Unit)? = null,
    colors: SliderColors = SliderDefaults.colors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    valueRange: ClosedFloatingPointRange<Float> = -1f..1f,
    showLabel: Boolean,
    leading: (@Composable SliderContentScope.() -> Unit)? = null,
    trailing: (@Composable SliderContentScope.() -> Unit)? = null
) {
    val state = remember(steps, valueRange) {
        CenteredSliderState(value, steps, onValueChangeFinished, valueRange)
    }

    state.onValueChangeFinished = onValueChangeFinished
    state.onValueChange = onValueChange
    state.value = value
    Row(
        modifier = modifier
            .padding(horizontal = PersianTheme.spacing.size2)
            .graphicsLayer {
                alpha = if (enabled) 1f
                else PersianState38
            },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(PersianTheme.spacing.size8)
    ) {
        val contentScope = remember(enabled, colors) {
            SliderContentScopeWrapper(enabled, colors)
        }
        leading?.let { leading ->
            contentScope.leading()
        }
        CenteredSliderImpl(
            state = state,
            modifier = Modifier.weight(1f),
            enabled = enabled,
            interactionSource = interactionSource,
            showLabel = showLabel,
            colors = colors.copy(activeTrackColor = Color.Unspecified)
        )
        trailing?.let { trailing ->
            contentScope.trailing()
        }
    }
}