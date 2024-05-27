package io.github.madmaximuus.persianSymbols.chart.donut.simple

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

val PersianSymbols.Default.ChartDonutSimple: ImageVector
    get() {
        if (chartDonutSimple != null) {
            return chartDonutSimple!!
        }
        chartDonutSimple = Builder(
            name = "chart-donut-simple-default",
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
                moveTo(10.2213f, 4.1982f)
                curveTo(10.7599f, 4.076f, 11.0974f, 3.5403f, 10.9752f, 3.0017f)
                curveTo(10.853f, 2.4631f, 10.3173f, 2.1256f, 9.7787f, 2.2478f)
                curveTo(5.3253f, 3.2583f, 2.0f, 7.2396f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(16.7603f, 22.0f, 20.7416f, 18.6747f, 21.7522f, 14.2213f)
                curveTo(21.8744f, 13.6827f, 21.5369f, 13.147f, 20.9983f, 13.0248f)
                curveTo(20.4597f, 12.9026f, 19.924f, 13.2401f, 19.8018f, 13.7787f)
                curveTo(18.9934f, 17.3412f, 15.806f, 20.0f, 12.0f, 20.0f)
                curveTo(7.5817f, 20.0f, 4.0f, 16.4183f, 4.0f, 12.0f)
                curveTo(4.0f, 8.194f, 6.6588f, 5.0066f, 10.2213f, 4.1982f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.2213f, 2.2478f)
                curveTo(13.6827f, 2.1256f, 13.147f, 2.4631f, 13.0248f, 3.0017f)
                curveTo(12.9026f, 3.5403f, 13.2401f, 4.076f, 13.7787f, 4.1982f)
                curveTo(16.768f, 4.8765f, 19.1235f, 7.232f, 19.8018f, 10.2213f)
                curveTo(19.924f, 10.7599f, 20.4597f, 11.0974f, 20.9983f, 10.9752f)
                curveTo(21.5369f, 10.853f, 21.8744f, 10.3173f, 21.7522f, 9.7787f)
                curveTo(20.9035f, 6.0384f, 17.9615f, 3.0965f, 14.2213f, 2.2478f)
                close()
            }
        }.build()
        return chartDonutSimple!!
    }

private var chartDonutSimple: ImageVector? = null

@Preview
@Composable
private fun IconPreview() {
    MaterialTheme {
        Surface {
            Icon(
                modifier = Modifier.size(100.dp),
                imageVector = PersianSymbols.Default.ChartDonutSimple,
                contentDescription = ""
            )
        }
    }
}