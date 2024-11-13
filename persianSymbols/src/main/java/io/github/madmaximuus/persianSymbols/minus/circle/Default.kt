package io.github.madmaximuus.persianSymbols.minus.circle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.MinusCircle: ImageVector
    get() {
        if (minusCircle != null) {
            return minusCircle!!
        }
        minusCircle = Builder(
            name = "minus-circle-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.5f, 11.25f)
                curveTo(8.086f, 11.25f, 7.75f, 11.586f, 7.75f, 12f)
                curveTo(7.75f, 12.414f, 8.086f, 12.75f, 8.5f, 12.75f)
                horizontalLineTo(15.5f)
                curveTo(15.914f, 12.75f, 16.25f, 12.414f, 16.25f, 12f)
                curveTo(16.25f, 11.586f, 15.914f, 11.25f, 15.5f, 11.25f)
                horizontalLineTo(8.5f)
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
        return minusCircle!!
    }

private var minusCircle: ImageVector? = null