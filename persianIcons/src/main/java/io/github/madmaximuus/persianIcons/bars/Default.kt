package io.github.madmaximuus.persianIcons.bars

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
import io.github.madmaximuus.persianIcons.foundation.PersianSymbols

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
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(4.88968f, 6f)
                curveTo(4.3988f, 6f, 4.0008f, 6.4477f, 4.0008f, 7f)
                curveTo(4.0008f, 7.5523f, 4.3988f, 8f, 4.8897f, 8f)
                horizontalLineTo(19.1111f)
                curveTo(19.602f, 8f, 19.9999f, 7.5523f, 19.9999f, 7f)
                curveTo(19.9999f, 6.4477f, 19.602f, 6f, 19.1111f, 6f)
                horizontalLineTo(4.88968f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(4f, 12.0001f)
                curveTo(4f, 11.4478f, 4.3979f, 11.0001f, 4.8888f, 11.0001f)
                horizontalLineTo(19.1102f)
                curveTo(19.6011f, 11.0001f, 19.9991f, 11.4478f, 19.9991f, 12.0001f)
                curveTo(19.9991f, 12.5524f, 19.6011f, 13.0001f, 19.1102f, 13.0001f)
                horizontalLineTo(4.88884f)
                curveTo(4.3979f, 13.0001f, 4f, 12.5524f, 4f, 12.0001f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(4.00094f, 17f)
                curveTo(4.0009f, 16.4477f, 4.3989f, 16f, 4.8898f, 16f)
                horizontalLineTo(19.1112f)
                curveTo(19.6021f, 16f, 20f, 16.4477f, 20f, 17f)
                curveTo(20f, 17.5523f, 19.6021f, 18f, 19.1112f, 18f)
                horizontalLineTo(4.88977f)
                curveTo(4.3989f, 18f, 4.0009f, 17.5523f, 4.0009f, 17f)
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