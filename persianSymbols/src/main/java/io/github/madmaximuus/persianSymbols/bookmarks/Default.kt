package io.github.madmaximuus.persianSymbols.bookmarks

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

val PersianSymbols.Default.Bookmarks: ImageVector
    get() {
        if (bookmarks != null) {
            return bookmarks!!
        }
        bookmarks = Builder(
            name = "bookmarks-default",
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
                moveTo(8.0f, 2.0f)
                curveTo(7.4477f, 2.0f, 7.0f, 2.4477f, 7.0f, 3.0f)
                curveTo(7.0f, 3.5523f, 7.4477f, 4.0f, 8.0f, 4.0f)
                horizontalLineTo(15.5f)
                curveTo(16.8807f, 4.0f, 18.0f, 5.1193f, 18.0f, 6.5f)
                verticalLineTo(20.0f)
                curveTo(18.0f, 20.5523f, 18.4477f, 21.0f, 19.0f, 21.0f)
                curveTo(19.5523f, 21.0f, 20.0f, 20.5523f, 20.0f, 20.0f)
                verticalLineTo(6.5f)
                curveTo(20.0f, 4.0147f, 17.9853f, 2.0f, 15.5f, 2.0f)
                horizontalLineTo(8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.8f, 5.0f)
                curveTo(5.7013f, 5.0f, 4.0f, 6.7013f, 4.0f, 8.8f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 20.3557f, 4.1889f, 20.6846f, 4.4962f, 20.8638f)
                curveTo(4.8034f, 21.043f, 5.1828f, 21.0455f, 5.4924f, 20.8704f)
                lineTo(10.5f, 18.0378f)
                lineTo(15.5077f, 20.8704f)
                curveTo(15.8172f, 21.0455f, 16.1966f, 21.043f, 16.5038f, 20.8638f)
                curveTo(16.8111f, 20.6846f, 17.0f, 20.3557f, 17.0f, 20.0f)
                verticalLineTo(8.8f)
                curveTo(17.0f, 6.7013f, 15.2987f, 5.0f, 13.2f, 5.0f)
                horizontalLineTo(7.8f)
                close()
                moveTo(6.0f, 8.8f)
                curveTo(6.0f, 7.8059f, 6.8059f, 7.0f, 7.8f, 7.0f)
                horizontalLineTo(13.2f)
                curveTo(14.1941f, 7.0f, 15.0f, 7.8059f, 15.0f, 8.8f)
                verticalLineTo(18.2854f)
                lineTo(10.9923f, 16.0185f)
                curveTo(10.6869f, 15.8457f, 10.3131f, 15.8457f, 10.0077f, 16.0185f)
                lineTo(6.0f, 18.2854f)
                verticalLineTo(8.8f)
                close()
            }
        }.build()
        return bookmarks!!
    }

private var bookmarks: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Bookmarks,
                contentDescription = ""
            )
        }
    }
}