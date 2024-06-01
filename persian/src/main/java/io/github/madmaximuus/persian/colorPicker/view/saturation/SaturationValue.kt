package io.github.madmaximuus.persian.colorPicker.view.saturation

import android.graphics.Bitmap
import android.graphics.ComposeShader
import android.graphics.LinearGradient
import android.graphics.Paint
import android.graphics.PorterDuff
import android.graphics.RectF
import android.graphics.Shader
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import androidx.window.core.layout.WindowHeightSizeClass
import io.github.madmaximuus.persian.colorPicker.view.ColorPickerViewColors
import io.github.madmaximuus.persian.colorPicker.view.util.collectForPress
import io.github.madmaximuus.persian.colorPicker.view.util.drawBitmap
import io.github.madmaximuus.persian.colorPicker.view.util.emitDragGesture
import io.github.madmaximuus.persian.colorPicker.view.util.pointToSatVal
import android.graphics.Color as AndroidColor

@Composable
fun SatValPanel(
    colors: ColorPickerViewColors,
    hsvColor: Triple<Float, Float, Float>,
    setSatVal: (Float, Float) -> Unit
) {
    val windowHeightSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowHeightSizeClass

    val interactionSource = remember {
        MutableInteractionSource()
    }
    val scope = rememberCoroutineScope()
    var sat: Float
    var value: Float

    val pressOffset = remember {
        mutableStateOf(Offset.Zero)
    }

    val canvasSize = if (windowHeightSizeClass == WindowHeightSizeClass.COMPACT) 150.dp else 288.dp

    Canvas(
        modifier = Modifier
            .size(canvasSize)
            .emitDragGesture(interactionSource)
            .clip(RoundedCornerShape(12.dp))
    ) {
        val cornerRadius = 16.dp.toPx()
        val satValSize = size

        val bitmap =
            Bitmap.createBitmap(size.width.toInt(), size.height.toInt(), Bitmap.Config.ARGB_8888)
        val canvas = android.graphics.Canvas(bitmap)
        val satValPanel = RectF(0f, 0f, bitmap.width.toFloat(), bitmap.height.toFloat())

        val rgb = AndroidColor.HSVToColor(floatArrayOf(hsvColor.first, 1f, 1f))

        val satShader = LinearGradient(
            satValPanel.left, satValPanel.top, satValPanel.right, satValPanel.top,
            -0x1, rgb, Shader.TileMode.CLAMP
        )
        val valShader = LinearGradient(
            satValPanel.left, satValPanel.top, satValPanel.left, satValPanel.bottom,
            -0x1, -0x1000000, Shader.TileMode.CLAMP
        )

        pressOffset.value = Offset(
            hsvColor.second * satValSize.width,
            (hsvColor.third - 1f) * (-1) * satValSize.height
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
            sat = satPoint
            value = valuePoint

            setSatVal(sat, value)
        }

        drawCircle(
            color = colors.saturationValueThumbColor,
            radius = 10.dp.toPx(),
            center = pressOffset.value,
            style = Stroke(
                width = 1.dp.toPx()
            )
        )

        drawCircle(
            color = colors.saturationValueThumbColor,
            radius = 2.dp.toPx(),
            center = pressOffset.value,
        )
    }
}