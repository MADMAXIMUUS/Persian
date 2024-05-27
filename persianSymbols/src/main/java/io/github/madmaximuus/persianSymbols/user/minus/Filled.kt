package io.github.madmaximuus.persianSymbols.user.minus

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

val PersianSymbols.Filled.UserMinus: ImageVector
    get() {
        if (userMinus != null) {
            return userMinus!!
        }
        userMinus = Builder(
            name = "user-minus-filled",
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
                moveTo(17.0f, 7.5f)
                curveTo(17.0f, 10.2614f, 14.7614f, 12.5f, 12.0f, 12.5f)
                curveTo(9.2386f, 12.5f, 7.0f, 10.2614f, 7.0f, 7.5f)
                curveTo(7.0f, 4.7386f, 9.2386f, 2.5f, 12.0f, 2.5f)
                curveTo(14.7614f, 2.5f, 17.0f, 4.7386f, 17.0f, 7.5f)
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
                moveTo(11.9999f, 13.5f)
                curveTo(9.1145f, 13.5f, 6.5859f, 15.0276f, 5.1786f, 17.3182f)
                curveTo(3.9066f, 19.3887f, 5.9699f, 21.5f, 8.4f, 21.5f)
                horizontalLineTo(13.126f)
                curveTo(12.4173f, 20.5149f, 11.9999f, 19.3062f, 11.9999f, 18.0f)
                curveTo(11.9999f, 16.3166f, 12.6932f, 14.7952f, 13.8097f, 13.7056f)
                curveTo(13.2282f, 13.5711f, 12.6224f, 13.5f, 11.9999f, 13.5f)
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
                moveTo(16.4999f, 17.25f)
                curveTo(16.0857f, 17.25f, 15.7499f, 17.5858f, 15.7499f, 18.0f)
                curveTo(15.7499f, 18.4142f, 16.0857f, 18.75f, 16.4999f, 18.75f)
                horizontalLineTo(19.4999f)
                curveTo(19.9142f, 18.75f, 20.2499f, 18.4142f, 20.2499f, 18.0f)
                curveTo(20.2499f, 17.5858f, 19.9142f, 17.25f, 19.4999f, 17.25f)
                horizontalLineTo(16.4999f)
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
                moveTo(13.2499f, 18.0f)
                curveTo(13.2499f, 15.3766f, 15.3766f, 13.25f, 17.9999f, 13.25f)
                curveTo(20.6233f, 13.25f, 22.7499f, 15.3766f, 22.7499f, 18.0f)
                curveTo(22.7499f, 20.6234f, 20.6233f, 22.75f, 17.9999f, 22.75f)
                curveTo(15.3766f, 22.75f, 13.2499f, 20.6234f, 13.2499f, 18.0f)
                close()
                moveTo(17.9999f, 14.75f)
                curveTo(16.205f, 14.75f, 14.7499f, 16.2051f, 14.7499f, 18.0f)
                curveTo(14.7499f, 19.7949f, 16.205f, 21.25f, 17.9999f, 21.25f)
                curveTo(19.7949f, 21.25f, 21.2499f, 19.7949f, 21.2499f, 18.0f)
                curveTo(21.2499f, 16.2051f, 19.7949f, 14.75f, 17.9999f, 14.75f)
                close()
            }
        }.build()
        return userMinus!!
    }

private var userMinus: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.UserMinus,
                contentDescription = ""
            )
        }
    }
}