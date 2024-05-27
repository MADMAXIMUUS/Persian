package io.github.madmaximuus.persianSymbols.envelope.base

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

val PersianSymbols.Filled.Envelope: ImageVector
    get() {
        if (enevlope != null) {
            return enevlope!!
        }
        enevlope = Builder(
            name = "envelope-filled",
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
                horizontalLineTo(17.6f)
                curveTo(20.0301f, 20.0f, 22.0f, 18.0301f, 22.0f, 15.6f)
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
        }.build()
        return enevlope!!
    }

private var enevlope: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.Envelope,
                contentDescription = ""
            )
        }
    }
}