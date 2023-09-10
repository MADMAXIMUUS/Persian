package ru.rabbit.persian.progressBars

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class LinearProgressBarSizes(
    val strokeSize: Dp
)

object PersianLinearProgressBarSize {

    @Composable
    fun large(
        strokeSize: Dp = 4.dp
    ) = remember(strokeSize) {
        LinearProgressBarSizes(
            strokeSize = strokeSize
        )
    }

    @Composable
    fun medium(
        strokeSize: Dp = 3.dp
    ) = remember(strokeSize) {
        LinearProgressBarSizes(
            strokeSize = strokeSize
        )
    }

    @Composable
    fun small(
        strokeSize: Dp = 2.dp
    ) = remember(strokeSize) {
        LinearProgressBarSizes(
            strokeSize = strokeSize
        )
    }
}