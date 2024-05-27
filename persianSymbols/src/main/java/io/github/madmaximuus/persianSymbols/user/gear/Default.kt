package io.github.madmaximuus.persianSymbols.user.gear

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

val PersianSymbols.Default.UserGear: ImageVector
    get() {
        if (userGear != null) {
            return userGear!!
        }
        userGear = Builder(
            name = "user-gear-default",
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
                curveTo(9.2386f, 2.5f, 7.0001f, 4.7386f, 7.0001f, 7.5f)
                curveTo(7.0001f, 10.2614f, 9.2386f, 12.5f, 12.0f, 12.5f)
                curveTo(14.7615f, 12.5f, 17.0f, 10.2614f, 17.0f, 7.5f)
                curveTo(17.0f, 4.7386f, 14.7615f, 2.5f, 12.0f, 2.5f)
                close()
                moveTo(9.0f, 7.5f)
                curveTo(9.0f, 5.8432f, 10.3432f, 4.5f, 12.0f, 4.5f)
                curveTo(13.6569f, 4.5f, 15.0f, 5.8432f, 15.0f, 7.5f)
                curveTo(15.0f, 9.1568f, 13.6569f, 10.5f, 12.0f, 10.5f)
                curveTo(10.3432f, 10.5f, 9.0f, 9.1568f, 9.0f, 7.5f)
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
                curveTo(7.9577f, 16.467f, 9.8204f, 15.5f, 12.0001f, 15.5f)
                curveTo(12.1807f, 15.5f, 12.3592f, 15.5066f, 12.5351f, 15.5196f)
                curveTo(12.8498f, 14.8275f, 13.292f, 14.2057f, 13.8318f, 13.6843f)
                curveTo(13.2416f, 13.5635f, 12.6281f, 13.5f, 12.0001f, 13.5f)
                curveTo(9.2449f, 13.5f, 6.7691f, 14.7215f, 5.3183f, 16.6454f)
                curveTo(4.9009f, 17.199f, 4.6975f, 17.8213f, 4.7275f, 18.4541f)
                curveTo(4.757f, 19.0772f, 5.0086f, 19.6333f, 5.3684f, 20.0799f)
                curveTo(6.0753f, 20.9573f, 7.2598f, 21.5f, 8.5001f, 21.5f)
                horizontalLineTo(13.1261f)
                curveTo(12.6985f, 20.9055f, 12.3769f, 20.2296f, 12.1891f, 19.5f)
                horizontalLineTo(8.5001f)
                curveTo(7.8073f, 19.5f, 7.2183f, 19.1882f, 6.9258f, 18.8251f)
                curveTo(6.786f, 18.6516f, 6.7315f, 18.491f, 6.7253f, 18.3595f)
                curveTo(6.7195f, 18.2378f, 6.7508f, 18.0676f, 6.9152f, 17.8495f)
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
                moveTo(18.0001f, 17.25f)
                curveTo(17.5858f, 17.25f, 17.2501f, 17.5858f, 17.2501f, 18.0f)
                curveTo(17.2501f, 18.4142f, 17.5858f, 18.75f, 18.0001f, 18.75f)
                curveTo(18.4143f, 18.75f, 18.7501f, 18.4142f, 18.7501f, 18.0f)
                curveTo(18.7501f, 17.5858f, 18.4143f, 17.25f, 18.0001f, 17.25f)
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
                moveTo(14.0014f, 18.104f)
                curveTo(14.0005f, 18.0694f, 14.0001f, 18.0348f, 14.0001f, 18.0f)
                curveTo(14.0001f, 17.9652f, 14.0005f, 17.9306f, 14.0014f, 17.896f)
                curveTo(13.6087f, 17.4267f, 13.5292f, 16.7438f, 13.8529f, 16.183f)
                lineTo(14.3529f, 15.317f)
                curveTo(14.6766f, 14.7565f, 15.3073f, 14.4838f, 15.9099f, 14.5889f)
                curveTo(15.9693f, 14.5524f, 16.0297f, 14.5174f, 16.0912f, 14.484f)
                curveTo(16.3015f, 13.9098f, 16.8529f, 13.5f, 17.5001f, 13.5f)
                horizontalLineTo(18.5001f)
                curveTo(19.1472f, 13.5f, 19.6986f, 13.9098f, 19.9089f, 14.484f)
                curveTo(19.9704f, 14.5174f, 20.0308f, 14.5524f, 20.0903f, 14.5889f)
                curveTo(20.6928f, 14.4838f, 21.3236f, 14.7565f, 21.6472f, 15.317f)
                lineTo(22.1472f, 16.183f)
                curveTo(22.4709f, 16.7438f, 22.3915f, 17.4267f, 21.9987f, 17.896f)
                curveTo(21.9996f, 17.9306f, 22.0001f, 17.9652f, 22.0001f, 18.0f)
                curveTo(22.0001f, 18.0348f, 21.9996f, 18.0694f, 21.9987f, 18.104f)
                curveTo(22.3915f, 18.5733f, 22.4709f, 19.2562f, 22.1472f, 19.817f)
                lineTo(21.6472f, 20.683f)
                curveTo(21.3236f, 21.2435f, 20.6928f, 21.5162f, 20.0903f, 21.4111f)
                curveTo(20.0308f, 21.4476f, 19.9704f, 21.4826f, 19.9089f, 21.516f)
                curveTo(19.6986f, 22.0902f, 19.1472f, 22.5f, 18.5001f, 22.5f)
                horizontalLineTo(17.5001f)
                curveTo(16.8529f, 22.5f, 16.3015f, 22.0902f, 16.0912f, 21.516f)
                curveTo(16.0297f, 21.4826f, 15.9693f, 21.4476f, 15.9099f, 21.4111f)
                curveTo(15.3073f, 21.5162f, 14.6766f, 21.2435f, 14.3529f, 20.683f)
                lineTo(13.8529f, 19.817f)
                curveTo(13.5292f, 19.2562f, 13.6087f, 18.5733f, 14.0014f, 18.104f)
                close()
                moveTo(15.7501f, 18.0f)
                curveTo(15.7501f, 16.7574f, 16.7574f, 15.75f, 18.0001f, 15.75f)
                curveTo(19.2427f, 15.75f, 20.2501f, 16.7574f, 20.2501f, 18.0f)
                curveTo(20.2501f, 19.2426f, 19.2427f, 20.25f, 18.0001f, 20.25f)
                curveTo(16.7574f, 20.25f, 15.7501f, 19.2426f, 15.7501f, 18.0f)
                close()
            }
        }.build()
        return userGear!!
    }

private var userGear: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.UserGear,
                contentDescription = ""
            )
        }
    }
}