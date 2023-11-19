package io.github.madmaximuus.persian.fab

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.iconBox.IconBoxSize
import io.github.madmaximuus.persian.iconBox.PersianIconBoxSize

@Deprecated("Replace with PersianFabDefaults")
object PersianFabSizes {

    @Composable
    fun small(
        boxSize: Dp = 40.dp,
        iconSize: IconBoxSize = PersianIconBoxSize.medium(),
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
        iconSize: IconBoxSize = PersianIconBoxSize.large(),
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