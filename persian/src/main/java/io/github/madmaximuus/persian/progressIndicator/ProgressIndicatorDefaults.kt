package io.github.madmaximuus.persian.progressIndicator

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.foundation.PersianTheme

/**
 * Contains all default values used by progress indicator
 */
object ProgressIndicatorDefaults {

    /**
     * Creates a [ProgressBarColors] object with the specified colors.
     *
     * This composable function returns a [ProgressBarColors] instance with the provided [trackColor],
     * [progressColor], and [contentColor]. If no colors are specified, default colors from the
     * [PersianTheme.colorScheme] are used.
     *
     * @param trackColor The color of the track.
     * @param progressColor The color of the progress.
     * @param contentColor The color of the content.
     */
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

    /**
     * Creates a [LinearProgressBarSizes] object with the specified sizes and styles.
     *
     * This composable function returns a [LinearProgressBarSizes] instance with the provided [strokeSize],
     * [gapSize], [stopSize], [strokeCap], and [contentTextStyle]. If no values are specified, default values
     * are used.
     *
     * @param strokeSize The size of the stroke.
     * @param gapSize The size of the gap between segments.
     * @param stopSize The size of the stop indicator.
     * @param strokeCap The stroke cap style.
     * @param contentTextStyle The text style for the content.
     */
    @Composable
    fun linearLarge(
        strokeSize: Dp = 4.dp,
        gapSize: Dp = 4.dp,
        stopSize: Dp = 4.dp,
        strokeCap: StrokeCap = StrokeCap.Round,
        contentTextStyle: TextStyle = PersianTheme.typography.labelLarge
    ): LinearProgressBarSizes =
        LinearProgressBarSizes(
            strokeSize = strokeSize,
            gapSize = gapSize,
            stopSize = stopSize,
            strokeCap = strokeCap,
            contentTextStyle = contentTextStyle
        )

    /**
     * Creates a [LinearProgressBarSizes] object with medium-sized values and styles.
     *
     * This composable function returns a [LinearProgressBarSizes] instance with the provided [strokeSize],
     * [gapSize], [stopSize], [strokeCap], and [contentTextStyle]. If no values are specified, default values
     * are used.
     *
     * @param strokeSize The size of the stroke.
     * @param gapSize The size of the gap between segments.
     * @param stopSize The size of the stop indicator.
     * @param strokeCap The stroke cap style.
     * @param contentTextStyle The text style for the content.
     */
    @Composable
    fun linearMedium(
        strokeSize: Dp = 3.dp,
        gapSize: Dp = 4.dp,
        stopSize: Dp = 3.dp,
        strokeCap: StrokeCap = StrokeCap.Round,
        contentTextStyle: TextStyle = PersianTheme.typography.labelMedium
    ): LinearProgressBarSizes =
        LinearProgressBarSizes(
            strokeSize = strokeSize,
            gapSize = gapSize,
            stopSize = stopSize,
            strokeCap = strokeCap,
            contentTextStyle = contentTextStyle
        )

    /**
     * Creates a [LinearProgressBarSizes] object with small-sized values and styles.
     *
     * This composable function returns a [LinearProgressBarSizes] instance with the provided [strokeSize],
     * [gapSize], [stopSize], [strokeCap], and [contentTextStyle]. If no values are specified, default values
     * are used.
     *
     * @param strokeSize The size of the stroke.
     * @param gapSize The size of the gap between segments.
     * @param stopSize The size of the stop indicator.
     * @param strokeCap The stroke cap style.
     * @param contentTextStyle The text style for the content.
     */
    @Composable
    fun linearSmall(
        strokeSize: Dp = 2.dp,
        gapSize: Dp = 4.dp,
        stopSize: Dp = 2.dp,
        strokeCap: StrokeCap = StrokeCap.Round,
        contentTextStyle: TextStyle = PersianTheme.typography.labelSmall.copy(fontWeight = FontWeight.Medium)
    ): LinearProgressBarSizes =
        LinearProgressBarSizes(
            strokeSize = strokeSize,
            gapSize = gapSize,
            stopSize = stopSize,
            strokeCap = strokeCap,
            contentTextStyle = contentTextStyle
        )

    /**
     * Creates a [CircularProgressBarSizes] object with large-sized values and styles.
     *
     * This composable function returns a [CircularProgressBarSizes] instance with the provided [diameter],
     * [strokeSize], [gapSize], [strokeCap], and [contentTextStyle]. If no values are specified, default values
     * are used.
     *
     * @param diameter The diameter of the circular progress bar.
     * @param strokeSize The size of the stroke.
     * @param gapSize The size of the gap between segments.
     * @param strokeCap The stroke cap style.
     * @param contentTextStyle The text style for the content.
     */
    @Composable
    fun circularLarge(
        diameter: Dp = 40.dp,
        strokeSize: Dp = 4.dp,
        gapSize: Dp = 4.dp,
        strokeCap: StrokeCap = StrokeCap.Round,
        contentTextStyle: TextStyle = PersianTheme.typography.labelLarge
    ): CircularProgressBarSizes =
        CircularProgressBarSizes(
            diameter = diameter,
            strokeWidth = strokeSize,
            gapSize = gapSize,
            strokeCap = strokeCap,
            contentTextStyle = contentTextStyle
        )

    /**
     * Creates a [CircularProgressBarSizes] object with medium-sized values and styles.
     *
     * This composable function returns a [CircularProgressBarSizes] instance with the provided [diameter],
     * [strokeSize], [gapSize], [strokeCap], and [contentTextStyle]. If no values are specified, default values
     * are used.
     *
     * @param diameter The diameter of the circular progress bar.
     * @param strokeSize The size of the stroke.
     * @param gapSize The size of the gap between segments.
     * @param strokeCap The stroke cap style.
     * @param contentTextStyle The text style for the content.
     */
    @Composable
    fun circularMedium(
        diameter: Dp = 32.dp,
        strokeSize: Dp = 3.dp,
        gapSize: Dp = 4.dp,
        strokeCap: StrokeCap = StrokeCap.Round,
        contentTextStyle: TextStyle = PersianTheme.typography.labelMedium
    ): CircularProgressBarSizes =
        CircularProgressBarSizes(
            diameter = diameter,
            strokeWidth = strokeSize,
            gapSize = gapSize,
            strokeCap = strokeCap,
            contentTextStyle = contentTextStyle
        )

    /**
     * Creates a [CircularProgressBarSizes] object with small-sized values and styles.
     *
     * This composable function returns a [CircularProgressBarSizes] instance with the provided [diameter],
     * [strokeSize], [gapSize], [strokeCap], and [contentTextStyle]. If no values are specified, default values
     * are used.
     *
     * @param diameter The diameter of the circular progress bar.
     * @param strokeSize The size of the stroke.
     * @param gapSize The size of the gap between segments.
     * @param strokeCap The stroke cap style.
     * @param contentTextStyle The text style for the content.
     */
    @Composable
    fun circularSmall(
        diameter: Dp = 24.dp,
        strokeSize: Dp = 2.dp,
        gapSize: Dp = 4.dp,
        strokeCap: StrokeCap = StrokeCap.Round,
        contentTextStyle: TextStyle = PersianTheme.typography.labelSmall.copy(fontWeight = FontWeight.Medium)
    ): CircularProgressBarSizes =
        CircularProgressBarSizes(
            diameter = diameter,
            strokeWidth = strokeSize,
            gapSize = gapSize,
            strokeCap = strokeCap,
            contentTextStyle = contentTextStyle
        )
}

/**
 * Represents the colors used in a progress bar.
 *
 * This class encapsulates the colors for the track, progress, and content of a progress bar.
 *
 * @property trackColor The color of the track.
 * @property progressColor The color of the progress.
 * @property contentColor The color of the content.
 *
 * @constructor Creates a new [ProgressBarColors] instance with the specified colors.
 */
@Immutable
class ProgressBarColors internal constructor(
    internal val trackColor: Color,
    internal val progressColor: Color,
    internal val contentColor: Color
)

/**
 * Represents the sizes and styles for a linear progress bar.
 *
 * This class is immutable and is intended to be used internally. It encapsulates various properties
 * that define the appearance of a linear progress bar, including its stroke size, gap size, stop size,
 * stroke cap style, and the text style for any content displayed within the progress bar.
 *
 * @property strokeSize The size of the stroke used to draw the progress bar, specified in Dp.
 * @property gapSize The size of the gap in the progress bar, specified in Dp.
 * @property stopSize The size of the stop in the progress bar, specified in Dp.
 * @property strokeCap The style of the stroke cap, which determines the shape of the ends of the stroke.
 * @property contentTextStyle The text style for any content displayed within the progress bar.
 *
 * @constructor Creates a new instance of [LinearProgressBarSizes] with the specified properties.
 */
@Immutable
class LinearProgressBarSizes internal constructor(
    internal val strokeSize: Dp,
    internal val gapSize: Dp,
    internal val stopSize: Dp,
    internal val strokeCap: StrokeCap,
    internal val contentTextStyle: TextStyle
)

/**
 * Represents the sizes and styles for a circular progress bar.
 *
 * This class is immutable and is intended to be used internally. It encapsulates various properties
 * that define the appearance of a circular progress bar, including its diameter, stroke width, gap size,
 * stroke cap style, and the text style for any content displayed within the progress bar.
 *
 * @property diameter The diameter of the circular progress bar, specified in Dp.
 * @property strokeWidth The width of the stroke used to draw the progress bar, specified in Dp.
 * @property gapSize The size of the gap in the progress bar, specified in Dp.
 * @property strokeCap The style of the stroke cap, which determines the shape of the ends of the stroke.
 * @property contentTextStyle The text style for any content displayed within the progress bar.
 *
 * @constructor Creates a new instance of [CircularProgressBarSizes] with the specified properties.
 */
@Immutable
class CircularProgressBarSizes internal constructor(
    internal val diameter: Dp,
    internal val strokeWidth: Dp,
    internal val gapSize: Dp,
    internal val strokeCap: StrokeCap,
    internal val contentTextStyle: TextStyle
)