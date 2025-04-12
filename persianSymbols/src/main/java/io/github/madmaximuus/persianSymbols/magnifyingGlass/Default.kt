package io.github.madmaximuus.persianSymbols.magnifyingGlass

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols


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
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.351f, 3.123f)
                curveTo(6.485f, 3.123f, 3.351f, 6.257f, 3.351f, 10.123f)
                curveTo(3.351f, 13.989f, 6.485f, 17.123f, 10.351f, 17.123f)
                curveTo(11.806f, 17.123f, 13.158f, 16.679f, 14.277f, 15.919f)
                lineTo(18.942f, 20.584f)
                curveTo(19.333f, 20.974f, 19.966f, 20.974f, 20.356f, 20.584f)
                curveTo(20.747f, 20.193f, 20.747f, 19.56f, 20.356f, 19.17f)
                lineTo(15.757f, 14.57f)
                curveTo(16.753f, 13.361f, 17.351f, 11.812f, 17.351f, 10.123f)
                curveTo(17.351f, 6.257f, 14.217f, 3.123f, 10.351f, 3.123f)
                close()
                moveTo(5.351f, 10.123f)
                curveTo(5.351f, 7.362f, 7.589f, 5.123f, 10.351f, 5.123f)
                curveTo(13.112f, 5.123f, 15.351f, 7.362f, 15.351f, 10.123f)
                curveTo(15.351f, 12.885f, 13.112f, 15.123f, 10.351f, 15.123f)
                curveTo(7.589f, 15.123f, 5.351f, 12.885f, 5.351f, 10.123f)
                close()
            }
        }.build()
        return magnifyingGlass!!
    }

private var magnifyingGlass: ImageVector? = null