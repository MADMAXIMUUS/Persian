package io.github.madmaximuus.persianSymbols.user.box.dashed

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
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.UserBoxDashed: ImageVector
    get() {
        if (userBoxDashed != null) {
            return userBoxDashed!!
        }
        userBoxDashed = Builder(
            name = "user-box-dashed-default",
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
                pathFillType = NonZero
            ) {
                moveTo(3.0f, 7.5f)
                curveTo(3.0f, 5.0147f, 5.0147f, 3.0f, 7.5f, 3.0f)
                horizontalLineTo(9.0f)
                curveTo(9.5523f, 3.0f, 10.0f, 3.4477f, 10.0f, 4.0f)
                curveTo(10.0f, 4.5523f, 9.5523f, 5.0f, 9.0f, 5.0f)
                horizontalLineTo(7.5f)
                curveTo(6.1193f, 5.0f, 5.0f, 6.1193f, 5.0f, 7.5f)
                verticalLineTo(9.0f)
                curveTo(5.0f, 9.5523f, 4.5523f, 10.0f, 4.0f, 10.0f)
                curveTo(3.4477f, 10.0f, 3.0f, 9.5523f, 3.0f, 9.0f)
                verticalLineTo(7.5f)
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
                moveTo(14.0f, 4.0f)
                curveTo(14.0f, 3.4477f, 14.4477f, 3.0f, 15.0f, 3.0f)
                horizontalLineTo(16.5f)
                curveTo(18.9853f, 3.0f, 21.0f, 5.0147f, 21.0f, 7.5f)
                verticalLineTo(9.0f)
                curveTo(21.0f, 9.5523f, 20.5523f, 10.0f, 20.0f, 10.0f)
                curveTo(19.4477f, 10.0f, 19.0f, 9.5523f, 19.0f, 9.0f)
                verticalLineTo(7.5f)
                curveTo(19.0f, 6.1193f, 17.8807f, 5.0f, 16.5f, 5.0f)
                horizontalLineTo(15.0f)
                curveTo(14.4477f, 5.0f, 14.0f, 4.5523f, 14.0f, 4.0f)
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
                moveTo(4.0f, 14.0f)
                curveTo(4.5523f, 14.0f, 5.0f, 14.4477f, 5.0f, 15.0f)
                verticalLineTo(16.5f)
                curveTo(5.0f, 17.8807f, 6.1193f, 19.0f, 7.5f, 19.0f)
                horizontalLineTo(9.0f)
                curveTo(9.5523f, 19.0f, 10.0f, 19.4477f, 10.0f, 20.0f)
                curveTo(10.0f, 20.5523f, 9.5523f, 21.0f, 9.0f, 21.0f)
                horizontalLineTo(7.5f)
                curveTo(5.0147f, 21.0f, 3.0f, 18.9853f, 3.0f, 16.5f)
                verticalLineTo(15.0f)
                curveTo(3.0f, 14.4477f, 3.4477f, 14.0f, 4.0f, 14.0f)
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
                moveTo(20.0f, 14.0f)
                curveTo(20.5523f, 14.0f, 21.0f, 14.4477f, 21.0f, 15.0f)
                verticalLineTo(16.5f)
                curveTo(21.0f, 18.9853f, 18.9853f, 21.0f, 16.5f, 21.0f)
                horizontalLineTo(15.0f)
                curveTo(14.4477f, 21.0f, 14.0f, 20.5523f, 14.0f, 20.0f)
                curveTo(14.0f, 19.4477f, 14.4477f, 19.0f, 15.0f, 19.0f)
                horizontalLineTo(16.5f)
                curveTo(17.8807f, 19.0f, 19.0f, 17.8807f, 19.0f, 16.5f)
                verticalLineTo(15.0f)
                curveTo(19.0f, 14.4477f, 19.4477f, 14.0f, 20.0f, 14.0f)
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
                moveTo(7.3031f, 15.6167f)
                curveTo(8.0477f, 13.98f, 9.9723f, 13.0f, 12.0f, 13.0f)
                curveTo(14.0277f, 13.0f, 15.9523f, 13.98f, 16.6969f, 15.6167f)
                curveTo(16.991f, 16.2633f, 16.8248f, 16.9189f, 16.4405f, 17.3605f)
                curveTo(16.0815f, 17.7729f, 15.5452f, 18.0f, 15.0f, 18.0f)
                horizontalLineTo(9.0f)
                curveTo(8.4548f, 18.0f, 7.9185f, 17.7729f, 7.5595f, 17.3605f)
                curveTo(7.1752f, 16.9189f, 7.009f, 16.2633f, 7.3031f, 15.6167f)
                close()
                moveTo(14.579f, 16.0f)
                curveTo(14.0876f, 15.4515f, 13.1776f, 15.0f, 12.0f, 15.0f)
                curveTo(10.8224f, 15.0f, 9.9124f, 15.4515f, 9.4209f, 16.0f)
                horizontalLineTo(14.579f)
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
                moveTo(12.0f, 6.0f)
                curveTo(10.3431f, 6.0f, 9.0f, 7.3432f, 9.0f, 9.0f)
                curveTo(9.0f, 10.6569f, 10.3431f, 12.0f, 12.0f, 12.0f)
                curveTo(13.6569f, 12.0f, 15.0f, 10.6569f, 15.0f, 9.0f)
                curveTo(15.0f, 7.3432f, 13.6569f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(11.0f, 9.0f)
                curveTo(11.0f, 8.4477f, 11.4477f, 8.0f, 12.0f, 8.0f)
                curveTo(12.5523f, 8.0f, 13.0f, 8.4477f, 13.0f, 9.0f)
                curveTo(13.0f, 9.5523f, 12.5523f, 10.0f, 12.0f, 10.0f)
                curveTo(11.4477f, 10.0f, 11.0f, 9.5523f, 11.0f, 9.0f)
                close()
            }
        }.build()
        return userBoxDashed!!
    }

private var userBoxDashed: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.UserBoxDashed,
                contentDescription = ""
            )
        }
    }
}