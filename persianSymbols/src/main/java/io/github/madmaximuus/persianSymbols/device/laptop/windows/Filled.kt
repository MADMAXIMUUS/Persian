package io.github.madmaximuus.persianSymbols.device.laptop.windows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.DeviceLaptopWindows: ImageVector
    get() {
        if (deviceLaptopWindows != null) {
            return deviceLaptopWindows!!
        }
        deviceLaptopWindows = Builder(
            name = "device-laptop-windows-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 8.4f)
                curveTo(2f, 5.97f, 3.97f, 4f, 6.4f, 4f)
                horizontalLineTo(17.6f)
                curveTo(20.03f, 4f, 22f, 5.97f, 22f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(22f, 16.97f, 21.374f, 18.193f, 20.393f, 19f)
                horizontalLineTo(21.6f)
                curveTo(21.821f, 19f, 22f, 19.179f, 22f, 19.4f)
                verticalLineTo(20f)
                curveTo(22f, 20.552f, 21.552f, 21f, 21f, 21f)
                horizontalLineTo(3f)
                curveTo(2.448f, 21f, 2f, 20.552f, 2f, 20f)
                verticalLineTo(19.4f)
                curveTo(2f, 19.179f, 2.179f, 19f, 2.4f, 19f)
                horizontalLineTo(3.607f)
                curveTo(2.626f, 18.193f, 2f, 16.97f, 2f, 15.6f)
                verticalLineTo(8.4f)
                close()
                moveTo(11.25f, 7.75f)
                curveTo(11.526f, 7.75f, 11.75f, 7.974f, 11.75f, 8.25f)
                verticalLineTo(11.25f)
                curveTo(11.75f, 11.526f, 11.526f, 11.75f, 11.25f, 11.75f)
                horizontalLineTo(8.25f)
                curveTo(7.974f, 11.75f, 7.75f, 11.526f, 7.75f, 11.25f)
                verticalLineTo(8.25f)
                curveTo(7.75f, 7.974f, 7.974f, 7.75f, 8.25f, 7.75f)
                horizontalLineTo(11.25f)
                close()
                moveTo(15.75f, 7.75f)
                curveTo(16.026f, 7.75f, 16.25f, 7.974f, 16.25f, 8.25f)
                verticalLineTo(11.25f)
                curveTo(16.25f, 11.526f, 16.026f, 11.75f, 15.75f, 11.75f)
                horizontalLineTo(12.75f)
                curveTo(12.474f, 11.75f, 12.25f, 11.526f, 12.25f, 11.25f)
                verticalLineTo(8.25f)
                curveTo(12.25f, 7.974f, 12.474f, 7.75f, 12.75f, 7.75f)
                horizontalLineTo(15.75f)
                close()
                moveTo(8.25f, 12.25f)
                curveTo(7.974f, 12.25f, 7.75f, 12.474f, 7.75f, 12.75f)
                verticalLineTo(15.75f)
                curveTo(7.75f, 16.026f, 7.974f, 16.25f, 8.25f, 16.25f)
                horizontalLineTo(11.25f)
                curveTo(11.526f, 16.25f, 11.75f, 16.026f, 11.75f, 15.75f)
                verticalLineTo(12.75f)
                curveTo(11.75f, 12.474f, 11.526f, 12.25f, 11.25f, 12.25f)
                horizontalLineTo(8.25f)
                close()
                moveTo(15.75f, 12.25f)
                curveTo(16.026f, 12.25f, 16.25f, 12.474f, 16.25f, 12.75f)
                verticalLineTo(15.75f)
                curveTo(16.25f, 16.026f, 16.026f, 16.25f, 15.75f, 16.25f)
                horizontalLineTo(12.75f)
                curveTo(12.474f, 16.25f, 12.25f, 16.026f, 12.25f, 15.75f)
                verticalLineTo(12.75f)
                curveTo(12.25f, 12.474f, 12.474f, 12.25f, 12.75f, 12.25f)
                horizontalLineTo(15.75f)
                close()
            }
        }.build()
        return deviceLaptopWindows!!
    }

private var deviceLaptopWindows: ImageVector? = null