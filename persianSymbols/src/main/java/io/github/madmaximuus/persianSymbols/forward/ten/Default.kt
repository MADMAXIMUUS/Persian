package io.github.madmaximuus.persianSymbols.forward.ten

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

val PersianSymbols.Default.Forward10: ImageVector
    get() {
        if (forward10 != null) {
            return forward10!!
        }
        forward10 = Builder(
            name = "forward-10-default",
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
                moveTo(8.3126f, 1.951f)
                curveTo(8.0126f, 2.4148f, 8.1454f, 3.0338f, 8.6091f, 3.3338f)
                lineTo(9.4619f, 3.8854f)
                curveTo(6.0072f, 4.9648f, 3.5f, 8.1896f, 3.5f, 12.0f)
                curveTo(3.5f, 16.6944f, 7.3056f, 20.5f, 12.0f, 20.5f)
                curveTo(16.6944f, 20.5f, 20.5f, 16.6944f, 20.5f, 12.0f)
                curveTo(20.5f, 11.4477f, 20.0523f, 11.0f, 19.5f, 11.0f)
                curveTo(18.9477f, 11.0f, 18.5f, 11.4477f, 18.5f, 12.0f)
                curveTo(18.5f, 15.5898f, 15.5899f, 18.5f, 12.0f, 18.5f)
                curveTo(8.4101f, 18.5f, 5.5f, 15.5898f, 5.5f, 12.0f)
                curveTo(5.5f, 9.1184f, 7.3751f, 6.6748f, 9.9716f, 5.8227f)
                lineTo(9.217f, 6.8137f)
                curveTo(8.8825f, 7.2532f, 8.9674f, 7.8806f, 9.4068f, 8.2152f)
                curveTo(9.8463f, 8.5497f, 10.4737f, 8.4648f, 10.8083f, 8.0253f)
                lineTo(12.7101f, 5.5277f)
                curveTo(13.2393f, 4.8326f, 13.0649f, 3.834f, 12.3313f, 3.3595f)
                lineTo(9.6954f, 1.6545f)
                curveTo(9.2316f, 1.3545f, 8.6125f, 1.4873f, 8.3126f, 1.951f)
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
                moveTo(15.0671f, 12.9531f)
                verticalLineTo(12.1396f)
                curveTo(15.0671f, 11.8275f, 15.042f, 11.554f, 14.9919f, 11.3193f)
                curveTo(14.9418f, 11.0824f, 14.8688f, 10.8807f, 14.7731f, 10.7144f)
                curveTo(14.6797f, 10.5457f, 14.5658f, 10.409f, 14.4313f, 10.3042f)
                curveTo(14.2992f, 10.1994f, 14.1488f, 10.123f, 13.9802f, 10.0752f)
                curveTo(13.8138f, 10.0251f, 13.6315f, 10.0f, 13.4333f, 10.0f)
                curveTo(13.1872f, 10.0f, 12.9639f, 10.0387f, 12.7634f, 10.1162f)
                curveTo(12.5651f, 10.1937f, 12.3942f, 10.3179f, 12.2507f, 10.4888f)
                curveTo(12.1071f, 10.6574f, 11.9966f, 10.8773f, 11.9191f, 11.1484f)
                curveTo(11.8417f, 11.4173f, 11.8029f, 11.7477f, 11.8029f, 12.1396f)
                verticalLineTo(12.9531f)
                curveTo(11.8029f, 13.2653f, 11.828f, 13.5399f, 11.8781f, 13.7769f)
                curveTo(11.9305f, 14.0138f, 12.0035f, 14.2178f, 12.0969f, 14.3887f)
                curveTo(12.1926f, 14.5573f, 12.3076f, 14.6951f, 12.4421f, 14.8022f)
                curveTo(12.5765f, 14.9093f, 12.7269f, 14.988f, 12.8933f, 15.0381f)
                curveTo(13.0619f, 15.0882f, 13.2442f, 15.1133f, 13.4401f, 15.1133f)
                curveTo(13.6862f, 15.1133f, 13.9084f, 15.0734f, 14.1066f, 14.9937f)
                curveTo(14.3072f, 14.9139f, 14.4792f, 14.7886f, 14.6228f, 14.6177f)
                curveTo(14.7663f, 14.4468f, 14.8757f, 14.2246f, 14.9509f, 13.9512f)
                curveTo(15.0284f, 13.6755f, 15.0671f, 13.3428f, 15.0671f, 12.9531f)
                close()
                moveTo(14.2434f, 12.0166f)
                verticalLineTo(13.0693f)
                curveTo(14.2434f, 13.3177f, 14.2263f, 13.5308f, 14.1921f, 13.7085f)
                curveTo(14.1579f, 13.8862f, 14.1066f, 14.0309f, 14.0383f, 14.1426f)
                curveTo(13.9699f, 14.252f, 13.8856f, 14.3317f, 13.7854f, 14.3818f)
                curveTo(13.6851f, 14.432f, 13.57f, 14.457f, 13.4401f, 14.457f)
                curveTo(13.3376f, 14.457f, 13.243f, 14.4411f, 13.1564f, 14.4092f)
                curveTo(13.0721f, 14.3773f, 12.9969f, 14.3271f, 12.9309f, 14.2588f)
                curveTo(12.8671f, 14.1882f, 12.8124f, 14.0993f, 12.7668f, 13.9922f)
                curveTo(12.7212f, 13.8828f, 12.687f, 13.7518f, 12.6643f, 13.5991f)
                curveTo(12.6415f, 13.4465f, 12.6301f, 13.2699f, 12.6301f, 13.0693f)
                verticalLineTo(12.0166f)
                curveTo(12.6301f, 11.7682f, 12.6472f, 11.5575f, 12.6813f, 11.3843f)
                curveTo(12.7178f, 11.2088f, 12.7702f, 11.0675f, 12.8386f, 10.9604f)
                curveTo(12.9069f, 10.8534f, 12.9912f, 10.7759f, 13.0915f, 10.728f)
                curveTo(13.1918f, 10.6779f, 13.3057f, 10.6528f, 13.4333f, 10.6528f)
                curveTo(13.5381f, 10.6528f, 13.6327f, 10.6688f, 13.717f, 10.7007f)
                curveTo(13.8013f, 10.7303f, 13.8765f, 10.7793f, 13.9426f, 10.8477f)
                curveTo(14.0087f, 10.9137f, 14.0633f, 11.0003f, 14.1066f, 11.1074f)
                curveTo(14.1522f, 11.2122f, 14.1864f, 11.341f, 14.2092f, 11.4937f)
                curveTo(14.232f, 11.644f, 14.2434f, 11.8184f, 14.2434f, 12.0166f)
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
                moveTo(10.0439f, 10.1355f)
                curveTo(10.0439f, 10.089f, 10.0062f, 10.0513f, 9.9597f, 10.0513f)
                curveTo(9.9499f, 10.0513f, 9.9401f, 10.053f, 9.9308f, 10.0564f)
                lineTo(8.2133f, 10.6842f)
                curveTo(8.0852f, 10.7311f, 8.0f, 10.8529f, 8.0f, 10.9893f)
                curveTo(8.0f, 11.2117f, 8.2185f, 11.3683f, 8.4291f, 11.2969f)
                lineTo(9.0881f, 11.0736f)
                curveTo(9.153f, 11.0516f, 9.2202f, 11.0998f, 9.2202f, 11.1683f)
                verticalLineTo(14.6331f)
                curveTo(9.2202f, 14.8605f, 9.4046f, 15.0449f, 9.6321f, 15.0449f)
                curveTo(9.8596f, 15.0449f, 10.0439f, 14.8605f, 10.0439f, 14.6331f)
                verticalLineTo(10.1355f)
                close()
            }
        }.build()
        return forward10!!
    }

private var forward10: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Forward10,
                contentDescription = ""
            )
        }
    }
}