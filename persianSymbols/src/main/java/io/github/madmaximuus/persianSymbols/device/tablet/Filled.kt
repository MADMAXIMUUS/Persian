package io.github.madmaximuus.persianSymbols.device.tablet

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.DeviceTablet: ImageVector
    get() {
        if (deviceTablet != null) {
            return deviceTablet!!
        }
        deviceTablet = Builder(
            name = "device-tablet-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.4f, 2f)
                curveTo(5.97f, 2f, 4f, 3.97f, 4f, 6.4f)
                verticalLineTo(17.6f)
                curveTo(4f, 20.03f, 5.97f, 22f, 8.4f, 22f)
                horizontalLineTo(15.6f)
                curveTo(18.03f, 22f, 20f, 20.03f, 20f, 17.6f)
                verticalLineTo(6.4f)
                curveTo(20f, 3.97f, 18.03f, 2f, 15.6f, 2f)
                horizontalLineTo(8.4f)
                close()
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
        return deviceTablet!!
    }

private var deviceTablet: ImageVector? = null