package io.github.madmaximuus.persian.colorPicker.view.panels

import android.graphics.RectF
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
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
import io.github.madmaximuus.persian.colorPicker.view.util.collectForPress
import io.github.madmaximuus.persian.colorPicker.view.util.drawBitmap
import io.github.madmaximuus.persian.colorPicker.view.util.emitDragGesture
import io.github.madmaximuus.persian.colorPicker.view.util.pointToAlpha
import io.github.madmaximuus.persian.foundation.spacing

@Composable
fun AlphaBar(
    colors: ColorPickerViewColors,
    color: Triple<Float, Float, Float>,
    alpha: Float,
    setAlpha: (Float) -> Unit
) {
    val scope = rememberCoroutineScope()
    val interactionSource = remember {
        MutableInteractionSource()
    }
    val pressOffset = remember {
        mutableStateOf(Offset.Zero)
    }

    val resolvedColor = Color.hsv(
        color.first,
        color.second,
        color.third
    )

    val padding = MaterialTheme.spacing.small.value

    val background = ImageBitmap.imageResource(id = R.drawable.vector).asAndroidBitmap()
    Canvas(
        modifier = Modifier
            .fillMaxWidth()
            .height(24.dp)
            .clip(RoundedCornerShape(100))
            .border(1.dp, colors.selectorBorderColor, RoundedCornerShape(100))
            .emitDragGesture(interactionSource)
    ) {
        val drawScopeSize = size

        val huePanel = RectF(0f, 0f, size.width, size.height)

        val brush = Brush.horizontalGradient(listOf(resolvedColor.copy(alpha = 0f), resolvedColor))

        pressOffset.value = Offset(alpha * huePanel.width(), 0f)

        scope.collectForPress(interactionSource) { pressPosition ->
            val pressPos = pressPosition.x.coerceIn(0f..drawScopeSize.width)
            val selectedAlpha = pointToAlpha(pressPos, huePanel)
            setAlpha(selectedAlpha)
        }

        drawBitmap(
            bitmap = background,
            panel = huePanel
        )

        drawRect(brush = brush)

        drawCircle(
            colors.selectorThumbColor,
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