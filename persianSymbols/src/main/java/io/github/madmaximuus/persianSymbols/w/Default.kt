package io.github.madmaximuus.persianSymbols.w

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.W: ImageVector
    get() {
        if (w != null) {
            return w!!
        }
        w = ImageVector.Builder(
            name = "w-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.771f, 2.527f)
                curveTo(4.309f, 2.4f, 4.847f, 2.733f, 4.973f, 3.271f)
                lineTo(8.001f, 16.136f)
                lineTo(11.031f, 3.271f)
                curveTo(11.138f, 2.819f, 11.541f, 2.5f, 12.005f, 2.5f)
                curveTo(12.469f, 2.5f, 12.872f, 2.819f, 12.978f, 3.271f)
                lineTo(16f, 16.132f)
                lineTo(19.027f, 3.271f)
                curveTo(19.153f, 2.733f, 19.691f, 2.4f, 20.229f, 2.527f)
                curveTo(20.767f, 2.653f, 21.1f, 3.191f, 20.973f, 3.729f)
                lineTo(16.973f, 20.729f)
                curveTo(16.867f, 21.181f, 16.464f, 21.5f, 16f, 21.5f)
                curveTo(15.536f, 21.5f, 15.133f, 21.181f, 15.026f, 20.729f)
                lineTo(12.003f, 7.866f)
                lineTo(8.973f, 20.729f)
                curveTo(8.867f, 21.181f, 8.464f, 21.5f, 8f, 21.5f)
                curveTo(7.536f, 21.5f, 7.133f, 21.181f, 7.027f, 20.729f)
                lineTo(3.027f, 3.729f)
                curveTo(2.9f, 3.191f, 3.233f, 2.653f, 3.771f, 2.527f)
                close()
            }
        }.build()

        return w!!
    }

private var w: ImageVector? = null
