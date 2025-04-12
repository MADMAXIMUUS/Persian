package io.github.madmaximuus.persianSymbols.warning

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Warning: ImageVector
    get() {
        if (warning != null) {
            return warning!!
        }
        warning = Builder(
            name = "warning-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.427f, 21.073f)
                horizontalLineTo(19.573f)
                curveTo(20.688f, 21.073f, 21.413f, 19.899f, 20.915f, 18.902f)
                lineTo(13.342f, 3.756f)
                curveTo(12.789f, 2.65f, 11.211f, 2.65f, 10.658f, 3.756f)
                lineTo(3.085f, 18.902f)
                curveTo(2.587f, 19.899f, 3.312f, 21.073f, 4.427f, 21.073f)
                close()
                moveTo(12f, 8.5f)
                curveTo(12.414f, 8.5f, 12.75f, 8.835f, 12.75f, 9.25f)
                lineTo(12.75f, 14.723f)
                curveTo(12.75f, 15.137f, 12.414f, 15.473f, 12f, 15.473f)
                curveTo(11.586f, 15.473f, 11.25f, 15.137f, 11.25f, 14.723f)
                lineTo(11.25f, 9.25f)
                curveTo(11.25f, 8.835f, 11.586f, 8.5f, 12f, 8.5f)
                close()
                moveTo(13.002f, 17.089f)
                curveTo(13.002f, 17.642f, 12.554f, 18.089f, 12.002f, 18.089f)
                curveTo(11.45f, 18.089f, 11.002f, 17.642f, 11.002f, 17.089f)
                curveTo(11.002f, 16.537f, 11.45f, 16.089f, 12.002f, 16.089f)
                curveTo(12.554f, 16.089f, 13.002f, 16.537f, 13.002f, 17.089f)
                close()
            }
        }.build()
        return warning!!
    }

private var warning: ImageVector? = null