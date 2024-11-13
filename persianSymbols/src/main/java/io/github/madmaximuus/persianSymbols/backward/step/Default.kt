package io.github.madmaximuus.persianSymbols.backward.step

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.BackwardStep: ImageVector
    get() {
        if (backwardStep != null) {
            return backwardStep!!
        }
        backwardStep = ImageVector.Builder(
            name = "backward-step-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.621f, 7f)
                curveTo(8.621f, 6.448f, 8.173f, 6f, 7.621f, 6f)
                curveTo(7.069f, 6f, 6.621f, 6.448f, 6.621f, 7f)
                verticalLineTo(17f)
                curveTo(6.621f, 17.552f, 7.069f, 18f, 7.621f, 18f)
                curveTo(8.173f, 18f, 8.621f, 17.552f, 8.621f, 17f)
                verticalLineTo(13.448f)
                lineTo(15.115f, 17.291f)
                curveTo(16.115f, 17.883f, 17.379f, 17.162f, 17.379f, 16f)
                verticalLineTo(8.002f)
                curveTo(17.379f, 6.84f, 16.115f, 6.12f, 15.115f, 6.711f)
                lineTo(8.621f, 10.554f)
                verticalLineTo(7f)
                close()
                moveTo(10.103f, 12.001f)
                lineTo(15.379f, 15.123f)
                verticalLineTo(8.879f)
                lineTo(10.103f, 12.001f)
                close()
            }
        }.build()
        return backwardStep!!
    }

private var backwardStep: ImageVector? = null