package io.github.madmaximuus.persianSymbols.user.pen

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

val PersianSymbols.Default.UserPen: ImageVector
    get() {
        if (userPen != null) {
            return userPen!!
        }
        userPen = Builder(
            name = "user-pen-default",
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
                curveTo(12.5541f, 15.5f, 13.0877f, 15.5625f, 13.5925f, 15.6784f)
                lineTo(15.1923f, 14.0786f)
                curveTo(14.2092f, 13.7047f, 13.128f, 13.5f, 12.0f, 13.5f)
                curveTo(9.2448f, 13.5f, 6.769f, 14.7215f, 5.3183f, 16.6454f)
                curveTo(4.9008f, 17.199f, 4.6975f, 17.8213f, 4.7274f, 18.4541f)
                curveTo(4.7569f, 19.0772f, 5.0085f, 19.6333f, 5.3684f, 20.0799f)
                curveTo(6.0752f, 20.9573f, 7.2597f, 21.5f, 8.5f, 21.5f)
                horizontalLineTo(11.6958f)
                curveTo(11.5673f, 21.1363f, 11.5306f, 20.7309f, 11.6144f, 20.3123f)
                lineTo(11.7768f, 19.5f)
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
                pathFillType = EvenOdd
            ) {
                moveTo(17.6027f, 13.0825f)
                curveTo(18.2861f, 12.3991f, 19.3942f, 12.3991f, 20.0776f, 13.0825f)
                lineTo(21.4918f, 14.4967f)
                curveTo(22.1752f, 15.1801f, 22.1752f, 16.2882f, 21.4918f, 16.9716f)
                lineTo(17.4633f, 21.0001f)
                curveTo(17.219f, 21.2444f, 16.9078f, 21.411f, 16.569f, 21.4787f)
                lineTo(14.0658f, 21.9794f)
                curveTo(13.1912f, 22.1543f, 12.42f, 21.3831f, 12.595f, 20.5085f)
                lineTo(13.0956f, 18.0053f)
                curveTo(13.1634f, 17.6665f, 13.3299f, 17.3554f, 13.5742f, 17.1111f)
                lineTo(17.6027f, 13.0825f)
                close()
                moveTo(14.6348f, 18.1717f)
                lineTo(17.1938f, 15.6128f)
                lineTo(18.9616f, 17.3805f)
                lineTo(16.4026f, 19.9395f)
                curveTo(16.3677f, 19.9744f, 16.3233f, 19.9982f, 16.2749f, 20.0079f)
                lineTo(14.1394f, 20.4349f)
                lineTo(14.5665f, 18.2995f)
                curveTo(14.5761f, 18.2511f, 14.5999f, 18.2066f, 14.6348f, 18.1717f)
                close()
            }
        }.build()
        return userPen!!
    }

private var userPen: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.UserPen,
                contentDescription = ""
            )
        }
    }
}