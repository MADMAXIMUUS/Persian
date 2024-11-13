package io.github.madmaximuus.persianSymbols.xmark

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.XMark: ImageVector
    get() {
        if (xMark != null) {
            return xMark!!
        }
        xMark = ImageVector.Builder(
            name = "xMark-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.925f, 17.66f)
                curveTo(4.535f, 18.051f, 4.536f, 18.683f, 4.929f, 19.071f)
                curveTo(5.321f, 19.46f, 5.956f, 19.458f, 6.347f, 19.067f)
                lineTo(12f, 13.414f)
                lineTo(17.653f, 19.067f)
                curveTo(18.044f, 19.458f, 18.679f, 19.46f, 19.071f, 19.071f)
                curveTo(19.463f, 18.683f, 19.465f, 18.051f, 19.075f, 17.66f)
                lineTo(13.414f, 12f)
                lineTo(19.075f, 6.34f)
                curveTo(19.465f, 5.949f, 19.463f, 5.318f, 19.071f, 4.929f)
                curveTo(18.679f, 4.54f, 18.044f, 4.542f, 17.653f, 4.932f)
                lineTo(12f, 10.586f)
                lineTo(6.347f, 4.932f)
                curveTo(5.956f, 4.542f, 5.321f, 4.54f, 4.929f, 4.929f)
                curveTo(4.536f, 5.318f, 4.535f, 5.949f, 4.925f, 6.34f)
                lineTo(10.586f, 12f)
                lineTo(4.925f, 17.66f)
                close()
            }
        }.build()
        return xMark!!
    }

private var xMark: ImageVector? = null