package io.github.madmaximuus.persianSymbols.device.mobile

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.DeviceMobile: ImageVector
    get() {
        if (deviceMobile != null) {
            return deviceMobile!!
        }
        deviceMobile = Builder(
            name = "device-mobile-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 5f)
                curveTo(6f, 3.343f, 7.343f, 2f, 9f, 2f)
                horizontalLineTo(15f)
                curveTo(16.657f, 2f, 18f, 3.343f, 18f, 5f)
                horizontalLineTo(6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 6.5f)
                horizontalLineTo(18f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                verticalLineTo(6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 18.5f)
                verticalLineTo(19f)
                curveTo(6f, 20.657f, 7.343f, 22f, 9f, 22f)
                horizontalLineTo(15f)
                curveTo(16.657f, 22f, 18f, 20.657f, 18f, 19f)
                verticalLineTo(18.5f)
                horizontalLineTo(6f)
                close()
            }
        }.build()
        return deviceMobile!!
    }

private var deviceMobile: ImageVector? = null