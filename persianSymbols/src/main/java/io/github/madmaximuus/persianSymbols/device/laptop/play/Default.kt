package io.github.madmaximuus.persianSymbols.device.laptop.play

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.DeviceLaptopPlay: ImageVector
    get() {
        if (deviceLaptopPlay != null) {
            return deviceLaptopPlay!!
        }
        deviceLaptopPlay = ImageVector.Builder(
            name = "device-laptop-play-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.581f, 7.629f)
                lineTo(14.861f, 10.686f)
                curveTo(15.419f, 11.085f, 15.419f, 11.915f, 14.861f, 12.314f)
                lineTo(10.581f, 15.37f)
                curveTo(9.919f, 15.843f, 9f, 15.37f, 9f, 14.557f)
                verticalLineTo(8.443f)
                curveTo(9f, 7.63f, 9.919f, 7.157f, 10.581f, 7.629f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 8f)
                curveTo(2f, 5.515f, 4.015f, 3.5f, 6.5f, 3.5f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 3.5f, 22f, 5.515f, 22f, 8f)
                verticalLineTo(15f)
                curveTo(22f, 16.414f, 21.348f, 17.675f, 20.329f, 18.5f)
                horizontalLineTo(21.6f)
                curveTo(21.821f, 18.5f, 22f, 18.679f, 22f, 18.9f)
                verticalLineTo(19.5f)
                curveTo(22f, 20.052f, 21.552f, 20.5f, 21f, 20.5f)
                horizontalLineTo(3f)
                curveTo(2.448f, 20.5f, 2f, 20.052f, 2f, 19.5f)
                verticalLineTo(18.9f)
                curveTo(2f, 18.679f, 2.179f, 18.5f, 2.4f, 18.5f)
                horizontalLineTo(3.671f)
                curveTo(2.652f, 17.675f, 2f, 16.414f, 2f, 15f)
                verticalLineTo(8f)
                close()
                moveTo(6.5f, 5.5f)
                curveTo(5.119f, 5.5f, 4f, 6.619f, 4f, 8f)
                verticalLineTo(15f)
                curveTo(4f, 16.381f, 5.119f, 17.5f, 6.5f, 17.5f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 17.5f, 20f, 16.381f, 20f, 15f)
                verticalLineTo(8f)
                curveTo(20f, 6.619f, 18.881f, 5.5f, 17.5f, 5.5f)
                horizontalLineTo(6.5f)
                close()
            }
        }.build()

        return deviceLaptopPlay!!
    }

private var deviceLaptopPlay: ImageVector? = null