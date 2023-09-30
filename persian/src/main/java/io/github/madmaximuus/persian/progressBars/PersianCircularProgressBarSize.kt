package io.github.madmaximuus.persian.progressBars

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class CircularProgressBarSizes(
    val boxSize: Dp,
    val strokeSize: Dp,
    val contentPadding: Dp
)

object PersianCircularProgressBarSize {
    @Composable
    fun large(
        boxSize: Dp = 44.dp,
        strokeSize: Dp = 2.dp,
        contentPadding: Dp = 8.dp
    ) = remember(boxSize, strokeSize, contentPadding) {
        CircularProgressBarSizes(
            boxSize = boxSize,
            strokeSize = strokeSize,
            contentPadding = contentPadding
        )
    }

    @Composable
    fun medium(
        boxSize: Dp = 36.dp,
        strokeSize: Dp = 2.dp,
        contentPadding: Dp = 6.dp
    ) = remember(boxSize, strokeSize, contentPadding) {
        CircularProgressBarSizes(
            boxSize = boxSize,
            strokeSize = strokeSize,
            contentPadding = contentPadding
        )
    }

    @Composable
    fun small(
        boxSize: Dp = 28.dp,
        strokeSize: Dp = 2.dp,
        contentPadding: Dp = 4.dp
    ) = remember(boxSize, strokeSize, contentPadding) {
        CircularProgressBarSizes(
            boxSize = boxSize,
            strokeSize = strokeSize,
            contentPadding = contentPadding
        )
    }
}