package io.github.madmaximuus.persianSymbols.device.laptop.macbook

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.DeviceLaptopMacbook: ImageVector
    get() {
        if (deviceLaptopMacbook != null) {
            return deviceLaptopMacbook!!
        }
        deviceLaptopMacbook = Builder(
            name = "device-laptop-macbook-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 8.4f)
                curveTo(2f, 5.97f, 3.97f, 4f, 6.4f, 4f)
                horizontalLineTo(17.6f)
                curveTo(20.03f, 4f, 22f, 5.97f, 22f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(22f, 16.97f, 21.374f, 18.193f, 20.393f, 19f)
                horizontalLineTo(21.6f)
                curveTo(21.821f, 19f, 22f, 19.179f, 22f, 19.4f)
                verticalLineTo(20f)
                curveTo(22f, 20.552f, 21.552f, 21f, 21f, 21f)
                horizontalLineTo(3f)
                curveTo(2.448f, 21f, 2f, 20.552f, 2f, 20f)
                verticalLineTo(19.4f)
                curveTo(2f, 19.179f, 2.179f, 19f, 2.4f, 19f)
                horizontalLineTo(3.607f)
                curveTo(2.626f, 18.193f, 2f, 16.97f, 2f, 15.6f)
                verticalLineTo(8.4f)
                close()
                moveTo(14.645f, 7.006f)
                curveTo(14.696f, 7.547f, 14.438f, 8.203f, 13.915f, 8.726f)
                curveTo(13.392f, 9.25f, 12.735f, 9.508f, 12.195f, 9.456f)
                curveTo(12.144f, 8.916f, 12.401f, 8.26f, 12.925f, 7.736f)
                curveTo(13.448f, 7.213f, 14.104f, 6.955f, 14.645f, 7.006f)
                close()
                moveTo(11.125f, 16.525f)
                curveTo(9.786f, 16.525f, 8.7f, 13.476f, 8.7f, 12.136f)
                curveTo(8.7f, 10.797f, 9.786f, 9.711f, 11.125f, 9.711f)
                curveTo(11.431f, 9.711f, 11.723f, 9.768f, 11.992f, 9.871f)
                curveTo(12.142f, 9.928f, 12.308f, 9.928f, 12.458f, 9.871f)
                curveTo(12.727f, 9.768f, 13.019f, 9.711f, 13.325f, 9.711f)
                curveTo(14.146f, 9.711f, 14.872f, 10.12f, 15.311f, 10.744f)
                curveTo(14.63f, 11.017f, 14.15f, 11.683f, 14.15f, 12.461f)
                curveTo(14.15f, 13.24f, 14.631f, 13.906f, 15.312f, 14.179f)
                curveTo(14.873f, 15.376f, 14.147f, 16.525f, 13.325f, 16.525f)
                curveTo(13.019f, 16.525f, 12.727f, 16.468f, 12.458f, 16.365f)
                curveTo(12.308f, 16.308f, 12.142f, 16.308f, 11.992f, 16.365f)
                curveTo(11.723f, 16.468f, 11.431f, 16.525f, 11.125f, 16.525f)
                close()
            }
        }.build()
        return deviceLaptopMacbook!!
    }

private var deviceLaptopMacbook: ImageVector? = null