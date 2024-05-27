package io.github.madmaximuus.persianSymbols.ellepsis.horiz

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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

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
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.0f, 12.0f)
                curveTo(8.0f, 13.1046f, 7.1046f, 14.0f, 6.0f, 14.0f)
                curveTo(4.8954f, 14.0f, 4.0f, 13.1046f, 4.0f, 12.0f)
                curveTo(4.0f, 10.8954f, 4.8954f, 10.0f, 6.0f, 10.0f)
                curveTo(7.1046f, 10.0f, 8.0f, 10.8954f, 8.0f, 12.0f)
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
                moveTo(14.0f, 12.0f)
                curveTo(14.0f, 13.1046f, 13.1046f, 14.0f, 12.0f, 14.0f)
                curveTo(10.8954f, 14.0f, 10.0f, 13.1046f, 10.0f, 12.0f)
                curveTo(10.0f, 10.8954f, 10.8954f, 10.0f, 12.0f, 10.0f)
                curveTo(13.1046f, 10.0f, 14.0f, 10.8954f, 14.0f, 12.0f)
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
                moveTo(17.9999f, 14.0f)
                curveTo(19.1044f, 14.0f, 19.9999f, 13.1046f, 19.9999f, 12.0f)
                curveTo(19.9999f, 10.8954f, 19.1044f, 10.0f, 17.9999f, 10.0f)
                curveTo(16.8953f, 10.0f, 15.9999f, 10.8954f, 15.9999f, 12.0f)
                curveTo(15.9999f, 13.1046f, 16.8953f, 14.0f, 17.9999f, 14.0f)
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
