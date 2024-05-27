package io.github.madmaximuus.persianSymbols.caretRight

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

val PersianSymbols.Default.CaretRight: ImageVector
    get() {
        if (caretRight != null) {
            return caretRight!!
        }
        caretRight = Builder(
            name = "caret-right-default",
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
                moveTo(10.9092f, 8.3047f)
                curveTo(10.9092f, 8.0231f, 11.298f, 7.8928f, 11.503f, 8.1056f)
                lineTo(14.0994f, 10.801f)
                curveTo(14.2094f, 10.9152f, 14.2094f, 11.0848f, 14.0994f, 11.199f)
                lineTo(11.503f, 13.8944f)
                curveTo(11.298f, 14.1072f, 10.9092f, 13.9769f, 10.9092f, 13.6953f)
                lineTo(10.9092f, 8.3047f)
                close()
            }
        }.build()
        return caretRight!!
    }

private var caretRight: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.CaretRight,
                contentDescription = ""
            )
        }
    }
}