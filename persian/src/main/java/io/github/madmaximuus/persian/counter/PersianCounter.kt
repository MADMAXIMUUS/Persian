package io.github.madmaximuus.persian.counter

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

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
    require(count > 0) {
        throw IllegalArgumentException("Count must be positive")
    }
    Box(
        modifier = modifier
            .padding(sizes.outerPadding(count))
            .size(34.dp, 24.dp),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .background(
                    color = colors.backgroundColor,
                    shape = sizes.cornerRadius(count)
                )
                .clip(sizes.cornerRadius(count))
                .padding(sizes.innerPadding(count)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = if (count > 99) "99+" else count.toString(),
                color = colors.textColor,
                style = sizes.textStyle,
                textAlign = TextAlign.Center
            )
        }
    }
}