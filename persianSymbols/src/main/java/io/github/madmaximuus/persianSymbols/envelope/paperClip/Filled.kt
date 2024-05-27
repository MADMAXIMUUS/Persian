package io.github.madmaximuus.persianSymbols.envelope.paperClip

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

val PersianSymbols.Filled.EnvelopePaperClip: ImageVector
    get() {
        if (envelopePaperClip != null) {
            return envelopePaperClip!!
        }
        envelopePaperClip = Builder(
            name = "envelope-paper-clip-filled",
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
                curveTo(2.0f, 7.8119f, 2.1154f, 7.2506f, 2.3248f, 6.7378f)
                curveTo(2.3619f, 6.7717f, 2.4021f, 6.8033f, 2.4453f, 6.832f)
                lineTo(10.3359f, 12.0925f)
                curveTo(11.3436f, 12.7642f, 12.6564f, 12.7642f, 13.6641f, 12.0925f)
                lineTo(21.5547f, 6.832f)
                curveTo(21.5979f, 6.8033f, 21.6381f, 6.7717f, 21.6752f, 6.7378f)
                curveTo(21.8846f, 7.2506f, 22.0f, 7.8119f, 22.0f, 8.4f)
                verticalLineTo(13.663f)
                curveTo(21.761f, 13.4477f, 21.4523f, 13.3081f, 21.1119f, 13.2822f)
                curveTo(20.9429f, 12.8031f, 20.6554f, 12.4002f, 20.2743f, 12.0954f)
                curveTo(19.7035f, 11.6387f, 19.0472f, 11.5f, 18.5721f, 11.5f)
                curveTo(18.0992f, 11.5f, 17.4491f, 11.6427f, 16.8832f, 12.0908f)
                curveTo(16.2509f, 12.5916f, 15.86f, 13.3686f, 15.86f, 14.3333f)
                verticalLineTo(18.7778f)
                lineTo(15.8599f, 18.8207f)
                curveTo(15.8592f, 19.0392f, 15.8578f, 19.4902f, 15.9691f, 20.0f)
                horizontalLineTo(6.4f)
                curveTo(3.9699f, 20.0f, 2.0f, 18.0301f, 2.0f, 15.6f)
                verticalLineTo(8.4f)
                close()
                moveTo(3.5547f, 5.168f)
                curveTo(3.5271f, 5.1495f, 3.4988f, 5.1326f, 3.4701f, 5.1173f)
                curveTo(4.2481f, 4.4224f, 5.2747f, 4.0f, 6.4f, 4.0f)
                horizontalLineTo(17.6f)
                curveTo(18.7253f, 4.0f, 19.7519f, 4.4224f, 20.5299f, 5.1173f)
                curveTo(20.5012f, 5.1326f, 20.4729f, 5.1495f, 20.4453f, 5.168f)
                lineTo(12.5547f, 10.4283f)
                curveTo(12.2188f, 10.6523f, 11.7812f, 10.6523f, 11.4453f, 10.4283f)
                lineTo(3.5547f, 5.168f)
                close()
                moveTo(17.5041f, 12.8747f)
                curveTo(17.8611f, 12.592f, 18.2798f, 12.5f, 18.5721f, 12.5f)
                curveTo(18.8719f, 12.5f, 19.2927f, 12.5907f, 19.6496f, 12.8762f)
                curveTo(20.0278f, 13.1788f, 20.2842f, 13.6608f, 20.2842f, 14.3333f)
                verticalLineTo(18.7778f)
                curveTo(20.2842f, 18.7838f, 20.2845f, 18.7934f, 20.2849f, 18.806f)
                curveTo(20.2881f, 18.9073f, 20.2976f, 19.2054f, 20.2062f, 19.4692f)
                curveTo(20.1492f, 19.6338f, 20.045f, 19.8187f, 19.8561f, 19.9597f)
                curveTo(19.6647f, 20.1025f, 19.4316f, 20.1667f, 19.1782f, 20.1667f)
                curveTo(18.9289f, 20.1667f, 18.7044f, 20.0958f, 18.5217f, 19.9544f)
                curveTo(18.3452f, 19.8177f, 18.2424f, 19.6421f, 18.182f, 19.4871f)
                curveTo(18.0715f, 19.2035f, 18.0719f, 18.9021f, 18.0721f, 18.7893f)
                curveTo(18.0721f, 18.7852f, 18.0721f, 18.7814f, 18.0721f, 18.7778f)
                verticalLineTo(14.7778f)
                curveTo(18.0721f, 14.5016f, 18.296f, 14.2778f, 18.5721f, 14.2778f)
                curveTo(18.8483f, 14.2778f, 19.0721f, 14.5016f, 19.0721f, 14.7778f)
                verticalLineTo(18.7778f)
                curveTo(19.0721f, 18.8329f, 19.0724f, 18.8939f, 19.0791f, 18.9602f)
                curveTo(19.0859f, 19.0278f, 19.098f, 19.0836f, 19.1138f, 19.124f)
                curveTo(19.1224f, 19.1461f, 19.1296f, 19.1574f, 19.1332f, 19.1622f)
                curveTo(19.1399f, 19.1641f, 19.1538f, 19.1667f, 19.1782f, 19.1667f)
                curveTo(19.2197f, 19.1667f, 19.2432f, 19.1619f, 19.2546f, 19.1585f)
                curveTo(19.2564f, 19.1548f, 19.2587f, 19.1495f, 19.2613f, 19.1419f)
                curveTo(19.2728f, 19.1085f, 19.2816f, 19.0578f, 19.2847f, 18.988f)
                curveTo(19.287f, 18.9373f, 19.2863f, 18.9035f, 19.2854f, 18.8633f)
                curveTo(19.2848f, 18.8389f, 19.2842f, 18.8121f, 19.2842f, 18.7778f)
                verticalLineTo(14.3333f)
                curveTo(19.2842f, 13.9392f, 19.1467f, 13.7545f, 19.0249f, 13.6571f)
                curveTo(18.8819f, 13.5427f, 18.6966f, 13.5f, 18.5721f, 13.5f)
                curveTo(18.4604f, 13.5f, 18.2731f, 13.5413f, 18.125f, 13.6586f)
                curveTo(17.9991f, 13.7584f, 17.86f, 13.9438f, 17.86f, 14.3333f)
                verticalLineTo(18.7778f)
                curveTo(17.86f, 19.1255f, 17.8672f, 19.5676f, 18.0378f, 19.9221f)
                curveTo(18.117f, 20.0866f, 18.2276f, 20.222f, 18.3878f, 20.3199f)
                curveTo(18.5495f, 20.4187f, 18.7957f, 20.5f, 19.1782f, 20.5f)
                curveTo(19.5479f, 20.5f, 19.7874f, 20.4109f, 19.9484f, 20.3016f)
                curveTo(20.1118f, 20.1907f, 20.2292f, 20.035f, 20.3139f, 19.8487f)
                curveTo(20.4916f, 19.4578f, 20.4964f, 19.0027f, 20.4964f, 18.7778f)
                verticalLineTo(14.7784f)
                lineTo(20.9964f, 14.7778f)
                lineTo(21.4964f, 14.7778f)
                verticalLineTo(18.7778f)
                curveTo(21.4964f, 18.7814f, 21.4964f, 18.785f, 21.4964f, 18.7888f)
                curveTo(21.4964f, 19.0187f, 21.4967f, 19.6632f, 21.2243f, 20.2625f)
                curveTo(21.0817f, 20.5761f, 20.8582f, 20.8926f, 20.5102f, 21.1289f)
                curveTo(20.1598f, 21.3668f, 19.7176f, 21.5f, 19.1782f, 21.5f)
                curveTo(18.6516f, 21.5f, 18.216f, 21.3868f, 17.8663f, 21.1732f)
                curveTo(17.5152f, 20.9586f, 17.2848f, 20.6634f, 17.1367f, 20.3557f)
                curveTo(16.8595f, 19.7797f, 16.8598f, 19.1283f, 16.86f, 18.8009f)
                curveTo(16.86f, 18.793f, 16.86f, 18.7853f, 16.86f, 18.7778f)
                verticalLineTo(14.3333f)
                curveTo(16.86f, 13.6562f, 17.125f, 13.175f, 17.5041f, 12.8747f)
                close()
                moveTo(20.9964f, 14.7778f)
                lineTo(21.4964f, 14.7778f)
                curveTo(21.4964f, 14.5017f, 21.2725f, 14.2778f, 20.9964f, 14.2778f)
                curveTo(20.7202f, 14.2778f, 20.4964f, 14.5023f, 20.4964f, 14.7784f)
                lineTo(20.9964f, 14.7778f)
                close()
                moveTo(19.2508f, 19.1651f)
                curveTo(19.2508f, 19.1651f, 19.2511f, 19.1647f, 19.2515f, 19.1642f)
                lineTo(19.2508f, 19.1651f)
                close()
            }
        }.build()
        return envelopePaperClip!!
    }

private var envelopePaperClip: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.EnvelopePaperClip,
                contentDescription = ""
            )
        }
    }
}