package io.github.madmaximuus.persianSymbols.comment.bars

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.CommentBars: ImageVector
    get() {
        if (commentBars != null) {
            return commentBars!!
        }
        commentBars = Builder(
            name = "comment-bars-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7f, 8.25f)
                curveTo(6.586f, 8.25f, 6.25f, 8.586f, 6.25f, 9f)
                curveTo(6.25f, 9.414f, 6.586f, 9.75f, 7f, 9.75f)
                horizontalLineTo(17f)
                curveTo(17.414f, 9.75f, 17.75f, 9.414f, 17.75f, 9f)
                curveTo(17.75f, 8.586f, 17.414f, 8.25f, 17f, 8.25f)
                horizontalLineTo(7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7f, 11.25f)
                curveTo(6.586f, 11.25f, 6.25f, 11.586f, 6.25f, 12f)
                curveTo(6.25f, 12.414f, 6.586f, 12.75f, 7f, 12.75f)
                horizontalLineTo(17f)
                curveTo(17.414f, 12.75f, 17.75f, 12.414f, 17.75f, 12f)
                curveTo(17.75f, 11.586f, 17.414f, 11.25f, 17f, 11.25f)
                horizontalLineTo(7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.25f, 15f)
                curveTo(6.25f, 14.586f, 6.586f, 14.25f, 7f, 14.25f)
                horizontalLineTo(17f)
                curveTo(17.414f, 14.25f, 17.75f, 14.586f, 17.75f, 15f)
                curveTo(17.75f, 15.414f, 17.414f, 15.75f, 17f, 15.75f)
                horizontalLineTo(7f)
                curveTo(6.586f, 15.75f, 6.25f, 15.414f, 6.25f, 15f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.5f, 4f)
                curveTo(4.015f, 4f, 2f, 6.015f, 2f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2f, 17.985f, 4.015f, 20f, 6.5f, 20f)
                horizontalLineTo(20f)
                curveTo(21.105f, 20f, 22f, 19.105f, 22f, 18f)
                verticalLineTo(8.5f)
                curveTo(22f, 6.015f, 19.985f, 4f, 17.5f, 4f)
                horizontalLineTo(6.5f)
                close()
                moveTo(4f, 8.5f)
                curveTo(4f, 7.119f, 5.119f, 6f, 6.5f, 6f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 6f, 20f, 7.119f, 20f, 8.5f)
                verticalLineTo(18f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 18f, 4f, 16.881f, 4f, 15.5f)
                verticalLineTo(8.5f)
                close()
            }
        }.build()
        return commentBars!!
    }

private var commentBars: ImageVector? = null