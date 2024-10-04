package io.github.madmaximuus.persian.colorPicker.view.toolsPanel

import android.graphics.RectF
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
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
import androidx.window.core.layout.WindowHeightSizeClass
import io.github.madmaximuus.persian.R
import io.github.madmaximuus.persian.colorPicker.view.ColorPickerViewColors
import io.github.madmaximuus.persian.colorPicker.view.util.ColorPickerState
import io.github.madmaximuus.persian.colorPicker.view.util.collectForPress
import io.github.madmaximuus.persian.colorPicker.view.util.drawBitmap
import io.github.madmaximuus.persian.colorPicker.view.util.emitDragGesture
import io.github.madmaximuus.persian.colorPicker.view.util.pointToAlphaCompact
import io.github.madmaximuus.persian.colorPicker.view.util.pointToAlphaMedium
import io.github.madmaximuus.persian.colorPicker.view.util.rotate
import io.github.madmaximuus.persian.foundation.PersianTheme

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

@Composable
internal fun AlphaBarMedium(
    state: ColorPickerState,
    colors: ColorPickerViewColors,
) {
    val windowHeightSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowHeightSizeClass
    val scope = rememberCoroutineScope()
    val interactionSource = remember { MutableInteractionSource() }
    val pressOffset = remember {
        mutableStateOf(Offset.Zero)
    }

    val resolvedColor = state.selectedColor

    val padding = PersianTheme.spacing.size8.value

    val background = ImageBitmap.imageResource(id = R.drawable.vector).asAndroidBitmap().rotate(90f)
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

        val huePanel = RectF(0f, 0f, size.width, size.height)

        val brush = Brush.verticalGradient(
            listOf(
                resolvedColor.copy(alpha = 1f),
                resolvedColor.copy(alpha = 0f)
            )
        )

        pressOffset.value = Offset(0f, (1 - state.alpha) * huePanel.height())

        scope.collectForPress(interactionSource) { pressPosition ->
            val pressPos = pressPosition.y.coerceIn(0f..drawScopeSize.height)
            val selectedAlpha = pointToAlphaMedium(pressPos, huePanel)
            state.alpha = selectedAlpha
        }

        drawBitmap(
            bitmap = background,
            panel = huePanel
        )

        drawRect(brush = brush)

        drawCircle(
            color = state.selectedColor,
            radius = size.width / 2 - padding / 2,
            center = Offset(size.width / 2, pressOffset.value.y),
            style = Fill
        )
        drawCircle(
            color = colors.selectorThumbBorderColor,
            radius = size.width / 2 - padding / 2,
            center = Offset(size.width / 2, pressOffset.value.y),
            style = Stroke(
                width = 1.dp.toPx()
            )
        )
    }
}