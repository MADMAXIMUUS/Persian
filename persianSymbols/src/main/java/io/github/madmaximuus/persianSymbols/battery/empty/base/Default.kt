package io.github.madmaximuus.persianSymbols.battery.empty.base

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
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
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.9999f, 2.0001f)
                curveTo(10.4476f, 2.0001f, 9.9999f, 2.4478f, 9.9999f, 3.0001f)
                verticalLineTo(4.0001f)
                horizontalLineTo(8.5999f)
                curveTo(7.1639f, 4.0001f, 5.9999f, 5.1641f, 5.9999f, 6.6001f)
                verticalLineTo(19.4001f)
                curveTo(5.9999f, 20.836f, 7.1639f, 22.0001f, 8.5999f, 22.0001f)
                horizontalLineTo(15.3999f)
                curveTo(16.8358f, 22.0001f, 17.9999f, 20.836f, 17.9999f, 19.4001f)
                verticalLineTo(6.6001f)
                curveTo(17.9999f, 5.1641f, 16.8358f, 4.0001f, 15.3999f, 4.0001f)
                horizontalLineTo(13.9999f)
                verticalLineTo(3.0001f)
                curveTo(13.9999f, 2.4478f, 13.5522f, 2.0001f, 12.9999f, 2.0001f)
                horizontalLineTo(10.9999f)
                close()
                moveTo(15.3999f, 6.0001f)
                curveTo(15.7312f, 6.0001f, 15.9999f, 6.2687f, 15.9999f, 6.6001f)
                verticalLineTo(19.4001f)
                curveTo(15.9999f, 19.7314f, 15.7312f, 20.0001f, 15.3999f, 20.0001f)
                horizontalLineTo(8.5999f)
                curveTo(8.2685f, 20.0001f, 7.9999f, 19.7314f, 7.9999f, 19.4001f)
                verticalLineTo(6.6001f)
                curveTo(7.9999f, 6.2687f, 8.2685f, 6.0001f, 8.5999f, 6.0001f)
                horizontalLineTo(15.3999f)
                close()
            }
        }.build()
        return batteryEmpty!!
    }

private var batteryEmpty: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.BatteryEmpty,
                contentDescription = ""
            )
        }
    }
}