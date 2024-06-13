package io.github.madmaximuus.persian.iconBox

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import io.github.madmaximuus.persian.foundation.LocalContentColor

@Composable
fun PersianIconBox(
    modifier: Modifier = Modifier,
    icon: Painter,
    size: IconBoxSize = PersianIconBoxDefaults.size24(),
    contentDescription: String = ""
) {
    Icon(
        modifier = modifier
            .size(size.width),
        painter = icon,
        contentDescription = contentDescription,
        tint = LocalContentColor.current
    )
}