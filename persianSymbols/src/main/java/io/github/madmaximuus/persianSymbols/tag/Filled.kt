package io.github.madmaximuus.persianSymbols.tag

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Tag: ImageVector
    get() {
        if (tag != null) {
            return tag!!
        }
        tag = Builder(
            name = "tag-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2f, 8.4f)
                lineTo(2f, 15.6f)
                curveTo(2f, 18.03f, 3.97f, 20f, 6.4f, 20f)
                lineTo(14.643f, 20f)
                curveTo(15.082f, 20f, 15.499f, 19.807f, 15.784f, 19.473f)
                lineTo(21.189f, 13.132f)
                curveTo(21.659f, 12.581f, 21.668f, 11.773f, 21.21f, 11.212f)
                lineTo(15.785f, 4.553f)
                curveTo(15.5f, 4.203f, 15.073f, 4f, 14.622f, 4f)
                lineTo(6.4f, 4f)
                curveTo(3.97f, 4f, 2f, 5.97f, 2f, 8.4f)
                close()
            }
        }.build()
        return tag!!
    }

private var tag: ImageVector? = null