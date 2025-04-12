package io.github.madmaximuus.persianSymbols.battery.percent.zero.bolt

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Battery0PercentBolt: ImageVector
    get() {
        if (battery0PercentBolt != null) {
            return battery0PercentBolt!!
        }
        battery0PercentBolt = ImageVector.Builder(
            name = "battery-zero-percent-bolt-default",
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
                curveTo(12.608f, 11.494f, 12.515f, 11.387f, 12.532f, 11.266f)
                lineTo(12.859f, 8.913f)
                curveTo(12.889f, 8.7f, 12.607f, 8.597f, 12.492f, 8.779f)
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
                moveTo(10f, 6f)
                curveTo(8.895f, 6f, 8f, 6.895f, 8f, 8f)
                verticalLineTo(18f)
                curveTo(8f, 19.105f, 8.895f, 20f, 10f, 20f)
                horizontalLineTo(14f)
                curveTo(15.104f, 20f, 16f, 19.105f, 16f, 18f)
                verticalLineTo(8f)
                curveTo(16f, 6.895f, 15.104f, 6f, 14f, 6f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return battery0PercentBolt!!
    }

private var battery0PercentBolt: ImageVector? = null
