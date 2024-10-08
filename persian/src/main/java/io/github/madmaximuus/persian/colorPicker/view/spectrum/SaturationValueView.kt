package io.github.madmaximuus.persian.colorPicker.view.spectrum

import android.graphics.Bitmap
import android.graphics.ComposeShader
import android.graphics.LinearGradient
import android.graphics.Paint
import android.graphics.PorterDuff
import android.graphics.RectF
import android.graphics.Shader
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.colorPicker.view.ColorPickerViewColors
import io.github.madmaximuus.persian.colorPicker.view.util.ColorPickerState
import io.github.madmaximuus.persian.colorPicker.view.util.collectForPress
import io.github.madmaximuus.persian.colorPicker.view.util.drawBitmap
import io.github.madmaximuus.persian.colorPicker.view.util.emitDragGesture
import io.github.madmaximuus.persian.colorPicker.view.util.pointToSatVal
import io.github.madmaximuus.persian.foundation.PersianTheme
import android.graphics.Color as AndroidColor

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

    Canvas(
        modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .emitDragGesture(interactionSource)
            .clip(PersianTheme.shapes.shape12)
    ) {
        val cornerRadius = 16.dp.toPx()
        val satValSize = size

        val bitmap =
            Bitmap.createBitmap(size.width.toInt(), size.height.toInt(), Bitmap.Config.ARGB_8888)
        val canvas = android.graphics.Canvas(bitmap)
        val satValPanel = RectF(0f, 0f, bitmap.width.toFloat(), bitmap.height.toFloat())

        val rgb = AndroidColor.HSVToColor(floatArrayOf(state.colorHueState, 1f, 1f))

        val satShader = LinearGradient(
            satValPanel.left, satValPanel.top, satValPanel.right, satValPanel.top,
            -0x1, rgb, Shader.TileMode.CLAMP
        )
        val valShader = LinearGradient(
            satValPanel.left, satValPanel.top, satValPanel.left, satValPanel.bottom,
            -0x1, -0x1000000, Shader.TileMode.CLAMP
        )

        pressOffset.value = Offset(
            state.colorSaturationState * satValSize.width,
            (state.colorValueState - 1f) * (-1) * satValSize.height
        )

        canvas.drawRoundRect(
            satValPanel,
            cornerRadius,
            cornerRadius,
            Paint().apply {
                shader = ComposeShader(
                    valShader,
                    satShader,
                    PorterDuff.Mode.MULTIPLY
                )
            }
        )

        drawBitmap(
            bitmap = bitmap,
            panel = satValPanel
        )

        scope.collectForPress(interactionSource) { pressPosition ->
            val pressPositionOffset = Offset(
                pressPosition.x.coerceIn(0f..satValSize.width),
                pressPosition.y.coerceIn(0f..satValSize.height)
            )
            val (satPoint, valuePoint) = pointToSatVal(
                pressPositionOffset.x,
                pressPositionOffset.y,
                satValPanel
            )
            state.colorSaturationState = satPoint
            state.colorValueState = valuePoint
        }

        drawCircle(
            color = colors.saturationValueThumbColor,
            radius = 12.dp.toPx(),
            center = pressOffset.value,
            style = Stroke(
                width = 2.dp.toPx()
            )
        )
    }
}