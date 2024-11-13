package io.github.madmaximuus.persianSymbols.m

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.M: ImageVector
    get() {
        if (m != null) {
            return m!!
        }
        m = ImageVector.Builder(
            name = "m-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.771f, 21.473f)
                curveTo(4.309f, 21.6f, 4.847f, 21.266f, 4.973f, 20.729f)
                lineTo(8.001f, 7.863f)
                lineTo(11.031f, 20.729f)
                curveTo(11.138f, 21.181f, 11.541f, 21.5f, 12.005f, 21.5f)
                curveTo(12.469f, 21.5f, 12.872f, 21.18f, 12.978f, 20.729f)
                lineTo(16f, 7.868f)
                lineTo(19.027f, 20.729f)
                curveTo(19.153f, 21.266f, 19.691f, 21.6f, 20.229f, 21.473f)
                curveTo(20.767f, 21.347f, 21.1f, 20.808f, 20.973f, 20.271f)
                lineTo(16.973f, 3.271f)
                curveTo(16.867f, 2.819f, 16.464f, 2.5f, 16f, 2.5f)
                curveTo(15.536f, 2.5f, 15.133f, 2.819f, 15.026f, 3.271f)
                lineTo(12.003f, 16.134f)
                lineTo(8.973f, 3.27f)
                curveTo(8.867f, 2.819f, 8.464f, 2.5f, 8f, 2.5f)
                curveTo(7.536f, 2.5f, 7.133f, 2.819f, 7.027f, 3.271f)
                lineTo(3.027f, 20.271f)
                curveTo(2.9f, 20.808f, 3.233f, 21.347f, 3.771f, 21.473f)
                close()
            }
        }.build()

        return m!!
    }

private var m: ImageVector? = null
