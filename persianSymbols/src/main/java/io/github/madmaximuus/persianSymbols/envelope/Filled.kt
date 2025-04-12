package io.github.madmaximuus.persianSymbols.envelope

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Envelope: ImageVector
    get() {
        if (envelope != null) {
            return envelope!!
        }
        envelope = Builder(
            name = "envelope-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2f, 8.4f)
                curveTo(2f, 7.456f, 2.297f, 6.581f, 2.804f, 5.864f)
                lineTo(8.968f, 12.029f)
                lineTo(2.827f, 18.169f)
                curveTo(2.307f, 17.446f, 2f, 16.559f, 2f, 15.6f)
                verticalLineTo(8.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.898f, 19.22f)
                curveTo(4.608f, 19.712f, 5.471f, 20f, 6.4f, 20f)
                horizontalLineTo(17.6f)
                curveTo(18.529f, 20f, 19.392f, 19.712f, 20.102f, 19.22f)
                lineTo(13.971f, 13.089f)
                lineTo(13.591f, 13.47f)
                curveTo(12.712f, 14.348f, 11.288f, 14.348f, 10.409f, 13.47f)
                lineTo(10.029f, 13.089f)
                lineTo(3.898f, 19.22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.032f, 12.029f)
                lineTo(21.173f, 18.169f)
                curveTo(21.693f, 17.446f, 22f, 16.559f, 22f, 15.6f)
                verticalLineTo(8.4f)
                curveTo(22f, 7.456f, 21.703f, 6.581f, 21.196f, 5.864f)
                lineTo(15.032f, 12.029f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.864f, 4.804f)
                curveTo(4.581f, 4.297f, 5.456f, 4f, 6.4f, 4f)
                horizontalLineTo(17.6f)
                curveTo(18.544f, 4f, 19.419f, 4.297f, 20.136f, 4.804f)
                lineTo(12.53f, 12.409f)
                curveTo(12.237f, 12.702f, 11.762f, 12.702f, 11.47f, 12.409f)
                lineTo(3.864f, 4.804f)
                close()
            }
        }.build()
        return envelope!!
    }

private var envelope: ImageVector? = null