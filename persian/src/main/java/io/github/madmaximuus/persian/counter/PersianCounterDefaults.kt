package io.github.madmaximuus.persian.counter

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

object PersianCounterDefaults {
    @Composable
    fun colors(
        backgroundColor: Color = MaterialTheme.extendedColorScheme.error,
        textColor: Color = MaterialTheme.extendedColorScheme.onError
    ) = remember(backgroundColor, textColor) {
        CounterColors(
            backgroundColor = backgroundColor,
            textColor = textColor
        )
    }

    @Composable
    fun tonalColors(
        backgroundColor: Color = MaterialTheme.extendedColorScheme.primaryContainer,
        textColor: Color = MaterialTheme.extendedColorScheme.onPrimaryContainer
    ) = remember(backgroundColor, textColor) {
        CounterColors(
            backgroundColor = backgroundColor,
            textColor = textColor
        )
    }

    @Composable
    fun transparentColors(
        backgroundColor: Color = Color.Transparent,
        textColor: Color = MaterialTheme.extendedColorScheme.onSurface
    ) = remember(backgroundColor, textColor) {
        CounterColors(
            backgroundColor = backgroundColor,
            textColor = textColor
        )
    }

    @Composable
    fun sizes(
        horizontalPadding: Dp = 5.dp,
        verticalPadding: Dp = 2.dp,
        badgeHorizontalOffset: Dp = (-5).dp,
        badgeVerticalOffset: Dp = 0.dp,
        radius: Shape = MaterialTheme.shapes.small,
        textStyle: TextStyle = MaterialTheme.typography.labelSmall
    ) = remember(
        horizontalPadding,
        verticalPadding,
        badgeHorizontalOffset,
        badgeVerticalOffset,
        radius,
        textStyle
    ) {
        CounterSizes(
            horizontalPadding = horizontalPadding,
            verticalPadding = verticalPadding,
            badgeHorizontalOffset = badgeHorizontalOffset,
            badgeVerticalOffset = badgeVerticalOffset,
            cornerRadius = radius,
            textStyle = textStyle
        )
    }
}

@Immutable
data class CounterColors(
    val backgroundColor: Color,
    val textColor: Color
)

@Immutable
data class CounterSizes(
    val horizontalPadding: Dp,
    val verticalPadding: Dp,
    val badgeHorizontalOffset: Dp,
    val badgeVerticalOffset: Dp,
    val cornerRadius: Shape,
    val textStyle: TextStyle
)