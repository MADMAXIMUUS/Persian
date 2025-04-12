package io.github.madmaximuus.persianSymbols.chevron.down

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ChevronDown: ImageVector
    get() {
        if (chevronDown != null) {
            return chevronDown!!
        }
        chevronDown = ImageVector.Builder(
            name = "chevron-down-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.942f, 10.593f)
                curveTo(17.333f, 10.203f, 17.336f, 9.566f, 16.95f, 9.171f)
                curveTo(16.563f, 8.777f, 15.934f, 8.773f, 15.543f, 9.164f)
                lineTo(12f, 12.707f)
                lineTo(8.457f, 9.164f)
                curveTo(8.066f, 8.774f, 7.437f, 8.777f, 7.05f, 9.172f)
                curveTo(6.664f, 9.566f, 6.667f, 10.203f, 7.058f, 10.593f)
                lineTo(9.173f, 12.709f)
                lineTo(11.289f, 14.824f)
                lineTo(11.293f, 14.828f)
                curveTo(11.679f, 15.223f, 12.309f, 15.226f, 12.7f, 14.836f)
                lineTo(16.942f, 10.593f)
                close()
            }
        }.build()
        return chevronDown!!
    }

private var chevronDown: ImageVector? = null