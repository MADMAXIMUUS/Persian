package io.github.madmaximuus.persianSymbols.device.laptop.windows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.DeviceLaptopWindows: ImageVector
    get() {
        if (deviceLaptopWindows != null) {
            return deviceLaptopWindows!!
        }
        deviceLaptopWindows = Builder(
            name = "device-laptop-windows-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
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
            }
            path(fill = SolidColor(Color(0xFF000000))) {
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
            }
            path(fill = SolidColor(Color(0xFF000000))) {
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
            }
            path(fill = SolidColor(Color(0xFF000000))) {
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
        return deviceLaptopWindows!!
    }

private var deviceLaptopWindows: ImageVector? = null