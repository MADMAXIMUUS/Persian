package io.github.madmaximuus.persianSymbols.bookmark.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.BookmarkSlash: ImageVector
    get() {
        if (bookmarkSlash != null) {
            return bookmarkSlash!!
        }
        bookmarkSlash = ImageVector.Builder(
            name = "bookmark-slash-default",
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
                moveTo(4f, 6.5f)
                lineTo(4f, 6.475f)
                lineTo(6f, 8.475f)
                verticalLineTo(19.277f)
                lineTo(11.504f, 16.132f)
                curveTo(11.811f, 15.956f, 12.189f, 15.956f, 12.496f, 16.132f)
                lineTo(15.205f, 17.679f)
                lineTo(19.429f, 21.903f)
                curveTo(19.135f, 22.043f, 18.789f, 22.031f, 18.504f, 21.868f)
                lineTo(12f, 18.152f)
                lineTo(5.496f, 21.868f)
                curveTo(5.187f, 22.045f, 4.806f, 22.044f, 4.498f, 21.865f)
                curveTo(4.19f, 21.686f, 4f, 21.357f, 4f, 21f)
                verticalLineTo(6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 6.5f)
                verticalLineTo(15.525f)
                lineTo(20f, 17.525f)
                verticalLineTo(6.5f)
                curveTo(20f, 4.015f, 17.985f, 2f, 15.5f, 2f)
                horizontalLineTo(8.5f)
                curveTo(7.378f, 2f, 6.352f, 2.41f, 5.564f, 3.089f)
                lineTo(6.986f, 4.511f)
                curveTo(7.406f, 4.19f, 7.931f, 4f, 8.5f, 4f)
                horizontalLineTo(15.5f)
                curveTo(16.881f, 4f, 18f, 5.119f, 18f, 6.5f)
                close()
            }
        }.build()

        return bookmarkSlash!!
    }

private var bookmarkSlash: ImageVector? = null
