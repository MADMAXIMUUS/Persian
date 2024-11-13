package io.github.madmaximuus.persianSymbols.chevronRight.toLine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ChevronRightToLine: ImageVector
    get() {
        if (chevronRightToLine != null) {
            return chevronRightToLine!!
        }
        chevronRightToLine = Builder(
            name = "chevron-right-to-line-default",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 17f)
                curveTo(14f, 17.552f, 14.448f, 18f, 15f, 18f)
                curveTo(15.552f, 18f, 16f, 17.552f, 16f, 17f)
                lineTo(16f, 7f)
                curveTo(16f, 6.448f, 15.552f, 6f, 15f, 6f)
                curveTo(14.448f, 6f, 14f, 6.448f, 14f, 7f)
                verticalLineTo(17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.172f, 7.05f)
                curveTo(7.566f, 6.664f, 8.203f, 6.667f, 8.593f, 7.058f)
                lineTo(12.836f, 11.3f)
                curveTo(13.226f, 11.691f, 13.223f, 12.321f, 12.828f, 12.707f)
                lineTo(12.824f, 12.711f)
                lineTo(8.593f, 16.942f)
                curveTo(8.203f, 17.333f, 7.566f, 17.336f, 7.172f, 16.95f)
                curveTo(6.777f, 16.563f, 6.774f, 15.934f, 7.164f, 15.543f)
                lineTo(10.707f, 12f)
                lineTo(7.164f, 8.457f)
                curveTo(6.774f, 8.066f, 6.777f, 7.436f, 7.172f, 7.05f)
                close()
            }
        }.build()
        return chevronRightToLine!!
    }

private var chevronRightToLine: ImageVector? = null