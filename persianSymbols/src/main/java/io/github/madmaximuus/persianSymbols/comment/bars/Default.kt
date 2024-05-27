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
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.5f, 4.0f)
                curveTo(4.0147f, 4.0f, 2.0f, 6.0147f, 2.0f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2.0f, 17.9853f, 4.0147f, 20.0f, 6.5f, 20.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1046f, 20.0f, 22.0f, 19.1046f, 22.0f, 18.0f)
                verticalLineTo(8.5f)
                curveTo(22.0f, 6.0147f, 19.9853f, 4.0f, 17.5f, 4.0f)
                horizontalLineTo(6.5f)
                close()
                moveTo(4.0f, 8.5f)
                curveTo(4.0f, 7.1193f, 5.1193f, 6.0f, 6.5f, 6.0f)
                horizontalLineTo(17.5f)
                curveTo(18.8807f, 6.0f, 20.0f, 7.1193f, 20.0f, 8.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.5f)
                curveTo(5.1193f, 18.0f, 4.0f, 16.8807f, 4.0f, 15.5f)
                verticalLineTo(8.5f)
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
                imageVector = PersianSymbols.Default.CommentBars,
                contentDescription = ""
            )
        }
    }
}