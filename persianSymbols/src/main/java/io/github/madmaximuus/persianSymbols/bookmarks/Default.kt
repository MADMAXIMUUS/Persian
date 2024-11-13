package io.github.madmaximuus.persianSymbols.bookmarks

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Bookmarks: ImageVector
    get() {
        if (bookmarks != null) {
            return bookmarks!!
        }
        bookmarks = Builder(
            name = "bookmarks-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 2f)
                curveTo(7.448f, 2f, 7f, 2.448f, 7f, 3f)
                curveTo(7f, 3.552f, 7.448f, 4f, 8f, 4f)
                horizontalLineTo(15.5f)
                curveTo(16.881f, 4f, 18f, 5.119f, 18f, 6.5f)
                verticalLineTo(20f)
                curveTo(18f, 20.552f, 18.448f, 21f, 19f, 21f)
                curveTo(19.552f, 21f, 20f, 20.552f, 20f, 20f)
                verticalLineTo(6.5f)
                curveTo(20f, 4.015f, 17.985f, 2f, 15.5f, 2f)
                horizontalLineTo(8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.8f, 5f)
                curveTo(5.701f, 5f, 4f, 6.701f, 4f, 8.8f)
                verticalLineTo(20f)
                curveTo(4f, 20.356f, 4.189f, 20.685f, 4.496f, 20.864f)
                curveTo(4.803f, 21.043f, 5.183f, 21.045f, 5.492f, 20.87f)
                lineTo(10.5f, 18.038f)
                lineTo(15.508f, 20.87f)
                curveTo(15.817f, 21.045f, 16.197f, 21.043f, 16.504f, 20.864f)
                curveTo(16.811f, 20.685f, 17f, 20.356f, 17f, 20f)
                verticalLineTo(8.8f)
                curveTo(17f, 6.701f, 15.299f, 5f, 13.2f, 5f)
                horizontalLineTo(7.8f)
                close()
                moveTo(6f, 8.8f)
                curveTo(6f, 7.806f, 6.806f, 7f, 7.8f, 7f)
                horizontalLineTo(13.2f)
                curveTo(14.194f, 7f, 15f, 7.806f, 15f, 8.8f)
                verticalLineTo(18.285f)
                lineTo(10.992f, 16.018f)
                curveTo(10.687f, 15.846f, 10.313f, 15.846f, 10.008f, 16.018f)
                lineTo(6f, 18.285f)
                verticalLineTo(8.8f)
                close()
            }
        }.build()
        return bookmarks!!
    }

private var bookmarks: ImageVector? = null