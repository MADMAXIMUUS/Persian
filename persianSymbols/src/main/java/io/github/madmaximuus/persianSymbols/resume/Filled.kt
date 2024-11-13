package io.github.madmaximuus.persianSymbols.resume

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Resume: ImageVector
    get() {
        if (resume != null) {
            return resume!!
        }
        resume = Builder(
            name = "resume-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 7f)
                curveTo(8f, 6.448f, 7.552f, 6f, 7f, 6f)
                curveTo(6.448f, 6f, 6f, 6.448f, 6f, 7f)
                verticalLineTo(17f)
                curveTo(6f, 17.552f, 6.448f, 18f, 7f, 18f)
                curveTo(7.552f, 18f, 8f, 17.552f, 8f, 17f)
                lineTo(8f, 7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.555f, 7.036f)
                lineTo(18.752f, 11.168f)
                curveTo(19.346f, 11.564f, 19.346f, 12.436f, 18.752f, 12.832f)
                lineTo(12.555f, 16.963f)
                curveTo(11.89f, 17.407f, 11f, 16.93f, 11f, 16.132f)
                verticalLineTo(7.869f)
                curveTo(11f, 7.07f, 11.89f, 6.593f, 12.555f, 7.036f)
                close()
            }
        }.build()
        return resume!!
    }

private var resume: ImageVector? = null