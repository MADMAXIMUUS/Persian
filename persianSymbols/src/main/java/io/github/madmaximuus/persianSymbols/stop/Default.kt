package io.github.madmaximuus.persianSymbols.stop

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Stop: ImageVector
    get() {
        if (stop != null) {
            return stop!!
        }
        stop = Builder(
            name = "stop-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f
            ) {
                moveTo(9.5f, 6f)
                lineTo(14.5f, 6f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 9.5f)
                lineTo(18f, 14.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 18f)
                lineTo(9.5f, 18f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 14.5f)
                lineTo(6f, 9.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 6f)
                close()
            }
        }.build()
        return stop!!
    }

private var stop: ImageVector? = null