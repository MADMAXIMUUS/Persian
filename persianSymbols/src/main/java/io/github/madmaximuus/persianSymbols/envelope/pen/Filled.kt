package io.github.madmaximuus.persianSymbols.envelope.pen

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

val PersianSymbols.Filled.EnvelopePen: ImageVector
    get() {
        if (envelopePen != null) {
            return envelopePen!!
        }
        envelopePen = Builder(
            name = "envelope-pen-filled",
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
                moveTo(2.3248f, 6.7378f)
                curveTo(2.1154f, 7.2506f, 2.0f, 7.8119f, 2.0f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(2.0f, 18.0301f, 3.9699f, 20.0f, 6.4f, 20.0f)
                horizontalLineTo(11.6768f)
                lineTo(12.115f, 17.8091f)
                curveTo(12.2215f, 17.2767f, 12.4832f, 16.7878f, 12.8671f, 16.4039f)
                lineTo(16.8956f, 12.3753f)
                curveTo(17.9696f, 11.3014f, 19.7108f, 11.3014f, 20.7847f, 12.3753f)
                lineTo(22.0f, 13.5906f)
                verticalLineTo(8.4f)
                curveTo(22.0f, 7.8119f, 21.8846f, 7.2506f, 21.6752f, 6.7378f)
                curveTo(21.6381f, 6.7717f, 21.5979f, 6.8033f, 21.5547f, 6.832f)
                lineTo(13.6641f, 12.0925f)
                curveTo(12.6564f, 12.7642f, 11.3436f, 12.7642f, 10.3359f, 12.0925f)
                lineTo(2.4453f, 6.832f)
                curveTo(2.4021f, 6.8033f, 2.3619f, 6.7717f, 2.3248f, 6.7378f)
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
                moveTo(3.4701f, 5.1173f)
                curveTo(3.4988f, 5.1326f, 3.5271f, 5.1495f, 3.5547f, 5.168f)
                lineTo(11.4453f, 10.4283f)
                curveTo(11.7812f, 10.6523f, 12.2188f, 10.6523f, 12.5547f, 10.4283f)
                lineTo(20.4453f, 5.168f)
                curveTo(20.4729f, 5.1495f, 20.5012f, 5.1326f, 20.5299f, 5.1173f)
                curveTo(19.7519f, 4.4224f, 18.7253f, 4.0f, 17.6f, 4.0f)
                horizontalLineTo(6.4f)
                curveTo(5.2747f, 4.0f, 4.2481f, 4.4224f, 3.4701f, 5.1173f)
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
                moveTo(17.6027f, 13.0825f)
                curveTo(18.2862f, 12.3991f, 19.3942f, 12.3991f, 20.0776f, 13.0825f)
                lineTo(21.4918f, 14.4967f)
                curveTo(22.1752f, 15.1801f, 22.1752f, 16.2882f, 21.4918f, 16.9716f)
                lineTo(17.4633f, 21.0001f)
                curveTo(17.219f, 21.2444f, 16.9078f, 21.411f, 16.569f, 21.4787f)
                lineTo(14.0658f, 21.9794f)
                curveTo(13.1912f, 22.1543f, 12.42f, 21.3831f, 12.595f, 20.5085f)
                lineTo(13.0956f, 18.0053f)
                curveTo(13.1634f, 17.6665f, 13.3299f, 17.3554f, 13.5742f, 17.1111f)
                lineTo(17.6027f, 13.0825f)
                close()
                moveTo(14.6348f, 18.1717f)
                lineTo(17.1938f, 15.6128f)
                lineTo(18.9616f, 17.3805f)
                lineTo(16.4026f, 19.9395f)
                curveTo(16.3677f, 19.9744f, 16.3233f, 19.9982f, 16.2749f, 20.0079f)
                lineTo(14.1394f, 20.4349f)
                lineTo(14.5665f, 18.2995f)
                curveTo(14.5762f, 18.2511f, 14.5999f, 18.2066f, 14.6348f, 18.1717f)
                close()
            }
        }.build()
        return envelopePen!!
    }

private var envelopePen: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.EnvelopePen,
                contentDescription = ""
            )
        }
    }
}