package ru.rabbit.persian.fab

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class FabSizes(
    val boxSize: Dp,
    val iconSize: Dp,
    val textStyle: TextStyle,
    val cornerShape: Shape
)

object PersianFabSizes {

    @Composable
    fun small(
        boxSize: Dp = 40.dp,
        iconSize: Dp = 20.dp,
        textStyle: TextStyle = MaterialTheme.typography.labelLarge,
        cornerShape: Shape = MaterialTheme.shapes.large
    ) = remember(
        boxSize,
        iconSize,
        textStyle,
        cornerShape
    ) {
        FabSizes(
            boxSize = boxSize,
            iconSize = iconSize,
            textStyle = textStyle,
            cornerShape = cornerShape
        )
    }

    @Composable
    fun medium(
        boxSize: Dp = 56.dp,
        iconSize: Dp = 24.dp,
        textStyle: TextStyle = MaterialTheme.typography.labelLarge,
        cornerShape: Shape = MaterialTheme.shapes.large
    ) = remember(
        boxSize,
        iconSize,
        textStyle,
        cornerShape
    )
    {
        FabSizes(
            boxSize = boxSize,
            iconSize = iconSize,
            textStyle = textStyle,
            cornerShape = cornerShape
        )
    }
}