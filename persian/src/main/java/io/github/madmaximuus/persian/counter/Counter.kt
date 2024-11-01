package io.github.madmaximuus.persian.counter

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persian.text.Text

/**
 * A counter is useful for displaying important information or status updates in a compact and visually
 * appealing manner, providing users with quick and easy access to relevant data. It offers
 * a straightforward and effective method for conveying notifications, alerts, or achievements,
 * making it an essential tool for enhancing user experience.
 *
 * @param count The count to be displayed in the counter.
 * @param modifier The [Modifier] to be applied to this composable.
 * @param colors The color configurations for the counter.
 * @param sizes The size configurations for the counter.
 */
@Composable
fun ErrorCounter(
    count: Int,
    modifier: Modifier = Modifier,
    colors: CounterColors = CounterDefaults.errorColors(),
    sizes: CounterSizes = CounterDefaults.sizes()
) = CounterImpl(
    modifier = modifier,
    count = count,
    colors = colors,
    sizes = sizes
)

/**
 * A counter is useful for displaying important information or status updates in a compact and visually
 * appealing manner, providing users with quick and easy access to relevant data. It offers
 * a straightforward and effective method for conveying notifications, alerts, or achievements,
 * making it an essential tool for enhancing user experience.
 *
 * @param count The count to be displayed in the counter.
 * @param modifier The [Modifier] to be applied to this composable.
 * @param colors The color configurations for the counter.
 * @param sizes The size configurations for the counter.
 */
@Composable
fun PrimaryCounter(
    count: Int,
    modifier: Modifier = Modifier,
    colors: CounterColors = CounterDefaults.primaryColors(),
    sizes: CounterSizes = CounterDefaults.sizes()
) = CounterImpl(
    modifier = modifier,
    count = count,
    colors = colors,
    sizes = sizes
)

/**
 * A counter is useful for displaying important information or status updates in a compact and visually
 * appealing manner, providing users with quick and easy access to relevant data. It offers
 * a straightforward and effective method for conveying notifications, alerts, or achievements,
 * making it an essential tool for enhancing user experience.
 *
 * @param count The count to be displayed in the counter.
 * @param modifier The [Modifier] to be applied to this composable.
 * @param colors The color configurations for the counter.
 * @param sizes The size configurations for the counter.
 */
@Composable
fun SecondaryCounter(
    count: Int,
    modifier: Modifier = Modifier,
    colors: CounterColors = CounterDefaults.secondaryColors(),
    sizes: CounterSizes = CounterDefaults.sizes()
) = CounterImpl(
    modifier = modifier,
    count = count,
    colors = colors,
    sizes = sizes
)

/**
 * A counter is useful for displaying important information or status updates in a compact and visually
 * appealing manner, providing users with quick and easy access to relevant data. It offers
 * a straightforward and effective method for conveying notifications, alerts, or achievements,
 * making it an essential tool for enhancing user experience.
 *
 * @param count The count to be displayed in the counter.
 * @param modifier The [Modifier] to be applied to this composable.
 * @param colors The color configurations for the counter.
 * @param sizes The size configurations for the counter.
 */
@Composable
fun TertiaryCounter(
    count: Int,
    modifier: Modifier = Modifier,
    colors: CounterColors = CounterDefaults.tertiaryColors(),
    sizes: CounterSizes = CounterDefaults.sizes()
) = CounterImpl(
    modifier = modifier,
    count = count,
    colors = colors,
    sizes = sizes
)

/**
 * Base implementation for a counter.
 *
 * @param count The count to be displayed in the counter.
 * @param colors The color configurations for the counter.
 * @param sizes The size configurations for the counter.
 * @param modifier The [Modifier] to be applied to this composable.
 */
@Composable
internal fun CounterImpl(
    count: Int,
    colors: CounterColors,
    sizes: CounterSizes,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .widthIn(min = 24.dp)
            .height(24.dp)
            .background(
                color = colors.containerColor,
                shape = sizes.shape
            )
            .clip(sizes.shape)
            .padding(sizes.contentPadding),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = if (count > 99) "99+" else count.toString(),
            color = colors.contentColor,
            style = sizes.textStyle,
            textAlign = TextAlign.Center
        )
    }
}