package io.github.madmaximuus.persianSymbols.comment.plus

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.CommentPlus: ImageVector
    get() {
        if (commentPlus != null) {
            return commentPlus!!
        }
        commentPlus = Builder(
            name = "comment-plus-field",
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
                horizontalLineTo(12.341f)
                curveTo(12.12f, 19.374f, 12f, 18.701f, 12f, 18f)
                curveTo(12f, 17.204f, 12.155f, 16.445f, 12.436f, 15.75f)
                horizontalLineTo(7f)
                curveTo(6.586f, 15.75f, 6.25f, 15.414f, 6.25f, 15f)
                curveTo(6.25f, 14.586f, 6.586f, 14.25f, 7f, 14.25f)
                horizontalLineTo(13.316f)
                curveTo(13.804f, 13.642f, 14.407f, 13.131f, 15.093f, 12.75f)
                horizontalLineTo(7f)
                curveTo(6.586f, 12.75f, 6.25f, 12.414f, 6.25f, 12f)
                curveTo(6.25f, 11.586f, 6.586f, 11.25f, 7f, 11.25f)
                horizontalLineTo(17f)
                curveTo(17.414f, 11.25f, 17.75f, 11.586f, 17.75f, 12f)
                lineTo(17.75f, 12.005f)
                curveTo(17.833f, 12.002f, 17.916f, 12f, 18f, 12f)
                curveTo(19.537f, 12f, 20.938f, 12.578f, 22f, 13.528f)
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
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 15.5f)
                curveTo(18.414f, 15.5f, 18.75f, 15.836f, 18.75f, 16.25f)
                verticalLineTo(17.25f)
                horizontalLineTo(19.75f)
                curveTo(20.164f, 17.25f, 20.5f, 17.586f, 20.5f, 18f)
                curveTo(20.5f, 18.414f, 20.164f, 18.75f, 19.75f, 18.75f)
                horizontalLineTo(18.75f)
                verticalLineTo(19.75f)
                curveTo(18.75f, 20.164f, 18.414f, 20.5f, 18f, 20.5f)
                curveTo(17.586f, 20.5f, 17.25f, 20.164f, 17.25f, 19.75f)
                verticalLineTo(18.75f)
                horizontalLineTo(16.25f)
                curveTo(15.836f, 18.75f, 15.5f, 18.414f, 15.5f, 18f)
                curveTo(15.5f, 17.586f, 15.836f, 17.25f, 16.25f, 17.25f)
                horizontalLineTo(17.25f)
                verticalLineTo(16.25f)
                curveTo(17.25f, 15.836f, 17.586f, 15.5f, 18f, 15.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.25f, 18f)
                curveTo(13.25f, 15.377f, 15.377f, 13.25f, 18f, 13.25f)
                curveTo(20.623f, 13.25f, 22.75f, 15.377f, 22.75f, 18f)
                curveTo(22.75f, 20.623f, 20.623f, 22.75f, 18f, 22.75f)
                curveTo(15.377f, 22.75f, 13.25f, 20.623f, 13.25f, 18f)
                close()
                moveTo(18f, 14.75f)
                curveTo(16.205f, 14.75f, 14.75f, 16.205f, 14.75f, 18f)
                curveTo(14.75f, 19.795f, 16.205f, 21.25f, 18f, 21.25f)
                curveTo(19.795f, 21.25f, 21.25f, 19.795f, 21.25f, 18f)
                curveTo(21.25f, 16.205f, 19.795f, 14.75f, 18f, 14.75f)
                close()
            }
        }.build()
        return commentPlus!!
    }

private var commentPlus: ImageVector? = null