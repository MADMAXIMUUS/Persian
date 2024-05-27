package io.github.madmaximuus.persianSymbols.envelope.dot

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

val PersianSymbols.Filled.EnvelopeDot: ImageVector
    get() {
        if (envelopeDot != null) {
            return envelopeDot!!
        }
        envelopeDot = Builder(
            name = "envelope-dot-filled",
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
                moveTo(19.0f, 7.0f)
                curveTo(20.1046f, 7.0f, 21.0f, 6.1046f, 21.0f, 5.0f)
                curveTo(21.0f, 3.8954f, 20.1046f, 3.0f, 19.0f, 3.0f)
                curveTo(17.8954f, 3.0f, 17.0f, 3.8954f, 17.0f, 5.0f)
                curveTo(17.0f, 6.1046f, 17.8954f, 7.0f, 19.0f, 7.0f)
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
                moveTo(6.4f, 4.0f)
                horizontalLineTo(16.1707f)
                curveTo(16.0602f, 4.3128f, 16.0f, 4.6494f, 16.0f, 5.0f)
                curveTo(16.0f, 5.9598f, 16.4507f, 6.8143f, 17.1521f, 7.3635f)
                lineTo(12.5547f, 10.4283f)
                curveTo(12.2188f, 10.6523f, 11.7812f, 10.6523f, 11.4453f, 10.4283f)
                lineTo(3.5547f, 5.168f)
                curveTo(3.5271f, 5.1495f, 3.4988f, 5.1326f, 3.4701f, 5.1173f)
                curveTo(4.2481f, 4.4224f, 5.2747f, 4.0f, 6.4f, 4.0f)
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
                moveTo(13.6641f, 12.0925f)
                lineTo(20.1375f, 7.7768f)
                curveTo(20.509f, 7.6245f, 20.8431f, 7.3998f, 21.1224f, 7.1203f)
                lineTo(21.5547f, 6.832f)
                curveTo(21.5979f, 6.8033f, 21.6381f, 6.7717f, 21.6752f, 6.7378f)
                curveTo(21.8846f, 7.2506f, 22.0f, 7.8119f, 22.0f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(22.0f, 18.0301f, 20.0301f, 20.0f, 17.6f, 20.0f)
                horizontalLineTo(6.4f)
                curveTo(3.9699f, 20.0f, 2.0f, 18.0301f, 2.0f, 15.6f)
                verticalLineTo(8.4f)
                curveTo(2.0f, 7.8119f, 2.1154f, 7.2506f, 2.3248f, 6.7378f)
                curveTo(2.3619f, 6.7717f, 2.4021f, 6.8033f, 2.4453f, 6.832f)
                lineTo(10.3359f, 12.0925f)
                curveTo(11.3436f, 12.7642f, 12.6564f, 12.7642f, 13.6641f, 12.0925f)
                close()
            }
        }.build()
        return envelopeDot!!
    }

private var envelopeDot: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.EnvelopeDot,
                contentDescription = ""
            )
        }
    }
}