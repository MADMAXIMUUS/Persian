package io.github.madmaximuus.persianIcons.elepsisHoriz

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

val PersianSymbols.Default.EllipsisHoriz: ImageVector
    get() {
        if (ellipsisHoriz != null) {
            return ellipsisHoriz!!
        }
        ellipsisHoriz = ImageVector.Builder(
            name = "ellipsis-horiz-default",
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
                moveTo(8f, 12f)
                curveTo(8f, 13.1046f, 7.1046f, 14f, 6f, 14f)
                curveTo(4.8954f, 14f, 4f, 13.1046f, 4f, 12f)
                curveTo(4f, 10.8954f, 4.8954f, 10f, 6f, 10f)
                curveTo(7.1046f, 10f, 8f, 10.8954f, 8f, 12f)
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
                moveTo(14f, 12f)
                curveTo(14f, 13.1046f, 13.1046f, 14f, 12f, 14f)
                curveTo(10.8954f, 14f, 10f, 13.1046f, 10f, 12f)
                curveTo(10f, 10.8954f, 10.8954f, 10f, 12f, 10f)
                curveTo(13.1046f, 10f, 14f, 10.8954f, 14f, 12f)
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
                moveTo(17.9999f, 14f)
                curveTo(19.1044f, 14f, 19.9999f, 13.1046f, 19.9999f, 12f)
                curveTo(19.9999f, 10.8954f, 19.1044f, 10f, 17.9999f, 10f)
                curveTo(16.8953f, 10f, 15.9999f, 10.8954f, 15.9999f, 12f)
                curveTo(15.9999f, 13.1046f, 16.8953f, 14f, 17.9999f, 14f)
                close()
            }
        }.build()
        return ellipsisHoriz!!
    }

private var ellipsisHoriz: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.EllipsisHoriz,
                contentDescription = ""
            )
        }
    }
}
