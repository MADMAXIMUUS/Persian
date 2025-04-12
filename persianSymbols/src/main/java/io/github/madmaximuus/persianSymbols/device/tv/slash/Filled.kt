package io.github.madmaximuus.persianSymbols.device.tv.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.DeviceTvSlash: ImageVector
    get() {
        if (deviceTvSlash != null) {
            return deviceTvSlash!!
        }
        deviceTvSlash = ImageVector.Builder(
            name = "device-tv-slash-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.4f, 2f)
                curveTo(5.819f, 2f, 5.264f, 2.113f, 4.756f, 2.318f)
                curveTo(4.837f, 2.375f, 4.915f, 2.44f, 4.987f, 2.513f)
                lineTo(19.854f, 17.379f)
                curveTo(21.139f, 16.611f, 22f, 15.206f, 22f, 13.6f)
                verticalLineTo(6.4f)
                curveTo(22f, 3.97f, 20.03f, 2f, 17.6f, 2f)
                horizontalLineTo(6.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2f, 6.4f)
                curveTo(2f, 5.819f, 2.113f, 5.264f, 2.318f, 4.756f)
                curveTo(2.375f, 4.837f, 2.44f, 4.915f, 2.513f, 4.987f)
                lineTo(15.525f, 18f)
                horizontalLineTo(7.414f)
                lineTo(5.707f, 19.707f)
                curveTo(5.317f, 20.098f, 4.683f, 20.098f, 4.293f, 19.707f)
                curveTo(3.902f, 19.317f, 3.902f, 18.683f, 4.293f, 18.293f)
                lineTo(4.862f, 17.724f)
                curveTo(3.19f, 17.1f, 2f, 15.489f, 2f, 13.6f)
                verticalLineTo(6.4f)
                close()
            }
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
        }.build()

        return deviceTvSlash!!
    }

private var deviceTvSlash: ImageVector? = null