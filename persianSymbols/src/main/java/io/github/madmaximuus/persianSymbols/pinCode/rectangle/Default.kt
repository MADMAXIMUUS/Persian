package io.github.madmaximuus.persianSymbols.pinCode.rectangle

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

val PersianSymbols.Default.PinCodeRectangle: ImageVector
    get() {
        if (pinCodeRectangle != null) {
            return pinCodeRectangle!!
        }
        pinCodeRectangle = Builder(
            name = "pin-code-rectangle-default",
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
                moveTo(13.368f, 14.1985f)
                curveTo(13.5854f, 14.1985f, 13.7617f, 14.3748f, 13.7617f, 14.5922f)
                curveTo(13.7617f, 14.8097f, 13.5854f, 14.986f, 13.368f, 14.986f)
                horizontalLineTo(10.2458f)
                curveTo(9.9767f, 14.986f, 9.7586f, 14.7678f, 9.7586f, 14.4988f)
                curveTo(9.7586f, 14.3768f, 9.8043f, 14.2594f, 9.8867f, 14.1695f)
                lineTo(11.7027f, 12.1887f)
                curveTo(11.916f, 11.9481f, 12.0842f, 11.7403f, 12.2072f, 11.5653f)
                curveTo(12.3303f, 11.3903f, 12.4164f, 11.233f, 12.4656f, 11.0936f)
                curveTo(12.5176f, 10.9514f, 12.5435f, 10.8133f, 12.5435f, 10.6793f)
                curveTo(12.5435f, 10.4907f, 12.508f, 10.3252f, 12.4369f, 10.183f)
                curveTo(12.3685f, 10.0381f, 12.2674f, 9.9246f, 12.1334f, 9.8426f)
                curveTo(11.9994f, 9.7578f, 11.8367f, 9.7155f, 11.6453f, 9.7155f)
                curveTo(11.4238f, 9.7155f, 11.2379f, 9.7633f, 11.0875f, 9.859f)
                curveTo(10.9371f, 9.9547f, 10.8236f, 10.0873f, 10.7471f, 10.2569f)
                curveTo(10.7338f, 10.2857f, 10.7217f, 10.3153f, 10.7108f, 10.3456f)
                curveTo(10.618f, 10.6024f, 10.4109f, 10.8311f, 10.138f, 10.8311f)
                curveTo(9.865f, 10.8311f, 9.6361f, 10.6065f, 9.7011f, 10.3414f)
                curveTo(9.7407f, 10.1796f, 9.8009f, 10.0257f, 9.8816f, 9.8795f)
                curveTo(10.0402f, 9.5897f, 10.2699f, 9.36f, 10.5707f, 9.1905f)
                curveTo(10.8715f, 9.0182f, 11.2338f, 8.9321f, 11.6576f, 8.9321f)
                curveTo(12.0568f, 8.9321f, 12.3959f, 8.9991f, 12.6748f, 9.133f)
                curveTo(12.9537f, 9.267f, 13.1656f, 9.4571f, 13.3105f, 9.7032f)
                curveTo(13.4582f, 9.9493f, 13.532f, 10.2405f, 13.532f, 10.5768f)
                curveTo(13.532f, 10.7627f, 13.5019f, 10.9473f, 13.4418f, 11.1305f)
                curveTo(13.3816f, 11.3137f, 13.2955f, 11.4969f, 13.1834f, 11.6801f)
                curveTo(13.074f, 11.8606f, 12.9441f, 12.0424f, 12.7937f, 12.2256f)
                curveTo(12.6434f, 12.4061f, 12.4779f, 12.5893f, 12.2975f, 12.7752f)
                lineTo(11.0855f, 14.1103f)
                curveTo(11.0548f, 14.1442f, 11.0788f, 14.1985f, 11.1246f, 14.1985f)
                horizontalLineTo(13.368f)
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
                moveTo(7.5353f, 8.9936f)
                curveTo(7.5839f, 8.9936f, 7.6232f, 9.0329f, 7.6232f, 9.0814f)
                verticalLineTo(14.4917f)
                curveTo(7.6232f, 14.7647f, 7.4019f, 14.986f, 7.129f, 14.986f)
                curveTo(6.856f, 14.986f, 6.6347f, 14.7647f, 6.6347f, 14.4917f)
                verticalLineTo(10.4243f)
                curveTo(6.6347f, 10.2978f, 6.5105f, 10.2087f, 6.3907f, 10.2493f)
                lineTo(5.6854f, 10.4884f)
                curveTo(5.4326f, 10.5741f, 5.1705f, 10.3861f, 5.1705f, 10.1192f)
                curveTo(5.1705f, 9.9556f, 5.2727f, 9.8093f, 5.4264f, 9.7531f)
                lineTo(7.475f, 9.0043f)
                curveTo(7.4944f, 8.9972f, 7.5148f, 8.9936f, 7.5353f, 8.9936f)
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
                moveTo(16.4094f, 11.553f)
                curveTo(16.2576f, 11.553f, 16.1346f, 11.676f, 16.1346f, 11.8278f)
                curveTo(16.1346f, 11.8681f, 16.1433f, 11.9065f, 16.1589f, 11.941f)
                curveTo(16.1433f, 11.9752f, 16.1346f, 12.0133f, 16.1346f, 12.0534f)
                curveTo(16.1346f, 12.2029f, 16.2558f, 12.3241f, 16.4053f, 12.3241f)
                horizontalLineTo(16.7252f)
                curveTo(16.9521f, 12.3241f, 17.149f, 12.3596f, 17.3158f, 12.4307f)
                curveTo(17.4826f, 12.4991f, 17.6111f, 12.6057f, 17.7014f, 12.7506f)
                curveTo(17.7916f, 12.8955f, 17.8367f, 13.0842f, 17.8367f, 13.3166f)
                curveTo(17.8367f, 13.5217f, 17.7957f, 13.6967f, 17.7137f, 13.8416f)
                curveTo(17.6344f, 13.9866f, 17.5195f, 14.0959f, 17.3691f, 14.1698f)
                curveTo(17.2187f, 14.2436f, 17.0396f, 14.2805f, 16.8318f, 14.2805f)
                curveTo(16.635f, 14.2805f, 16.46f, 14.2422f, 16.3068f, 14.1657f)
                curveTo(16.1564f, 14.0891f, 16.0389f, 13.9838f, 15.9541f, 13.8498f)
                curveTo(15.8138f, 13.6161f, 15.6097f, 13.3782f, 15.3371f, 13.3782f)
                curveTo(15.0642f, 13.3782f, 14.8318f, 13.6041f, 14.9062f, 13.8667f)
                curveTo(14.931f, 13.9544f, 14.9632f, 14.0377f, 15.0025f, 14.1164f)
                curveTo(15.1119f, 14.327f, 15.2596f, 14.5034f, 15.4455f, 14.6455f)
                curveTo(15.6314f, 14.785f, 15.842f, 14.8903f, 16.0771f, 14.9614f)
                curveTo(16.3123f, 15.0325f, 16.5584f, 15.068f, 16.8154f, 15.068f)
                curveTo(17.1025f, 15.068f, 17.3678f, 15.0297f, 17.6111f, 14.9532f)
                curveTo(17.8572f, 14.8766f, 18.0719f, 14.7631f, 18.2551f, 14.6127f)
                curveTo(18.4383f, 14.4623f, 18.5791f, 14.2791f, 18.6775f, 14.0631f)
                curveTo(18.7787f, 13.8444f, 18.8293f, 13.5955f, 18.8293f, 13.3166f)
                curveTo(18.8293f, 13.1116f, 18.7924f, 12.9174f, 18.7185f, 12.7342f)
                curveTo(18.6475f, 12.551f, 18.534f, 12.3883f, 18.3781f, 12.2461f)
                curveTo(18.2304f, 12.1087f, 18.0409f, 11.9996f, 17.8096f, 11.9188f)
                curveTo(17.9877f, 11.8374f, 18.1403f, 11.7387f, 18.2674f, 11.6227f)
                curveTo(18.4232f, 11.4778f, 18.5408f, 11.3178f, 18.6201f, 11.1428f)
                curveTo(18.6994f, 10.9678f, 18.7391f, 10.7955f, 18.7391f, 10.626f)
                curveTo(18.7391f, 10.2541f, 18.6584f, 9.9424f, 18.4971f, 9.6909f)
                curveTo(18.3357f, 9.4393f, 18.1102f, 9.2506f, 17.8203f, 9.1248f)
                curveTo(17.5332f, 8.9963f, 17.1969f, 8.9321f, 16.8113f, 8.9321f)
                curveTo(16.4504f, 8.9321f, 16.125f, 9.0032f, 15.8352f, 9.1453f)
                curveTo(15.548f, 9.2848f, 15.3211f, 9.4776f, 15.1543f, 9.7237f)
                curveTo(15.0787f, 9.8352f, 15.0203f, 9.954f, 14.9789f, 10.0801f)
                curveTo(14.8936f, 10.3405f, 15.1263f, 10.5686f, 15.4004f, 10.5686f)
                horizontalLineTo(15.4223f)
                curveTo(15.6843f, 10.5686f, 15.8766f, 10.3369f, 16.0197f, 10.1174f)
                curveTo(16.1018f, 9.9889f, 16.2125f, 9.8905f, 16.3519f, 9.8221f)
                curveTo(16.4941f, 9.751f, 16.6527f, 9.7155f, 16.8277f, 9.7155f)
                curveTo(17.0355f, 9.7155f, 17.2064f, 9.7524f, 17.3404f, 9.8262f)
                curveTo(17.4771f, 9.9f, 17.5783f, 10.0053f, 17.6439f, 10.142f)
                curveTo(17.7123f, 10.276f, 17.7465f, 10.4373f, 17.7465f, 10.626f)
                curveTo(17.7465f, 10.8065f, 17.7096f, 10.9664f, 17.6357f, 11.1059f)
                curveTo(17.5619f, 11.2453f, 17.4484f, 11.3547f, 17.2953f, 11.434f)
                curveTo(17.1449f, 11.5133f, 16.9549f, 11.553f, 16.7252f, 11.553f)
                horizontalLineTo(16.4094f)
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
                moveTo(2.0f, 8.4f)
                curveTo(2.0f, 5.97f, 3.9699f, 4.0f, 6.4f, 4.0f)
                horizontalLineTo(17.6f)
                curveTo(20.0301f, 4.0f, 22.0f, 5.97f, 22.0f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(22.0f, 18.0301f, 20.0301f, 20.0f, 17.6f, 20.0f)
                horizontalLineTo(6.4f)
                curveTo(3.9699f, 20.0f, 2.0f, 18.0301f, 2.0f, 15.6f)
                verticalLineTo(8.4f)
                close()
                moveTo(6.4f, 6.0f)
                horizontalLineTo(17.6f)
                curveTo(18.9255f, 6.0f, 20.0f, 7.0745f, 20.0f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(20.0f, 16.9255f, 18.9255f, 18.0f, 17.6f, 18.0f)
                horizontalLineTo(6.4f)
                curveTo(5.0745f, 18.0f, 4.0f, 16.9255f, 4.0f, 15.6f)
                verticalLineTo(8.4f)
                curveTo(4.0f, 7.0745f, 5.0745f, 6.0f, 6.4f, 6.0f)
                close()
            }
        }.build()
        return pinCodeRectangle!!
    }

private var pinCodeRectangle: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.PinCodeRectangle,
                contentDescription = ""
            )
        }
    }
}