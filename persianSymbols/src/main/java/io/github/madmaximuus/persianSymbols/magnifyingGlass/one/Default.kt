package io.github.madmaximuus.persianSymbols.magnifyingGlass.one

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.MagnifyingGlassOne: ImageVector
    get() {
        if (magnifyingGlassOne != null) {
            return magnifyingGlassOne!!
        }
        magnifyingGlassOne = ImageVector.Builder(
            name = "magnifying-glass-one-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.51f, 7.148f)
                curveTo(11.51f, 6.845f, 11.328f, 6.571f, 11.047f, 6.455f)
                curveTo(10.767f, 6.339f, 10.444f, 6.403f, 10.23f, 6.618f)
                lineTo(7.847f, 9f)
                curveTo(7.555f, 9.293f, 7.555f, 9.768f, 7.847f, 10.061f)
                curveTo(8.14f, 10.354f, 8.615f, 10.354f, 8.908f, 10.061f)
                lineTo(10.01f, 8.959f)
                verticalLineTo(13.182f)
                curveTo(10.01f, 13.596f, 10.346f, 13.932f, 10.76f, 13.932f)
                curveTo(11.175f, 13.932f, 11.51f, 13.596f, 11.51f, 13.182f)
                verticalLineTo(7.148f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.351f, 10.123f)
                curveTo(3.351f, 6.257f, 6.485f, 3.123f, 10.351f, 3.123f)
                curveTo(14.217f, 3.123f, 17.351f, 6.257f, 17.351f, 10.123f)
                curveTo(17.351f, 11.812f, 16.753f, 13.361f, 15.757f, 14.57f)
                lineTo(20.356f, 19.17f)
                curveTo(20.747f, 19.56f, 20.747f, 20.193f, 20.356f, 20.584f)
                curveTo(19.966f, 20.974f, 19.333f, 20.974f, 18.942f, 20.584f)
                lineTo(14.277f, 15.919f)
                curveTo(13.158f, 16.679f, 11.806f, 17.123f, 10.351f, 17.123f)
                curveTo(6.485f, 17.123f, 3.351f, 13.989f, 3.351f, 10.123f)
                close()
                moveTo(10.351f, 5.123f)
                curveTo(7.589f, 5.123f, 5.351f, 7.362f, 5.351f, 10.123f)
                curveTo(5.351f, 12.885f, 7.589f, 15.123f, 10.351f, 15.123f)
                curveTo(13.112f, 15.123f, 15.351f, 12.885f, 15.351f, 10.123f)
                curveTo(15.351f, 7.362f, 13.112f, 5.123f, 10.351f, 5.123f)
                close()
            }
        }.build()

        return magnifyingGlassOne!!
    }

private var magnifyingGlassOne: ImageVector? = null