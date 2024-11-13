package io.github.madmaximuus.persianSymbols.device.mobile.iPhone.two

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.DeviceMobileIPhone2: ImageVector
    get() {
        if (deviceMobileIPhone2 != null) {
            return deviceMobileIPhone2!!
        }
        deviceMobileIPhone2 = Builder(
            name = "device-mobile-iphone-2-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 2f)
                curveTo(7.343f, 2f, 6f, 3.343f, 6f, 5f)
                verticalLineTo(19f)
                curveTo(6f, 20.657f, 7.343f, 22f, 9f, 22f)
                horizontalLineTo(15f)
                curveTo(16.657f, 22f, 18f, 20.657f, 18f, 19f)
                verticalLineTo(5f)
                curveTo(18f, 3.343f, 16.657f, 2f, 15f, 2f)
                horizontalLineTo(9f)
                close()
                moveTo(8f, 5f)
                curveTo(8f, 4.448f, 8.448f, 4f, 9f, 4f)
                horizontalLineTo(9.5f)
                curveTo(9.5f, 4.552f, 9.948f, 5f, 10.5f, 5f)
                horizontalLineTo(13.5f)
                curveTo(14.052f, 5f, 14.5f, 4.552f, 14.5f, 4f)
                horizontalLineTo(15f)
                curveTo(15.552f, 4f, 16f, 4.448f, 16f, 5f)
                verticalLineTo(19f)
                curveTo(16f, 19.552f, 15.552f, 20f, 15f, 20f)
                horizontalLineTo(9f)
                curveTo(8.448f, 20f, 8f, 19.552f, 8f, 19f)
                verticalLineTo(5f)
                close()
            }
        }.build()
        return deviceMobileIPhone2!!
    }

private var deviceMobileIPhone2: ImageVector? = null