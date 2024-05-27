package io.github.madmaximuus.persianSymbols.moon

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
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Moon: ImageVector
    get() {
        if (moon != null) {
            return moon!!
        }
        moon = Builder(
            name = "moon-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Round,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.8232f, 13.783f)
                curveTo(19.4645f, 15.1521f, 17.5812f, 15.9999f, 15.4999f, 15.9999f)
                curveTo(11.3577f, 15.9999f, 7.9999f, 12.642f, 7.9999f, 8.4999f)
                curveTo(7.9999f, 6.4186f, 8.8477f, 4.5353f, 10.2167f, 3.1765f)
                curveTo(6.1003f, 4.0039f, 2.9999f, 7.6398f, 2.9999f, 11.9999f)
                curveTo(2.9999f, 16.9704f, 7.0293f, 20.9999f, 11.9999f, 20.9999f)
                curveTo(16.36f, 20.9999f, 19.9959f, 17.8995f, 20.8232f, 13.783f)
                close()
            }
        }.build()
        return moon!!
    }

private var moon: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Moon,
                contentDescription = ""
            )
        }
    }
}