package io.github.madmaximuus.persianSymbols.star

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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Star: ImageVector
    get() {
        if (star != null) {
            return star!!
        }
        star = ImageVector.Builder(
            name = "star-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2.0f,
                strokeLineCap = Round,
                strokeLineJoin = StrokeJoin.Companion.Round,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.9998f, 2.9999f)
                lineTo(14.1126f, 9.8565f)
                lineTo(20.9496f, 9.8565f)
                lineTo(15.4183f, 14.0941f)
                lineTo(17.5311f, 20.9507f)
                lineTo(11.9998f, 16.7131f)
                lineTo(6.4686f, 20.9507f)
                lineTo(8.5813f, 14.0941f)
                lineTo(3.0501f, 9.8565f)
                lineTo(9.8871f, 9.8565f)
                lineTo(11.9998f, 2.9999f)
                close()
            }
        }.build()
        return star!!
    }

private var star: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Filled.Star,
                contentDescription = ""
            )
        }
    }
}