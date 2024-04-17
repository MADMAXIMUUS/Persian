package io.github.madmaximuus.persianIcons.fullscreenExit

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
fun fullscreenExitDefault(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "fullscreen-exit-default",
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
                moveTo(9f, 4f)
                curveTo(9f, 3.4477f, 8.5523f, 3f, 8f, 3f)
                curveTo(7.4477f, 3f, 7f, 3.4477f, 7f, 4f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                curveTo(3.4477f, 7f, 3f, 7.4477f, 3f, 8f)
                curveTo(3f, 8.5523f, 3.4477f, 9f, 4f, 9f)
                horizontalLineTo(7f)
                curveTo(8.1046f, 9f, 9f, 8.1046f, 9f, 7f)
                verticalLineTo(4f)
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
                moveTo(19.999f, 9f)
                curveTo(20.5513f, 9f, 20.999f, 8.5523f, 20.999f, 8f)
                curveTo(20.999f, 7.4477f, 20.5513f, 7f, 19.999f, 7f)
                horizontalLineTo(16.999f)
                verticalLineTo(4f)
                curveTo(16.999f, 3.4477f, 16.5513f, 3f, 15.999f, 3f)
                curveTo(15.4467f, 3f, 14.999f, 3.4477f, 14.999f, 4f)
                verticalLineTo(7f)
                curveTo(14.999f, 8.1046f, 15.8945f, 9f, 16.999f, 9f)
                horizontalLineTo(19.999f)
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
                moveTo(15.9999f, 20.9999f)
                curveTo(15.4476f, 20.9999f, 14.9999f, 20.5522f, 14.9999f, 19.9999f)
                verticalLineTo(16.9999f)
                curveTo(14.9999f, 15.8953f, 15.8953f, 14.9999f, 16.9999f, 14.9999f)
                horizontalLineTo(19.9999f)
                curveTo(20.5522f, 14.9999f, 20.9999f, 15.4476f, 20.9999f, 15.9999f)
                curveTo(20.9999f, 16.5522f, 20.5522f, 16.9999f, 19.9999f, 16.9999f)
                horizontalLineTo(16.9999f)
                verticalLineTo(19.9999f)
                curveTo(16.9999f, 20.5522f, 16.5522f, 20.9999f, 15.9999f, 20.9999f)
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
                moveTo(3.99902f, 14.9999f)
                curveTo(3.4467f, 14.9999f, 2.999f, 15.4476f, 2.999f, 15.9999f)
                curveTo(2.999f, 16.5522f, 3.4467f, 16.9999f, 3.999f, 16.9999f)
                horizontalLineTo(6.99902f)
                verticalLineTo(19.9999f)
                curveTo(6.999f, 20.5522f, 7.4467f, 20.9999f, 7.999f, 20.9999f)
                curveTo(8.5513f, 20.9999f, 8.999f, 20.5522f, 8.999f, 19.9999f)
                verticalLineTo(16.9999f)
                curveTo(8.999f, 15.8953f, 8.1036f, 14.9999f, 6.999f, 14.9999f)
                horizontalLineTo(3.99902f)
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
                imageVector = fullscreenExitDefault(),
                contentDescription = ""
            )
        }
    }
}