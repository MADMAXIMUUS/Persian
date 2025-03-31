package io.github.madmaximuus.persian.colorPicker.view.toolsPanel

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
import io.github.madmaximuus.persian.colorPicker.view.util.pointToAlphaCompact
import io.github.madmaximuus.persian.foundation.PersianTheme

/**
 * A composable function that represents a slider view for adjusting the alpha (transparency) value of a color.
 *
 * This function displays a horizontal slider that allows the user to select the alpha value of a color, based on the provided [state] and [colors].
 * The slider includes a draggable thumb that indicates the current alpha value, and updates the [state] with the selected alpha.
 * The slider is styled using the provided [colors] and includes a background image.
 *
 * @param modifier The modifier to be applied to the layout.
 * @param state The state of the color picker, which contains information about the selected color and other configurations.
 * @param colors The colors used for the view, which includes various UI elements such as the border and thumb of the slider.
 */
@Composable
internal fun AlphaSliderView(
    modifier: Modifier = Modifier,
    state: ColorPickerState,
    colors: ColorPickerViewColors,
) {
    val scope = rememberCoroutineScope()
    val interactionSource = remember {
        MutableInteractionSource()
    }
    val pressOffset = remember {
        mutableStateOf(Offset.Zero)
    }

    val resolvedColor = state.selectedColor

    val whiteColor = PersianTheme.colorScheme.surface
    val blackColor = PersianTheme.colorScheme.outlineVariant

    Canvas(
        modifier = modifier
            .fillMaxWidth()
            .height(40.dp)
            .clip(PersianTheme.shapes.full)
            .border(1.dp, colors.selectorBorderColor, PersianTheme.shapes.full)
            .emitDragGesture(interactionSource)
    ) {
        val padding = 4.dp.toPx()
        val size = size
        val radius = size.height / 2 - padding
        val left = size.height / 2
        val right = size.width - size.height / 2

        val huePanel = RectF(
            left,
            0f,
            right,
            size.height
        )

        val brush = Brush.horizontalGradient(
            colors = listOf(
                resolvedColor.copy(alpha = 0f),
                resolvedColor.copy(alpha = 1f)
            ),
            startX = left,
            endX = right,
        )

        pressOffset.value = Offset(state.alpha * huePanel.width() + left, 0f)

        scope.collectForPress(interactionSource) { pressPosition ->
            val pressPos = pressPosition.x.coerceIn(left..size.width)
            val selectedAlpha = pointToAlphaCompact(pressPos, huePanel)
            state.alpha = selectedAlpha
        }

        val squareSize = 9.dp.toPx()
        val cols = (size.width / squareSize).toInt()
        val rows = (size.height / squareSize).toInt()

        for (row in 0..rows) {
            for (col in 0..cols) {
                drawRect(
                    color = if ((row + col) % 2 == 0) whiteColor else blackColor,
                    topLeft = Offset(col * squareSize, row * squareSize),
                    size = Size(squareSize, squareSize)
                )
            }
        }

        drawRect(
            brush = brush,
            size = size
        )
        drawCircle(
            color = Color.White,
            radius = radius,
            center = Offset(pressOffset.value.x, size.height / 2),
            style = Fill
        )
        drawCircle(
            color = state.selectedColor,
            radius = radius,
            center = Offset(pressOffset.value.x, size.height / 2),
            style = Fill
        )
        drawCircle(
            color = colors.selectorThumbBorderColor,
            radius = radius,
            center = Offset(pressOffset.value.x, size.height / 2),
            style = Stroke(
                width = 2.dp.toPx()
            )
        )
    }
}