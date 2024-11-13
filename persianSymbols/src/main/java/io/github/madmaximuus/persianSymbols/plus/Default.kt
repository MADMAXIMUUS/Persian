package io.github.madmaximuus.persianSymbols.plus

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Plus: ImageVector
    get() {
        if (plus != null) {
            return plus!!
        }
        plus = ImageVector.Builder(
            name = "plus-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 5f)
                curveTo(13f, 4.448f, 12.552f, 4f, 12f, 4f)
                curveTo(11.448f, 4f, 11f, 4.448f, 11f, 5f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                curveTo(4.448f, 11f, 4f, 11.448f, 4f, 12f)
                curveTo(4f, 12.552f, 4.448f, 13f, 5f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                curveTo(11f, 19.552f, 11.448f, 20f, 12f, 20f)
                curveTo(12.552f, 20f, 13f, 19.552f, 13f, 19f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                curveTo(19.552f, 13f, 20f, 12.552f, 20f, 12f)
                curveTo(20f, 11.448f, 19.552f, 11f, 19f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                close()
            }
        }.build()
        return plus!!
    }

private var plus: ImageVector? = null

