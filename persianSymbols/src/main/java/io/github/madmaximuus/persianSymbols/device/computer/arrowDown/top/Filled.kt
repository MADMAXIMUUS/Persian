package io.github.madmaximuus.persianSymbols.device.computer.arrowDown.top

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.DeviceComputerArrowDownTop: ImageVector
    get() {
        if (deviceComputerArrowDownTop != null) {
            return deviceComputerArrowDownTop!!
        }
        deviceComputerArrowDownTop = Builder(
            name = "device-computer-arrow-down-top-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.53f, 5.97f)
                curveTo(19.823f, 6.263f, 19.823f, 6.737f, 19.53f, 7.03f)
                lineTo(18.53f, 8.03f)
                curveTo(18.237f, 8.323f, 17.763f, 8.323f, 17.47f, 8.03f)
                lineTo(16.47f, 7.03f)
                curveTo(16.177f, 6.737f, 16.177f, 6.263f, 16.47f, 5.97f)
                curveTo(16.681f, 5.759f, 16.986f, 5.7f, 17.25f, 5.793f)
                verticalLineTo(4.5f)
                curveTo(17.25f, 4.086f, 17.586f, 3.75f, 18f, 3.75f)
                curveTo(18.414f, 3.75f, 18.75f, 4.086f, 18.75f, 4.5f)
                verticalLineTo(5.793f)
                curveTo(19.014f, 5.7f, 19.319f, 5.759f, 19.53f, 5.97f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.25f, 6f)
                curveTo(13.25f, 3.377f, 15.377f, 1.25f, 18f, 1.25f)
                curveTo(20.623f, 1.25f, 22.75f, 3.377f, 22.75f, 6f)
                curveTo(22.75f, 8.623f, 20.623f, 10.75f, 18f, 10.75f)
                curveTo(15.377f, 10.75f, 13.25f, 8.623f, 13.25f, 6f)
                close()
                moveTo(18f, 2.75f)
                curveTo(16.205f, 2.75f, 14.75f, 4.205f, 14.75f, 6f)
                curveTo(14.75f, 7.795f, 16.205f, 9.25f, 18f, 9.25f)
                curveTo(19.795f, 9.25f, 21.25f, 7.795f, 21.25f, 6f)
                curveTo(21.25f, 4.205f, 19.795f, 2.75f, 18f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.4f, 2f)
                horizontalLineTo(13.528f)
                curveTo(12.578f, 3.062f, 12f, 4.463f, 12f, 6f)
                curveTo(12f, 9.314f, 14.686f, 12f, 18f, 12f)
                curveTo(19.537f, 12f, 20.938f, 11.422f, 22f, 10.472f)
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
                curveTo(2f, 3.97f, 3.97f, 2f, 6.4f, 2f)
                close()
            }
        }.build()
        return deviceComputerArrowDownTop!!
    }

private var deviceComputerArrowDownTop: ImageVector? = null