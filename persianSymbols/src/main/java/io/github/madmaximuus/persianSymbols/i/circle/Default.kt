package io.github.madmaximuus.persianSymbols.i.circle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ICircle: ImageVector
    get() {
        if (iCircle != null) {
            return iCircle!!
        }
        iCircle = Builder(
            name = "i-circle-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 7.388f)
                curveTo(13f, 7.94f, 12.552f, 8.388f, 12f, 8.388f)
                curveTo(11.448f, 8.388f, 11f, 7.94f, 11f, 7.388f)
                curveTo(11f, 6.836f, 11.448f, 6.388f, 12f, 6.388f)
                curveTo(12.552f, 6.388f, 13f, 6.836f, 13f, 7.388f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 9.007f)
                curveTo(12.414f, 9.007f, 12.75f, 9.342f, 12.75f, 9.757f)
                verticalLineTo(16.862f)
                curveTo(12.75f, 17.276f, 12.414f, 17.612f, 12f, 17.612f)
                curveTo(11.586f, 17.612f, 11.25f, 17.276f, 11.25f, 16.862f)
                verticalLineTo(9.757f)
                curveTo(11.25f, 9.342f, 11.586f, 9.007f, 12f, 9.007f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                close()
                moveTo(4f, 12f)
                curveTo(4f, 7.582f, 7.582f, 4f, 12f, 4f)
                curveTo(16.418f, 4f, 20f, 7.582f, 20f, 12f)
                curveTo(20f, 16.418f, 16.418f, 20f, 12f, 20f)
                curveTo(7.582f, 20f, 4f, 16.418f, 4f, 12f)
                close()
            }
        }.build()
        return iCircle!!
    }

private var iCircle: ImageVector? = null