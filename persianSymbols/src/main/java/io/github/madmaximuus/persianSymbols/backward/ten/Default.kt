package io.github.madmaximuus.persianSymbols.backward.ten

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

val PersianSymbols.Default.Backward10: ImageVector
    get() {
        if (backward10 != null) {
            return backward10!!
        }
        backward10 = Builder(
            name = "backward-10-default",
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
                moveTo(15.6874f, 1.951f)
                curveTo(15.9874f, 2.4148f, 15.8546f, 3.0338f, 15.3909f, 3.3338f)
                lineTo(14.5381f, 3.8854f)
                curveTo(17.9928f, 4.9648f, 20.5f, 8.1896f, 20.5f, 12.0f)
                curveTo(20.5f, 16.6944f, 16.6944f, 20.5f, 12.0f, 20.5f)
                curveTo(7.3056f, 20.5f, 3.5f, 16.6944f, 3.5f, 12.0f)
                curveTo(3.5f, 11.4477f, 3.9477f, 11.0f, 4.5f, 11.0f)
                curveTo(5.0523f, 11.0f, 5.5f, 11.4477f, 5.5f, 12.0f)
                curveTo(5.5f, 15.5898f, 8.4101f, 18.5f, 12.0f, 18.5f)
                curveTo(15.5899f, 18.5f, 18.5f, 15.5898f, 18.5f, 12.0f)
                curveTo(18.5f, 9.1184f, 16.6249f, 6.6748f, 14.0284f, 5.8227f)
                lineTo(14.783f, 6.8137f)
                curveTo(15.1175f, 7.2532f, 15.0326f, 7.8806f, 14.5931f, 8.2152f)
                curveTo(14.1537f, 8.5497f, 13.5263f, 8.4648f, 13.1917f, 8.0253f)
                lineTo(11.2899f, 5.5277f)
                curveTo(10.7607f, 4.8326f, 10.9351f, 3.834f, 11.6687f, 3.3595f)
                lineTo(14.3046f, 1.6545f)
                curveTo(14.7684f, 1.3545f, 15.3874f, 1.4873f, 15.6874f, 1.951f)
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
                curveTo(15.0671f, 11.8274f, 15.042f, 11.554f, 14.9919f, 11.3193f)
                curveTo(14.9418f, 11.0823f, 14.8688f, 10.8807f, 14.7731f, 10.7143f)
                curveTo(14.6797f, 10.5457f, 14.5658f, 10.409f, 14.4313f, 10.3042f)
                curveTo(14.2992f, 10.1994f, 14.1488f, 10.123f, 13.9802f, 10.0752f)
                curveTo(13.8138f, 10.025f, 13.6315f, 10.0f, 13.4333f, 10.0f)
                curveTo(13.1872f, 10.0f, 12.9639f, 10.0387f, 12.7634f, 10.1162f)
                curveTo(12.5651f, 10.1937f, 12.3942f, 10.3178f, 12.2507f, 10.4887f)
                curveTo(12.1071f, 10.6574f, 11.9966f, 10.8772f, 11.9191f, 11.1484f)
                curveTo(11.8417f, 11.4173f, 11.8029f, 11.7477f, 11.8029f, 12.1396f)
                verticalLineTo(12.9531f)
                curveTo(11.8029f, 13.2653f, 11.828f, 13.5398f, 11.8781f, 13.7768f)
                curveTo(11.9305f, 14.0138f, 12.0035f, 14.2177f, 12.0969f, 14.3886f)
                curveTo(12.1926f, 14.5573f, 12.3076f, 14.6951f, 12.4421f, 14.8022f)
                curveTo(12.5765f, 14.9093f, 12.7269f, 14.9879f, 12.8933f, 15.0381f)
                curveTo(13.0619f, 15.0882f, 13.2442f, 15.1133f, 13.4401f, 15.1133f)
                curveTo(13.6862f, 15.1133f, 13.9084f, 15.0734f, 14.1066f, 14.9936f)
                curveTo(14.3072f, 14.9139f, 14.4792f, 14.7885f, 14.6228f, 14.6176f)
                curveTo(14.7663f, 14.4467f, 14.8757f, 14.2246f, 14.9509f, 13.9511f)
                curveTo(15.0284f, 13.6754f, 15.0671f, 13.3427f, 15.0671f, 12.9531f)
                close()
                moveTo(14.2434f, 12.0166f)
                verticalLineTo(13.0693f)
                curveTo(14.2434f, 13.3177f, 14.2263f, 13.5307f, 14.1921f, 13.7085f)
                curveTo(14.1579f, 13.8862f, 14.1066f, 14.0309f, 14.0383f, 14.1425f)
                curveTo(13.9699f, 14.2519f, 13.8856f, 14.3317f, 13.7854f, 14.3818f)
                curveTo(13.6851f, 14.4319f, 13.57f, 14.457f, 13.4401f, 14.457f)
                curveTo(13.3376f, 14.457f, 13.243f, 14.4411f, 13.1564f, 14.4092f)
                curveTo(13.0721f, 14.3772f, 12.9969f, 14.3271f, 12.9309f, 14.2588f)
                curveTo(12.8671f, 14.1881f, 12.8124f, 14.0993f, 12.7668f, 13.9922f)
                curveTo(12.7212f, 13.8828f, 12.687f, 13.7518f, 12.6643f, 13.5991f)
                curveTo(12.6415f, 13.4464f, 12.6301f, 13.2698f, 12.6301f, 13.0693f)
                verticalLineTo(12.0166f)
                curveTo(12.6301f, 11.7682f, 12.6472f, 11.5574f, 12.6813f, 11.3842f)
                curveTo(12.7178f, 11.2088f, 12.7702f, 11.0675f, 12.8386f, 10.9604f)
                curveTo(12.9069f, 10.8533f, 12.9912f, 10.7759f, 13.0915f, 10.728f)
                curveTo(13.1918f, 10.6779f, 13.3057f, 10.6528f, 13.4333f, 10.6528f)
                curveTo(13.5381f, 10.6528f, 13.6327f, 10.6688f, 13.717f, 10.7007f)
                curveTo(13.8013f, 10.7303f, 13.8765f, 10.7793f, 13.9426f, 10.8476f)
                curveTo(14.0087f, 10.9137f, 14.0633f, 11.0003f, 14.1066f, 11.1074f)
                curveTo(14.1522f, 11.2122f, 14.1864f, 11.341f, 14.2092f, 11.4936f)
                curveTo(14.232f, 11.644f, 14.2434f, 11.8183f, 14.2434f, 12.0166f)
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
                curveTo(10.0439f, 10.0889f, 10.0062f, 10.0512f, 9.9597f, 10.0512f)
                curveTo(9.9499f, 10.0512f, 9.9401f, 10.053f, 9.9308f, 10.0564f)
                lineTo(8.2133f, 10.6842f)
                curveTo(8.0852f, 10.731f, 8.0f, 10.8529f, 8.0f, 10.9893f)
                curveTo(8.0f, 11.2117f, 8.2185f, 11.3683f, 8.4291f, 11.2969f)
                lineTo(9.0881f, 11.0736f)
                curveTo(9.153f, 11.0516f, 9.2202f, 11.0998f, 9.2202f, 11.1683f)
                verticalLineTo(14.633f)
                curveTo(9.2202f, 14.8605f, 9.4046f, 15.0449f, 9.6321f, 15.0449f)
                curveTo(9.8596f, 15.0449f, 10.0439f, 14.8605f, 10.0439f, 14.633f)
                verticalLineTo(10.1355f)
                close()
            }
        }.build()
        return backward10!!
    }

private var backward10: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Backward10,
                contentDescription = ""
            )
        }
    }
}