package io.github.madmaximuus.persian.colorPicker.view.util

import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.Matrix
import android.graphics.RectF
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.input.pointer.pointerInput
import androidx.core.graphics.toRect
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

internal fun CoroutineScope.collectForPress(
    interactionSource: InteractionSource,
    setOffset: (Offset) -> Unit
) {
    launch {
        interactionSource.interactions.collect { interaction ->
            (interaction as? PressInteraction.Press)
                ?.pressPosition
                ?.let(setOffset)
        }
    }
}

internal fun DrawScope.drawBitmap(
    bitmap: Bitmap,
    panel: RectF
) {
    drawIntoCanvas {
        it.nativeCanvas.drawBitmap(
            bitmap,
            null,
            panel.toRect(),
            null
        )
    }
}

internal fun Modifier.emitDragGesture(
    interactionSource: MutableInteractionSource
) = composed(
    factory = {
        val scope = rememberCoroutineScope()

        this.then(
            Modifier
                .pointerInput(Unit) {
                    detectDragGestures { input, _ ->
                        scope.launch {
                            interactionSource.emit(PressInteraction.Press(input.position))
                        }
                    }
                }
                .clickable(interactionSource, null) {

                }
        )
    }
)

internal fun pointToAlphaCompact(pointX: Float, rect: RectF): Float {
    val width = rect.width()
    val x = when {
        pointX < rect.left -> 0F
        pointX > rect.right -> width
        else -> pointX - rect.left
    }
    return x / width
}

internal fun pointToAlphaMedium(pointY: Float, rect: RectF): Float {
    val height = rect.height()
    val y = when {
        pointY < rect.top -> 0F
        pointY > rect.bottom -> height
        else -> pointY - rect.top
    }
    return y / height
}

internal fun pointToHueCompact(pointX: Float, rect: RectF): Float {
    val width = rect.width()
    val x = when {
        pointX < rect.left -> 0F
        pointX > rect.right -> width
        else -> pointX - rect.left
    }
    return x * 360f / width
}

internal fun pointToHueMedium(pointY: Float, rect: RectF): Float {
    val height = rect.height()
    val y = when {
        pointY < rect.top -> 0F
        pointY > rect.bottom -> height
        else -> pointY - rect.top
    }
    return y * 360f / height
}

internal fun pointToSatVal(pointX: Float, pointY: Float, rect: RectF): Pair<Float, Float> {
    val width = rect.width()
    val height = rect.height()

    val x = when {
        pointX < rect.left -> 0f
        pointX > rect.right -> width
        else -> pointX - rect.left
    }

    val y = when {
        pointY < rect.top -> 0f
        pointY > rect.bottom -> height
        else -> pointY - rect.top
    }

    val satPoint = x / width
    val valuePoint = 1f - y / height

    return satPoint to valuePoint
}

internal fun resolveColor(config: ColorPickerConfig): Triple<Float, Float, Float> {
    return when (config) {
        is ColorPickerConfig.HEX -> {
            val hsv = floatArrayOf(0f, 0f, 0f)
            Color.colorToHSV(config.color.toArgb(), hsv)
            Triple(hsv[0], hsv[1], hsv[2])
        }

        is ColorPickerConfig.HSV -> {
            Triple(config.hue, config.saturation, config.value)
        }

        is ColorPickerConfig.RGB -> {
            val color = Color.valueOf(config.red, config.blue, config.green)
            val hsv = floatArrayOf(0f, 0f, 0f)
            Color.colorToHSV(color.toArgb(), hsv)
            Triple(hsv[0], hsv[1], hsv[2])
        }
    }
}


internal fun getARGB(hex: Int): IntArray {
    val a = hex and 0x1000000 shr 24
    val r = hex and 0xFF0000 shr 16
    val g = hex and 0xFF00 shr 8
    val b = hex and 0xFF
    return intArrayOf(a, r, g, b)
}

fun Bitmap.rotate(degrees: Float): Bitmap {
    val matrix = Matrix().apply { postRotate(degrees) }
    return Bitmap.createBitmap(this, 0, 0, width, height, matrix, true)
}