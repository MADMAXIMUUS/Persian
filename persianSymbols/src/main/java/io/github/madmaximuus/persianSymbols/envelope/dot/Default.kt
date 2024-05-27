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

val PersianSymbols.Default.EnvelopeDot: ImageVector
    get() {
        if (envelopeDot != null) {
            return envelopeDot!!
        }
        envelopeDot = Builder(
            name = "envelope-dot-default",
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
                moveTo(6.5f, 4.0f)
                horizontalLineTo(16.1707f)
                curveTo(16.0602f, 4.3128f, 16.0f, 4.6494f, 16.0f, 5.0f)
                curveTo(16.0f, 5.3506f, 16.0602f, 5.6872f, 16.1707f, 6.0f)
                horizontalLineTo(6.5f)
                curveTo(6.2568f, 6.0f, 6.0217f, 6.0347f, 5.7993f, 6.0995f)
                lineTo(11.4f, 10.3f)
                curveTo(11.7556f, 10.5667f, 12.2444f, 10.5667f, 12.6f, 10.3f)
                lineTo(16.8614f, 7.1039f)
                curveTo(17.4056f, 7.657f, 18.1628f, 8.0f, 19.0f, 8.0f)
                lineTo(13.8f, 11.9f)
                curveTo(12.7333f, 12.7f, 11.2667f, 12.7f, 10.2f, 11.9f)
                lineTo(4.2399f, 7.43f)
                curveTo(4.0861f, 7.7543f, 4.0f, 8.1171f, 4.0f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(4.0f, 16.8807f, 5.1193f, 18.0f, 6.5f, 18.0f)
                horizontalLineTo(17.5f)
                curveTo(18.8807f, 18.0f, 20.0f, 16.8807f, 20.0f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(20.0f, 8.2778f, 19.971f, 8.0624f, 19.9166f, 7.8574f)
                curveTo(20.6082f, 7.6357f, 21.1905f, 7.1699f, 21.5622f, 6.5614f)
                curveTo(21.8428f, 7.1485f, 22.0f, 7.8059f, 22.0f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(22.0f, 17.9853f, 19.9853f, 20.0f, 17.5f, 20.0f)
                horizontalLineTo(6.5f)
                curveTo(4.0147f, 20.0f, 2.0f, 17.9853f, 2.0f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(2.0f, 7.3647f, 2.4204f, 6.3276f, 3.114f, 5.5359f)
                curveTo(3.1386f, 5.4891f, 3.1673f, 5.4436f, 3.2f, 5.4f)
                curveTo(3.2925f, 5.2766f, 3.4081f, 5.1807f, 3.5362f, 5.1138f)
                curveTo(4.3278f, 4.4203f, 5.3648f, 4.0f, 6.5f, 4.0f)
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
                imageVector = PersianSymbols.Default.EnvelopeDot,
                contentDescription = ""
            )
        }
    }
}