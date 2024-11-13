package io.github.madmaximuus.persianSymbols.chart.donut.simple

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
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
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.221f, 4.198f)
                curveTo(10.76f, 4.076f, 11.097f, 3.54f, 10.975f, 3.002f)
                curveTo(10.853f, 2.463f, 10.317f, 2.126f, 9.779f, 2.248f)
                curveTo(5.325f, 3.258f, 2f, 7.24f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                curveTo(16.76f, 22f, 20.742f, 18.675f, 21.752f, 14.221f)
                curveTo(21.874f, 13.683f, 21.537f, 13.147f, 20.998f, 13.025f)
                curveTo(20.46f, 12.903f, 19.924f, 13.24f, 19.802f, 13.779f)
                curveTo(18.993f, 17.341f, 15.806f, 20f, 12f, 20f)
                curveTo(7.582f, 20f, 4f, 16.418f, 4f, 12f)
                curveTo(4f, 8.194f, 6.659f, 5.007f, 10.221f, 4.198f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.221f, 2.248f)
                curveTo(13.683f, 2.126f, 13.147f, 2.463f, 13.025f, 3.002f)
                curveTo(12.903f, 3.54f, 13.24f, 4.076f, 13.779f, 4.198f)
                curveTo(16.768f, 4.877f, 19.124f, 7.232f, 19.802f, 10.221f)
                curveTo(19.924f, 10.76f, 20.46f, 11.097f, 20.998f, 10.975f)
                curveTo(21.537f, 10.853f, 21.874f, 10.317f, 21.752f, 9.779f)
                curveTo(20.903f, 6.038f, 17.962f, 3.096f, 14.221f, 2.248f)
                close()
            }
        }.build()
        return chartDonutSimple!!
    }

private var chartDonutSimple: ImageVector? = null