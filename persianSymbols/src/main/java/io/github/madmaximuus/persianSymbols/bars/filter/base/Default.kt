package io.github.madmaximuus.persianSymbols.bars.filter.base

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

val PersianSymbols.Default.BarsFilter: ImageVector
    get() {
        if (barsFilter != null) {
            return barsFilter!!
        }
        barsFilter = ImageVector.Builder(
            name = "bars-filter-default",
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
                moveTo(4.0f, 8.0f)
                curveTo(4.0f, 7.4477f, 4.4477f, 7.0f, 5.0f, 7.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 7.0f, 20.0f, 7.4477f, 20.0f, 8.0f)
                curveTo(20.0f, 8.5523f, 19.5523f, 9.0f, 19.0f, 9.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 9.0f, 4.0f, 8.5523f, 4.0f, 8.0f)
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
                moveTo(6.9999f, 11.9999f)
                curveTo(6.9999f, 11.4476f, 7.4476f, 10.9999f, 7.9999f, 10.9999f)
                horizontalLineTo(15.9999f)
                curveTo(16.5522f, 10.9999f, 16.9999f, 11.4476f, 16.9999f, 11.9999f)
                curveTo(16.9999f, 12.5522f, 16.5522f, 12.9999f, 15.9999f, 12.9999f)
                horizontalLineTo(7.9999f)
                curveTo(7.4476f, 12.9999f, 6.9999f, 12.5522f, 6.9999f, 11.9999f)
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
                moveTo(11.0f, 14.9998f)
                curveTo(10.4477f, 14.9998f, 10.0f, 15.4475f, 10.0f, 15.9998f)
                curveTo(10.0f, 16.552f, 10.4477f, 16.9998f, 11.0f, 16.9998f)
                horizontalLineTo(13.0f)
                curveTo(13.5523f, 16.9998f, 14.0f, 16.552f, 14.0f, 15.9998f)
                curveTo(14.0f, 15.4475f, 13.5523f, 14.9998f, 13.0f, 14.9998f)
                horizontalLineTo(11.0f)
                close()
            }
        }.build()
        return barsFilter!!
    }

private var barsFilter: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.BarsFilter,
                contentDescription = ""
            )
        }
    }
}