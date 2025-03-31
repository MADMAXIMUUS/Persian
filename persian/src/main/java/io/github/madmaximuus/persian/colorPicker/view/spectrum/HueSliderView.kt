package io.github.madmaximuus.persian.colorPicker.view.spectrum

import android.graphics.RectF
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.colorPicker.view.ColorPickerViewColors
import io.github.madmaximuus.persian.colorPicker.view.util.ColorPickerState
import io.github.madmaximuus.persian.colorPicker.view.util.collectForPress
import io.github.madmaximuus.persian.colorPicker.view.util.emitDragGesture
import io.github.madmaximuus.persian.colorPicker.view.util.pointToHueCompact
import io.github.madmaximuus.persian.foundation.PersianTheme

/**
 * A composable function that represents a hue slider view for selecting a hue value.
 *
 * This function displays a horizontal slider that allows the user to select a hue value from the color spectrum.
 * The slider includes a draggable thumb that indicates the current hue value, and updates the [state] with the selected hue.
 * The slider is styled using the provided [colors].
 *
 * @param state The state of the color picker, which contains information about the selected color and other configurations.
 * @param colors The colors used for the view, which includes various UI elements such as the border and thumb of the slider.
 */
@Composable
internal fun HueSliderView(
    state: ColorPickerState,
    colors: ColorPickerViewColors
) {
    val scope = rememberCoroutineScope()
    val interactionSource = remember {
        MutableInteractionSource()
    }
    val pressOffset = remember {
        mutableStateOf(Offset.Zero)
    }

    Canvas(
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp)
            .clip(PersianTheme.shapes.full)
            .border(1.dp, colors.selectorBorderColor, PersianTheme.shapes.full)
            .emitDragGesture(interactionSource)
    ) {
        val size = size
        val padding = 4.dp.toPx()
        val radius = size.height / 2 - padding
        val left = size.height / 2
        val right = size.width - size.height / 2

        val huePanel = RectF(left, 0f, right, size.height)
        pressOffset.value = Offset((state.colorHueState * huePanel.width()) / 360f + left, 0f)

        val hueGradient = Brush.horizontalGradient(
            colors = (0..360 step 10).map { hue ->
                Color(android.graphics.Color.HSVToColor(floatArrayOf(hue.toFloat(), 1f, 1f)))
            },
            startX = left,
            endX = right
        )

        drawRect(
            brush = hueGradient,
            size = Size(size.width, size.height)
        )

        scope.collectForPress(interactionSource) { pressPosition ->
            val pressPos = pressPosition.x.coerceIn(left..right)
            val selectedHue = pointToHueCompact(pressPos, huePanel)
            state.colorHueState = selectedHue
        }

        drawCircle(
            Color.White,
            radius = radius,
            center = Offset(pressOffset.value.x, size.height / 2),
            style = Fill
        )
        drawCircle(
            state.selectedColor,
            radius = radius,
            center = Offset(pressOffset.value.x, size.height / 2f),
            style = Fill
        )
        drawCircle(
            colors.selectorThumbBorderColor,
            radius = radius,
            center = Offset(pressOffset.value.x, size.height / 2f),
            style = Stroke(width = 2.dp.toPx())
        )
    }
}