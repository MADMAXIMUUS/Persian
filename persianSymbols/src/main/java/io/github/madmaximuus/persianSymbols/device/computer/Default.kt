package io.github.madmaximuus.persianSymbols.device.computer

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.DeviceComputer: ImageVector
    get() {
        if (deviceComputer != null) {
            return deviceComputer!!
        }
        deviceComputer = Builder(
            name = "device-computer-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 6.5f)
                curveTo(2f, 4.015f, 4.015f, 2f, 6.5f, 2f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 2f, 22f, 4.015f, 22f, 6.5f)
                verticalLineTo(13.5f)
                curveTo(22f, 15.985f, 19.985f, 18f, 17.5f, 18f)
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
                horizontalLineTo(6.5f)
                curveTo(4.015f, 18f, 2f, 15.985f, 2f, 13.5f)
                verticalLineTo(6.5f)
                close()
                moveTo(6.5f, 4f)
                curveTo(5.119f, 4f, 4f, 5.119f, 4f, 6.5f)
                verticalLineTo(13.5f)
                curveTo(4f, 14.881f, 5.119f, 16f, 6.5f, 16f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 16f, 20f, 14.881f, 20f, 13.5f)
                verticalLineTo(6.5f)
                curveTo(20f, 5.119f, 18.881f, 4f, 17.5f, 4f)
                horizontalLineTo(6.5f)
                close()
            }
        }.build()
        return deviceComputer!!
    }

private var deviceComputer: ImageVector? = null