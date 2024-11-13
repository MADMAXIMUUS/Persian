package io.github.madmaximuus.persianSymbols.shufle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Shuffle: ImageVector
    get() {
        if (shuffle != null) {
            return shuffle!!
        }
        shuffle = Builder(
            name = "shuffle-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.293f, 20.293f)
                curveTo(1.902f, 20.683f, 1.902f, 21.317f, 2.293f, 21.707f)
                curveTo(2.683f, 22.098f, 3.317f, 22.098f, 3.707f, 21.707f)
                lineTo(20f, 5.414f)
                verticalLineTo(7f)
                curveTo(20f, 7.552f, 20.448f, 8f, 21f, 8f)
                curveTo(21.552f, 8f, 22f, 7.552f, 22f, 7f)
                verticalLineTo(3.5f)
                curveTo(22f, 3.406f, 21.991f, 3.314f, 21.975f, 3.224f)
                curveTo(22.049f, 2.9f, 21.96f, 2.546f, 21.707f, 2.293f)
                curveTo(21.454f, 2.04f, 21.1f, 1.951f, 20.776f, 2.025f)
                curveTo(20.686f, 2.009f, 20.594f, 2f, 20.5f, 2f)
                horizontalLineTo(17f)
                curveTo(16.448f, 2f, 16f, 2.448f, 16f, 3f)
                curveTo(16f, 3.552f, 16.448f, 4f, 17f, 4f)
                horizontalLineTo(18.586f)
                lineTo(2.293f, 20.293f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.293f, 2.293f)
                curveTo(2.683f, 1.902f, 3.317f, 1.902f, 3.707f, 2.293f)
                lineTo(11.293f, 9.879f)
                lineTo(9.879f, 11.293f)
                lineTo(2.293f, 3.707f)
                curveTo(1.902f, 3.317f, 1.902f, 2.683f, 2.293f, 2.293f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.707f, 14.121f)
                lineTo(14.121f, 12.707f)
                lineTo(20f, 18.586f)
                verticalLineTo(17f)
                curveTo(20f, 16.448f, 20.448f, 16f, 21f, 16f)
                curveTo(21.552f, 16f, 22f, 16.448f, 22f, 17f)
                verticalLineTo(20.5f)
                curveTo(22f, 20.594f, 21.991f, 20.686f, 21.975f, 20.776f)
                curveTo(22.049f, 21.1f, 21.96f, 21.454f, 21.707f, 21.707f)
                curveTo(21.454f, 21.96f, 21.1f, 22.049f, 20.776f, 21.975f)
                curveTo(20.686f, 21.991f, 20.594f, 22f, 20.5f, 22f)
                horizontalLineTo(17f)
                curveTo(16.448f, 22f, 16f, 21.552f, 16f, 21f)
                curveTo(16f, 20.448f, 16.448f, 20f, 17f, 20f)
                horizontalLineTo(18.586f)
                lineTo(12.707f, 14.121f)
                close()
            }
        }.build()
        return shuffle!!
    }

private var shuffle: ImageVector? = null