package io.github.madmaximuus.persianSymbols.device.mobile.android

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.DeviceMobileAndroid: ImageVector
    get() {
        if (deviceMobileAndroid != null) {
            return deviceMobileAndroid!!
        }
        deviceMobileAndroid = Builder(
            name = "device-mobile-android-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.5f, 5.5f)
                curveTo(12.5f, 5.776f, 12.276f, 6f, 12f, 6f)
                curveTo(11.724f, 6f, 11.5f, 5.776f, 11.5f, 5.5f)
                curveTo(11.5f, 5.224f, 11.724f, 5f, 12f, 5f)
                curveTo(12.276f, 5f, 12.5f, 5.224f, 12.5f, 5.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 5f)
                curveTo(6f, 3.343f, 7.343f, 2f, 9f, 2f)
                horizontalLineTo(15f)
                curveTo(16.657f, 2f, 18f, 3.343f, 18f, 5f)
                verticalLineTo(19f)
                curveTo(18f, 20.657f, 16.657f, 22f, 15f, 22f)
                horizontalLineTo(9f)
                curveTo(7.343f, 22f, 6f, 20.657f, 6f, 19f)
                verticalLineTo(5f)
                close()
                moveTo(9f, 4f)
                curveTo(8.448f, 4f, 8f, 4.448f, 8f, 5f)
                verticalLineTo(19f)
                curveTo(8f, 19.552f, 8.448f, 20f, 9f, 20f)
                horizontalLineTo(15f)
                curveTo(15.552f, 20f, 16f, 19.552f, 16f, 19f)
                verticalLineTo(5f)
                curveTo(16f, 4.448f, 15.552f, 4f, 15f, 4f)
                horizontalLineTo(9f)
                close()
            }
        }.build()
        return deviceMobileAndroid!!
    }

private var deviceMobileAndroid: ImageVector? = null