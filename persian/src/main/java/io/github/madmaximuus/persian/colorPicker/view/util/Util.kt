package io.github.madmaximuus.persian.colorPicker.view.util

import android.graphics.Bitmap
import android.graphics.Color
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
import androidx.compose.ui.graphics.Color as ComposeColor

/**
 * An extension function for [CoroutineScope] that collects press interactions from an [InteractionSource] and updates an offset.
 *
 * This function launches a coroutine that collects interactions from the provided [interactionSource].
 * If the interaction is a [PressInteraction.Press], it retrieves the press position and updates the offset using the provided [setOffset] function.
 *
 * @param interactionSource The interaction source to collect interactions from.
 * @param setOffset A function that updates the offset based on the press position.
 */
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

/**
 * An extension function for [DrawScope] that draws a bitmap within a specified panel.
 *
 * This function uses the [DrawScope.drawIntoCanvas] method to draw the provided [bitmap] onto the canvas within the specified [panel].
 * The bitmap is drawn using the native canvas's `drawBitmap` method, which allows for precise control over the drawing area.
 *
 * @param bitmap The bitmap to be drawn.
 * @param panel The rectangle defining the area where the bitmap will be drawn.
 */
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

/**
 * An extension function for [Modifier] that emits drag gestures and click events to an [InteractionSource].
 *
 * This function creates a modifier that detects drag gestures and click events. When a drag gesture is detected,
 * it emits a [PressInteraction.Press] event with the position of the drag to the provided [interactionSource].
 * The function also handles click events, although the click event handler is currently empty.
 *
 * @param interactionSource The interaction source to which the drag and click events will be emitted.
 * @return A [Modifier] that detects drag gestures and click events and emits them to the [interactionSource].
 */
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

/**
 * Converts a point's x-coordinate within a given rectangle to a normalized alpha value.
 *
 * This function takes an x-coordinate ([pointX]) and a rectangle ([rect]) and converts the x-coordinate to a normalized alpha value between 0 and 1.
 * The x-coordinate is clamped to the bounds of the rectangle to ensure it falls within the rectangle's width.
 *
 * @param pointX The x-coordinate of the point within the rectangle.
 * @param rect The rectangle defining the bounds within which the point is located.
 * @return A normalized alpha value between 0 and 1, representing the position of the point within the rectangle's width.
 */
internal fun pointToAlphaCompact(pointX: Float, rect: RectF): Float {
    val width = rect.width()
    val x = when {
        pointX < rect.left -> 0F
        pointX > rect.right -> width
        else -> pointX - rect.left
    }
    return x / width
}

/**
 * Converts a point's x-coordinate within a given rectangle to a hue value.
 *
 * This function takes an x-coordinate ([pointX]) and a rectangle ([rect]) and converts the x-coordinate to a hue value between 0 and 360 degrees.
 * The x-coordinate is clamped to the bounds of the rectangle to ensure it falls within the rectangle's width.
 *
 * @param pointX The x-coordinate of the point within the rectangle.
 * @param rect The rectangle defining the bounds within which the point is located.
 * @return A hue value between 0 and 360 degrees, representing the position of the point within the rectangle's width.
 */
internal fun pointToHueCompact(pointX: Float, rect: RectF): Float {
    val width = rect.width()
    val x = when {
        pointX < rect.left -> 0F
        pointX > rect.right -> width
        else -> pointX - rect.left
    }
    return x * 360f / width
}

/**
 * Converts a point's coordinates within a given rectangle to saturation and value (brightness) values.
 *
 * This function takes the x and y coordinates of a point ([pointX] and [pointY]) and a rectangle ([rect]) and converts these coordinates to saturation and value (brightness) values.
 * The x-coordinate is converted to a saturation value between 0 and 1, and the y-coordinate is converted to a value (brightness) between 0 and 1.
 * The coordinates are clamped to the bounds of the rectangle to ensure they fall within the rectangle's width and height.
 *
 * @param pointX The x-coordinate of the point within the rectangle.
 * @param pointY The y-coordinate of the point within the rectangle.
 * @param rect The rectangle defining the bounds within which the point is located.
 * @return A pair of saturation and value (brightness) values, representing the position of the point within the rectangle.
 */
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

/**
 * Converts a [ComposeColor] to its HSV (Hue, Saturation, Value) components.
 *
 * This function takes a [ComposeColor] and converts it to its HSV components using the [Color.colorToHSV] method.
 * The HSV values are then returned as a [Triple] containing the hue, saturation, and value.
 *
 * @param color The [ComposeColor] to be converted to HSV components.
 * @return A [Triple] containing the hue, saturation, and value components of the color.
 */
internal fun resolveColor(color: ComposeColor): Triple<Float, Float, Float> {
    val hsv = floatArrayOf(0f, 0f, 0f)
    Color.colorToHSV(color.toArgb(), hsv)
    return Triple(hsv[0], hsv[1], hsv[2])
}

internal fun getARGB(hex: Int): IntArray {
    val a = hex and 0x1000000 shr 24
    val r = hex and 0xFF0000 shr 16
    val g = hex and 0xFF00 shr 8
    val b = hex and 0xFF
    return intArrayOf(a, r, g, b)
}