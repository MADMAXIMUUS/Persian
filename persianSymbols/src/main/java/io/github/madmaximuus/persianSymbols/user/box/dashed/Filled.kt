package io.github.madmaximuus.persianSymbols.user.box.dashed

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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

val PersianSymbols.Filled.UserBoxDashed: ImageVector
    get() {
        if (userBoxDashed != null) {
            return userBoxDashed!!
        }
        userBoxDashed = Builder(
            name = "user-box-dashed-filled",
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
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 13.0f)
                curveTo(9.9294f, 13.0f, 8.1528f, 14.2586f, 7.3935f, 16.0525f)
                curveTo(6.9629f, 17.0697f, 7.8954f, 18.0f, 9.0f, 18.0f)
                horizontalLineTo(15.0f)
                curveTo(16.1046f, 18.0f, 17.0371f, 17.0697f, 16.6065f, 16.0525f)
                curveTo(15.8472f, 14.2586f, 14.0706f, 13.0f, 12.0f, 13.0f)
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
                moveTo(12.0f, 12.0f)
                curveTo(13.6569f, 12.0f, 15.0f, 10.6569f, 15.0f, 9.0f)
                curveTo(15.0f, 7.3432f, 13.6569f, 6.0f, 12.0f, 6.0f)
                curveTo(10.3431f, 6.0f, 9.0f, 7.3432f, 9.0f, 9.0f)
                curveTo(9.0f, 10.6569f, 10.3431f, 12.0f, 12.0f, 12.0f)
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
                imageVector = PersianSymbols.Filled.UserBoxDashed,
                contentDescription = ""
            )
        }
    }
}