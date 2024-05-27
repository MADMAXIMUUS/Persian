package io.github.madmaximuus.persianSymbols.battery.one.base

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Battery1: ImageVector
    get() {
        if (battery1 != null) {
            return battery1!!
        }
        battery1 = Builder(
            name = "battery-1-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 3f)
                curveTo(10f, 2.4477f, 10.4477f, 2f, 11f, 2f)
                horizontalLineTo(13f)
                curveTo(13.5523f, 2f, 14f, 2.4477f, 14f, 3f)
                verticalLineTo(3.99994f)
                horizontalLineTo(15.4f)
                curveTo(16.8359f, 3.9999f, 18f, 5.164f, 18f, 6.5999f)
                verticalLineTo(19.3999f)
                curveTo(18f, 19.4055f, 18f, 19.4112f, 17.9999f, 19.4167f)
                curveTo(17.9994f, 19.5008f, 17.9949f, 19.5838f, 17.9866f, 19.6658f)
                curveTo(17.8535f, 20.9769f, 16.7462f, 22f, 15.4f, 22f)
                horizontalLineTo(8.6f)
                curveTo(7.1641f, 22f, 6f, 20.8359f, 6f, 19.4f)
                verticalLineTo(6.59994f)
                curveTo(6f, 5.164f, 7.1641f, 3.9999f, 8.6f, 3.9999f)
                horizontalLineTo(10f)
                verticalLineTo(3f)
                close()
                moveTo(16f, 18f)
                horizontalLineTo(8f)
                verticalLineTo(6.59994f)
                curveTo(8f, 6.2686f, 8.2686f, 5.9999f, 8.6f, 5.9999f)
                horizontalLineTo(15.4f)
                curveTo(15.7314f, 5.9999f, 16f, 6.2686f, 16f, 6.5999f)
                verticalLineTo(18f)
                close()
            }
        }.build()
        return battery1!!
    }

private var battery1: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Battery1,
                contentDescription = ""
            )
        }
    }
}