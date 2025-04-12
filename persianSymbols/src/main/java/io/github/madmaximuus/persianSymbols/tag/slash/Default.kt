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
                curveTo(2f, 7.378f, 2.411f, 6.352f, 3.089f, 5.564f)
                lineTo(4.511f, 6.986f)
                curveTo(4.19f, 7.406f, 4f, 7.931f, 4f, 8.5f)
                lineTo(4f, 15.5f)
                curveTo(4f, 16.881f, 5.119f, 18f, 6.5f, 18f)
                horizontalLineTo(14.547f)
                lineTo(15.004f, 17.479f)
                lineTo(16.421f, 18.896f)
                lineTo(16.051f, 19.319f)
                curveTo(15.671f, 19.752f, 15.123f, 20f, 14.547f, 20f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 20f, 2f, 17.985f, 2f, 15.5f)
                verticalLineTo(8.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.683f, 12.143f)
                lineTo(17.317f, 14.842f)
                lineTo(18.734f, 16.259f)
                lineTo(21.187f, 13.462f)
                curveTo(21.837f, 12.72f, 21.85f, 11.615f, 21.216f, 10.859f)
                lineTo(16.066f, 4.715f)
                curveTo(15.686f, 4.262f, 15.125f, 4f, 14.533f, 4f)
                horizontalLineTo(6.5f)
                lineTo(6.475f, 4f)
                lineTo(8.475f, 6f)
                lineTo(14.533f, 6f)
                lineTo(19.683f, 12.143f)
                close()
            }
        }.build()
        return tagSlash!!
    }

private var tagSlash: ImageVector? = null