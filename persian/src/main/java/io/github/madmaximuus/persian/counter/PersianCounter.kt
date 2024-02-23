package io.github.madmaximuus.persian.counter

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip

@Composable
fun PersianCounter(
    count: Int,
    modifier: Modifier = Modifier,
    colors: CounterColors = PersianCounterDefaults.colors(),
    sizes: CounterSizes = PersianCounterDefaults.sizes()
) = PersianCounterImpl(
    modifier = modifier,
    count = count,
    colors = colors,
    sizes = sizes
)

@Composable
fun PersianTonalCounter(
    count: Int,
    modifier: Modifier = Modifier,
    colors: CounterColors = PersianCounterDefaults.tonalColors(),
    sizes: CounterSizes = PersianCounterDefaults.sizes()
) = PersianCounterImpl(
    modifier = modifier,
    count = count,
    colors = colors,
    sizes = sizes
)

@Composable
fun PersianTransparentCounter(
    count: Int,
    modifier: Modifier = Modifier,
    colors: CounterColors = PersianCounterDefaults.transparentColors(),
    sizes: CounterSizes = PersianCounterDefaults.sizes()
) = PersianCounterImpl(
    modifier = modifier,
    count = count,
    colors = colors,
    sizes = sizes
)

@Composable
private fun PersianCounterImpl(
    count: Int,
    colors: CounterColors,
    sizes: CounterSizes,
    modifier: Modifier = Modifier
) {
    val shape = if (count == 1) CircleShape else sizes.cornerRadius
    Row(
        modifier = modifier
            .background(
                color = colors.backgroundColor,
                shape = shape
            )
            .clip(shape)
            .padding(
                horizontal = sizes.horizontalPadding, vertical = sizes.verticalPadding
            ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = if (count > 99) "99+" else count.toString(),
            color = colors.textColor,
            style = sizes.textStyle
        )
    }
}