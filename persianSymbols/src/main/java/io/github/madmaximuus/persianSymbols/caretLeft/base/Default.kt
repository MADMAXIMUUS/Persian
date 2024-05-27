package io.github.madmaximuus.persianSymbols.caretLeft.base

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

val PersianSymbols.Default.CaretLeft: ImageVector
    get() {
        if (caretLeft != null) {
            return caretLeft!!
        }
        caretLeft = Builder(
            name = "caret-left-default",
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
                moveTo(14.0f, 15.5938f)
                curveTo(14.0f, 15.9691f, 13.5247f, 16.1429f, 13.2742f, 15.8592f)
                lineTo(10.1009f, 12.2654f)
                curveTo(9.9664f, 12.1131f, 9.9664f, 11.8869f, 10.1009f, 11.7346f)
                lineTo(13.2742f, 8.1408f)
                curveTo(13.5247f, 7.8571f, 14.0f, 8.0309f, 14.0f, 8.4062f)
                lineTo(14.0f, 15.5938f)
                close()
            }
        }.build()
        return caretLeft!!
    }

private var caretLeft: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.CaretLeft,
                contentDescription = ""
            )
        }
    }
}