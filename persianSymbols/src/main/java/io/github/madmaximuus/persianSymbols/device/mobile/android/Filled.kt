package io.github.madmaximuus.persianSymbols.device.mobile.android

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.DeviceMobileAndroid: ImageVector
    get() {
        if (deviceMobileAndroid != null) {
            return deviceMobileAndroid!!
        }
        deviceMobileAndroid = Builder(
            name = "device-mobile-android-filled",
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
                moveTo(12f, 5f)
                curveTo(12.276f, 5f, 12.5f, 4.776f, 12.5f, 4.5f)
                curveTo(12.5f, 4.224f, 12.276f, 4f, 12f, 4f)
                curveTo(11.724f, 4f, 11.5f, 4.224f, 11.5f, 4.5f)
                curveTo(11.5f, 4.776f, 11.724f, 5f, 12f, 5f)
                close()
            }
        }.build()
        return deviceMobileAndroid!!
    }

private var deviceMobileAndroid: ImageVector? = null