package io.github.madmaximuus.persianIcons.moreVert

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
fun moreVertDefault(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "more-vert-default",
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
                moveTo(13.9999f, 5.99988f)
                curveTo(13.9999f, 7.1044f, 13.1044f, 7.9999f, 11.9999f, 7.9999f)
                curveTo(10.8953f, 7.9999f, 9.9999f, 7.1044f, 9.9999f, 5.9999f)
                curveTo(9.9999f, 4.8953f, 10.8953f, 3.9999f, 11.9999f, 3.9999f)
                curveTo(13.1044f, 3.9999f, 13.9999f, 4.8953f, 13.9999f, 5.9999f)
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
                moveTo(13.9999f, 11.9999f)
                curveTo(13.9999f, 13.1044f, 13.1044f, 13.9999f, 11.9999f, 13.9999f)
                curveTo(10.8953f, 13.9999f, 9.9999f, 13.1044f, 9.9999f, 11.9999f)
                curveTo(9.9999f, 10.8953f, 10.8953f, 9.9999f, 11.9999f, 9.9999f)
                curveTo(13.1044f, 9.9999f, 13.9999f, 10.8953f, 13.9999f, 11.9999f)
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
                moveTo(11.9999f, 19.9999f)
                curveTo(13.1044f, 19.9999f, 13.9999f, 19.1044f, 13.9999f, 17.9999f)
                curveTo(13.9999f, 16.8953f, 13.1044f, 15.9999f, 11.9999f, 15.9999f)
                curveTo(10.8953f, 15.9999f, 9.9999f, 16.8953f, 9.9999f, 17.9999f)
                curveTo(9.9999f, 19.1044f, 10.8953f, 19.9999f, 11.9999f, 19.9999f)
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
                imageVector = moreVertDefault(),
                contentDescription = ""
            )
        }
    }
}