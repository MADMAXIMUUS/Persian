package io.github.madmaximuus.persianSymbols.device.computer.play

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.DeviceComputerPlay: ImageVector
    get() {
        if (deviceComputerPlay != null) {
            return deviceComputerPlay!!
        }
        deviceComputerPlay = ImageVector.Builder(
            name = "device-computer-play-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 6.4f)
                curveTo(2f, 3.97f, 3.97f, 2f, 6.4f, 2f)
                horizontalLineTo(17.6f)
                curveTo(20.03f, 2f, 22f, 3.97f, 22f, 6.4f)
                verticalLineTo(13.6f)
                curveTo(22f, 16.03f, 20.03f, 18f, 17.6f, 18f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                curveTo(16.552f, 20f, 17f, 20.448f, 17f, 21f)
                curveTo(17f, 21.552f, 16.552f, 22f, 16f, 22f)
                horizontalLineTo(8f)
                curveTo(7.448f, 22f, 7f, 21.552f, 7f, 21f)
                curveTo(7f, 20.448f, 7.448f, 20f, 8f, 20f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(6.4f)
                curveTo(3.97f, 18f, 2f, 16.03f, 2f, 13.6f)
                verticalLineTo(6.4f)
                close()
                moveTo(10.581f, 6.129f)
                lineTo(14.861f, 9.186f)
                curveTo(15.419f, 9.585f, 15.419f, 10.415f, 14.861f, 10.814f)
                lineTo(10.581f, 13.87f)
                curveTo(9.919f, 14.343f, 9f, 13.87f, 9f, 13.057f)
                verticalLineTo(6.943f)
                curveTo(9f, 6.13f, 9.919f, 5.657f, 10.581f, 6.129f)
                close()
            }
        }.build()

        return deviceComputerPlay!!
    }

private var deviceComputerPlay: ImageVector? = null