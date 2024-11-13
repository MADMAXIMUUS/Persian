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
                curveTo(20.688f, 21.073f, 21.413f, 19.9f, 20.915f, 18.902f)
                lineTo(13.342f, 3.756f)
                curveTo(12.789f, 2.651f, 11.211f, 2.651f, 10.658f, 3.756f)
                lineTo(3.085f, 18.902f)
                curveTo(2.587f, 19.9f, 3.312f, 21.073f, 4.427f, 21.073f)
                close()
                moveTo(12f, 8.5f)
                curveTo(12.414f, 8.5f, 12.75f, 8.836f, 12.75f, 9.25f)
                lineTo(12.75f, 14.724f)
                curveTo(12.75f, 15.138f, 12.414f, 15.474f, 12f, 15.474f)
                curveTo(11.586f, 15.474f, 11.25f, 15.138f, 11.25f, 14.724f)
                lineTo(11.25f, 9.25f)
                curveTo(11.25f, 8.836f, 11.586f, 8.5f, 12f, 8.5f)
                close()
                moveTo(13.002f, 17.09f)
                curveTo(13.002f, 17.642f, 12.554f, 18.09f, 12.002f, 18.09f)
                curveTo(11.45f, 18.09f, 11.002f, 17.642f, 11.002f, 17.09f)
                curveTo(11.002f, 16.538f, 11.45f, 16.09f, 12.002f, 16.09f)
                curveTo(12.554f, 16.09f, 13.002f, 16.538f, 13.002f, 17.09f)
                close()
            }
        }.build()
        return warning!!
    }

private var warning: ImageVector? = null