package io.github.madmaximuus.persianSymbols.device.tablet.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.DeviceTabletSlash: ImageVector
    get() {
        if (deviceTabletSlash != null) {
            return deviceTabletSlash!!
        }
        deviceTabletSlash = ImageVector.Builder(
            name = "device-tablet-slash-default",
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
                moveTo(8.5f, 2f)
                curveTo(7.378f, 2f, 6.352f, 2.41f, 5.564f, 3.089f)
                lineTo(6.986f, 4.511f)
                curveTo(7.406f, 4.19f, 7.931f, 4f, 8.5f, 4f)
                horizontalLineTo(15.5f)
                curveTo(16.881f, 4f, 18f, 5.119f, 18f, 6.5f)
                verticalLineTo(15.525f)
                lineTo(20f, 17.525f)
                lineTo(20f, 17.5f)
                verticalLineTo(6.5f)
                curveTo(20f, 4.015f, 17.985f, 2f, 15.5f, 2f)
                horizontalLineTo(8.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 6.5f)
                lineTo(4f, 6.475f)
                lineTo(6f, 8.475f)
                verticalLineTo(17.5f)
                curveTo(6f, 18.881f, 7.119f, 20f, 8.5f, 20f)
                horizontalLineTo(15.5f)
                curveTo(16.069f, 20f, 16.594f, 19.81f, 17.014f, 19.489f)
                lineTo(18.436f, 20.911f)
                curveTo(17.648f, 21.59f, 16.622f, 22f, 15.5f, 22f)
                horizontalLineTo(8.5f)
                curveTo(6.015f, 22f, 4f, 19.985f, 4f, 17.5f)
                verticalLineTo(6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 19.25f)
                curveTo(8.862f, 19.25f, 8.75f, 19.362f, 8.75f, 19.5f)
                curveTo(8.75f, 19.638f, 8.862f, 19.75f, 9f, 19.75f)
                horizontalLineTo(15f)
                curveTo(15.138f, 19.75f, 15.25f, 19.638f, 15.25f, 19.5f)
                curveTo(15.25f, 19.362f, 15.138f, 19.25f, 15f, 19.25f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return deviceTabletSlash!!
    }

private var deviceTabletSlash: ImageVector? = null