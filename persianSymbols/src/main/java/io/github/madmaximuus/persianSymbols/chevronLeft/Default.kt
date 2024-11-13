package io.github.madmaximuus.persianSymbols.chevronLeft

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.madmaximuus.persianSymbols.foundation.PersianSymbols

val PersianSymbols.Default.ChevronLeft: ImageVector
    get() {
        if (chevronLeft != null) {
            return chevronLeft!!
        }
        chevronLeft = ImageVector.Builder(
            name = "chevron-left-default",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.235f, 17.225f)
                curveTo(13.626f, 17.615f, 14.262f, 17.619f, 14.657f, 17.232f)
                curveTo(15.052f, 16.846f, 15.055f, 16.216f, 14.664f, 15.826f)
                lineTo(11.121f, 12.283f)
                lineTo(14.664f, 8.739f)
                curveTo(15.055f, 8.349f, 15.052f, 7.719f, 14.657f, 7.333f)
                curveTo(14.262f, 6.946f, 13.626f, 6.95f, 13.235f, 7.34f)
                lineTo(9.004f, 11.571f)
                lineTo(9f, 11.575f)
                curveTo(8.605f, 11.962f, 8.602f, 12.592f, 8.993f, 12.982f)
                lineTo(13.235f, 17.225f)
                close()
            }
        }.build()
        return chevronLeft!!
    }

private var chevronLeft: ImageVector? = null