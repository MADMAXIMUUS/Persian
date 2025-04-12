package io.github.madmaximuus.persianSymbols.wifi.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.WifiSlash: ImageVector
    get() {
        if (wifiSlash != null) {
            return wifiSlash!!
        }
        wifiSlash = Builder(
            name = "wifi-slash-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.707f, 2.293f)
                curveTo(3.317f, 1.902f, 2.683f, 1.902f, 2.293f, 2.293f)
                curveTo(1.902f, 2.683f, 1.902f, 3.317f, 2.293f, 3.707f)
                lineTo(20.293f, 21.707f)
                curveTo(20.683f, 22.098f, 21.317f, 22.098f, 21.707f, 21.707f)
                curveTo(22.098f, 21.317f, 22.098f, 20.683f, 21.707f, 20.293f)
                lineTo(3.707f, 2.293f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.285f, 8.106f)
                curveTo(2.839f, 7.54f, 3.441f, 7.022f, 4.084f, 6.559f)
                lineTo(5.519f, 7.994f)
                curveTo(4.87f, 8.436f, 4.265f, 8.942f, 3.715f, 9.505f)
                curveTo(3.328f, 9.899f, 2.695f, 9.906f, 2.3f, 9.52f)
                curveTo(1.906f, 9.134f, 1.899f, 8.5f, 2.285f, 8.106f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.054f, 10.934f)
                curveTo(5.62f, 10.356f, 6.256f, 9.847f, 6.948f, 9.423f)
                lineTo(8.413f, 10.888f)
                curveTo(7.699f, 11.267f, 7.049f, 11.755f, 6.483f, 12.333f)
                curveTo(6.097f, 12.728f, 5.464f, 12.734f, 5.069f, 12.348f)
                curveTo(4.675f, 11.962f, 4.668f, 11.328f, 5.054f, 10.934f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.577f, 8.102f)
                lineTo(12.488f, 10.013f)
                curveTo(14.443f, 10.137f, 16.205f, 10.997f, 17.513f, 12.333f)
                curveTo(17.9f, 12.728f, 18.533f, 12.734f, 18.927f, 12.348f)
                curveTo(19.322f, 11.962f, 19.329f, 11.328f, 18.942f, 10.934f)
                curveTo(17.17f, 9.123f, 14.714f, 7.998f, 11.998f, 7.998f)
                curveTo(11.515f, 7.998f, 11.041f, 8.033f, 10.577f, 8.102f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.549f, 14.024f)
                lineTo(9.91f, 12.385f)
                curveTo(9.117f, 12.691f, 8.406f, 13.166f, 7.821f, 13.764f)
                curveTo(7.434f, 14.159f, 7.441f, 14.792f, 7.836f, 15.179f)
                curveTo(8.231f, 15.565f, 8.864f, 15.558f, 9.25f, 15.163f)
                curveTo(9.858f, 14.542f, 10.658f, 14.128f, 11.549f, 14.024f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.311f, 4.836f)
                lineTo(8.897f, 6.422f)
                curveTo(9.885f, 6.146f, 10.925f, 5.998f, 11.998f, 5.998f)
                curveTo(15.229f, 5.998f, 18.157f, 7.335f, 20.282f, 9.505f)
                curveTo(20.668f, 9.9f, 21.301f, 9.906f, 21.696f, 9.52f)
                curveTo(22.091f, 9.134f, 22.097f, 8.5f, 21.711f, 8.106f)
                curveTo(19.23f, 5.572f, 15.795f, 3.998f, 11.998f, 3.998f)
                curveTo(10.351f, 3.998f, 8.773f, 4.294f, 7.311f, 4.836f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.998f, 19.996f)
                curveTo(13.079f, 19.996f, 13.956f, 19.101f, 13.956f, 17.997f)
                curveTo(13.956f, 16.892f, 13.079f, 15.997f, 11.998f, 15.997f)
                curveTo(10.917f, 15.997f, 10.04f, 16.892f, 10.04f, 17.997f)
                curveTo(10.04f, 19.101f, 10.917f, 19.996f, 11.998f, 19.996f)
                close()
            }
        }.build()
        return wifiSlash!!
    }

private var wifiSlash: ImageVector? = null