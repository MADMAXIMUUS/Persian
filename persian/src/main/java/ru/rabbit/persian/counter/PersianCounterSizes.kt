package ru.rabbit.persian.counter

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class CounterSizes(
    val horizontalPadding: Dp,
    val verticalPadding: Dp,
    val badgeHorizontalOffset: Dp,
    val badgeVerticalOffset: Dp,
    val cornerRadius: Shape,
    val textStyle: TextStyle
)

object PersianCounterSizes {

    @Composable
    fun medium(
        horizontalPadding: Dp = 4.dp,
        verticalPadding: Dp = 0.dp,
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