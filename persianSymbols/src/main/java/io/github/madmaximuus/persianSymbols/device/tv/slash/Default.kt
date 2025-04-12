package io.github.madmaximuus.persianSymbols.device.tv.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.DeviceTvSlash: ImageVector
    get() {
        if (deviceTvSlash != null) {
            return deviceTvSlash!!
        }
        deviceTvSlash = ImageVector.Builder(
            name = "device-tv-slash-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
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
                moveTo(2f, 7.5f)
                curveTo(2f, 6.635f, 2.244f, 5.827f, 2.667f, 5.142f)
                lineTo(4.155f, 6.63f)
                curveTo(4.055f, 6.901f, 4f, 7.194f, 4f, 7.5f)
                verticalLineTo(14.5f)
                curveTo(4f, 15.881f, 5.119f, 17f, 6.5f, 17f)
                horizontalLineTo(14.525f)
                lineTo(16.525f, 19f)
                horizontalLineTo(7.414f)
                lineTo(5.707f, 20.707f)
                curveTo(5.317f, 21.098f, 4.683f, 21.098f, 4.293f, 20.707f)
                curveTo(3.902f, 20.317f, 3.902f, 19.683f, 4.293f, 19.293f)
                lineTo(4.884f, 18.701f)
                curveTo(3.197f, 18.052f, 2f, 16.416f, 2f, 14.5f)
                verticalLineTo(7.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 14.5f)
                curveTo(20f, 15.324f, 19.601f, 16.055f, 18.986f, 16.511f)
                lineTo(20.409f, 17.934f)
                curveTo(21.382f, 17.108f, 22f, 15.876f, 22f, 14.5f)
                verticalLineTo(7.5f)
                curveTo(22f, 5.015f, 19.985f, 3f, 17.5f, 3f)
                horizontalLineTo(6.5f)
                curveTo(6.181f, 3f, 5.871f, 3.033f, 5.571f, 3.096f)
                lineTo(7.475f, 5f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 5f, 20f, 6.119f, 20f, 7.5f)
                verticalLineTo(14.5f)
                close()
            }
        }.build()

        return deviceTvSlash!!
    }

private var deviceTvSlash: ImageVector? = null