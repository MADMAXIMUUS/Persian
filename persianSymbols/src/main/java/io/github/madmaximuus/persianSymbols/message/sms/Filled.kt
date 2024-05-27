package io.github.madmaximuus.persianSymbols.message.sms

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.MessageSms: ImageVector
    get() {
        if (messageSms != null) {
            return messageSms!!
        }
        messageSms = Builder(
            name = "message-sms-filled",
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
                moveTo(6.4f, 3.21f)
                horizontalLineTo(17.6f)
                curveTo(20.0301f, 3.21f, 22.0f, 5.1799f, 22.0f, 7.61f)
                verticalLineTo(14.81f)
                curveTo(22.0f, 17.24f, 20.0301f, 19.21f, 17.6f, 19.21f)
                horizontalLineTo(8.1664f)
                curveTo(7.7622f, 19.21f, 7.3611f, 19.28f, 6.9809f, 19.4169f)
                lineTo(3.3387f, 20.728f)
                curveTo(2.6871f, 20.9626f, 2.0f, 20.4797f, 2.0f, 19.7871f)
                verticalLineTo(7.61f)
                curveTo(2.0f, 5.1799f, 3.9699f, 3.21f, 6.4f, 3.21f)
                close()
                moveTo(8.0824f, 12.1242f)
                curveTo(8.1182f, 12.2116f, 8.1362f, 12.3125f, 8.1362f, 12.4269f)
                curveTo(8.1362f, 12.5861f, 8.0947f, 12.724f, 8.0117f, 12.8406f)
                curveTo(7.931f, 12.9572f, 7.8122f, 13.0469f, 7.6552f, 13.1097f)
                curveTo(7.4982f, 13.1725f, 7.3065f, 13.2039f, 7.08f, 13.2039f)
                curveTo(6.923f, 13.2039f, 6.7717f, 13.1859f, 6.6259f, 13.1501f)
                curveTo(6.4824f, 13.1119f, 6.3534f, 13.0536f, 6.2391f, 12.9752f)
                curveTo(6.127f, 12.8967f, 6.0384f, 12.798f, 5.9734f, 12.6792f)
                curveTo(5.9537f, 12.6426f, 5.9371f, 12.604f, 5.9234f, 12.5632f)
                curveTo(5.8666f, 12.3941f, 5.7312f, 12.2452f, 5.5529f, 12.2452f)
                curveTo(5.3745f, 12.2452f, 5.2248f, 12.3917f, 5.2638f, 12.5657f)
                curveTo(5.29f, 12.6826f, 5.3314f, 12.791f, 5.3881f, 12.8911f)
                curveTo(5.4957f, 13.0749f, 5.6381f, 13.2297f, 5.8153f, 13.3552f)
                curveTo(5.9946f, 13.4808f, 6.1931f, 13.575f, 6.4106f, 13.6378f)
                curveTo(6.6304f, 13.7006f, 6.8535f, 13.732f, 7.08f, 13.732f)
                curveTo(7.3379f, 13.732f, 7.5711f, 13.7017f, 7.7796f, 13.6412f)
                curveTo(7.9904f, 13.5784f, 8.1709f, 13.4898f, 8.3212f, 13.3754f)
                curveTo(8.4714f, 13.2611f, 8.5869f, 13.1232f, 8.6676f, 12.9617f)
                curveTo(8.7484f, 12.8002f, 8.7887f, 12.6197f, 8.7887f, 12.4202f)
                curveTo(8.7887f, 12.2295f, 8.7562f, 12.0591f, 8.6912f, 11.9089f)
                curveTo(8.6284f, 11.7564f, 8.5309f, 11.6207f, 8.3985f, 11.5019f)
                curveTo(8.2685f, 11.3808f, 8.1025f, 11.272f, 7.9007f, 11.1756f)
                curveTo(7.6989f, 11.0792f, 7.459f, 10.9917f, 7.1809f, 10.9132f)
                curveTo(6.9791f, 10.8572f, 6.8053f, 10.7989f, 6.6595f, 10.7383f)
                curveTo(6.516f, 10.6778f, 6.3972f, 10.6116f, 6.303f, 10.5399f)
                curveTo(6.2111f, 10.4681f, 6.1427f, 10.3907f, 6.0978f, 10.3078f)
                curveTo(6.0552f, 10.2226f, 6.0339f, 10.1284f, 6.0339f, 10.0252f)
                curveTo(6.0339f, 9.8728f, 6.0698f, 9.7371f, 6.1415f, 9.6182f)
                curveTo(6.2155f, 9.4994f, 6.3277f, 9.4052f, 6.4779f, 9.3357f)
                curveTo(6.6281f, 9.2662f, 6.8187f, 9.2314f, 7.0497f, 9.2314f)
                curveTo(7.2941f, 9.2314f, 7.496f, 9.2729f, 7.6552f, 9.3559f)
                curveTo(7.8144f, 9.4366f, 7.9332f, 9.5487f, 8.0117f, 9.6922f)
                curveTo(8.0414f, 9.7456f, 8.0654f, 9.802f, 8.0839f, 9.8615f)
                curveTo(8.1367f, 10.0318f, 8.274f, 10.18f, 8.4524f, 10.18f)
                curveTo(8.6307f, 10.18f, 8.7795f, 10.0334f, 8.7382f, 9.8599f)
                curveTo(8.7052f, 9.7215f, 8.6503f, 9.5883f, 8.5735f, 9.4601f)
                curveTo(8.4389f, 9.2337f, 8.2427f, 9.0509f, 7.9848f, 8.9119f)
                curveTo(7.7292f, 8.7706f, 7.4175f, 8.7f, 7.0497f, 8.7f)
                curveTo(6.7986f, 8.7f, 6.571f, 8.7336f, 6.3669f, 8.8009f)
                curveTo(6.1628f, 8.8681f, 5.9868f, 8.9623f, 5.8388f, 9.0834f)
                curveTo(5.693f, 9.2023f, 5.5809f, 9.3424f, 5.5024f, 9.5039f)
                curveTo(5.424f, 9.6653f, 5.3847f, 9.8413f, 5.3847f, 10.032f)
                curveTo(5.3847f, 10.2226f, 5.4217f, 10.3919f, 5.4957f, 10.5399f)
                curveTo(5.5697f, 10.6879f, 5.6762f, 10.8191f, 5.8153f, 10.9334f)
                curveTo(5.9543f, 11.0478f, 6.1213f, 11.1498f, 6.3164f, 11.2395f)
                curveTo(6.5115f, 11.327f, 6.7302f, 11.4066f, 6.9724f, 11.4783f)
                curveTo(7.2033f, 11.5456f, 7.3939f, 11.6118f, 7.5442f, 11.6768f)
                curveTo(7.6967f, 11.7418f, 7.8155f, 11.8102f, 7.9007f, 11.882f)
                curveTo(7.9882f, 11.9537f, 8.0487f, 12.0345f, 8.0824f, 12.1242f)
                close()
                moveTo(10.1023f, 8.7672f)
                curveTo(9.7958f, 8.7672f, 9.5473f, 9.0157f, 9.5473f, 9.3222f)
                verticalLineTo(13.3418f)
                curveTo(9.5473f, 13.5201f, 9.6919f, 13.6647f, 9.8702f, 13.6647f)
                curveTo(10.0485f, 13.6647f, 10.1931f, 13.5201f, 10.1931f, 13.3418f)
                verticalLineTo(11.7542f)
                lineTo(10.1307f, 9.7005f)
                lineTo(11.6448f, 13.437f)
                curveTo(11.7005f, 13.5746f, 11.8342f, 13.6647f, 11.9827f, 13.6647f)
                curveTo(12.1311f, 13.6647f, 12.2647f, 13.5748f, 12.3206f, 13.4374f)
                lineTo(13.8377f, 9.7061f)
                lineTo(13.7754f, 11.7542f)
                verticalLineTo(13.3418f)
                curveTo(13.7754f, 13.5201f, 13.92f, 13.6647f, 14.0983f, 13.6647f)
                curveTo(14.2767f, 13.6647f, 14.4212f, 13.5201f, 14.4212f, 13.3418f)
                verticalLineTo(9.3222f)
                curveTo(14.4212f, 9.0157f, 14.1728f, 8.7672f, 13.8662f, 8.7672f)
                curveTo(13.6976f, 8.7672f, 13.5459f, 8.8698f, 13.4831f, 9.0264f)
                lineTo(11.9859f, 12.7599f)
                lineTo(10.4856f, 9.0263f)
                curveTo(10.4227f, 8.8698f, 10.271f, 8.7672f, 10.1023f, 8.7672f)
                close()
                moveTo(18.1028f, 12.4269f)
                curveTo(18.1028f, 12.3125f, 18.0849f, 12.2116f, 18.049f, 12.1242f)
                curveTo(18.0154f, 12.0345f, 17.9548f, 11.9537f, 17.8674f, 11.882f)
                curveTo(17.7822f, 11.8102f, 17.6633f, 11.7418f, 17.5108f, 11.6768f)
                curveTo(17.3606f, 11.6118f, 17.17f, 11.5456f, 16.939f, 11.4783f)
                curveTo(16.6968f, 11.4066f, 16.4782f, 11.327f, 16.2831f, 11.2395f)
                curveTo(16.088f, 11.1498f, 15.9209f, 11.0478f, 15.7819f, 10.9334f)
                curveTo(15.6429f, 10.8191f, 15.5364f, 10.6879f, 15.4624f, 10.5399f)
                curveTo(15.3884f, 10.3919f, 15.3514f, 10.2226f, 15.3514f, 10.032f)
                curveTo(15.3514f, 9.8413f, 15.3906f, 9.6653f, 15.4691f, 9.5039f)
                curveTo(15.5476f, 9.3424f, 15.6597f, 9.2023f, 15.8054f, 9.0834f)
                curveTo(15.9534f, 8.9623f, 16.1295f, 8.8681f, 16.3335f, 8.8009f)
                curveTo(16.5376f, 8.7336f, 16.7652f, 8.7f, 17.0164f, 8.7f)
                curveTo(17.3841f, 8.7f, 17.6958f, 8.7706f, 17.9515f, 8.9119f)
                curveTo(18.2093f, 9.0509f, 18.4056f, 9.2337f, 18.5401f, 9.4601f)
                curveTo(18.617f, 9.5883f, 18.6719f, 9.7215f, 18.7048f, 9.8599f)
                curveTo(18.7462f, 10.0334f, 18.5973f, 10.18f, 18.419f, 10.18f)
                curveTo(18.2407f, 10.18f, 18.1034f, 10.0318f, 18.0505f, 9.8615f)
                curveTo(18.0321f, 9.802f, 18.008f, 9.7456f, 17.9784f, 9.6922f)
                curveTo(17.8999f, 9.5487f, 17.781f, 9.4366f, 17.6218f, 9.3559f)
                curveTo(17.4626f, 9.2729f, 17.2608f, 9.2314f, 17.0164f, 9.2314f)
                curveTo(16.7854f, 9.2314f, 16.5948f, 9.2662f, 16.4445f, 9.3357f)
                curveTo(16.2943f, 9.4052f, 16.1822f, 9.4994f, 16.1082f, 9.6182f)
                curveTo(16.0364f, 9.7371f, 16.0005f, 9.8728f, 16.0005f, 10.0252f)
                curveTo(16.0005f, 10.1284f, 16.0218f, 10.2226f, 16.0644f, 10.3078f)
                curveTo(16.1093f, 10.3907f, 16.1777f, 10.4681f, 16.2696f, 10.5399f)
                curveTo(16.3638f, 10.6116f, 16.4827f, 10.6778f, 16.6262f, 10.7383f)
                curveTo(16.7719f, 10.7989f, 16.9457f, 10.8572f, 17.1475f, 10.9132f)
                curveTo(17.4256f, 10.9917f, 17.6655f, 11.0792f, 17.8674f, 11.1756f)
                curveTo(18.0692f, 11.272f, 18.2351f, 11.3808f, 18.3652f, 11.5019f)
                curveTo(18.4975f, 11.6207f, 18.595f, 11.7564f, 18.6578f, 11.9089f)
                curveTo(18.7229f, 12.0591f, 18.7554f, 12.2295f, 18.7554f, 12.4202f)
                curveTo(18.7554f, 12.6197f, 18.715f, 12.8002f, 18.6343f, 12.9617f)
                curveTo(18.5536f, 13.1232f, 18.4381f, 13.2611f, 18.2878f, 13.3754f)
                curveTo(18.1376f, 13.4898f, 17.9571f, 13.5784f, 17.7463f, 13.6412f)
                curveTo(17.5377f, 13.7017f, 17.3045f, 13.732f, 17.0466f, 13.732f)
                curveTo(16.8201f, 13.732f, 16.597f, 13.7006f, 16.3773f, 13.6378f)
                curveTo(16.1598f, 13.575f, 15.9613f, 13.4808f, 15.7819f, 13.3552f)
                curveTo(15.6047f, 13.2297f, 15.4624f, 13.0749f, 15.3547f, 12.8911f)
                curveTo(15.2981f, 12.791f, 15.2567f, 12.6826f, 15.2305f, 12.5657f)
                curveTo(15.1914f, 12.3917f, 15.3412f, 12.2452f, 15.5195f, 12.2452f)
                curveTo(15.6979f, 12.2452f, 15.8333f, 12.3941f, 15.89f, 12.5632f)
                curveTo(15.9037f, 12.604f, 15.9204f, 12.6426f, 15.94f, 12.6792f)
                curveTo(16.005f, 12.798f, 16.0936f, 12.8967f, 16.2057f, 12.9752f)
                curveTo(16.3201f, 13.0536f, 16.449f, 13.1119f, 16.5925f, 13.1501f)
                curveTo(16.7383f, 13.1859f, 16.8897f, 13.2039f, 17.0466f, 13.2039f)
                curveTo(17.2731f, 13.2039f, 17.4648f, 13.1725f, 17.6218f, 13.1097f)
                curveTo(17.7788f, 13.0469f, 17.8976f, 12.9572f, 17.9784f, 12.8406f)
                curveTo(18.0613f, 12.724f, 18.1028f, 12.5861f, 18.1028f, 12.4269f)
                close()
            }
        }.build()
        return messageSms!!
    }

private var messageSms: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.MessageSms,
                contentDescription = ""
            )
        }
    }
}