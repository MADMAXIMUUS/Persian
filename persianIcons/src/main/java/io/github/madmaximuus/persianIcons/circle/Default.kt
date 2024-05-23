package io.github.madmaximuus.persianIcons.circle

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

val PersianSymbols.Default.Circle: ImageVector
    get() {
        if (circle != null) {
            return circle!!
        }
        circle = ImageVector.Builder(
            name = "circle-default",
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
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(21f, 12f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 12f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 12f)
                close()
            }
        }.build()
        return circle!!
    }

private var circle: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.Circle,
                contentDescription = ""
            )
        }
    }
}