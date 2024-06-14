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
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSize

object PersianFabDefaults {
    @Composable
    fun primaryColors(
        backgroundColor: Color = PersianTheme.colorScheme.primaryContainer,
        content: Color = PersianTheme.colorScheme.onPrimaryContainer,
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
        backgroundColor: Color = PersianTheme.colorScheme.secondaryContainer,
        content: Color = PersianTheme.colorScheme.onSecondaryContainer,
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
        backgroundColor: Color = MaterialTheme.colorScheme.tertiaryContainer,
        content: Color = MaterialTheme.colorScheme.onTertiaryContainer
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
        backgroundColor: Color = PersianTheme.colorScheme.surface3,
        content: Color = PersianTheme.colorScheme.primary
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
        iconSize: IconSize = IconDefaults.size20(),
        textStyle: TextStyle = PersianTheme.typography.labelLarge,
        cornerShape: Shape = PersianTheme.shapes.shape16
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
        iconSize: IconSize = IconDefaults.size20(),
        textStyle: TextStyle = MaterialTheme.typography.labelLarge,
        cornerShape: Shape = PersianTheme.shapes.shape16
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
    val iconSize: IconSize,
    val textStyle: TextStyle,
    val cornerShape: Shape
)