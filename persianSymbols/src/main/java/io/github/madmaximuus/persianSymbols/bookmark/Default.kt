package io.github.madmaximuus.persianSymbols.bookmark

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Bookmark: ImageVector
    get() {
        if (bookmark != null) {
            return bookmark!!
        }
        bookmark = Builder(
            name = "bookmark-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.5f, 3f)
                horizontalLineTo(8.5f)
                curveTo(6.567f, 3f, 5f, 4.567f, 5f, 6.5f)
                verticalLineTo(21f)
                lineTo(12f, 17f)
                lineTo(19f, 21f)
                verticalLineTo(6.5f)
                curveTo(19f, 4.567f, 17.433f, 3f, 15.5f, 3f)
                close()
            }
        }.build()
        return bookmark!!
    }

private var bookmark: ImageVector? = null