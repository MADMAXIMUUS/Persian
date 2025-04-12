package io.github.madmaximuus.persianSymbols.device.mobile.arrowDown

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.DeviceMobileArrowDown: ImageVector
    get() {
        if (deviceMobileUnknownArrowDown != null) {
            return deviceMobileUnknownArrowDown!!
        }
        deviceMobileUnknownArrowDown = Builder(
            name = "device-mobile-unknown-arrow-down-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.75f, 5.793f)
                curveTo(19.014f, 5.7f, 19.319f, 5.759f, 19.53f, 5.97f)
                curveTo(19.823f, 6.263f, 19.823f, 6.737f, 19.53f, 7.03f)
                lineTo(18.53f, 8.03f)
                curveTo(18.237f, 8.323f, 17.763f, 8.323f, 17.47f, 8.03f)
                lineTo(16.47f, 7.03f)
                curveTo(16.177f, 6.737f, 16.177f, 6.263f, 16.47f, 5.97f)
                curveTo(16.681f, 5.759f, 16.986f, 5.7f, 17.25f, 5.793f)
                verticalLineTo(4.5f)
                curveTo(17.25f, 4.086f, 17.586f, 3.75f, 18f, 3.75f)
                curveTo(18.414f, 3.75f, 18.75f, 4.086f, 18.75f, 4.5f)
                verticalLineTo(5.793f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.25f, 6f)
                curveTo(13.25f, 3.377f, 15.377f, 1.25f, 18f, 1.25f)
                curveTo(20.623f, 1.25f, 22.75f, 3.377f, 22.75f, 6f)
                curveTo(22.75f, 8.623f, 20.623f, 10.75f, 18f, 10.75f)
                curveTo(15.377f, 10.75f, 13.25f, 8.623f, 13.25f, 6f)
                close()
                moveTo(18f, 2.75f)
                curveTo(16.205f, 2.75f, 14.75f, 4.205f, 14.75f, 6f)
                curveTo(14.75f, 7.795f, 16.205f, 9.25f, 18f, 9.25f)
                curveTo(19.795f, 9.25f, 21.25f, 7.795f, 21.25f, 6f)
                curveTo(21.25f, 4.205f, 19.795f, 2.75f, 18f, 2.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 2f)
                horizontalLineTo(14.225f)
                curveTo(13.638f, 2.554f, 13.174f, 3.235f, 12.875f, 4f)
                horizontalLineTo(9f)
                curveTo(8.448f, 4f, 8f, 4.448f, 8f, 5f)
                horizontalLineTo(12.591f)
                curveTo(12.531f, 5.324f, 12.5f, 5.659f, 12.5f, 6f)
                curveTo(12.5f, 6.169f, 12.508f, 6.335f, 12.522f, 6.5f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                verticalLineTo(11.125f)
                curveTo(16.62f, 11.367f, 17.294f, 11.5f, 18f, 11.5f)
                verticalLineTo(19f)
                curveTo(18f, 20.657f, 16.657f, 22f, 15f, 22f)
                horizontalLineTo(9f)
                curveTo(7.343f, 22f, 6f, 20.657f, 6f, 19f)
                verticalLineTo(5f)
                curveTo(6f, 3.343f, 7.343f, 2f, 9f, 2f)
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
        }.build()
        return deviceMobileUnknownArrowDown!!
    }

private var deviceMobileUnknownArrowDown: ImageVector? = null