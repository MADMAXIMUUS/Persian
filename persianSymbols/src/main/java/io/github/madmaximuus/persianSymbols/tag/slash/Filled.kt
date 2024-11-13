package io.github.madmaximuus.persianSymbols.tag.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.TagSlash: ImageVector
    get() {
        if (tagSlash != null) {
            return tagSlash!!
        }
        tagSlash = Builder(
            name = "tag-slash-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
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
                moveTo(2f, 8.4f)
                curveTo(2f, 7.312f, 2.395f, 6.317f, 3.049f, 5.549f)
                lineTo(16.331f, 18.831f)
                lineTo(15.934f, 19.297f)
                curveTo(15.554f, 19.743f, 14.998f, 20f, 14.412f, 20f)
                lineTo(6.4f, 20f)
                curveTo(3.97f, 20f, 2f, 18.03f, 2f, 15.6f)
                verticalLineTo(8.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.5f, 4f)
                lineTo(18.632f, 16.132f)
                lineTo(21.189f, 13.132f)
                curveTo(21.659f, 12.581f, 21.668f, 11.773f, 21.21f, 11.212f)
                lineTo(15.935f, 4.737f)
                curveTo(15.556f, 4.271f, 14.986f, 4f, 14.385f, 4f)
                horizontalLineTo(6.5f)
                close()
            }
        }.build()
        return tagSlash!!
    }

private var tagSlash: ImageVector? = null