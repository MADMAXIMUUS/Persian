package io.github.madmaximuus.persianSymbols.box

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Box: ImageVector
    get() {
        if (box != null) {
            return box!!
        }
        box = ImageVector.Builder(
            name = "box-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.4f, 3f)
                lineTo(16.6f, 3f)
                arcTo(4.4f, 4.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 7.4f)
                lineTo(21f, 16.6f)
                arcTo(4.4f, 4.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.6f, 21f)
                lineTo(7.4f, 21f)
                arcTo(4.4f, 4.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 16.6f)
                lineTo(3f, 7.4f)
                arcTo(4.4f, 4.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.4f, 3f)
                close()
            }
        }.build()
        return box!!
    }

private var box: ImageVector? = null