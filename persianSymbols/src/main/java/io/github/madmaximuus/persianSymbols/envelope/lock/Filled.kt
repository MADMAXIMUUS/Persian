package io.github.madmaximuus.persianSymbols.envelope.lock

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

val PersianSymbols.Filled.EnvelopeLock: ImageVector
    get() {
        if (envelopeLock != null) {
            return envelopeLock!!
        }
        envelopeLock = Builder(
            name = "envelope-lock-filled",
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
                horizontalLineTo(14.2f)
                verticalLineTo(17.5f)
                curveTo(14.2f, 16.639f, 14.673f, 15.8885f, 15.3734f, 15.4943f)
                curveTo(15.4889f, 14.2068f, 16.0931f, 12.5f, 18.485f, 12.5f)
                curveTo(20.9038f, 12.5f, 21.4945f, 14.2454f, 21.6003f, 15.5376f)
                curveTo(21.7423f, 15.6246f, 21.8741f, 15.7266f, 21.9935f, 15.8414f)
                curveTo(21.9978f, 15.7615f, 22.0f, 15.681f, 22.0f, 15.6f)
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
                moveTo(17.1826f, 13.5937f)
                curveTo(17.5464f, 13.3661f, 17.9841f, 13.25f, 18.485f, 13.25f)
                curveTo(18.9859f, 13.25f, 19.4236f, 13.3661f, 19.7874f, 13.5937f)
                curveTo(20.1501f, 13.8206f, 20.394f, 14.1297f, 20.5538f, 14.4448f)
                curveTo(20.8264f, 14.9821f, 20.8729f, 15.5713f, 20.8699f, 15.9569f)
                curveTo(21.5428f, 16.3202f, 22.0f, 17.0317f, 22.0f, 17.8501f)
                verticalLineTo(19.8501f)
                curveTo(22.0f, 21.0375f, 21.0374f, 22.0001f, 19.85f, 22.0001f)
                horizontalLineTo(17.05f)
                curveTo(15.8626f, 22.0001f, 14.9f, 21.0375f, 14.9f, 19.8501f)
                verticalLineTo(17.8501f)
                curveTo(14.9f, 17.0037f, 15.389f, 16.2716f, 16.1f, 15.9208f)
                curveTo(16.1002f, 15.5351f, 16.152f, 14.9656f, 16.4162f, 14.4448f)
                curveTo(16.576f, 14.1297f, 16.8199f, 13.8206f, 17.1826f, 13.5937f)
                close()
                moveTo(17.7539f, 15.1234f)
                curveTo(17.6763f, 15.2764f, 17.6337f, 15.4634f, 17.614f, 15.65f)
                horizontalLineTo(19.356f)
                curveTo(19.3363f, 15.4634f, 19.2937f, 15.2764f, 19.2161f, 15.1234f)
                curveTo(19.1561f, 15.0052f, 19.0829f, 14.9223f, 18.992f, 14.8654f)
                curveTo(18.9022f, 14.8093f, 18.7498f, 14.75f, 18.485f, 14.75f)
                curveTo(18.2202f, 14.75f, 18.0678f, 14.8093f, 17.978f, 14.8654f)
                curveTo(17.8871f, 14.9223f, 17.8139f, 15.0052f, 17.7539f, 15.1234f)
                close()
                moveTo(17.05f, 17.2001f)
                curveTo(16.691f, 17.2001f, 16.4f, 17.4911f, 16.4f, 17.8501f)
                verticalLineTo(19.8501f)
                curveTo(16.4f, 20.2091f, 16.691f, 20.5001f, 17.05f, 20.5001f)
                horizontalLineTo(19.85f)
                curveTo(20.209f, 20.5001f, 20.5f, 20.2091f, 20.5f, 19.8501f)
                verticalLineTo(17.8501f)
                curveTo(20.5f, 17.4911f, 20.209f, 17.2001f, 19.85f, 17.2001f)
                horizontalLineTo(17.05f)
                close()
            }
        }.build()
        return envelopeLock!!
    }

private var envelopeLock: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.EnvelopeLock,
                contentDescription = ""
            )
        }
    }
}