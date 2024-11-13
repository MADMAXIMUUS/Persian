package io.github.madmaximuus.persianSymbols.device.computer.windows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.DeviceComputerWindows: ImageVector
    get() {
        if (deviceComputerWindows != null) {
            return deviceComputerWindows!!
        }
        deviceComputerWindows = Builder(
            name = "device-computer-windows-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.25f, 5.75f)
                curveTo(11.526f, 5.75f, 11.75f, 5.974f, 11.75f, 6.25f)
                verticalLineTo(9.25f)
                curveTo(11.75f, 9.526f, 11.526f, 9.75f, 11.25f, 9.75f)
                horizontalLineTo(8.25f)
                curveTo(7.974f, 9.75f, 7.75f, 9.526f, 7.75f, 9.25f)
                verticalLineTo(6.25f)
                curveTo(7.75f, 5.974f, 7.974f, 5.75f, 8.25f, 5.75f)
                horizontalLineTo(11.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.75f, 5.75f)
                curveTo(16.026f, 5.75f, 16.25f, 5.974f, 16.25f, 6.25f)
                verticalLineTo(9.25f)
                curveTo(16.25f, 9.526f, 16.026f, 9.75f, 15.75f, 9.75f)
                horizontalLineTo(12.75f)
                curveTo(12.474f, 9.75f, 12.25f, 9.526f, 12.25f, 9.25f)
                verticalLineTo(6.25f)
                curveTo(12.25f, 5.974f, 12.474f, 5.75f, 12.75f, 5.75f)
                horizontalLineTo(15.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.25f, 10.25f)
                curveTo(7.974f, 10.25f, 7.75f, 10.474f, 7.75f, 10.75f)
                verticalLineTo(13.75f)
                curveTo(7.75f, 14.026f, 7.974f, 14.25f, 8.25f, 14.25f)
                horizontalLineTo(11.25f)
                curveTo(11.526f, 14.25f, 11.75f, 14.026f, 11.75f, 13.75f)
                verticalLineTo(10.75f)
                curveTo(11.75f, 10.474f, 11.526f, 10.25f, 11.25f, 10.25f)
                horizontalLineTo(8.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.75f, 10.25f)
                curveTo(16.026f, 10.25f, 16.25f, 10.474f, 16.25f, 10.75f)
                verticalLineTo(13.75f)
                curveTo(16.25f, 14.026f, 16.026f, 14.25f, 15.75f, 14.25f)
                horizontalLineTo(12.75f)
                curveTo(12.474f, 14.25f, 12.25f, 14.026f, 12.25f, 13.75f)
                verticalLineTo(10.75f)
                curveTo(12.25f, 10.474f, 12.474f, 10.25f, 12.75f, 10.25f)
                horizontalLineTo(15.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.5f, 2f)
                curveTo(4.015f, 2f, 2f, 4.015f, 2f, 6.5f)
                verticalLineTo(13.5f)
                curveTo(2f, 15.985f, 4.015f, 18f, 6.5f, 18f)
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
                horizontalLineTo(17.5f)
                curveTo(19.985f, 18f, 22f, 15.985f, 22f, 13.5f)
                verticalLineTo(6.5f)
                curveTo(22f, 4.015f, 19.985f, 2f, 17.5f, 2f)
                horizontalLineTo(6.5f)
                close()
                moveTo(4f, 6.5f)
                curveTo(4f, 5.119f, 5.119f, 4f, 6.5f, 4f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 4f, 20f, 5.119f, 20f, 6.5f)
                verticalLineTo(13.5f)
                curveTo(20f, 14.881f, 18.881f, 16f, 17.5f, 16f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 16f, 4f, 14.881f, 4f, 13.5f)
                verticalLineTo(6.5f)
                close()
            }
        }.build()
        return deviceComputerWindows!!
    }

private var deviceComputerWindows: ImageVector? = null