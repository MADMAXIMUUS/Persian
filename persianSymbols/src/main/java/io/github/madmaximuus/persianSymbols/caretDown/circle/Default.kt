package io.github.madmaximuus.persianSymbols.caretDown.circle

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

val PersianSymbols.Default.CaretDownCircle: ImageVector
    get() {
        if (caretDownCircle != null) {
            return caretDownCircle!!
        }
        caretDownCircle = Builder(
            name = "caret-down-circle-default",
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
                moveTo(14.8944f, 11.5938f)
                curveTo(15.1072f, 11.3889f, 14.9769f, 11.0f, 14.6953f, 11.0f)
                horizontalLineTo(9.3047f)
                curveTo(9.0231f, 11.0f, 8.8928f, 11.3889f, 9.1056f, 11.5938f)
                lineTo(11.801f, 14.1902f)
                curveTo(11.9152f, 14.3002f, 12.0848f, 14.3002f, 12.199f, 14.1902f)
                lineTo(14.8944f, 11.5938f)
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
                moveTo(11.9999f, 2.0f)
                curveTo(6.477f, 2.0f, 1.9999f, 6.4771f, 1.9999f, 12.0f)
                curveTo(1.9999f, 17.5228f, 6.477f, 22.0f, 11.9999f, 22.0f)
                curveTo(17.5227f, 22.0f, 21.9999f, 17.5228f, 21.9999f, 12.0f)
                curveTo(21.9999f, 6.4771f, 17.5227f, 2.0f, 11.9999f, 2.0f)
                close()
                moveTo(3.9999f, 12.0f)
                curveTo(3.9999f, 7.5817f, 7.5816f, 4.0f, 11.9999f, 4.0f)
                curveTo(16.4182f, 4.0f, 19.9999f, 7.5817f, 19.9999f, 12.0f)
                curveTo(19.9999f, 16.4183f, 16.4182f, 20.0f, 11.9999f, 20.0f)
                curveTo(7.5816f, 20.0f, 3.9999f, 16.4183f, 3.9999f, 12.0f)
                close()
            }
        }.build()
        return caretDownCircle!!
    }

private var caretDownCircle: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.CaretDownCircle,
                contentDescription = ""
            )
        }
    }
}