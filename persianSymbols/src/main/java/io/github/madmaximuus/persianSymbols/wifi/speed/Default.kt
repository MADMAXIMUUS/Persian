package io.github.madmaximuus.persianSymbols.wifi.speed

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

val PersianSymbols.Default.WifiSpeed: ImageVector
    get() {
        if (wifiSpeed != null) {
            return wifiSpeed!!
        }
        wifiSpeed = Builder(
            name = "wifi-speed-default",
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
                moveTo(15.9617f, 15.1728f)
                curveTo(15.8747f, 15.2583f, 15.776f, 15.3246f, 15.6709f, 15.3718f)
                curveTo(15.7794f, 14.8896f, 15.896f, 14.3645f, 16.0187f, 13.8067f)
                curveTo(16.3604f, 14.2026f, 16.3401f, 14.8012f, 15.9617f, 15.1728f)
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
                moveTo(13.6046f, 8.1692f)
                curveTo(13.2668f, 8.8061f, 12.9342f, 9.4347f, 12.613f, 10.0435f)
                curveTo(12.3477f, 10.0156f, 12.0784f, 10.0013f, 11.8059f, 10.0013f)
                curveTo(9.656f, 10.0013f, 7.7071f, 10.89f, 6.2909f, 12.3366f)
                curveTo(5.9046f, 12.7313f, 5.2715f, 12.738f, 4.8768f, 12.3516f)
                curveTo(4.4822f, 11.9653f, 4.4754f, 11.3322f, 4.8618f, 10.9375f)
                curveTo(6.6341f, 9.1271f, 9.0902f, 8.0013f, 11.8059f, 8.0013f)
                curveTo(12.4204f, 8.0013f, 13.0216f, 8.059f, 13.6046f, 8.1692f)
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
                moveTo(7.6281f, 13.768f)
                curveTo(8.6433f, 12.7299f, 10.0356f, 12.064f, 11.5821f, 12.0052f)
                curveTo(11.1412f, 12.848f, 10.7432f, 13.6148f, 10.4103f, 14.2652f)
                curveTo(9.9f, 14.4664f, 9.4406f, 14.7752f, 9.0581f, 15.1664f)
                curveTo(8.6719f, 15.5612f, 8.0388f, 15.5683f, 7.6439f, 15.1822f)
                curveTo(7.2491f, 14.796f, 7.242f, 14.1629f, 7.6281f, 13.768f)
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
                moveTo(11.8058f, 6.0018f)
                curveTo(12.7603f, 6.0018f, 13.6884f, 6.1185f, 14.5771f, 6.3388f)
                curveTo(14.9013f, 5.7297f, 15.225f, 5.1226f, 15.5428f, 4.5272f)
                curveTo(14.3549f, 4.1851f, 13.1014f, 4.0018f, 11.8058f, 4.0018f)
                curveTo(8.0089f, 4.0018f, 4.5739f, 5.5753f, 2.0931f, 8.1094f)
                curveTo(1.7067f, 8.504f, 1.7134f, 9.1372f, 2.1081f, 9.5235f)
                curveTo(2.5027f, 9.9099f, 3.1358f, 9.9032f, 3.5222f, 9.5085f)
                curveTo(5.647f, 7.3382f, 8.5747f, 6.0018f, 11.8058f, 6.0018f)
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
                moveTo(16.4983f, 11.6055f)
                curveTo(16.6466f, 10.9192f, 16.7992f, 10.2086f, 16.9534f, 9.4871f)
                curveTo(17.6077f, 9.8988f, 18.2105f, 10.3864f, 18.75f, 10.9375f)
                curveTo(19.1363f, 11.3322f, 19.1296f, 11.9653f, 18.735f, 12.3516f)
                curveTo(18.3403f, 12.738f, 17.7072f, 12.7313f, 17.3208f, 12.3366f)
                curveTo(17.0636f, 12.0738f, 16.7887f, 11.8294f, 16.4983f, 11.6055f)
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
                moveTo(17.8181f, 5.4131f)
                curveTo(17.677f, 6.0818f, 17.533f, 6.7631f, 17.3881f, 7.446f)
                curveTo(18.3838f, 7.9988f, 19.293f, 8.6951f, 20.0894f, 9.5086f)
                curveTo(20.4758f, 9.9033f, 21.1089f, 9.91f, 21.5036f, 9.5237f)
                curveTo(21.8982f, 9.1373f, 21.905f, 8.5042f, 21.5186f, 8.1095f)
                curveTo(20.4471f, 7.015f, 19.1977f, 6.0998f, 17.8181f, 5.4131f)
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
                moveTo(10.8371f, 19.7384f)
                curveTo(10.9588f, 19.8024f, 11.0862f, 19.8594f, 11.219f, 19.9086f)
                curveTo(11.0849f, 19.8657f, 10.957f, 19.8083f, 10.8371f, 19.7384f)
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
                moveTo(11.323f, 19.8986f)
                curveTo(12.3609f, 20.2763f, 13.5086f, 19.7412f, 13.8864f, 18.7032f)
                curveTo(14.1909f, 17.8666f, 16.3388f, 8.1663f, 17.1606f, 4.4346f)
                curveTo(17.2108f, 4.2068f, 16.8992f, 4.0934f, 16.7912f, 4.3001f)
                curveTo(15.022f, 7.6871f, 10.4321f, 16.4985f, 10.1276f, 17.3351f)
                curveTo(9.7499f, 18.3731f, 10.285f, 19.5208f, 11.323f, 19.8986f)
                close()
            }
        }.build()
        return wifiSpeed!!
    }

private var wifiSpeed: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.WifiSpeed,
                contentDescription = ""
            )
        }
    }
}