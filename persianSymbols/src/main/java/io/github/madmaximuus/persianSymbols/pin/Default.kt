package io.github.madmaximuus.persianSymbols.pin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.Pin: ImageVector
    get() {
        if (pin != null) {
            return pin!!
        }
        pin = Builder(
            name = "pin-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 6f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                curveTo(6.448f, 12f, 6f, 12.448f, 6f, 13f)
                curveTo(6f, 13.552f, 6.448f, 14f, 7f, 14f)
                horizontalLineTo(11f)
                verticalLineTo(20.364f)
                lineTo(11.829f, 21.721f)
                curveTo(11.907f, 21.848f, 12.093f, 21.848f, 12.171f, 21.721f)
                lineTo(13f, 20.364f)
                verticalLineTo(14f)
                lineTo(17f, 14f)
                curveTo(17.552f, 14f, 18f, 13.552f, 18f, 13f)
                curveTo(18f, 12.448f, 17.552f, 12f, 17f, 12f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                curveTo(16f, 3.791f, 14.209f, 2f, 12f, 2f)
                curveTo(9.791f, 2f, 8f, 3.791f, 8f, 6f)
                close()
                moveTo(12f, 4f)
                curveTo(10.895f, 4f, 10f, 4.895f, 10f, 6f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                curveTo(14f, 4.895f, 13.105f, 4f, 12f, 4f)
                close()
            }
        }.build()
        return pin!!
    }

private var pin: ImageVector? = null