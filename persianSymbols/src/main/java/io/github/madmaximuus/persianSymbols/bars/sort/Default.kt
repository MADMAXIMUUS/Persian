package io.github.madmaximuus.persianSymbols.bars.sort

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

val PersianSymbols.Default.BarsSort: ImageVector
    get() {
        if (barsSort != null) {
            return barsSort!!
        }
        barsSort = Builder(
            name = "bars-sort-default",
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
                moveTo(5.0001f, 7.0001f)
                curveTo(4.4478f, 7.0001f, 4.0001f, 7.4478f, 4.0001f, 8.0001f)
                curveTo(4.0001f, 8.5524f, 4.4478f, 9.0001f, 5.0001f, 9.0001f)
                horizontalLineTo(19.0001f)
                curveTo(19.5524f, 9.0001f, 20.0001f, 8.5524f, 20.0001f, 8.0001f)
                curveTo(20.0001f, 7.4478f, 19.5524f, 7.0001f, 19.0001f, 7.0001f)
                horizontalLineTo(5.0001f)
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
                moveTo(4.0001f, 12.0f)
                curveTo(4.0001f, 11.4477f, 4.4478f, 11.0f, 5.0001f, 11.0f)
                horizontalLineTo(13.0001f)
                curveTo(13.5524f, 11.0f, 14.0001f, 11.4477f, 14.0001f, 12.0f)
                curveTo(14.0001f, 12.5523f, 13.5524f, 13.0f, 13.0001f, 13.0f)
                horizontalLineTo(5.0001f)
                curveTo(4.4478f, 13.0f, 4.0001f, 12.5523f, 4.0001f, 12.0f)
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
                moveTo(4.0f, 15.9999f)
                curveTo(4.0f, 15.4476f, 4.4477f, 14.9999f, 5.0f, 14.9999f)
                horizontalLineTo(7.0f)
                curveTo(7.5523f, 14.9999f, 8.0f, 15.4476f, 8.0f, 15.9999f)
                curveTo(8.0f, 16.5522f, 7.5523f, 16.9999f, 7.0f, 16.9999f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 16.9999f, 4.0f, 16.5522f, 4.0f, 15.9999f)
                close()
            }
        }.build()
        return barsSort!!
    }

private var barsSort: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.BarsSort,
                contentDescription = ""
            )
        }
    }
}