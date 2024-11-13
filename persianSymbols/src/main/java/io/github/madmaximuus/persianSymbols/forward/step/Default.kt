package io.github.madmaximuus.persianSymbols.forward.step

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ForwardStep: ImageVector
    get() {
        if (forwardStep != null) {
            return forwardStep!!
        }
        forwardStep = ImageVector.Builder(
            name = "forward-step-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.88f, 7f)
                curveTo(16.88f, 6.448f, 16.432f, 6f, 15.88f, 6f)
                curveTo(15.328f, 6f, 14.88f, 6.448f, 14.88f, 7f)
                verticalLineTo(9.964f)
                lineTo(9.384f, 6.711f)
                curveTo(8.384f, 6.12f, 7.12f, 6.84f, 7.12f, 8.002f)
                verticalLineTo(16f)
                curveTo(7.12f, 17.162f, 8.384f, 17.883f, 9.384f, 17.291f)
                lineTo(14.88f, 14.039f)
                verticalLineTo(17f)
                curveTo(14.88f, 17.552f, 15.328f, 18f, 15.88f, 18f)
                curveTo(16.432f, 18f, 16.88f, 17.552f, 16.88f, 17f)
                verticalLineTo(7f)
                close()
                moveTo(14.396f, 12.001f)
                lineTo(9.12f, 15.123f)
                verticalLineTo(8.879f)
                lineTo(14.396f, 12.001f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.88f, 7f)
                curveTo(16.88f, 6.448f, 16.432f, 6f, 15.88f, 6f)
                curveTo(15.328f, 6f, 14.88f, 6.448f, 14.88f, 7f)
                verticalLineTo(9.964f)
                lineTo(9.384f, 6.711f)
                curveTo(8.384f, 6.12f, 7.12f, 6.84f, 7.12f, 8.002f)
                verticalLineTo(16f)
                curveTo(7.12f, 17.162f, 8.384f, 17.883f, 9.384f, 17.291f)
                lineTo(14.88f, 14.039f)
                verticalLineTo(17f)
                curveTo(14.88f, 17.552f, 15.328f, 18f, 15.88f, 18f)
                curveTo(16.432f, 18f, 16.88f, 17.552f, 16.88f, 17f)
                verticalLineTo(7f)
                close()
                moveTo(14.396f, 12.001f)
                lineTo(9.12f, 15.123f)
                verticalLineTo(8.879f)
                lineTo(14.396f, 12.001f)
                close()
            }
        }.build()
        return forwardStep!!
    }

private var forwardStep: ImageVector? = null