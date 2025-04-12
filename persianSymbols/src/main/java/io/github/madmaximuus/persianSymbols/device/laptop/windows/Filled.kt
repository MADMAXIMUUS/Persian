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
                moveTo(2f, 7.9f)
                curveTo(2f, 5.47f, 3.97f, 3.5f, 6.4f, 3.5f)
                horizontalLineTo(17.6f)
                curveTo(20.03f, 3.5f, 22f, 5.47f, 22f, 7.9f)
                verticalLineTo(15.1f)
                curveTo(22f, 16.47f, 21.374f, 17.693f, 20.393f, 18.5f)
                horizontalLineTo(21.6f)
                curveTo(21.821f, 18.5f, 22f, 18.679f, 22f, 18.9f)
                verticalLineTo(19.5f)
                curveTo(22f, 20.052f, 21.552f, 20.5f, 21f, 20.5f)
                horizontalLineTo(3f)
                curveTo(2.448f, 20.5f, 2f, 20.052f, 2f, 19.5f)
                verticalLineTo(18.9f)
                curveTo(2f, 18.679f, 2.179f, 18.5f, 2.4f, 18.5f)
                horizontalLineTo(3.607f)
                curveTo(2.626f, 17.693f, 2f, 16.47f, 2f, 15.1f)
                verticalLineTo(7.9f)
                close()
                moveTo(11.25f, 7.5f)
                curveTo(11.526f, 7.5f, 11.75f, 7.724f, 11.75f, 8f)
                verticalLineTo(11f)
                curveTo(11.75f, 11.276f, 11.526f, 11.5f, 11.25f, 11.5f)
                horizontalLineTo(8.25f)
                curveTo(7.974f, 11.5f, 7.75f, 11.276f, 7.75f, 11f)
                verticalLineTo(8f)
                curveTo(7.75f, 7.724f, 7.974f, 7.5f, 8.25f, 7.5f)
                horizontalLineTo(11.25f)
                close()
                moveTo(15.75f, 7.5f)
                curveTo(16.026f, 7.5f, 16.25f, 7.724f, 16.25f, 8f)
                verticalLineTo(11f)
                curveTo(16.25f, 11.276f, 16.026f, 11.5f, 15.75f, 11.5f)
                horizontalLineTo(12.75f)
                curveTo(12.474f, 11.5f, 12.25f, 11.276f, 12.25f, 11f)
                verticalLineTo(8f)
                curveTo(12.25f, 7.724f, 12.474f, 7.5f, 12.75f, 7.5f)
                horizontalLineTo(15.75f)
                close()
                moveTo(8.25f, 12f)
                curveTo(7.974f, 12f, 7.75f, 12.224f, 7.75f, 12.5f)
                verticalLineTo(15.5f)
                curveTo(7.75f, 15.776f, 7.974f, 16f, 8.25f, 16f)
                horizontalLineTo(11.25f)
                curveTo(11.526f, 16f, 11.75f, 15.776f, 11.75f, 15.5f)
                verticalLineTo(12.5f)
                curveTo(11.75f, 12.224f, 11.526f, 12f, 11.25f, 12f)
                horizontalLineTo(8.25f)
                close()
                moveTo(15.75f, 12f)
                curveTo(16.026f, 12f, 16.25f, 12.224f, 16.25f, 12.5f)
                verticalLineTo(15.5f)
                curveTo(16.25f, 15.776f, 16.026f, 16f, 15.75f, 16f)
                horizontalLineTo(12.75f)
                curveTo(12.474f, 16f, 12.25f, 15.776f, 12.25f, 15.5f)
                verticalLineTo(12.5f)
                curveTo(12.25f, 12.224f, 12.474f, 12f, 12.75f, 12f)
                horizontalLineTo(15.75f)
                close()
            }
        }.build()
        return deviceLaptopWindows!!
    }

private var deviceLaptopWindows: ImageVector? = null