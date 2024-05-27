package io.github.madmaximuus.persianSymbols.arrow.trend.up

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

val PersianSymbols.Default.ArrowTrendUp: ImageVector
    get() {
        if (arrowTrendUp != null) {
            return arrowTrendUp!!
        }
        arrowTrendUp = Builder(
            name = "arrow-trend-up-default",
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
                moveTo(16.25f, 8.25f)
                curveTo(15.6977f, 8.25f, 15.25f, 7.8023f, 15.25f, 7.25f)
                curveTo(15.25f, 6.6977f, 15.6977f, 6.25f, 16.25f, 6.25f)
                horizontalLineTo(20.75f)
                curveTo(21.3023f, 6.25f, 21.75f, 6.6977f, 21.75f, 7.25f)
                verticalLineTo(11.75f)
                curveTo(21.75f, 12.3023f, 21.3023f, 12.75f, 20.75f, 12.75f)
                curveTo(20.1977f, 12.75f, 19.75f, 12.3023f, 19.75f, 11.75f)
                verticalLineTo(9.6642f)
                lineTo(14.6642f, 14.75f)
                curveTo(13.8832f, 15.531f, 12.6168f, 15.5311f, 11.8358f, 14.75f)
                lineTo(9.25f, 12.1642f)
                lineTo(3.9571f, 17.4571f)
                curveTo(3.5666f, 17.8476f, 2.9334f, 17.8476f, 2.5429f, 17.4571f)
                curveTo(2.1524f, 17.0666f, 2.1524f, 16.4334f, 2.5429f, 16.0429f)
                lineTo(7.8358f, 10.75f)
                curveTo(8.6168f, 9.969f, 9.8832f, 9.969f, 10.6642f, 10.75f)
                lineTo(13.25f, 13.3358f)
                lineTo(18.3358f, 8.25f)
                horizontalLineTo(16.25f)
                close()
            }
        }.build()
        return arrowTrendUp!!
    }

private var arrowTrendUp: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.ArrowTrendUp,
                contentDescription = ""
            )
        }
    }
}