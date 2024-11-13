package io.github.madmaximuus.persianSymbols.comment.bars

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.CommentBars: ImageVector
    get() {
        if (commentBars != null) {
            return commentBars!!
        }
        commentBars = Builder(
            name = "comment-bars-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.4f, 4f)
                curveTo(3.97f, 4f, 2f, 5.97f, 2f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(2f, 18.03f, 3.97f, 20f, 6.4f, 20f)
                horizontalLineTo(21f)
                curveTo(21.552f, 20f, 22f, 19.552f, 22f, 19f)
                verticalLineTo(8.4f)
                curveTo(22f, 5.97f, 20.03f, 4f, 17.6f, 4f)
                horizontalLineTo(6.4f)
                close()
                moveTo(7f, 8.25f)
                curveTo(6.586f, 8.25f, 6.25f, 8.586f, 6.25f, 9f)
                curveTo(6.25f, 9.414f, 6.586f, 9.75f, 7f, 9.75f)
                horizontalLineTo(17f)
                curveTo(17.414f, 9.75f, 17.75f, 9.414f, 17.75f, 9f)
                curveTo(17.75f, 8.586f, 17.414f, 8.25f, 17f, 8.25f)
                horizontalLineTo(7f)
                close()
                moveTo(6.25f, 12f)
                curveTo(6.25f, 11.586f, 6.586f, 11.25f, 7f, 11.25f)
                horizontalLineTo(17f)
                curveTo(17.414f, 11.25f, 17.75f, 11.586f, 17.75f, 12f)
                curveTo(17.75f, 12.414f, 17.414f, 12.75f, 17f, 12.75f)
                horizontalLineTo(7f)
                curveTo(6.586f, 12.75f, 6.25f, 12.414f, 6.25f, 12f)
                close()
                moveTo(7f, 14.25f)
                curveTo(6.586f, 14.25f, 6.25f, 14.586f, 6.25f, 15f)
                curveTo(6.25f, 15.414f, 6.586f, 15.75f, 7f, 15.75f)
                horizontalLineTo(17f)
                curveTo(17.414f, 15.75f, 17.75f, 15.414f, 17.75f, 15f)
                curveTo(17.75f, 14.586f, 17.414f, 14.25f, 17f, 14.25f)
                horizontalLineTo(7f)
                close()
            }
        }.build()
        return commentBars!!
    }

private var commentBars: ImageVector? = null