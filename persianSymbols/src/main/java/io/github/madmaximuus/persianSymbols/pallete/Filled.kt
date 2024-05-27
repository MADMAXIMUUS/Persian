package io.github.madmaximuus.persianSymbols.pallete

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

val PersianSymbols.Filled.Palette: ImageVector
    get() {
        if (palette != null) {
            return palette!!
        }
        palette = Builder(
            name = "palette-filled",
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
                moveTo(12.0f, 2.0f)
                curveTo(4.0f, 2.0f, 2.0f, 8.6667f, 2.0f, 12.0f)
                curveTo(2.0f, 15.3333f, 4.0f, 22.0f, 12.0f, 22.0f)
                curveTo(17.7527f, 22.0f, 15.9074f, 19.8725f, 14.5565f, 18.3151f)
                curveTo(14.0809f, 17.7669f, 13.6667f, 17.2893f, 13.6667f, 17.0f)
                curveTo(13.6667f, 15.1204f, 15.6133f, 14.9279f, 17.6248f, 14.729f)
                curveTo(19.7753f, 14.5164f, 22.0f, 14.2964f, 22.0f, 12.0f)
                curveTo(22.0f, 8.6667f, 20.0f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(15.0f, 6.5f)
                curveTo(15.0f, 7.3284f, 14.3284f, 8.0f, 13.5f, 8.0f)
                curveTo(12.6716f, 8.0f, 12.0f, 7.3284f, 12.0f, 6.5f)
                curveTo(12.0f, 5.6716f, 12.6716f, 5.0f, 13.5f, 5.0f)
                curveTo(14.3284f, 5.0f, 15.0f, 5.6716f, 15.0f, 6.5f)
                close()
                moveTo(8.5f, 9.0f)
                curveTo(9.3284f, 9.0f, 10.0f, 8.3284f, 10.0f, 7.5f)
                curveTo(10.0f, 6.6716f, 9.3284f, 6.0f, 8.5f, 6.0f)
                curveTo(7.6716f, 6.0f, 7.0f, 6.6716f, 7.0f, 7.5f)
                curveTo(7.0f, 8.3284f, 7.6716f, 9.0f, 8.5f, 9.0f)
                close()
                moveTo(8.0f, 12.5f)
                curveTo(8.0f, 13.3284f, 7.3284f, 14.0f, 6.5f, 14.0f)
                curveTo(5.6716f, 14.0f, 5.0f, 13.3284f, 5.0f, 12.5f)
                curveTo(5.0f, 11.6716f, 5.6716f, 11.0f, 6.5f, 11.0f)
                curveTo(7.3284f, 11.0f, 8.0f, 11.6716f, 8.0f, 12.5f)
                close()
                moveTo(16.5f, 12.0f)
                curveTo(17.3284f, 12.0f, 18.0f, 11.3284f, 18.0f, 10.5f)
                curveTo(18.0f, 9.6716f, 17.3284f, 9.0f, 16.5f, 9.0f)
                curveTo(15.6716f, 9.0f, 15.0f, 9.6716f, 15.0f, 10.5f)
                curveTo(15.0f, 11.3284f, 15.6716f, 12.0f, 16.5f, 12.0f)
                close()
            }
        }.build()
        return palette!!
    }

private var palette: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.Palette,
                contentDescription = ""
            )
        }
    }
}