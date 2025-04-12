package io.github.madmaximuus.persianSymbols.device.computer.play

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.DeviceComputerPlay: ImageVector
    get() {
        if (deviceComputerPlay != null) {
            return deviceComputerPlay!!
        }
        deviceComputerPlay = ImageVector.Builder(
            name = "device-computer-play-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.581f, 6.129f)
                lineTo(14.861f, 9.186f)
                curveTo(15.419f, 9.585f, 15.419f, 10.415f, 14.861f, 10.814f)
                lineTo(10.581f, 13.87f)
                curveTo(9.919f, 14.343f, 9f, 13.87f, 9f, 13.057f)
                verticalLineTo(6.943f)
                curveTo(9f, 6.13f, 9.919f, 5.657f, 10.581f, 6.129f)
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

        return deviceComputerPlay!!
    }

private var deviceComputerPlay: ImageVector? = null