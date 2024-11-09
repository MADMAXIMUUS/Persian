package io.github.madmaximuus.persian.slider.content

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.icon.Icon
import io.github.madmaximuus.persian.icon.IconDefaults
import io.github.madmaximuus.persian.icon.IconSizes
import io.github.madmaximuus.persian.slider.SliderColors
import io.github.madmaximuus.persian.text.Text

interface SliderContentScope {
    val enabled: Boolean
    val colors: SliderColors
}

class SliderContentScopeWrapper(
    override val enabled: Boolean,
    override val colors: SliderColors
) : SliderContentScope

@Composable
fun SliderContentScope.Text(
    modifier: Modifier = Modifier,
    text: String,
    textStyle: TextStyle = PersianTheme.typography.bodyLarge
) {
    Text(
        modifier = modifier,
        text = text,
        style = textStyle,
        color = colors.contentColor(enabled)
    )
}

@Composable
fun SliderContentScope.Icon(
    modifier: Modifier = Modifier,
    icon: Painter,
    sizes: IconSizes = IconDefaults.size28()
) {
    Icon(
        modifier = modifier,
        painter = icon,
        sizes = sizes,
        tint = colors.contentColor(enabled)
    )
}