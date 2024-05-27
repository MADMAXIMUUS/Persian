package io.github.madmaximuus.persianSymbols.category

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

val PersianSymbols.Default.Category: ImageVector
    get() {
        if (category != null) {
            return category!!
        }
        category = Builder(
            name = "category-default",
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
                moveTo(12.8321f, 3.4453f)
                curveTo(12.6466f, 3.1671f, 12.3344f, 3.0f, 12.0f, 3.0f)
                curveTo(11.6656f, 3.0f, 11.3534f, 3.1671f, 11.1679f, 3.4453f)
                lineTo(7.168f, 9.4453f)
                curveTo(6.9634f, 9.7522f, 6.9443f, 10.1467f, 7.1183f, 10.4719f)
                curveTo(7.2923f, 10.797f, 7.6312f, 11.0f, 8.0f, 11.0f)
                horizontalLineTo(16.0f)
                curveTo(16.3688f, 11.0f, 16.7077f, 10.797f, 16.8817f, 10.4719f)
                curveTo(17.0557f, 10.1467f, 17.0366f, 9.7522f, 16.8321f, 9.4453f)
                lineTo(12.8321f, 3.4453f)
                close()
                moveTo(12.0f, 5.8028f)
                lineTo(14.1315f, 9.0f)
                horizontalLineTo(9.8685f)
                lineTo(12.0f, 5.8028f)
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
                moveTo(3.5f, 15.1f)
                curveTo(3.5f, 13.3879f, 4.8879f, 12.0f, 6.6f, 12.0f)
                horizontalLineTo(8.4f)
                curveTo(10.1121f, 12.0f, 11.5f, 13.3879f, 11.5f, 15.1f)
                verticalLineTo(16.9f)
                curveTo(11.5f, 18.6121f, 10.1121f, 20.0f, 8.4f, 20.0f)
                horizontalLineTo(6.6f)
                curveTo(4.8879f, 20.0f, 3.5f, 18.6121f, 3.5f, 16.9f)
                verticalLineTo(15.1f)
                close()
                moveTo(6.6f, 14.0f)
                curveTo(5.9925f, 14.0f, 5.5f, 14.4925f, 5.5f, 15.1f)
                verticalLineTo(16.9f)
                curveTo(5.5f, 17.5075f, 5.9925f, 18.0f, 6.6f, 18.0f)
                horizontalLineTo(8.4f)
                curveTo(9.0075f, 18.0f, 9.5f, 17.5075f, 9.5f, 16.9f)
                verticalLineTo(15.1f)
                curveTo(9.5f, 14.4925f, 9.0075f, 14.0f, 8.4f, 14.0f)
                horizontalLineTo(6.6f)
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
                moveTo(12.5f, 16.0f)
                curveTo(12.5f, 13.7909f, 14.2909f, 12.0f, 16.5f, 12.0f)
                curveTo(18.7091f, 12.0f, 20.5f, 13.7909f, 20.5f, 16.0f)
                curveTo(20.5f, 18.2091f, 18.7091f, 20.0f, 16.5f, 20.0f)
                curveTo(14.2909f, 20.0f, 12.5f, 18.2091f, 12.5f, 16.0f)
                close()
                moveTo(16.5f, 14.0f)
                curveTo(15.3954f, 14.0f, 14.5f, 14.8954f, 14.5f, 16.0f)
                curveTo(14.5f, 17.1046f, 15.3954f, 18.0f, 16.5f, 18.0f)
                curveTo(17.6046f, 18.0f, 18.5f, 17.1046f, 18.5f, 16.0f)
                curveTo(18.5f, 14.8954f, 17.6046f, 14.0f, 16.5f, 14.0f)
                close()
            }
        }.build()
        return category!!
    }

private var category: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Category,
                contentDescription = ""
            )
        }
    }
}