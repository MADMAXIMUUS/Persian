package io.github.madmaximuus.persianSymbols.bookmark.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.BookmarkSlash: ImageVector
    get() {
        if (bookmarkSlash != null) {
            return bookmarkSlash!!
        }
        bookmarkSlash = ImageVector.Builder(
            name = "bookmark-slash-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.707f, 2.293f)
                curveTo(3.317f, 1.902f, 2.683f, 1.902f, 2.293f, 2.293f)
                curveTo(1.902f, 2.683f, 1.902f, 3.317f, 2.293f, 3.707f)
                lineTo(20.293f, 21.707f)
                curveTo(20.683f, 22.098f, 21.317f, 22.098f, 21.707f, 21.707f)
                curveTo(22.098f, 21.317f, 22.098f, 20.683f, 21.707f, 20.293f)
                lineTo(3.707f, 2.293f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 20.301f)
                verticalLineTo(6.475f)
                lineTo(18.808f, 21.283f)
                curveTo(18.709f, 21.264f, 18.61f, 21.228f, 18.514f, 21.175f)
                lineTo(12.486f, 17.825f)
                curveTo(12.184f, 17.658f, 11.816f, 17.658f, 11.514f, 17.825f)
                lineTo(5.486f, 21.175f)
                curveTo(4.819f, 21.545f, 4f, 21.063f, 4f, 20.301f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 6.4f)
                verticalLineTo(17.525f)
                lineTo(5.535f, 3.06f)
                curveTo(6.305f, 2.399f, 7.306f, 2f, 8.4f, 2f)
                horizontalLineTo(15.6f)
                curveTo(18.03f, 2f, 20f, 3.97f, 20f, 6.4f)
                close()
            }
        }.build()

        return bookmarkSlash!!
    }

private var bookmarkSlash: ImageVector? = null
