package io.github.madmaximuus.persianSymbols.circle.dot

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.CircleDot: ImageVector
    get() {
        if (circleDot != null) {
            return circleDot!!
        }
        circleDot = ImageVector.Builder(
            name = "circle-dot-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
                moveTo(12f, 17f)
                curveTo(14.761f, 17f, 17f, 14.761f, 17f, 12f)
                curveTo(17f, 9.239f, 14.761f, 7f, 12f, 7f)
                curveTo(9.238f, 7f, 7f, 9.239f, 7f, 12f)
                curveTo(7f, 14.761f, 9.238f, 17f, 12f, 17f)
                close()
            }
        }.build()
        return circleDot!!
    }

private var circleDot: ImageVector? = null