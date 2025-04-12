package io.github.madmaximuus.persianSymbols.device.tablet

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.DeviceTablet: ImageVector
    get() {
        if (deviceTablet != null) {
            return deviceTablet!!
        }
        deviceTablet = Builder(
            name = "device-tablet-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.5f, 2f)
                curveTo(6.015f, 2f, 4f, 4.015f, 4f, 6.5f)
                verticalLineTo(17.5f)
                curveTo(4f, 19.985f, 6.015f, 22f, 8.5f, 22f)
                horizontalLineTo(15.5f)
                curveTo(17.985f, 22f, 20f, 19.985f, 20f, 17.5f)
                verticalLineTo(6.5f)
                curveTo(20f, 4.015f, 17.985f, 2f, 15.5f, 2f)
                horizontalLineTo(8.5f)
                close()
                moveTo(6f, 6.5f)
                curveTo(6f, 5.119f, 7.119f, 4f, 8.5f, 4f)
                horizontalLineTo(15.5f)
                curveTo(16.881f, 4f, 18f, 5.119f, 18f, 6.5f)
                verticalLineTo(17.5f)
                curveTo(18f, 18.881f, 16.881f, 20f, 15.5f, 20f)
                horizontalLineTo(8.5f)
                curveTo(7.119f, 20f, 6f, 18.881f, 6f, 17.5f)
                verticalLineTo(6.5f)
                close()
            }
        }.build()
        return deviceTablet!!
    }

private var deviceTablet: ImageVector? = null