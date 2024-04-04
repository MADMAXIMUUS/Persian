package io.github.madmaximuus.persian.fab

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.extendedColorScheme
import io.github.madmaximuus.persian.iconBox.IconBoxSize
import io.github.madmaximuus.persian.iconBox.PersianIconBoxDefaults

object PersianFabDefaults {
    @Composable
    fun primaryColors(
        backgroundColor: Color = MaterialTheme.extendedColorScheme.primaryContainer,
        content: Color = MaterialTheme.extendedColorScheme.onPrimaryContainer,
    ) = remember(
        backgroundColor,
        content
    ) {
        FabColors(
            backgroundColor = backgroundColor,
            content = content,
        )
    }

    @Composable
    fun secondaryColors(
        backgroundColor: Color = MaterialTheme.extendedColorScheme.secondaryContainer,
        content: Color = MaterialTheme.extendedColorScheme.onSecondaryContainer,
    ) = remember(
        backgroundColor,
        content
    ) {
        FabColors(
            backgroundColor = backgroundColor,
            content = content
        )
    }

    @Composable
    fun tertiaryColors(
        backgroundColor: Color = MaterialTheme.extendedColorScheme.tertiaryContainer,
        content: Color = MaterialTheme.extendedColorScheme.onTertiaryContainer
    ) = remember(
        backgroundColor,
        content
    ) {
        FabColors(
            backgroundColor = backgroundColor,
            content = content
        )
    }

    @Composable
    fun neutralColors(
        backgroundColor: Color = MaterialTheme.extendedColorScheme.surface3,
        content: Color = MaterialTheme.extendedColorScheme.primary
    ) = remember(
        backgroundColor,
        content
    ) {
        FabColors(
            backgroundColor = backgroundColor,
            content = content
        )
    }

    @Composable
    fun smallSizes(
        boxSize: Dp = 40.dp,
        iconSize: IconBoxSize = PersianIconBoxDefaults.size20(),
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
    fun mediumSizes(
        boxSize: Dp = 56.dp,
        iconSize: IconBoxSize = PersianIconBoxDefaults.size20(),
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

@Immutable
data class FabColors(
    val backgroundColor: Color,
    val content: Color,
)

@Immutable
data class FabSizes(
    val boxSize: Dp,
    val iconSize: IconBoxSize,
    val textStyle: TextStyle,
    val cornerShape: Shape
)