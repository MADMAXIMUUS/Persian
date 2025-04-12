package io.github.madmaximuus.persianSymbols.arrow.left.arrow.right

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ArrowLeftArrowRight: ImageVector
    get() {
        if (arrowLeftArrowRight != null) {
            return arrowLeftArrowRight!!
        }
        arrowLeftArrowRight = Builder(
            name = "arrow-left-arrow-right-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.2f, 5.764f)
                curveTo(8.623f, 5.408f, 8.676f, 4.777f, 8.32f, 4.355f)
                curveTo(7.964f, 3.933f, 7.333f, 3.88f, 6.911f, 4.236f)
                lineTo(3.355f, 7.236f)
                curveTo(3.13f, 7.426f, 3f, 7.705f, 3f, 8f)
                curveTo(3f, 8.295f, 3.13f, 8.574f, 3.355f, 8.764f)
                lineTo(6.911f, 11.764f)
                curveTo(7.333f, 12.12f, 7.964f, 12.067f, 8.32f, 11.645f)
                curveTo(8.676f, 11.223f, 8.623f, 10.592f, 8.2f, 10.236f)
                lineTo(6.736f, 9f)
                horizontalLineTo(20f)
                curveTo(20.552f, 9f, 21f, 8.552f, 21f, 8f)
                curveTo(21f, 7.448f, 20.552f, 7f, 20f, 7f)
                horizontalLineTo(6.736f)
                lineTo(8.2f, 5.764f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.8f, 18.236f)
                curveTo(15.377f, 18.592f, 15.324f, 19.223f, 15.68f, 19.645f)
                curveTo(16.036f, 20.067f, 16.667f, 20.12f, 17.089f, 19.764f)
                lineTo(20.645f, 16.764f)
                curveTo(20.87f, 16.574f, 21f, 16.295f, 21f, 16f)
                curveTo(21f, 15.705f, 20.87f, 15.426f, 20.645f, 15.236f)
                lineTo(17.089f, 12.236f)
                curveTo(16.667f, 11.88f, 16.036f, 11.933f, 15.68f, 12.355f)
                curveTo(15.324f, 12.777f, 15.377f, 13.408f, 15.8f, 13.764f)
                lineTo(17.264f, 15f)
                lineTo(4f, 15f)
                curveTo(3.448f, 15f, 3f, 15.448f, 3f, 16f)
                curveTo(3f, 16.552f, 3.448f, 17f, 4f, 17f)
                lineTo(17.264f, 17f)
                lineTo(15.8f, 18.236f)
                close()
            }
        }.build()
        return arrowLeftArrowRight!!
    }

private var arrowLeftArrowRight: ImageVector? = null