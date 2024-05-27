package io.github.madmaximuus.persianSymbols.envelope.check

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

val PersianSymbols.Filled.EnvelopeCheck: ImageVector
    get() {
        if (envelopeCheck != null) {
            return envelopeCheck!!
        }
        envelopeCheck = Builder(
            name = "envelope-check-filled",
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
                horizontalLineTo(12.3414f)
                curveTo(12.1203f, 19.3744f, 12.0f, 18.7013f, 12.0f, 18.0f)
                curveTo(12.0f, 14.6863f, 14.6863f, 12.0f, 18.0f, 12.0f)
                curveTo(19.5367f, 12.0f, 20.9385f, 12.5777f, 22.0f, 13.5278f)
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
                pathFillType = NonZero
            ) {
                moveTo(19.9685f, 16.4143f)
                curveTo(20.292f, 16.6731f, 20.3444f, 17.1451f, 20.0857f, 17.4685f)
                lineTo(18.0857f, 19.9685f)
                curveTo(17.9524f, 20.1351f, 17.7545f, 20.2371f, 17.5415f, 20.2489f)
                curveTo(17.3285f, 20.2607f, 17.1205f, 20.1812f, 16.9697f, 20.0303f)
                lineTo(15.9697f, 19.0303f)
                curveTo(15.6768f, 18.7374f, 15.6768f, 18.2626f, 15.9697f, 17.9697f)
                curveTo(16.2626f, 17.6768f, 16.7374f, 17.6768f, 17.0303f, 17.9697f)
                lineTo(17.4378f, 18.3772f)
                lineTo(18.9143f, 16.5315f)
                curveTo(19.1731f, 16.208f, 19.6451f, 16.1556f, 19.9685f, 16.4143f)
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
                moveTo(13.25f, 18.0f)
                curveTo(13.25f, 15.3766f, 15.3766f, 13.25f, 18.0f, 13.25f)
                curveTo(20.6234f, 13.25f, 22.75f, 15.3766f, 22.75f, 18.0f)
                curveTo(22.75f, 20.6234f, 20.6234f, 22.75f, 18.0f, 22.75f)
                curveTo(15.3766f, 22.75f, 13.25f, 20.6234f, 13.25f, 18.0f)
                close()
                moveTo(18.0f, 14.75f)
                curveTo(16.2051f, 14.75f, 14.75f, 16.2051f, 14.75f, 18.0f)
                curveTo(14.75f, 19.7949f, 16.2051f, 21.25f, 18.0f, 21.25f)
                curveTo(19.7949f, 21.25f, 21.25f, 19.7949f, 21.25f, 18.0f)
                curveTo(21.25f, 16.2051f, 19.7949f, 14.75f, 18.0f, 14.75f)
                close()
            }
        }.build()
        return envelopeCheck!!
    }

private var envelopeCheck: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.EnvelopeCheck,
                contentDescription = ""
            )
        }
    }
}