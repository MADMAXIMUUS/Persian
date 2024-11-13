package io.github.madmaximuus.persianSymbols.backward

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Backward: ImageVector
    get() {
        if (backward != null) {
            return backward!!
        }
        backward = Builder(
            name = "backward-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.495f, 6.711f)
                curveTo(11.495f, 6.12f, 12.759f, 6.84f, 12.759f, 8.002f)
                verticalLineTo(10.248f)
                lineTo(18.735f, 6.711f)
                curveTo(19.735f, 6.12f, 20.999f, 6.84f, 20.999f, 8.002f)
                verticalLineTo(16f)
                curveTo(20.999f, 17.162f, 19.735f, 17.883f, 18.735f, 17.291f)
                lineTo(12.759f, 13.755f)
                verticalLineTo(16f)
                curveTo(12.759f, 17.162f, 11.495f, 17.883f, 10.495f, 17.291f)
                lineTo(3.737f, 13.292f)
                curveTo(2.756f, 12.711f, 2.756f, 11.291f, 3.737f, 10.71f)
                lineTo(10.495f, 6.711f)
                close()
                moveTo(10.759f, 15.123f)
                verticalLineTo(8.879f)
                lineTo(5.483f, 12.001f)
                lineTo(10.759f, 15.123f)
                close()
                moveTo(18.999f, 15.123f)
                verticalLineTo(8.879f)
                lineTo(13.723f, 12.001f)
                lineTo(18.999f, 15.123f)
                close()
            }
        }.build()
        return backward!!
    }

private var backward: ImageVector? = null