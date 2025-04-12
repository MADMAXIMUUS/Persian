package io.github.madmaximuus.persianSymbols.clock.badge

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ClockBadge: ImageVector
    get() {
        if (clockBadge != null) {
            return clockBadge!!
        }
        clockBadge = ImageVector.Builder(
            name = "clock-badge-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 12f)
                curveTo(4f, 7.582f, 7.582f, 4f, 12f, 4f)
                curveTo(12.908f, 4f, 13.78f, 4.151f, 14.594f, 4.43f)
                curveTo(14.898f, 3.771f, 15.387f, 3.215f, 15.995f, 2.83f)
                curveTo(14.772f, 2.296f, 13.42f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 10.58f, 21.704f, 9.228f, 21.17f, 8.004f)
                curveTo(20.785f, 8.613f, 20.229f, 9.102f, 19.57f, 9.406f)
                curveTo(19.849f, 10.22f, 20f, 11.092f, 20f, 12f)
                curveTo(20f, 16.418f, 16.418f, 20f, 12f, 20f)
                curveTo(7.582f, 20f, 4f, 16.418f, 4f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.75f, 8f)
                curveTo(12.75f, 7.586f, 12.414f, 7.25f, 12f, 7.25f)
                curveTo(11.586f, 7.25f, 11.25f, 7.586f, 11.25f, 8f)
                verticalLineTo(11.586f)
                curveTo(11.25f, 12.05f, 11.434f, 12.495f, 11.763f, 12.823f)
                lineTo(15.47f, 16.53f)
                curveTo(15.763f, 16.823f, 16.237f, 16.823f, 16.53f, 16.53f)
                curveTo(16.823f, 16.237f, 16.823f, 15.763f, 16.53f, 15.47f)
                lineTo(12.823f, 11.763f)
                curveTo(12.776f, 11.716f, 12.75f, 11.652f, 12.75f, 11.586f)
                verticalLineTo(8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 9f)
                curveTo(19.657f, 9f, 21f, 7.657f, 21f, 6f)
                curveTo(21f, 4.343f, 19.657f, 3f, 18f, 3f)
                curveTo(16.343f, 3f, 15f, 4.343f, 15f, 6f)
                curveTo(15f, 7.657f, 16.343f, 9f, 18f, 9f)
                close()
            }
        }.build()

        return clockBadge!!
    }

private var clockBadge: ImageVector? = null