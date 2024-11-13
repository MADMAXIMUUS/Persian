package io.github.madmaximuus.persianSymbols.pin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Pin: ImageVector
    get() {
        if (pin != null) {
            return pin!!
        }
        pin = Builder(
            name = "pin-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 6f)
                curveTo(8f, 3.791f, 9.791f, 2f, 12f, 2f)
                curveTo(14.209f, 2f, 16f, 3.791f, 16f, 6f)
                verticalLineTo(12f)
                horizontalLineTo(17f)
                curveTo(17.552f, 12f, 18f, 12.448f, 18f, 13f)
                curveTo(18f, 13.552f, 17.552f, 14f, 17f, 14f)
                lineTo(13f, 14f)
                verticalLineTo(20.364f)
                lineTo(12.171f, 21.721f)
                curveTo(12.093f, 21.848f, 11.907f, 21.848f, 11.829f, 21.721f)
                lineTo(11f, 20.364f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                curveTo(6.448f, 14f, 6f, 13.552f, 6f, 13f)
                curveTo(6f, 12.448f, 6.448f, 12f, 7f, 12f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                close()
            }
        }.build()
        return pin!!
    }

private var pin: ImageVector? = null