package io.github.madmaximuus.persianSymbols.battery.exclamation

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
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
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 8.0001f)
                curveTo(12.5523f, 8.0001f, 13.0f, 8.4478f, 13.0f, 9.0001f)
                verticalLineTo(14.0001f)
                curveTo(13.0f, 14.5523f, 12.5523f, 15.0001f, 12.0f, 15.0001f)
                curveTo(11.4477f, 15.0001f, 11.0f, 14.5523f, 11.0f, 14.0001f)
                verticalLineTo(9.0001f)
                curveTo(11.0f, 8.4478f, 11.4477f, 8.0001f, 12.0f, 8.0001f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.0f, 17.0001f)
                curveTo(13.0f, 17.5523f, 12.5523f, 18.0001f, 12.0f, 18.0001f)
                curveTo(11.4477f, 18.0001f, 11.0f, 17.5523f, 11.0f, 17.0001f)
                curveTo(11.0f, 16.4478f, 11.4477f, 16.0001f, 12.0f, 16.0001f)
                curveTo(12.5523f, 16.0001f, 13.0f, 16.4478f, 13.0f, 17.0001f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.9999f, 3.0001f)
                curveTo(9.9999f, 2.4478f, 10.4476f, 2.0001f, 10.9999f, 2.0001f)
                horizontalLineTo(12.9999f)
                curveTo(13.5522f, 2.0001f, 13.9999f, 2.4478f, 13.9999f, 3.0001f)
                verticalLineTo(4.0001f)
                horizontalLineTo(15.3999f)
                curveTo(16.8358f, 4.0001f, 17.9999f, 5.1641f, 17.9999f, 6.6001f)
                verticalLineTo(19.4001f)
                curveTo(17.9999f, 20.836f, 16.8358f, 22.0001f, 15.3999f, 22.0001f)
                horizontalLineTo(8.5999f)
                curveTo(7.1639f, 22.0001f, 5.9999f, 20.836f, 5.9999f, 19.4001f)
                verticalLineTo(6.6001f)
                curveTo(5.9999f, 5.1641f, 7.1639f, 4.0001f, 8.5999f, 4.0001f)
                horizontalLineTo(9.9999f)
                verticalLineTo(3.0001f)
                close()
                moveTo(8.5999f, 6.0001f)
                curveTo(8.2685f, 6.0001f, 7.9999f, 6.2687f, 7.9999f, 6.6001f)
                verticalLineTo(19.4001f)
                curveTo(7.9999f, 19.7314f, 8.2685f, 20.0001f, 8.5999f, 20.0001f)
                horizontalLineTo(15.3999f)
                curveTo(15.7312f, 20.0001f, 15.9999f, 19.7314f, 15.9999f, 19.4001f)
                verticalLineTo(6.6001f)
                curveTo(15.9999f, 6.2687f, 15.7312f, 6.0001f, 15.3999f, 6.0001f)
                horizontalLineTo(8.5999f)
                close()
            }
        }.build()
        return batteryExclamation!!
    }

private var batteryExclamation: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.BatteryExclamation,
                contentDescription = ""
            )
        }
    }
}