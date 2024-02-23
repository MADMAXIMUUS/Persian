package io.github.madmaximuus.persian.iconBox

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter

@Composable
fun PersianIconBox(
    modifier: Modifier = Modifier,
    icon: Painter,
    size: IconBoxSize = PersianIconBoxDefaults.size24(),
    colors: IconBoxColors = PersianIconBoxDefaults.colors(),
    enabled: Boolean = true,
    isError: Boolean = false,
    contentDescription: String = ""
) {
    val tint = colors.iconColor(enabled = enabled, isError = isError).value
    Icon(
        modifier = modifier
            .size(size.width),
        painter = icon,
        contentDescription = contentDescription,
        tint = tint
    )
}