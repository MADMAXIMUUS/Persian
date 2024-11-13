package io.github.madmaximuus.persianSymbols.battery.empty

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.BatteryEmpty: ImageVector
    get() {
        if (batteryEmpty != null) {
            return batteryEmpty!!
        }
        batteryEmpty = Builder(
            name = "battery-empty-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 2f)
                curveTo(10.448f, 2f, 10f, 2.448f, 10f, 3f)
                verticalLineTo(4f)
                horizontalLineTo(8.6f)
                curveTo(7.164f, 4f, 6f, 5.164f, 6f, 6.6f)
                verticalLineTo(19.4f)
                curveTo(6f, 20.836f, 7.164f, 22f, 8.6f, 22f)
                horizontalLineTo(15.4f)
                curveTo(16.836f, 22f, 18f, 20.836f, 18f, 19.4f)
                verticalLineTo(6.6f)
                curveTo(18f, 5.164f, 16.836f, 4f, 15.4f, 4f)
                horizontalLineTo(14f)
                verticalLineTo(3f)
                curveTo(14f, 2.448f, 13.552f, 2f, 13f, 2f)
                horizontalLineTo(11f)
                close()
                moveTo(15.4f, 6f)
                curveTo(15.731f, 6f, 16f, 6.269f, 16f, 6.6f)
                verticalLineTo(19.4f)
                curveTo(16f, 19.731f, 15.731f, 20f, 15.4f, 20f)
                horizontalLineTo(8.6f)
                curveTo(8.269f, 20f, 8f, 19.731f, 8f, 19.4f)
                verticalLineTo(6.6f)
                curveTo(8f, 6.269f, 8.269f, 6f, 8.6f, 6f)
                horizontalLineTo(15.4f)
                close()
            }
        }.build()
        return batteryEmpty!!
    }

private var batteryEmpty: ImageVector? = null