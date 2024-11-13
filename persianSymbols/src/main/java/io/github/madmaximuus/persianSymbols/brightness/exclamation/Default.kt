package io.github.madmaximuus.persianSymbols.brightness.exclamation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.BrightnessExclamation: ImageVector
    get() {
        if (brightnessExclamation != null) {
            return brightnessExclamation!!
        }
        brightnessExclamation = Builder(
            name = "brightness-exclamation-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 7.205f)
                curveTo(12.414f, 7.205f, 12.75f, 7.541f, 12.75f, 7.955f)
                lineTo(12.75f, 13.429f)
                curveTo(12.75f, 13.843f, 12.414f, 14.179f, 12f, 14.179f)
                curveTo(11.586f, 14.179f, 11.25f, 13.843f, 11.25f, 13.429f)
                lineTo(11.25f, 7.955f)
                curveTo(11.25f, 7.541f, 11.586f, 7.205f, 12f, 7.205f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.002f, 15.795f)
                curveTo(13.002f, 16.347f, 12.554f, 16.795f, 12.002f, 16.795f)
                curveTo(11.45f, 16.795f, 11.002f, 16.347f, 11.002f, 15.795f)
                curveTo(11.002f, 15.243f, 11.45f, 14.795f, 12.002f, 14.795f)
                curveTo(12.554f, 14.795f, 13.002f, 15.243f, 13.002f, 15.795f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.771f, 3.359f)
                curveTo(12.795f, 2.38f, 11.209f, 2.38f, 10.233f, 3.359f)
                lineTo(9.099f, 4.494f)
                curveTo(9.006f, 4.588f, 8.878f, 4.641f, 8.745f, 4.641f)
                lineTo(7.141f, 4.639f)
                curveTo(5.759f, 4.638f, 4.638f, 5.759f, 4.639f, 7.141f)
                lineTo(4.641f, 8.745f)
                curveTo(4.641f, 8.878f, 4.588f, 9.006f, 4.494f, 9.099f)
                lineTo(3.359f, 10.233f)
                curveTo(2.38f, 11.209f, 2.38f, 12.795f, 3.359f, 13.771f)
                lineTo(4.494f, 14.904f)
                curveTo(4.588f, 14.998f, 4.641f, 15.126f, 4.641f, 15.259f)
                lineTo(4.639f, 16.863f)
                curveTo(4.638f, 18.245f, 5.759f, 19.366f, 7.141f, 19.365f)
                lineTo(8.745f, 19.363f)
                curveTo(8.878f, 19.363f, 9.006f, 19.416f, 9.099f, 19.51f)
                lineTo(10.233f, 20.645f)
                curveTo(11.209f, 21.623f, 12.795f, 21.623f, 13.771f, 20.645f)
                lineTo(14.904f, 19.51f)
                curveTo(14.998f, 19.416f, 15.126f, 19.363f, 15.259f, 19.363f)
                lineTo(16.863f, 19.365f)
                curveTo(18.245f, 19.366f, 19.366f, 18.245f, 19.365f, 16.863f)
                lineTo(19.363f, 15.259f)
                curveTo(19.363f, 15.126f, 19.416f, 14.998f, 19.51f, 14.904f)
                lineTo(20.645f, 13.771f)
                curveTo(21.623f, 12.795f, 21.623f, 11.209f, 20.645f, 10.233f)
                lineTo(19.51f, 9.099f)
                curveTo(19.416f, 9.006f, 19.363f, 8.878f, 19.363f, 8.745f)
                lineTo(19.365f, 7.141f)
                curveTo(19.366f, 5.759f, 18.245f, 4.638f, 16.863f, 4.639f)
                lineTo(15.259f, 4.641f)
                curveTo(15.126f, 4.641f, 14.998f, 4.588f, 14.904f, 4.494f)
                lineTo(13.771f, 3.359f)
                close()
                moveTo(11.648f, 4.772f)
                curveTo(11.843f, 4.576f, 12.16f, 4.576f, 12.356f, 4.772f)
                lineTo(13.489f, 5.907f)
                curveTo(13.958f, 6.377f, 14.596f, 6.641f, 15.26f, 6.641f)
                lineTo(16.864f, 6.639f)
                curveTo(17.141f, 6.639f, 17.365f, 6.863f, 17.365f, 7.14f)
                lineTo(17.363f, 8.744f)
                curveTo(17.363f, 9.408f, 17.627f, 10.045f, 18.097f, 10.515f)
                lineTo(19.232f, 11.648f)
                curveTo(19.428f, 11.843f, 19.428f, 12.16f, 19.232f, 12.356f)
                lineTo(18.097f, 13.489f)
                curveTo(17.627f, 13.958f, 17.363f, 14.596f, 17.363f, 15.26f)
                lineTo(17.365f, 16.864f)
                curveTo(17.365f, 17.141f, 17.141f, 17.365f, 16.864f, 17.365f)
                lineTo(15.26f, 17.363f)
                curveTo(14.596f, 17.363f, 13.958f, 17.627f, 13.489f, 18.097f)
                lineTo(12.356f, 19.232f)
                curveTo(12.16f, 19.428f, 11.843f, 19.428f, 11.648f, 19.232f)
                lineTo(10.515f, 18.097f)
                curveTo(10.045f, 17.627f, 9.408f, 17.363f, 8.744f, 17.363f)
                lineTo(7.14f, 17.365f)
                curveTo(6.863f, 17.365f, 6.639f, 17.141f, 6.639f, 16.864f)
                lineTo(6.641f, 15.26f)
                curveTo(6.641f, 14.596f, 6.377f, 13.958f, 5.907f, 13.489f)
                lineTo(4.772f, 12.356f)
                curveTo(4.576f, 12.16f, 4.576f, 11.843f, 4.772f, 11.648f)
                lineTo(5.907f, 10.515f)
                curveTo(6.377f, 10.045f, 6.641f, 9.408f, 6.641f, 8.744f)
                lineTo(6.639f, 7.14f)
                curveTo(6.639f, 6.863f, 6.863f, 6.639f, 7.14f, 6.639f)
                lineTo(8.744f, 6.641f)
                curveTo(9.408f, 6.641f, 10.045f, 6.377f, 10.515f, 5.907f)
                lineTo(11.648f, 4.772f)
                close()
            }
        }.build()
        return brightnessExclamation!!
    }

private var brightnessExclamation: ImageVector? = null