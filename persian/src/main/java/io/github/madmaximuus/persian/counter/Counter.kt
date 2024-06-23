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

@Composable
fun Counter(
    count: Int,
    modifier: Modifier = Modifier,
    colors: CounterColors = CounterDefaults.primaryColors(),
    sizes: CounterSizes = CounterDefaults.digitSizes()
) = CounterImpl(
    modifier = modifier,
    count = count,
    colors = colors,
    sizes = sizes
)

@Composable
fun TonalCounter(
    count: Int,
    modifier: Modifier = Modifier,
    colors: CounterColors = CounterDefaults.tonalColors(),
    sizes: CounterSizes = CounterDefaults.digitSizes()
) = CounterImpl(
    modifier = modifier,
    count = count,
    colors = colors,
    sizes = sizes
)

@Composable
fun TransparentCounter(
    count: Int,
    modifier: Modifier = Modifier,
    colors: CounterColors = CounterDefaults.transparentColors(),
    sizes: CounterSizes = CounterDefaults.digitSizes()
) = CounterImpl(
    modifier = modifier,
    count = count,
    colors = colors,
    sizes = sizes
)

@Composable
private fun CounterImpl(
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
                color = colors.backgroundColor,
                shape = sizes.digitCornerRadius
            )
            .clip(sizes.digitCornerRadius)
            .padding(sizes.digitPadding),
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