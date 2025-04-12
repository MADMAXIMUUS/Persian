package io.github.madmaximuus.persianSymbols.device.mobile.apple.button

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.DeviceMobileAppleButton: ImageVector
    get() {
        if (deviceMobileAppleButton != null) {
            return deviceMobileAppleButton!!
        }
        deviceMobileAppleButton = Builder(
            name = "device-mobile-apple-button-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 19.5f)
                curveTo(12.414f, 19.5f, 12.75f, 19.164f, 12.75f, 18.75f)
                curveTo(12.75f, 18.336f, 12.414f, 18f, 12f, 18f)
                curveTo(11.586f, 18f, 11.25f, 18.336f, 11.25f, 18.75f)
                curveTo(11.25f, 19.164f, 11.586f, 19.5f, 12f, 19.5f)
                close()
            }
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
        return deviceMobileAppleButton!!
    }

private var deviceMobileAppleButton: ImageVector? = null