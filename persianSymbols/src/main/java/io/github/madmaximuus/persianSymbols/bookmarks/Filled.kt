package io.github.madmaximuus.persianSymbols.bookmarks

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Bookmarks: ImageVector
    get() {
        if (bookmarks != null) {
            return bookmarks!!
        }
        bookmarks = Builder(
            name = "bookmarks-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
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
                moveTo(7.52f, 5f)
                horizontalLineTo(13.48f)
                curveTo(15.424f, 5f, 17f, 6.576f, 17f, 8.52f)
                verticalLineTo(19.65f)
                curveTo(17f, 20.258f, 16.349f, 20.644f, 15.816f, 20.352f)
                lineTo(10.884f, 17.654f)
                curveTo(10.645f, 17.524f, 10.355f, 17.524f, 10.116f, 17.654f)
                lineTo(5.184f, 20.352f)
                curveTo(4.651f, 20.644f, 4f, 20.258f, 4f, 19.65f)
                verticalLineTo(8.52f)
                curveTo(4f, 6.576f, 5.576f, 5f, 7.52f, 5f)
                close()
            }
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
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.52f, 5f)
                horizontalLineTo(13.48f)
                curveTo(15.424f, 5f, 17f, 6.576f, 17f, 8.52f)
                verticalLineTo(19.65f)
                curveTo(17f, 20.258f, 16.349f, 20.644f, 15.816f, 20.352f)
                lineTo(10.884f, 17.654f)
                curveTo(10.645f, 17.524f, 10.355f, 17.524f, 10.116f, 17.654f)
                lineTo(5.184f, 20.352f)
                curveTo(4.651f, 20.644f, 4f, 20.258f, 4f, 19.65f)
                verticalLineTo(8.52f)
                curveTo(4f, 6.576f, 5.576f, 5f, 7.52f, 5f)
                close()
            }
        }.build()
        return bookmarks!!
    }

private var bookmarks: ImageVector? = null