package io.github.madmaximuus.persianSymbols.bars.base

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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Bars: ImageVector
    get() {
        if (bars != null) {
            return bars!!
        }
        bars = ImageVector.Builder(
            name = "bars-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(4.8897f, 6.0f)
                curveTo(4.3988f, 6.0f, 4.0008f, 6.4477f, 4.0008f, 7.0f)
                curveTo(4.0008f, 7.5523f, 4.3988f, 8.0f, 4.8897f, 8.0f)
                horizontalLineTo(19.1111f)
                curveTo(19.602f, 8.0f, 19.9999f, 7.5523f, 19.9999f, 7.0f)
                curveTo(19.9999f, 6.4477f, 19.602f, 6.0f, 19.1111f, 6.0f)
                horizontalLineTo(4.8897f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(4.0f, 12.0001f)
                curveTo(4.0f, 11.4478f, 4.398f, 11.0001f, 4.8888f, 11.0001f)
                horizontalLineTo(19.1102f)
                curveTo(19.6011f, 11.0001f, 19.9991f, 11.4478f, 19.9991f, 12.0001f)
                curveTo(19.9991f, 12.5524f, 19.6011f, 13.0001f, 19.1102f, 13.0001f)
                horizontalLineTo(4.8888f)
                curveTo(4.398f, 13.0001f, 4.0f, 12.5524f, 4.0f, 12.0001f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(4.0009f, 17.0f)
                curveTo(4.0009f, 16.4477f, 4.3989f, 16.0f, 4.8898f, 16.0f)
                horizontalLineTo(19.1112f)
                curveTo(19.6021f, 16.0f, 20.0f, 16.4477f, 20.0f, 17.0f)
                curveTo(20.0f, 17.5523f, 19.6021f, 18.0f, 19.1112f, 18.0f)
                horizontalLineTo(4.8898f)
                curveTo(4.3989f, 18.0f, 4.0009f, 17.5523f, 4.0009f, 17.0f)
                close()
            }
        }.build()
        return bars!!
    }

private var bars: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Bars,
                contentDescription = ""
            )
        }
    }
}