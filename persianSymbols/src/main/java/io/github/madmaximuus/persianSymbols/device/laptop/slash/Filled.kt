package io.github.madmaximuus.persianSymbols.device.laptop.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.DeviceLaptopSlash: ImageVector
    get() {
        if (deviceLaptopSlash != null) {
            return deviceLaptopSlash!!
        }
        deviceLaptopSlash = ImageVector.Builder(
            name = "device-laptop-slash-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2f, 7.9f)
                curveTo(2f, 6.934f, 2.311f, 6.04f, 2.839f, 5.314f)
                lineTo(18.025f, 20.5f)
                horizontalLineTo(3f)
                curveTo(2.448f, 20.5f, 2f, 20.052f, 2f, 19.5f)
                verticalLineTo(18.9f)
                curveTo(2f, 18.679f, 2.179f, 18.5f, 2.4f, 18.5f)
                horizontalLineTo(3.607f)
                curveTo(2.626f, 17.693f, 2f, 16.47f, 2f, 15.1f)
                verticalLineTo(7.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 19.5f)
                curveTo(22f, 19.613f, 21.981f, 19.721f, 21.947f, 19.822f)
                curveTo(21.873f, 19.525f, 21.719f, 19.244f, 21.487f, 19.013f)
                lineTo(20.975f, 18.5f)
                horizontalLineTo(21.6f)
                curveTo(21.821f, 18.5f, 22f, 18.679f, 22f, 18.9f)
                verticalLineTo(19.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 15.1f)
                curveTo(22f, 16.321f, 21.502f, 17.427f, 20.699f, 18.224f)
                lineTo(5.993f, 3.519f)
                curveTo(6.127f, 3.506f, 6.263f, 3.5f, 6.4f, 3.5f)
                horizontalLineTo(17.6f)
                curveTo(20.03f, 3.5f, 22f, 5.47f, 22f, 7.9f)
                verticalLineTo(15.1f)
                close()
            }
        }.build()

        return deviceLaptopSlash!!
    }

private var deviceLaptopSlash: ImageVector? = null