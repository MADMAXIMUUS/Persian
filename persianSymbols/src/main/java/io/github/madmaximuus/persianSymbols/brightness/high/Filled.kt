package io.github.madmaximuus.persianSymbols.brightness.high

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.BrightnessHigh: ImageVector
    get() {
        if (brightnessHigh != null) {
            return brightnessHigh!!
        }
        brightnessHigh = Builder(
            name = "brightness-high-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.415f, 3.418f)
                curveTo(12.634f, 2.635f, 11.366f, 2.635f, 10.585f, 3.418f)
                lineTo(9.659f, 4.345f)
                curveTo(9.284f, 4.721f, 8.774f, 4.932f, 8.242f, 4.931f)
                lineTo(6.932f, 4.93f)
                curveTo(5.826f, 4.929f, 4.93f, 5.826f, 4.931f, 6.932f)
                lineTo(4.932f, 8.242f)
                curveTo(4.932f, 8.774f, 4.721f, 9.283f, 4.345f, 9.659f)
                lineTo(3.418f, 10.585f)
                curveTo(2.635f, 11.366f, 2.635f, 12.634f, 3.418f, 13.415f)
                lineTo(4.345f, 14.341f)
                curveTo(4.721f, 14.716f, 4.932f, 15.226f, 4.932f, 15.758f)
                lineTo(4.931f, 17.068f)
                curveTo(4.93f, 18.174f, 5.826f, 19.07f, 6.932f, 19.069f)
                lineTo(8.242f, 19.068f)
                curveTo(8.774f, 19.068f, 9.284f, 19.279f, 9.659f, 19.655f)
                lineTo(10.585f, 20.582f)
                curveTo(11.366f, 21.365f, 12.634f, 21.365f, 13.415f, 20.582f)
                lineTo(14.341f, 19.655f)
                curveTo(14.716f, 19.279f, 15.226f, 19.068f, 15.758f, 19.068f)
                lineTo(17.068f, 19.069f)
                curveTo(18.174f, 19.07f, 19.07f, 18.174f, 19.069f, 17.068f)
                lineTo(19.068f, 15.758f)
                curveTo(19.068f, 15.226f, 19.279f, 14.716f, 19.655f, 14.341f)
                lineTo(20.582f, 13.415f)
                curveTo(21.365f, 12.634f, 21.365f, 11.366f, 20.582f, 10.585f)
                lineTo(19.655f, 9.659f)
                curveTo(19.279f, 9.283f, 19.068f, 8.774f, 19.068f, 8.242f)
                lineTo(19.069f, 6.932f)
                curveTo(19.07f, 5.826f, 18.174f, 4.929f, 17.068f, 4.93f)
                lineTo(15.758f, 4.931f)
                curveTo(15.226f, 4.932f, 14.716f, 4.721f, 14.341f, 4.345f)
                lineTo(13.415f, 3.418f)
                close()
                moveTo(12f, 17f)
                curveTo(14.761f, 17f, 17f, 14.761f, 17f, 12f)
                curveTo(17f, 9.238f, 14.761f, 7f, 12f, 7f)
                curveTo(9.239f, 7f, 7f, 9.238f, 7f, 12f)
                curveTo(7f, 14.761f, 9.239f, 17f, 12f, 17f)
                close()
            }
        }.build()
        return brightnessHigh!!
    }

private var brightnessHigh: ImageVector? = null