package io.github.madmaximuus.persian.colorPicker.view.spectrum

import android.graphics.Bitmap
import android.graphics.Paint
import android.graphics.RectF
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.colorPicker.view.ColorPickerViewColors
import io.github.madmaximuus.persian.colorPicker.view.util.ColorPickerState
import io.github.madmaximuus.persian.colorPicker.view.util.collectForPress
import io.github.madmaximuus.persian.colorPicker.view.util.drawBitmap
import io.github.madmaximuus.persian.colorPicker.view.util.emitDragGesture
import io.github.madmaximuus.persian.colorPicker.view.util.pointToHueCompact
import io.github.madmaximuus.persian.foundation.PersianTheme
import android.graphics.Color as AndroidColor

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

    val padding = PersianTheme.spacing.size12.value
    Canvas(
        modifier = Modifier
            .fillMaxWidth()
            .height(30.dp)
            .clip(RoundedCornerShape(100))
            .border(1.dp, colors.selectorBorderColor, RoundedCornerShape(100))
            .emitDragGesture(interactionSource)
    ) {
        val drawScopeSize = size

        val bitmap =
            Bitmap.createBitmap(size.width.toInt(), size.height.toInt(), Bitmap.Config.ARGB_8888)
        val hueCanvas = android.graphics.Canvas(bitmap)

        val huePanel = RectF(0f, 0f, bitmap.width.toFloat(), bitmap.height.toFloat())

        pressOffset.value = Offset(state.colorHueState * huePanel.width() / 360f, 0f)

        val hueColors = IntArray((huePanel.width()).toInt())
        var hue = 0f
        for (i in hueColors.indices) {
            hueColors[i] = AndroidColor.HSVToColor(floatArrayOf(hue, 1f, 1f))
            hue += 360f / hueColors.size
        }

        val linePaint = Paint()
        linePaint.strokeWidth = 0F
        for (i in hueColors.indices) {
            linePaint.color = hueColors[i]
            hueCanvas.drawLine(i.toFloat(), 0F, i.toFloat(), huePanel.bottom, linePaint)
        }

        drawBitmap(
            bitmap = bitmap,
            panel = huePanel
        )

        scope.collectForPress(interactionSource) { pressPosition ->
            val pressPos = pressPosition.x.coerceIn(0f..drawScopeSize.width)
            val selectedHue = pointToHueCompact(pressPos, huePanel)
            state.colorHueState = selectedHue
        }

        drawCircle(
            Color.White,
            radius = size.height / 2 - padding / 2,
            center = Offset(pressOffset.value.x, size.height / 2),
            style = Fill
        )
        drawCircle(
            state.selectedColor,
            radius = size.height / 2 - padding / 2,
            center = Offset(pressOffset.value.x, size.height / 2f),
            style = Fill
        )
        drawCircle(
            colors.selectorThumbBorderColor,
            radius = size.height / 2 - padding / 2,
            center = Offset(pressOffset.value.x, size.height / 2f),
            style = Stroke(
                width = 1.dp.toPx()
            )
        )

    }
}