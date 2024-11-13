package io.github.madmaximuus.persianSymbols.battery.empty.bolt

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.BatteryEmptyBolt: ImageVector
    get() {
        if (batteryEmptyBolt != null) {
            return batteryEmptyBolt!!
        }
        batteryEmptyBolt = Builder(
            name = "battery-empty-bolt-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.492f, 8.779f)
                lineTo(9.695f, 13.187f)
                curveTo(9.61f, 13.32f, 9.706f, 13.494f, 9.864f, 13.494f)
                horizontalLineTo(11.269f)
                curveTo(11.391f, 13.494f, 11.484f, 13.602f, 11.467f, 13.723f)
                lineTo(11.123f, 16.078f)
                curveTo(11.092f, 16.291f, 11.374f, 16.396f, 11.49f, 16.214f)
                lineTo(14.304f, 11.802f)
                curveTo(14.389f, 11.668f, 14.293f, 11.494f, 14.135f, 11.494f)
                horizontalLineTo(12.73f)
                curveTo(12.608f, 11.494f, 12.515f, 11.387f, 12.532f, 11.267f)
                lineTo(12.859f, 8.913f)
                curveTo(12.889f, 8.7f, 12.607f, 8.597f, 12.492f, 8.779f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 3f)
                curveTo(10f, 2.448f, 10.448f, 2f, 11f, 2f)
                horizontalLineTo(13f)
                curveTo(13.552f, 2f, 14f, 2.448f, 14f, 3f)
                verticalLineTo(4f)
                horizontalLineTo(15.4f)
                curveTo(16.836f, 4f, 18f, 5.164f, 18f, 6.6f)
                verticalLineTo(19.4f)
                curveTo(18f, 20.836f, 16.836f, 22f, 15.4f, 22f)
                horizontalLineTo(8.6f)
                curveTo(7.164f, 22f, 6f, 20.836f, 6f, 19.4f)
                verticalLineTo(6.6f)
                curveTo(6f, 5.164f, 7.164f, 4f, 8.6f, 4f)
                horizontalLineTo(10f)
                verticalLineTo(3f)
                close()
                moveTo(8.6f, 6f)
                curveTo(8.269f, 6f, 8f, 6.269f, 8f, 6.6f)
                verticalLineTo(19.4f)
                curveTo(8f, 19.731f, 8.269f, 20f, 8.6f, 20f)
                horizontalLineTo(15.4f)
                curveTo(15.731f, 20f, 16f, 19.731f, 16f, 19.4f)
                verticalLineTo(6.6f)
                curveTo(16f, 6.269f, 15.731f, 6f, 15.4f, 6f)
                horizontalLineTo(8.6f)
                close()
            }
        }.build()
        return batteryEmptyBolt!!
    }

private var batteryEmptyBolt: ImageVector? = null