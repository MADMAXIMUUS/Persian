package io.github.madmaximuus.persianSymbols.device.laptop.unknown

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.DeviceLaptopUnknown: ImageVector
    get() {
        if (deviceLaptopUnknown != null) {
            return deviceLaptopUnknown!!
        }
        deviceLaptopUnknown = Builder(
            name = "device-laptop-unknown-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.5f, 4f)
                curveTo(4.015f, 4f, 2f, 6.015f, 2f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2f, 16.653f, 2.433f, 17.704f, 3.146f, 18.5f)
                horizontalLineTo(2.4f)
                curveTo(2.179f, 18.5f, 2f, 18.679f, 2f, 18.9f)
                verticalLineTo(19.5f)
                curveTo(2f, 20.052f, 2.448f, 20.5f, 3f, 20.5f)
                horizontalLineTo(21f)
                curveTo(21.552f, 20.5f, 22f, 20.052f, 22f, 19.5f)
                verticalLineTo(18.9f)
                curveTo(22f, 18.679f, 21.821f, 18.5f, 21.6f, 18.5f)
                horizontalLineTo(20.854f)
                curveTo(21.567f, 17.704f, 22f, 16.653f, 22f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(22f, 6.015f, 19.985f, 4f, 17.5f, 4f)
                horizontalLineTo(6.5f)
                close()
                moveTo(4f, 8.5f)
                curveTo(4f, 7.119f, 5.119f, 6f, 6.5f, 6f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 6f, 20f, 7.119f, 20f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(20f, 16.881f, 18.881f, 18f, 17.5f, 18f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 18f, 4f, 16.881f, 4f, 15.5f)
                verticalLineTo(8.5f)
                close()
            }
        }.build()
        return deviceLaptopUnknown!!
    }

private var deviceLaptopUnknown: ImageVector? = null