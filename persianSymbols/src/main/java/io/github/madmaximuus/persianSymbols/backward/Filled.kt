package io.github.madmaximuus.persianSymbols.backward

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Backward: ImageVector
    get() {
        if (backward != null) {
            return backward!!
        }
        backward = Builder(
            name = "backward-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.93f, 6.646f)
                lineTo(3.482f, 11.144f)
                curveTo(2.838f, 11.533f, 2.838f, 12.467f, 3.482f, 12.856f)
                lineTo(10.93f, 17.354f)
                curveTo(11.596f, 17.757f, 12.447f, 17.277f, 12.447f, 16.498f)
                verticalLineTo(13.104f)
                lineTo(19.484f, 17.354f)
                curveTo(20.151f, 17.757f, 21.001f, 17.277f, 21.001f, 16.498f)
                verticalLineTo(7.502f)
                curveTo(21.001f, 6.723f, 20.151f, 6.243f, 19.484f, 6.646f)
                lineTo(12.447f, 10.896f)
                verticalLineTo(7.502f)
                curveTo(12.447f, 6.723f, 11.596f, 6.243f, 10.93f, 6.646f)
                close()
            }
        }.build()
        return backward!!
    }

private var backward: ImageVector? = null