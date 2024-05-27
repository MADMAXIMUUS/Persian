package io.github.madmaximuus.persianSymbols.comment.bars

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
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
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.4f, 4.0f)
                curveTo(3.9699f, 4.0f, 2.0f, 5.97f, 2.0f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(2.0f, 18.0301f, 3.9699f, 20.0f, 6.4f, 20.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 20.0f, 22.0f, 19.5523f, 22.0f, 19.0f)
                verticalLineTo(8.4f)
                curveTo(22.0f, 5.97f, 20.0301f, 4.0f, 17.6f, 4.0f)
                horizontalLineTo(6.4f)
                close()
                moveTo(7.0f, 8.0f)
                curveTo(6.4477f, 8.0f, 6.0f, 8.4477f, 6.0f, 9.0f)
                curveTo(6.0f, 9.5523f, 6.4477f, 10.0f, 7.0f, 10.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 10.0f, 18.0f, 9.5523f, 18.0f, 9.0f)
                curveTo(18.0f, 8.4477f, 17.5523f, 8.0f, 17.0f, 8.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(7.0f, 11.0f)
                curveTo(6.4477f, 11.0f, 6.0f, 11.4477f, 6.0f, 12.0f)
                curveTo(6.0f, 12.5523f, 6.4477f, 13.0f, 7.0f, 13.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 13.0f, 18.0f, 12.5523f, 18.0f, 12.0f)
                curveTo(18.0f, 11.4477f, 17.5523f, 11.0f, 17.0f, 11.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(6.0f, 15.0f)
                curveTo(6.0f, 14.4477f, 6.4477f, 14.0f, 7.0f, 14.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 14.0f, 18.0f, 14.4477f, 18.0f, 15.0f)
                curveTo(18.0f, 15.5523f, 17.5523f, 16.0f, 17.0f, 16.0f)
                horizontalLineTo(7.0f)
                curveTo(6.4477f, 16.0f, 6.0f, 15.5523f, 6.0f, 15.0f)
                close()
            }
        }.build()
        return commentBars!!
    }

private var commentBars: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.CommentBars,
                contentDescription = ""
            )
        }
    }
}