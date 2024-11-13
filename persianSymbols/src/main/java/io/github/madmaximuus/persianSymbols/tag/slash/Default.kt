package io.github.madmaximuus.persianSymbols.tag.slash

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.TagSlash: ImageVector
    get() {
        if (tagSlash != null) {
            return tagSlash!!
        }
        tagSlash = Builder(
            name = "tag-slash-default",
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
                moveTo(2f, 8.5f)
                curveTo(2f, 7.385f, 2.406f, 6.364f, 3.078f, 5.578f)
                lineTo(4.5f, 7f)
                curveTo(4.186f, 7.418f, 4f, 7.937f, 4f, 8.5f)
                lineTo(4f, 15.5f)
                curveTo(4f, 16.881f, 5.119f, 18f, 6.5f, 18f)
                horizontalLineTo(14.547f)
                lineTo(14.992f, 17.492f)
                lineTo(16.41f, 18.91f)
                lineTo(16.051f, 19.319f)
                curveTo(15.671f, 19.752f, 15.123f, 20f, 14.547f, 20f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 20f, 2f, 17.985f, 2f, 15.5f)
                verticalLineTo(8.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.5f, 4f)
                lineTo(8.5f, 6f)
                lineTo(14.533f, 6f)
                lineTo(19.683f, 12.143f)
                lineTo(17.328f, 14.828f)
                lineTo(18.746f, 16.246f)
                lineTo(21.187f, 13.462f)
                curveTo(21.837f, 12.72f, 21.85f, 11.615f, 21.216f, 10.859f)
                lineTo(16.066f, 4.715f)
                curveTo(15.686f, 4.262f, 15.125f, 4f, 14.533f, 4f)
                horizontalLineTo(6.5f)
                close()
            }
        }.build()
        return tagSlash!!
    }

private var tagSlash: ImageVector? = null