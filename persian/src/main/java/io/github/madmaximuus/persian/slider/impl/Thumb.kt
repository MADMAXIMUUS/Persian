package io.github.madmaximuus.persian.slider.impl

import androidx.compose.foundation.background
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.DpSize
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.slider.SliderColors
import io.github.madmaximuus.persian.slider.SliderDefaults


/**
 * @param interactionSource the [MutableInteractionSource] representing the stream of
 *   [Interaction]s for this thumb. You can create and pass in your own `remember`ed instance to
 *   observe
 * @param colors [SliderColors] that will be used to resolve the colors used for this thumb in
 *   different states. See [SliderDefaults.colors].
 * @param thumbSize the size of the thumb.
 */
@Composable
internal fun Thumb(
    interactionSource: MutableInteractionSource,
    colors: SliderColors = SliderDefaults.colors(),
    thumbSize: DpSize = ThumbSize
) {
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

    val size =
        if (interactions.isNotEmpty()) {
            thumbSize.copy(width = thumbSize.width / 2)
        } else {
            thumbSize
        }
    Box(
        Modifier
            .size(size)
            .hoverable(interactionSource = interactionSource)
            .background(colors.thumbColor, PersianTheme.shapes.full)
    )
}

private val ThumbSize = DpSize(ThumbWidth, ThumbHeight)