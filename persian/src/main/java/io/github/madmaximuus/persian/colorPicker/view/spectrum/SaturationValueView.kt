package io.github.madmaximuus.persian.colorPicker.view.spectrum

import android.graphics.RectF
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.colorPicker.view.ColorPickerViewColors
import io.github.madmaximuus.persian.colorPicker.view.util.ColorPickerState
import io.github.madmaximuus.persian.colorPicker.view.util.collectForPress
import io.github.madmaximuus.persian.colorPicker.view.util.emitDragGesture
import io.github.madmaximuus.persian.colorPicker.view.util.pointToSatVal
import io.github.madmaximuus.persian.foundation.PersianTheme

/**
 * A composable function that represents a view for selecting saturation and value (brightness) of a color.
 *
 * This function displays a rectangular panel where the user can select the saturation and value of a color based on the provided [state] and [colors].
 * The panel uses a gradient shader to visualize the saturation and value, and includes a draggable thumb that indicates the current selection.
 * The selection updates the [state] with the new saturation and value values.
 *
 * @param state The state of the color picker, which contains information about the selected color and other configurations.
 * @param colors The colors used for the view, which includes various UI elements such as the thumb color.
 */
@Composable
internal fun ColumnScope.SaturationValueView(
    state: ColorPickerState,
    colors: ColorPickerViewColors,
) {
    val interactionSource = remember {
        MutableInteractionSource()
    }
    val scope = rememberCoroutineScope()

    val pressOffset = remember {
        mutableStateOf(Offset.Zero)
    }
    var canvasSize by remember { mutableStateOf(Size.Zero) }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .emitDragGesture(interactionSource)
    ) {
        Canvas(
            modifier = Modifier
                .fillMaxSize()
                .clip(PersianTheme.shapes.shape12)
        ) {
            canvasSize = size

            val satGradient = Brush.horizontalGradient(
                colors = listOf(
                    Color.White,
                    Color(android.graphics.Color.HSVToColor(floatArrayOf(state.colorHueState, 1f, 1f)))
                )
            )
            val valGradient = Brush.verticalGradient(
                colors = listOf(
                    Color.Transparent,
                    Color.Black
                )
            )

            drawRect(
                brush = satGradient,
                size = size
            )
            drawRect(
                brush = valGradient,
                size = size,
                blendMode = BlendMode.Multiply
            )
        }

        Canvas(
            modifier = Modifier.fillMaxSize()
        ) {
            drawCircle(
                color = Color.White,
                radius = 14.dp.toPx(),
                center = pressOffset.value,
                style = Fill
            )
            drawCircle(
                color = state.selectedColor.copy(alpha = 1f),
                radius = 14.dp.toPx(),
                center = pressOffset.value,
                style = Fill
            )
            drawCircle(
                color = colors.saturationValueThumbColor,
                radius = 14.dp.toPx(),
                center = pressOffset.value,
                style = Stroke(width = 2.dp.toPx())
            )
        }

        LaunchedEffect(canvasSize) {
            pressOffset.value = Offset(
                state.colorSaturationState * canvasSize.width,
                (1f - state.colorValueState) * canvasSize.height
            )
        }

        scope.collectForPress(interactionSource) { pressPosition ->
            val pressPositionOffset = Offset(
                pressPosition.x.coerceIn(0f..canvasSize.width),
                pressPosition.y.coerceIn(0f..canvasSize.height)
            )
            val (satPoint, valuePoint) = pointToSatVal(
                pressPositionOffset.x,
                pressPositionOffset.y,
                RectF(0f, 0f, canvasSize.width, canvasSize.height)
            )
            state.colorSaturationState = satPoint
            state.colorValueState = valuePoint
            pressOffset.value = pressPositionOffset
        }
    }
}
