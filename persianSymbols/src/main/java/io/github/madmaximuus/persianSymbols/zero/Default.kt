package io.github.madmaximuus.persianSymbols.zero

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Zero: ImageVector
    get() {
        if (zero != null) {
            return zero!!
        }
        zero = ImageVector.Builder(
            name = "zero-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 2.5f)
                curveTo(8.599f, 2.5f, 6f, 5.502f, 6f, 9f)
                verticalLineTo(15f)
                curveTo(6f, 18.498f, 8.599f, 21.5f, 12f, 21.5f)
                curveTo(15.401f, 21.5f, 18f, 18.498f, 18f, 15f)
                verticalLineTo(9f)
                curveTo(18f, 5.502f, 15.401f, 2.5f, 12f, 2.5f)
                close()
                moveTo(12f, 4.5f)
                curveTo(9.878f, 4.5f, 8f, 6.423f, 8f, 9f)
                verticalLineTo(15f)
                curveTo(8f, 17.577f, 9.878f, 19.5f, 12f, 19.5f)
                curveTo(14.122f, 19.5f, 16f, 17.577f, 16f, 15f)
                verticalLineTo(9f)
                curveTo(16f, 6.423f, 14.122f, 4.5f, 12f, 4.5f)
                close()
            }
        }.build()

        return zero!!
    }

private var zero: ImageVector? = null
