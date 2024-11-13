package io.github.madmaximuus.persianSymbols.wifi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Wifi: ImageVector
    get() {
        if (wifi != null) {
            return wifi!!
        }
        wifi = Builder(
            name = "wifi-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.715f, 9.509f)
                curveTo(5.839f, 7.338f, 8.767f, 6.002f, 11.998f, 6.002f)
                curveTo(15.229f, 6.002f, 18.157f, 7.338f, 20.282f, 9.509f)
                curveTo(20.668f, 9.903f, 21.301f, 9.91f, 21.696f, 9.524f)
                curveTo(22.091f, 9.137f, 22.097f, 8.504f, 21.711f, 8.11f)
                curveTo(19.23f, 5.575f, 15.795f, 4.002f, 11.998f, 4.002f)
                curveTo(8.201f, 4.002f, 4.766f, 5.575f, 2.285f, 8.109f)
                curveTo(1.899f, 8.504f, 1.906f, 9.137f, 2.3f, 9.524f)
                curveTo(2.695f, 9.91f, 3.328f, 9.903f, 3.715f, 9.509f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.998f, 10.001f)
                curveTo(9.848f, 10.001f, 7.9f, 10.89f, 6.483f, 12.337f)
                curveTo(6.097f, 12.731f, 5.464f, 12.738f, 5.069f, 12.352f)
                curveTo(4.675f, 11.965f, 4.668f, 11.332f, 5.054f, 10.938f)
                curveTo(6.826f, 9.127f, 9.283f, 8.001f, 11.998f, 8.001f)
                curveTo(14.714f, 8.001f, 17.17f, 9.127f, 18.942f, 10.938f)
                curveTo(19.329f, 11.332f, 19.322f, 11.965f, 18.927f, 12.352f)
                curveTo(18.533f, 12.738f, 17.9f, 12.731f, 17.513f, 12.337f)
                curveTo(16.097f, 10.89f, 14.148f, 10.001f, 11.998f, 10.001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.25f, 15.166f)
                curveTo(9.958f, 14.443f, 10.929f, 14.001f, 11.998f, 14.001f)
                curveTo(13.065f, 14.001f, 14.033f, 14.44f, 14.74f, 15.16f)
                curveTo(15.127f, 15.554f, 15.76f, 15.56f, 16.154f, 15.173f)
                curveTo(16.548f, 14.786f, 16.554f, 14.153f, 16.167f, 13.759f)
                curveTo(15.104f, 12.676f, 13.629f, 12.001f, 11.998f, 12.001f)
                curveTo(10.363f, 12.001f, 8.884f, 12.68f, 7.821f, 13.768f)
                curveTo(7.434f, 14.163f, 7.441f, 14.796f, 7.836f, 15.182f)
                curveTo(8.231f, 15.568f, 8.864f, 15.561f, 9.25f, 15.166f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.998f, 20f)
                curveTo(13.079f, 20f, 13.956f, 19.105f, 13.956f, 18f)
                curveTo(13.956f, 16.896f, 13.079f, 16f, 11.998f, 16f)
                curveTo(10.917f, 16f, 10.04f, 16.896f, 10.04f, 18f)
                curveTo(10.04f, 19.105f, 10.917f, 20f, 11.998f, 20f)
                close()
            }
        }.build()
        return wifi!!
    }

private var wifi: ImageVector? = null