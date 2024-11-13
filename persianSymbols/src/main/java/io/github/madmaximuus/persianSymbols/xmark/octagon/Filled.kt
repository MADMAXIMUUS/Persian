package io.github.madmaximuus.persianSymbols.xmark.octagon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.XMarkOctagon: ImageVector
    get() {
        if (xmarkOctagon != null) {
            return xmarkOctagon!!
        }
        xmarkOctagon = Builder(
            name = "xmark-octagon-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 8.384f)
                verticalLineTo(15.616f)
                curveTo(2f, 16.146f, 2.211f, 16.655f, 2.586f, 17.03f)
                lineTo(6.97f, 21.414f)
                curveTo(7.345f, 21.789f, 7.854f, 22f, 8.384f, 22f)
                horizontalLineTo(15.616f)
                curveTo(16.146f, 22f, 16.655f, 21.789f, 17.03f, 21.414f)
                lineTo(21.414f, 17.03f)
                curveTo(21.789f, 16.655f, 22f, 16.146f, 22f, 15.616f)
                verticalLineTo(8.384f)
                curveTo(22f, 7.854f, 21.789f, 7.345f, 21.414f, 6.97f)
                lineTo(17.03f, 2.586f)
                curveTo(16.655f, 2.211f, 16.146f, 2f, 15.616f, 2f)
                horizontalLineTo(8.384f)
                curveTo(7.854f, 2f, 7.345f, 2.211f, 6.97f, 2.586f)
                lineTo(2.586f, 6.97f)
                curveTo(2.211f, 7.345f, 2f, 7.854f, 2f, 8.384f)
                close()
                moveTo(9.03f, 7.97f)
                curveTo(8.737f, 7.677f, 8.263f, 7.677f, 7.97f, 7.97f)
                curveTo(7.677f, 8.263f, 7.677f, 8.737f, 7.97f, 9.03f)
                lineTo(10.939f, 12f)
                lineTo(7.97f, 14.97f)
                curveTo(7.677f, 15.263f, 7.677f, 15.737f, 7.97f, 16.03f)
                curveTo(8.263f, 16.323f, 8.737f, 16.323f, 9.03f, 16.03f)
                lineTo(12f, 13.061f)
                lineTo(14.97f, 16.03f)
                curveTo(15.263f, 16.323f, 15.737f, 16.323f, 16.03f, 16.03f)
                curveTo(16.323f, 15.737f, 16.323f, 15.263f, 16.03f, 14.97f)
                lineTo(13.061f, 12f)
                lineTo(16.03f, 9.03f)
                curveTo(16.323f, 8.737f, 16.323f, 8.263f, 16.03f, 7.97f)
                curveTo(15.737f, 7.677f, 15.263f, 7.677f, 14.97f, 7.97f)
                lineTo(12f, 10.939f)
                lineTo(9.03f, 7.97f)
                close()
            }
        }.build()
        return xmarkOctagon!!
    }

private var xmarkOctagon: ImageVector? = null