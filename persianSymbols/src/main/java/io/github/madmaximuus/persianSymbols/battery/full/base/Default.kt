package io.github.madmaximuus.persianSymbols.battery.full.base

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.0f, 3.0001f)
                curveTo(10.0f, 2.4478f, 10.4477f, 2.0001f, 11.0f, 2.0001f)
                horizontalLineTo(13.0f)
                curveTo(13.5523f, 2.0001f, 14.0f, 2.4478f, 14.0f, 3.0001f)
                verticalLineTo(4.0001f)
                horizontalLineTo(15.4f)
                curveTo(16.6564f, 4.0001f, 17.7047f, 4.8913f, 17.9472f, 6.0761f)
                curveTo(17.9818f, 6.2453f, 18.0f, 6.4206f, 18.0f, 6.6001f)
                curveTo(18.0f, 6.6f, 18.0f, 6.6001f, 18.0f, 6.6001f)
                verticalLineTo(19.4001f)
                curveTo(18.0f, 19.4898f, 17.9955f, 19.5785f, 17.9866f, 19.6659f)
                curveTo(17.9425f, 20.1f, 17.7916f, 20.5025f, 17.5606f, 20.8468f)
                curveTo(17.094f, 21.5423f, 16.3005f, 22.0001f, 15.4f, 22.0001f)
                horizontalLineTo(8.6f)
                curveTo(7.1641f, 22.0001f, 6.0f, 20.836f, 6.0f, 19.4001f)
                verticalLineTo(6.6001f)
                curveTo(6.0f, 5.1641f, 7.1641f, 4.0001f, 8.6f, 4.0001f)
                horizontalLineTo(10.0f)
                verticalLineTo(3.0001f)
                close()
            }
        }.build()
        return batteryFull!!
    }

private var batteryFull: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.BatteryFull,
                contentDescription = ""
            )
        }
    }
}
