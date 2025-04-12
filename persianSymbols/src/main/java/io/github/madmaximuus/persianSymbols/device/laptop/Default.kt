package io.github.madmaximuus.persianSymbols.device.laptop

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.DeviceLaptop: ImageVector
    get() {
        if (deviceLaptop != null) {
            return deviceLaptop!!
        }
        deviceLaptop = Builder(
            name = "device-laptop-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.5f, 3.5f)
                curveTo(4.015f, 3.5f, 2f, 5.515f, 2f, 8f)
                verticalLineTo(15f)
                curveTo(2f, 16.414f, 2.652f, 17.675f, 3.671f, 18.5f)
                horizontalLineTo(2.4f)
                curveTo(2.179f, 18.5f, 2f, 18.679f, 2f, 18.9f)
                verticalLineTo(19.5f)
                curveTo(2f, 20.052f, 2.448f, 20.5f, 3f, 20.5f)
                horizontalLineTo(21f)
                curveTo(21.552f, 20.5f, 22f, 20.052f, 22f, 19.5f)
                verticalLineTo(18.9f)
                curveTo(22f, 18.679f, 21.821f, 18.5f, 21.6f, 18.5f)
                horizontalLineTo(20.329f)
                curveTo(21.348f, 17.675f, 22f, 16.414f, 22f, 15f)
                verticalLineTo(8f)
                curveTo(22f, 5.515f, 19.985f, 3.5f, 17.5f, 3.5f)
                horizontalLineTo(6.5f)
                close()
                moveTo(4f, 8f)
                curveTo(4f, 6.619f, 5.119f, 5.5f, 6.5f, 5.5f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 5.5f, 20f, 6.619f, 20f, 8f)
                verticalLineTo(15f)
                curveTo(20f, 16.381f, 18.881f, 17.5f, 17.5f, 17.5f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 17.5f, 4f, 16.381f, 4f, 15f)
                verticalLineTo(8f)
                close()
            }
        }.build()
        return deviceLaptop!!
    }

private var deviceLaptop: ImageVector? = null