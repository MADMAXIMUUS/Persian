package io.github.madmaximuus.persianIcons.filter

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
fun filterDefault(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "filter-default",
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
                moveTo(4f, 8f)
                curveTo(4f, 7.4477f, 4.4477f, 7f, 5f, 7f)
                horizontalLineTo(19f)
                curveTo(19.5523f, 7f, 20f, 7.4477f, 20f, 8f)
                curveTo(20f, 8.5523f, 19.5523f, 9f, 19f, 9f)
                horizontalLineTo(5f)
                curveTo(4.4477f, 9f, 4f, 8.5523f, 4f, 8f)
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
                moveTo(6.99988f, 11.9999f)
                curveTo(6.9999f, 11.4476f, 7.4476f, 10.9999f, 7.9999f, 10.9999f)
                horizontalLineTo(15.9999f)
                curveTo(16.5522f, 10.9999f, 16.9999f, 11.4476f, 16.9999f, 11.9999f)
                curveTo(16.9999f, 12.5522f, 16.5522f, 12.9999f, 15.9999f, 12.9999f)
                horizontalLineTo(7.99988f)
                curveTo(7.4476f, 12.9999f, 6.9999f, 12.5522f, 6.9999f, 11.9999f)
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
                moveTo(11f, 14.9998f)
                curveTo(10.4477f, 14.9998f, 10f, 15.4475f, 10f, 15.9998f)
                curveTo(10f, 16.552f, 10.4477f, 16.9998f, 11f, 16.9998f)
                horizontalLineTo(13f)
                curveTo(13.5523f, 16.9998f, 14f, 16.552f, 14f, 15.9998f)
                curveTo(14f, 15.4475f, 13.5523f, 14.9998f, 13f, 14.9998f)
                horizontalLineTo(11f)
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
                imageVector = filterDefault(),
                contentDescription = ""
            )
        }
    }
}