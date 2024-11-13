package io.github.madmaximuus.persianSymbols.caretLeft

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.CaretLeft: ImageVector
    get() {
        if (caretLeft != null) {
            return caretLeft!!
        }
        caretLeft = Builder(
            name = "caret-left-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14f, 15.594f)
                curveTo(14f, 15.969f, 13.525f, 16.143f, 13.274f, 15.859f)
                lineTo(10.101f, 12.265f)
                curveTo(9.966f, 12.113f, 9.966f, 11.887f, 10.101f, 11.735f)
                lineTo(13.274f, 8.141f)
                curveTo(13.525f, 7.857f, 14f, 8.031f, 14f, 8.406f)
                lineTo(14f, 15.594f)
                close()
            }
        }.build()
        return caretLeft!!
    }

private var caretLeft: ImageVector? = null