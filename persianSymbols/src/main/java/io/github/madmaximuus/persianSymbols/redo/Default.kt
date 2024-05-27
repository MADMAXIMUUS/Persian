package io.github.madmaximuus.persianSymbols.redo

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Redo: ImageVector
    get() {
        if (redo != null) {
            return redo!!
        }
        redo = Builder(
            name = "redo-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2.0f,
                strokeLineCap = Round,
                strokeLineJoin = StrokeJoin.Companion.Round,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.4999f, 18.5f)
                horizontalLineTo(7.0f)
                curveTo(5.067f, 18.5f, 3.5f, 16.933f, 3.5f, 15.0f)
                verticalLineTo(12.0f)
                curveTo(3.5f, 10.067f, 5.067f, 8.5f, 7.0f, 8.5f)
                horizontalLineTo(20.4999f)
                moveTo(16.5f, 5.5f)
                lineTo(20.5f, 8.486f)
                lineTo(16.5f, 11.5f)
            }
        }.build()
        return redo!!
    }

private var redo: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Redo,
                contentDescription = ""
            )
        }
    }
}