package io.github.madmaximuus.persianSymbols.wifi.two

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Wifi2: ImageVector
    get() {
        if (wifi2 != null) {
            return wifi2!!
        }
        wifi2 = Builder(
            name = "wifi-2-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.25f, 15.166f)
                curveTo(9.958f, 14.443f, 10.929f, 14.001f, 11.998f, 14.001f)
                curveTo(13.065f, 14.001f, 14.033f, 14.44f, 14.74f, 15.16f)
                curveTo(15.127f, 15.554f, 15.76f, 15.56f, 16.154f, 15.173f)
                curveTo(16.548f, 14.786f, 16.554f, 14.153f, 16.167f, 13.759f)
                curveTo(15.104f, 12.676f, 13.629f, 12.001f, 11.998f, 12.001f)
                curveTo(10.363f, 12.001f, 8.885f, 12.68f, 7.821f, 13.768f)
                curveTo(7.434f, 14.163f, 7.442f, 14.796f, 7.836f, 15.182f)
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
        return wifi2!!
    }

private var wifi2: ImageVector? = null