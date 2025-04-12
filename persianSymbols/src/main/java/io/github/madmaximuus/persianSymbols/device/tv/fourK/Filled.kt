package io.github.madmaximuus.persianSymbols.device.tv.fourK

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.DeviceTv4K: ImageVector
    get() {
        if (deviceTv4K != null) {
            return deviceTv4K!!
        }
        deviceTv4K = ImageVector.Builder(
            name = "device-tv-four-k-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.4f, 2f)
                curveTo(3.97f, 2f, 2f, 3.97f, 2f, 6.4f)
                verticalLineTo(13.6f)
                curveTo(2f, 15.489f, 3.19f, 17.1f, 4.862f, 17.724f)
                lineTo(4.293f, 18.293f)
                curveTo(3.902f, 18.683f, 3.902f, 19.317f, 4.293f, 19.707f)
                curveTo(4.683f, 20.098f, 5.317f, 20.098f, 5.707f, 19.707f)
                lineTo(7.414f, 18f)
                horizontalLineTo(16.586f)
                lineTo(18.293f, 19.707f)
                curveTo(18.683f, 20.098f, 19.317f, 20.098f, 19.707f, 19.707f)
                curveTo(20.098f, 19.317f, 20.098f, 18.683f, 19.707f, 18.293f)
                lineTo(19.138f, 17.724f)
                curveTo(20.81f, 17.1f, 22f, 15.489f, 22f, 13.6f)
                verticalLineTo(6.4f)
                curveTo(22f, 3.97f, 20.03f, 2f, 17.6f, 2f)
                horizontalLineTo(6.4f)
                close()
            }
        }.build()

        return deviceTv4K!!
    }

private var deviceTv4K: ImageVector? = null