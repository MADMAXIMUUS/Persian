package io.github.madmaximuus.persianSymbols.user.plus

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

val PersianSymbols.Default.UserPlus: ImageVector
    get() {
        if (userPlus != null) {
            return userPlus!!
        }
        userPlus = Builder(
            name = "user-plus-default",
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
                moveTo(12.0f, 2.5f)
                curveTo(9.2386f, 2.5f, 7.0f, 4.7386f, 7.0f, 7.5f)
                curveTo(7.0f, 10.2614f, 9.2386f, 12.5f, 12.0f, 12.5f)
                curveTo(14.7614f, 12.5f, 17.0f, 10.2614f, 17.0f, 7.5f)
                curveTo(17.0f, 4.7386f, 14.7614f, 2.5f, 12.0f, 2.5f)
                close()
                moveTo(9.0f, 7.5f)
                curveTo(9.0f, 5.8432f, 10.3431f, 4.5f, 12.0f, 4.5f)
                curveTo(13.6568f, 4.5f, 15.0f, 5.8432f, 15.0f, 7.5f)
                curveTo(15.0f, 9.1568f, 13.6568f, 10.5f, 12.0f, 10.5f)
                curveTo(10.3431f, 10.5f, 9.0f, 9.1568f, 9.0f, 7.5f)
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
                moveTo(6.9152f, 17.8495f)
                curveTo(7.9577f, 16.467f, 9.8203f, 15.5f, 12.0f, 15.5f)
                curveTo(12.1806f, 15.5f, 12.3591f, 15.5066f, 12.5351f, 15.5196f)
                curveTo(12.8497f, 14.8275f, 13.2919f, 14.2057f, 13.8317f, 13.6843f)
                curveTo(13.2416f, 13.5635f, 12.628f, 13.5f, 12.0f, 13.5f)
                curveTo(9.2448f, 13.5f, 6.769f, 14.7215f, 5.3183f, 16.6454f)
                curveTo(4.9008f, 17.199f, 4.6975f, 17.8213f, 4.7274f, 18.4541f)
                curveTo(4.7569f, 19.0772f, 5.0085f, 19.6333f, 5.3684f, 20.0799f)
                curveTo(6.0752f, 20.9573f, 7.2597f, 21.5f, 8.5f, 21.5f)
                horizontalLineTo(13.126f)
                curveTo(12.6984f, 20.9055f, 12.3768f, 20.2296f, 12.189f, 19.5f)
                horizontalLineTo(8.5f)
                curveTo(7.8072f, 19.5f, 7.2182f, 19.1882f, 6.9258f, 18.8251f)
                curveTo(6.7859f, 18.6516f, 6.7314f, 18.491f, 6.7252f, 18.3595f)
                curveTo(6.7194f, 18.2378f, 6.7507f, 18.0676f, 6.9152f, 17.8495f)
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
        return userPlus!!
    }

private var userPlus: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.UserPlus,
                contentDescription = ""
            )
        }
    }
}