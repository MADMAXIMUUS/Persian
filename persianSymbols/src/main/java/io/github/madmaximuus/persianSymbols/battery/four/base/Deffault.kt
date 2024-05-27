package io.github.madmaximuus.persianSymbols.battery.four.base

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

val PersianSymbols.Default.Battery4: ImageVector
    get() {
        if (battery4 != null) {
            return battery4!!
        }
        battery4 = Builder(
            name = "battery-4-default",
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
                moveTo(10.0f, 3.0f)
                curveTo(10.0f, 2.4477f, 10.4477f, 2.0f, 11.0f, 2.0f)
                horizontalLineTo(13.0f)
                curveTo(13.5523f, 2.0f, 14.0f, 2.4477f, 14.0f, 3.0f)
                verticalLineTo(3.9999f)
                horizontalLineTo(15.4f)
                curveTo(16.8359f, 3.9999f, 18.0f, 5.164f, 18.0f, 6.5999f)
                verticalLineTo(19.3999f)
                curveTo(18.0f, 19.4055f, 18.0f, 19.4112f, 17.9999f, 19.4167f)
                curveTo(17.9994f, 19.5008f, 17.9949f, 19.5838f, 17.9866f, 19.6658f)
                curveTo(17.8535f, 20.9769f, 16.7462f, 22.0f, 15.4f, 22.0f)
                horizontalLineTo(8.6f)
                curveTo(7.1641f, 22.0f, 6.0f, 20.8359f, 6.0f, 19.4f)
                verticalLineTo(6.5999f)
                curveTo(6.0f, 5.164f, 7.1641f, 3.9999f, 8.6f, 3.9999f)
                horizontalLineTo(10.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(16.0f, 12.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.5999f)
                curveTo(8.0f, 6.2686f, 8.2686f, 5.9999f, 8.6f, 5.9999f)
                horizontalLineTo(15.4f)
                curveTo(15.7314f, 5.9999f, 16.0f, 6.2686f, 16.0f, 6.5999f)
                verticalLineTo(12.0f)
                close()
            }
        }.build()
        return battery4!!
    }

private var battery4: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Battery4,
                contentDescription = ""
            )
        }
    }
}