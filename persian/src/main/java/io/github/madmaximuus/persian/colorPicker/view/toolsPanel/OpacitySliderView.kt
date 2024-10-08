package io.github.madmaximuus.persian.colorPicker.view.toolsPanel

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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asAndroidBitmap
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.R
import io.github.madmaximuus.persian.colorPicker.view.ColorPickerViewColors
import io.github.madmaximuus.persian.colorPicker.view.util.ColorPickerState
import io.github.madmaximuus.persian.colorPicker.view.util.collectForPress
import io.github.madmaximuus.persian.colorPicker.view.util.drawBitmap
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

    val padding = PersianTheme.spacing.size12.value

    val background = ImageBitmap.imageResource(id = R.drawable.vector).asAndroidBitmap()
    Canvas(
        modifier = modifier
            .fillMaxWidth()
            .height(30.dp)
            .clip(RoundedCornerShape(100))
            .border(1.dp, colors.selectorBorderColor, RoundedCornerShape(100))
            .emitDragGesture(interactionSource)
    ) {
        val drawScopeSize = size

        val huePanel = RectF(0f, 0f, size.width, size.height)

        val brush = Brush.horizontalGradient(
            listOf(
                resolvedColor.copy(alpha = 0f),
                resolvedColor.copy(alpha = 1f)
            )
        )

        pressOffset.value = Offset(state.alpha * huePanel.width(), 0f)

        scope.collectForPress(interactionSource) { pressPosition ->
            val pressPos = pressPosition.x.coerceIn(0f..drawScopeSize.width)
            val selectedAlpha = pointToAlphaCompact(pressPos, huePanel)
            state.alpha = selectedAlpha
        }

        drawBitmap(
            bitmap = background,
            panel = huePanel
        )

        drawRect(brush = brush)

        drawCircle(
            Color.White,
            radius = size.height / 2 - padding / 2,
            center = Offset(pressOffset.value.x, size.height / 2),
            style = Fill
        )
        drawCircle(
            state.selectedColor,
            radius = size.height / 2 - padding / 2,
            center = Offset(pressOffset.value.x, size.height / 2),
            style = Fill
        )
        drawCircle(
            colors.selectorThumbBorderColor,
            radius = size.height / 2 - padding / 2,
            center = Offset(pressOffset.value.x, size.height / 2),
            style = Stroke(
                width = 1.dp.toPx()
            )
        )
    }
}