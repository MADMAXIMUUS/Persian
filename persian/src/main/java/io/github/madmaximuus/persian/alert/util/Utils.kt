package io.github.madmaximuus.persian.alert.util

import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.Constraints
import kotlin.math.max

internal fun alertMeasurePolicy(
    scope: MeasureScope,
    measurables: List<Measurable>,
    constraints: Constraints,
): MeasureResult {
    val alertPlaceable = measurables
        .first { it.layoutId == LayoutId.ALERT }
        .measure(constraints)

    val contentPlaceable = measurables
        .firstOrNull { it.layoutId == LayoutId.CONTENT }
        ?.measure(constraints)

    val maxWidth = max(alertPlaceable.width, contentPlaceable?.width ?: 0)

    val actionsPlaceable = measurables
        .first { it.layoutId == LayoutId.ACTIONS }
        .measure(constraints.copy(maxWidth = maxWidth, minWidth = maxWidth))

    val height = alertPlaceable.height + (contentPlaceable?.height ?: 0) + actionsPlaceable.height

    return scope.layout(
        width = maxWidth,
        height = height,
        placementBlock = {
            var x = maxWidth / 2 - alertPlaceable.width / 2
            var y = 0
            alertPlaceable.placeRelative(x, y)
            y += alertPlaceable.height
            x = maxWidth / 2 - (contentPlaceable?.width ?: 0) / 2
            contentPlaceable?.placeRelative(x, y)
            y += contentPlaceable?.height ?: 0
            actionsPlaceable.placeRelative(0, y)
        }
    )
}
