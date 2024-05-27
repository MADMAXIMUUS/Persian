package io.github.madmaximuus.persianSymbols.comment.plus

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.comment.bars.CommentBars
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.CommentPlus: ImageVector
    get() {
        if (commentPlus != null) {
            return commentPlus!!
        }
        commentPlus = Builder(
            name = "CommentPlusFilled",
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
                horizontalLineTo(12.3414f)
                curveTo(12.1203f, 19.3744f, 12.0f, 18.7013f, 12.0f, 18.0f)
                curveTo(12.0f, 17.2987f, 12.1203f, 16.6256f, 12.3414f, 16.0f)
                horizontalLineTo(7.0f)
                curveTo(6.4477f, 16.0f, 6.0f, 15.5523f, 6.0f, 15.0f)
                curveTo(6.0f, 14.4477f, 6.4477f, 14.0f, 7.0f, 14.0f)
                horizontalLineTo(13.5278f)
                curveTo(13.868f, 13.6199f, 14.2559f, 13.2834f, 14.6822f, 13.0f)
                horizontalLineTo(7.0f)
                curveTo(6.4477f, 13.0f, 6.0f, 12.5523f, 6.0f, 12.0f)
                curveTo(6.0f, 11.4477f, 6.4477f, 11.0f, 7.0f, 11.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 11.0f, 18.0f, 11.4477f, 18.0f, 12.0f)
                curveTo(19.5367f, 12.0f, 20.9385f, 12.5777f, 22.0f, 13.5278f)
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
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.0f, 15.5f)
                curveTo(18.4142f, 15.5f, 18.75f, 15.8358f, 18.75f, 16.25f)
                verticalLineTo(17.25f)
                horizontalLineTo(19.75f)
                curveTo(20.1642f, 17.25f, 20.5f, 17.5858f, 20.5f, 18.0f)
                curveTo(20.5f, 18.4142f, 20.1642f, 18.75f, 19.75f, 18.75f)
                horizontalLineTo(18.75f)
                verticalLineTo(19.75f)
                curveTo(18.75f, 20.1642f, 18.4142f, 20.5f, 18.0f, 20.5f)
                curveTo(17.5858f, 20.5f, 17.25f, 20.1642f, 17.25f, 19.75f)
                verticalLineTo(18.75f)
                horizontalLineTo(16.25f)
                curveTo(15.8358f, 18.75f, 15.5f, 18.4142f, 15.5f, 18.0f)
                curveTo(15.5f, 17.5858f, 15.8358f, 17.25f, 16.25f, 17.25f)
                horizontalLineTo(17.25f)
                verticalLineTo(16.25f)
                curveTo(17.25f, 15.8358f, 17.5858f, 15.5f, 18.0f, 15.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.25f, 18.0f)
                curveTo(13.25f, 15.3766f, 15.3766f, 13.25f, 18.0f, 13.25f)
                curveTo(20.6234f, 13.25f, 22.75f, 15.3766f, 22.75f, 18.0f)
                curveTo(22.75f, 20.6234f, 20.6234f, 22.75f, 18.0f, 22.75f)
                curveTo(15.3766f, 22.75f, 13.25f, 20.6234f, 13.25f, 18.0f)
                close()
                moveTo(18.0f, 14.75f)
                curveTo(16.2051f, 14.75f, 14.75f, 16.2051f, 14.75f, 18.0f)
                curveTo(14.75f, 19.7949f, 16.2051f, 21.25f, 18.0f, 21.25f)
                curveTo(19.7949f, 21.25f, 21.25f, 19.7949f, 21.25f, 18.0f)
                curveTo(21.25f, 16.2051f, 19.7949f, 14.75f, 18.0f, 14.75f)
                close()
            }
        }.build()
        return commentPlus!!
    }

private var commentPlus: ImageVector? = null

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