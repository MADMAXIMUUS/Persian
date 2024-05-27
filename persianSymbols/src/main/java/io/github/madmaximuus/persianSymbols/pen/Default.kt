package io.github.madmaximuus.persianSymbols.pen

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

val PersianSymbols.Default.Pen: ImageVector
    get() {
        if (pen != null) {
            return pen!!
        }
        pen = Builder(
            name = "pen-default",
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
                moveTo(19.466f, 3.1196f)
                curveTo(18.6849f, 2.3386f, 17.4186f, 2.3386f, 16.6376f, 3.1196f)
                lineTo(3.7773f, 15.9798f)
                curveTo(3.5589f, 16.1983f, 3.4003f, 16.4694f, 3.3169f, 16.7669f)
                lineTo(2.2723f, 20.4947f)
                curveTo(2.1748f, 20.8427f, 2.2726f, 21.2162f, 2.5282f, 21.4717f)
                curveTo(2.7836f, 21.7272f, 3.1571f, 21.825f, 3.5051f, 21.7275f)
                lineTo(7.2329f, 20.6829f)
                curveTo(7.5304f, 20.5995f, 7.8015f, 20.441f, 8.02f, 20.2225f)
                lineTo(20.8802f, 7.3622f)
                curveTo(21.6613f, 6.5812f, 21.6613f, 5.3149f, 20.8802f, 4.5338f)
                lineTo(19.466f, 3.1196f)
                close()
                moveTo(16.9999f, 5.5857f)
                lineTo(18.0518f, 4.5338f)
                lineTo(19.466f, 5.948f)
                lineTo(18.4141f, 6.9999f)
                lineTo(16.9999f, 5.5857f)
                close()
                moveTo(15.5857f, 6.9999f)
                lineTo(5.2286f, 17.357f)
                lineTo(4.6781f, 19.3218f)
                lineTo(6.6428f, 18.7712f)
                lineTo(16.9999f, 8.4141f)
                lineTo(15.5857f, 6.9999f)
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
                imageVector = PersianSymbols.Default.Pen,
                contentDescription = ""
            )
        }
    }
}