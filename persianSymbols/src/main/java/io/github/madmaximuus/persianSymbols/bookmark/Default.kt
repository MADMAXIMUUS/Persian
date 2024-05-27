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
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Bookmark: ImageVector
    get() {
        if (bookmark != null) {
            return bookmark!!
        }
        bookmark = Builder(
            name = "bookmark-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Round,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.5f, 3.0f)
                horizontalLineTo(8.5f)
                curveTo(6.567f, 3.0f, 5.0f, 4.567f, 5.0f, 6.5f)
                verticalLineTo(21.0f)
                lineTo(12.0f, 17.0f)
                lineTo(19.0f, 21.0f)
                verticalLineTo(6.5f)
                curveTo(19.0f, 4.567f, 17.433f, 3.0f, 15.5f, 3.0f)
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
                imageVector = PersianSymbols.Default.Bookmark,
                contentDescription = ""
            )
        }
    }
}