package io.github.madmaximuus.persianIcons.dragIndicator

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
fun dragIndicatorDefault(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "drag-indicator-default",
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
                moveTo(11f, 5.99982f)
                curveTo(11f, 7.1044f, 10.1046f, 7.9998f, 9f, 7.9998f)
                curveTo(7.8954f, 7.9998f, 7f, 7.1044f, 7f, 5.9998f)
                curveTo(7f, 4.8952f, 7.8954f, 3.9998f, 9f, 3.9998f)
                curveTo(10.1046f, 3.9998f, 11f, 4.8952f, 11f, 5.9998f)
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
                moveTo(11f, 11.9999f)
                curveTo(11f, 13.1044f, 10.1046f, 13.9999f, 9f, 13.9999f)
                curveTo(7.8954f, 13.9999f, 7f, 13.1044f, 7f, 11.9999f)
                curveTo(7f, 10.8953f, 7.8954f, 9.9999f, 9f, 9.9999f)
                curveTo(10.1046f, 9.9999f, 11f, 10.8953f, 11f, 11.9999f)
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
                moveTo(9f, 19.9999f)
                curveTo(10.1046f, 19.9999f, 11f, 19.1044f, 11f, 17.9999f)
                curveTo(11f, 16.8953f, 10.1046f, 15.9999f, 9f, 15.9999f)
                curveTo(7.8954f, 15.9999f, 7f, 16.8953f, 7f, 17.9999f)
                curveTo(7f, 19.1044f, 7.8954f, 19.9999f, 9f, 19.9999f)
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
                moveTo(15f, 19.9999f)
                curveTo(16.1046f, 19.9999f, 17f, 19.1044f, 17f, 17.9999f)
                curveTo(17f, 16.8953f, 16.1046f, 15.9999f, 15f, 15.9999f)
                curveTo(13.8954f, 15.9999f, 13f, 16.8953f, 13f, 17.9999f)
                curveTo(13f, 19.1044f, 13.8954f, 19.9999f, 15f, 19.9999f)
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
                moveTo(15f, 13.9999f)
                curveTo(16.1046f, 13.9999f, 17f, 13.1044f, 17f, 11.9999f)
                curveTo(17f, 10.8953f, 16.1046f, 9.9999f, 15f, 9.9999f)
                curveTo(13.8954f, 9.9999f, 13f, 10.8953f, 13f, 11.9999f)
                curveTo(13f, 13.1044f, 13.8954f, 13.9999f, 15f, 13.9999f)
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
                moveTo(15f, 7.99982f)
                curveTo(16.1046f, 7.9998f, 17f, 7.1044f, 17f, 5.9998f)
                curveTo(17f, 4.8952f, 16.1046f, 3.9998f, 15f, 3.9998f)
                curveTo(13.8954f, 3.9998f, 13f, 4.8952f, 13f, 5.9998f)
                curveTo(13f, 7.1044f, 13.8954f, 7.9998f, 15f, 7.9998f)
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
                imageVector = dragIndicatorDefault(),
                contentDescription = ""
            )
        }
    }
}