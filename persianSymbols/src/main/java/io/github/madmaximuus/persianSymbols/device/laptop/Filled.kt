package io.github.madmaximuus.persianSymbols.device.laptop

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.DeviceLaptop: ImageVector
    get() {
        if (deviceLaptop != null) {
            return deviceLaptop!!
        }
        deviceLaptop = Builder(
            name = "device-laptop-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.4f, 3.5f)
                curveTo(3.97f, 3.5f, 2f, 5.47f, 2f, 7.9f)
                verticalLineTo(15.1f)
                curveTo(2f, 16.47f, 2.626f, 17.693f, 3.607f, 18.5f)
                horizontalLineTo(2.4f)
                curveTo(2.179f, 18.5f, 2f, 18.679f, 2f, 18.9f)
                verticalLineTo(19.5f)
                curveTo(2f, 20.052f, 2.448f, 20.5f, 3f, 20.5f)
                horizontalLineTo(21f)
                curveTo(21.552f, 20.5f, 22f, 20.052f, 22f, 19.5f)
                verticalLineTo(18.9f)
                curveTo(22f, 18.679f, 21.821f, 18.5f, 21.6f, 18.5f)
                horizontalLineTo(20.393f)
                curveTo(21.374f, 17.693f, 22f, 16.47f, 22f, 15.1f)
                verticalLineTo(7.9f)
                curveTo(22f, 5.47f, 20.03f, 3.5f, 17.6f, 3.5f)
                horizontalLineTo(6.4f)
                close()
            }
        }.build()
        return deviceLaptop!!
    }

private var deviceLaptop: ImageVector? = null