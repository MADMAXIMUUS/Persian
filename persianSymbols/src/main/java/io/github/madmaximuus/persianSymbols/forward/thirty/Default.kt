package io.github.madmaximuus.persianSymbols.forward.thirty

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Forward30: ImageVector
    get() {
        if (forward30 != null) {
            return forward30!!
        }
        forward30 = Builder(
            name = "forward-30-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(8.3126f, 1.95102f)
                curveTo(8.0126f, 2.4148f, 8.1454f, 3.0338f, 8.6091f, 3.3338f)
                lineTo(9.46189f, 3.88538f)
                curveTo(6.0072f, 4.9648f, 3.5f, 8.1896f, 3.5f, 12f)
                curveTo(3.5f, 16.6944f, 7.3056f, 20.5f, 12f, 20.5f)
                curveTo(16.6944f, 20.5f, 20.5f, 16.6944f, 20.5f, 12f)
                curveTo(20.5f, 11.4477f, 20.0523f, 11f, 19.5f, 11f)
                curveTo(18.9477f, 11f, 18.5f, 11.4477f, 18.5f, 12f)
                curveTo(18.5f, 15.5898f, 15.5899f, 18.5f, 12f, 18.5f)
                curveTo(8.4101f, 18.5f, 5.5f, 15.5898f, 5.5f, 12f)
                curveTo(5.5f, 9.1184f, 7.3751f, 6.6748f, 9.9716f, 5.8227f)
                lineTo(9.21704f, 6.81375f)
                curveTo(8.8825f, 7.2532f, 8.9674f, 7.8806f, 9.4069f, 8.2152f)
                curveTo(9.8463f, 8.5497f, 10.4737f, 8.4648f, 10.8083f, 8.0253f)
                lineTo(12.7101f, 5.52767f)
                curveTo(13.2393f, 4.8326f, 13.0649f, 3.834f, 12.3313f, 3.3595f)
                lineTo(9.69537f, 1.65448f)
                curveTo(9.2316f, 1.3545f, 8.6126f, 1.4873f, 8.3126f, 1.951f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.3815f, 12.9531f)
                verticalLineTo(12.1396f)
                curveTo(15.3815f, 11.8275f, 15.3565f, 11.554f, 15.3063f, 11.3193f)
                curveTo(15.2562f, 11.0824f, 15.1833f, 10.8807f, 15.0876f, 10.7144f)
                curveTo(14.9942f, 10.5457f, 14.8802f, 10.409f, 14.7458f, 10.3042f)
                curveTo(14.6136f, 10.1994f, 14.4632f, 10.123f, 14.2946f, 10.0752f)
                curveTo(14.1283f, 10.0251f, 13.946f, 10f, 13.7478f, 10f)
                curveTo(13.5017f, 10f, 13.2784f, 10.0387f, 13.0778f, 10.1162f)
                curveTo(12.8796f, 10.1937f, 12.7087f, 10.3179f, 12.5651f, 10.4888f)
                curveTo(12.4216f, 10.6574f, 12.3111f, 10.8773f, 12.2336f, 11.1484f)
                curveTo(12.1561f, 11.4173f, 12.1174f, 11.7477f, 12.1174f, 12.1396f)
                verticalLineTo(12.9531f)
                curveTo(12.1174f, 13.2653f, 12.1424f, 13.5399f, 12.1926f, 13.7769f)
                curveTo(12.245f, 14.0138f, 12.3179f, 14.2178f, 12.4113f, 14.3887f)
                curveTo(12.507f, 14.5573f, 12.6221f, 14.6951f, 12.7565f, 14.8022f)
                curveTo(12.891f, 14.9093f, 13.0414f, 14.988f, 13.2077f, 15.0381f)
                curveTo(13.3763f, 15.0882f, 13.5586f, 15.1133f, 13.7546f, 15.1133f)
                curveTo(14.0007f, 15.1133f, 14.2229f, 15.0734f, 14.4211f, 14.9937f)
                curveTo(14.6216f, 14.9139f, 14.7937f, 14.7886f, 14.9372f, 14.6177f)
                curveTo(15.0808f, 14.4468f, 15.1901f, 14.2246f, 15.2653f, 13.9512f)
                curveTo(15.3428f, 13.6755f, 15.3815f, 13.3428f, 15.3815f, 12.9531f)
                close()
                moveTo(14.5578f, 12.0166f)
                verticalLineTo(13.0693f)
                curveTo(14.5578f, 13.3177f, 14.5407f, 13.5308f, 14.5065f, 13.7085f)
                curveTo(14.4724f, 13.8862f, 14.4211f, 14.0309f, 14.3527f, 14.1426f)
                curveTo(14.2844f, 14.252f, 14.2001f, 14.3317f, 14.0998f, 14.3818f)
                curveTo(13.9995f, 14.432f, 13.8845f, 14.457f, 13.7546f, 14.457f)
                curveTo(13.6521f, 14.457f, 13.5575f, 14.4411f, 13.4709f, 14.4092f)
                curveTo(13.3866f, 14.3773f, 13.3114f, 14.3271f, 13.2453f, 14.2588f)
                curveTo(13.1815f, 14.1882f, 13.1268f, 14.0993f, 13.0813f, 13.9922f)
                curveTo(13.0357f, 13.8828f, 13.0015f, 13.7518f, 12.9787f, 13.5991f)
                curveTo(12.9559f, 13.4465f, 12.9445f, 13.2699f, 12.9445f, 13.0693f)
                verticalLineTo(12.0166f)
                curveTo(12.9445f, 11.7682f, 12.9616f, 11.5575f, 12.9958f, 11.3843f)
                curveTo(13.0323f, 11.2088f, 13.0847f, 11.0675f, 13.153f, 10.9604f)
                curveTo(13.2214f, 10.8534f, 13.3057f, 10.7759f, 13.406f, 10.728f)
                curveTo(13.5062f, 10.6779f, 13.6201f, 10.6528f, 13.7478f, 10.6528f)
                curveTo(13.8526f, 10.6528f, 13.9471f, 10.6688f, 14.0314f, 10.7007f)
                curveTo(14.1158f, 10.7303f, 14.191f, 10.7793f, 14.257f, 10.8477f)
                curveTo(14.3231f, 10.9137f, 14.3778f, 11.0003f, 14.4211f, 11.1074f)
                curveTo(14.4667f, 11.2122f, 14.5008f, 11.341f, 14.5236f, 11.4937f)
                curveTo(14.5464f, 11.644f, 14.5578f, 11.8184f, 14.5578f, 12.0166f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(9.39795f, 12.1841f)
                curveTo(9.2205f, 12.1841f, 9.0767f, 12.3279f, 9.0767f, 12.5054f)
                curveTo(9.0767f, 12.6828f, 9.2205f, 12.8267f, 9.3979f, 12.8267f)
                horizontalLineTo(9.56885f)
                curveTo(9.758f, 12.8267f, 9.922f, 12.8563f, 10.061f, 12.9155f)
                curveTo(10.2f, 12.9725f, 10.3071f, 13.0614f, 10.3823f, 13.1821f)
                curveTo(10.4575f, 13.3029f, 10.4951f, 13.4601f, 10.4951f, 13.6538f)
                curveTo(10.4951f, 13.8247f, 10.4609f, 13.9705f, 10.3926f, 14.0913f)
                curveTo(10.3265f, 14.2121f, 10.2308f, 14.3032f, 10.1055f, 14.3647f)
                curveTo(9.9801f, 14.4263f, 9.8309f, 14.457f, 9.6577f, 14.457f)
                curveTo(9.4937f, 14.457f, 9.3478f, 14.4251f, 9.2202f, 14.3613f)
                curveTo(9.0949f, 14.2975f, 8.9969f, 14.2098f, 8.9263f, 14.0981f)
                curveTo(8.8094f, 13.9033f, 8.6393f, 13.7051f, 8.4121f, 13.7051f)
                curveTo(8.1847f, 13.7051f, 7.9911f, 13.8933f, 8.053f, 14.1122f)
                curveTo(8.0737f, 14.1853f, 8.1005f, 14.2547f, 8.1333f, 14.3203f)
                curveTo(8.2244f, 14.4958f, 8.3475f, 14.6427f, 8.5024f, 14.7612f)
                curveTo(8.6574f, 14.8774f, 8.8328f, 14.9652f, 9.0288f, 15.0244f)
                curveTo(9.2248f, 15.0837f, 9.4299f, 15.1133f, 9.644f, 15.1133f)
                curveTo(9.8833f, 15.1133f, 10.1043f, 15.0814f, 10.3071f, 15.0176f)
                curveTo(10.5122f, 14.9538f, 10.6911f, 14.8592f, 10.8438f, 14.7339f)
                curveTo(10.9964f, 14.6086f, 11.1138f, 14.4559f, 11.1958f, 14.2759f)
                curveTo(11.2801f, 14.0936f, 11.3223f, 13.8862f, 11.3223f, 13.6538f)
                curveTo(11.3223f, 13.4829f, 11.2915f, 13.3211f, 11.23f, 13.1685f)
                curveTo(11.1707f, 13.0158f, 11.0762f, 12.8802f, 10.9463f, 12.7617f)
                curveTo(10.8164f, 12.641f, 10.6478f, 12.5464f, 10.4404f, 12.478f)
                curveTo(10.6341f, 12.4028f, 10.7241f, 12.3607f, 10.854f, 12.2422f)
                curveTo(10.9839f, 12.1214f, 11.0819f, 11.9881f, 11.1479f, 11.8423f)
                curveTo(11.214f, 11.6965f, 11.2471f, 11.5529f, 11.2471f, 11.4116f)
                curveTo(11.2471f, 11.1017f, 11.1799f, 10.842f, 11.0454f, 10.6323f)
                curveTo(10.911f, 10.4227f, 10.723f, 10.2655f, 10.4814f, 10.1606f)
                curveTo(10.2422f, 10.0535f, 9.9619f, 10f, 9.6406f, 10f)
                curveTo(9.3398f, 10f, 9.0687f, 10.0592f, 8.8271f, 10.1777f)
                curveTo(8.5879f, 10.2939f, 8.3988f, 10.4546f, 8.2598f, 10.6597f)
                curveTo(8.1968f, 10.7526f, 8.1481f, 10.8516f, 8.1136f, 10.9567f)
                curveTo(8.0425f, 11.1737f, 8.2364f, 11.3638f, 8.4648f, 11.3638f)
                horizontalLineTo(8.4831f)
                curveTo(8.7014f, 11.3638f, 8.8617f, 11.1707f, 8.981f, 10.9878f)
                curveTo(9.0493f, 10.8807f, 9.1416f, 10.7987f, 9.2578f, 10.7417f)
                curveTo(9.3763f, 10.6825f, 9.5085f, 10.6528f, 9.6543f, 10.6528f)
                curveTo(9.8275f, 10.6528f, 9.9699f, 10.6836f, 10.0815f, 10.7451f)
                curveTo(10.1955f, 10.8066f, 10.2798f, 10.8944f, 10.3345f, 11.0083f)
                curveTo(10.3914f, 11.12f, 10.4199f, 11.2544f, 10.4199f, 11.4116f)
                curveTo(10.4199f, 11.562f, 10.3892f, 11.6953f, 10.3276f, 11.8115f)
                curveTo(10.2661f, 11.9277f, 10.1715f, 12.0189f, 10.0439f, 12.085f)
                curveTo(9.9186f, 12.151f, 9.7602f, 12.1841f, 9.5688f, 12.1841f)
                horizontalLineTo(9.39795f)
                close()
            }
        }.build()
        return forward30!!
    }

private var forward30: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Forward30,
                contentDescription = ""
            )
        }
    }
}