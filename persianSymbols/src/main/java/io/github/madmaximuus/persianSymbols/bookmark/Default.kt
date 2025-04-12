package io.github.madmaximuus.persianSymbols.bookmark

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
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
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 6.5f)
                curveTo(4f, 4.015f, 6.015f, 2f, 8.5f, 2f)
                horizontalLineTo(15.5f)
                curveTo(17.985f, 2f, 20f, 4.015f, 20f, 6.5f)
                verticalLineTo(21f)
                curveTo(20f, 21.357f, 19.81f, 21.686f, 19.502f, 21.865f)
                curveTo(19.194f, 22.044f, 18.813f, 22.045f, 18.504f, 21.868f)
                lineTo(12f, 18.152f)
                lineTo(5.496f, 21.868f)
                curveTo(5.187f, 22.045f, 4.806f, 22.044f, 4.498f, 21.865f)
                curveTo(4.19f, 21.686f, 4f, 21.357f, 4f, 21f)
                verticalLineTo(6.5f)
                close()
                moveTo(8.5f, 4f)
                curveTo(7.119f, 4f, 6f, 5.119f, 6f, 6.5f)
                verticalLineTo(19.277f)
                lineTo(11.504f, 16.132f)
                curveTo(11.811f, 15.956f, 12.189f, 15.956f, 12.496f, 16.132f)
                lineTo(18f, 19.277f)
                verticalLineTo(6.5f)
                curveTo(18f, 5.119f, 16.881f, 4f, 15.5f, 4f)
                horizontalLineTo(8.5f)
                close()
            }
        }.build()
        return bookmark!!
    }

private var bookmark: ImageVector? = null