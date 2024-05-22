package io.github.madmaximuus.persianIcons.magnifyingGlass

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


val PersianSymbols.Default.MagnifyingGlass: ImageVector
    get() {
        if (magnifyingGlass != null) {
            return magnifyingGlass!!
        }
        magnifyingGlass = ImageVector.Builder(
            name = "search-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.3506f, 3.12329f)
                curveTo(6.4846f, 3.1233f, 3.3506f, 6.2573f, 3.3506f, 10.1233f)
                curveTo(3.3506f, 13.9893f, 6.4846f, 17.1233f, 10.3506f, 17.1233f)
                curveTo(11.806f, 17.1233f, 13.1577f, 16.6791f, 14.2774f, 15.919f)
                lineTo(18.9423f, 20.5838f)
                curveTo(19.3328f, 20.9743f, 19.966f, 20.9743f, 20.3565f, 20.5838f)
                curveTo(20.747f, 20.1933f, 20.747f, 19.5601f, 20.3565f, 19.1696f)
                lineTo(15.757f, 14.5701f)
                curveTo(16.7527f, 13.3609f, 17.3506f, 11.8119f, 17.3506f, 10.1233f)
                curveTo(17.3506f, 6.2573f, 14.2166f, 3.1233f, 10.3506f, 3.1233f)
                close()
                moveTo(5.35063f, 10.1233f)
                curveTo(5.3506f, 7.3619f, 7.5892f, 5.1233f, 10.3506f, 5.1233f)
                curveTo(13.1121f, 5.1233f, 15.3506f, 7.3619f, 15.3506f, 10.1233f)
                curveTo(15.3506f, 12.8847f, 13.1121f, 15.1233f, 10.3506f, 15.1233f)
                curveTo(7.5892f, 15.1233f, 5.3506f, 12.8847f, 5.3506f, 10.1233f)
                close()
            }
        }.build()
        return magnifyingGlass!!
    }

private var magnifyingGlass: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.MagnifyingGlass,
                contentDescription = ""
            )
        }
    }
}