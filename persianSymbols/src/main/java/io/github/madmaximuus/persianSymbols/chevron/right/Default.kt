package io.github.madmaximuus.persianSymbols.chevron.right

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ChevronRight: ImageVector
    get() {
        if (chevronRight != null) {
            return chevronRight!!
        }
        chevronRight = ImageVector.Builder(
            name = "chevron-right-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.02f, 7.058f)
                curveTo(10.629f, 6.667f, 9.993f, 6.664f, 9.598f, 7.05f)
                curveTo(9.204f, 7.437f, 9.2f, 8.066f, 9.591f, 8.457f)
                lineTo(13.134f, 12f)
                lineTo(9.591f, 15.543f)
                curveTo(9.2f, 15.934f, 9.204f, 16.563f, 9.598f, 16.95f)
                curveTo(9.993f, 17.336f, 10.63f, 17.333f, 11.02f, 16.942f)
                lineTo(15.251f, 12.711f)
                lineTo(15.255f, 12.707f)
                curveTo(15.65f, 12.321f, 15.653f, 11.691f, 15.263f, 11.3f)
                lineTo(11.02f, 7.058f)
                close()
            }
        }.build()
        return chevronRight!!
    }

private var chevronRight: ImageVector? = null