package io.github.madmaximuus.persianSymbols.paperPlane

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.PaperPlane: ImageVector
    get() {
        if (paperPlane != null) {
            return paperPlane!!
        }
        paperPlane = Builder(
            name = "paper-plane-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.116f, 3.952f)
                lineTo(20.973f, 11.088f)
                curveTo(21.76f, 11.442f, 21.76f, 12.558f, 20.973f, 12.912f)
                lineTo(5.116f, 20.048f)
                curveTo(4.123f, 20.495f, 3f, 19.769f, 3f, 18.68f)
                verticalLineTo(14.012f)
                curveTo(3f, 13.506f, 3.379f, 13.08f, 3.881f, 13.02f)
                lineTo(8.258f, 12.496f)
                curveTo(8.846f, 12.426f, 8.846f, 11.574f, 8.258f, 11.503f)
                lineTo(3.881f, 10.98f)
                curveTo(3.379f, 10.92f, 3f, 10.494f, 3f, 9.987f)
                verticalLineTo(5.32f)
                curveTo(3f, 4.231f, 4.123f, 3.505f, 5.116f, 3.952f)
                close()
            }
        }.build()
        return paperPlane!!
    }

private var paperPlane: ImageVector? = null