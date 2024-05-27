package io.github.madmaximuus.persianSymbols.sun

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

val PersianSymbols.Default.Sun: ImageVector
    get() {
        if (sun != null) {
            return sun!!
        }
        sun = Builder(
            name = "sun-default",
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
                moveTo(13.0f, 3.0f)
                curveTo(13.0f, 2.4477f, 12.5523f, 2.0f, 12.0f, 2.0f)
                curveTo(11.4477f, 2.0f, 11.0f, 2.4477f, 11.0f, 3.0f)
                verticalLineTo(5.0f)
                curveTo(11.0f, 5.5523f, 11.4477f, 6.0f, 12.0f, 6.0f)
                curveTo(12.5523f, 6.0f, 13.0f, 5.5523f, 13.0f, 5.0f)
                verticalLineTo(3.0f)
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
                moveTo(4.2929f, 4.2929f)
                curveTo(4.6834f, 3.9024f, 5.3166f, 3.9024f, 5.7071f, 4.2929f)
                lineTo(7.7071f, 6.2929f)
                curveTo(8.0976f, 6.6834f, 8.0976f, 7.3166f, 7.7071f, 7.7071f)
                curveTo(7.3166f, 8.0976f, 6.6834f, 8.0976f, 6.2929f, 7.7071f)
                lineTo(4.2929f, 5.7071f)
                curveTo(3.9024f, 5.3166f, 3.9024f, 4.6834f, 4.2929f, 4.2929f)
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
                moveTo(12.0f, 17.0f)
                curveTo(14.7614f, 17.0f, 17.0f, 14.7614f, 17.0f, 12.0f)
                curveTo(17.0f, 9.2386f, 14.7614f, 7.0f, 12.0f, 7.0f)
                curveTo(9.2386f, 7.0f, 7.0f, 9.2386f, 7.0f, 12.0f)
                curveTo(7.0f, 14.7614f, 9.2386f, 17.0f, 12.0f, 17.0f)
                close()
                moveTo(12.0f, 15.0f)
                curveTo(13.6569f, 15.0f, 15.0f, 13.6569f, 15.0f, 12.0f)
                curveTo(15.0f, 10.3431f, 13.6569f, 9.0f, 12.0f, 9.0f)
                curveTo(10.3431f, 9.0f, 9.0f, 10.3431f, 9.0f, 12.0f)
                curveTo(9.0f, 13.6569f, 10.3431f, 15.0f, 12.0f, 15.0f)
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
                moveTo(19.7071f, 5.7071f)
                lineTo(17.7071f, 7.7071f)
                curveTo(17.3166f, 8.0976f, 16.6834f, 8.0976f, 16.2929f, 7.7071f)
                curveTo(15.9024f, 7.3166f, 15.9024f, 6.6834f, 16.2929f, 6.2929f)
                lineTo(18.2929f, 4.2929f)
                curveTo(18.6834f, 3.9024f, 19.3166f, 3.9024f, 19.7071f, 4.2929f)
                curveTo(20.0976f, 4.6834f, 20.0976f, 5.3166f, 19.7071f, 5.7071f)
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
                moveTo(21.0f, 11.0f)
                horizontalLineTo(19.0f)
                curveTo(18.4477f, 11.0f, 18.0f, 11.4477f, 18.0f, 12.0f)
                curveTo(18.0f, 12.5523f, 18.4477f, 13.0f, 19.0f, 13.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 13.0f, 22.0f, 12.5523f, 22.0f, 12.0f)
                curveTo(22.0f, 11.4477f, 21.5523f, 11.0f, 21.0f, 11.0f)
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
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.0f, 19.0f)
                verticalLineTo(21.0f)
                curveTo(11.0f, 21.5523f, 11.4477f, 22.0f, 12.0f, 22.0f)
                curveTo(12.5523f, 22.0f, 13.0f, 21.5523f, 13.0f, 21.0f)
                verticalLineTo(19.0f)
                curveTo(13.0f, 18.4477f, 12.5523f, 18.0f, 12.0f, 18.0f)
                curveTo(11.4477f, 18.0f, 11.0f, 18.4477f, 11.0f, 19.0f)
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
                moveTo(7.7071f, 16.2929f)
                curveTo(8.0976f, 16.6834f, 8.0976f, 17.3166f, 7.7071f, 17.7071f)
                lineTo(5.7071f, 19.7071f)
                curveTo(5.3166f, 20.0976f, 4.6834f, 20.0976f, 4.2929f, 19.7071f)
                curveTo(3.9024f, 19.3166f, 3.9024f, 18.6834f, 4.2929f, 18.2929f)
                lineTo(6.2929f, 16.2929f)
                curveTo(6.6834f, 15.9024f, 7.3166f, 15.9024f, 7.7071f, 16.2929f)
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
                moveTo(3.0f, 11.0f)
                curveTo(2.4477f, 11.0f, 2.0f, 11.4477f, 2.0f, 12.0f)
                curveTo(2.0f, 12.5523f, 2.4477f, 13.0f, 3.0f, 13.0f)
                horizontalLineTo(5.0f)
                curveTo(5.5523f, 13.0f, 6.0f, 12.5523f, 6.0f, 12.0f)
                curveTo(6.0f, 11.4477f, 5.5523f, 11.0f, 5.0f, 11.0f)
                horizontalLineTo(3.0f)
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
                imageVector = PersianSymbols.Default.Sun,
                contentDescription = ""
            )
        }
    }
}