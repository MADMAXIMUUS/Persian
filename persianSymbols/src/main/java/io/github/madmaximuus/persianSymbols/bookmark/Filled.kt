package io.github.madmaximuus.persianSymbols.bookmark

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Bookmark: ImageVector
    get() {
        if (bookmark != null) {
            return bookmark!!
        }
        bookmark = Builder(
            name = "bookmark-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.6f, 2f)
                horizontalLineTo(8.4f)
                curveTo(5.97f, 2f, 4f, 3.97f, 4f, 6.4f)
                verticalLineTo(20.301f)
                curveTo(4f, 21.063f, 4.819f, 21.545f, 5.486f, 21.175f)
                lineTo(11.514f, 17.825f)
                curveTo(11.816f, 17.658f, 12.184f, 17.658f, 12.486f, 17.825f)
                lineTo(18.514f, 21.175f)
                curveTo(19.181f, 21.545f, 20f, 21.063f, 20f, 20.301f)
                verticalLineTo(6.4f)
                curveTo(20f, 3.97f, 18.03f, 2f, 15.6f, 2f)
                close()
            }
        }.build()
        return bookmark!!
    }

private var bookmark: ImageVector? = null