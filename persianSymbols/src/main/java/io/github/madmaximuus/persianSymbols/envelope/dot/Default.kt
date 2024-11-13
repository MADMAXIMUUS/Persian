package io.github.madmaximuus.persianSymbols.envelope.dot

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.EnvelopeDot: ImageVector
    get() {
        if (envelopeDot != null) {
            return envelopeDot!!
        }
        envelopeDot = Builder(
            name = "envelope-dot-default",
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
                moveTo(6.5f, 4f)
                horizontalLineTo(16.171f)
                curveTo(16.06f, 4.313f, 16f, 4.649f, 16f, 5f)
                curveTo(16f, 5.351f, 16.06f, 5.687f, 16.171f, 6f)
                horizontalLineTo(6.5f)
                curveTo(6.257f, 6f, 6.022f, 6.035f, 5.799f, 6.1f)
                lineTo(11.4f, 10.3f)
                curveTo(11.756f, 10.567f, 12.244f, 10.567f, 12.6f, 10.3f)
                lineTo(16.861f, 7.104f)
                curveTo(17.406f, 7.657f, 18.163f, 8f, 19f, 8f)
                lineTo(13.8f, 11.9f)
                curveTo(12.733f, 12.7f, 11.267f, 12.7f, 10.2f, 11.9f)
                lineTo(4.24f, 7.43f)
                curveTo(4.086f, 7.754f, 4f, 8.117f, 4f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(4f, 16.881f, 5.119f, 18f, 6.5f, 18f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 18f, 20f, 16.881f, 20f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(20f, 8.278f, 19.971f, 8.062f, 19.917f, 7.857f)
                curveTo(20.608f, 7.636f, 21.191f, 7.17f, 21.562f, 6.561f)
                curveTo(21.843f, 7.148f, 22f, 7.806f, 22f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(22f, 17.985f, 19.985f, 20f, 17.5f, 20f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 20f, 2f, 17.985f, 2f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(2f, 7.365f, 2.42f, 6.328f, 3.114f, 5.536f)
                curveTo(3.139f, 5.489f, 3.167f, 5.444f, 3.2f, 5.4f)
                curveTo(3.293f, 5.277f, 3.408f, 5.181f, 3.536f, 5.114f)
                curveTo(4.328f, 4.42f, 5.365f, 4f, 6.5f, 4f)
                close()
            }
        }.build()
        return envelopeDot!!
    }

private var envelopeDot: ImageVector? = null