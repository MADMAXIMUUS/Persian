package io.github.madmaximuus.persianSymbols.battery.exclamation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.BatteryExclamation: ImageVector
    get() {
        if (batteryExclamation != null) {
            return batteryExclamation!!
        }
        batteryExclamation = Builder(
            name = "battery-exclamation-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 3f)
                curveTo(10f, 2.448f, 10.448f, 2f, 11f, 2f)
                horizontalLineTo(13f)
                curveTo(13.552f, 2f, 14f, 2.448f, 14f, 3f)
                verticalLineTo(4f)
                horizontalLineTo(15f)
                curveTo(16.657f, 4f, 18f, 5.343f, 18f, 7f)
                verticalLineTo(19f)
                curveTo(18f, 20.657f, 16.657f, 22f, 15f, 22f)
                horizontalLineTo(9f)
                curveTo(7.343f, 22f, 6f, 20.657f, 6f, 19f)
                verticalLineTo(7f)
                curveTo(6f, 5.343f, 7.343f, 4f, 9f, 4f)
                horizontalLineTo(10f)
                verticalLineTo(3f)
                close()
                moveTo(11.998f, 8.126f)
                curveTo(12.412f, 8.126f, 12.748f, 8.462f, 12.748f, 8.876f)
                lineTo(12.748f, 14.349f)
                curveTo(12.748f, 14.764f, 12.412f, 15.099f, 11.998f, 15.099f)
                curveTo(11.584f, 15.099f, 11.248f, 14.764f, 11.248f, 14.349f)
                lineTo(11.248f, 8.876f)
                curveTo(11.248f, 8.462f, 11.584f, 8.126f, 11.998f, 8.126f)
                close()
                moveTo(13f, 16.716f)
                curveTo(13f, 17.268f, 12.552f, 17.716f, 12f, 17.716f)
                curveTo(11.448f, 17.716f, 11f, 17.268f, 11f, 16.716f)
                curveTo(11f, 16.163f, 11.448f, 15.716f, 12f, 15.716f)
                curveTo(12.552f, 15.716f, 13f, 16.163f, 13f, 16.716f)
                close()
            }
        }.build()
        return batteryExclamation!!
    }

private var batteryExclamation: ImageVector? = null