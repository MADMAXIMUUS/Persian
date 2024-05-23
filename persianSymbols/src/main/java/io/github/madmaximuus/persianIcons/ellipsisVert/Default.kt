package io.github.madmaximuus.persianIcons.ellipsisVert

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
import io.github.madmaximuus.persianIcons.foundation.PersianSymbols

public val PersianSymbols.Default.EllipsisVert: ImageVector
    get() {
        if (ellipsisVert != null) {
            return ellipsisVert!!
        }
        ellipsisVert = ImageVector.Builder(
            name = "ellipsis-vert-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
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
                fill = SolidColor(Color(0xFF000000)),
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
                fill = SolidColor(Color(0xFF000000)),
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
        return ellipsisVert!!
    }

private var ellipsisVert: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.EllipsisVert,
                contentDescription = ""
            )
        }
    }
}