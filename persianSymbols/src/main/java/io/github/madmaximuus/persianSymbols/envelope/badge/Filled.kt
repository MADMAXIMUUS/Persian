package io.github.madmaximuus.persianSymbols.envelope.badge

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.EnvelopeBadge: ImageVector
    get() {
        if (envelopeBadge != null) {
            return envelopeBadge!!
        }
        envelopeBadge = Builder(
            name = "envelope-badge-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 7f)
                curveTo(20.105f, 7f, 21f, 6.105f, 21f, 5f)
                curveTo(21f, 3.895f, 20.105f, 3f, 19f, 3f)
                curveTo(17.895f, 3f, 17f, 3.895f, 17f, 5f)
                curveTo(17f, 6.105f, 17.895f, 7f, 19f, 7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 5f)
                curveTo(16f, 6.069f, 16.559f, 7.007f, 17.401f, 7.539f)
                lineTo(12.53f, 12.409f)
                curveTo(12.237f, 12.702f, 11.762f, 12.702f, 11.47f, 12.409f)
                lineTo(3.864f, 4.804f)
                curveTo(4.581f, 4.297f, 5.456f, 4f, 6.4f, 4f)
                horizontalLineTo(16.171f)
                curveTo(16.06f, 4.313f, 16f, 4.649f, 16f, 5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.032f, 12.029f)
                lineTo(19.061f, 7.999f)
                curveTo(20.135f, 7.978f, 21.07f, 7.393f, 21.583f, 6.527f)
                curveTo(21.85f, 7.095f, 22f, 7.73f, 22f, 8.4f)
                verticalLineTo(15.6f)
                curveTo(22f, 16.559f, 21.693f, 17.446f, 21.173f, 18.169f)
                lineTo(15.032f, 12.029f)
                close()
            }
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
        }.build()
        return envelopeBadge!!
    }

private var envelopeBadge: ImageVector? = null