package io.github.madmaximuus.persianSymbols.pinCode.rectangle

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

val PersianSymbols.Filled.PinCodeRectangle: ImageVector
    get() {
        if (pinCodeRectangle != null) {
            return pinCodeRectangle!!
        }
        pinCodeRectangle = Builder(
            name = "pin-code-rectangle-filled",
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
                moveTo(13.7617f, 14.5922f)
                curveTo(13.7617f, 14.3747f, 13.5854f, 14.1984f, 13.368f, 14.1984f)
                horizontalLineTo(11.1246f)
                curveTo(11.0788f, 14.1984f, 11.0548f, 14.1441f, 11.0855f, 14.1102f)
                lineTo(12.2975f, 12.7752f)
                curveTo(12.4779f, 12.5892f, 12.6434f, 12.406f, 12.7938f, 12.2256f)
                curveTo(12.9441f, 12.0424f, 13.074f, 11.8605f, 13.1834f, 11.6801f)
                curveTo(13.2955f, 11.4969f, 13.3816f, 11.3136f, 13.4418f, 11.1304f)
                curveTo(13.502f, 10.9472f, 13.532f, 10.7627f, 13.532f, 10.5767f)
                curveTo(13.532f, 10.2404f, 13.4582f, 9.9492f, 13.3105f, 9.7031f)
                curveTo(13.1656f, 9.457f, 12.9537f, 9.267f, 12.6748f, 9.133f)
                curveTo(12.3959f, 8.999f, 12.0568f, 8.932f, 11.6576f, 8.932f)
                curveTo(11.2338f, 8.932f, 10.8715f, 9.0181f, 10.5707f, 9.1904f)
                curveTo(10.2699f, 9.3599f, 10.0402f, 9.5896f, 9.8816f, 9.8795f)
                curveTo(9.8009f, 10.0256f, 9.7407f, 10.1796f, 9.7011f, 10.3413f)
                curveTo(9.6361f, 10.6064f, 9.865f, 10.831f, 10.138f, 10.831f)
                curveTo(10.411f, 10.831f, 10.6181f, 10.6023f, 10.7108f, 10.3456f)
                curveTo(10.7217f, 10.3153f, 10.7338f, 10.2857f, 10.7471f, 10.2568f)
                curveTo(10.8236f, 10.0873f, 10.9371f, 9.9547f, 11.0875f, 9.859f)
                curveTo(11.2379f, 9.7633f, 11.4238f, 9.7154f, 11.6453f, 9.7154f)
                curveTo(11.8367f, 9.7154f, 11.9994f, 9.7578f, 12.1334f, 9.8426f)
                curveTo(12.2674f, 9.9246f, 12.3686f, 10.0381f, 12.4369f, 10.183f)
                curveTo(12.508f, 10.3252f, 12.5436f, 10.4906f, 12.5436f, 10.6793f)
                curveTo(12.5436f, 10.8133f, 12.5176f, 10.9513f, 12.4656f, 11.0935f)
                curveTo(12.4164f, 11.233f, 12.3303f, 11.3902f, 12.2072f, 11.5652f)
                curveTo(12.0842f, 11.7402f, 11.916f, 11.948f, 11.7027f, 12.1886f)
                lineTo(9.8867f, 14.1694f)
                curveTo(9.8043f, 14.2593f, 9.7586f, 14.3768f, 9.7586f, 14.4987f)
                curveTo(9.7586f, 14.7678f, 9.9767f, 14.9859f, 10.2458f, 14.9859f)
                horizontalLineTo(13.368f)
                curveTo(13.5854f, 14.9859f, 13.7617f, 14.8096f, 13.7617f, 14.5922f)
                close()
                moveTo(7.6232f, 9.0814f)
                curveTo(7.6232f, 9.0329f, 7.5839f, 8.9935f, 7.5354f, 8.9935f)
                curveTo(7.5148f, 8.9935f, 7.4944f, 8.9971f, 7.475f, 9.0042f)
                lineTo(5.4264f, 9.7531f)
                curveTo(5.2727f, 9.8093f, 5.1705f, 9.9555f, 5.1705f, 10.1192f)
                curveTo(5.1705f, 10.3861f, 5.4326f, 10.574f, 5.6854f, 10.4883f)
                lineTo(6.3907f, 10.2493f)
                curveTo(6.5105f, 10.2087f, 6.6347f, 10.2978f, 6.6347f, 10.4243f)
                verticalLineTo(14.4917f)
                curveTo(6.6347f, 14.7646f, 6.856f, 14.9859f, 7.129f, 14.9859f)
                curveTo(7.4019f, 14.9859f, 7.6232f, 14.7646f, 7.6232f, 14.4917f)
                verticalLineTo(9.0814f)
                close()
                moveTo(16.1346f, 11.8277f)
                curveTo(16.1346f, 11.6759f, 16.2576f, 11.5529f, 16.4094f, 11.5529f)
                horizontalLineTo(16.7252f)
                curveTo(16.9549f, 11.5529f, 17.1449f, 11.5133f, 17.2953f, 11.434f)
                curveTo(17.4484f, 11.3547f, 17.5619f, 11.2453f, 17.6357f, 11.1058f)
                curveTo(17.7096f, 10.9664f, 17.7465f, 10.8064f, 17.7465f, 10.626f)
                curveTo(17.7465f, 10.4373f, 17.7123f, 10.276f, 17.644f, 10.142f)
                curveTo(17.5783f, 10.0052f, 17.4772f, 9.9f, 17.3404f, 9.8261f)
                curveTo(17.2065f, 9.7523f, 17.0356f, 9.7154f, 16.8277f, 9.7154f)
                curveTo(16.6527f, 9.7154f, 16.4941f, 9.7509f, 16.352f, 9.8221f)
                curveTo(16.2125f, 9.8904f, 16.1018f, 9.9888f, 16.0197f, 10.1174f)
                curveTo(15.8766f, 10.3368f, 15.6843f, 10.5685f, 15.4223f, 10.5685f)
                horizontalLineTo(15.4004f)
                curveTo(15.1263f, 10.5685f, 14.8936f, 10.3405f, 14.9789f, 10.08f)
                curveTo(15.0203f, 9.9539f, 15.0787f, 9.8351f, 15.1543f, 9.7236f)
                curveTo(15.3211f, 9.4775f, 15.5481f, 9.2847f, 15.8352f, 9.1453f)
                curveTo(16.125f, 9.0031f, 16.4504f, 8.932f, 16.8113f, 8.932f)
                curveTo(17.1969f, 8.932f, 17.5332f, 8.9963f, 17.8203f, 9.1248f)
                curveTo(18.1102f, 9.2506f, 18.3357f, 9.4392f, 18.4971f, 9.6908f)
                curveTo(18.6584f, 9.9424f, 18.7391f, 10.2541f, 18.7391f, 10.626f)
                curveTo(18.7391f, 10.7955f, 18.6994f, 10.9677f, 18.6201f, 11.1427f)
                curveTo(18.5408f, 11.3177f, 18.4232f, 11.4777f, 18.2674f, 11.6226f)
                curveTo(18.1403f, 11.7386f, 17.9877f, 11.8373f, 17.8096f, 11.9187f)
                curveTo(18.0409f, 11.9996f, 18.2304f, 12.1087f, 18.3781f, 12.2461f)
                curveTo(18.534f, 12.3883f, 18.6475f, 12.551f, 18.7186f, 12.7342f)
                curveTo(18.7924f, 12.9174f, 18.8293f, 13.1115f, 18.8293f, 13.3166f)
                curveTo(18.8293f, 13.5955f, 18.7787f, 13.8443f, 18.6775f, 14.0631f)
                curveTo(18.5791f, 14.2791f, 18.4383f, 14.4623f, 18.2551f, 14.6127f)
                curveTo(18.0719f, 14.7631f, 17.8572f, 14.8765f, 17.6111f, 14.9531f)
                curveTo(17.3678f, 15.0297f, 17.1025f, 15.0679f, 16.8154f, 15.0679f)
                curveTo(16.5584f, 15.0679f, 16.3123f, 15.0324f, 16.0772f, 14.9613f)
                curveTo(15.842f, 14.8902f, 15.6315f, 14.7849f, 15.4455f, 14.6455f)
                curveTo(15.2596f, 14.5033f, 15.1119f, 14.3269f, 15.0025f, 14.1164f)
                curveTo(14.9632f, 14.0376f, 14.9311f, 13.9544f, 14.9062f, 13.8667f)
                curveTo(14.8318f, 13.604f, 15.0642f, 13.3781f, 15.3371f, 13.3781f)
                curveTo(15.6097f, 13.3781f, 15.8139f, 13.616f, 15.9541f, 13.8498f)
                curveTo(16.0389f, 13.9838f, 16.1565f, 14.089f, 16.3068f, 14.1656f)
                curveTo(16.46f, 14.2422f, 16.635f, 14.2804f, 16.8318f, 14.2804f)
                curveTo(17.0397f, 14.2804f, 17.2188f, 14.2435f, 17.3691f, 14.1697f)
                curveTo(17.5195f, 14.0959f, 17.6344f, 13.9865f, 17.7137f, 13.8416f)
                curveTo(17.7957f, 13.6967f, 17.8367f, 13.5217f, 17.8367f, 13.3166f)
                curveTo(17.8367f, 13.0842f, 17.7916f, 12.8955f, 17.7014f, 12.7506f)
                curveTo(17.6111f, 12.6056f, 17.4826f, 12.499f, 17.3158f, 12.4306f)
                curveTo(17.149f, 12.3595f, 16.9522f, 12.324f, 16.7252f, 12.324f)
                horizontalLineTo(16.4053f)
                curveTo(16.2558f, 12.324f, 16.1346f, 12.2028f, 16.1346f, 12.0533f)
                curveTo(16.1346f, 12.0132f, 16.1433f, 11.9752f, 16.1589f, 11.941f)
                curveTo(16.1433f, 11.9064f, 16.1346f, 11.8681f, 16.1346f, 11.8277f)
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
                imageVector = PersianSymbols.Filled.PinCodeRectangle,
                contentDescription = ""
            )
        }
    }
}