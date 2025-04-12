package io.github.madmaximuus.persianSymbols.envelope.badge

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.EnvelopeBadge: ImageVector
    get() {
        if (envelopeBadge != null) {
            return envelopeBadge!!
        }
        envelopeBadge = Builder(
            name = "envelope-badge-default",
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
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22f, 8.5f)
                curveTo(22f, 7.806f, 21.843f, 7.148f, 21.562f, 6.561f)
                curveTo(21.191f, 7.17f, 20.608f, 7.636f, 19.917f, 7.857f)
                curveTo(19.971f, 8.062f, 20f, 8.278f, 20f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(20f, 15.932f, 19.89f, 16.339f, 19.697f, 16.694f)
                lineTo(15.032f, 12.029f)
                lineTo(19.061f, 7.999f)
                curveTo(19.041f, 8f, 19.021f, 8f, 19f, 8f)
                curveTo(18.412f, 8f, 17.864f, 7.831f, 17.401f, 7.539f)
                lineTo(12.53f, 12.409f)
                curveTo(12.237f, 12.702f, 11.763f, 12.702f, 11.47f, 12.409f)
                lineTo(5.344f, 6.283f)
                curveTo(5.689f, 6.102f, 6.083f, 6f, 6.5f, 6f)
                horizontalLineTo(16.171f)
                curveTo(16.06f, 5.687f, 16f, 5.351f, 16f, 5f)
                curveTo(16f, 4.649f, 16.06f, 4.313f, 16.171f, 4f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 4f, 2f, 6.015f, 2f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2f, 17.985f, 4.015f, 20f, 6.5f, 20f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 20f, 22f, 17.985f, 22f, 15.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(4f, 8.5f)
                curveTo(4f, 8.083f, 4.102f, 7.689f, 4.283f, 7.344f)
                lineTo(8.968f, 12.029f)
                lineTo(4.303f, 16.694f)
                curveTo(4.11f, 16.339f, 4f, 15.932f, 4f, 15.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(5.381f, 17.736f)
                curveTo(5.718f, 17.905f, 6.098f, 18f, 6.5f, 18f)
                horizontalLineTo(17.5f)
                curveTo(17.902f, 18f, 18.282f, 17.905f, 18.618f, 17.736f)
                lineTo(13.971f, 13.089f)
                lineTo(13.591f, 13.47f)
                curveTo(12.712f, 14.348f, 11.288f, 14.348f, 10.409f, 13.47f)
                lineTo(10.029f, 13.089f)
                lineTo(5.381f, 17.736f)
                close()
            }
        }.build()
        return envelopeBadge!!
    }

private var envelopeBadge: ImageVector? = null