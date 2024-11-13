package io.github.madmaximuus.persianSymbols.arrow.up.fromBracket

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ArrowUpFromBracket: ImageVector
    get() {
        if (arrowUpFromBracket != null) {
            return arrowUpFromBracket!!
        }
        arrowUpFromBracket = Builder(
            name = "arrow-up-from-bracket-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.293f, 9.707f)
                curveTo(15.683f, 10.098f, 16.317f, 10.098f, 16.707f, 9.707f)
                curveTo(17.098f, 9.317f, 17.098f, 8.683f, 16.707f, 8.293f)
                lineTo(12.707f, 4.293f)
                curveTo(12.317f, 3.902f, 11.683f, 3.902f, 11.293f, 4.293f)
                lineTo(7.293f, 8.293f)
                curveTo(6.902f, 8.683f, 6.902f, 9.317f, 7.293f, 9.707f)
                curveTo(7.683f, 10.098f, 8.317f, 10.098f, 8.707f, 9.707f)
                lineTo(11f, 7.414f)
                verticalLineTo(15f)
                curveTo(11f, 15.552f, 11.448f, 16f, 12f, 16f)
                curveTo(12.552f, 16f, 13f, 15.552f, 13f, 15f)
                verticalLineTo(7.414f)
                lineTo(15.293f, 9.707f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 15f)
                curveTo(4f, 14.448f, 3.552f, 14f, 3f, 14f)
                curveTo(2.448f, 14f, 2f, 14.448f, 2f, 15f)
                verticalLineTo(15.6f)
                curveTo(2f, 18.03f, 3.97f, 20f, 6.4f, 20f)
                horizontalLineTo(17.6f)
                curveTo(20.03f, 20f, 22f, 18.03f, 22f, 15.6f)
                verticalLineTo(15f)
                curveTo(22f, 14.448f, 21.552f, 14f, 21f, 14f)
                curveTo(20.448f, 14f, 20f, 14.448f, 20f, 15f)
                verticalLineTo(15.6f)
                curveTo(20f, 16.926f, 18.926f, 18f, 17.6f, 18f)
                horizontalLineTo(6.4f)
                curveTo(5.075f, 18f, 4f, 16.926f, 4f, 15.6f)
                verticalLineTo(15f)
                close()
            }
        }.build()
        return arrowUpFromBracket!!
    }

private var arrowUpFromBracket: ImageVector? = null