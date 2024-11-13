package io.github.madmaximuus.persianSymbols.calendar

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Filled.Calendar: ImageVector
    get() {
        if (calendar != null) {
            return calendar!!
        }
        calendar = Builder(
            name = "calendar-filled",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 2f)
                curveTo(8.552f, 2f, 9f, 2.448f, 9f, 3f)
                verticalLineTo(4f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                curveTo(15f, 2.448f, 15.448f, 2f, 16f, 2f)
                curveTo(16.552f, 2f, 17f, 2.448f, 17f, 3f)
                verticalLineTo(4f)
                curveTo(17f, 4.006f, 17f, 4.012f, 17f, 4.018f)
                curveTo(18.854f, 4.185f, 20.376f, 5.502f, 20.848f, 7.25f)
                horizontalLineTo(3.152f)
                curveTo(3.624f, 5.502f, 5.146f, 4.185f, 7f, 4.018f)
                lineTo(7f, 4f)
                verticalLineTo(3f)
                curveTo(7f, 2.448f, 7.448f, 2f, 8f, 2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 8.75f)
                horizontalLineTo(3f)
                verticalLineTo(17.6f)
                curveTo(3f, 20.03f, 4.97f, 22f, 7.4f, 22f)
                horizontalLineTo(16.6f)
                curveTo(19.03f, 22f, 21f, 20.03f, 21f, 17.6f)
                verticalLineTo(8.75f)
                close()
            }
        }.build()
        return calendar!!
    }

private var calendar: ImageVector? = null