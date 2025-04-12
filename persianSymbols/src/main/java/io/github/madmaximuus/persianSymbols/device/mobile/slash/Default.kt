package io.github.madmaximuus.persianSymbols.device.mobile.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.DeviceMobileSlash: ImageVector
    get() {
        if (deviceMobileSlash != null) {
            return deviceMobileSlash!!
        }
        deviceMobileSlash = ImageVector.Builder(
            name = "device-mobile-slash-default",
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
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 8.475f)
                lineTo(8f, 10.475f)
                verticalLineTo(17f)
                horizontalLineTo(14.525f)
                lineTo(17.743f, 20.218f)
                curveTo(17.276f, 21.268f, 16.223f, 22f, 15f, 22f)
                horizontalLineTo(9f)
                curveTo(7.343f, 22f, 6f, 20.657f, 6f, 19f)
                verticalLineTo(8.475f)
                close()
                moveTo(8f, 18.5f)
                verticalLineTo(19f)
                curveTo(8f, 19.552f, 8.448f, 20f, 9f, 20f)
                horizontalLineTo(15f)
                curveTo(15.552f, 20f, 16f, 19.552f, 16f, 19f)
                verticalLineTo(18.5f)
                horizontalLineTo(8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 6.5f)
                verticalLineTo(13.525f)
                lineTo(18f, 15.525f)
                verticalLineTo(5f)
                curveTo(18f, 3.343f, 16.657f, 2f, 15f, 2f)
                horizontalLineTo(9f)
                curveTo(7.777f, 2f, 6.724f, 2.732f, 6.257f, 3.782f)
                lineTo(8.975f, 6.5f)
                horizontalLineTo(16f)
                close()
                moveTo(15f, 4f)
                curveTo(15.552f, 4f, 16f, 4.448f, 16f, 5f)
                horizontalLineTo(8f)
                curveTo(8f, 4.448f, 8.448f, 4f, 9f, 4f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return deviceMobileSlash!!
    }

private var deviceMobileSlash: ImageVector? = null