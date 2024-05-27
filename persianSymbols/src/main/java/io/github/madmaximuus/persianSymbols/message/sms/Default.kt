package io.github.madmaximuus.persianSymbols.message.sms

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

val PersianSymbols.Default.MessageSms: ImageVector
    get() {
        if (messageSms != null) {
            return messageSms!!
        }
        messageSms = Builder(
            name = "message-sms-default",
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
                moveTo(8.0824f, 11.9142f)
                curveTo(8.1182f, 12.0016f, 8.1362f, 12.1026f, 8.1362f, 12.2169f)
                curveTo(8.1362f, 12.3761f, 8.0947f, 12.514f, 8.0117f, 12.6306f)
                curveTo(7.931f, 12.7473f, 7.8122f, 12.837f, 7.6552f, 12.8997f)
                curveTo(7.4982f, 12.9625f, 7.3065f, 12.9939f, 7.08f, 12.9939f)
                curveTo(6.923f, 12.9939f, 6.7717f, 12.976f, 6.6259f, 12.9401f)
                curveTo(6.4824f, 12.902f, 6.3534f, 12.8437f, 6.2391f, 12.7652f)
                curveTo(6.127f, 12.6867f, 6.0384f, 12.588f, 5.9734f, 12.4692f)
                curveTo(5.9537f, 12.4327f, 5.9371f, 12.394f, 5.9234f, 12.3533f)
                curveTo(5.8666f, 12.1842f, 5.7312f, 12.0353f, 5.5529f, 12.0353f)
                curveTo(5.3745f, 12.0353f, 5.2248f, 12.1817f, 5.2638f, 12.3558f)
                curveTo(5.29f, 12.4726f, 5.3314f, 12.5811f, 5.3881f, 12.6811f)
                curveTo(5.4957f, 12.865f, 5.6381f, 13.0197f, 5.8153f, 13.1453f)
                curveTo(5.9946f, 13.2709f, 6.1931f, 13.365f, 6.4106f, 13.4278f)
                curveTo(6.6304f, 13.4906f, 6.8535f, 13.522f, 7.08f, 13.522f)
                curveTo(7.3379f, 13.522f, 7.5711f, 13.4917f, 7.7796f, 13.4312f)
                curveTo(7.9904f, 13.3684f, 8.1709f, 13.2798f, 8.3212f, 13.1655f)
                curveTo(8.4714f, 13.0511f, 8.5869f, 12.9132f, 8.6676f, 12.7517f)
                curveTo(8.7484f, 12.5903f, 8.7887f, 12.4098f, 8.7887f, 12.2102f)
                curveTo(8.7887f, 12.0196f, 8.7562f, 11.8492f, 8.6912f, 11.6989f)
                curveTo(8.6284f, 11.5464f, 8.5309f, 11.4108f, 8.3985f, 11.2919f)
                curveTo(8.2685f, 11.1708f, 8.1025f, 11.0621f, 7.9007f, 10.9656f)
                curveTo(7.6989f, 10.8692f, 7.459f, 10.7818f, 7.1809f, 10.7033f)
                curveTo(6.9791f, 10.6472f, 6.8053f, 10.5889f, 6.6595f, 10.5284f)
                curveTo(6.516f, 10.4678f, 6.3972f, 10.4017f, 6.303f, 10.3299f)
                curveTo(6.2111f, 10.2582f, 6.1427f, 10.1808f, 6.0978f, 10.0978f)
                curveTo(6.0552f, 10.0126f, 6.0339f, 9.9184f, 6.0339f, 9.8153f)
                curveTo(6.0339f, 9.6628f, 6.0698f, 9.5271f, 6.1415f, 9.4083f)
                curveTo(6.2155f, 9.2894f, 6.3277f, 9.1952f, 6.4779f, 9.1257f)
                curveTo(6.6281f, 9.0562f, 6.8187f, 9.0215f, 7.0497f, 9.0215f)
                curveTo(7.2941f, 9.0215f, 7.496f, 9.0629f, 7.6552f, 9.1459f)
                curveTo(7.8144f, 9.2266f, 7.9332f, 9.3387f, 8.0117f, 9.4823f)
                curveTo(8.0414f, 9.5357f, 8.0654f, 9.5921f, 8.0839f, 9.6516f)
                curveTo(8.1367f, 9.8219f, 8.274f, 9.97f, 8.4524f, 9.97f)
                curveTo(8.6307f, 9.97f, 8.7795f, 9.8235f, 8.7382f, 9.65f)
                curveTo(8.7052f, 9.5116f, 8.6503f, 9.3783f, 8.5735f, 9.2502f)
                curveTo(8.4389f, 9.0237f, 8.2427f, 8.8409f, 7.9848f, 8.7019f)
                curveTo(7.7292f, 8.5606f, 7.4175f, 8.49f, 7.0497f, 8.49f)
                curveTo(6.7986f, 8.49f, 6.571f, 8.5236f, 6.3669f, 8.5909f)
                curveTo(6.1628f, 8.6582f, 5.9868f, 8.7524f, 5.8388f, 8.8735f)
                curveTo(5.693f, 8.9923f, 5.5809f, 9.1325f, 5.5024f, 9.2939f)
                curveTo(5.424f, 9.4554f, 5.3847f, 9.6314f, 5.3847f, 9.822f)
                curveTo(5.3847f, 10.0126f, 5.4217f, 10.1819f, 5.4957f, 10.3299f)
                curveTo(5.5697f, 10.4779f, 5.6762f, 10.6091f, 5.8153f, 10.7235f)
                curveTo(5.9543f, 10.8378f, 6.1213f, 10.9399f, 6.3164f, 11.0295f)
                curveTo(6.5115f, 11.117f, 6.7302f, 11.1966f, 6.9724f, 11.2684f)
                curveTo(7.2033f, 11.3356f, 7.3939f, 11.4018f, 7.5442f, 11.4668f)
                curveTo(7.6967f, 11.5319f, 7.8155f, 11.6002f, 7.9007f, 11.672f)
                curveTo(7.9882f, 11.7438f, 8.0487f, 11.8245f, 8.0824f, 11.9142f)
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
                moveTo(10.1023f, 8.5573f)
                curveTo(9.7958f, 8.5573f, 9.5473f, 8.8057f, 9.5473f, 9.1123f)
                verticalLineTo(13.1318f)
                curveTo(9.5473f, 13.3102f, 9.6919f, 13.4547f, 9.8702f, 13.4547f)
                curveTo(10.0485f, 13.4547f, 10.1931f, 13.3102f, 10.1931f, 13.1318f)
                verticalLineTo(11.5442f)
                lineTo(10.1307f, 9.4906f)
                lineTo(11.6448f, 13.227f)
                curveTo(11.7005f, 13.3647f, 11.8342f, 13.4547f, 11.9827f, 13.4547f)
                curveTo(12.1311f, 13.4547f, 12.2647f, 13.3649f, 12.3206f, 13.2274f)
                lineTo(13.8377f, 9.4961f)
                lineTo(13.7754f, 11.5442f)
                verticalLineTo(13.1318f)
                curveTo(13.7754f, 13.3102f, 13.92f, 13.4547f, 14.0983f, 13.4547f)
                curveTo(14.2767f, 13.4547f, 14.4212f, 13.3102f, 14.4212f, 13.1318f)
                verticalLineTo(9.1123f)
                curveTo(14.4212f, 8.8057f, 14.1728f, 8.5573f, 13.8662f, 8.5573f)
                curveTo(13.6976f, 8.5573f, 13.5459f, 8.6599f, 13.4831f, 8.8164f)
                lineTo(11.9859f, 12.5499f)
                lineTo(10.4856f, 8.8163f)
                curveTo(10.4227f, 8.6598f, 10.271f, 8.5573f, 10.1023f, 8.5573f)
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
                moveTo(18.1028f, 12.2169f)
                curveTo(18.1028f, 12.1026f, 18.0849f, 12.0016f, 18.049f, 11.9142f)
                curveTo(18.0154f, 11.8245f, 17.9548f, 11.7438f, 17.8674f, 11.672f)
                curveTo(17.7822f, 11.6002f, 17.6633f, 11.5319f, 17.5108f, 11.4668f)
                curveTo(17.3606f, 11.4018f, 17.17f, 11.3356f, 16.939f, 11.2684f)
                curveTo(16.6968f, 11.1966f, 16.4782f, 11.117f, 16.2831f, 11.0295f)
                curveTo(16.088f, 10.9399f, 15.9209f, 10.8378f, 15.7819f, 10.7235f)
                curveTo(15.6429f, 10.6091f, 15.5364f, 10.4779f, 15.4624f, 10.3299f)
                curveTo(15.3884f, 10.1819f, 15.3514f, 10.0126f, 15.3514f, 9.822f)
                curveTo(15.3514f, 9.6314f, 15.3906f, 9.4554f, 15.4691f, 9.2939f)
                curveTo(15.5476f, 9.1325f, 15.6597f, 8.9923f, 15.8054f, 8.8735f)
                curveTo(15.9534f, 8.7524f, 16.1295f, 8.6582f, 16.3335f, 8.5909f)
                curveTo(16.5376f, 8.5236f, 16.7652f, 8.49f, 17.0164f, 8.49f)
                curveTo(17.3841f, 8.49f, 17.6958f, 8.5606f, 17.9515f, 8.7019f)
                curveTo(18.2093f, 8.8409f, 18.4056f, 9.0237f, 18.5401f, 9.2502f)
                curveTo(18.617f, 9.3783f, 18.6719f, 9.5116f, 18.7048f, 9.65f)
                curveTo(18.7462f, 9.8235f, 18.5973f, 9.97f, 18.419f, 9.97f)
                curveTo(18.2407f, 9.97f, 18.1034f, 9.8219f, 18.0505f, 9.6516f)
                curveTo(18.0321f, 9.5921f, 18.008f, 9.5357f, 17.9784f, 9.4823f)
                curveTo(17.8999f, 9.3387f, 17.781f, 9.2266f, 17.6218f, 9.1459f)
                curveTo(17.4626f, 9.0629f, 17.2608f, 9.0215f, 17.0164f, 9.0215f)
                curveTo(16.7854f, 9.0215f, 16.5948f, 9.0562f, 16.4445f, 9.1257f)
                curveTo(16.2943f, 9.1952f, 16.1822f, 9.2894f, 16.1082f, 9.4083f)
                curveTo(16.0364f, 9.5271f, 16.0005f, 9.6628f, 16.0005f, 9.8153f)
                curveTo(16.0005f, 9.9184f, 16.0218f, 10.0126f, 16.0644f, 10.0978f)
                curveTo(16.1093f, 10.1808f, 16.1777f, 10.2582f, 16.2696f, 10.3299f)
                curveTo(16.3638f, 10.4017f, 16.4827f, 10.4678f, 16.6262f, 10.5284f)
                curveTo(16.7719f, 10.5889f, 16.9457f, 10.6472f, 17.1475f, 10.7033f)
                curveTo(17.4256f, 10.7818f, 17.6655f, 10.8692f, 17.8674f, 10.9656f)
                curveTo(18.0692f, 11.0621f, 18.2351f, 11.1708f, 18.3652f, 11.2919f)
                curveTo(18.4975f, 11.4108f, 18.595f, 11.5464f, 18.6578f, 11.6989f)
                curveTo(18.7229f, 11.8492f, 18.7554f, 12.0196f, 18.7554f, 12.2102f)
                curveTo(18.7554f, 12.4098f, 18.715f, 12.5903f, 18.6343f, 12.7517f)
                curveTo(18.5536f, 12.9132f, 18.4381f, 13.0511f, 18.2878f, 13.1655f)
                curveTo(18.1376f, 13.2798f, 17.9571f, 13.3684f, 17.7463f, 13.4312f)
                curveTo(17.5377f, 13.4917f, 17.3045f, 13.522f, 17.0466f, 13.522f)
                curveTo(16.8201f, 13.522f, 16.597f, 13.4906f, 16.3773f, 13.4278f)
                curveTo(16.1598f, 13.365f, 15.9613f, 13.2709f, 15.7819f, 13.1453f)
                curveTo(15.6047f, 13.0197f, 15.4624f, 12.865f, 15.3547f, 12.6811f)
                curveTo(15.2981f, 12.5811f, 15.2567f, 12.4726f, 15.2305f, 12.3558f)
                curveTo(15.1914f, 12.1817f, 15.3412f, 12.0353f, 15.5195f, 12.0353f)
                curveTo(15.6979f, 12.0353f, 15.8333f, 12.1842f, 15.89f, 12.3533f)
                curveTo(15.9037f, 12.394f, 15.9204f, 12.4327f, 15.94f, 12.4692f)
                curveTo(16.005f, 12.588f, 16.0936f, 12.6867f, 16.2057f, 12.7652f)
                curveTo(16.3201f, 12.8437f, 16.449f, 12.902f, 16.5925f, 12.9401f)
                curveTo(16.7383f, 12.976f, 16.8897f, 12.9939f, 17.0466f, 12.9939f)
                curveTo(17.2731f, 12.9939f, 17.4648f, 12.9625f, 17.6218f, 12.8997f)
                curveTo(17.7788f, 12.837f, 17.8976f, 12.7473f, 17.9784f, 12.6306f)
                curveTo(18.0613f, 12.514f, 18.1028f, 12.3761f, 18.1028f, 12.2169f)
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
                moveTo(6.5f, 3.0f)
                curveTo(4.0147f, 3.0f, 2.0f, 5.0147f, 2.0f, 7.5f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 20.3318f, 2.1646f, 20.642f, 2.4394f, 20.8281f)
                curveTo(2.7141f, 21.0141f, 3.0633f, 21.0517f, 3.3714f, 20.9285f)
                lineTo(7.7456f, 19.1788f)
                curveTo(8.0409f, 19.0607f, 8.356f, 19.0f, 8.674f, 19.0f)
                horizontalLineTo(17.5f)
                curveTo(19.9853f, 19.0f, 22.0f, 16.9853f, 22.0f, 14.5f)
                verticalLineTo(7.5f)
                curveTo(22.0f, 5.0147f, 19.9853f, 3.0f, 17.5f, 3.0f)
                horizontalLineTo(6.5f)
                close()
                moveTo(4.0f, 7.5f)
                curveTo(4.0f, 6.1193f, 5.1193f, 5.0f, 6.5f, 5.0f)
                horizontalLineTo(17.5f)
                curveTo(18.8807f, 5.0f, 20.0f, 6.1193f, 20.0f, 7.5f)
                verticalLineTo(14.5f)
                curveTo(20.0f, 15.8807f, 18.8807f, 17.0f, 17.5f, 17.0f)
                horizontalLineTo(8.674f)
                curveTo(8.1016f, 17.0f, 7.5343f, 17.1092f, 7.0028f, 17.3219f)
                lineTo(4.0f, 18.523f)
                verticalLineTo(7.5f)
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
                imageVector = PersianSymbols.Default.MessageSms,
                contentDescription = ""
            )
        }
    }
}