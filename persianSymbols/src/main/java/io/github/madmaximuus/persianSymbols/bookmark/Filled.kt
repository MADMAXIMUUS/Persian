package io.github.madmaximuus.persianSymbols.bookmark

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

val PersianSymbols.Filled.Bookmark: ImageVector
    get() {
        if (bookmark != null) {
            return bookmark!!
        }
        bookmark = Builder(
            name = "bookmark-filled",
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
                moveTo(15.6f, 2.0f)
                horizontalLineTo(8.4f)
                curveTo(5.97f, 2.0f, 4.0f, 3.9699f, 4.0f, 6.4f)
                verticalLineTo(20.3005f)
                curveTo(4.0f, 21.063f, 4.8191f, 21.5449f, 5.4856f, 21.1746f)
                lineTo(11.5144f, 17.8254f)
                curveTo(11.8164f, 17.6576f, 12.1836f, 17.6576f, 12.4856f, 17.8254f)
                lineTo(18.5144f, 21.1746f)
                curveTo(19.1809f, 21.5449f, 20.0f, 21.063f, 20.0f, 20.3005f)
                verticalLineTo(6.4f)
                curveTo(20.0f, 3.9699f, 18.0301f, 2.0f, 15.6f, 2.0f)
                close()
            }
        }.build()
        return bookmark!!
    }

private var bookmark: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.Bookmark,
                contentDescription = ""
            )
        }
    }
}