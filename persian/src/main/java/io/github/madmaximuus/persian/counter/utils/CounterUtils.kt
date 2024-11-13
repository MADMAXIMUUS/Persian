package io.github.madmaximuus.persian.counter.utils

import androidx.compose.ui.layout.FirstBaseline
import androidx.compose.ui.layout.LastBaseline
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.Constraints

/**
 * The measure policy which is used to position the badge on the anchor view.
 *
 * @param scope the measure scope of this measure policy.
 * @param measurables elements that will be located in the layout.
 * @param constraints the restrictions for elements.
 * @param badgeRightOffset the right offset for badge.
 * @param badgeTopOffset the bottom offset for badge.
 */
internal fun badgeMeasurePolicy(
    scope: MeasureScope,
    measurables: List<Measurable>,
    constraints: Constraints,
    badgeRightOffset: Int,
    badgeTopOffset: Int,
): MeasureResult {
    val badgePlaceable = measurables.first { it.layoutId == LayoutId.BADGE }
        .measure(constraints)

    val anchorPlaceable = measurables.first { it.layoutId == LayoutId.ANCHOR }
        .measure(constraints)

    val firstBaseline = anchorPlaceable[FirstBaseline]
    val lastBaseline = anchorPlaceable[LastBaseline]
    val totalWidth = anchorPlaceable.width
    val totalHeight = anchorPlaceable.height

    return scope.layout(
        width = totalWidth,
        height = totalHeight,
        alignmentLines = mapOf(
            FirstBaseline to firstBaseline,
            LastBaseline to lastBaseline
        ),
        placementBlock = {

            anchorPlaceable.placeRelative(0, 0)
            val badgeX = anchorPlaceable.width - badgeRightOffset
            val badgeY = badgeTopOffset - badgePlaceable.height
            badgePlaceable.placeRelative(badgeX, badgeY)
        }
    )
}
