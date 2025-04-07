package io.github.madmaximuus.persian.modalPage.util

import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.Constraints

internal fun modalMeasurePolicy(
    scope: MeasureScope,
    measurables: List<Measurable>,
    constraints: Constraints,
): MeasureResult {
    val contentPlaceable = measurables
        .first { it.layoutId == LayoutId.CONTENT }
        .measure(constraints)

    val topBarPlaceable = measurables
        .firstOrNull { it.layoutId == LayoutId.TOP_BAR }
        ?.measure(constraints.copy(maxWidth = contentPlaceable.width, minHeight = 0))

    val height = contentPlaceable.height + (topBarPlaceable?.height ?: 0)

    return scope.layout(
        width = contentPlaceable.width,
        height = height,
        placementBlock = {
            topBarPlaceable?.placeRelative(0, 0)
            contentPlaceable.placeRelative(0, topBarPlaceable?.height ?: 0)
        }
    )
}
