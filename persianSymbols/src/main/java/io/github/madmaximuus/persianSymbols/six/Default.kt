package io.github.madmaximuus.persianSymbols.six

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Six: ImageVector
    get() {
        if (six != null) {
            return six!!
        }
        six = ImageVector.Builder(
            name = "six-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.662f, 10.191f)
                curveTo(7.698f, 9.941f, 7.739f, 9.689f, 7.787f, 9.437f)
                curveTo(8.048f, 8.069f, 8.489f, 6.806f, 9.179f, 5.905f)
                curveTo(9.836f, 5.047f, 10.725f, 4.5f, 12.035f, 4.5f)
                horizontalLineTo(15.035f)
                curveTo(15.588f, 4.5f, 16.035f, 4.052f, 16.035f, 3.5f)
                curveTo(16.035f, 2.948f, 15.588f, 2.5f, 15.035f, 2.5f)
                horizontalLineTo(12.035f)
                curveTo(10.038f, 2.5f, 8.586f, 3.391f, 7.591f, 4.689f)
                curveTo(6.63f, 5.944f, 6.11f, 7.556f, 5.822f, 9.063f)
                curveTo(5.532f, 10.584f, 5.463f, 12.09f, 5.465f, 13.204f)
                curveTo(5.465f, 13.764f, 5.484f, 14.232f, 5.502f, 14.562f)
                curveTo(5.511f, 14.727f, 5.52f, 14.858f, 5.528f, 14.948f)
                curveTo(5.531f, 14.99f, 5.533f, 15.023f, 5.536f, 15.047f)
                curveTo(5.561f, 18.615f, 8.461f, 21.5f, 12.035f, 21.5f)
                curveTo(15.625f, 21.5f, 18.535f, 18.59f, 18.535f, 15f)
                curveTo(18.535f, 11.41f, 15.625f, 8.5f, 12.035f, 8.5f)
                curveTo(10.351f, 8.5f, 8.817f, 9.14f, 7.662f, 10.191f)
                close()
                moveTo(12.035f, 10.5f)
                curveTo(9.55f, 10.5f, 7.535f, 12.515f, 7.535f, 15f)
                curveTo(7.535f, 17.485f, 9.55f, 19.5f, 12.035f, 19.5f)
                curveTo(14.521f, 19.5f, 16.535f, 17.485f, 16.535f, 15f)
                curveTo(16.535f, 12.515f, 14.521f, 10.5f, 12.035f, 10.5f)
                close()
            }
        }.build()

        return six!!
    }

private var six: ImageVector? = null
