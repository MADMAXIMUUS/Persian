package io.github.madmaximuus.persianSymbols.box

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Box: ImageVector
    get() {
        if (box != null) {
            return box!!
        }
        box = ImageVector.Builder(
            name = "box-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(7.4999f, 3.9999f)
                lineTo(16.4999f, 3.9999f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 19.9999f, 7.4999f)
                lineTo(19.9999f, 16.4998f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 16.4999f, 19.9998f)
                lineTo(7.4999f, 19.9998f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 3.9999f, 16.4998f)
                lineTo(3.9999f, 7.4999f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 7.4999f, 3.9999f)
                close()
            }
        }.build()
        return box!!
    }

private var box: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Box,
                contentDescription = ""
            )
        }
    }
}