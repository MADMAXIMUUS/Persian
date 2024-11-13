package io.github.madmaximuus.persianSymbols.backward.step

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.BackwardStep: ImageVector
    get() {
        if (backwardStep != null) {
            return backwardStep!!
        }
        backwardStep = ImageVector.Builder(
            name = "backward-step-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.776f, 7f)
                curveTo(8.776f, 6.448f, 8.328f, 6f, 7.776f, 6f)
                curveTo(7.224f, 6f, 6.776f, 6.448f, 6.776f, 7f)
                verticalLineTo(17f)
                curveTo(6.776f, 17.552f, 7.224f, 18f, 7.776f, 18f)
                curveTo(8.328f, 18f, 8.776f, 17.552f, 8.776f, 17f)
                verticalLineTo(13.168f)
                lineTo(15.707f, 17.354f)
                curveTo(16.374f, 17.757f, 17.224f, 17.277f, 17.224f, 16.498f)
                verticalLineTo(7.502f)
                curveTo(17.224f, 6.723f, 16.374f, 6.243f, 15.707f, 6.646f)
                lineTo(8.776f, 10.832f)
                verticalLineTo(7f)
                close()
            }
        }.build()
        return backwardStep!!
    }

private var backwardStep: ImageVector? = null