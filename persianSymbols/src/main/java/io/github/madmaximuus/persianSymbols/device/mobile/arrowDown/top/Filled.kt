package io.github.madmaximuus.persianSymbols.device.mobile.arrowDown.top

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.DeviceMobileUnknownArrowDownTop: ImageVector
    get() {
        if (deviceMobileUnknownArrowDownTop != null) {
            return deviceMobileUnknownArrowDownTop!!
        }
        deviceMobileUnknownArrowDownTop = Builder(
            name = "device-mobile-unknown-arrow-down-top-filled",
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
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 2f)
                horizontalLineTo(13.528f)
                curveTo(12.788f, 2.826f, 12.274f, 3.858f, 12.083f, 5f)
                horizontalLineTo(6f)
                curveTo(6f, 3.343f, 7.343f, 2f, 9f, 2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 6.5f)
                horizontalLineTo(12.021f)
                curveTo(12.275f, 9.58f, 14.855f, 12f, 18f, 12f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                verticalLineTo(6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 18.5f)
                verticalLineTo(19f)
                curveTo(6f, 20.657f, 7.343f, 22f, 9f, 22f)
                horizontalLineTo(15f)
                curveTo(16.657f, 22f, 18f, 20.657f, 18f, 19f)
                verticalLineTo(18.5f)
                horizontalLineTo(6f)
                close()
            }
        }.build()
        return deviceMobileUnknownArrowDownTop!!
    }

private var deviceMobileUnknownArrowDownTop: ImageVector? = null