package io.github.madmaximuus.persian.timePicker.view.dial

import androidx.compose.animation.Crossfade
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.center
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.boundsInParent
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.onClick
import androidx.compose.ui.semantics.selectableGroup
import androidx.compose.ui.semantics.selected
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.traversalIndex
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.center
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastFilter
import androidx.compose.ui.util.fastFirstOrNull
import androidx.compose.ui.util.fastForEachIndexed
import androidx.compose.ui.util.fastMap
import androidx.window.core.layout.WindowHeightSizeClass
import io.github.madmaximuus.persian.foundation.LocalContentColor
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.foundation.minimumInteractiveComponentSize
import io.github.madmaximuus.persian.text.Text
import io.github.madmaximuus.persian.timePicker.state.AnalogTimePickerState
import io.github.madmaximuus.persian.timePicker.util.ExtraHours
import io.github.madmaximuus.persian.timePicker.util.FullCircle
import io.github.madmaximuus.persian.timePicker.util.HorizontalInnerCircleRadius
import io.github.madmaximuus.persian.timePicker.util.HorizontalOuterCircleSizeRadius
import io.github.madmaximuus.persian.timePicker.util.LayoutId
import io.github.madmaximuus.persian.timePicker.util.MaxDistance
import io.github.madmaximuus.persian.timePicker.util.MinimumInteractiveSize
import io.github.madmaximuus.persian.timePicker.util.QuarterCircle
import io.github.madmaximuus.persian.timePicker.util.TimePickerSelectionMode
import io.github.madmaximuus.persian.timePicker.util.VerticalInnerCircleRadius
import io.github.madmaximuus.persian.timePicker.util.VerticalOuterCircleSizeRadius
import io.github.madmaximuus.persian.timePicker.util.horizontalSelectorPos
import io.github.madmaximuus.persian.timePicker.util.onTap
import io.github.madmaximuus.persian.timePicker.util.toLocalString
import io.github.madmaximuus.persian.timePicker.util.verticalSelectorPos
import kotlinx.coroutines.launch
import kotlin.math.cos
import kotlin.math.roundToInt
import kotlin.math.sin

@Composable
internal fun ClockFace(
    state: AnalogTimePickerState,
    colors: DialTimePickerViewColors,
    sizes: DialTimePickerViewSizes,
) {
    val heightSizeClass = currentWindowAdaptiveInfo().windowSizeClass.windowHeightSizeClass
    val size = if (heightSizeClass != WindowHeightSizeClass.COMPACT) 256.dp
    else 200.dp
    val outerRadius =
        if (heightSizeClass != WindowHeightSizeClass.COMPACT) VerticalOuterCircleSizeRadius
        else HorizontalOuterCircleSizeRadius
    val innerRadius =
        if (heightSizeClass != WindowHeightSizeClass.COMPACT) VerticalInnerCircleRadius
        else HorizontalInnerCircleRadius
    Crossfade(
        modifier = Modifier
            .background(shape = CircleShape, color = PersianTheme.colorScheme.primaryContainer)
            .then(ClockDialModifier(state, state.selection))
            .size(size)
            .drawSelector(state, colors, heightSizeClass),
        targetState = state.clockFaceValues,
        animationSpec = tween(durationMillis = 200),
        label = ""
    ) { screen ->
        CircularLayout(
            modifier = Modifier
                .size(size)
                .semantics { selectableGroup() },
            radius = outerRadius,
        ) {
            CompositionLocalProvider(
                LocalContentColor provides colors.clockDialContentColor(false)
            ) {
                repeat(screen.size) { index ->
                    val outerValue =
                        if (!state.is24hour || state.selection == TimePickerSelectionMode.Minute) {
                            screen[index]
                        } else {
                            screen[index] % 12
                        }
                    ClockText(
                        modifier = Modifier.semantics { traversalIndex = index.toFloat() },
                        state = state,
                        value = outerValue,
                        textStyle = sizes.clockDialNumberTextStyle
                    )
                }

                if (state.selection == TimePickerSelectionMode.Hour && state.is24hour) {
                    CircularLayout(
                        modifier = Modifier
                            .layoutId(LayoutId.InnerCircle)
                            .size(size)
                            .background(shape = CircleShape, color = Color.Transparent),
                        radius = innerRadius
                    ) {
                        repeat(ExtraHours.size) { index ->
                            val innerValue = ExtraHours[index]
                            ClockText(
                                modifier = Modifier.semantics { traversalIndex = 12 + index.toFloat() },
                                state = state,
                                value = innerValue,
                                textStyle = sizes.clockDialNumberTextStyle
                            )
                        }
                    }
                }
            }
        }
    }
}


/** Distribute elements evenly on a circle of [radius] */
@Composable
private fun CircularLayout(
    modifier: Modifier = Modifier,
    radius: Dp,
    content: @Composable () -> Unit,
) {
    Layout(modifier = modifier, content = content) { measurables, constraints ->
        val radiusPx = radius.toPx()
        val itemConstraints = constraints.copy(minWidth = 0, minHeight = 0)
        val placeables =
            measurables
                .fastFilter {
                    it.layoutId != LayoutId.Selector && it.layoutId != LayoutId.InnerCircle
                }
                .fastMap { measurable -> measurable.measure(itemConstraints) }
        val selectorMeasurable = measurables.fastFirstOrNull { it.layoutId == LayoutId.Selector }
        val innerMeasurable = measurables.fastFirstOrNull { it.layoutId == LayoutId.InnerCircle }
        val theta = FullCircle / (placeables.count())
        val selectorPlaceable = selectorMeasurable?.measure(itemConstraints)
        val innerCirclePlaceable = innerMeasurable?.measure(itemConstraints)

        layout(
            width = constraints.minWidth,
            height = constraints.minHeight,
        ) {
            selectorPlaceable?.place(0, 0)

            placeables.fastForEachIndexed { i, it ->
                val centerOffsetX = constraints.maxWidth / 2 - it.width / 2
                val centerOffsetY = constraints.maxHeight / 2 - it.height / 2
                val offsetX = radiusPx * cos(theta * i - QuarterCircle) + centerOffsetX
                val offsetY = radiusPx * sin(theta * i - QuarterCircle) + centerOffsetY
                it.place(x = offsetX.roundToInt(), y = offsetY.roundToInt())
            }

            innerCirclePlaceable?.place(
                (constraints.minWidth - innerCirclePlaceable.width) / 2,
                (constraints.minHeight - innerCirclePlaceable.height) / 2
            )
        }
    }
}

private fun Modifier.drawSelector(
    state: AnalogTimePickerState,
    colors: DialTimePickerViewColors,
    heightSizeClass: WindowHeightSizeClass
): Modifier =
    this.drawWithContent {
        val selectorOffsetPx = if (heightSizeClass != WindowHeightSizeClass.COMPACT) Offset(
            state.verticalSelectorPos.x.toPx(),
            state.verticalSelectorPos.y.toPx()
        ) else Offset(
            state.horizontalSelectorPos.x.toPx(),
            state.horizontalSelectorPos.y.toPx()
        )

        val selectorDiameter = if (heightSizeClass != WindowHeightSizeClass.COMPACT) 48.dp
        else 36.dp
        val selectorRadius = selectorDiameter.toPx() / 2
        val selectorColor = colors.selectorColor

        // clear out the selector section
        drawCircle(
            radius = selectorRadius,
            center = selectorOffsetPx,
            color = Color.Black,
            blendMode = BlendMode.Clear,
        )

        // draw the text composables
        drawContent()

        // draw the selector and clear out the numbers overlapping
        drawCircle(
            radius = selectorRadius,
            center = selectorOffsetPx,
            color = selectorColor,
            blendMode = BlendMode.Xor
        )

        val strokeWidth = 2.dp.toPx()
        val lineLength =
            selectorOffsetPx.minus(
                Offset(
                    (selectorRadius * cos(state.currentAngle)),
                    (selectorRadius * sin(state.currentAngle))
                )
            )

        // draw the selector line
        drawLine(
            start = size.center,
            strokeWidth = strokeWidth,
            end = lineLength,
            color = selectorColor,
            blendMode = BlendMode.SrcOver
        )

        // draw the selector small dot
        drawCircle(
            radius = 8.dp.toPx() / 2,
            center = size.center,
            color = selectorColor,
        )

        // draw the portion of the number that was overlapping
        drawCircle(
            radius = selectorRadius,
            center = selectorOffsetPx,
            color = colors.clockDialContentColor(selected = true),
            blendMode = BlendMode.DstOver
        )
    }

@Composable
private fun ClockText(
    modifier: Modifier,
    state: AnalogTimePickerState,
    value: Int,
    textStyle: TextStyle,
) {
    val maxDist = with(LocalDensity.current) { MaxDistance.toPx() }
    var center by remember { mutableStateOf(Offset.Zero) }
    var parentCenter by remember { mutableStateOf(IntOffset.Zero) }
    val scope = rememberCoroutineScope()

    val text = value.toLocalString()
    val selected =
        if (state.selection == TimePickerSelectionMode.Minute) {
            state.minute.toLocalString() == text
        } else {
            state.hour.toLocalString() == text
        }

    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .minimumInteractiveComponentSize()
            .size(MinimumInteractiveSize)
            .onGloballyPositioned {
                parentCenter = it.parentCoordinates?.size?.center ?: IntOffset.Zero
                center = it.boundsInParent().center
            }
            .focusable()
            .semantics(mergeDescendants = true) {
                onClick {
                    scope.launch {
                        state.onTap(
                            center.x,
                            center.y,
                            maxDist,
                            parentCenter
                        )
                    }
                    true
                }
                this.selected = selected
            }
    ) {
        Text(
            modifier = Modifier.clearAndSetSemantics {
                this.contentDescription = contentDescription
            },
            text = text,
            style = textStyle,
        )
    }
}