package io.github.madmaximuus.persianSymbols.device.computer.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.DeviceComputerSlash: ImageVector
    get() {
        if (deviceComputerSlash != null) {
            return deviceComputerSlash!!
        }
        deviceComputerSlash = ImageVector.Builder(
            name = "device-computer-slash-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2f, 6.5f)
                curveTo(2f, 5.893f, 2.12f, 5.313f, 2.338f, 4.785f)
                curveTo(2.39f, 4.856f, 2.449f, 4.923f, 2.513f, 4.987f)
                lineTo(4f, 6.475f)
                lineTo(4f, 6.5f)
                verticalLineTo(13.5f)
                curveTo(4f, 14.881f, 5.119f, 16f, 6.5f, 16f)
                horizontalLineTo(13.525f)
                lineTo(15.525f, 18f)
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
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.987f, 2.513f)
                curveTo(4.923f, 2.449f, 4.856f, 2.39f, 4.785f, 2.338f)
                curveTo(5.313f, 2.12f, 5.893f, 2f, 6.5f, 2f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 2f, 22f, 4.015f, 22f, 6.5f)
                verticalLineTo(13.5f)
                curveTo(22f, 15.134f, 21.13f, 16.564f, 19.827f, 17.352f)
                lineTo(18.333f, 15.858f)
                curveTo(19.304f, 15.515f, 20f, 14.589f, 20f, 13.5f)
                verticalLineTo(6.5f)
                curveTo(20f, 5.119f, 18.881f, 4f, 17.5f, 4f)
                horizontalLineTo(6.5f)
                lineTo(6.475f, 4f)
                lineTo(4.987f, 2.513f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.707f, 2.293f)
                curveTo(3.317f, 1.902f, 2.683f, 1.902f, 2.293f, 2.293f)
                curveTo(1.902f, 2.683f, 1.902f, 3.317f, 2.293f, 3.707f)
                lineTo(20.293f, 21.707f)
                curveTo(20.683f, 22.098f, 21.317f, 22.098f, 21.707f, 21.707f)
                curveTo(22.098f, 21.317f, 22.098f, 20.683f, 21.707f, 20.293f)
                lineTo(3.707f, 2.293f)
                close()
            }
        }.build()

        return deviceComputerSlash!!
    }

private var deviceComputerSlash: ImageVector? = null