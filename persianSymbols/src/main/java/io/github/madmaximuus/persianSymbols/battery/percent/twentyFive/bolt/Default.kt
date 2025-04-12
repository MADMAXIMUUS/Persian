package io.github.madmaximuus.persianSymbols.battery.percent.twentyFive.bolt

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Battery25PercentBolt: ImageVector
    get() {
        if (batteryTwentyFivePercentBolt != null) {
            return batteryTwentyFivePercentBolt!!
        }
        batteryTwentyFivePercentBolt = ImageVector.Builder(
            name = "battery-twenty-five-percent-bolt-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11f, 2f)
                curveTo(10.448f, 2f, 10f, 2.448f, 10f, 3f)
                verticalLineTo(3.5f)
                horizontalLineTo(14f)
                verticalLineTo(3f)
                curveTo(14f, 2.448f, 13.552f, 2f, 13f, 2f)
                horizontalLineTo(11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.626f, 16f)
                lineTo(14.304f, 11.802f)
                curveTo(14.389f, 11.668f, 14.293f, 11.494f, 14.135f, 11.494f)
                horizontalLineTo(12.73f)
                curveTo(12.608f, 11.494f, 12.515f, 11.387f, 12.532f, 11.267f)
                lineTo(12.859f, 8.913f)
                curveTo(12.889f, 8.7f, 12.607f, 8.597f, 12.492f, 8.779f)
                lineTo(9.695f, 13.187f)
                curveTo(9.61f, 13.32f, 9.706f, 13.494f, 9.864f, 13.494f)
                horizontalLineTo(11.269f)
                curveTo(11.391f, 13.494f, 11.484f, 13.602f, 11.467f, 13.723f)
                lineTo(11.134f, 16f)
                horizontalLineTo(11.626f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 4f)
                curveTo(7.791f, 4f, 6f, 5.791f, 6f, 8f)
                verticalLineTo(18f)
                curveTo(6f, 20.201f, 7.777f, 21.986f, 9.974f, 22f)
                lineTo(10f, 22f)
                horizontalLineTo(14f)
                curveTo(16.209f, 22f, 18f, 20.209f, 18f, 18f)
                verticalLineTo(8f)
                curveTo(18f, 5.791f, 16.209f, 4f, 14f, 4f)
                horizontalLineTo(10f)
                close()
                moveTo(11.626f, 16f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                curveTo(16f, 6.895f, 15.105f, 6f, 14f, 6f)
                horizontalLineTo(10f)
                curveTo(8.895f, 6f, 8f, 6.895f, 8f, 8f)
                verticalLineTo(16f)
                horizontalLineTo(11.134f)
                lineTo(11.123f, 16.078f)
                curveTo(11.092f, 16.291f, 11.374f, 16.396f, 11.49f, 16.214f)
                lineTo(11.626f, 16f)
                close()
            }
        }.build()

        return batteryTwentyFivePercentBolt!!
    }

private var batteryTwentyFivePercentBolt: ImageVector? = null
