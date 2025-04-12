package io.github.madmaximuus.persianSymbols.fork.knife

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.ForkKnife: ImageVector
    get() {
        if (forkKnife != null) {
            return forkKnife!!
        }
        forkKnife = ImageVector.Builder(
            name = "fork-knife-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 5f)
                curveTo(6f, 4.448f, 5.552f, 4f, 5f, 4f)
                curveTo(4.448f, 4f, 4f, 4.448f, 4f, 5f)
                verticalLineTo(5.025f)
                curveTo(4f, 6.404f, 4f, 7.563f, 4.048f, 8.507f)
                curveTo(4.096f, 9.445f, 4.194f, 10.267f, 4.433f, 10.936f)
                curveTo(4.688f, 11.649f, 5.115f, 12.224f, 5.805f, 12.582f)
                curveTo(6.169f, 12.77f, 6.572f, 12.88f, 7f, 12.939f)
                lineTo(7f, 19f)
                curveTo(7f, 19.552f, 7.448f, 20f, 8f, 20f)
                curveTo(8.552f, 20f, 9f, 19.552f, 9f, 19f)
                lineTo(9f, 12.939f)
                curveTo(9.428f, 12.88f, 9.831f, 12.77f, 10.195f, 12.582f)
                curveTo(10.884f, 12.224f, 11.312f, 11.649f, 11.567f, 10.936f)
                curveTo(11.806f, 10.267f, 11.904f, 9.445f, 11.952f, 8.507f)
                curveTo(12f, 7.563f, 12f, 6.405f, 12f, 5.025f)
                verticalLineTo(5f)
                curveTo(12f, 4.448f, 11.552f, 4f, 11f, 4f)
                curveTo(10.448f, 4f, 10f, 4.448f, 10f, 5f)
                curveTo(10f, 6.41f, 10f, 7.518f, 9.954f, 8.405f)
                curveTo(9.909f, 9.305f, 9.819f, 9.883f, 9.683f, 10.264f)
                curveTo(9.563f, 10.601f, 9.428f, 10.726f, 9.274f, 10.806f)
                curveTo(9.067f, 10.913f, 8.698f, 11f, 8f, 11f)
                curveTo(7.301f, 11f, 6.933f, 10.913f, 6.726f, 10.806f)
                curveTo(6.572f, 10.726f, 6.437f, 10.601f, 6.317f, 10.264f)
                curveTo(6.181f, 9.883f, 6.091f, 9.305f, 6.046f, 8.405f)
                curveTo(6f, 7.518f, 6f, 6.41f, 6f, 5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 4f)
                curveTo(8.552f, 4f, 9f, 4.448f, 9f, 5f)
                verticalLineTo(9f)
                curveTo(9f, 9.552f, 8.552f, 10f, 8f, 10f)
                curveTo(7.448f, 10f, 7f, 9.552f, 7f, 9f)
                lineTo(7f, 5f)
                curveTo(7f, 4.448f, 7.448f, 4f, 8f, 4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.994f, 4f)
                curveTo(19.282f, 4f, 19.542f, 4.122f, 19.725f, 4.317f)
                curveTo(19.895f, 4.49f, 20f, 4.734f, 20f, 5f)
                verticalLineTo(15f)
                horizontalLineTo(19.994f)
                verticalLineTo(19f)
                curveTo(19.994f, 19.552f, 19.547f, 20f, 18.994f, 20f)
                curveTo(18.442f, 20f, 17.994f, 19.552f, 17.994f, 19f)
                verticalLineTo(15f)
                horizontalLineTo(16.022f)
                curveTo(14.917f, 15f, 14.005f, 14.105f, 14f, 13.001f)
                curveTo(13.986f, 9.554f, 14.309f, 5.018f, 18.471f, 4.148f)
                curveTo(18.623f, 4.054f, 18.802f, 4f, 18.994f, 4f)
                close()
            }
        }.build()

        return forkKnife!!
    }

private var forkKnife: ImageVector? = null