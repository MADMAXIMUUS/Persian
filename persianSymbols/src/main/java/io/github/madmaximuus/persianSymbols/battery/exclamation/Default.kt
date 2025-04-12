package io.github.madmaximuus.persianSymbols.battery.exclamation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.BatteryExclamation: ImageVector
    get() {
        if (batteryExclamation != null) {
            return batteryExclamation!!
        }
        batteryExclamation = Builder(
            name = "battery-exclamation-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 3f)
                curveTo(10f, 2.448f, 10.448f, 2f, 11f, 2f)
                horizontalLineTo(13f)
                curveTo(13.552f, 2f, 14f, 2.448f, 14f, 3f)
                verticalLineTo(3.5f)
                horizontalLineTo(10f)
                verticalLineTo(3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 8f)
                curveTo(6f, 5.791f, 7.791f, 4f, 10f, 4f)
                horizontalLineTo(14f)
                curveTo(16.209f, 4f, 18f, 5.791f, 18f, 8f)
                verticalLineTo(18f)
                curveTo(18f, 20.209f, 16.209f, 22f, 14f, 22f)
                horizontalLineTo(10f)
                curveTo(7.791f, 22f, 6f, 20.209f, 6f, 18f)
                verticalLineTo(8f)
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