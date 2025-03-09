package io.github.madmaximuus.persian.checkbox.toggle

import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.snap
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.selection.triStateToggleable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathMeasure
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.checkbox.CheckboxDefaults
import io.github.madmaximuus.persian.checkbox.CheckboxToggleColors
import io.github.madmaximuus.persian.foundation.PersianState38
import io.github.madmaximuus.persian.foundation.minimumInteractiveComponentSize
import io.github.madmaximuus.persian.foundation.ripple.ripple
import io.github.madmaximuus.persian.foundation.shape.drawSquircle
import kotlin.math.floor
import kotlin.math.max

/**
 * Checkboxes can have a parent-child relationship with other checkboxes. When the parent checkbox
 * is checked, all child checkboxes are checked. If a parent checkbox is unchecked, all child
 * checkboxes are unchecked. If some, but not all, child checkboxes are checked, the parent checkbox
 * becomes an indeterminate checkbox.
 *
 * @param state The current state of the checkbox, which can be checked, unchecked, or indeterminate.
 * @param onClick A callback to be invoked when the checkbox is clicked.
 * @param modifier The [Modifier] to be applied to the checkbox.
 * @param enabled Whether the checkbox is enabled and can be interacted with.
 * @param colors The colors to be used for the checkbox.
 * @param interactionSource an optional hoisted [MutableInteractionSource] for observing and
 *   emitting [Interaction]s for this button. You can use this to change the checkbox toggle's appearance or
 *   preview the button in different states. Note that if `null` is provided, interactions will
 *   still happen internally.
 */
@Composable
fun TriStateCheckboxToggle(
    state: ToggleableState,
    onClick: (() -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: CheckboxToggleColors = CheckboxDefaults.toggleColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    val toggleableModifier =
        if (onClick != null) {
            Modifier.triStateToggleable(
                state = state,
                onClick = onClick,
                enabled = enabled,
                role = Role.Checkbox,
                interactionSource = interactionSource,
                indication = ripple(
                    color = colors.boxColor(enabled = enabled, state = state).value,
                    radius = 24.dp
                )
            )
        } else {
            Modifier
        }
    CheckboxImpl(
        enabled = enabled,
        value = state,
        modifier = modifier
            .then(
                if (onClick != null) {
                    Modifier.minimumInteractiveComponentSize()
                } else {
                    Modifier
                }
            )
            .then(toggleableModifier)
            .padding(1.dp),
        colors = colors
    )
}

/**
 * A base implementation of a checkbox.
 *
 * @param enabled Whether the checkbox is enabled and can be interacted with.
 * @param value The current state of the checkbox, which can be checked, unchecked, or indeterminate.
 * @param modifier The [Modifier] to be applied to the checkbox.
 * @param colors The [CheckboxToggleColors] instance that defines the colors for the checkbox toggle.
 */
@Composable
private fun CheckboxImpl(
    enabled: Boolean,
    value: ToggleableState,
    modifier: Modifier,
    colors: CheckboxToggleColors
) {
    val transition = updateTransition(value, label = "")
    val checkDrawFraction = transition.animateFloat(
        transitionSpec = {
            when {
                initialState == ToggleableState.Off -> tween(CHECK_ANIMATION_DURATION)
                targetState == ToggleableState.Off -> snap(BOX_OUT_DURATION)
                else -> spring()
            }
        }, label = ""
    ) {
        when (it) {
            ToggleableState.On -> 1f
            ToggleableState.Off -> 0f
            ToggleableState.Indeterminate -> 1f
        }
    }

    val checkCenterGravitationShiftFraction = transition.animateFloat(
        transitionSpec = {
            when {
                initialState == ToggleableState.Off -> snap()
                targetState == ToggleableState.Off -> snap(BOX_OUT_DURATION)
                else -> tween(durationMillis = CHECK_ANIMATION_DURATION)
            }
        }, label = ""
    ) {
        when (it) {
            ToggleableState.On -> 0f
            ToggleableState.Off -> 0f
            ToggleableState.Indeterminate -> 1f
        }
    }
    val checkCache = remember { CheckDrawingCache() }
    val checkColor = colors.checkmarkColor(value)
    val boxColor = colors.boxColor(enabled, value)
    val borderColor = colors.borderColor(enabled, value)
    Canvas(
        modifier
            .wrapContentSize(Alignment.Center)
            .requiredSize(checkboxSize)
            .graphicsLayer {
                alpha = if (enabled)
                    1f
                else
                    PersianState38
            }
    ) {
        drawBox(
            boxColor = boxColor.value,
            borderColor = borderColor.value,
            radius = radiusSize.toPx(),
            strokeWidth = floor(boxStroke.toPx())
        )
        drawCheck(
            checkColor = checkColor.value,
            checkFraction = checkDrawFraction.value,
            crossCenterGravitation = checkCenterGravitationShiftFraction.value,
            strokeWidthPx = floor(strokeWidth.toPx()),
            drawingCache = checkCache
        )
    }
}

/**
 * Draws a box of checkbox with the specified colors, corner radius, and border stroke width.
 *
 * @param boxColor The color of the box.
 * @param borderColor The color of the border.
 * @param radius The corner radius of the box.
 * @param strokeWidth The width of the border stroke.
 */
private fun DrawScope.drawBox(
    boxColor: Color,
    borderColor: Color,
    radius: Float,
    strokeWidth: Float
) {
    val halfStrokeWidth = strokeWidth / 2.0f
    val stroke = Stroke(strokeWidth)
    val checkboxSize = size.width
    if (boxColor == borderColor) {
        drawSquircle(
            color = boxColor,
            size = Size(checkboxSize, checkboxSize),
            topLeftCorner = radius,
            topRightCorner = radius,
            bottomLeftCorner = radius,
            bottomRightCorner = radius,
            style = Fill
        )
    } else {
        drawSquircle(
            color = boxColor,
            size = Size(checkboxSize - strokeWidth * 2, checkboxSize - strokeWidth * 2),
            topLeft = Offset(strokeWidth, strokeWidth),
            topLeftCorner = max(0f, radius - strokeWidth),
            topRightCorner = max(0f, radius - strokeWidth),
            bottomLeftCorner = max(0f, radius - strokeWidth),
            bottomRightCorner = max(0f, radius - strokeWidth),
            style = Fill
        )
        drawSquircle(
            color = borderColor,
            size = Size(checkboxSize - strokeWidth, checkboxSize - strokeWidth),
            topLeft = Offset(halfStrokeWidth, halfStrokeWidth),
            topLeftCorner = radius - halfStrokeWidth,
            topRightCorner = radius - halfStrokeWidth,
            bottomLeftCorner = radius - halfStrokeWidth,
            bottomRightCorner = radius - halfStrokeWidth,
            style = stroke
        )
    }
}

/**
 * Draws a checkmark inside of checkbox with the specified colors, fraction, center gravitation, stroke width, and drawing cache.
 *
 * @param checkColor The color of the checkmark.
 * @param checkFraction The fraction of the checkmark to be drawn, ranging from 0 to 1.
 * @param crossCenterGravitation The gravitation factor for the center of the cross.
 * @param strokeWidthPx The width of the stroke in pixels.
 * @param drawingCache The cache used for drawing the checkmark.
 */
private fun DrawScope.drawCheck(
    checkColor: Color,
    checkFraction: Float,
    crossCenterGravitation: Float,
    strokeWidthPx: Float,
    drawingCache: CheckDrawingCache
) {
    val stroke = Stroke(width = strokeWidthPx, cap = StrokeCap.Round, join = StrokeJoin.Round)
    val width = size.width
    val checkCrossX = 0.46f
    val checkCrossY = 0.67f
    val leftX = 0.27f
    val leftY = 0.55f
    val rightX = 0.73f
    val rightY = 0.33f

    val gravitatedCrossX = lerp(checkCrossX, 0.5f, crossCenterGravitation)
    val gravitatedCrossY = lerp(checkCrossY, 0.5f, crossCenterGravitation)
    // gravitate only Y for end to achieve center line
    val gravitatedLeftY = lerp(leftY, 0.5f, crossCenterGravitation)
    val gravitatedRightY = lerp(rightY, 0.5f, crossCenterGravitation)

    with(drawingCache) {
        checkPath.reset()
        checkPath.moveTo(width * leftX, width * gravitatedLeftY)
        checkPath.lineTo(width * gravitatedCrossX, width * gravitatedCrossY)
        checkPath.lineTo(width * rightX, width * gravitatedRightY)
        pathMeasure.setPath(checkPath, false)
        pathToDraw.reset()
        pathMeasure.getSegment(
            0f, pathMeasure.length * checkFraction, pathToDraw, true
        )
    }
    drawPath(drawingCache.pathToDraw, checkColor, style = stroke)
}

/**
 * A private immutable class that holds the drawing cache for a checkmark.
 *
 * @property checkPath The [Path] used to define the shape of the checkmark.
 * @property pathMeasure The [PathMeasure] used to measure the length of the checkmark path.
 * @property pathToDraw The [Path] used to draw the checkmark.
 */
@Immutable
private class CheckDrawingCache(
    val checkPath: Path = Path(),
    val pathMeasure: PathMeasure = PathMeasure(),
    val pathToDraw: Path = Path()
)

internal const val BOX_IN_DURATION = 200
internal const val BOX_OUT_DURATION = 150
internal const val CHECK_ANIMATION_DURATION = 300

internal val checkboxSize = 22.dp
internal val strokeWidth = 2.5.dp
internal val boxStroke = 2.dp
internal val radiusSize = 8.dp

/**
 * Performs a linear interpolation between two values.
 *
 * @param x The start value.
 * @param y The end value.
 * @param t The interpolation factor, typically in the range [0, 1].
 */
private fun lerp(x: Float, y: Float, t: Float): Float {
    return x * (1 - t) + y * t
}