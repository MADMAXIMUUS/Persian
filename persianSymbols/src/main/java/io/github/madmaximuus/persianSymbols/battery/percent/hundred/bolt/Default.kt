package io.github.madmaximuus.persianSymbols.battery.percent.hundred.bolt

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Battery100PercentBolt: ImageVector
    get() {
        if (batteryHundredPercentBolt != null) {
            return batteryHundredPercentBolt!!
        }
        batteryHundredPercentBolt = ImageVector.Builder(
            name = "battery-hundred-percent-bolt-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
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
                moveTo(6.021f, 7.591f)
                curveTo(6.225f, 5.574f, 7.929f, 4f, 10f, 4f)
                horizontalLineTo(14f)
                curveTo(16.209f, 4f, 18f, 5.791f, 18f, 8f)
                verticalLineTo(18f)
                curveTo(18f, 20.209f, 16.209f, 22f, 14f, 22f)
                horizontalLineTo(10f)
                curveTo(9.991f, 22f, 9.983f, 22f, 9.974f, 22f)
                curveTo(7.777f, 21.986f, 6f, 20.201f, 6f, 18f)
                verticalLineTo(8f)
                curveTo(6f, 7.862f, 6.007f, 7.725f, 6.021f, 7.591f)
                close()
                moveTo(9.695f, 13.187f)
                lineTo(12.492f, 8.779f)
                curveTo(12.607f, 8.597f, 12.889f, 8.7f, 12.859f, 8.913f)
                lineTo(12.532f, 11.267f)
                curveTo(12.515f, 11.387f, 12.608f, 11.494f, 12.73f, 11.494f)
                horizontalLineTo(14.135f)
                curveTo(14.293f, 11.494f, 14.389f, 11.668f, 14.304f, 11.802f)
                lineTo(11.49f, 16.214f)
                curveTo(11.374f, 16.396f, 11.092f, 16.291f, 11.123f, 16.078f)
                lineTo(11.467f, 13.723f)
                curveTo(11.484f, 13.602f, 11.391f, 13.494f, 11.269f, 13.494f)
                horizontalLineTo(9.864f)
                curveTo(9.706f, 13.494f, 9.61f, 13.32f, 9.695f, 13.187f)
                close()
            }
        }.build()

        return batteryHundredPercentBolt!!
    }

private var batteryHundredPercentBolt: ImageVector? = null
