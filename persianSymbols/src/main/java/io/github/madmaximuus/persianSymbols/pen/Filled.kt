package io.github.madmaximuus.persianSymbols.pen

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

val PersianSymbols.Filled.Pen: ImageVector
    get() {
        if (pen != null) {
            return pen!!
        }
        pen = Builder(
            name = "pen-filled",
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
                moveTo(19.0607f, 3.0607f)
                lineTo(21.182f, 5.182f)
                curveTo(21.7678f, 5.7678f, 21.7678f, 6.7175f, 21.182f, 7.3033f)
                lineTo(20.2432f, 8.2421f)
                lineTo(16.0006f, 3.9995f)
                lineTo(16.9394f, 3.0607f)
                curveTo(17.5252f, 2.4749f, 18.4749f, 2.4749f, 19.0607f, 3.0607f)
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
                moveTo(14.5864f, 5.4137f)
                lineTo(3.3339f, 16.6661f)
                curveTo(3.1769f, 16.8231f, 3.0767f, 17.0278f, 3.0489f, 17.248f)
                lineTo(2.6404f, 20.485f)
                curveTo(2.5586f, 21.1329f, 3.1098f, 21.6841f, 3.7577f, 21.6023f)
                lineTo(6.9946f, 21.1938f)
                curveTo(7.2149f, 21.166f, 7.4196f, 21.0657f, 7.5766f, 20.9088f)
                lineTo(18.829f, 9.6563f)
                lineTo(14.5864f, 5.4137f)
                close()
            }
        }.build()
        return pen!!
    }

private var pen: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.Pen,
                contentDescription = ""
            )
        }
    }
}