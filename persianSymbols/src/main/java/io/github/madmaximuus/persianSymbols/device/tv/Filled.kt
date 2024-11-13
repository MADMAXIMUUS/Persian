package io.github.madmaximuus.persianSymbols.device.tv

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.DeviceTv: ImageVector
    get() {
        if (deviceTv != null) {
            return deviceTv!!
        }
        deviceTv = Builder(
            name = "device-tv-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.4f, 3f)
                curveTo(3.97f, 3f, 2f, 4.97f, 2f, 7.4f)
                verticalLineTo(14.6f)
                curveTo(2f, 16.489f, 3.19f, 18.1f, 4.862f, 18.724f)
                lineTo(4.293f, 19.293f)
                curveTo(3.902f, 19.683f, 3.902f, 20.317f, 4.293f, 20.707f)
                curveTo(4.683f, 21.098f, 5.317f, 21.098f, 5.707f, 20.707f)
                lineTo(7.414f, 19f)
                horizontalLineTo(16.586f)
                lineTo(18.293f, 20.707f)
                curveTo(18.683f, 21.098f, 19.317f, 21.098f, 19.707f, 20.707f)
                curveTo(20.098f, 20.317f, 20.098f, 19.683f, 19.707f, 19.293f)
                lineTo(19.138f, 18.724f)
                curveTo(20.81f, 18.1f, 22f, 16.489f, 22f, 14.6f)
                verticalLineTo(7.4f)
                curveTo(22f, 4.97f, 20.03f, 3f, 17.6f, 3f)
                horizontalLineTo(6.4f)
                close()
            }
        }.build()
        return deviceTv!!
    }

private var deviceTv: ImageVector? = null