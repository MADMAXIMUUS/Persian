package io.github.madmaximuus.persianSymbols.star

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

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
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 2f)
                curveTo(12.439f, 2f, 12.826f, 2.286f, 12.955f, 2.705f)
                lineTo(14.862f, 8.875f)
                lineTo(21f, 8.875f)
                curveTo(21.429f, 8.875f, 21.81f, 9.149f, 21.947f, 9.555f)
                curveTo(22.085f, 9.961f, 21.948f, 10.41f, 21.607f, 10.67f)
                lineTo(16.599f, 14.496f)
                lineTo(18.518f, 20.705f)
                curveTo(18.646f, 21.12f, 18.491f, 21.571f, 18.134f, 21.82f)
                curveTo(17.778f, 22.069f, 17.301f, 22.059f, 16.955f, 21.795f)
                lineTo(12f, 18.009f)
                lineTo(7.045f, 21.795f)
                curveTo(6.699f, 22.059f, 6.222f, 22.069f, 5.866f, 21.82f)
                curveTo(5.509f, 21.571f, 5.354f, 21.12f, 5.482f, 20.705f)
                lineTo(7.401f, 14.496f)
                lineTo(2.393f, 10.67f)
                curveTo(2.052f, 10.41f, 1.915f, 9.961f, 2.053f, 9.555f)
                curveTo(2.19f, 9.149f, 2.571f, 8.875f, 3f, 8.875f)
                lineTo(9.138f, 8.875f)
                lineTo(11.045f, 2.705f)
                curveTo(11.174f, 2.286f, 11.561f, 2f, 12f, 2f)
                close()
                moveTo(12f, 6.387f)
                lineTo(10.831f, 10.171f)
                curveTo(10.701f, 10.59f, 10.314f, 10.875f, 9.875f, 10.875f)
                lineTo(5.956f, 10.875f)
                lineTo(9.169f, 13.33f)
                curveTo(9.502f, 13.584f, 9.641f, 14.019f, 9.518f, 14.42f)
                lineTo(8.317f, 18.306f)
                lineTo(11.393f, 15.956f)
                curveTo(11.751f, 15.682f, 12.249f, 15.682f, 12.607f, 15.956f)
                lineTo(15.683f, 18.306f)
                lineTo(14.482f, 14.42f)
                curveTo(14.358f, 14.019f, 14.498f, 13.584f, 14.831f, 13.33f)
                lineTo(18.044f, 10.875f)
                lineTo(14.125f, 10.875f)
                curveTo(13.686f, 10.875f, 13.299f, 10.59f, 13.169f, 10.171f)
                lineTo(12f, 6.387f)
                close()
            }
        }.build()
        return star!!
    }

private var star: ImageVector? = null