package io.github.madmaximuus.persianSymbols.device.laptop.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.DeviceLaptopSlash: ImageVector
    get() {
        if (deviceLaptopSlash != null) {
            return deviceLaptopSlash!!
        }
        deviceLaptopSlash = ImageVector.Builder(
            name = "device-laptop-slash-default",
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
                moveTo(2f, 8f)
                curveTo(2f, 7.006f, 2.322f, 6.087f, 2.868f, 5.343f)
                lineTo(4.313f, 6.788f)
                curveTo(4.114f, 7.147f, 4f, 7.56f, 4f, 8f)
                verticalLineTo(15f)
                curveTo(4f, 16.381f, 5.119f, 17.5f, 6.5f, 17.5f)
                horizontalLineTo(15.025f)
                lineTo(18.025f, 20.5f)
                horizontalLineTo(3f)
                curveTo(2.448f, 20.5f, 2f, 20.052f, 2f, 19.5f)
                verticalLineTo(18.9f)
                curveTo(2f, 18.679f, 2.179f, 18.5f, 2.4f, 18.5f)
                horizontalLineTo(3.671f)
                curveTo(2.652f, 17.675f, 2f, 16.414f, 2f, 15f)
                verticalLineTo(8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 15f)
                curveTo(20f, 15.697f, 19.715f, 16.327f, 19.255f, 16.78f)
                lineTo(20.669f, 18.194f)
                curveTo(21.491f, 17.379f, 22f, 16.249f, 22f, 15f)
                verticalLineTo(8f)
                curveTo(22f, 5.515f, 19.985f, 3.5f, 17.5f, 3.5f)
                horizontalLineTo(6.5f)
                curveTo(6.332f, 3.5f, 6.166f, 3.509f, 6.002f, 3.527f)
                lineTo(7.975f, 5.5f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 5.5f, 20f, 6.619f, 20f, 8f)
                verticalLineTo(15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.487f, 19.013f)
                lineTo(20.975f, 18.5f)
                horizontalLineTo(21.6f)
                curveTo(21.821f, 18.5f, 22f, 18.679f, 22f, 18.9f)
                verticalLineTo(19.5f)
                curveTo(22f, 19.613f, 21.981f, 19.721f, 21.947f, 19.822f)
                curveTo(21.873f, 19.525f, 21.719f, 19.244f, 21.487f, 19.013f)
                close()
            }
        }.build()

        return deviceLaptopSlash!!
    }

private var deviceLaptopSlash: ImageVector? = null