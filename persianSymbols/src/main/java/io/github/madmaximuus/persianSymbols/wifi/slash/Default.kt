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
                moveTo(2.285f, 8.108f)
                curveTo(2.836f, 7.546f, 3.433f, 7.031f, 4.07f, 6.57f)
                lineTo(5.506f, 8.006f)
                curveTo(4.861f, 8.445f, 4.261f, 8.948f, 3.715f, 9.507f)
                curveTo(3.328f, 9.901f, 2.695f, 9.908f, 2.3f, 9.522f)
                curveTo(1.906f, 9.135f, 1.899f, 8.502f, 2.285f, 8.108f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.331f, 4.831f)
                lineTo(8.918f, 6.418f)
                curveTo(9.9f, 6.145f, 10.932f, 6f, 11.998f, 6f)
                curveTo(15.229f, 6f, 18.157f, 7.336f, 20.282f, 9.507f)
                curveTo(20.668f, 9.901f, 21.301f, 9.908f, 21.696f, 9.522f)
                curveTo(22.091f, 9.135f, 22.097f, 8.502f, 21.711f, 8.108f)
                curveTo(19.23f, 5.573f, 15.795f, 4f, 11.998f, 4f)
                curveTo(10.359f, 4f, 8.787f, 4.293f, 7.331f, 4.831f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.054f, 10.936f)
                curveTo(5.616f, 10.361f, 6.247f, 9.856f, 6.934f, 9.434f)
                lineTo(8.398f, 10.898f)
                curveTo(7.69f, 11.276f, 7.045f, 11.761f, 6.483f, 12.335f)
                curveTo(6.097f, 12.729f, 5.464f, 12.736f, 5.069f, 12.35f)
                curveTo(4.675f, 11.964f, 4.668f, 11.33f, 5.054f, 10.936f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.6f, 8.1f)
                lineTo(12.517f, 10.017f)
                curveTo(14.46f, 10.147f, 16.212f, 11.005f, 17.513f, 12.335f)
                curveTo(17.9f, 12.729f, 18.533f, 12.736f, 18.927f, 12.35f)
                curveTo(19.322f, 11.964f, 19.329f, 11.33f, 18.942f, 10.936f)
                curveTo(17.17f, 9.125f, 14.714f, 7.999f, 11.998f, 7.999f)
                curveTo(11.524f, 7.999f, 11.057f, 8.034f, 10.6f, 8.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.528f, 14.028f)
                lineTo(9.893f, 12.393f)
                curveTo(9.107f, 12.7f, 8.402f, 13.172f, 7.821f, 13.766f)
                curveTo(7.434f, 14.161f, 7.441f, 14.794f, 7.836f, 15.18f)
                curveTo(8.231f, 15.566f, 8.864f, 15.559f, 9.25f, 15.165f)
                curveTo(9.853f, 14.549f, 10.646f, 14.137f, 11.528f, 14.028f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.998f, 19.998f)
                curveTo(13.079f, 19.998f, 13.956f, 19.103f, 13.956f, 17.998f)
                curveTo(13.956f, 16.894f, 13.079f, 15.999f, 11.998f, 15.999f)
                curveTo(10.917f, 15.999f, 10.04f, 16.894f, 10.04f, 17.998f)
                curveTo(10.04f, 19.103f, 10.917f, 19.998f, 11.998f, 19.998f)
                close()
            }
        }.build()
        return wifiSlash!!
    }

private var wifiSlash: ImageVector? = null