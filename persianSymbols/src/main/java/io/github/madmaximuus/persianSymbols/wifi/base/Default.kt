package io.github.madmaximuus.persianSymbols.wifi.base

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

val PersianSymbols.Default.Wifi: ImageVector
    get() {
        if (wifi != null) {
            return wifi!!
        }
        wifi = Builder(
            name = "wifi-default",
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
                moveTo(3.7146f, 9.5085f)
                curveTo(5.8393f, 7.3382f, 8.7671f, 6.0018f, 11.9981f, 6.0018f)
                curveTo(15.2293f, 6.0018f, 18.157f, 7.3382f, 20.2818f, 9.5086f)
                curveTo(20.6682f, 9.9033f, 21.3013f, 9.91f, 21.696f, 9.5237f)
                curveTo(22.0906f, 9.1373f, 22.0973f, 8.5042f, 21.711f, 8.1095f)
                curveTo(19.2301f, 5.5753f, 15.7951f, 4.0018f, 11.9981f, 4.0018f)
                curveTo(8.2012f, 4.0018f, 4.7663f, 5.5753f, 2.2854f, 8.1094f)
                curveTo(1.8991f, 8.504f, 1.9058f, 9.1372f, 2.3004f, 9.5235f)
                curveTo(2.6951f, 9.9099f, 3.3282f, 9.9032f, 3.7146f, 9.5085f)
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
                moveTo(11.9983f, 10.0013f)
                curveTo(9.8484f, 10.0013f, 7.8995f, 10.89f, 6.4833f, 12.3366f)
                curveTo(6.097f, 12.7313f, 5.4638f, 12.738f, 5.0692f, 12.3516f)
                curveTo(4.6745f, 11.9653f, 4.6678f, 11.3322f, 5.0542f, 10.9375f)
                curveTo(6.8265f, 9.1271f, 9.2826f, 8.0013f, 11.9983f, 8.0013f)
                curveTo(14.714f, 8.0013f, 17.17f, 9.1271f, 18.9424f, 10.9375f)
                curveTo(19.3287f, 11.3322f, 19.322f, 11.9653f, 18.9273f, 12.3516f)
                curveTo(18.5327f, 12.738f, 17.8996f, 12.7313f, 17.5132f, 12.3366f)
                curveTo(16.097f, 10.89f, 14.1481f, 10.0013f, 11.9983f, 10.0013f)
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
                moveTo(9.2505f, 15.1664f)
                curveTo(9.9582f, 14.4426f, 10.9289f, 14.0009f, 11.9983f, 14.0009f)
                curveTo(13.0646f, 14.0009f, 14.0327f, 14.4401f, 14.7399f, 15.1601f)
                curveTo(15.127f, 15.5542f, 15.7601f, 15.5598f, 16.1541f, 15.1728f)
                curveTo(16.5481f, 14.7858f, 16.5538f, 14.1527f, 16.1668f, 13.7587f)
                curveTo(15.1035f, 12.6762f, 13.6292f, 12.0009f, 11.9983f, 12.0009f)
                curveTo(10.3626f, 12.0009f, 8.8845f, 12.6801f, 7.8205f, 13.768f)
                curveTo(7.4344f, 14.1629f, 7.4415f, 14.796f, 7.8363f, 15.1822f)
                curveTo(8.2312f, 15.5683f, 8.8643f, 15.5612f, 9.2505f, 15.1664f)
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
                moveTo(11.9981f, 20.0f)
                curveTo(13.0794f, 20.0f, 13.9559f, 19.1047f, 13.9559f, 18.0002f)
                curveTo(13.9559f, 16.8958f, 13.0794f, 16.0004f, 11.9981f, 16.0004f)
                curveTo(10.9169f, 16.0004f, 10.0404f, 16.8958f, 10.0404f, 18.0002f)
                curveTo(10.0404f, 19.1047f, 10.9169f, 20.0f, 11.9981f, 20.0f)
                close()
            }
        }.build()
        return wifi!!
    }

private var wifi: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Wifi,
                contentDescription = ""
            )
        }
    }
}