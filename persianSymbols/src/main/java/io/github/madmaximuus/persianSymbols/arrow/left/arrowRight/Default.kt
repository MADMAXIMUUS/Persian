package io.github.madmaximuus.persianSymbols.arrow.left.arrowRight

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

val PersianSymbols.Default.ArrowLeftArrowRight: ImageVector
    get() {
        if (arrowLeftArrowRight != null) {
            return arrowLeftArrowRight!!
        }
        arrowLeftArrowRight = Builder(
            name = "arrow-left-arrow-right-default",
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
                moveTo(8.2004f, 5.7643f)
                curveTo(8.6225f, 5.4082f, 8.676f, 4.7773f, 8.3198f, 4.3552f)
                curveTo(7.9637f, 3.933f, 7.3328f, 3.8796f, 6.9107f, 4.2357f)
                lineTo(3.3551f, 7.2357f)
                curveTo(3.1299f, 7.4257f, 3.0f, 7.7054f, 3.0f, 8.0f)
                curveTo(3.0f, 8.2947f, 3.1299f, 8.5743f, 3.3551f, 8.7643f)
                lineTo(6.9107f, 11.7643f)
                curveTo(7.3328f, 12.1205f, 7.9637f, 12.067f, 8.3198f, 11.6449f)
                curveTo(8.676f, 11.2228f, 8.6225f, 10.5919f, 8.2004f, 10.2357f)
                lineTo(6.7359f, 9.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 9.0f, 21.0f, 8.5523f, 21.0f, 8.0f)
                curveTo(21.0f, 7.4477f, 20.5523f, 7.0f, 20.0f, 7.0f)
                horizontalLineTo(6.7359f)
                lineTo(8.2004f, 5.7643f)
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
                moveTo(15.7996f, 18.2357f)
                curveTo(15.3775f, 18.5919f, 15.324f, 19.2228f, 15.6802f, 19.6449f)
                curveTo(16.0363f, 20.067f, 16.6672f, 20.1204f, 17.0893f, 19.7643f)
                lineTo(20.6449f, 16.7643f)
                curveTo(20.8701f, 16.5743f, 21.0f, 16.2946f, 21.0f, 16.0f)
                curveTo(21.0f, 15.7054f, 20.8701f, 15.4257f, 20.6449f, 15.2357f)
                lineTo(17.0893f, 12.2357f)
                curveTo(16.6672f, 11.8796f, 16.0363f, 11.933f, 15.6802f, 12.3551f)
                curveTo(15.324f, 12.7772f, 15.3775f, 13.4081f, 15.7996f, 13.7643f)
                lineTo(17.2641f, 15.0f)
                lineTo(4.0f, 15.0f)
                curveTo(3.4477f, 15.0f, 3.0f, 15.4477f, 3.0f, 16.0f)
                curveTo(3.0f, 16.5523f, 3.4477f, 17.0f, 4.0f, 17.0f)
                lineTo(17.2641f, 17.0f)
                lineTo(15.7996f, 18.2357f)
                close()
            }
        }.build()
        return arrowLeftArrowRight!!
    }

private var arrowLeftArrowRight: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.ArrowLeftArrowRight,
                contentDescription = ""
            )
        }
    }
}