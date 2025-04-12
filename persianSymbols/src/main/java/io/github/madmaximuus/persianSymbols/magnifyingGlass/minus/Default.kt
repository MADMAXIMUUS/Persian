package io.github.madmaximuus.persianSymbols.magnifyingGlass.minus

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.MagnifyingGlassMinus: ImageVector
    get() {
        if (magnifyingGlassMinus != null) {
            return magnifyingGlassMinus!!
        }
        magnifyingGlassMinus = ImageVector.Builder(
            name = "magnifying-glass-minus-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.75f, 9.271f)
                curveTo(7.336f, 9.271f, 7f, 9.607f, 7f, 10.021f)
                curveTo(7f, 10.436f, 7.336f, 10.771f, 7.75f, 10.771f)
                horizontalLineTo(12.893f)
                curveTo(13.307f, 10.771f, 13.643f, 10.436f, 13.643f, 10.021f)
                curveTo(13.643f, 9.607f, 13.307f, 9.271f, 12.893f, 9.271f)
                horizontalLineTo(7.75f)
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

        return magnifyingGlassMinus!!
    }

private var magnifyingGlassMinus: ImageVector? = null