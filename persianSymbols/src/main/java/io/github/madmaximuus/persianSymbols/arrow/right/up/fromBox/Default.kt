package io.github.madmaximuus.persianSymbols.arrow.right.up.fromBox

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ArrowRightUpFromBox: ImageVector
    get() {
        if (arrowRightUpFromBox != null) {
            return arrowRightUpFromBox!!
        }
        arrowRightUpFromBox = ImageVector.Builder(
            name = "arrow-right-up-from-box",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 7.5f)
                curveTo(5f, 6.119f, 6.119f, 5f, 7.5f, 5f)
                horizontalLineTo(10f)
                curveTo(10.552f, 5f, 11f, 4.552f, 11f, 4f)
                curveTo(11f, 3.448f, 10.552f, 3f, 10f, 3f)
                horizontalLineTo(7.5f)
                curveTo(5.015f, 3f, 3f, 5.015f, 3f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(3f, 18.985f, 5.015f, 21f, 7.5f, 21f)
                horizontalLineTo(16.5f)
                curveTo(18.985f, 21f, 21f, 18.985f, 21f, 16.5f)
                verticalLineTo(14f)
                curveTo(21f, 13.448f, 20.552f, 13f, 20f, 13f)
                curveTo(19.448f, 13f, 19f, 13.448f, 19f, 14f)
                verticalLineTo(16.5f)
                curveTo(19f, 17.881f, 17.881f, 19f, 16.5f, 19f)
                horizontalLineTo(7.5f)
                curveTo(6.119f, 19f, 5f, 17.881f, 5f, 16.5f)
                verticalLineTo(7.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 3f)
                curveTo(13.448f, 3f, 13f, 3.448f, 13f, 4f)
                curveTo(13f, 4.552f, 13.448f, 5f, 14f, 5f)
                horizontalLineTo(17.586f)
                lineTo(11.293f, 11.293f)
                curveTo(10.902f, 11.683f, 10.902f, 12.317f, 11.293f, 12.707f)
                curveTo(11.684f, 13.098f, 12.317f, 13.098f, 12.707f, 12.707f)
                lineTo(19f, 6.414f)
                verticalLineTo(10f)
                curveTo(19f, 10.552f, 19.448f, 11f, 20f, 11f)
                curveTo(20.552f, 11f, 21f, 10.552f, 21f, 10f)
                verticalLineTo(4f)
                curveTo(21f, 3.448f, 20.552f, 3f, 20f, 3f)
                horizontalLineTo(14f)
                close()
            }
        }.build()
        return arrowRightUpFromBox!!
    }

private var arrowRightUpFromBox: ImageVector? = null