package io.github.madmaximuus.persianSymbols.link

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Link: ImageVector
    get() {
        if (link != null) {
            return link!!
        }
        link = Builder(
            name = "link-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 12f)
                curveTo(4f, 9.791f, 5.791f, 8f, 8f, 8f)
                horizontalLineTo(10f)
                curveTo(10.552f, 8f, 11f, 7.552f, 11f, 7f)
                curveTo(11f, 6.448f, 10.552f, 6f, 10f, 6f)
                horizontalLineTo(8f)
                curveTo(4.686f, 6f, 2f, 8.686f, 2f, 12f)
                curveTo(2f, 15.314f, 4.686f, 18f, 8f, 18f)
                horizontalLineTo(10f)
                curveTo(10.552f, 18f, 11f, 17.552f, 11f, 17f)
                curveTo(11f, 16.448f, 10.552f, 16f, 10f, 16f)
                horizontalLineTo(8f)
                curveTo(5.791f, 16f, 4f, 14.209f, 4f, 12f)
                close()
            }
        }.build()
        return link!!
    }

private var link: ImageVector? = null