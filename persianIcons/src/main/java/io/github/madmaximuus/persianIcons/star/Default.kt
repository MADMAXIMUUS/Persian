package io.github.madmaximuus.persianIcons.star

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
import io.github.madmaximuus.persianIcons.foundation.PersianSymbols

val PersianSymbols.Default.Star: ImageVector
    get() {
        if (star != null) {
            return star!!
        }
        star = ImageVector.Builder(
            name = "star-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(11.9998f, 2.99988f)
                lineTo(14.1126f, 9.85648f)
                lineTo(20.9496f, 9.85648f)
                lineTo(15.4183f, 14.0941f)
                lineTo(17.5311f, 20.9507f)
                lineTo(11.9998f, 16.7131f)
                lineTo(6.46856f, 20.9507f)
                lineTo(8.58131f, 14.0941f)
                lineTo(3.05005f, 9.85648f)
                lineTo(9.88706f, 9.85648f)
                lineTo(11.9998f, 2.99988f)
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
                imageVector = PersianSymbols.Default.Star,
                contentDescription = ""
            )
        }
    }
}