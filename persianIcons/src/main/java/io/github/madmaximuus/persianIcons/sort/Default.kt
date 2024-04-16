package io.github.madmaximuus.persianIcons.sort

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun sortDefault(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "sort-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(color),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(5.00009f, 7.00012f)
                curveTo(4.4478f, 7.0001f, 4.0001f, 7.4478f, 4.0001f, 8.0001f)
                curveTo(4.0001f, 8.5524f, 4.4478f, 9.0001f, 5.0001f, 9.0001f)
                horizontalLineTo(19.0001f)
                curveTo(19.5524f, 9.0001f, 20.0001f, 8.5524f, 20.0001f, 8.0001f)
                curveTo(20.0001f, 7.4478f, 19.5524f, 7.0001f, 19.0001f, 7.0001f)
                horizontalLineTo(5.00009f)
                close()
            }
            path(
                fill = SolidColor(color),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(4.00009f, 12f)
                curveTo(4.0001f, 11.4477f, 4.4478f, 11f, 5.0001f, 11f)
                horizontalLineTo(13.0001f)
                curveTo(13.5524f, 11f, 14.0001f, 11.4477f, 14.0001f, 12f)
                curveTo(14.0001f, 12.5523f, 13.5524f, 13f, 13.0001f, 13f)
                horizontalLineTo(5.00009f)
                curveTo(4.4478f, 13f, 4.0001f, 12.5523f, 4.0001f, 12f)
                close()
            }
            path(
                fill = SolidColor(color),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(4f, 15.9999f)
                curveTo(4f, 15.4476f, 4.4477f, 14.9999f, 5f, 14.9999f)
                horizontalLineTo(7f)
                curveTo(7.5523f, 14.9999f, 8f, 15.4476f, 8f, 15.9999f)
                curveTo(8f, 16.5522f, 7.5523f, 16.9999f, 7f, 16.9999f)
                horizontalLineTo(5f)
                curveTo(4.4477f, 16.9999f, 4f, 16.5522f, 4f, 15.9999f)
                close()
            }
        }.build()
    }
}

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = sortDefault(),
                contentDescription = ""
            )
        }
    }
}