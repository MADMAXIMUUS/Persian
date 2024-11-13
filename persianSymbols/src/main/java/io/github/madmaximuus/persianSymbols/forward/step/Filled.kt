package io.github.madmaximuus.persianSymbols.forward.step

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.ForwardStep: ImageVector
    get() {
        if (forwardStep != null) {
            return forwardStep!!
        }
        forwardStep = ImageVector.Builder(
            name = "forward-step-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.224f, 17f)
                curveTo(15.224f, 17.552f, 15.672f, 18f, 16.224f, 18f)
                curveTo(16.776f, 18f, 17.224f, 17.552f, 17.224f, 17f)
                verticalLineTo(7f)
                curveTo(17.224f, 6.448f, 16.776f, 6f, 16.224f, 6f)
                curveTo(15.672f, 6f, 15.224f, 6.448f, 15.224f, 7f)
                lineTo(15.224f, 10.832f)
                lineTo(8.293f, 6.646f)
                curveTo(7.627f, 6.243f, 6.776f, 6.723f, 6.776f, 7.502f)
                lineTo(6.776f, 16.498f)
                curveTo(6.776f, 17.277f, 7.627f, 17.757f, 8.293f, 17.354f)
                lineTo(15.224f, 13.168f)
                verticalLineTo(17f)
                close()
            }
        }.build()
        return forwardStep!!
    }

private var forwardStep: ImageVector? = null