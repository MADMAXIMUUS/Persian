package io.github.madmaximuus.persianSymbols.device.laptop.play

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.DeviceLaptopPlay: ImageVector
    get() {
        if (deviceLaptopPlay != null) {
            return deviceLaptopPlay!!
        }
        deviceLaptopPlay = ImageVector.Builder(
            name = "device-laptop-play-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
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
                moveTo(10.581f, 7.629f)
                lineTo(14.861f, 10.686f)
                curveTo(15.419f, 11.085f, 15.419f, 11.915f, 14.861f, 12.314f)
                lineTo(10.581f, 15.37f)
                curveTo(9.919f, 15.843f, 9f, 15.37f, 9f, 14.557f)
                verticalLineTo(8.443f)
                curveTo(9f, 7.63f, 9.919f, 7.157f, 10.581f, 7.629f)
                close()
            }
        }.build()

        return deviceLaptopPlay!!
    }

private var deviceLaptopPlay: ImageVector? = null