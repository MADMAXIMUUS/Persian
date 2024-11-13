package io.github.madmaximuus.persianSymbols.message

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Message: ImageVector
    get() {
        if (message != null) {
            return message!!
        }
        message = Builder(
            name = "message-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.6f, 3f)
                horizontalLineTo(6.4f)
                curveTo(3.97f, 3f, 2f, 4.97f, 2f, 7.4f)
                verticalLineTo(19.577f)
                curveTo(2f, 20.27f, 2.687f, 20.753f, 3.339f, 20.518f)
                lineTo(6.981f, 19.207f)
                curveTo(7.361f, 19.07f, 7.762f, 19f, 8.166f, 19f)
                horizontalLineTo(17.6f)
                curveTo(20.03f, 19f, 22f, 17.03f, 22f, 14.6f)
                verticalLineTo(7.4f)
                curveTo(22f, 4.97f, 20.03f, 3f, 17.6f, 3f)
                close()
            }
        }.build()
        return message!!
    }

private var message: ImageVector? = null