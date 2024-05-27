package io.github.madmaximuus.persianSymbols.image.base

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

val PersianSymbols.Default.Image: ImageVector
    get() {
        if (image != null) {
            return image!!
        }
        image = Builder(
            name = "image-default",
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
                moveTo(17.3528f, 17.0f)
                horizontalLineTo(6.7773f)
                curveTo(6.4519f, 17.0f, 6.2627f, 16.6323f, 6.4518f, 16.3675f)
                lineTo(8.724f, 13.1864f)
                curveTo(8.8682f, 12.9845f, 9.1595f, 12.9613f, 9.3339f, 13.1376f)
                lineTo(11.5821f, 15.4108f)
                curveTo(11.7817f, 15.6126f, 12.1223f, 15.548f, 12.2341f, 15.2871f)
                lineTo(14.1603f, 10.7927f)
                curveTo(14.2944f, 10.4797f, 14.7334f, 10.4668f, 14.8857f, 10.7714f)
                lineTo(17.7106f, 16.4211f)
                curveTo(17.8436f, 16.6871f, 17.6502f, 17.0f, 17.3528f, 17.0f)
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
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.0f, 7.5f)
                curveTo(3.0f, 5.0147f, 5.0147f, 3.0f, 7.5f, 3.0f)
                horizontalLineTo(16.5f)
                curveTo(18.9853f, 3.0f, 21.0f, 5.0147f, 21.0f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(21.0f, 18.9853f, 18.9853f, 21.0f, 16.5f, 21.0f)
                horizontalLineTo(7.5f)
                curveTo(5.0147f, 21.0f, 3.0f, 18.9853f, 3.0f, 16.5f)
                verticalLineTo(7.5f)
                close()
                moveTo(7.5f, 5.0f)
                curveTo(6.1193f, 5.0f, 5.0f, 6.1193f, 5.0f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(5.0f, 17.8807f, 6.1193f, 19.0f, 7.5f, 19.0f)
                horizontalLineTo(16.5f)
                curveTo(17.8807f, 19.0f, 19.0f, 17.8807f, 19.0f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(19.0f, 6.1193f, 17.8807f, 5.0f, 16.5f, 5.0f)
                horizontalLineTo(7.5f)
                close()
            }
        }.build()
        return image!!
    }

private var image: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Image,
                contentDescription = ""
            )
        }
    }
}