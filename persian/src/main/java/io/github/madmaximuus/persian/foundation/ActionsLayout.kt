package io.github.madmaximuus.persian.foundation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Measurable

@Composable
internal fun ActionsLayout(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Layout(
        content = content,
        modifier = modifier
    ) { measurables, constraints ->
        val actionPlacebles = measurables.map { it.measure(constraints) }

        validate(measurables)

        var height = 0
        actionPlacebles.forEach {
            height += it.height
        }

        layout(constraints.maxWidth, height) {
            var yPosition = 0
            actionPlacebles.forEach { placeable ->

                placeable.placeRelative(x = 0, y = yPosition)

                yPosition += placeable.height
            }
        }
    }
}

private fun validate(
    measurables: List<Measurable>
) {
    require(measurables.size > 2) {
        throw IllegalArgumentException("Actions must have at least 2 items")
    }

    require(measurables.size <= 10) {
        throw IllegalArgumentException("There should be no more than 10 actions")
    }

    /*require(actions.all { it.leadingIcon == null } || actions.all { it.leadingIcon != null }) {
        throw IllegalArgumentException("All items must have an icon or none must have one.")
    }*/
}