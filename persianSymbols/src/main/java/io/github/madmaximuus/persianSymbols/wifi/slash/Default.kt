package io.github.madmaximuus.persianSymbols.wifi.slash

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

val PersianSymbols.Default.WifiSlash: ImageVector
    get() {
        if (wifiSlash != null) {
            return wifiSlash!!
        }
        wifiSlash = Builder(
            name = "wifi-slash-default",
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
                moveTo(3.7071f, 2.2929f)
                curveTo(3.3166f, 1.9024f, 2.6834f, 1.9024f, 2.2929f, 2.2929f)
                curveTo(1.9024f, 2.6834f, 1.9024f, 3.3166f, 2.2929f, 3.7071f)
                lineTo(20.2929f, 21.7071f)
                curveTo(20.6834f, 22.0976f, 21.3166f, 22.0976f, 21.7071f, 21.7071f)
                curveTo(22.0976f, 21.3166f, 22.0976f, 20.6834f, 21.7071f, 20.2929f)
                lineTo(3.7071f, 2.2929f)
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
                moveTo(2.2854f, 8.1075f)
                curveTo(2.8356f, 7.5456f, 3.4326f, 7.0309f, 4.0701f, 6.5701f)
                lineTo(5.5056f, 8.0056f)
                curveTo(4.8611f, 8.4451f, 4.2613f, 8.9483f, 3.7146f, 9.5067f)
                curveTo(3.3282f, 9.9013f, 2.6951f, 9.908f, 2.3004f, 9.5217f)
                curveTo(1.9058f, 9.1353f, 1.8991f, 8.5022f, 2.2854f, 8.1075f)
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
                moveTo(7.3305f, 4.8305f)
                lineTo(8.9181f, 6.4181f)
                curveTo(9.8998f, 6.1454f, 10.9325f, 6.0f, 11.9981f, 6.0f)
                curveTo(15.2293f, 6.0f, 18.157f, 7.3364f, 20.2818f, 9.5068f)
                curveTo(20.6682f, 9.9014f, 21.3013f, 9.9082f, 21.696f, 9.5218f)
                curveTo(22.0906f, 9.1355f, 22.0973f, 8.5023f, 21.711f, 8.1077f)
                curveTo(19.2301f, 5.5735f, 15.7951f, 4.0f, 11.9981f, 4.0f)
                curveTo(10.3589f, 4.0f, 8.7872f, 4.2933f, 7.3305f, 4.8305f)
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
                moveTo(5.0542f, 10.9357f)
                curveTo(5.6164f, 10.3614f, 6.2474f, 9.856f, 6.9336f, 9.4336f)
                lineTo(8.398f, 10.898f)
                curveTo(7.6899f, 11.2755f, 7.0447f, 11.7613f, 6.4833f, 12.3348f)
                curveTo(6.097f, 12.7294f, 5.4638f, 12.7362f, 5.0692f, 12.3498f)
                curveTo(4.6745f, 11.9635f, 4.6678f, 11.3303f, 5.0542f, 10.9357f)
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
                moveTo(10.6003f, 8.1003f)
                lineTo(12.5168f, 10.0168f)
                curveTo(14.4605f, 10.1472f, 16.2118f, 11.0054f, 17.5132f, 12.3348f)
                curveTo(17.8996f, 12.7294f, 18.5327f, 12.7362f, 18.9273f, 12.3498f)
                curveTo(19.322f, 11.9635f, 19.3287f, 11.3303f, 18.9424f, 10.9357f)
                curveTo(17.17f, 9.1253f, 14.714f, 7.9995f, 11.9983f, 7.9995f)
                curveTo(11.5236f, 7.9995f, 11.0569f, 8.0339f, 10.6003f, 8.1003f)
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
                moveTo(11.5279f, 14.0279f)
                lineTo(9.8932f, 12.3932f)
                curveTo(9.1066f, 12.6995f, 8.4018f, 13.1718f, 7.8205f, 13.7662f)
                curveTo(7.4344f, 14.1611f, 7.4415f, 14.7942f, 7.8363f, 15.1803f)
                curveTo(8.2312f, 15.5665f, 8.8643f, 15.5594f, 9.2505f, 15.1645f)
                curveTo(9.8529f, 14.5485f, 10.6458f, 14.1368f, 11.5279f, 14.0279f)
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
                moveTo(11.9981f, 19.9982f)
                curveTo(13.0794f, 19.9982f, 13.9559f, 19.1028f, 13.9559f, 17.9984f)
                curveTo(13.9559f, 16.8939f, 13.0794f, 15.9986f, 11.9981f, 15.9986f)
                curveTo(10.9169f, 15.9986f, 10.0404f, 16.8939f, 10.0404f, 17.9984f)
                curveTo(10.0404f, 19.1028f, 10.9169f, 19.9982f, 11.9981f, 19.9982f)
                close()
            }
        }.build()
        return wifiSlash!!
    }

private var wifiSlash: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.WifiSlash,
                contentDescription = ""
            )
        }
    }
}