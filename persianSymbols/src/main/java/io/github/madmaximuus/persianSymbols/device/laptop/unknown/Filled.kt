package io.github.madmaximuus.persianSymbols.device.laptop.unknown

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.DeviceLaptopUnknown: ImageVector
    get() {
        if (deviceLaptopUnknown != null) {
            return deviceLaptopUnknown!!
        }
        deviceLaptopUnknown = Builder(
            name = "device-laptop-unknown-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.4f, 4f)
                curveTo(3.97f, 4f, 2f, 5.97f, 2f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(2f, 16.97f, 2.626f, 18.193f, 3.607f, 19f)
                horizontalLineTo(2.4f)
                curveTo(2.179f, 19f, 2f, 19.179f, 2f, 19.4f)
                verticalLineTo(20f)
                curveTo(2f, 20.552f, 2.448f, 21f, 3f, 21f)
                horizontalLineTo(21f)
                curveTo(21.552f, 21f, 22f, 20.552f, 22f, 20f)
                verticalLineTo(19.4f)
                curveTo(22f, 19.179f, 21.821f, 19f, 21.6f, 19f)
                horizontalLineTo(20.393f)
                curveTo(21.374f, 18.193f, 22f, 16.97f, 22f, 15.6f)
                verticalLineTo(8.4f)
                curveTo(22f, 5.97f, 20.03f, 4f, 17.6f, 4f)
                horizontalLineTo(6.4f)
                close()
            }
        }.build()
        return deviceLaptopUnknown!!
    }

private var deviceLaptopUnknown: ImageVector? = null