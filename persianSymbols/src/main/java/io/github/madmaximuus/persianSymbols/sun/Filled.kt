package io.github.madmaximuus.persianSymbols.sun

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

val PersianSymbols.Filled.Sun: ImageVector
    get() {
        if (sun != null) {
            return sun!!
        }
        sun = Builder(
            name = "sun-filled",
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
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(13f, 3f)
                curveTo(13f, 2.4477f, 12.5523f, 2f, 12f, 2f)
                curveTo(11.4477f, 2f, 11f, 2.4477f, 11f, 3f)
                verticalLineTo(5f)
                curveTo(11f, 5.5523f, 11.4477f, 6f, 12f, 6f)
                curveTo(12.5523f, 6f, 13f, 5.5523f, 13f, 5f)
                verticalLineTo(3f)
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
                moveTo(4.29289f, 4.29289f)
                curveTo(4.6834f, 3.9024f, 5.3166f, 3.9024f, 5.7071f, 4.2929f)
                lineTo(7.70711f, 6.29289f)
                curveTo(8.0976f, 6.6834f, 8.0976f, 7.3166f, 7.7071f, 7.7071f)
                curveTo(7.3166f, 8.0976f, 6.6834f, 8.0976f, 6.2929f, 7.7071f)
                lineTo(4.29289f, 5.70711f)
                curveTo(3.9024f, 5.3166f, 3.9024f, 4.6834f, 4.2929f, 4.2929f)
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
                moveTo(17f, 12f)
                curveTo(17f, 14.7614f, 14.7614f, 17f, 12f, 17f)
                curveTo(9.2386f, 17f, 7f, 14.7614f, 7f, 12f)
                curveTo(7f, 9.2386f, 9.2386f, 7f, 12f, 7f)
                curveTo(14.7614f, 7f, 17f, 9.2386f, 17f, 12f)
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
                moveTo(19.7071f, 5.70711f)
                lineTo(17.7071f, 7.70711f)
                curveTo(17.3166f, 8.0976f, 16.6834f, 8.0976f, 16.2929f, 7.7071f)
                curveTo(15.9024f, 7.3166f, 15.9024f, 6.6834f, 16.2929f, 6.2929f)
                lineTo(18.2929f, 4.29289f)
                curveTo(18.6834f, 3.9024f, 19.3166f, 3.9024f, 19.7071f, 4.2929f)
                curveTo(20.0976f, 4.6834f, 20.0976f, 5.3166f, 19.7071f, 5.7071f)
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
                moveTo(21f, 11f)
                horizontalLineTo(19f)
                curveTo(18.4477f, 11f, 18f, 11.4477f, 18f, 12f)
                curveTo(18f, 12.5523f, 18.4477f, 13f, 19f, 13f)
                horizontalLineTo(21f)
                curveTo(21.5523f, 13f, 22f, 12.5523f, 22f, 12f)
                curveTo(22f, 11.4477f, 21.5523f, 11f, 21f, 11f)
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
                moveTo(17.7071f, 16.2929f)
                lineTo(19.7071f, 18.2929f)
                curveTo(20.0976f, 18.6834f, 20.0976f, 19.3166f, 19.7071f, 19.7071f)
                curveTo(19.3166f, 20.0976f, 18.6834f, 20.0976f, 18.2929f, 19.7071f)
                lineTo(16.2929f, 17.7071f)
                curveTo(15.9024f, 17.3166f, 15.9024f, 16.6834f, 16.2929f, 16.2929f)
                curveTo(16.6834f, 15.9024f, 17.3166f, 15.9024f, 17.7071f, 16.2929f)
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
                moveTo(11f, 19f)
                verticalLineTo(21f)
                curveTo(11f, 21.5523f, 11.4477f, 22f, 12f, 22f)
                curveTo(12.5523f, 22f, 13f, 21.5523f, 13f, 21f)
                verticalLineTo(19f)
                curveTo(13f, 18.4477f, 12.5523f, 18f, 12f, 18f)
                curveTo(11.4477f, 18f, 11f, 18.4477f, 11f, 19f)
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
                moveTo(7.70711f, 16.2929f)
                curveTo(8.0976f, 16.6834f, 8.0976f, 17.3166f, 7.7071f, 17.7071f)
                lineTo(5.70711f, 19.7071f)
                curveTo(5.3166f, 20.0976f, 4.6834f, 20.0976f, 4.2929f, 19.7071f)
                curveTo(3.9024f, 19.3166f, 3.9024f, 18.6834f, 4.2929f, 18.2929f)
                lineTo(6.29289f, 16.2929f)
                curveTo(6.6834f, 15.9024f, 7.3166f, 15.9024f, 7.7071f, 16.2929f)
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
                moveTo(3f, 11f)
                curveTo(2.4477f, 11f, 2f, 11.4477f, 2f, 12f)
                curveTo(2f, 12.5523f, 2.4477f, 13f, 3f, 13f)
                horizontalLineTo(5f)
                curveTo(5.5523f, 13f, 6f, 12.5523f, 6f, 12f)
                curveTo(6f, 11.4477f, 5.5523f, 11f, 5f, 11f)
                horizontalLineTo(3f)
                close()
            }
        }.build()
        return sun!!
    }

private var sun: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.Sun,
                contentDescription = ""
            )
        }
    }
}