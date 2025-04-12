package io.github.madmaximuus.persianSymbols.five

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Five: ImageVector
    get() {
        if (five != null) {
            return five!!
        }
        five = ImageVector.Builder(
            name = "five-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 3.383f)
                curveTo(7.059f, 2.88f, 7.486f, 2.5f, 7.993f, 2.5f)
                horizontalLineTo(16.501f)
                curveTo(17.053f, 2.5f, 17.501f, 2.948f, 17.501f, 3.5f)
                curveTo(17.501f, 4.052f, 17.053f, 4.5f, 16.501f, 4.5f)
                horizontalLineTo(8.883f)
                lineTo(8.308f, 9.383f)
                curveTo(9.258f, 8.832f, 10.36f, 8.516f, 11.537f, 8.516f)
                curveTo(15.111f, 8.516f, 18f, 11.428f, 18f, 15.008f)
                curveTo(18f, 18.588f, 15.111f, 21.5f, 11.537f, 21.5f)
                curveTo(9.298f, 21.5f, 7.327f, 20.356f, 6.169f, 18.625f)
                curveTo(5.862f, 18.166f, 5.985f, 17.545f, 6.444f, 17.238f)
                curveTo(6.903f, 16.931f, 7.524f, 17.054f, 7.831f, 17.513f)
                curveTo(8.635f, 18.715f, 9.996f, 19.5f, 11.537f, 19.5f)
                curveTo(13.997f, 19.5f, 16f, 17.494f, 16f, 15.008f)
                curveTo(16f, 12.522f, 13.997f, 10.516f, 11.537f, 10.516f)
                curveTo(9.996f, 10.516f, 8.635f, 11.301f, 7.831f, 12.503f)
                curveTo(7.574f, 12.887f, 7.088f, 13.045f, 6.654f, 12.886f)
                curveTo(6.22f, 12.726f, 5.953f, 12.29f, 6.007f, 11.83f)
                lineTo(7f, 3.383f)
                close()
            }
        }.build()

        return five!!
    }

private var five: ImageVector? = null
