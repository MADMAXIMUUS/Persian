package io.github.madmaximuus.persianSymbols.device.mobile.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.DeviceMobileSlash: ImageVector
    get() {
        if (deviceMobileSlash != null) {
            return deviceMobileSlash!!
        }
        deviceMobileSlash = ImageVector.Builder(
            name = "device-mobile-slash-filled",
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
                moveTo(6f, 17f)
                verticalLineTo(8.475f)
                lineTo(14.525f, 17f)
                horizontalLineTo(6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.743f, 20.218f)
                lineTo(16.025f, 18.5f)
                horizontalLineTo(6f)
                verticalLineTo(19f)
                curveTo(6f, 20.657f, 7.343f, 22f, 9f, 22f)
                horizontalLineTo(15f)
                curveTo(16.223f, 22f, 17.276f, 21.268f, 17.743f, 20.218f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.975f, 6.5f)
                lineTo(18f, 15.525f)
                verticalLineTo(6.5f)
                horizontalLineTo(8.975f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 5f)
                horizontalLineTo(7.475f)
                lineTo(6.257f, 3.782f)
                curveTo(6.724f, 2.732f, 7.777f, 2f, 9f, 2f)
                horizontalLineTo(15f)
                curveTo(16.657f, 2f, 18f, 3.343f, 18f, 5f)
                close()
            }
        }.build()

        return deviceMobileSlash!!
    }

private var deviceMobileSlash: ImageVector? = null