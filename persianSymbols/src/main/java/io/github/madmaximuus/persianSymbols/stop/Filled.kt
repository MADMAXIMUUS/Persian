package io.github.madmaximuus.persianSymbols.stop

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Stop: ImageVector
    get() {
        if (stop != null) {
            return stop!!
        }
        stop = Builder(
            name = "stop-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.4f, 5f)
                lineTo(14.6f, 5f)
                arcTo(4.4f, 4.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 9.4f)
                lineTo(19f, 14.6f)
                arcTo(4.4f, 4.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.6f, 19f)
                lineTo(9.4f, 19f)
                arcTo(4.4f, 4.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 14.6f)
                lineTo(5f, 9.4f)
                arcTo(4.4f, 4.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.4f, 5f)
                close()
            }
        }.build()
        return stop!!
    }

private var stop: ImageVector? = null