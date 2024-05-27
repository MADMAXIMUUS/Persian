package io.github.madmaximuus.persianSymbols.arrow.trend.down

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ArrowTrendDown: ImageVector
    get() {
        if (arrowTrendDown != null) {
            return arrowTrendDown!!
        }
        arrowTrendDown = Builder(
            name = "arrow-trend-down-default",
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
                pathFillType = NonZero
            ) {
                moveTo(16.25f, 15.75f)
                curveTo(15.6977f, 15.75f, 15.25f, 16.1977f, 15.25f, 16.75f)
                curveTo(15.25f, 17.3023f, 15.6977f, 17.75f, 16.25f, 17.75f)
                horizontalLineTo(20.75f)
                curveTo(21.3023f, 17.75f, 21.75f, 17.3023f, 21.75f, 16.75f)
                verticalLineTo(12.25f)
                curveTo(21.75f, 11.6977f, 21.3023f, 11.25f, 20.75f, 11.25f)
                curveTo(20.1977f, 11.25f, 19.75f, 11.6977f, 19.75f, 12.25f)
                verticalLineTo(14.3358f)
                lineTo(14.6642f, 9.25f)
                curveTo(13.8832f, 8.469f, 12.6168f, 8.469f, 11.8358f, 9.25f)
                lineTo(9.25f, 11.8358f)
                lineTo(3.9571f, 6.5429f)
                curveTo(3.5666f, 6.1524f, 2.9334f, 6.1524f, 2.5429f, 6.5429f)
                curveTo(2.1524f, 6.9334f, 2.1524f, 7.5666f, 2.5429f, 7.9571f)
                lineTo(7.8358f, 13.25f)
                curveTo(8.6168f, 14.031f, 9.8832f, 14.031f, 10.6642f, 13.25f)
                lineTo(13.25f, 10.6642f)
                lineTo(18.3358f, 15.75f)
                horizontalLineTo(16.25f)
                close()
            }
        }.build()
        return arrowTrendDown!!
    }

private var arrowTrendDown: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.ArrowTrendDown,
                contentDescription = ""
            )
        }
    }
}