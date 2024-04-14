package io.github.madmaximuus.persianIcons.addCircle

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
fun addCircleDefault(): ImageVector {
    val color = LocalContentColor.current
    return remember {
        ImageVector.Builder(
            name = "add-circle-default",
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
                moveTo(12f, 7f)
                curveTo(12.5523f, 7f, 13f, 7.4477f, 13f, 8f)
                verticalLineTo(10.9999f)
                horizontalLineTo(16f)
                curveTo(16.5523f, 10.9999f, 17f, 11.4476f, 17f, 11.9999f)
                curveTo(17f, 12.5522f, 16.5523f, 12.9999f, 16f, 12.9999f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                curveTo(13f, 16.5523f, 12.5523f, 17f, 12f, 17f)
                curveTo(11.4477f, 17f, 11f, 16.5523f, 11f, 16f)
                verticalLineTo(12.9999f)
                horizontalLineTo(8f)
                curveTo(7.4477f, 12.9999f, 7f, 12.5522f, 7f, 11.9999f)
                curveTo(7f, 11.4476f, 7.4477f, 10.9999f, 8f, 10.9999f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                curveTo(11f, 7.4477f, 11.4477f, 7f, 12f, 7f)
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
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.9999f, 1.99988f)
                curveTo(6.477f, 1.9999f, 1.9999f, 6.477f, 1.9999f, 11.9999f)
                curveTo(1.9999f, 17.5227f, 6.477f, 21.9999f, 11.9999f, 21.9999f)
                curveTo(17.5227f, 21.9999f, 21.9999f, 17.5227f, 21.9999f, 11.9999f)
                curveTo(21.9999f, 6.477f, 17.5227f, 1.9999f, 11.9999f, 1.9999f)
                close()
                moveTo(3.99988f, 11.9999f)
                curveTo(3.9999f, 7.5816f, 7.5816f, 3.9999f, 11.9999f, 3.9999f)
                curveTo(16.4182f, 3.9999f, 19.9999f, 7.5816f, 19.9999f, 11.9999f)
                curveTo(19.9999f, 16.4182f, 16.4182f, 19.9999f, 11.9999f, 19.9999f)
                curveTo(7.5816f, 19.9999f, 3.9999f, 16.4182f, 3.9999f, 11.9999f)
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
                imageVector = addCircleDefault(),
                contentDescription = ""
            )
        }
    }
}