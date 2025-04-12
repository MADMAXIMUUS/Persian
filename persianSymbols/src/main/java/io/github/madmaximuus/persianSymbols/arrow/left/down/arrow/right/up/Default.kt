package io.github.madmaximuus.persianSymbols.arrow.left.down.arrow.right.up

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ArrowLeftDownArrowRightUp: ImageVector
    get() {
        if (arrowLeftDownArrowRightUp != null) {
            return arrowLeftDownArrowRightUp!!
        }
        arrowLeftDownArrowRightUp = Builder(
            name = "arrow-left-down-arrow-right-up-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.005f, 11.988f)
                curveTo(18.454f, 11.991f, 18.005f, 11.545f, 18.003f, 10.994f)
                lineTo(17.989f, 7.423f)
                lineTo(14.206f, 11.206f)
                curveTo(13.816f, 11.596f, 13.184f, 11.596f, 12.794f, 11.206f)
                curveTo(12.404f, 10.816f, 12.404f, 10.184f, 12.794f, 9.794f)
                lineTo(16.581f, 6.006f)
                lineTo(12.991f, 6.02f)
                curveTo(12.44f, 6.022f, 11.991f, 5.577f, 11.989f, 5.025f)
                curveTo(11.987f, 4.474f, 12.432f, 4.025f, 12.983f, 4.023f)
                lineTo(18.975f, 4f)
                curveTo(19.526f, 3.998f, 19.975f, 4.443f, 19.977f, 4.995f)
                lineTo(20f, 10.986f)
                curveTo(20.002f, 11.538f, 19.557f, 11.986f, 19.005f, 11.988f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.998f, 12.011f)
                curveTo(5.55f, 12.011f, 5.997f, 12.458f, 5.997f, 13.01f)
                verticalLineTo(16.591f)
                lineTo(9.787f, 12.801f)
                curveTo(10.177f, 12.411f, 10.809f, 12.411f, 11.199f, 12.801f)
                curveTo(11.589f, 13.191f, 11.589f, 13.823f, 11.199f, 14.213f)
                lineTo(7.409f, 18.003f)
                horizontalLineTo(10.99f)
                curveTo(11.541f, 18.003f, 11.988f, 18.45f, 11.988f, 19.001f)
                curveTo(11.988f, 19.553f, 11.541f, 20f, 10.99f, 20f)
                horizontalLineTo(5.014f)
                curveTo(4.756f, 20.004f, 4.497f, 19.909f, 4.299f, 19.714f)
                curveTo(4.287f, 19.702f, 4.276f, 19.691f, 4.265f, 19.678f)
                curveTo(4.201f, 19.609f, 4.148f, 19.533f, 4.107f, 19.453f)
                curveTo(4.039f, 19.317f, 4f, 19.164f, 4f, 19.001f)
                verticalLineTo(13.01f)
                curveTo(4f, 12.458f, 4.447f, 12.011f, 4.998f, 12.011f)
                close()
            }
        }.build()
        return arrowLeftDownArrowRightUp!!
    }

private var arrowLeftDownArrowRightUp: ImageVector? = null