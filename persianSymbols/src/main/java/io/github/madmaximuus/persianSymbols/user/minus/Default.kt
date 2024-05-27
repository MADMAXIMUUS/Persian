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

val PersianSymbols.Default.UserMinus: ImageVector
    get() {
        if (userMinus != null) {
            return userMinus!!
        }
        userMinus = Builder(
            name = "user-minus-default",
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
                moveTo(7.0001f, 7.5f)
                curveTo(7.0001f, 4.7386f, 9.2386f, 2.5f, 12.0f, 2.5f)
                curveTo(14.7615f, 2.5f, 17.0f, 4.7386f, 17.0f, 7.5f)
                curveTo(17.0f, 10.2614f, 14.7615f, 12.5f, 12.0f, 12.5f)
                curveTo(9.2386f, 12.5f, 7.0001f, 10.2614f, 7.0001f, 7.5f)
                close()
                moveTo(12.0f, 4.5f)
                curveTo(10.3432f, 4.5f, 9.0f, 5.8432f, 9.0f, 7.5f)
                curveTo(9.0f, 9.1568f, 10.3432f, 10.5f, 12.0f, 10.5f)
                curveTo(13.6569f, 10.5f, 15.0f, 9.1568f, 15.0f, 7.5f)
                curveTo(15.0f, 5.8432f, 13.6569f, 4.5f, 12.0f, 4.5f)
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
                moveTo(12.0001f, 15.5f)
                curveTo(9.8204f, 15.5f, 7.9577f, 16.467f, 6.9152f, 17.8495f)
                curveTo(6.7508f, 18.0676f, 6.7195f, 18.2378f, 6.7253f, 18.3595f)
                curveTo(6.7315f, 18.491f, 6.786f, 18.6516f, 6.9258f, 18.8251f)
                curveTo(7.2183f, 19.1882f, 7.8073f, 19.5f, 8.5001f, 19.5f)
                horizontalLineTo(12.1891f)
                curveTo(12.3769f, 20.2296f, 12.6985f, 20.9055f, 13.1261f, 21.5f)
                horizontalLineTo(8.5001f)
                curveTo(7.2598f, 21.5f, 6.0753f, 20.9573f, 5.3684f, 20.0799f)
                curveTo(5.0086f, 19.6333f, 4.757f, 19.0772f, 4.7275f, 18.4541f)
                curveTo(4.6975f, 17.8213f, 4.9009f, 17.199f, 5.3183f, 16.6454f)
                curveTo(6.7691f, 14.7215f, 9.2449f, 13.5f, 12.0001f, 13.5f)
                curveTo(12.6281f, 13.5f, 13.2416f, 13.5635f, 13.8318f, 13.6843f)
                curveTo(13.292f, 14.2057f, 12.8498f, 14.8275f, 12.5351f, 15.5196f)
                curveTo(12.3592f, 15.5066f, 12.1807f, 15.5f, 12.0001f, 15.5f)
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
                moveTo(16.5001f, 17.25f)
                curveTo(16.0858f, 17.25f, 15.7501f, 17.5858f, 15.7501f, 18.0f)
                curveTo(15.7501f, 18.4142f, 16.0858f, 18.75f, 16.5001f, 18.75f)
                horizontalLineTo(19.5001f)
                curveTo(19.9143f, 18.75f, 20.2501f, 18.4142f, 20.2501f, 18.0f)
                curveTo(20.2501f, 17.5858f, 19.9143f, 17.25f, 19.5001f, 17.25f)
                horizontalLineTo(16.5001f)
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
                moveTo(13.2501f, 18.0f)
                curveTo(13.2501f, 15.3766f, 15.3767f, 13.25f, 18.0001f, 13.25f)
                curveTo(20.6234f, 13.25f, 22.7501f, 15.3766f, 22.7501f, 18.0f)
                curveTo(22.7501f, 20.6234f, 20.6234f, 22.75f, 18.0001f, 22.75f)
                curveTo(15.3767f, 22.75f, 13.2501f, 20.6234f, 13.2501f, 18.0f)
                close()
                moveTo(18.0001f, 14.75f)
                curveTo(16.2051f, 14.75f, 14.7501f, 16.2051f, 14.7501f, 18.0f)
                curveTo(14.7501f, 19.7949f, 16.2051f, 21.25f, 18.0001f, 21.25f)
                curveTo(19.795f, 21.25f, 21.2501f, 19.7949f, 21.2501f, 18.0f)
                curveTo(21.2501f, 16.2051f, 19.795f, 14.75f, 18.0001f, 14.75f)
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
                imageVector = PersianSymbols.Default.UserMinus,
                contentDescription = ""
            )
        }
    }
}