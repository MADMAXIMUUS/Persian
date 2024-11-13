package io.github.madmaximuus.persianSymbols.rss

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Rss: ImageVector
    get() {
        if (rss != null) {
            return rss!!
        }
        rss = Builder(
            name = "rss-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.076f, 6.035f)
                curveTo(5.381f, 6.012f, 5.689f, 6f, 6f, 6f)
                curveTo(12.628f, 6f, 18f, 11.373f, 18f, 18f)
                curveTo(18f, 18.311f, 17.988f, 18.619f, 17.965f, 18.924f)
                curveTo(17.923f, 19.475f, 18.336f, 19.955f, 18.886f, 19.997f)
                curveTo(19.437f, 20.039f, 19.917f, 19.626f, 19.959f, 19.076f)
                curveTo(19.986f, 18.721f, 20f, 18.362f, 20f, 18f)
                curveTo(20f, 10.268f, 13.732f, 4f, 6f, 4f)
                curveTo(5.638f, 4f, 5.28f, 4.014f, 4.924f, 4.041f)
                curveTo(4.374f, 4.083f, 3.961f, 4.563f, 4.003f, 5.114f)
                curveTo(4.045f, 5.664f, 4.525f, 6.077f, 5.076f, 6.035f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 10f)
                curveTo(5.699f, 10f, 5.402f, 10.017f, 5.11f, 10.049f)
                curveTo(4.561f, 10.11f, 4.067f, 9.714f, 4.006f, 9.165f)
                curveTo(3.946f, 8.616f, 4.341f, 8.122f, 4.89f, 8.061f)
                curveTo(5.255f, 8.021f, 5.625f, 8f, 6f, 8f)
                curveTo(11.523f, 8f, 16f, 12.477f, 16f, 18f)
                curveTo(16f, 18.375f, 15.979f, 18.745f, 15.939f, 19.11f)
                curveTo(15.878f, 19.659f, 15.384f, 20.055f, 14.835f, 19.994f)
                curveTo(14.286f, 19.933f, 13.891f, 19.439f, 13.951f, 18.89f)
                curveTo(13.984f, 18.598f, 14f, 18.301f, 14f, 18f)
                curveTo(14f, 13.582f, 10.418f, 10f, 6f, 10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.199f, 14.08f)
                curveTo(5.457f, 14.028f, 5.725f, 14f, 6f, 14f)
                curveTo(8.209f, 14f, 10f, 15.791f, 10f, 18f)
                curveTo(10f, 18.275f, 9.973f, 18.543f, 9.92f, 18.801f)
                curveTo(9.81f, 19.342f, 10.16f, 19.87f, 10.701f, 19.98f)
                curveTo(11.243f, 20.09f, 11.77f, 19.74f, 11.88f, 19.199f)
                curveTo(11.959f, 18.811f, 12f, 18.41f, 12f, 18f)
                curveTo(12f, 14.686f, 9.314f, 12f, 6f, 12f)
                curveTo(5.591f, 12f, 5.189f, 12.041f, 4.801f, 12.12f)
                curveTo(4.26f, 12.23f, 3.91f, 12.758f, 4.02f, 13.299f)
                curveTo(4.13f, 13.84f, 4.658f, 14.19f, 5.199f, 14.08f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 20f)
                curveTo(7.105f, 20f, 8f, 19.104f, 8f, 18f)
                curveTo(8f, 16.895f, 7.105f, 16f, 6f, 16f)
                curveTo(4.896f, 16f, 4f, 16.895f, 4f, 18f)
                curveTo(4f, 19.104f, 4.896f, 20f, 6f, 20f)
                close()
            }
        }.build()
        return rss!!
    }

private var rss: ImageVector? = null