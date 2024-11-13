package io.github.madmaximuus.persianSymbols.utensils

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Utensils: ImageVector
    get() {
        if (utensils != null) {
            return utensils!!
        }
        utensils = ImageVector.Builder(
            name = "utensils-default",
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
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.994f, 4f)
                curveTo(19.547f, 4f, 19.994f, 4.448f, 19.994f, 5f)
                verticalLineTo(5.099f)
                curveTo(19.997f, 5.133f, 19.999f, 5.166f, 19.999f, 5.2f)
                verticalLineTo(13f)
                curveTo(19.999f, 13.044f, 19.997f, 13.087f, 19.994f, 13.131f)
                verticalLineTo(19f)
                curveTo(19.994f, 19.552f, 19.547f, 20f, 18.994f, 20f)
                curveTo(18.442f, 20f, 17.994f, 19.552f, 17.994f, 19f)
                verticalLineTo(15f)
                horizontalLineTo(15.976f)
                curveTo(14.874f, 15f, 13.98f, 14.111f, 13.967f, 13.013f)
                curveTo(13.95f, 11.486f, 13.938f, 9.371f, 14.471f, 7.609f)
                curveTo(14.742f, 6.714f, 15.174f, 5.834f, 15.884f, 5.16f)
                curveTo(16.613f, 4.467f, 17.569f, 4.055f, 18.753f, 4.005f)
                curveTo(18.796f, 4.003f, 18.839f, 4.004f, 18.881f, 4.006f)
                curveTo(18.918f, 4.002f, 18.956f, 4f, 18.994f, 4f)
                close()
                moveTo(17.994f, 13f)
                verticalLineTo(6.158f)
                curveTo(17.696f, 6.266f, 17.458f, 6.423f, 17.261f, 6.61f)
                curveTo(16.888f, 6.965f, 16.596f, 7.492f, 16.385f, 8.188f)
                curveTo(15.956f, 9.607f, 15.949f, 11.41f, 15.967f, 12.99f)
                curveTo(15.967f, 12.991f, 15.967f, 12.992f, 15.967f, 12.992f)
                curveTo(15.967f, 12.993f, 15.969f, 12.995f, 15.97f, 12.997f)
                curveTo(15.972f, 12.998f, 15.973f, 12.999f, 15.973f, 13f)
                lineTo(15.975f, 13f)
                lineTo(15.976f, 13f)
                horizontalLineTo(17.994f)
                close()
            }
        }.build()

        return utensils!!
    }

private var utensils: ImageVector? = null