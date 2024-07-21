package io.github.madmaximuus.persian.progressIndicator

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme

object ProgressIndicatorDefaults {

    @Composable
    fun colors(
        trackColor: Color = PersianTheme.colorScheme.secondaryContainer,
        progressColor: Color = PersianTheme.colorScheme.primary,
        contentColor: Color = PersianTheme.colorScheme.onSurface
    ): ProgressBarColors =
        ProgressBarColors(
            trackColor = trackColor,
            progressColor = progressColor,
            contentColor = contentColor
        )

    @Composable
    fun linearLarge(
        strokeSize: Dp = 4.dp,
        gapSize: Dp = 4.dp,
        stopSize: Dp = 4.dp,
        strokeCap: StrokeCap = StrokeCap.Round,
        contentTextStyle: TextStyle = PersianTheme.typography.bodyLarge
    ): LinearProgressBarSizes =
        LinearProgressBarSizes(
            strokeSize = strokeSize,
            gapSize = gapSize,
            stopSize = stopSize,
            strokeCap = strokeCap,
            contentTextStyle = contentTextStyle
        )

    @Composable
    fun linearMedium(
        strokeSize: Dp = 3.dp,
        gapSize: Dp = 4.dp,
        stopSize: Dp = 3.dp,
        strokeCap: StrokeCap = StrokeCap.Round,
        contentTextStyle: TextStyle = PersianTheme.typography.bodyMedium
    ): LinearProgressBarSizes =
        LinearProgressBarSizes(
            strokeSize = strokeSize,
            gapSize = gapSize,
            stopSize = stopSize,
            strokeCap = strokeCap,
            contentTextStyle = contentTextStyle
        )

    @Composable
    fun linearSmall(
        strokeSize: Dp = 2.dp,
        gapSize: Dp = 4.dp,
        stopSize: Dp = 2.dp,
        strokeCap: StrokeCap = StrokeCap.Round,
        contentTextStyle: TextStyle = PersianTheme.typography.bodySmall
    ): LinearProgressBarSizes =
        LinearProgressBarSizes(
            strokeSize = strokeSize,
            gapSize = gapSize,
            stopSize = stopSize,
            strokeCap = strokeCap,
            contentTextStyle = contentTextStyle
        )

    @Composable
    fun circularLarge(
        diameter: Dp = 40.dp,
        strokeSize: Dp = 4.dp,
        gapSize: Dp = 4.dp,
        strokeCap: StrokeCap = StrokeCap.Round,
        contentTextStyle: TextStyle = PersianTheme.typography.bodyLarge
    ): CircularProgressBarSizes =
        CircularProgressBarSizes(
            diameter = diameter,
            strokeWidth = strokeSize,
            gapSize = gapSize,
            strokeCap = strokeCap,
            contentTextStyle = contentTextStyle
        )

    @Composable
    fun circularMedium(
        diameter: Dp = 32.dp,
        strokeSize: Dp = 3.dp,
        gapSize: Dp = 4.dp,
        strokeCap: StrokeCap = StrokeCap.Round,
        contentTextStyle: TextStyle = PersianTheme.typography.bodyMedium
    ): CircularProgressBarSizes =
        CircularProgressBarSizes(
            diameter = diameter,
            strokeWidth = strokeSize,
            gapSize = gapSize,
            strokeCap = strokeCap,
            contentTextStyle = contentTextStyle
        )

    @Composable
    fun circularSmall(
        diameter: Dp = 24.dp,
        strokeSize: Dp = 2.dp,
        gapSize: Dp = 4.dp,
        strokeCap: StrokeCap = StrokeCap.Round,
        contentTextStyle: TextStyle = PersianTheme.typography.bodySmall
    ): CircularProgressBarSizes =
        CircularProgressBarSizes(
            diameter = diameter,
            strokeWidth = strokeSize,
            gapSize = gapSize,
            strokeCap = strokeCap,
            contentTextStyle = contentTextStyle
        )
}

@Immutable
class ProgressBarColors internal constructor(
    internal val trackColor: Color,
    internal val progressColor: Color,
    internal val contentColor: Color
)

@Immutable
class LinearProgressBarSizes internal constructor(
    internal val strokeSize: Dp,
    internal val gapSize: Dp,
    internal val stopSize: Dp,
    internal val strokeCap: StrokeCap,
    internal val contentTextStyle: TextStyle
)

@Immutable
class CircularProgressBarSizes internal constructor(
    internal val diameter: Dp,
    internal val strokeWidth: Dp,
    internal val gapSize: Dp,
    internal val strokeCap: StrokeCap,
    internal val contentTextStyle: TextStyle
)