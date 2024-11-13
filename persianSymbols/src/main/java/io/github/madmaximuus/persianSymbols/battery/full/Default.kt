package io.github.madmaximuus.persianSymbols.battery.full

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.BatteryFull: ImageVector
    get() {
        if (batteryFull != null) {
            return batteryFull!!
        }
        batteryFull = Builder(
            name = "battery-full-default",
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
                verticalLineTo(4f)
                horizontalLineTo(15.4f)
                curveTo(16.656f, 4f, 17.705f, 4.891f, 17.947f, 6.076f)
                curveTo(17.982f, 6.245f, 18f, 6.421f, 18f, 6.6f)
                curveTo(18f, 6.6f, 18f, 6.6f, 18f, 6.6f)
                verticalLineTo(19.4f)
                curveTo(18f, 19.49f, 17.996f, 19.579f, 17.987f, 19.666f)
                curveTo(17.942f, 20.1f, 17.792f, 20.503f, 17.561f, 20.847f)
                curveTo(17.094f, 21.542f, 16.301f, 22f, 15.4f, 22f)
                horizontalLineTo(8.6f)
                curveTo(7.164f, 22f, 6f, 20.836f, 6f, 19.4f)
                verticalLineTo(6.6f)
                curveTo(6f, 5.164f, 7.164f, 4f, 8.6f, 4f)
                horizontalLineTo(10f)
                verticalLineTo(3f)
                close()
            }
        }.build()
        return batteryFull!!
    }

private var batteryFull: ImageVector? = null
