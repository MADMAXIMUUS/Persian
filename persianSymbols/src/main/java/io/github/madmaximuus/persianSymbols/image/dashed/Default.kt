package io.github.madmaximuus.persianSymbols.image.dashed

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

val PersianSymbols.Default.ImageDashed: ImageVector
    get() {
        if (imageDashed != null) {
            return imageDashed!!
        }
        imageDashed = Builder(
            name = "image-dashed-default",
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
                moveTo(2.999f, 7.4999f)
                curveTo(2.999f, 5.0146f, 5.0137f, 2.9999f, 7.499f, 2.9999f)
                horizontalLineTo(10.0f)
                curveTo(10.5523f, 2.9999f, 11.0f, 3.4476f, 11.0f, 3.9999f)
                curveTo(11.0f, 4.5522f, 10.5523f, 4.9999f, 10.0f, 4.9999f)
                horizontalLineTo(7.499f)
                curveTo(6.1183f, 4.9999f, 4.999f, 6.1192f, 4.999f, 7.4999f)
                verticalLineTo(10.0f)
                curveTo(4.999f, 10.5523f, 4.5513f, 11.0f, 3.999f, 11.0f)
                curveTo(3.4467f, 11.0f, 2.999f, 10.5523f, 2.999f, 10.0f)
                verticalLineTo(7.4999f)
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
                moveTo(13.0f, 3.9999f)
                curveTo(13.0f, 3.4476f, 13.4477f, 2.9999f, 14.0f, 2.9999f)
                horizontalLineTo(16.4991f)
                curveTo(18.9844f, 2.9999f, 20.999f, 5.0146f, 20.999f, 7.4999f)
                verticalLineTo(10.0f)
                curveTo(20.999f, 10.5523f, 20.5513f, 11.0f, 19.999f, 11.0f)
                curveTo(19.4467f, 11.0f, 18.999f, 10.5523f, 18.999f, 10.0f)
                verticalLineTo(7.4999f)
                curveTo(18.999f, 6.1192f, 17.8798f, 4.9999f, 16.4991f, 4.9999f)
                horizontalLineTo(14.0f)
                curveTo(13.4477f, 4.9999f, 13.0f, 4.5522f, 13.0f, 3.9999f)
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
                moveTo(4.0002f, 13.0f)
                curveTo(4.5525f, 13.0001f, 5.0001f, 13.4479f, 5.0f, 14.0002f)
                lineTo(4.9996f, 16.4995f)
                curveTo(4.9994f, 17.8803f, 6.1187f, 18.9999f, 7.4996f, 18.9999f)
                horizontalLineTo(10.0f)
                curveTo(10.5523f, 18.9999f, 11.0f, 19.4476f, 11.0f, 19.9999f)
                curveTo(11.0f, 20.5522f, 10.5523f, 20.9999f, 10.0f, 20.9999f)
                horizontalLineTo(7.4996f)
                curveTo(5.014f, 20.9999f, 2.9992f, 18.9847f, 2.9996f, 16.4991f)
                lineTo(3.0f, 13.9998f)
                curveTo(3.0001f, 13.4476f, 3.4479f, 12.9999f, 4.0002f, 13.0f)
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
                moveTo(19.999f, 13.0f)
                curveTo(20.5513f, 13.0f, 20.999f, 13.4477f, 20.999f, 14.0f)
                verticalLineTo(16.4999f)
                curveTo(20.999f, 18.9852f, 18.9843f, 20.9999f, 16.499f, 20.9999f)
                horizontalLineTo(14.0f)
                curveTo(13.4477f, 20.9999f, 13.0f, 20.5522f, 13.0f, 19.9999f)
                curveTo(13.0f, 19.4476f, 13.4477f, 18.9999f, 14.0f, 18.9999f)
                horizontalLineTo(16.499f)
                curveTo(17.8797f, 18.9999f, 18.999f, 17.8806f, 18.999f, 16.4999f)
                verticalLineTo(14.0f)
                curveTo(18.999f, 13.4477f, 19.4467f, 13.0f, 19.999f, 13.0f)
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
                moveTo(17.3528f, 17.0f)
                horizontalLineTo(6.7773f)
                curveTo(6.4519f, 17.0f, 6.2627f, 16.6323f, 6.4518f, 16.3675f)
                lineTo(8.724f, 13.1864f)
                curveTo(8.8682f, 12.9845f, 9.1595f, 12.9612f, 9.3339f, 13.1376f)
                lineTo(11.5821f, 15.4108f)
                curveTo(11.7817f, 15.6126f, 12.1223f, 15.548f, 12.2341f, 15.287f)
                lineTo(14.1603f, 10.7927f)
                curveTo(14.2944f, 10.4797f, 14.7334f, 10.4668f, 14.8857f, 10.7714f)
                lineTo(17.7106f, 16.4211f)
                curveTo(17.8435f, 16.6871f, 17.6501f, 17.0f, 17.3528f, 17.0f)
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
                moveTo(8.0f, 9.0f)
                curveTo(8.5523f, 9.0f, 9.0f, 8.5523f, 9.0f, 8.0f)
                curveTo(9.0f, 7.4477f, 8.5523f, 7.0f, 8.0f, 7.0f)
                curveTo(7.4477f, 7.0f, 7.0f, 7.4477f, 7.0f, 8.0f)
                curveTo(7.0f, 8.5523f, 7.4477f, 9.0f, 8.0f, 9.0f)
                close()
            }
        }.build()
        return imageDashed!!
    }

private var imageDashed: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.ImageDashed,
                contentDescription = ""
            )
        }
    }
}