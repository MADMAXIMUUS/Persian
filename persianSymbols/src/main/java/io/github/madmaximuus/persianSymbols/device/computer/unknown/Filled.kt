package io.github.madmaximuus.persianSymbols.device.computer.unknown

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.DeviceComputerUnknown: ImageVector
    get() {
        if (deviceComputerUnknown != null) {
            return deviceComputerUnknown!!
        }
        deviceComputerUnknown = Builder(
            name = "device-computer-unknown-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.4f, 2f)
                curveTo(3.97f, 2f, 2f, 3.97f, 2f, 6.4f)
                verticalLineTo(13.6f)
                curveTo(2f, 16.03f, 3.97f, 18f, 6.4f, 18f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                horizontalLineTo(8f)
                curveTo(7.448f, 20f, 7f, 20.448f, 7f, 21f)
                curveTo(7f, 21.552f, 7.448f, 22f, 8f, 22f)
                horizontalLineTo(16f)
                curveTo(16.552f, 22f, 17f, 21.552f, 17f, 21f)
                curveTo(17f, 20.448f, 16.552f, 20f, 16f, 20f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(17.6f)
                curveTo(20.03f, 18f, 22f, 16.03f, 22f, 13.6f)
                verticalLineTo(6.4f)
                curveTo(22f, 3.97f, 20.03f, 2f, 17.6f, 2f)
                horizontalLineTo(6.4f)
                close()
            }
        }.build()
        return deviceComputerUnknown!!
    }

private var deviceComputerUnknown: ImageVector? = null