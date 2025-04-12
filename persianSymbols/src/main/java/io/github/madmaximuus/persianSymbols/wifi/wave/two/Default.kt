package io.github.madmaximuus.persianSymbols.wifi.wave.two

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.WifiWave2: ImageVector
    get() {
        if (wifiWave2 != null) {
            return wifiWave2!!
        }
        wifiWave2 = Builder(
            name = "wifi-wave-two-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.483f, 12.337f)
                curveTo(7.9f, 10.89f, 9.848f, 10.001f, 11.998f, 10.001f)
                curveTo(14.148f, 10.001f, 16.097f, 10.89f, 17.513f, 12.337f)
                curveTo(17.9f, 12.731f, 18.533f, 12.738f, 18.927f, 12.351f)
                curveTo(19.322f, 11.965f, 19.329f, 11.332f, 18.942f, 10.937f)
                curveTo(17.17f, 9.127f, 14.714f, 8.001f, 11.998f, 8.001f)
                curveTo(9.283f, 8.001f, 6.826f, 9.127f, 5.054f, 10.937f)
                curveTo(4.668f, 11.332f, 4.675f, 11.965f, 5.069f, 12.351f)
                curveTo(5.464f, 12.738f, 6.097f, 12.731f, 6.483f, 12.337f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.998f, 14.001f)
                curveTo(10.929f, 14.001f, 9.958f, 14.443f, 9.25f, 15.166f)
                curveTo(8.864f, 15.561f, 8.231f, 15.568f, 7.836f, 15.182f)
                curveTo(7.441f, 14.796f, 7.434f, 14.163f, 7.821f, 13.768f)
                curveTo(8.884f, 12.68f, 10.363f, 12.001f, 11.998f, 12.001f)
                curveTo(13.629f, 12.001f, 15.104f, 12.676f, 16.167f, 13.759f)
                curveTo(16.554f, 14.153f, 16.548f, 14.786f, 16.154f, 15.173f)
                curveTo(15.76f, 15.56f, 15.127f, 15.554f, 14.74f, 15.16f)
                curveTo(14.033f, 14.44f, 13.065f, 14.001f, 11.998f, 14.001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.956f, 18f)
                curveTo(13.956f, 19.105f, 13.079f, 20f, 11.998f, 20f)
                curveTo(10.917f, 20f, 10.04f, 19.105f, 10.04f, 18f)
                curveTo(10.04f, 16.896f, 10.917f, 16f, 11.998f, 16f)
                curveTo(13.079f, 16f, 13.956f, 16.896f, 13.956f, 18f)
                close()
            }
        }.build()
        return wifiWave2!!
    }

private var wifiWave2: ImageVector? = null