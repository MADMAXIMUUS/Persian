package io.github.madmaximuus.persianSymbols.caretUp

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

val PersianSymbols.Default.CaretUp: ImageVector
    get() {
        if (caretUp != null) {
            return caretUp!!
        }
        caretUp = Builder(
            name = "caret-up-default",
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
                moveTo(9.3047f, 13.0909f)
                curveTo(9.0231f, 13.0909f, 8.8928f, 12.7021f, 9.1056f, 12.4971f)
                lineTo(11.801f, 9.9007f)
                curveTo(11.9152f, 9.7907f, 12.0848f, 9.7907f, 12.199f, 9.9007f)
                lineTo(14.8944f, 12.4971f)
                curveTo(15.1072f, 12.7021f, 14.9769f, 13.0909f, 14.6953f, 13.0909f)
                lineTo(9.3047f, 13.0909f)
                close()
            }
        }.build()
        return caretUp!!
    }

private var caretUp: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.CaretUp,
                contentDescription = ""
            )
        }
    }
}