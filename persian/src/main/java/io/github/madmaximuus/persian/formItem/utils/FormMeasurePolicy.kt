package io.github.madmaximuus.persian.formItem.utils

import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.Constraints

internal fun formMeasurePolicy(
    scope: MeasureScope,
    measurables: List<Measurable>,
    constraints: Constraints,
    horizontalPadding: Int,
    spaceHeight: Int,
): MeasureResult {
    val subheadPlaceable = measurables
        .firstOrNull { it.layoutId == LayoutId.SUBHEAD }
        ?.measure(constraints)

    val subheadHeight = subheadPlaceable?.height?.let { it + spaceHeight } ?: 0

    val inputPlaceable = measurables
        .firstOrNull { it.layoutId == LayoutId.INPUT }
        ?.measure(constraints.copy(maxWidth = constraints.maxWidth - horizontalPadding * 2))

    val inputHeight = inputPlaceable?.height ?: 0

    val textAreaPlaceable = measurables
        .firstOrNull { it.layoutId == LayoutId.TEXT_AREA }
        ?.measure(constraints.copy(maxWidth = constraints.maxWidth - horizontalPadding * 2))

    val textAreaHeight = textAreaPlaceable?.height ?: 0

    val selectPlaceable = measurables
        .firstOrNull { it.layoutId == LayoutId.SELECT }
        ?.measure(constraints.copy(maxWidth = constraints.maxWidth - horizontalPadding * 2))

    val selectHeight = selectPlaceable?.height ?: 0

    val radioButtonsPlaceable = measurables
        .firstOrNull { it.layoutId == LayoutId.RADIO_BUTTONS }
        ?.measure(constraints)

    val radioButtonsHeight = radioButtonsPlaceable?.height ?: 0

    val checkboxesPlaceable = measurables
        .firstOrNull { it.layoutId == LayoutId.CHECKBOXES }
        ?.measure(constraints)

    val checkboxesHeight = checkboxesPlaceable?.height ?: 0

    val captionPlaceable = measurables
        .firstOrNull { it.layoutId == LayoutId.CAPTION }
        ?.measure(constraints.copy(maxWidth = constraints.maxWidth - horizontalPadding * 2))

    val captionHeight = captionPlaceable?.height ?: 0

    val totalHeight = subheadHeight + inputHeight + selectHeight +
            textAreaHeight + radioButtonsHeight + captionHeight + checkboxesHeight

    return scope.layout(
        width = constraints.maxWidth,
        height = totalHeight,
        placementBlock = {
            subheadPlaceable?.placeRelative(horizontalPadding, 0)
            var y = subheadHeight
            inputPlaceable?.placeRelative(horizontalPadding, y)
            y += inputHeight
            textAreaPlaceable?.placeRelative(horizontalPadding, y)
            y += textAreaHeight
            selectPlaceable?.placeRelative(horizontalPadding, y)
            y += selectHeight
            radioButtonsPlaceable?.placeRelative(0, y)
            y += radioButtonsHeight
            checkboxesPlaceable?.placeRelative(0, y)
            y += checkboxesHeight
            captionPlaceable?.placeRelative(horizontalPadding, y + spaceHeight)
        }
    )
}