package io.github.madmaximuus.persian.progressBars

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.extendedColorScheme

object PersianProgressBarDefaults {

    @Composable
    fun colors(
        backgroundColor: Color = MaterialTheme.extendedColorScheme.surfaceVariant,
        progressColor: Color = MaterialTheme.extendedColorScheme.primary
    ) = remember(backgroundColor, progressColor) {
        ProgressBarColors(
            backgroundColor = backgroundColor,
            progressColor = progressColor
        )
    }

    @Composable
    fun linearLarge(
        strokeSize: Dp = 4.dp
    ) = remember(strokeSize) {
        LinearProgressBarSizes(
            strokeSize = strokeSize
        )
    }

    @Composable
    fun linearMedium(
        strokeSize: Dp = 3.dp
    ) = remember(strokeSize) {
        LinearProgressBarSizes(
            strokeSize = strokeSize
        )
    }

    @Composable
    fun linearSmall(
        strokeSize: Dp = 2.dp
    ) = remember(strokeSize) {
        LinearProgressBarSizes(
            strokeSize = strokeSize
        )
    }

    @Composable
    fun circularLarge(
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
    fun circularMedium(
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
    fun circularSmall(
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

@Immutable
data class ProgressBarColors(
    val backgroundColor: Color,
    val progressColor: Color
)

@Immutable
data class LinearProgressBarSizes(
    val strokeSize: Dp
)

@Immutable
data class CircularProgressBarSizes(
    val boxSize: Dp,
    val strokeSize: Dp,
    val contentPadding: Dp
)