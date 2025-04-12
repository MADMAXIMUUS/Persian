package io.github.madmaximuus.persianSymbols.s

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.S: ImageVector
    get() {
        if (s != null) {
            return s!!
        }
        s = ImageVector.Builder(
            name = "s-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 4.5f)
                curveTo(10.205f, 4.5f, 8.75f, 5.955f, 8.75f, 7.75f)
                curveTo(8.75f, 9.545f, 10.205f, 11f, 12f, 11f)
                curveTo(14.899f, 11f, 17.25f, 13.351f, 17.25f, 16.25f)
                curveTo(17.25f, 19.15f, 14.899f, 21.5f, 12f, 21.5f)
                curveTo(9.815f, 21.5f, 7.943f, 20.165f, 7.153f, 18.271f)
                curveTo(6.94f, 17.761f, 7.181f, 17.175f, 7.691f, 16.963f)
                curveTo(8.2f, 16.75f, 8.786f, 16.991f, 8.999f, 17.5f)
                curveTo(9.489f, 18.677f, 10.65f, 19.5f, 12f, 19.5f)
                curveTo(13.795f, 19.5f, 15.25f, 18.045f, 15.25f, 16.25f)
                curveTo(15.25f, 14.455f, 13.795f, 13f, 12f, 13f)
                curveTo(9.1f, 13f, 6.75f, 10.649f, 6.75f, 7.75f)
                curveTo(6.75f, 4.851f, 9.1f, 2.5f, 12f, 2.5f)
                curveTo(14.21f, 2.5f, 16.099f, 3.865f, 16.873f, 5.795f)
                curveTo(17.079f, 6.307f, 16.83f, 6.89f, 16.318f, 7.095f)
                curveTo(15.806f, 7.301f, 15.223f, 7.052f, 15.017f, 6.54f)
                curveTo(14.537f, 5.343f, 13.366f, 4.5f, 12f, 4.5f)
                close()
            }
        }.build()

        return s!!
    }

private var s: ImageVector? = null
