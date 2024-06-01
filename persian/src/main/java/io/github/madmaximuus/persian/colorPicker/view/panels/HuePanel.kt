package io.github.madmaximuus.persian.colorPicker.view.panels

import android.graphics.Bitmap
import android.graphics.Paint
import android.graphics.RectF
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import androidx.window.core.layout.WindowHeightSizeClass
import io.github.madmaximuus.persian.colorPicker.view.ColorPickerViewColors
import io.github.madmaximuus.persian.colorPicker.view.util.collectForPress
import io.github.madmaximuus.persian.colorPicker.view.util.drawBitmap
import io.github.madmaximuus.persian.colorPicker.view.util.emitDragGesture
import io.github.madmaximuus.persian.colorPicker.view.util.pointToHueCompact
import io.github.madmaximuus.persian.colorPicker.view.util.pointToHueMedium
import io.github.madmaximuus.persian.foundation.spacing
import android.graphics.Color as AndroidColor

@Composable
fun HueBarCompact(
    value: Float,
    setColor: (Float) -> Unit,
    colors: ColorPickerViewColors
) {
    val scope = rememberCoroutineScope()
    val interactionSource = remember {
        MutableInteractionSource()
    }
    val pressOffset = remember {
        mutableStateOf(Offset.Zero)
    }

    val padding = MaterialTheme.spacing.size8.value
    Canvas(
        modifier = Modifier
            .fillMaxWidth()
            .height(24.dp)
            .clip(RoundedCornerShape(100))
            .border(1.dp, colors.selectorBorderColor, RoundedCornerShape(100))
            .emitDragGesture(interactionSource)
    ) {
        val drawScopeSize = size

        val bitmap =
            Bitmap.createBitmap(size.width.toInt(), size.height.toInt(), Bitmap.Config.ARGB_8888)
        val hueCanvas = android.graphics.Canvas(bitmap)

        val huePanel = RectF(0f, 0f, bitmap.width.toFloat(), bitmap.height.toFloat())

        pressOffset.value = Offset(value * huePanel.width() / 360f, 0f)

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
            setColor(selectedHue)
        }

        drawCircle(
            colors.selectorThumbColor,
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

@Composable
fun HueBarMedium(
    value: Float,
    setColor: (Float) -> Unit,
    colors: ColorPickerViewColors
) {
    val windowHeightSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowHeightSizeClass
    val scope = rememberCoroutineScope()
    val interactionSource = remember {
        MutableInteractionSource()
    }
    val pressOffset = remember {
        mutableStateOf(Offset.Zero)
    }

    val padding = MaterialTheme.spacing.size8.value
    val canvasSize = if (windowHeightSizeClass == WindowHeightSizeClass.COMPACT) 150.dp else 288.dp
    Canvas(
        modifier = Modifier
            .height(canvasSize)
            .width(24.dp)
            .clip(RoundedCornerShape(100))
            .border(1.dp, colors.selectorBorderColor, RoundedCornerShape(100))
            .emitDragGesture(interactionSource)
    ) {
        val drawScopeSize = size

        val bitmap =
            Bitmap.createBitmap(size.width.toInt(), size.height.toInt(), Bitmap.Config.ARGB_8888)
        val hueCanvas = android.graphics.Canvas(bitmap)

        val huePanel = RectF(0f, 0f, bitmap.width.toFloat(), bitmap.height.toFloat())

        pressOffset.value = Offset(0f, value * huePanel.height() / 360f)

        val hueColors = IntArray((huePanel.height()).toInt())
        var hue = 0f
        for (i in hueColors.indices) {
            hueColors[i] = AndroidColor.HSVToColor(floatArrayOf(hue, 1f, 1f))
            hue += 360f / hueColors.size
        }

        val linePaint = Paint()
        linePaint.strokeWidth = 0F
        for (i in hueColors.indices) {
            linePaint.color = hueColors[i]
            hueCanvas.drawLine(0f, i.toFloat(), huePanel.right, i.toFloat(), linePaint)
        }

        drawBitmap(
            bitmap = bitmap,
            panel = huePanel
        )

        scope.collectForPress(interactionSource) { pressPosition ->
            val pressPos = pressPosition.y.coerceIn(0f..drawScopeSize.height)
            val selectedHue = pointToHueMedium(pressPos, huePanel)
            setColor(selectedHue)
        }

        drawCircle(
            colors.selectorThumbColor,
            radius = size.width / 2 - padding / 2,
            center = Offset(size.width / 2, pressOffset.value.y),
            style = Fill
        )
        drawCircle(
            colors.selectorThumbBorderColor,
            radius = size.width / 2 - padding / 2,
            center = Offset(size.width / 2, pressOffset.value.y),
            style = Stroke(
                width = 1.dp.toPx()
            )
        )

    }
}